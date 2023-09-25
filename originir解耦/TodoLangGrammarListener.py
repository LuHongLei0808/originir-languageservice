# Generated from TodoLangGrammar.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .TodoLangGrammarParser import TodoLangGrammarParser
else:
    from TodoLangGrammarParser import TodoLangGrammarParser

# This class defines a complete listener for a parse tree produced by TodoLangGrammarParser.
class TodoLangGrammarListener(ParseTreeListener):

    # Enter a parse tree produced by TodoLangGrammarParser#translationunit.
    def enterTranslationunit(self, ctx:TodoLangGrammarParser.TranslationunitContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#translationunit.
    def exitTranslationunit(self, ctx:TodoLangGrammarParser.TranslationunitContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#declaration.
    def enterDeclaration(self, ctx:TodoLangGrammarParser.DeclarationContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#declaration.
    def exitDeclaration(self, ctx:TodoLangGrammarParser.DeclarationContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#qinit_declaration.
    def enterQinit_declaration(self, ctx:TodoLangGrammarParser.Qinit_declarationContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#qinit_declaration.
    def exitQinit_declaration(self, ctx:TodoLangGrammarParser.Qinit_declarationContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#cinit_declaration.
    def enterCinit_declaration(self, ctx:TodoLangGrammarParser.Cinit_declarationContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#cinit_declaration.
    def exitCinit_declaration(self, ctx:TodoLangGrammarParser.Cinit_declarationContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#quantum_gate_declaration.
    def enterQuantum_gate_declaration(self, ctx:TodoLangGrammarParser.Quantum_gate_declarationContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#quantum_gate_declaration.
    def exitQuantum_gate_declaration(self, ctx:TodoLangGrammarParser.Quantum_gate_declarationContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#index.
    def enterIndex(self, ctx:TodoLangGrammarParser.IndexContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#index.
    def exitIndex(self, ctx:TodoLangGrammarParser.IndexContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#c_KEY_declaration.
    def enterC_KEY_declaration(self, ctx:TodoLangGrammarParser.C_KEY_declarationContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#c_KEY_declaration.
    def exitC_KEY_declaration(self, ctx:TodoLangGrammarParser.C_KEY_declarationContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#q_KEY_declaration.
    def enterQ_KEY_declaration(self, ctx:TodoLangGrammarParser.Q_KEY_declarationContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#q_KEY_declaration.
    def exitQ_KEY_declaration(self, ctx:TodoLangGrammarParser.Q_KEY_declarationContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#single_gate_without_parameter_declaration.
    def enterSingle_gate_without_parameter_declaration(self, ctx:TodoLangGrammarParser.Single_gate_without_parameter_declarationContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#single_gate_without_parameter_declaration.
    def exitSingle_gate_without_parameter_declaration(self, ctx:TodoLangGrammarParser.Single_gate_without_parameter_declarationContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#single_gate_with_one_parameter_declaration.
    def enterSingle_gate_with_one_parameter_declaration(self, ctx:TodoLangGrammarParser.Single_gate_with_one_parameter_declarationContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#single_gate_with_one_parameter_declaration.
    def exitSingle_gate_with_one_parameter_declaration(self, ctx:TodoLangGrammarParser.Single_gate_with_one_parameter_declarationContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#single_gate_with_two_parameter_declaration.
    def enterSingle_gate_with_two_parameter_declaration(self, ctx:TodoLangGrammarParser.Single_gate_with_two_parameter_declarationContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#single_gate_with_two_parameter_declaration.
    def exitSingle_gate_with_two_parameter_declaration(self, ctx:TodoLangGrammarParser.Single_gate_with_two_parameter_declarationContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#single_gate_with_three_parameter_declaration.
    def enterSingle_gate_with_three_parameter_declaration(self, ctx:TodoLangGrammarParser.Single_gate_with_three_parameter_declarationContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#single_gate_with_three_parameter_declaration.
    def exitSingle_gate_with_three_parameter_declaration(self, ctx:TodoLangGrammarParser.Single_gate_with_three_parameter_declarationContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#single_gate_with_four_parameter_declaration.
    def enterSingle_gate_with_four_parameter_declaration(self, ctx:TodoLangGrammarParser.Single_gate_with_four_parameter_declarationContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#single_gate_with_four_parameter_declaration.
    def exitSingle_gate_with_four_parameter_declaration(self, ctx:TodoLangGrammarParser.Single_gate_with_four_parameter_declarationContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#double_gate_without_parameter_declaration.
    def enterDouble_gate_without_parameter_declaration(self, ctx:TodoLangGrammarParser.Double_gate_without_parameter_declarationContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#double_gate_without_parameter_declaration.
    def exitDouble_gate_without_parameter_declaration(self, ctx:TodoLangGrammarParser.Double_gate_without_parameter_declarationContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#double_gate_with_one_parameter_declaration.
    def enterDouble_gate_with_one_parameter_declaration(self, ctx:TodoLangGrammarParser.Double_gate_with_one_parameter_declarationContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#double_gate_with_one_parameter_declaration.
    def exitDouble_gate_with_one_parameter_declaration(self, ctx:TodoLangGrammarParser.Double_gate_with_one_parameter_declarationContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#double_gate_with_four_parameter_declaration.
    def enterDouble_gate_with_four_parameter_declaration(self, ctx:TodoLangGrammarParser.Double_gate_with_four_parameter_declarationContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#double_gate_with_four_parameter_declaration.
    def exitDouble_gate_with_four_parameter_declaration(self, ctx:TodoLangGrammarParser.Double_gate_with_four_parameter_declarationContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#triple_gate_without_parameter_declaration.
    def enterTriple_gate_without_parameter_declaration(self, ctx:TodoLangGrammarParser.Triple_gate_without_parameter_declarationContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#triple_gate_without_parameter_declaration.
    def exitTriple_gate_without_parameter_declaration(self, ctx:TodoLangGrammarParser.Triple_gate_without_parameter_declarationContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#define_gate_declaration.
    def enterDefine_gate_declaration(self, ctx:TodoLangGrammarParser.Define_gate_declarationContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#define_gate_declaration.
    def exitDefine_gate_declaration(self, ctx:TodoLangGrammarParser.Define_gate_declarationContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#single_gate_without_parameter_type.
    def enterSingle_gate_without_parameter_type(self, ctx:TodoLangGrammarParser.Single_gate_without_parameter_typeContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#single_gate_without_parameter_type.
    def exitSingle_gate_without_parameter_type(self, ctx:TodoLangGrammarParser.Single_gate_without_parameter_typeContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#single_gate_with_one_parameter_type.
    def enterSingle_gate_with_one_parameter_type(self, ctx:TodoLangGrammarParser.Single_gate_with_one_parameter_typeContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#single_gate_with_one_parameter_type.
    def exitSingle_gate_with_one_parameter_type(self, ctx:TodoLangGrammarParser.Single_gate_with_one_parameter_typeContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#single_gate_with_two_parameter_type.
    def enterSingle_gate_with_two_parameter_type(self, ctx:TodoLangGrammarParser.Single_gate_with_two_parameter_typeContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#single_gate_with_two_parameter_type.
    def exitSingle_gate_with_two_parameter_type(self, ctx:TodoLangGrammarParser.Single_gate_with_two_parameter_typeContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#single_gate_with_three_parameter_type.
    def enterSingle_gate_with_three_parameter_type(self, ctx:TodoLangGrammarParser.Single_gate_with_three_parameter_typeContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#single_gate_with_three_parameter_type.
    def exitSingle_gate_with_three_parameter_type(self, ctx:TodoLangGrammarParser.Single_gate_with_three_parameter_typeContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#single_gate_with_four_parameter_type.
    def enterSingle_gate_with_four_parameter_type(self, ctx:TodoLangGrammarParser.Single_gate_with_four_parameter_typeContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#single_gate_with_four_parameter_type.
    def exitSingle_gate_with_four_parameter_type(self, ctx:TodoLangGrammarParser.Single_gate_with_four_parameter_typeContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#double_gate_without_parameter_type.
    def enterDouble_gate_without_parameter_type(self, ctx:TodoLangGrammarParser.Double_gate_without_parameter_typeContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#double_gate_without_parameter_type.
    def exitDouble_gate_without_parameter_type(self, ctx:TodoLangGrammarParser.Double_gate_without_parameter_typeContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#double_gate_with_one_parameter_type.
    def enterDouble_gate_with_one_parameter_type(self, ctx:TodoLangGrammarParser.Double_gate_with_one_parameter_typeContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#double_gate_with_one_parameter_type.
    def exitDouble_gate_with_one_parameter_type(self, ctx:TodoLangGrammarParser.Double_gate_with_one_parameter_typeContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#double_gate_with_four_parameter_type.
    def enterDouble_gate_with_four_parameter_type(self, ctx:TodoLangGrammarParser.Double_gate_with_four_parameter_typeContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#double_gate_with_four_parameter_type.
    def exitDouble_gate_with_four_parameter_type(self, ctx:TodoLangGrammarParser.Double_gate_with_four_parameter_typeContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#triple_gate_without_parameter_type.
    def enterTriple_gate_without_parameter_type(self, ctx:TodoLangGrammarParser.Triple_gate_without_parameter_typeContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#triple_gate_without_parameter_type.
    def exitTriple_gate_without_parameter_type(self, ctx:TodoLangGrammarParser.Triple_gate_without_parameter_typeContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#pri_ckey.
    def enterPri_ckey(self, ctx:TodoLangGrammarParser.Pri_ckeyContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#pri_ckey.
    def exitPri_ckey(self, ctx:TodoLangGrammarParser.Pri_ckeyContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#pri_cst.
    def enterPri_cst(self, ctx:TodoLangGrammarParser.Pri_cstContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#pri_cst.
    def exitPri_cst(self, ctx:TodoLangGrammarParser.Pri_cstContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#pri_expr.
    def enterPri_expr(self, ctx:TodoLangGrammarParser.Pri_exprContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#pri_expr.
    def exitPri_expr(self, ctx:TodoLangGrammarParser.Pri_exprContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#unary_expression.
    def enterUnary_expression(self, ctx:TodoLangGrammarParser.Unary_expressionContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#unary_expression.
    def exitUnary_expression(self, ctx:TodoLangGrammarParser.Unary_expressionContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#multiplicative_expression.
    def enterMultiplicative_expression(self, ctx:TodoLangGrammarParser.Multiplicative_expressionContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#multiplicative_expression.
    def exitMultiplicative_expression(self, ctx:TodoLangGrammarParser.Multiplicative_expressionContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#addtive_expression.
    def enterAddtive_expression(self, ctx:TodoLangGrammarParser.Addtive_expressionContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#addtive_expression.
    def exitAddtive_expression(self, ctx:TodoLangGrammarParser.Addtive_expressionContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#relational_expression.
    def enterRelational_expression(self, ctx:TodoLangGrammarParser.Relational_expressionContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#relational_expression.
    def exitRelational_expression(self, ctx:TodoLangGrammarParser.Relational_expressionContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#equality_expression.
    def enterEquality_expression(self, ctx:TodoLangGrammarParser.Equality_expressionContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#equality_expression.
    def exitEquality_expression(self, ctx:TodoLangGrammarParser.Equality_expressionContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#logical_and_expression.
    def enterLogical_and_expression(self, ctx:TodoLangGrammarParser.Logical_and_expressionContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#logical_and_expression.
    def exitLogical_and_expression(self, ctx:TodoLangGrammarParser.Logical_and_expressionContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#logical_or_expression.
    def enterLogical_or_expression(self, ctx:TodoLangGrammarParser.Logical_or_expressionContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#logical_or_expression.
    def exitLogical_or_expression(self, ctx:TodoLangGrammarParser.Logical_or_expressionContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#assignment_expression.
    def enterAssignment_expression(self, ctx:TodoLangGrammarParser.Assignment_expressionContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#assignment_expression.
    def exitAssignment_expression(self, ctx:TodoLangGrammarParser.Assignment_expressionContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#expression.
    def enterExpression(self, ctx:TodoLangGrammarParser.ExpressionContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#expression.
    def exitExpression(self, ctx:TodoLangGrammarParser.ExpressionContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#controlbit_list.
    def enterControlbit_list(self, ctx:TodoLangGrammarParser.Controlbit_listContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#controlbit_list.
    def exitControlbit_list(self, ctx:TodoLangGrammarParser.Controlbit_listContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#statement.
    def enterStatement(self, ctx:TodoLangGrammarParser.StatementContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#statement.
    def exitStatement(self, ctx:TodoLangGrammarParser.StatementContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#dagger_statement.
    def enterDagger_statement(self, ctx:TodoLangGrammarParser.Dagger_statementContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#dagger_statement.
    def exitDagger_statement(self, ctx:TodoLangGrammarParser.Dagger_statementContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#control_statement.
    def enterControl_statement(self, ctx:TodoLangGrammarParser.Control_statementContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#control_statement.
    def exitControl_statement(self, ctx:TodoLangGrammarParser.Control_statementContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#qelse_statement_fragment.
    def enterQelse_statement_fragment(self, ctx:TodoLangGrammarParser.Qelse_statement_fragmentContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#qelse_statement_fragment.
    def exitQelse_statement_fragment(self, ctx:TodoLangGrammarParser.Qelse_statement_fragmentContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#qif_if.
    def enterQif_if(self, ctx:TodoLangGrammarParser.Qif_ifContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#qif_if.
    def exitQif_if(self, ctx:TodoLangGrammarParser.Qif_ifContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#qif_ifelse.
    def enterQif_ifelse(self, ctx:TodoLangGrammarParser.Qif_ifelseContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#qif_ifelse.
    def exitQif_ifelse(self, ctx:TodoLangGrammarParser.Qif_ifelseContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#qwhile_statement.
    def enterQwhile_statement(self, ctx:TodoLangGrammarParser.Qwhile_statementContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#qwhile_statement.
    def exitQwhile_statement(self, ctx:TodoLangGrammarParser.Qwhile_statementContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#measure_statement.
    def enterMeasure_statement(self, ctx:TodoLangGrammarParser.Measure_statementContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#measure_statement.
    def exitMeasure_statement(self, ctx:TodoLangGrammarParser.Measure_statementContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#reset_statement.
    def enterReset_statement(self, ctx:TodoLangGrammarParser.Reset_statementContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#reset_statement.
    def exitReset_statement(self, ctx:TodoLangGrammarParser.Reset_statementContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#barrier_statement.
    def enterBarrier_statement(self, ctx:TodoLangGrammarParser.Barrier_statementContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#barrier_statement.
    def exitBarrier_statement(self, ctx:TodoLangGrammarParser.Barrier_statementContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#expression_statement.
    def enterExpression_statement(self, ctx:TodoLangGrammarParser.Expression_statementContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#expression_statement.
    def exitExpression_statement(self, ctx:TodoLangGrammarParser.Expression_statementContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#define_gate_statement.
    def enterDefine_gate_statement(self, ctx:TodoLangGrammarParser.Define_gate_statementContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#define_gate_statement.
    def exitDefine_gate_statement(self, ctx:TodoLangGrammarParser.Define_gate_statementContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#define_dagger_statement.
    def enterDefine_dagger_statement(self, ctx:TodoLangGrammarParser.Define_dagger_statementContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#define_dagger_statement.
    def exitDefine_dagger_statement(self, ctx:TodoLangGrammarParser.Define_dagger_statementContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#define_control_statement.
    def enterDefine_control_statement(self, ctx:TodoLangGrammarParser.Define_control_statementContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#define_control_statement.
    def exitDefine_control_statement(self, ctx:TodoLangGrammarParser.Define_control_statementContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#user_defined_gate.
    def enterUser_defined_gate(self, ctx:TodoLangGrammarParser.User_defined_gateContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#user_defined_gate.
    def exitUser_defined_gate(self, ctx:TodoLangGrammarParser.User_defined_gateContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#explist.
    def enterExplist(self, ctx:TodoLangGrammarParser.ExplistContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#explist.
    def exitExplist(self, ctx:TodoLangGrammarParser.ExplistContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#exp.
    def enterExp(self, ctx:TodoLangGrammarParser.ExpContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#exp.
    def exitExp(self, ctx:TodoLangGrammarParser.ExpContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#gate_func_statement.
    def enterGate_func_statement(self, ctx:TodoLangGrammarParser.Gate_func_statementContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#gate_func_statement.
    def exitGate_func_statement(self, ctx:TodoLangGrammarParser.Gate_func_statementContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#id.
    def enterId(self, ctx:TodoLangGrammarParser.IdContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#id.
    def exitId(self, ctx:TodoLangGrammarParser.IdContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#id_list.
    def enterId_list(self, ctx:TodoLangGrammarParser.Id_listContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#id_list.
    def exitId_list(self, ctx:TodoLangGrammarParser.Id_listContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#gate_name.
    def enterGate_name(self, ctx:TodoLangGrammarParser.Gate_nameContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#gate_name.
    def exitGate_name(self, ctx:TodoLangGrammarParser.Gate_nameContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#constant_expression.
    def enterConstant_expression(self, ctx:TodoLangGrammarParser.Constant_expressionContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#constant_expression.
    def exitConstant_expression(self, ctx:TodoLangGrammarParser.Constant_expressionContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#arithmetic_op.
    def enterArithmetic_op(self, ctx:TodoLangGrammarParser.Arithmetic_opContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#arithmetic_op.
    def exitArithmetic_op(self, ctx:TodoLangGrammarParser.Arithmetic_opContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#unary_op.
    def enterUnary_op(self, ctx:TodoLangGrammarParser.Unary_opContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#unary_op.
    def exitUnary_op(self, ctx:TodoLangGrammarParser.Unary_opContext):
        pass


    # Enter a parse tree produced by TodoLangGrammarParser#constant.
    def enterConstant(self, ctx:TodoLangGrammarParser.ConstantContext):
        pass

    # Exit a parse tree produced by TodoLangGrammarParser#constant.
    def exitConstant(self, ctx:TodoLangGrammarParser.ConstantContext):
        pass



del TodoLangGrammarParser