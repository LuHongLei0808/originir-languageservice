// Generated from c:/Users/BY23015S/Desktop/project/originir-languageservice/originir½âñî/TodoLangGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TodoLangGrammarParser}.
 */
public interface TodoLangGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#translationunit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationunit(TodoLangGrammarParser.TranslationunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#translationunit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationunit(TodoLangGrammarParser.TranslationunitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(TodoLangGrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(TodoLangGrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#qinit_declaration}.
	 * @param ctx the parse tree
	 */
	void enterQinit_declaration(TodoLangGrammarParser.Qinit_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#qinit_declaration}.
	 * @param ctx the parse tree
	 */
	void exitQinit_declaration(TodoLangGrammarParser.Qinit_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#cinit_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCinit_declaration(TodoLangGrammarParser.Cinit_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#cinit_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCinit_declaration(TodoLangGrammarParser.Cinit_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#quantum_gate_declaration}.
	 * @param ctx the parse tree
	 */
	void enterQuantum_gate_declaration(TodoLangGrammarParser.Quantum_gate_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#quantum_gate_declaration}.
	 * @param ctx the parse tree
	 */
	void exitQuantum_gate_declaration(TodoLangGrammarParser.Quantum_gate_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(TodoLangGrammarParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(TodoLangGrammarParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#c_KEY_declaration}.
	 * @param ctx the parse tree
	 */
	void enterC_KEY_declaration(TodoLangGrammarParser.C_KEY_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#c_KEY_declaration}.
	 * @param ctx the parse tree
	 */
	void exitC_KEY_declaration(TodoLangGrammarParser.C_KEY_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#q_KEY_declaration}.
	 * @param ctx the parse tree
	 */
	void enterQ_KEY_declaration(TodoLangGrammarParser.Q_KEY_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#q_KEY_declaration}.
	 * @param ctx the parse tree
	 */
	void exitQ_KEY_declaration(TodoLangGrammarParser.Q_KEY_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#single_gate_without_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingle_gate_without_parameter_declaration(TodoLangGrammarParser.Single_gate_without_parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#single_gate_without_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingle_gate_without_parameter_declaration(TodoLangGrammarParser.Single_gate_without_parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#single_gate_with_one_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingle_gate_with_one_parameter_declaration(TodoLangGrammarParser.Single_gate_with_one_parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#single_gate_with_one_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingle_gate_with_one_parameter_declaration(TodoLangGrammarParser.Single_gate_with_one_parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#single_gate_with_two_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingle_gate_with_two_parameter_declaration(TodoLangGrammarParser.Single_gate_with_two_parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#single_gate_with_two_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingle_gate_with_two_parameter_declaration(TodoLangGrammarParser.Single_gate_with_two_parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#single_gate_with_three_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingle_gate_with_three_parameter_declaration(TodoLangGrammarParser.Single_gate_with_three_parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#single_gate_with_three_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingle_gate_with_three_parameter_declaration(TodoLangGrammarParser.Single_gate_with_three_parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#single_gate_with_four_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingle_gate_with_four_parameter_declaration(TodoLangGrammarParser.Single_gate_with_four_parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#single_gate_with_four_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingle_gate_with_four_parameter_declaration(TodoLangGrammarParser.Single_gate_with_four_parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#double_gate_without_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterDouble_gate_without_parameter_declaration(TodoLangGrammarParser.Double_gate_without_parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#double_gate_without_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitDouble_gate_without_parameter_declaration(TodoLangGrammarParser.Double_gate_without_parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#double_gate_with_one_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterDouble_gate_with_one_parameter_declaration(TodoLangGrammarParser.Double_gate_with_one_parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#double_gate_with_one_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitDouble_gate_with_one_parameter_declaration(TodoLangGrammarParser.Double_gate_with_one_parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#double_gate_with_four_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterDouble_gate_with_four_parameter_declaration(TodoLangGrammarParser.Double_gate_with_four_parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#double_gate_with_four_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitDouble_gate_with_four_parameter_declaration(TodoLangGrammarParser.Double_gate_with_four_parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#triple_gate_without_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTriple_gate_without_parameter_declaration(TodoLangGrammarParser.Triple_gate_without_parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#triple_gate_without_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTriple_gate_without_parameter_declaration(TodoLangGrammarParser.Triple_gate_without_parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#define_gate_declaration}.
	 * @param ctx the parse tree
	 */
	void enterDefine_gate_declaration(TodoLangGrammarParser.Define_gate_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#define_gate_declaration}.
	 * @param ctx the parse tree
	 */
	void exitDefine_gate_declaration(TodoLangGrammarParser.Define_gate_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#single_gate_without_parameter_type}.
	 * @param ctx the parse tree
	 */
	void enterSingle_gate_without_parameter_type(TodoLangGrammarParser.Single_gate_without_parameter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#single_gate_without_parameter_type}.
	 * @param ctx the parse tree
	 */
	void exitSingle_gate_without_parameter_type(TodoLangGrammarParser.Single_gate_without_parameter_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#single_gate_with_one_parameter_type}.
	 * @param ctx the parse tree
	 */
	void enterSingle_gate_with_one_parameter_type(TodoLangGrammarParser.Single_gate_with_one_parameter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#single_gate_with_one_parameter_type}.
	 * @param ctx the parse tree
	 */
	void exitSingle_gate_with_one_parameter_type(TodoLangGrammarParser.Single_gate_with_one_parameter_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#single_gate_with_two_parameter_type}.
	 * @param ctx the parse tree
	 */
	void enterSingle_gate_with_two_parameter_type(TodoLangGrammarParser.Single_gate_with_two_parameter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#single_gate_with_two_parameter_type}.
	 * @param ctx the parse tree
	 */
	void exitSingle_gate_with_two_parameter_type(TodoLangGrammarParser.Single_gate_with_two_parameter_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#single_gate_with_three_parameter_type}.
	 * @param ctx the parse tree
	 */
	void enterSingle_gate_with_three_parameter_type(TodoLangGrammarParser.Single_gate_with_three_parameter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#single_gate_with_three_parameter_type}.
	 * @param ctx the parse tree
	 */
	void exitSingle_gate_with_three_parameter_type(TodoLangGrammarParser.Single_gate_with_three_parameter_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#single_gate_with_four_parameter_type}.
	 * @param ctx the parse tree
	 */
	void enterSingle_gate_with_four_parameter_type(TodoLangGrammarParser.Single_gate_with_four_parameter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#single_gate_with_four_parameter_type}.
	 * @param ctx the parse tree
	 */
	void exitSingle_gate_with_four_parameter_type(TodoLangGrammarParser.Single_gate_with_four_parameter_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#double_gate_without_parameter_type}.
	 * @param ctx the parse tree
	 */
	void enterDouble_gate_without_parameter_type(TodoLangGrammarParser.Double_gate_without_parameter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#double_gate_without_parameter_type}.
	 * @param ctx the parse tree
	 */
	void exitDouble_gate_without_parameter_type(TodoLangGrammarParser.Double_gate_without_parameter_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#double_gate_with_one_parameter_type}.
	 * @param ctx the parse tree
	 */
	void enterDouble_gate_with_one_parameter_type(TodoLangGrammarParser.Double_gate_with_one_parameter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#double_gate_with_one_parameter_type}.
	 * @param ctx the parse tree
	 */
	void exitDouble_gate_with_one_parameter_type(TodoLangGrammarParser.Double_gate_with_one_parameter_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#double_gate_with_four_parameter_type}.
	 * @param ctx the parse tree
	 */
	void enterDouble_gate_with_four_parameter_type(TodoLangGrammarParser.Double_gate_with_four_parameter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#double_gate_with_four_parameter_type}.
	 * @param ctx the parse tree
	 */
	void exitDouble_gate_with_four_parameter_type(TodoLangGrammarParser.Double_gate_with_four_parameter_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#triple_gate_without_parameter_type}.
	 * @param ctx the parse tree
	 */
	void enterTriple_gate_without_parameter_type(TodoLangGrammarParser.Triple_gate_without_parameter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#triple_gate_without_parameter_type}.
	 * @param ctx the parse tree
	 */
	void exitTriple_gate_without_parameter_type(TodoLangGrammarParser.Triple_gate_without_parameter_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pri_ckey}
	 * labeled alternative in {@link TodoLangGrammarParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPri_ckey(TodoLangGrammarParser.Pri_ckeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pri_ckey}
	 * labeled alternative in {@link TodoLangGrammarParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPri_ckey(TodoLangGrammarParser.Pri_ckeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pri_cst}
	 * labeled alternative in {@link TodoLangGrammarParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPri_cst(TodoLangGrammarParser.Pri_cstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pri_cst}
	 * labeled alternative in {@link TodoLangGrammarParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPri_cst(TodoLangGrammarParser.Pri_cstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pri_expr}
	 * labeled alternative in {@link TodoLangGrammarParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPri_expr(TodoLangGrammarParser.Pri_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pri_expr}
	 * labeled alternative in {@link TodoLangGrammarParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPri_expr(TodoLangGrammarParser.Pri_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(TodoLangGrammarParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(TodoLangGrammarParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(TodoLangGrammarParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(TodoLangGrammarParser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#addtive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAddtive_expression(TodoLangGrammarParser.Addtive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#addtive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAddtive_expression(TodoLangGrammarParser.Addtive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(TodoLangGrammarParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(TodoLangGrammarParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(TodoLangGrammarParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(TodoLangGrammarParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(TodoLangGrammarParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(TodoLangGrammarParser.Logical_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_expression(TodoLangGrammarParser.Logical_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_expression(TodoLangGrammarParser.Logical_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(TodoLangGrammarParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(TodoLangGrammarParser.Assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TodoLangGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TodoLangGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#controlbit_list}.
	 * @param ctx the parse tree
	 */
	void enterControlbit_list(TodoLangGrammarParser.Controlbit_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#controlbit_list}.
	 * @param ctx the parse tree
	 */
	void exitControlbit_list(TodoLangGrammarParser.Controlbit_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TodoLangGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TodoLangGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#dagger_statement}.
	 * @param ctx the parse tree
	 */
	void enterDagger_statement(TodoLangGrammarParser.Dagger_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#dagger_statement}.
	 * @param ctx the parse tree
	 */
	void exitDagger_statement(TodoLangGrammarParser.Dagger_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#control_statement}.
	 * @param ctx the parse tree
	 */
	void enterControl_statement(TodoLangGrammarParser.Control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#control_statement}.
	 * @param ctx the parse tree
	 */
	void exitControl_statement(TodoLangGrammarParser.Control_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#qelse_statement_fragment}.
	 * @param ctx the parse tree
	 */
	void enterQelse_statement_fragment(TodoLangGrammarParser.Qelse_statement_fragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#qelse_statement_fragment}.
	 * @param ctx the parse tree
	 */
	void exitQelse_statement_fragment(TodoLangGrammarParser.Qelse_statement_fragmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code qif_if}
	 * labeled alternative in {@link TodoLangGrammarParser#qif_statement}.
	 * @param ctx the parse tree
	 */
	void enterQif_if(TodoLangGrammarParser.Qif_ifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code qif_if}
	 * labeled alternative in {@link TodoLangGrammarParser#qif_statement}.
	 * @param ctx the parse tree
	 */
	void exitQif_if(TodoLangGrammarParser.Qif_ifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code qif_ifelse}
	 * labeled alternative in {@link TodoLangGrammarParser#qif_statement}.
	 * @param ctx the parse tree
	 */
	void enterQif_ifelse(TodoLangGrammarParser.Qif_ifelseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code qif_ifelse}
	 * labeled alternative in {@link TodoLangGrammarParser#qif_statement}.
	 * @param ctx the parse tree
	 */
	void exitQif_ifelse(TodoLangGrammarParser.Qif_ifelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#qwhile_statement}.
	 * @param ctx the parse tree
	 */
	void enterQwhile_statement(TodoLangGrammarParser.Qwhile_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#qwhile_statement}.
	 * @param ctx the parse tree
	 */
	void exitQwhile_statement(TodoLangGrammarParser.Qwhile_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#measure_statement}.
	 * @param ctx the parse tree
	 */
	void enterMeasure_statement(TodoLangGrammarParser.Measure_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#measure_statement}.
	 * @param ctx the parse tree
	 */
	void exitMeasure_statement(TodoLangGrammarParser.Measure_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#reset_statement}.
	 * @param ctx the parse tree
	 */
	void enterReset_statement(TodoLangGrammarParser.Reset_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#reset_statement}.
	 * @param ctx the parse tree
	 */
	void exitReset_statement(TodoLangGrammarParser.Reset_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#barrier_statement}.
	 * @param ctx the parse tree
	 */
	void enterBarrier_statement(TodoLangGrammarParser.Barrier_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#barrier_statement}.
	 * @param ctx the parse tree
	 */
	void exitBarrier_statement(TodoLangGrammarParser.Barrier_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(TodoLangGrammarParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(TodoLangGrammarParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#define_gate_statement}.
	 * @param ctx the parse tree
	 */
	void enterDefine_gate_statement(TodoLangGrammarParser.Define_gate_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#define_gate_statement}.
	 * @param ctx the parse tree
	 */
	void exitDefine_gate_statement(TodoLangGrammarParser.Define_gate_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#define_dagger_statement}.
	 * @param ctx the parse tree
	 */
	void enterDefine_dagger_statement(TodoLangGrammarParser.Define_dagger_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#define_dagger_statement}.
	 * @param ctx the parse tree
	 */
	void exitDefine_dagger_statement(TodoLangGrammarParser.Define_dagger_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#define_control_statement}.
	 * @param ctx the parse tree
	 */
	void enterDefine_control_statement(TodoLangGrammarParser.Define_control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#define_control_statement}.
	 * @param ctx the parse tree
	 */
	void exitDefine_control_statement(TodoLangGrammarParser.Define_control_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#user_defined_gate}.
	 * @param ctx the parse tree
	 */
	void enterUser_defined_gate(TodoLangGrammarParser.User_defined_gateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#user_defined_gate}.
	 * @param ctx the parse tree
	 */
	void exitUser_defined_gate(TodoLangGrammarParser.User_defined_gateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(TodoLangGrammarParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(TodoLangGrammarParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(TodoLangGrammarParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(TodoLangGrammarParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#gate_func_statement}.
	 * @param ctx the parse tree
	 */
	void enterGate_func_statement(TodoLangGrammarParser.Gate_func_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#gate_func_statement}.
	 * @param ctx the parse tree
	 */
	void exitGate_func_statement(TodoLangGrammarParser.Gate_func_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(TodoLangGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(TodoLangGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(TodoLangGrammarParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(TodoLangGrammarParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#gate_name}.
	 * @param ctx the parse tree
	 */
	void enterGate_name(TodoLangGrammarParser.Gate_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#gate_name}.
	 * @param ctx the parse tree
	 */
	void exitGate_name(TodoLangGrammarParser.Gate_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(TodoLangGrammarParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(TodoLangGrammarParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#arithmetic_op}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_op(TodoLangGrammarParser.Arithmetic_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#arithmetic_op}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_op(TodoLangGrammarParser.Arithmetic_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op(TodoLangGrammarParser.Unary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op(TodoLangGrammarParser.Unary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link TodoLangGrammarParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(TodoLangGrammarParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link TodoLangGrammarParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(TodoLangGrammarParser.ConstantContext ctx);
}