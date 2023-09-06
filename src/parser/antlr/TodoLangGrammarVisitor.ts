// Generated from TodoLangGrammar.g4 by ANTLR 4.9.0-SNAPSHOT


import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";

import { Pri_ckeyContext } from "./TodoLangGrammarParser";
import { Pri_cstContext } from "./TodoLangGrammarParser";
import { Pri_exprContext } from "./TodoLangGrammarParser";
import { Qif_ifContext } from "./TodoLangGrammarParser";
import { Qif_ifelseContext } from "./TodoLangGrammarParser";
import { TranslationunitContext } from "./TodoLangGrammarParser";
import { DeclarationContext } from "./TodoLangGrammarParser";
import { Qinit_declarationContext } from "./TodoLangGrammarParser";
import { Cinit_declarationContext } from "./TodoLangGrammarParser";
import { Quantum_gate_declarationContext } from "./TodoLangGrammarParser";
import { IndexContext } from "./TodoLangGrammarParser";
import { C_KEY_declarationContext } from "./TodoLangGrammarParser";
import { Q_KEY_declarationContext } from "./TodoLangGrammarParser";
import { Single_gate_without_parameter_declarationContext } from "./TodoLangGrammarParser";
import { Single_gate_with_one_parameter_declarationContext } from "./TodoLangGrammarParser";
import { Single_gate_with_two_parameter_declarationContext } from "./TodoLangGrammarParser";
import { Single_gate_with_three_parameter_declarationContext } from "./TodoLangGrammarParser";
import { Single_gate_with_four_parameter_declarationContext } from "./TodoLangGrammarParser";
import { Double_gate_without_parameter_declarationContext } from "./TodoLangGrammarParser";
import { Double_gate_with_one_parameter_declarationContext } from "./TodoLangGrammarParser";
import { Double_gate_with_four_parameter_declarationContext } from "./TodoLangGrammarParser";
import { Triple_gate_without_parameter_declarationContext } from "./TodoLangGrammarParser";
import { Define_gate_declarationContext } from "./TodoLangGrammarParser";
import { Single_gate_without_parameter_typeContext } from "./TodoLangGrammarParser";
import { Single_gate_with_one_parameter_typeContext } from "./TodoLangGrammarParser";
import { Single_gate_with_two_parameter_typeContext } from "./TodoLangGrammarParser";
import { Single_gate_with_three_parameter_typeContext } from "./TodoLangGrammarParser";
import { Single_gate_with_four_parameter_typeContext } from "./TodoLangGrammarParser";
import { Double_gate_without_parameter_typeContext } from "./TodoLangGrammarParser";
import { Double_gate_with_one_parameter_typeContext } from "./TodoLangGrammarParser";
import { Double_gate_with_four_parameter_typeContext } from "./TodoLangGrammarParser";
import { Triple_gate_without_parameter_typeContext } from "./TodoLangGrammarParser";
import { Primary_expressionContext } from "./TodoLangGrammarParser";
import { Unary_expressionContext } from "./TodoLangGrammarParser";
import { Multiplicative_expressionContext } from "./TodoLangGrammarParser";
import { Addtive_expressionContext } from "./TodoLangGrammarParser";
import { Relational_expressionContext } from "./TodoLangGrammarParser";
import { Equality_expressionContext } from "./TodoLangGrammarParser";
import { Logical_and_expressionContext } from "./TodoLangGrammarParser";
import { Logical_or_expressionContext } from "./TodoLangGrammarParser";
import { Assignment_expressionContext } from "./TodoLangGrammarParser";
import { ExpressionContext } from "./TodoLangGrammarParser";
import { Controlbit_listContext } from "./TodoLangGrammarParser";
import { StatementContext } from "./TodoLangGrammarParser";
import { Dagger_statementContext } from "./TodoLangGrammarParser";
import { Control_statementContext } from "./TodoLangGrammarParser";
import { Qelse_statement_fragmentContext } from "./TodoLangGrammarParser";
import { Qif_statementContext } from "./TodoLangGrammarParser";
import { Qwhile_statementContext } from "./TodoLangGrammarParser";
import { Measure_statementContext } from "./TodoLangGrammarParser";
import { Reset_statementContext } from "./TodoLangGrammarParser";
import { Barrier_statementContext } from "./TodoLangGrammarParser";
import { Expression_statementContext } from "./TodoLangGrammarParser";
import { Define_gate_statementContext } from "./TodoLangGrammarParser";
import { Define_dagger_statementContext } from "./TodoLangGrammarParser";
import { Define_control_statementContext } from "./TodoLangGrammarParser";
import { User_defined_gateContext } from "./TodoLangGrammarParser";
import { ExplistContext } from "./TodoLangGrammarParser";
import { ExpContext } from "./TodoLangGrammarParser";
import { Gate_func_statementContext } from "./TodoLangGrammarParser";
import { IdContext } from "./TodoLangGrammarParser";
import { Id_listContext } from "./TodoLangGrammarParser";
import { Gate_nameContext } from "./TodoLangGrammarParser";
import { Constant_expressionContext } from "./TodoLangGrammarParser";
import { Arithmetic_opContext } from "./TodoLangGrammarParser";
import { Unary_opContext } from "./TodoLangGrammarParser";
import { ConstantContext } from "./TodoLangGrammarParser";


/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by `TodoLangGrammarParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export interface TodoLangGrammarVisitor<Result> extends ParseTreeVisitor<Result> {
	/**
	 * Visit a parse tree produced by the `pri_ckey`
	 * labeled alternative in `TodoLangGrammarParser.primary_expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPri_ckey?: (ctx: Pri_ckeyContext) => Result;

	/**
	 * Visit a parse tree produced by the `pri_cst`
	 * labeled alternative in `TodoLangGrammarParser.primary_expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPri_cst?: (ctx: Pri_cstContext) => Result;

	/**
	 * Visit a parse tree produced by the `pri_expr`
	 * labeled alternative in `TodoLangGrammarParser.primary_expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPri_expr?: (ctx: Pri_exprContext) => Result;

	/**
	 * Visit a parse tree produced by the `qif_if`
	 * labeled alternative in `TodoLangGrammarParser.qif_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQif_if?: (ctx: Qif_ifContext) => Result;

	/**
	 * Visit a parse tree produced by the `qif_ifelse`
	 * labeled alternative in `TodoLangGrammarParser.qif_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQif_ifelse?: (ctx: Qif_ifelseContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.translationunit`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTranslationunit?: (ctx: TranslationunitContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.declaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDeclaration?: (ctx: DeclarationContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.qinit_declaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQinit_declaration?: (ctx: Qinit_declarationContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.cinit_declaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCinit_declaration?: (ctx: Cinit_declarationContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.quantum_gate_declaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQuantum_gate_declaration?: (ctx: Quantum_gate_declarationContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.index`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitIndex?: (ctx: IndexContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.c_KEY_declaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitC_KEY_declaration?: (ctx: C_KEY_declarationContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.q_KEY_declaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQ_KEY_declaration?: (ctx: Q_KEY_declarationContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.single_gate_without_parameter_declaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSingle_gate_without_parameter_declaration?: (ctx: Single_gate_without_parameter_declarationContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.single_gate_with_one_parameter_declaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSingle_gate_with_one_parameter_declaration?: (ctx: Single_gate_with_one_parameter_declarationContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.single_gate_with_two_parameter_declaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSingle_gate_with_two_parameter_declaration?: (ctx: Single_gate_with_two_parameter_declarationContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.single_gate_with_three_parameter_declaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSingle_gate_with_three_parameter_declaration?: (ctx: Single_gate_with_three_parameter_declarationContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.single_gate_with_four_parameter_declaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSingle_gate_with_four_parameter_declaration?: (ctx: Single_gate_with_four_parameter_declarationContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.double_gate_without_parameter_declaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDouble_gate_without_parameter_declaration?: (ctx: Double_gate_without_parameter_declarationContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.double_gate_with_one_parameter_declaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDouble_gate_with_one_parameter_declaration?: (ctx: Double_gate_with_one_parameter_declarationContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.double_gate_with_four_parameter_declaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDouble_gate_with_four_parameter_declaration?: (ctx: Double_gate_with_four_parameter_declarationContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.triple_gate_without_parameter_declaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTriple_gate_without_parameter_declaration?: (ctx: Triple_gate_without_parameter_declarationContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.define_gate_declaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDefine_gate_declaration?: (ctx: Define_gate_declarationContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.single_gate_without_parameter_type`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSingle_gate_without_parameter_type?: (ctx: Single_gate_without_parameter_typeContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.single_gate_with_one_parameter_type`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSingle_gate_with_one_parameter_type?: (ctx: Single_gate_with_one_parameter_typeContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.single_gate_with_two_parameter_type`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSingle_gate_with_two_parameter_type?: (ctx: Single_gate_with_two_parameter_typeContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.single_gate_with_three_parameter_type`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSingle_gate_with_three_parameter_type?: (ctx: Single_gate_with_three_parameter_typeContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.single_gate_with_four_parameter_type`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSingle_gate_with_four_parameter_type?: (ctx: Single_gate_with_four_parameter_typeContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.double_gate_without_parameter_type`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDouble_gate_without_parameter_type?: (ctx: Double_gate_without_parameter_typeContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.double_gate_with_one_parameter_type`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDouble_gate_with_one_parameter_type?: (ctx: Double_gate_with_one_parameter_typeContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.double_gate_with_four_parameter_type`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDouble_gate_with_four_parameter_type?: (ctx: Double_gate_with_four_parameter_typeContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.triple_gate_without_parameter_type`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitTriple_gate_without_parameter_type?: (ctx: Triple_gate_without_parameter_typeContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.primary_expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitPrimary_expression?: (ctx: Primary_expressionContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.unary_expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUnary_expression?: (ctx: Unary_expressionContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.multiplicative_expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMultiplicative_expression?: (ctx: Multiplicative_expressionContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.addtive_expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAddtive_expression?: (ctx: Addtive_expressionContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.relational_expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRelational_expression?: (ctx: Relational_expressionContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.equality_expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitEquality_expression?: (ctx: Equality_expressionContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.logical_and_expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLogical_and_expression?: (ctx: Logical_and_expressionContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.logical_or_expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitLogical_or_expression?: (ctx: Logical_or_expressionContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.assignment_expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAssignment_expression?: (ctx: Assignment_expressionContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression?: (ctx: ExpressionContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.controlbit_list`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitControlbit_list?: (ctx: Controlbit_listContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStatement?: (ctx: StatementContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.dagger_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDagger_statement?: (ctx: Dagger_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.control_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitControl_statement?: (ctx: Control_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.qelse_statement_fragment`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQelse_statement_fragment?: (ctx: Qelse_statement_fragmentContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.qif_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQif_statement?: (ctx: Qif_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.qwhile_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitQwhile_statement?: (ctx: Qwhile_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.measure_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitMeasure_statement?: (ctx: Measure_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.reset_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitReset_statement?: (ctx: Reset_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.barrier_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitBarrier_statement?: (ctx: Barrier_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.expression_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExpression_statement?: (ctx: Expression_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.define_gate_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDefine_gate_statement?: (ctx: Define_gate_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.define_dagger_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDefine_dagger_statement?: (ctx: Define_dagger_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.define_control_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDefine_control_statement?: (ctx: Define_control_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.user_defined_gate`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUser_defined_gate?: (ctx: User_defined_gateContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.explist`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExplist?: (ctx: ExplistContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.exp`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitExp?: (ctx: ExpContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.gate_func_statement`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGate_func_statement?: (ctx: Gate_func_statementContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.id`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitId?: (ctx: IdContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.id_list`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitId_list?: (ctx: Id_listContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.gate_name`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGate_name?: (ctx: Gate_nameContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.constant_expression`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstant_expression?: (ctx: Constant_expressionContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.arithmetic_op`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArithmetic_op?: (ctx: Arithmetic_opContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.unary_op`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitUnary_op?: (ctx: Unary_opContext) => Result;

	/**
	 * Visit a parse tree produced by `TodoLangGrammarParser.constant`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitConstant?: (ctx: ConstantContext) => Result;
}

