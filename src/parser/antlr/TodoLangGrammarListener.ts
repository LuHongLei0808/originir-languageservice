// Generated from TodoLangGrammar.g4 by ANTLR 4.9.0-SNAPSHOT


import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";

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
 * This interface defines a complete listener for a parse tree produced by
 * `TodoLangGrammarParser`.
 */
export interface TodoLangGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the `pri_ckey`
	 * labeled alternative in `TodoLangGrammarParser.primary_expression`.
	 * @param ctx the parse tree
	 */
	enterPri_ckey?: (ctx: Pri_ckeyContext) => void;
	/**
	 * Exit a parse tree produced by the `pri_ckey`
	 * labeled alternative in `TodoLangGrammarParser.primary_expression`.
	 * @param ctx the parse tree
	 */
	exitPri_ckey?: (ctx: Pri_ckeyContext) => void;

	/**
	 * Enter a parse tree produced by the `pri_cst`
	 * labeled alternative in `TodoLangGrammarParser.primary_expression`.
	 * @param ctx the parse tree
	 */
	enterPri_cst?: (ctx: Pri_cstContext) => void;
	/**
	 * Exit a parse tree produced by the `pri_cst`
	 * labeled alternative in `TodoLangGrammarParser.primary_expression`.
	 * @param ctx the parse tree
	 */
	exitPri_cst?: (ctx: Pri_cstContext) => void;

	/**
	 * Enter a parse tree produced by the `pri_expr`
	 * labeled alternative in `TodoLangGrammarParser.primary_expression`.
	 * @param ctx the parse tree
	 */
	enterPri_expr?: (ctx: Pri_exprContext) => void;
	/**
	 * Exit a parse tree produced by the `pri_expr`
	 * labeled alternative in `TodoLangGrammarParser.primary_expression`.
	 * @param ctx the parse tree
	 */
	exitPri_expr?: (ctx: Pri_exprContext) => void;

	/**
	 * Enter a parse tree produced by the `qif_if`
	 * labeled alternative in `TodoLangGrammarParser.qif_statement`.
	 * @param ctx the parse tree
	 */
	enterQif_if?: (ctx: Qif_ifContext) => void;
	/**
	 * Exit a parse tree produced by the `qif_if`
	 * labeled alternative in `TodoLangGrammarParser.qif_statement`.
	 * @param ctx the parse tree
	 */
	exitQif_if?: (ctx: Qif_ifContext) => void;

	/**
	 * Enter a parse tree produced by the `qif_ifelse`
	 * labeled alternative in `TodoLangGrammarParser.qif_statement`.
	 * @param ctx the parse tree
	 */
	enterQif_ifelse?: (ctx: Qif_ifelseContext) => void;
	/**
	 * Exit a parse tree produced by the `qif_ifelse`
	 * labeled alternative in `TodoLangGrammarParser.qif_statement`.
	 * @param ctx the parse tree
	 */
	exitQif_ifelse?: (ctx: Qif_ifelseContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.translationunit`.
	 * @param ctx the parse tree
	 */
	enterTranslationunit?: (ctx: TranslationunitContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.translationunit`.
	 * @param ctx the parse tree
	 */
	exitTranslationunit?: (ctx: TranslationunitContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.declaration`.
	 * @param ctx the parse tree
	 */
	enterDeclaration?: (ctx: DeclarationContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.declaration`.
	 * @param ctx the parse tree
	 */
	exitDeclaration?: (ctx: DeclarationContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.qinit_declaration`.
	 * @param ctx the parse tree
	 */
	enterQinit_declaration?: (ctx: Qinit_declarationContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.qinit_declaration`.
	 * @param ctx the parse tree
	 */
	exitQinit_declaration?: (ctx: Qinit_declarationContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.cinit_declaration`.
	 * @param ctx the parse tree
	 */
	enterCinit_declaration?: (ctx: Cinit_declarationContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.cinit_declaration`.
	 * @param ctx the parse tree
	 */
	exitCinit_declaration?: (ctx: Cinit_declarationContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.quantum_gate_declaration`.
	 * @param ctx the parse tree
	 */
	enterQuantum_gate_declaration?: (ctx: Quantum_gate_declarationContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.quantum_gate_declaration`.
	 * @param ctx the parse tree
	 */
	exitQuantum_gate_declaration?: (ctx: Quantum_gate_declarationContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.index`.
	 * @param ctx the parse tree
	 */
	enterIndex?: (ctx: IndexContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.index`.
	 * @param ctx the parse tree
	 */
	exitIndex?: (ctx: IndexContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.c_KEY_declaration`.
	 * @param ctx the parse tree
	 */
	enterC_KEY_declaration?: (ctx: C_KEY_declarationContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.c_KEY_declaration`.
	 * @param ctx the parse tree
	 */
	exitC_KEY_declaration?: (ctx: C_KEY_declarationContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.q_KEY_declaration`.
	 * @param ctx the parse tree
	 */
	enterQ_KEY_declaration?: (ctx: Q_KEY_declarationContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.q_KEY_declaration`.
	 * @param ctx the parse tree
	 */
	exitQ_KEY_declaration?: (ctx: Q_KEY_declarationContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.single_gate_without_parameter_declaration`.
	 * @param ctx the parse tree
	 */
	enterSingle_gate_without_parameter_declaration?: (ctx: Single_gate_without_parameter_declarationContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.single_gate_without_parameter_declaration`.
	 * @param ctx the parse tree
	 */
	exitSingle_gate_without_parameter_declaration?: (ctx: Single_gate_without_parameter_declarationContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.single_gate_with_one_parameter_declaration`.
	 * @param ctx the parse tree
	 */
	enterSingle_gate_with_one_parameter_declaration?: (ctx: Single_gate_with_one_parameter_declarationContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.single_gate_with_one_parameter_declaration`.
	 * @param ctx the parse tree
	 */
	exitSingle_gate_with_one_parameter_declaration?: (ctx: Single_gate_with_one_parameter_declarationContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.single_gate_with_two_parameter_declaration`.
	 * @param ctx the parse tree
	 */
	enterSingle_gate_with_two_parameter_declaration?: (ctx: Single_gate_with_two_parameter_declarationContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.single_gate_with_two_parameter_declaration`.
	 * @param ctx the parse tree
	 */
	exitSingle_gate_with_two_parameter_declaration?: (ctx: Single_gate_with_two_parameter_declarationContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.single_gate_with_three_parameter_declaration`.
	 * @param ctx the parse tree
	 */
	enterSingle_gate_with_three_parameter_declaration?: (ctx: Single_gate_with_three_parameter_declarationContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.single_gate_with_three_parameter_declaration`.
	 * @param ctx the parse tree
	 */
	exitSingle_gate_with_three_parameter_declaration?: (ctx: Single_gate_with_three_parameter_declarationContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.single_gate_with_four_parameter_declaration`.
	 * @param ctx the parse tree
	 */
	enterSingle_gate_with_four_parameter_declaration?: (ctx: Single_gate_with_four_parameter_declarationContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.single_gate_with_four_parameter_declaration`.
	 * @param ctx the parse tree
	 */
	exitSingle_gate_with_four_parameter_declaration?: (ctx: Single_gate_with_four_parameter_declarationContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.double_gate_without_parameter_declaration`.
	 * @param ctx the parse tree
	 */
	enterDouble_gate_without_parameter_declaration?: (ctx: Double_gate_without_parameter_declarationContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.double_gate_without_parameter_declaration`.
	 * @param ctx the parse tree
	 */
	exitDouble_gate_without_parameter_declaration?: (ctx: Double_gate_without_parameter_declarationContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.double_gate_with_one_parameter_declaration`.
	 * @param ctx the parse tree
	 */
	enterDouble_gate_with_one_parameter_declaration?: (ctx: Double_gate_with_one_parameter_declarationContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.double_gate_with_one_parameter_declaration`.
	 * @param ctx the parse tree
	 */
	exitDouble_gate_with_one_parameter_declaration?: (ctx: Double_gate_with_one_parameter_declarationContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.double_gate_with_four_parameter_declaration`.
	 * @param ctx the parse tree
	 */
	enterDouble_gate_with_four_parameter_declaration?: (ctx: Double_gate_with_four_parameter_declarationContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.double_gate_with_four_parameter_declaration`.
	 * @param ctx the parse tree
	 */
	exitDouble_gate_with_four_parameter_declaration?: (ctx: Double_gate_with_four_parameter_declarationContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.triple_gate_without_parameter_declaration`.
	 * @param ctx the parse tree
	 */
	enterTriple_gate_without_parameter_declaration?: (ctx: Triple_gate_without_parameter_declarationContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.triple_gate_without_parameter_declaration`.
	 * @param ctx the parse tree
	 */
	exitTriple_gate_without_parameter_declaration?: (ctx: Triple_gate_without_parameter_declarationContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.define_gate_declaration`.
	 * @param ctx the parse tree
	 */
	enterDefine_gate_declaration?: (ctx: Define_gate_declarationContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.define_gate_declaration`.
	 * @param ctx the parse tree
	 */
	exitDefine_gate_declaration?: (ctx: Define_gate_declarationContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.single_gate_without_parameter_type`.
	 * @param ctx the parse tree
	 */
	enterSingle_gate_without_parameter_type?: (ctx: Single_gate_without_parameter_typeContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.single_gate_without_parameter_type`.
	 * @param ctx the parse tree
	 */
	exitSingle_gate_without_parameter_type?: (ctx: Single_gate_without_parameter_typeContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.single_gate_with_one_parameter_type`.
	 * @param ctx the parse tree
	 */
	enterSingle_gate_with_one_parameter_type?: (ctx: Single_gate_with_one_parameter_typeContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.single_gate_with_one_parameter_type`.
	 * @param ctx the parse tree
	 */
	exitSingle_gate_with_one_parameter_type?: (ctx: Single_gate_with_one_parameter_typeContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.single_gate_with_two_parameter_type`.
	 * @param ctx the parse tree
	 */
	enterSingle_gate_with_two_parameter_type?: (ctx: Single_gate_with_two_parameter_typeContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.single_gate_with_two_parameter_type`.
	 * @param ctx the parse tree
	 */
	exitSingle_gate_with_two_parameter_type?: (ctx: Single_gate_with_two_parameter_typeContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.single_gate_with_three_parameter_type`.
	 * @param ctx the parse tree
	 */
	enterSingle_gate_with_three_parameter_type?: (ctx: Single_gate_with_three_parameter_typeContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.single_gate_with_three_parameter_type`.
	 * @param ctx the parse tree
	 */
	exitSingle_gate_with_three_parameter_type?: (ctx: Single_gate_with_three_parameter_typeContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.single_gate_with_four_parameter_type`.
	 * @param ctx the parse tree
	 */
	enterSingle_gate_with_four_parameter_type?: (ctx: Single_gate_with_four_parameter_typeContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.single_gate_with_four_parameter_type`.
	 * @param ctx the parse tree
	 */
	exitSingle_gate_with_four_parameter_type?: (ctx: Single_gate_with_four_parameter_typeContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.double_gate_without_parameter_type`.
	 * @param ctx the parse tree
	 */
	enterDouble_gate_without_parameter_type?: (ctx: Double_gate_without_parameter_typeContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.double_gate_without_parameter_type`.
	 * @param ctx the parse tree
	 */
	exitDouble_gate_without_parameter_type?: (ctx: Double_gate_without_parameter_typeContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.double_gate_with_one_parameter_type`.
	 * @param ctx the parse tree
	 */
	enterDouble_gate_with_one_parameter_type?: (ctx: Double_gate_with_one_parameter_typeContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.double_gate_with_one_parameter_type`.
	 * @param ctx the parse tree
	 */
	exitDouble_gate_with_one_parameter_type?: (ctx: Double_gate_with_one_parameter_typeContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.double_gate_with_four_parameter_type`.
	 * @param ctx the parse tree
	 */
	enterDouble_gate_with_four_parameter_type?: (ctx: Double_gate_with_four_parameter_typeContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.double_gate_with_four_parameter_type`.
	 * @param ctx the parse tree
	 */
	exitDouble_gate_with_four_parameter_type?: (ctx: Double_gate_with_four_parameter_typeContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.triple_gate_without_parameter_type`.
	 * @param ctx the parse tree
	 */
	enterTriple_gate_without_parameter_type?: (ctx: Triple_gate_without_parameter_typeContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.triple_gate_without_parameter_type`.
	 * @param ctx the parse tree
	 */
	exitTriple_gate_without_parameter_type?: (ctx: Triple_gate_without_parameter_typeContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.primary_expression`.
	 * @param ctx the parse tree
	 */
	enterPrimary_expression?: (ctx: Primary_expressionContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.primary_expression`.
	 * @param ctx the parse tree
	 */
	exitPrimary_expression?: (ctx: Primary_expressionContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.unary_expression`.
	 * @param ctx the parse tree
	 */
	enterUnary_expression?: (ctx: Unary_expressionContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.unary_expression`.
	 * @param ctx the parse tree
	 */
	exitUnary_expression?: (ctx: Unary_expressionContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.multiplicative_expression`.
	 * @param ctx the parse tree
	 */
	enterMultiplicative_expression?: (ctx: Multiplicative_expressionContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.multiplicative_expression`.
	 * @param ctx the parse tree
	 */
	exitMultiplicative_expression?: (ctx: Multiplicative_expressionContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.addtive_expression`.
	 * @param ctx the parse tree
	 */
	enterAddtive_expression?: (ctx: Addtive_expressionContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.addtive_expression`.
	 * @param ctx the parse tree
	 */
	exitAddtive_expression?: (ctx: Addtive_expressionContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.relational_expression`.
	 * @param ctx the parse tree
	 */
	enterRelational_expression?: (ctx: Relational_expressionContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.relational_expression`.
	 * @param ctx the parse tree
	 */
	exitRelational_expression?: (ctx: Relational_expressionContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.equality_expression`.
	 * @param ctx the parse tree
	 */
	enterEquality_expression?: (ctx: Equality_expressionContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.equality_expression`.
	 * @param ctx the parse tree
	 */
	exitEquality_expression?: (ctx: Equality_expressionContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.logical_and_expression`.
	 * @param ctx the parse tree
	 */
	enterLogical_and_expression?: (ctx: Logical_and_expressionContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.logical_and_expression`.
	 * @param ctx the parse tree
	 */
	exitLogical_and_expression?: (ctx: Logical_and_expressionContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.logical_or_expression`.
	 * @param ctx the parse tree
	 */
	enterLogical_or_expression?: (ctx: Logical_or_expressionContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.logical_or_expression`.
	 * @param ctx the parse tree
	 */
	exitLogical_or_expression?: (ctx: Logical_or_expressionContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.assignment_expression`.
	 * @param ctx the parse tree
	 */
	enterAssignment_expression?: (ctx: Assignment_expressionContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.assignment_expression`.
	 * @param ctx the parse tree
	 */
	exitAssignment_expression?: (ctx: Assignment_expressionContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.expression`.
	 * @param ctx the parse tree
	 */
	enterExpression?: (ctx: ExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.expression`.
	 * @param ctx the parse tree
	 */
	exitExpression?: (ctx: ExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.controlbit_list`.
	 * @param ctx the parse tree
	 */
	enterControlbit_list?: (ctx: Controlbit_listContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.controlbit_list`.
	 * @param ctx the parse tree
	 */
	exitControlbit_list?: (ctx: Controlbit_listContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	enterStatement?: (ctx: StatementContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.statement`.
	 * @param ctx the parse tree
	 */
	exitStatement?: (ctx: StatementContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.dagger_statement`.
	 * @param ctx the parse tree
	 */
	enterDagger_statement?: (ctx: Dagger_statementContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.dagger_statement`.
	 * @param ctx the parse tree
	 */
	exitDagger_statement?: (ctx: Dagger_statementContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.control_statement`.
	 * @param ctx the parse tree
	 */
	enterControl_statement?: (ctx: Control_statementContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.control_statement`.
	 * @param ctx the parse tree
	 */
	exitControl_statement?: (ctx: Control_statementContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.qelse_statement_fragment`.
	 * @param ctx the parse tree
	 */
	enterQelse_statement_fragment?: (ctx: Qelse_statement_fragmentContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.qelse_statement_fragment`.
	 * @param ctx the parse tree
	 */
	exitQelse_statement_fragment?: (ctx: Qelse_statement_fragmentContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.qif_statement`.
	 * @param ctx the parse tree
	 */
	enterQif_statement?: (ctx: Qif_statementContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.qif_statement`.
	 * @param ctx the parse tree
	 */
	exitQif_statement?: (ctx: Qif_statementContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.qwhile_statement`.
	 * @param ctx the parse tree
	 */
	enterQwhile_statement?: (ctx: Qwhile_statementContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.qwhile_statement`.
	 * @param ctx the parse tree
	 */
	exitQwhile_statement?: (ctx: Qwhile_statementContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.measure_statement`.
	 * @param ctx the parse tree
	 */
	enterMeasure_statement?: (ctx: Measure_statementContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.measure_statement`.
	 * @param ctx the parse tree
	 */
	exitMeasure_statement?: (ctx: Measure_statementContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.reset_statement`.
	 * @param ctx the parse tree
	 */
	enterReset_statement?: (ctx: Reset_statementContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.reset_statement`.
	 * @param ctx the parse tree
	 */
	exitReset_statement?: (ctx: Reset_statementContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.barrier_statement`.
	 * @param ctx the parse tree
	 */
	enterBarrier_statement?: (ctx: Barrier_statementContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.barrier_statement`.
	 * @param ctx the parse tree
	 */
	exitBarrier_statement?: (ctx: Barrier_statementContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.expression_statement`.
	 * @param ctx the parse tree
	 */
	enterExpression_statement?: (ctx: Expression_statementContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.expression_statement`.
	 * @param ctx the parse tree
	 */
	exitExpression_statement?: (ctx: Expression_statementContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.define_gate_statement`.
	 * @param ctx the parse tree
	 */
	enterDefine_gate_statement?: (ctx: Define_gate_statementContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.define_gate_statement`.
	 * @param ctx the parse tree
	 */
	exitDefine_gate_statement?: (ctx: Define_gate_statementContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.define_dagger_statement`.
	 * @param ctx the parse tree
	 */
	enterDefine_dagger_statement?: (ctx: Define_dagger_statementContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.define_dagger_statement`.
	 * @param ctx the parse tree
	 */
	exitDefine_dagger_statement?: (ctx: Define_dagger_statementContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.define_control_statement`.
	 * @param ctx the parse tree
	 */
	enterDefine_control_statement?: (ctx: Define_control_statementContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.define_control_statement`.
	 * @param ctx the parse tree
	 */
	exitDefine_control_statement?: (ctx: Define_control_statementContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.user_defined_gate`.
	 * @param ctx the parse tree
	 */
	enterUser_defined_gate?: (ctx: User_defined_gateContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.user_defined_gate`.
	 * @param ctx the parse tree
	 */
	exitUser_defined_gate?: (ctx: User_defined_gateContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.explist`.
	 * @param ctx the parse tree
	 */
	enterExplist?: (ctx: ExplistContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.explist`.
	 * @param ctx the parse tree
	 */
	exitExplist?: (ctx: ExplistContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.exp`.
	 * @param ctx the parse tree
	 */
	enterExp?: (ctx: ExpContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.exp`.
	 * @param ctx the parse tree
	 */
	exitExp?: (ctx: ExpContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.gate_func_statement`.
	 * @param ctx the parse tree
	 */
	enterGate_func_statement?: (ctx: Gate_func_statementContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.gate_func_statement`.
	 * @param ctx the parse tree
	 */
	exitGate_func_statement?: (ctx: Gate_func_statementContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.id`.
	 * @param ctx the parse tree
	 */
	enterId?: (ctx: IdContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.id`.
	 * @param ctx the parse tree
	 */
	exitId?: (ctx: IdContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.id_list`.
	 * @param ctx the parse tree
	 */
	enterId_list?: (ctx: Id_listContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.id_list`.
	 * @param ctx the parse tree
	 */
	exitId_list?: (ctx: Id_listContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.gate_name`.
	 * @param ctx the parse tree
	 */
	enterGate_name?: (ctx: Gate_nameContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.gate_name`.
	 * @param ctx the parse tree
	 */
	exitGate_name?: (ctx: Gate_nameContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.constant_expression`.
	 * @param ctx the parse tree
	 */
	enterConstant_expression?: (ctx: Constant_expressionContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.constant_expression`.
	 * @param ctx the parse tree
	 */
	exitConstant_expression?: (ctx: Constant_expressionContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.arithmetic_op`.
	 * @param ctx the parse tree
	 */
	enterArithmetic_op?: (ctx: Arithmetic_opContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.arithmetic_op`.
	 * @param ctx the parse tree
	 */
	exitArithmetic_op?: (ctx: Arithmetic_opContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.unary_op`.
	 * @param ctx the parse tree
	 */
	enterUnary_op?: (ctx: Unary_opContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.unary_op`.
	 * @param ctx the parse tree
	 */
	exitUnary_op?: (ctx: Unary_opContext) => void;

	/**
	 * Enter a parse tree produced by `TodoLangGrammarParser.constant`.
	 * @param ctx the parse tree
	 */
	enterConstant?: (ctx: ConstantContext) => void;
	/**
	 * Exit a parse tree produced by `TodoLangGrammarParser.constant`.
	 * @param ctx the parse tree
	 */
	exitConstant?: (ctx: ConstantContext) => void;
}

