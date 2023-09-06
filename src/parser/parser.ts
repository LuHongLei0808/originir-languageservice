'use strict'

import { TodoLangGrammarLexer } from './antlr/TodoLangGrammarLexer';
import { TodoLangGrammarParser } from './antlr/TodoLangGrammarParser';
import { Parser, ParserResult } from './tools/type';
import { ErrorListener } from './tools/errorListener'
import { SemanticVisitor } from './antlr/SemanticVisitor';
import { LexErrorListener } from './tools/lexErrorListener';
import { 
    ANTLRInputStream,
    CommonTokenStream,    
} from 'antlr4ts'

export class OriginIRParser implements Parser {
    
    gateList = {};

    parse(input: string):ParserResult  {
        let inputStream = new ANTLRInputStream(input);
        let lexer = new TodoLangGrammarLexer(inputStream);
        let lexErrorListener = new LexErrorListener();
        lexer.removeErrorListeners();
        lexer.addErrorListener(lexErrorListener);
        let tokenStream = new CommonTokenStream(lexer);
        let parser = new TodoLangGrammarParser(tokenStream);
        parser.removeErrorListeners();
        let errorListener = new ErrorListener();
        parser.addErrorListener(errorListener);
        let tree = parser.translationunit();
        this.gateList = parser.gateList;
        return {
            ast: tree,
            errors: [...errorListener.errors,...lexErrorListener.errors]
        };
    }

}

export class OriginIRParserWithVisitor implements Parser {

    gateList = {};

    parse(input: string): ParserResult {
        try {
            let inputStream = new ANTLRInputStream(input);
            debugger
            let lexer = new TodoLangGrammarLexer(inputStream);
            lexer.removeErrorListeners();
            let lexErrorListener = new LexErrorListener();
            debugger
            lexer.addErrorListener(lexErrorListener);
            let tokenStream = new CommonTokenStream(lexer);
            debugger
            let parser = new TodoLangGrammarParser(tokenStream);
            parser.removeErrorListeners();
            let errorListener = new ErrorListener();
            parser.addErrorListener(errorListener);
            let tree = parser.translationunit();
    
            let validator = new SemanticVisitor(errorListener);
            validator.visit(tree);
            this.gateList = parser.gateList;
            return {
                ast: tree,
                errors: [...errorListener.errors,...lexErrorListener.errors]
            }
        } catch (err){
            throw err;
        }
    }

}