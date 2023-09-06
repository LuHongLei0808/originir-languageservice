'use strict'

import {
    ANTLRErrorListener,
    CommonToken,
    Token,
    Recognizer,
    RecognitionException
} from 'antlr4ts';
import { Override } from 'antlr4ts/Decorators';
import { ParseErrorLevel, ParserError } from './type'


export class ErrorListener implements ANTLRErrorListener<CommonToken> {

    errors: ParserError[] = [];

    addError(error: ParserError) {
        this.errors.push(error);
    }

    @Override
    syntaxError<T extends Token>(
        _recognizer: Recognizer<T, any>,
        offendingSymbol: T | undefined,
        line: number,
        charPositionInLine: number,
        msg: string,
        _e: RecognitionException | undefined
    ): void {
        if(_e != undefined){
            if (offendingSymbol){
                if(offendingSymbol.text){
                    this.errors.push({
                        line: line - 3,
                        start: charPositionInLine,
                        end: charPositionInLine + offendingSymbol.text.length,
                        message: msg,
                        level: ParseErrorLevel.ERROR
                    })
                } else {
                    this.errors.push({
                        line: line - 3,
                        start: charPositionInLine,
                        end: charPositionInLine + 1,
                        message: msg,
                        level: ParseErrorLevel.ERROR
                    })
                }
            } else {
                this.errors.push({
                    line: line - 3,
                    start: charPositionInLine,
                    end: charPositionInLine + 1,
                    message: msg,
                    level: ParseErrorLevel.ERROR
                })
            }
        }else {
            try {
                let erroMsg = JSON.parse(msg);
                this.errors.push({
                    line: line - 3,
                    start: erroMsg.start,
                    end: erroMsg.end,
                    message: erroMsg.message,
                    level: ParseErrorLevel.ERROR
                })
            }catch (e){
                this.errors.push({
                    line: line - 3,
                    start: charPositionInLine,
                    end: charPositionInLine + 1,
                    message: msg,
                    level: ParseErrorLevel.ERROR
                })
            }
        }
    
        
    }

}