'use strict'

import {
    ANTLRErrorListener,
    CommonToken,
    Token,
    Recognizer,
    RecognitionException,
    ConsoleErrorListener
} from 'antlr4ts';
import { Override } from 'antlr4ts/Decorators';
import { ParseErrorLevel, ParserError } from './type'
ConsoleErrorListener
export class LexErrorListener implements ANTLRErrorListener<any>{

    errors: ParserError[] = []

    addError(error: ParserError) {
        this.errors.push(error);
    }

    @Override
    syntaxError<T extends any>(
        _recognizer: Recognizer<T, any>,
        offendingSymbol: T | undefined,
        line: number,
        charPositionInLine: number,
        msg: string,
        _e: RecognitionException | undefined
    ): void {
        this.errors.push({
            line: line - 3,
            start: charPositionInLine,
            end: charPositionInLine+1,
            message: msg,
            level: ParseErrorLevel.ERROR
        })
    }

}