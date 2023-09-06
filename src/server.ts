import { TextDocuments, Diagnostic, CompletionList, Position, Hover } from 'vscode-languageserver/node';
import { TextDocument } from "vscode-languageserver-textdocument";
import { LanguageSettings } from './languageTypes';
import { OriginirService } from './services/configuration';
import { OriginirSuggester } from './services/suggester';
import { OriginIRParser, OriginIRParserWithVisitor } from './parser/parser';
export interface LanguageService {
    documents: TextDocuments<TextDocument>;
    originirService: OriginirService;
    backend: string;
    configure(settings: LanguageSettings): void;
    doValidation(document: TextDocument): Promise<Diagnostic[]>;
    doComplete(document: TextDocument): CompletionList | null;
    doHover(document: TextDocument, position: Position): Hover | null;
}
export function getLanguageService(): LanguageService{

    let docouments: TextDocuments<TextDocument> = new TextDocuments(TextDocument);

    let originirService: OriginirService = new OriginirService(new OriginIRParser(), new OriginirSuggester());

    return {
        documents: docouments,
        originirService: originirService,
        backend: "default",
        configure(settings: LanguageSettings) {
            if (settings.backend != this.backend) {
                switch (settings.backend) {
                    case "single":
                        this.backend = "single";
                        this.originirService = new OriginirService(new OriginIRParserWithVisitor(), new OriginirSuggester());
                        return
                    case "default":
                        this.backend = "default";
                        this.originirService = new OriginirService(new OriginIRParser(), new OriginirSuggester());
                        return
                    default:
                        return
                }
            }
        },

        doValidation(document: TextDocument): Promise<Diagnostic[]> {
            if (document.languageId === 'originir') {
                return this.originirService.validateDocument(document);
            } else {
                return new Promise<Diagnostic[]>(resolve => resolve([]));
            }
        },

        doComplete(document: TextDocument): CompletionList | null {
            return null;
        },

        doHover(document: TextDocument, position: Position): Hover | null {
            return this.originirService.doHover(document, position);
        }

    }


}