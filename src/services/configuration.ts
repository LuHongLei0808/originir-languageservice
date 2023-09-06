import { TextDocument, Diagnostic, DiagnosticSeverity, Position, Range, Hover, CompletionItem, MarkedString } from 'vscode-languageserver-types';
import { Suggester, CodeAndPosition, SuggestionSymbol } from './type';
import { Parser, ParseErrorLevel, ParserError } from '../parser/tools/type';
import { TextDocumentPositionParams } from 'vscode-languageserver-protocol';
import { CompletionList, CompletionItemKind } from 'vscode-languageserver/node';

export class OriginirService {

    currentDocument?: TextDocument = undefined;

    currentSuggestions: CompletionItem[] = [];

    constructor(private parser: Parser, private suggester: Suggester) {}

    public validateDocument(document: TextDocument): Promise<Diagnostic[]> {
        this.currentDocument = document;
        let result = this.parser.parse(document.getText());
        // let data = this.launchCompilationErrors(result.errors);
        return new Promise<Diagnostic[]>((resolve,reject) => {
            try {
                let data = this.launchCompilationErrors(result.errors);
                resolve(data);
            } catch(err){
                reject(err);
            }
        });
    }

    private launchCompilationErrors(errors: ParserError[]): Diagnostic[] {
        let diagnostics: Diagnostic[] = [];
        errors.forEach(error => {
            diagnostics.push(this.errorToDiagnostics(error));
        });
        return diagnostics;
    }

    private errorToDiagnostics(error: ParserError) {
        return {
            severity: error.level === ParseErrorLevel.ERROR ? DiagnosticSeverity.Error : DiagnosticSeverity.Warning,
            range: {
                start: {
                    line: error.line,
                    character: error.start
                },
                end: {
                    line: error.line,
                    character: error.end
                }
            },
            message: error.message,
            source: 'ex'
        };
    }

    doHover(document: TextDocument, position: Position): Hover | null {
        if (this.currentDocument === null) {
            return null;
        }
        let offset = document.offsetAt(position);
        let codeAndPosition = this.findNode(offset, document);

        this.currentSuggestions = this.suggester.availableSymbols();

        for (let s of this.currentSuggestions) {
            if (s.label == codeAndPosition.code) {
                let str: string = ""
                if (typeof s.documentation == 'string') {
                    str = s.documentation
                } else {
                    str += s.documentation!.toString
                }
                return {
                    range: Range.create(document.positionAt(codeAndPosition.start + 1), document.positionAt(codeAndPosition.end)),
                    contents: [{ language: 'originir', value: codeAndPosition.code }, MarkedString.fromPlainText(str)]
                }
            } else if (this.parser.gateList.hasOwnProperty(codeAndPosition.code)){
                let gate = this.parser.gateList[codeAndPosition.code];
                let params: object = gate["params"];
                let str: string = "";
                if (gate["arguments"] != null){
                    let args = gate["arguments"];
                    str = Object.keys(args).length+" angle parameter, " + Object.keys(params).length + " qubits custom gate";
                } else {
                    str = Object.keys(params).length + " qubits custom gate";
                }
                return {
                    range: Range.create(document.positionAt(codeAndPosition.start + 1), document.positionAt(codeAndPosition.end)),
                    contents: [{ language: 'originir', value: codeAndPosition.code }, MarkedString.fromPlainText(str)]
                }
            }
        }
        return null;
    }

    private findNode(offset: number, document: TextDocument): CodeAndPosition {
        let codeMinArr: string[] = [];
        let startCode: number = 0;
        let endCode: number = 0;
        for (let i = 1; i <= offset; i++) {
            let rangeMin = Range.create(document.positionAt(offset - i), document.positionAt(offset -i + 1));
            let strMin = document.getText(rangeMin);
            if (handlerEndOf(strMin)) {
                startCode = offset - i;
                break;
            }
            codeMinArr.push(strMin);
        }

        let codeMax: string = "";
        for (let j = 0; j <= 100; j++) {
            let rangeMax = Range.create(document.positionAt(offset + j), document.positionAt(offset + j +1));
            let strMax  = document.getText(rangeMax);
            if(strMax.match(" ")){
                console.log(1)
            }
            if (handlerEndOf(strMax)) {
                endCode = offset + j;
                break;
            }
            codeMax += strMax;
        }

        let codeMin: string = "";
        if (codeMinArr != null) {
            for (let k = codeMinArr.length - 1; k >= 0; k--) {
                codeMin += codeMinArr[k];
            }
        }
        return {
            code: codeMin + codeMax,
            start: startCode,
            end: endCode
        }

    }

}

export enum specificSymbol {
    '\n',
    '\r',
    ' ',
    '\t',
}

export function handlerEndOf(code: string){
    if(code == "\n" || code == " " || code == "\r" || code == "\t"){
        return true;
    } else {
        return false;
    }
}