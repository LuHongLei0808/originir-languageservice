# Generated from TodoLangGrammar.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .TodoLangGrammarParser import TodoLangGrammarParser
else:
    from TodoLangGrammarParser import TodoLangGrammarParser

# This class defines a complete generic visitor for a parse tree produced by TodoLangGrammarParser.

class TodoLangGrammarVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by TodoLangGrammarParser#translationunit.
    def visitTranslationunit(self, ctx:TodoLangGrammarParser.TranslationunitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#declaration.
    def visitDeclaration(self, ctx:TodoLangGrammarParser.DeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#qinit_declaration.
    def visitQinit_declaration(self, ctx:TodoLangGrammarParser.Qinit_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#cinit_declaration.
    def visitCinit_declaration(self, ctx:TodoLangGrammarParser.Cinit_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#quantum_gate_declaration.
    def visitQuantum_gate_declaration(self, ctx:TodoLangGrammarParser.Quantum_gate_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#index.
    def visitIndex(self, ctx:TodoLangGrammarParser.IndexContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#c_KEY_declaration.
    def visitC_KEY_declaration(self, ctx:TodoLangGrammarParser.C_KEY_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#q_KEY_declaration.
    def visitQ_KEY_declaration(self, ctx:TodoLangGrammarParser.Q_KEY_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#single_gate_without_parameter_declaration.
    def visitSingle_gate_without_parameter_declaration(self, ctx:TodoLangGrammarParser.Single_gate_without_parameter_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#single_gate_with_one_parameter_declaration.
    def visitSingle_gate_with_one_parameter_declaration(self, ctx:TodoLangGrammarParser.Single_gate_with_one_parameter_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#single_gate_with_two_parameter_declaration.
    def visitSingle_gate_with_two_parameter_declaration(self, ctx:TodoLangGrammarParser.Single_gate_with_two_parameter_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#single_gate_with_three_parameter_declaration.
    def visitSingle_gate_with_three_parameter_declaration(self, ctx:TodoLangGrammarParser.Single_gate_with_three_parameter_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#single_gate_with_four_parameter_declaration.
    def visitSingle_gate_with_four_parameter_declaration(self, ctx:TodoLangGrammarParser.Single_gate_with_four_parameter_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#double_gate_without_parameter_declaration.
    def visitDouble_gate_without_parameter_declaration(self, ctx:TodoLangGrammarParser.Double_gate_without_parameter_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#double_gate_with_one_parameter_declaration.
    def visitDouble_gate_with_one_parameter_declaration(self, ctx:TodoLangGrammarParser.Double_gate_with_one_parameter_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#double_gate_with_four_parameter_declaration.
    def visitDouble_gate_with_four_parameter_declaration(self, ctx:TodoLangGrammarParser.Double_gate_with_four_parameter_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#triple_gate_without_parameter_declaration.
    def visitTriple_gate_without_parameter_declaration(self, ctx:TodoLangGrammarParser.Triple_gate_without_parameter_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#define_gate_declaration.
    def visitDefine_gate_declaration(self, ctx:TodoLangGrammarParser.Define_gate_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#single_gate_without_parameter_type.
    def visitSingle_gate_without_parameter_type(self, ctx:TodoLangGrammarParser.Single_gate_without_parameter_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#single_gate_with_one_parameter_type.
    def visitSingle_gate_with_one_parameter_type(self, ctx:TodoLangGrammarParser.Single_gate_with_one_parameter_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#single_gate_with_two_parameter_type.
    def visitSingle_gate_with_two_parameter_type(self, ctx:TodoLangGrammarParser.Single_gate_with_two_parameter_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#single_gate_with_three_parameter_type.
    def visitSingle_gate_with_three_parameter_type(self, ctx:TodoLangGrammarParser.Single_gate_with_three_parameter_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#single_gate_with_four_parameter_type.
    def visitSingle_gate_with_four_parameter_type(self, ctx:TodoLangGrammarParser.Single_gate_with_four_parameter_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#double_gate_without_parameter_type.
    def visitDouble_gate_without_parameter_type(self, ctx:TodoLangGrammarParser.Double_gate_without_parameter_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#double_gate_with_one_parameter_type.
    def visitDouble_gate_with_one_parameter_type(self, ctx:TodoLangGrammarParser.Double_gate_with_one_parameter_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#double_gate_with_four_parameter_type.
    def visitDouble_gate_with_four_parameter_type(self, ctx:TodoLangGrammarParser.Double_gate_with_four_parameter_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#triple_gate_without_parameter_type.
    def visitTriple_gate_without_parameter_type(self, ctx:TodoLangGrammarParser.Triple_gate_without_parameter_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#pri_ckey.
    def visitPri_ckey(self, ctx:TodoLangGrammarParser.Pri_ckeyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#pri_cst.
    def visitPri_cst(self, ctx:TodoLangGrammarParser.Pri_cstContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#pri_expr.
    def visitPri_expr(self, ctx:TodoLangGrammarParser.Pri_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#unary_expression.
    def visitUnary_expression(self, ctx:TodoLangGrammarParser.Unary_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#multiplicative_expression.
    def visitMultiplicative_expression(self, ctx:TodoLangGrammarParser.Multiplicative_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#addtive_expression.
    def visitAddtive_expression(self, ctx:TodoLangGrammarParser.Addtive_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#relational_expression.
    def visitRelational_expression(self, ctx:TodoLangGrammarParser.Relational_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#equality_expression.
    def visitEquality_expression(self, ctx:TodoLangGrammarParser.Equality_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#logical_and_expression.
    def visitLogical_and_expression(self, ctx:TodoLangGrammarParser.Logical_and_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#logical_or_expression.
    def visitLogical_or_expression(self, ctx:TodoLangGrammarParser.Logical_or_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#assignment_expression.
    def visitAssignment_expression(self, ctx:TodoLangGrammarParser.Assignment_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#expression.
    def visitExpression(self, ctx:TodoLangGrammarParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#controlbit_list.
    def visitControlbit_list(self, ctx:TodoLangGrammarParser.Controlbit_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#statement.
    def visitStatement(self, ctx:TodoLangGrammarParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#dagger_statement.
    def visitDagger_statement(self, ctx:TodoLangGrammarParser.Dagger_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#control_statement.
    def visitControl_statement(self, ctx:TodoLangGrammarParser.Control_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#qelse_statement_fragment.
    def visitQelse_statement_fragment(self, ctx:TodoLangGrammarParser.Qelse_statement_fragmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#qif_if.
    def visitQif_if(self, ctx:TodoLangGrammarParser.Qif_ifContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#qif_ifelse.
    def visitQif_ifelse(self, ctx:TodoLangGrammarParser.Qif_ifelseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#qwhile_statement.
    def visitQwhile_statement(self, ctx:TodoLangGrammarParser.Qwhile_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#measure_statement.
    def visitMeasure_statement(self, ctx:TodoLangGrammarParser.Measure_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#reset_statement.
    def visitReset_statement(self, ctx:TodoLangGrammarParser.Reset_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#barrier_statement.
    def visitBarrier_statement(self, ctx:TodoLangGrammarParser.Barrier_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#expression_statement.
    def visitExpression_statement(self, ctx:TodoLangGrammarParser.Expression_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#define_gate_statement.
    def visitDefine_gate_statement(self, ctx:TodoLangGrammarParser.Define_gate_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#define_dagger_statement.
    def visitDefine_dagger_statement(self, ctx:TodoLangGrammarParser.Define_dagger_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#define_control_statement.
    def visitDefine_control_statement(self, ctx:TodoLangGrammarParser.Define_control_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#user_defined_gate.
    def visitUser_defined_gate(self, ctx:TodoLangGrammarParser.User_defined_gateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#explist.
    def visitExplist(self, ctx:TodoLangGrammarParser.ExplistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#exp.
    def visitExp(self, ctx:TodoLangGrammarParser.ExpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#gate_func_statement.
    def visitGate_func_statement(self, ctx:TodoLangGrammarParser.Gate_func_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#id.
    def visitId(self, ctx:TodoLangGrammarParser.IdContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#id_list.
    def visitId_list(self, ctx:TodoLangGrammarParser.Id_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#gate_name.
    def visitGate_name(self, ctx:TodoLangGrammarParser.Gate_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#constant_expression.
    def visitConstant_expression(self, ctx:TodoLangGrammarParser.Constant_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#arithmetic_op.
    def visitArithmetic_op(self, ctx:TodoLangGrammarParser.Arithmetic_opContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#unary_op.
    def visitUnary_op(self, ctx:TodoLangGrammarParser.Unary_opContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TodoLangGrammarParser#constant.
    def visitConstant(self, ctx:TodoLangGrammarParser.ConstantContext):
        return self.visitChildren(ctx)



del TodoLangGrammarParser