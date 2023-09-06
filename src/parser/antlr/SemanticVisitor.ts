import { TodoLangGrammarVisitor } from './TodoLangGrammarVisitor';
import { Measure_statementContext, Cinit_declarationContext } from './TodoLangGrammarParser';
import { AbstractParseTreeVisitor } from 'antlr4ts/tree';
import { ErrorListener } from '../tools/errorListener';
import { ErrorBuilder } from '../tools/errorBuilder';

export class SemanticVisitor extends AbstractParseTreeVisitor<void> implements TodoLangGrammarVisitor<void> {
    constructor(private errorListener: ErrorListener){
        super();
    }
    
    defaultResult() {}

    visitCinit_declaration(ctx: Cinit_declarationContext){
        if(ctx.CREG_KEY != null) {
            let error = ErrorBuilder.error("This backend does not allow classical registers to be allocated", {
                line: ctx.start.line-3,
                start: ctx.start.charPositionInLine,
                end: ctx.start.charPositionInLine + ctx.text.length
            });
            this.errorListener.addError(error);
        }
    }

    visitMeasure_statement(ctx: Measure_statementContext) {
        if (ctx.MEASURE_KEY != null) {
            let error = ErrorBuilder.error("Tis backend does not support measurement operations", {
                line: ctx.start.line-3,
                start: ctx.start.charPositionInLine,
                end: ctx.start.charPositionInLine + ctx.text.length
            });
            this.errorListener.addError(error);
        }

    }

}