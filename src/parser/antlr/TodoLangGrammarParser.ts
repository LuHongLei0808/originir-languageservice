// Generated from TodoLangGrammar.g4 by ANTLR 4.9.0-SNAPSHOT


import { ATN } from "antlr4ts/atn/ATN";
import { ATNDeserializer } from "antlr4ts/atn/ATNDeserializer";
import { FailedPredicateException } from "antlr4ts/FailedPredicateException";
import { NotNull } from "antlr4ts/Decorators";
import { NoViableAltException } from "antlr4ts/NoViableAltException";
import { Override } from "antlr4ts/Decorators";
import { Parser } from "antlr4ts/Parser";
import { ParserRuleContext } from "antlr4ts/ParserRuleContext";
import { ParserATNSimulator } from "antlr4ts/atn/ParserATNSimulator";
import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";
import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";
import { RecognitionException } from "antlr4ts/RecognitionException";
import { RuleContext } from "antlr4ts/RuleContext";
//import { RuleVersion } from "antlr4ts/RuleVersion";
import { TerminalNode } from "antlr4ts/tree/TerminalNode";
import { Token } from "antlr4ts/Token";
import { TokenStream } from "antlr4ts/TokenStream";
import { Vocabulary } from "antlr4ts/Vocabulary";
import { VocabularyImpl } from "antlr4ts/VocabularyImpl";

import * as Utils from "antlr4ts/misc/Utils";

import { TodoLangGrammarListener } from "./TodoLangGrammarListener";
import { TodoLangGrammarVisitor } from "./TodoLangGrammarVisitor";


export class TodoLangGrammarParser extends Parser {
	public static readonly PI = 1;
	public static readonly QINIT_KEY = 2;
	public static readonly CREG_KEY = 3;
	public static readonly Q_KEY = 4;
	public static readonly C_KEY = 5;
	public static readonly BARRIER_KEY = 6;
	public static readonly QGATE_KEY = 7;
	public static readonly ENDQGATE_KEY = 8;
	public static readonly ECHO_GATE = 9;
	public static readonly H_GATE = 10;
	public static readonly X_GATE = 11;
	public static readonly NOT_GATE = 12;
	public static readonly T_GATE = 13;
	public static readonly S_GATE = 14;
	public static readonly Y_GATE = 15;
	public static readonly Z_GATE = 16;
	public static readonly X1_GATE = 17;
	public static readonly Y1_GATE = 18;
	public static readonly Z1_GATE = 19;
	public static readonly I_GATE = 20;
	public static readonly U2_GATE = 21;
	public static readonly RPHI_GATE = 22;
	public static readonly U3_GATE = 23;
	public static readonly U4_GATE = 24;
	public static readonly RX_GATE = 25;
	public static readonly RY_GATE = 26;
	public static readonly RZ_GATE = 27;
	public static readonly U1_GATE = 28;
	public static readonly CNOT_GATE = 29;
	public static readonly CZ_GATE = 30;
	public static readonly CU_GATE = 31;
	public static readonly ISWAP_GATE = 32;
	public static readonly SQISWAP_GATE = 33;
	public static readonly SWAPZ1_GATE = 34;
	public static readonly ISWAPTHETA_GATE = 35;
	public static readonly CR_GATE = 36;
	public static readonly TOFFOLI_GATE = 37;
	public static readonly CP_GATE = 38;
	public static readonly DAGGER_KEY = 39;
	public static readonly ENDDAGGER_KEY = 40;
	public static readonly CONTROL_KEY = 41;
	public static readonly ENDCONTROL_KEY = 42;
	public static readonly QIF_KEY = 43;
	public static readonly ELSE_KEY = 44;
	public static readonly ENDIF_KEY = 45;
	public static readonly QWHILE_KEY = 46;
	public static readonly ENDQWHILE_KEY = 47;
	public static readonly MEASURE_KEY = 48;
	public static readonly RESET_KEY = 49;
	public static readonly ASSIGN = 50;
	public static readonly GT = 51;
	public static readonly LT = 52;
	public static readonly NOT = 53;
	public static readonly EQ = 54;
	public static readonly LEQ = 55;
	public static readonly GEQ = 56;
	public static readonly NE = 57;
	public static readonly AND = 58;
	public static readonly OR = 59;
	public static readonly PLUS = 60;
	public static readonly MINUS = 61;
	public static readonly MUL = 62;
	public static readonly DIV = 63;
	public static readonly COMMA = 64;
	public static readonly LPAREN = 65;
	public static readonly RPAREN = 66;
	public static readonly LBRACK = 67;
	public static readonly RBRACK = 68;
	public static readonly NEWLINE = 69;
	public static readonly Identifier = 70;
	public static readonly Integer_Literal = 71;
	public static readonly Double_Literal = 72;
	public static readonly Digit_Sequence = 73;
	public static readonly REALEXP = 74;
	public static readonly WhiteSpace = 75;
	public static readonly SingleLineComment = 76;
	public static readonly WS = 77;
	public static readonly RULE_translationunit = 0;
	public static readonly RULE_declaration = 1;
	public static readonly RULE_qinit_declaration = 2;
	public static readonly RULE_cinit_declaration = 3;
	public static readonly RULE_quantum_gate_declaration = 4;
	public static readonly RULE_index = 5;
	public static readonly RULE_c_KEY_declaration = 6;
	public static readonly RULE_q_KEY_declaration = 7;
	public static readonly RULE_single_gate_without_parameter_declaration = 8;
	public static readonly RULE_single_gate_with_one_parameter_declaration = 9;
	public static readonly RULE_single_gate_with_two_parameter_declaration = 10;
	public static readonly RULE_single_gate_with_three_parameter_declaration = 11;
	public static readonly RULE_single_gate_with_four_parameter_declaration = 12;
	public static readonly RULE_double_gate_without_parameter_declaration = 13;
	public static readonly RULE_double_gate_with_one_parameter_declaration = 14;
	public static readonly RULE_double_gate_with_four_parameter_declaration = 15;
	public static readonly RULE_triple_gate_without_parameter_declaration = 16;
	public static readonly RULE_define_gate_declaration = 17;
	public static readonly RULE_single_gate_without_parameter_type = 18;
	public static readonly RULE_single_gate_with_one_parameter_type = 19;
	public static readonly RULE_single_gate_with_two_parameter_type = 20;
	public static readonly RULE_single_gate_with_three_parameter_type = 21;
	public static readonly RULE_single_gate_with_four_parameter_type = 22;
	public static readonly RULE_double_gate_without_parameter_type = 23;
	public static readonly RULE_double_gate_with_one_parameter_type = 24;
	public static readonly RULE_double_gate_with_four_parameter_type = 25;
	public static readonly RULE_triple_gate_without_parameter_type = 26;
	public static readonly RULE_primary_expression = 27;
	public static readonly RULE_unary_expression = 28;
	public static readonly RULE_multiplicative_expression = 29;
	public static readonly RULE_addtive_expression = 30;
	public static readonly RULE_relational_expression = 31;
	public static readonly RULE_equality_expression = 32;
	public static readonly RULE_logical_and_expression = 33;
	public static readonly RULE_logical_or_expression = 34;
	public static readonly RULE_assignment_expression = 35;
	public static readonly RULE_expression = 36;
	public static readonly RULE_controlbit_list = 37;
	public static readonly RULE_statement = 38;
	public static readonly RULE_dagger_statement = 39;
	public static readonly RULE_control_statement = 40;
	public static readonly RULE_qelse_statement_fragment = 41;
	public static readonly RULE_qif_statement = 42;
	public static readonly RULE_qwhile_statement = 43;
	public static readonly RULE_measure_statement = 44;
	public static readonly RULE_reset_statement = 45;
	public static readonly RULE_barrier_statement = 46;
	public static readonly RULE_expression_statement = 47;
	public static readonly RULE_define_gate_statement = 48;
	public static readonly RULE_define_dagger_statement = 49;
	public static readonly RULE_define_control_statement = 50;
	public static readonly RULE_user_defined_gate = 51;
	public static readonly RULE_explist = 52;
	public static readonly RULE_exp = 53;
	public static readonly RULE_gate_func_statement = 54;
	public static readonly RULE_id = 55;
	public static readonly RULE_id_list = 56;
	public static readonly RULE_gate_name = 57;
	public static readonly RULE_constant_expression = 58;
	public static readonly RULE_arithmetic_op = 59;
	public static readonly RULE_unary_op = 60;
	public static readonly RULE_constant = 61;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"translationunit", "declaration", "qinit_declaration", "cinit_declaration", 
		"quantum_gate_declaration", "index", "c_KEY_declaration", "q_KEY_declaration", 
		"single_gate_without_parameter_declaration", "single_gate_with_one_parameter_declaration", 
		"single_gate_with_two_parameter_declaration", "single_gate_with_three_parameter_declaration", 
		"single_gate_with_four_parameter_declaration", "double_gate_without_parameter_declaration", 
		"double_gate_with_one_parameter_declaration", "double_gate_with_four_parameter_declaration", 
		"triple_gate_without_parameter_declaration", "define_gate_declaration", 
		"single_gate_without_parameter_type", "single_gate_with_one_parameter_type", 
		"single_gate_with_two_parameter_type", "single_gate_with_three_parameter_type", 
		"single_gate_with_four_parameter_type", "double_gate_without_parameter_type", 
		"double_gate_with_one_parameter_type", "double_gate_with_four_parameter_type", 
		"triple_gate_without_parameter_type", "primary_expression", "unary_expression", 
		"multiplicative_expression", "addtive_expression", "relational_expression", 
		"equality_expression", "logical_and_expression", "logical_or_expression", 
		"assignment_expression", "expression", "controlbit_list", "statement", 
		"dagger_statement", "control_statement", "qelse_statement_fragment", "qif_statement", 
		"qwhile_statement", "measure_statement", "reset_statement", "barrier_statement", 
		"expression_statement", "define_gate_statement", "define_dagger_statement", 
		"define_control_statement", "user_defined_gate", "explist", "exp", "gate_func_statement", 
		"id", "id_list", "gate_name", "constant_expression", "arithmetic_op", 
		"unary_op", "constant",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
		undefined, "'PI'", "'QINIT'", "'CREG'", "'q'", "'c'", "'BARRIER'", "'QGATE'", 
		"'ENDQGATE'", "'ECHO'", "'H'", "'X'", "'NOT'", "'T'", "'S'", "'Y'", "'Z'", 
		"'X1'", "'Y1'", "'Z1'", "'I'", "'U2'", "'RPhi'", "'U3'", "'U4'", "'RX'", 
		"'RY'", "'RZ'", "'U1'", "'CNOT'", "'CZ'", "'CU'", "'ISWAP'", "'SQISWAP'", 
		"'SWAP'", "'ISWAPTHETA'", "'CR'", "'TOFFOLI'", "'CP'", "'DAGGER'", "'ENDDAGGER'", 
		"'CONTROL'", "'ENDCONTROL'", "'QIF'", "'ELSE'", "'ENDQIF'", "'QWHILE'", 
		"'ENDQWHILE'", "'MEASURE'", "'RESET'", "'='", "'>'", "'<'", "'!'", "'=='", 
		"'<='", "'>='", "'!='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "','", 
		"'('", "')'", "'['", "']'",
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, "PI", "QINIT_KEY", "CREG_KEY", "Q_KEY", "C_KEY", "BARRIER_KEY", 
		"QGATE_KEY", "ENDQGATE_KEY", "ECHO_GATE", "H_GATE", "X_GATE", "NOT_GATE", 
		"T_GATE", "S_GATE", "Y_GATE", "Z_GATE", "X1_GATE", "Y1_GATE", "Z1_GATE", 
		"I_GATE", "U2_GATE", "RPHI_GATE", "U3_GATE", "U4_GATE", "RX_GATE", "RY_GATE", 
		"RZ_GATE", "U1_GATE", "CNOT_GATE", "CZ_GATE", "CU_GATE", "ISWAP_GATE", 
		"SQISWAP_GATE", "SWAPZ1_GATE", "ISWAPTHETA_GATE", "CR_GATE", "TOFFOLI_GATE", 
		"CP_GATE", "DAGGER_KEY", "ENDDAGGER_KEY", "CONTROL_KEY", "ENDCONTROL_KEY", 
		"QIF_KEY", "ELSE_KEY", "ENDIF_KEY", "QWHILE_KEY", "ENDQWHILE_KEY", "MEASURE_KEY", 
		"RESET_KEY", "ASSIGN", "GT", "LT", "NOT", "EQ", "LEQ", "GEQ", "NE", "AND", 
		"OR", "PLUS", "MINUS", "MUL", "DIV", "COMMA", "LPAREN", "RPAREN", "LBRACK", 
		"RBRACK", "NEWLINE", "Identifier", "Integer_Literal", "Double_Literal", 
		"Digit_Sequence", "REALEXP", "WhiteSpace", "SingleLineComment", "WS",
	];
	public static readonly VOCABULARY: Vocabulary = new VocabularyImpl(TodoLangGrammarParser._LITERAL_NAMES, TodoLangGrammarParser._SYMBOLIC_NAMES, []);

	// @Override
	// @NotNull
	public get vocabulary(): Vocabulary {
		return TodoLangGrammarParser.VOCABULARY;
	}
	// tslint:enable:no-trailing-whitespace

	// @Override
	public get grammarFileName(): string { return "TodoLangGrammar.g4"; }

	// @Override
	public get ruleNames(): string[] { return TodoLangGrammarParser.ruleNames; }

	// @Override
	public get serializedATN(): string { return TodoLangGrammarParser._serializedATN; }

	protected createFailedPredicateException(predicate?: string, message?: string): FailedPredicateException {
		return new FailedPredicateException(this, predicate, message);
	}


	    public gateList: { [key: string]: object; } = {"q": {}};
	    public qubitNum = 0;
	    public cbitNum = 0;
	    public currentGateName: string = "";
	    public key1 = "params";
	    public key2 = "arguments";
	    public inDagger = false;
	    public inControl = false;
	    public measureList: {[key: string]: number; } = {"a": 1};
	    public isValidKey(key: string , object: object): key is keyof typeof object {
				return key in object;
		}
	    public controlBit: {[key: string]: number; } = {};

	constructor(input: TokenStream) {
		super(input);
		this._interp = new ParserATNSimulator(TodoLangGrammarParser._ATN, this);
	}
	// @RuleVersion(0)
	public translationunit(): TranslationunitContext {
		let _localctx: TranslationunitContext = new TranslationunitContext(this._ctx, this.state);
		this.enterRule(_localctx, 0, TodoLangGrammarParser.RULE_translationunit);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 127;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === TodoLangGrammarParser.NEWLINE) {
				{
				{
				this.state = 124;
				this.match(TodoLangGrammarParser.NEWLINE);
				}
				}
				this.state = 129;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 133;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === TodoLangGrammarParser.QINIT_KEY || _la === TodoLangGrammarParser.CREG_KEY) {
				{
				{
				this.state = 130;
				this.declaration();
				}
				}
				this.state = 135;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 139;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 2, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 136;
					this.gate_func_statement();
					}
					}
				}
				this.state = 141;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 2, this._ctx);
			}
			this.state = 143;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				{
				this.state = 142;
				this.statement();
				}
				}
				this.state = 145;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << TodoLangGrammarParser.PI) | (1 << TodoLangGrammarParser.C_KEY) | (1 << TodoLangGrammarParser.BARRIER_KEY) | (1 << TodoLangGrammarParser.QGATE_KEY) | (1 << TodoLangGrammarParser.ECHO_GATE) | (1 << TodoLangGrammarParser.H_GATE) | (1 << TodoLangGrammarParser.X_GATE) | (1 << TodoLangGrammarParser.T_GATE) | (1 << TodoLangGrammarParser.S_GATE) | (1 << TodoLangGrammarParser.Y_GATE) | (1 << TodoLangGrammarParser.Z_GATE) | (1 << TodoLangGrammarParser.X1_GATE) | (1 << TodoLangGrammarParser.Y1_GATE) | (1 << TodoLangGrammarParser.Z1_GATE) | (1 << TodoLangGrammarParser.I_GATE) | (1 << TodoLangGrammarParser.U2_GATE) | (1 << TodoLangGrammarParser.RPHI_GATE) | (1 << TodoLangGrammarParser.U3_GATE) | (1 << TodoLangGrammarParser.U4_GATE) | (1 << TodoLangGrammarParser.RX_GATE) | (1 << TodoLangGrammarParser.RY_GATE) | (1 << TodoLangGrammarParser.RZ_GATE) | (1 << TodoLangGrammarParser.U1_GATE) | (1 << TodoLangGrammarParser.CNOT_GATE) | (1 << TodoLangGrammarParser.CZ_GATE) | (1 << TodoLangGrammarParser.CU_GATE))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (TodoLangGrammarParser.ISWAP_GATE - 32)) | (1 << (TodoLangGrammarParser.SQISWAP_GATE - 32)) | (1 << (TodoLangGrammarParser.SWAPZ1_GATE - 32)) | (1 << (TodoLangGrammarParser.ISWAPTHETA_GATE - 32)) | (1 << (TodoLangGrammarParser.CR_GATE - 32)) | (1 << (TodoLangGrammarParser.TOFFOLI_GATE - 32)) | (1 << (TodoLangGrammarParser.DAGGER_KEY - 32)) | (1 << (TodoLangGrammarParser.CONTROL_KEY - 32)) | (1 << (TodoLangGrammarParser.QIF_KEY - 32)) | (1 << (TodoLangGrammarParser.QWHILE_KEY - 32)) | (1 << (TodoLangGrammarParser.MEASURE_KEY - 32)) | (1 << (TodoLangGrammarParser.RESET_KEY - 32)) | (1 << (TodoLangGrammarParser.NOT - 32)) | (1 << (TodoLangGrammarParser.PLUS - 32)) | (1 << (TodoLangGrammarParser.MINUS - 32)))) !== 0) || ((((_la - 65)) & ~0x1F) === 0 && ((1 << (_la - 65)) & ((1 << (TodoLangGrammarParser.LPAREN - 65)) | (1 << (TodoLangGrammarParser.Identifier - 65)) | (1 << (TodoLangGrammarParser.Integer_Literal - 65)) | (1 << (TodoLangGrammarParser.Double_Literal - 65)))) !== 0));
			this.state = 147;
			this.match(TodoLangGrammarParser.EOF);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public declaration(): DeclarationContext {
		let _localctx: DeclarationContext = new DeclarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 2, TodoLangGrammarParser.RULE_declaration);
		try {
			this.state = 151;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case TodoLangGrammarParser.QINIT_KEY:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 149;
				this.qinit_declaration();
				}
				break;
			case TodoLangGrammarParser.CREG_KEY:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 150;
				this.cinit_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public qinit_declaration(): Qinit_declarationContext {
		let _localctx: Qinit_declarationContext = new Qinit_declarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 4, TodoLangGrammarParser.RULE_qinit_declaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 153;
			this.match(TodoLangGrammarParser.QINIT_KEY);
			this.state = 154;
			this.match(TodoLangGrammarParser.Integer_Literal);
			 
			    try {
			        this.qubitNum = parseInt(_localctx.Integer_Literal().text, 10);
			    } catch(err){
			        let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length,message: "grammar error"};
			        this.notifyErrorListeners(JSON.stringify(errorMsg));
			    }
			 
			this.state = 156;
			this.match(TodoLangGrammarParser.NEWLINE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public cinit_declaration(): Cinit_declarationContext {
		let _localctx: Cinit_declarationContext = new Cinit_declarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 6, TodoLangGrammarParser.RULE_cinit_declaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 158;
			this.match(TodoLangGrammarParser.CREG_KEY);
			this.state = 159;
			this.match(TodoLangGrammarParser.Integer_Literal);
			 this.cbitNum = parseInt(_localctx.Integer_Literal().text, 10); 
			this.state = 161;
			this.match(TodoLangGrammarParser.NEWLINE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public quantum_gate_declaration(): Quantum_gate_declarationContext {
		let _localctx: Quantum_gate_declarationContext = new Quantum_gate_declarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 8, TodoLangGrammarParser.RULE_quantum_gate_declaration);
		try {
			this.state = 173;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case TodoLangGrammarParser.ECHO_GATE:
			case TodoLangGrammarParser.H_GATE:
			case TodoLangGrammarParser.X_GATE:
			case TodoLangGrammarParser.T_GATE:
			case TodoLangGrammarParser.S_GATE:
			case TodoLangGrammarParser.Y_GATE:
			case TodoLangGrammarParser.Z_GATE:
			case TodoLangGrammarParser.X1_GATE:
			case TodoLangGrammarParser.Y1_GATE:
			case TodoLangGrammarParser.Z1_GATE:
			case TodoLangGrammarParser.I_GATE:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 163;
				this.single_gate_without_parameter_declaration();
				}
				break;
			case TodoLangGrammarParser.RX_GATE:
			case TodoLangGrammarParser.RY_GATE:
			case TodoLangGrammarParser.RZ_GATE:
			case TodoLangGrammarParser.U1_GATE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 164;
				this.single_gate_with_one_parameter_declaration();
				}
				break;
			case TodoLangGrammarParser.U2_GATE:
			case TodoLangGrammarParser.RPHI_GATE:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 165;
				this.single_gate_with_two_parameter_declaration();
				}
				break;
			case TodoLangGrammarParser.U3_GATE:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 166;
				this.single_gate_with_three_parameter_declaration();
				}
				break;
			case TodoLangGrammarParser.U4_GATE:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 167;
				this.single_gate_with_four_parameter_declaration();
				}
				break;
			case TodoLangGrammarParser.CNOT_GATE:
			case TodoLangGrammarParser.CZ_GATE:
			case TodoLangGrammarParser.ISWAP_GATE:
			case TodoLangGrammarParser.SQISWAP_GATE:
			case TodoLangGrammarParser.SWAPZ1_GATE:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 168;
				this.double_gate_without_parameter_declaration();
				}
				break;
			case TodoLangGrammarParser.ISWAPTHETA_GATE:
			case TodoLangGrammarParser.CR_GATE:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 169;
				this.double_gate_with_one_parameter_declaration();
				}
				break;
			case TodoLangGrammarParser.CU_GATE:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 170;
				this.double_gate_with_four_parameter_declaration();
				}
				break;
			case TodoLangGrammarParser.TOFFOLI_GATE:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 171;
				this.triple_gate_without_parameter_declaration();
				}
				break;
			case TodoLangGrammarParser.Identifier:
				this.enterOuterAlt(_localctx, 10);
				{
				this.state = 172;
				this.define_gate_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public index(): IndexContext {
		let _localctx: IndexContext = new IndexContext(this._ctx, this.state);
		this.enterRule(_localctx, 10, TodoLangGrammarParser.RULE_index);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 175;
			this.match(TodoLangGrammarParser.LBRACK);
			this.state = 176;
			this.match(TodoLangGrammarParser.Integer_Literal);
			this.state = 177;
			this.match(TodoLangGrammarParser.RBRACK);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public c_KEY_declaration(): C_KEY_declarationContext {
		let _localctx: C_KEY_declarationContext = new C_KEY_declarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 12, TodoLangGrammarParser.RULE_c_KEY_declaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 179;
			this.match(TodoLangGrammarParser.C_KEY);
			this.state = 180;
			this.index();
			 
			    try {
			        if (_localctx.index().Integer_Literal() != null){
			            let idx_num = parseInt(_localctx.index().Integer_Literal().text, 10);
			            if(idx_num > this.cbitNum - 1) {
			                let errorMsg = {start: _localctx.index().start.charPositionInLine, end: _localctx.index().start.charPositionInLine+_localctx.index().text.length,message: "index max " + this.cbitNum};
			                this.notifyErrorListeners(JSON.stringify(errorMsg));
			            } 
			        }
			    } catch(err) {
			        let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length,message: "grammar error"};
			        this.notifyErrorListeners(JSON.stringify(errorMsg));
			    }

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public q_KEY_declaration(): Q_KEY_declarationContext {
		let _localctx: Q_KEY_declarationContext = new Q_KEY_declarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 14, TodoLangGrammarParser.RULE_q_KEY_declaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 183;
			this.match(TodoLangGrammarParser.Q_KEY);
			this.state = 184;
			this.index();
			 
			    try {
			        if (_localctx.index().Integer_Literal() != null){
			            let idx_num = parseInt(_localctx.index().Integer_Literal().text, 10);
			            if(idx_num > this.qubitNum - 1) {
			                let errorMsg = {start: _localctx.index().start.charPositionInLine, end: _localctx.index().start.charPositionInLine+_localctx.index().text.length, message: "index max " + this.qubitNum};
			                this.notifyErrorListeners(JSON.stringify(errorMsg));
			            } 
			        }
			    } catch(err){
			        let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length,message: "grammar error"};
			        this.notifyErrorListeners(JSON.stringify(errorMsg));
			    }

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public single_gate_without_parameter_declaration(): Single_gate_without_parameter_declarationContext {
		let _localctx: Single_gate_without_parameter_declarationContext = new Single_gate_without_parameter_declarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 16, TodoLangGrammarParser.RULE_single_gate_without_parameter_declaration);
		try {
			this.state = 195;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 6, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 187;
				this.single_gate_without_parameter_type();
				this.state = 188;
				this.q_KEY_declaration();

				    if(this.controlBit.hasOwnProperty(_localctx.q_KEY_declaration()!.text)){
				        let errorMsg = {start: _localctx.q_KEY_declaration()!.start.charPositionInLine, end: _localctx.q_KEY_declaration()!.start.charPositionInLine+_localctx.q_KEY_declaration()!.text.length,message: "Duplicated register"};
				        this.notifyErrorListeners(JSON.stringify(errorMsg));
				    }

				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 191;
				this.single_gate_without_parameter_type();
				this.state = 192;
				this.match(TodoLangGrammarParser.Q_KEY);

				                                    if(this.controlBit.hasOwnProperty("q")){
				                                        let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length,message: "Duplicated register"};
				                                        this.notifyErrorListeners(JSON.stringify(errorMsg));
				                                    }
				                                
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public single_gate_with_one_parameter_declaration(): Single_gate_with_one_parameter_declarationContext {
		let _localctx: Single_gate_with_one_parameter_declarationContext = new Single_gate_with_one_parameter_declarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 18, TodoLangGrammarParser.RULE_single_gate_with_one_parameter_declaration);
		try {
			this.state = 213;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 7, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 197;
				this.single_gate_with_one_parameter_type();
				this.state = 198;
				this.q_KEY_declaration();
				this.state = 199;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 200;
				this.match(TodoLangGrammarParser.LPAREN);
				this.state = 201;
				this.constant_expression();
				this.state = 202;
				this.match(TodoLangGrammarParser.RPAREN);

				    if(this.controlBit.hasOwnProperty(_localctx.q_KEY_declaration()!.text)){
				        let errorMsg = {start: _localctx.q_KEY_declaration()!.start.charPositionInLine, end: _localctx.q_KEY_declaration()!.start.charPositionInLine+_localctx.q_KEY_declaration()!.text.length,message: "Duplicated register"};
				        this.notifyErrorListeners(JSON.stringify(errorMsg));
				    }

				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 205;
				this.single_gate_with_one_parameter_type();
				this.state = 206;
				this.match(TodoLangGrammarParser.Q_KEY);
				this.state = 207;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 208;
				this.match(TodoLangGrammarParser.LPAREN);
				this.state = 209;
				this.expression();
				this.state = 210;
				this.match(TodoLangGrammarParser.RPAREN);

				                                    if(this.controlBit.hasOwnProperty("q")){
				                                        let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length,message: "Duplicated register"};
				                                        this.notifyErrorListeners(JSON.stringify(errorMsg));
				                                    }
				                                
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public single_gate_with_two_parameter_declaration(): Single_gate_with_two_parameter_declarationContext {
		let _localctx: Single_gate_with_two_parameter_declarationContext = new Single_gate_with_two_parameter_declarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 20, TodoLangGrammarParser.RULE_single_gate_with_two_parameter_declaration);
		try {
			this.state = 235;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 8, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 215;
				this.single_gate_with_two_parameter_type();
				this.state = 216;
				this.q_KEY_declaration();
				this.state = 217;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 218;
				this.match(TodoLangGrammarParser.LPAREN);
				this.state = 219;
				this.constant_expression();
				this.state = 220;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 221;
				this.constant_expression();
				this.state = 222;
				this.match(TodoLangGrammarParser.RPAREN);

				    if(this.controlBit.hasOwnProperty(_localctx.q_KEY_declaration()!.text)){
				        let errorMsg = {start: _localctx.q_KEY_declaration()!.start.charPositionInLine, end: _localctx.q_KEY_declaration()!.start.charPositionInLine+_localctx.q_KEY_declaration()!.text.length,message: "Duplicated register"};
				        this.notifyErrorListeners(JSON.stringify(errorMsg));
				    }

				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 225;
				this.single_gate_with_two_parameter_type();
				this.state = 226;
				this.match(TodoLangGrammarParser.Q_KEY);
				this.state = 227;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 228;
				this.match(TodoLangGrammarParser.LPAREN);
				this.state = 229;
				this.constant_expression();
				this.state = 230;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 231;
				this.constant_expression();
				this.state = 232;
				this.match(TodoLangGrammarParser.RPAREN);

				                                    if(this.controlBit.hasOwnProperty("q")){
				                                        let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length,message: "Duplicated register"};
				                                        this.notifyErrorListeners(JSON.stringify(errorMsg));
				                                    }
				                                
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public single_gate_with_three_parameter_declaration(): Single_gate_with_three_parameter_declarationContext {
		let _localctx: Single_gate_with_three_parameter_declarationContext = new Single_gate_with_three_parameter_declarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 22, TodoLangGrammarParser.RULE_single_gate_with_three_parameter_declaration);
		try {
			this.state = 261;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 9, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 237;
				this.single_gate_with_three_parameter_type();
				this.state = 238;
				this.q_KEY_declaration();
				this.state = 239;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 240;
				this.match(TodoLangGrammarParser.LPAREN);
				this.state = 241;
				this.constant_expression();
				this.state = 242;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 243;
				this.constant_expression();
				this.state = 244;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 245;
				this.constant_expression();
				this.state = 246;
				this.match(TodoLangGrammarParser.RPAREN);

				    if(this.controlBit.hasOwnProperty(_localctx.q_KEY_declaration()!.text)){
				        let errorMsg = {start: _localctx.q_KEY_declaration()!.start.charPositionInLine, end: _localctx.q_KEY_declaration()!.start.charPositionInLine+_localctx.q_KEY_declaration()!.text.length,message: "Duplicated register"};
				        this.notifyErrorListeners(JSON.stringify(errorMsg));
				    }

				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 249;
				this.single_gate_with_three_parameter_type();
				this.state = 250;
				this.match(TodoLangGrammarParser.Q_KEY);
				this.state = 251;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 252;
				this.match(TodoLangGrammarParser.LPAREN);
				this.state = 253;
				this.constant_expression();
				this.state = 254;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 255;
				this.constant_expression();
				this.state = 256;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 257;
				this.constant_expression();
				this.state = 258;
				this.match(TodoLangGrammarParser.RPAREN);

				                                    if(this.controlBit.hasOwnProperty("q")){
				                                        let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length,message: "Duplicated register"};
				                                        this.notifyErrorListeners(JSON.stringify(errorMsg));
				                                    }
				                                
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public single_gate_with_four_parameter_declaration(): Single_gate_with_four_parameter_declarationContext {
		let _localctx: Single_gate_with_four_parameter_declarationContext = new Single_gate_with_four_parameter_declarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 24, TodoLangGrammarParser.RULE_single_gate_with_four_parameter_declaration);
		try {
			this.state = 291;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 10, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 263;
				this.single_gate_with_four_parameter_type();
				this.state = 264;
				this.q_KEY_declaration();
				this.state = 265;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 266;
				this.match(TodoLangGrammarParser.LPAREN);
				this.state = 267;
				this.constant_expression();
				this.state = 268;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 269;
				this.constant_expression();
				this.state = 270;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 271;
				this.constant_expression();
				this.state = 272;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 273;
				this.constant_expression();
				this.state = 274;
				this.match(TodoLangGrammarParser.RPAREN);

				    if(this.controlBit.hasOwnProperty(_localctx.q_KEY_declaration()!.text)){
				        let errorMsg = {start: _localctx.q_KEY_declaration()!.start.charPositionInLine, end: _localctx.q_KEY_declaration()!.start.charPositionInLine+_localctx.q_KEY_declaration()!.text.length,message: "Duplicated register"};
				        this.notifyErrorListeners(JSON.stringify(errorMsg));
				    }

				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 277;
				this.single_gate_with_four_parameter_type();
				this.state = 278;
				this.match(TodoLangGrammarParser.Q_KEY);
				this.state = 279;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 280;
				this.match(TodoLangGrammarParser.LPAREN);
				this.state = 281;
				this.constant_expression();
				this.state = 282;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 283;
				this.constant_expression();
				this.state = 284;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 285;
				this.constant_expression();
				this.state = 286;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 287;
				this.constant_expression();
				this.state = 288;
				this.match(TodoLangGrammarParser.RPAREN);

				                                    if(this.controlBit.hasOwnProperty("q")){
				                                        let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length,message: "Duplicated register"};
				                                        this.notifyErrorListeners(JSON.stringify(errorMsg));
				                                    }
				                                
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public double_gate_without_parameter_declaration(): Double_gate_without_parameter_declarationContext {
		let _localctx: Double_gate_without_parameter_declarationContext = new Double_gate_without_parameter_declarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 26, TodoLangGrammarParser.RULE_double_gate_without_parameter_declaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 293;
			this.double_gate_without_parameter_type();
			this.state = 294;
			this.q_KEY_declaration();
			this.state = 295;
			this.match(TodoLangGrammarParser.COMMA);
			this.state = 296;
			this.q_KEY_declaration();

			    if (_localctx.q_KEY_declaration(0).text == _localctx.q_KEY_declaration(1).text){
			        let errorMsg = {start: _localctx.q_KEY_declaration(0).start.charPositionInLine, end: _localctx.q_KEY_declaration(1).start.charPositionInLine+_localctx.q_KEY_declaration(1).text.length,message: "Duplicated register"};
			        this.notifyErrorListeners(JSON.stringify(errorMsg));
			    }
			    if (this.controlBit.hasOwnProperty(_localctx.q_KEY_declaration(0).text)){
			        let errorMsg = {start: _localctx.q_KEY_declaration(0).start.charPositionInLine, end: _localctx.q_KEY_declaration(0).start.charPositionInLine+_localctx.q_KEY_declaration(0).text.length,message: "Duplicated register"};
			        this.notifyErrorListeners(JSON.stringify(errorMsg));
			    }
			    if (this.controlBit.hasOwnProperty(_localctx.q_KEY_declaration(1).text)){
			        let errorMsg = {start: _localctx.q_KEY_declaration(1).start.charPositionInLine, end: _localctx.q_KEY_declaration(1).start.charPositionInLine+_localctx.q_KEY_declaration(1).text.length,message: "Duplicated register"};
			        this.notifyErrorListeners(JSON.stringify(errorMsg));
			    }

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public double_gate_with_one_parameter_declaration(): Double_gate_with_one_parameter_declarationContext {
		let _localctx: Double_gate_with_one_parameter_declarationContext = new Double_gate_with_one_parameter_declarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 28, TodoLangGrammarParser.RULE_double_gate_with_one_parameter_declaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 299;
			this.double_gate_with_one_parameter_type();
			this.state = 300;
			this.q_KEY_declaration();
			this.state = 301;
			this.match(TodoLangGrammarParser.COMMA);
			this.state = 302;
			this.q_KEY_declaration();
			this.state = 303;
			this.match(TodoLangGrammarParser.COMMA);
			this.state = 304;
			this.match(TodoLangGrammarParser.LPAREN);
			this.state = 305;
			this.constant_expression();
			this.state = 306;
			this.match(TodoLangGrammarParser.RPAREN);

			    if (_localctx.q_KEY_declaration(0).text == _localctx.q_KEY_declaration(1).text) {
			        let errorMsg = {start: _localctx.q_KEY_declaration(0).start.charPositionInLine, end: _localctx.q_KEY_declaration(1).start.charPositionInLine+_localctx.q_KEY_declaration(1).text.length,message: "Duplicated register"};
			        this.notifyErrorListeners(JSON.stringify(errorMsg));
			    }
			    if (this.controlBit.hasOwnProperty(_localctx.q_KEY_declaration(0).text)) {
			        let errorMsg = {start: _localctx.q_KEY_declaration(0).start.charPositionInLine, end: _localctx.q_KEY_declaration(0).start.charPositionInLine+_localctx.q_KEY_declaration(0).text.length,message: "Duplicated register"};
			        this.notifyErrorListeners(JSON.stringify(errorMsg));
			    }
			    if (this.controlBit.hasOwnProperty(_localctx.q_KEY_declaration(1).text)) {
			        let errorMsg = {start: _localctx.q_KEY_declaration(1).start.charPositionInLine, end: _localctx.q_KEY_declaration(1).start.charPositionInLine+_localctx.q_KEY_declaration(1).text.length,message: "Duplicated register"};
			        this.notifyErrorListeners(JSON.stringify(errorMsg));
			    }

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public double_gate_with_four_parameter_declaration(): Double_gate_with_four_parameter_declarationContext {
		let _localctx: Double_gate_with_four_parameter_declarationContext = new Double_gate_with_four_parameter_declarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 30, TodoLangGrammarParser.RULE_double_gate_with_four_parameter_declaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 309;
			this.double_gate_with_four_parameter_type();
			this.state = 310;
			this.q_KEY_declaration();
			this.state = 311;
			this.match(TodoLangGrammarParser.COMMA);
			this.state = 312;
			this.q_KEY_declaration();
			this.state = 313;
			this.match(TodoLangGrammarParser.COMMA);
			this.state = 314;
			this.match(TodoLangGrammarParser.LPAREN);
			this.state = 315;
			this.constant_expression();
			this.state = 316;
			this.match(TodoLangGrammarParser.COMMA);
			this.state = 317;
			this.constant_expression();
			this.state = 318;
			this.match(TodoLangGrammarParser.COMMA);
			this.state = 319;
			this.constant_expression();
			this.state = 320;
			this.match(TodoLangGrammarParser.COMMA);
			this.state = 321;
			this.constant_expression();
			this.state = 322;
			this.match(TodoLangGrammarParser.RPAREN);

			    if (_localctx.q_KEY_declaration(0).text == _localctx.q_KEY_declaration(1).text) {
			        let errorMsg = {start: _localctx.q_KEY_declaration(0).start.charPositionInLine, end: _localctx.q_KEY_declaration(1).start.charPositionInLine+_localctx.q_KEY_declaration(1).text.length,message: "Duplicated register"};
			        this.notifyErrorListeners(JSON.stringify(errorMsg));
			    }
			    if (this.controlBit.hasOwnProperty(_localctx.q_KEY_declaration(0).text)) {
			        let errorMsg = {start: _localctx.q_KEY_declaration(0).start.charPositionInLine, end: _localctx.q_KEY_declaration(0).start.charPositionInLine+_localctx.q_KEY_declaration(0).text.length,message: "Duplicated register"};
			        this.notifyErrorListeners(JSON.stringify(errorMsg));
			    }
			    if (this.controlBit.hasOwnProperty(_localctx.q_KEY_declaration(1).text)) {
			        let errorMsg = {start: _localctx.q_KEY_declaration(1).start.charPositionInLine, end: _localctx.q_KEY_declaration(1).start.charPositionInLine+_localctx.q_KEY_declaration(1).text.length,message: "Duplicated register"};
			        this.notifyErrorListeners(JSON.stringify(errorMsg));
			    }

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public triple_gate_without_parameter_declaration(): Triple_gate_without_parameter_declarationContext {
		let _localctx: Triple_gate_without_parameter_declarationContext = new Triple_gate_without_parameter_declarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 32, TodoLangGrammarParser.RULE_triple_gate_without_parameter_declaration);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 325;
			this.triple_gate_without_parameter_type();
			this.state = 326;
			this.q_KEY_declaration();
			this.state = 327;
			this.match(TodoLangGrammarParser.COMMA);
			this.state = 328;
			this.q_KEY_declaration();
			this.state = 329;
			this.match(TodoLangGrammarParser.COMMA);
			this.state = 330;
			this.q_KEY_declaration();

			    if (_localctx.q_KEY_declaration(0).text == _localctx.q_KEY_declaration(1).text) {
			        let errorMsg = {start: _localctx.q_KEY_declaration(0).start.charPositionInLine, end: _localctx.q_KEY_declaration(1).start.charPositionInLine+_localctx.q_KEY_declaration(1).text.length,message: "Duplicated register"};
			        this.notifyErrorListeners(JSON.stringify(errorMsg));
			    }
			    if (_localctx.q_KEY_declaration(0).text == _localctx.q_KEY_declaration(2).text) {
			        let errorMsg = {start: _localctx.q_KEY_declaration(0).start.charPositionInLine, end: _localctx.q_KEY_declaration(2).start.charPositionInLine+_localctx.q_KEY_declaration(2).text.length,message: "Duplicated register"};
			        this.notifyErrorListeners(JSON.stringify(errorMsg));
			    }
			    if (_localctx.q_KEY_declaration(1).text == _localctx.q_KEY_declaration(2).text) {
			        let errorMsg = {start: _localctx.q_KEY_declaration(1).start.charPositionInLine, end: _localctx.q_KEY_declaration(2).start.charPositionInLine+_localctx.q_KEY_declaration(2).text.length,message: "Duplicated register"};
			        this.notifyErrorListeners(JSON.stringify(errorMsg));
			    }
			    if (this.controlBit.hasOwnProperty(_localctx.q_KEY_declaration(0).text)) {
			        let errorMsg = {start: _localctx.q_KEY_declaration(0).start.charPositionInLine, end: _localctx.q_KEY_declaration(0).start.charPositionInLine+_localctx.q_KEY_declaration(0).text.length,message: "Duplicated register"};
			        this.notifyErrorListeners(JSON.stringify(errorMsg));
			    }
			    if (this.controlBit.hasOwnProperty(_localctx.q_KEY_declaration(1).text)) {
			        let errorMsg = {start: _localctx.q_KEY_declaration(1).start.charPositionInLine, end: _localctx.q_KEY_declaration(1).start.charPositionInLine+_localctx.q_KEY_declaration(1).text.length,message: "Duplicated register"};
			        this.notifyErrorListeners(JSON.stringify(errorMsg));
			    }
			    if (this.controlBit.hasOwnProperty(_localctx.q_KEY_declaration(2).text)) {
			        let errorMsg = {start: _localctx.q_KEY_declaration(2).start.charPositionInLine, end: _localctx.q_KEY_declaration(2).start.charPositionInLine+_localctx.q_KEY_declaration(2).text.length,message: "Duplicated register"};
			        this.notifyErrorListeners(JSON.stringify(errorMsg));
			    }

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public define_gate_declaration(): Define_gate_declarationContext {
		let _localctx: Define_gate_declarationContext = new Define_gate_declarationContext(this._ctx, this.state);
		this.enterRule(_localctx, 34, TodoLangGrammarParser.RULE_define_gate_declaration);
		let _la: number;
		try {
			let _alt: number;
			this.state = 366;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 14, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 333;
				this.id();
				this.state = 334;
				_localctx._q_KEY_declaration = this.q_KEY_declaration();
				_localctx._argument_list.push(_localctx._q_KEY_declaration);
				this.state = 339;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === TodoLangGrammarParser.COMMA) {
					{
					{
					this.state = 335;
					this.match(TodoLangGrammarParser.COMMA);
					this.state = 336;
					_localctx._q_KEY_declaration = this.q_KEY_declaration();
					_localctx._argument_list.push(_localctx._q_KEY_declaration);
					}
					}
					this.state = 341;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}

				    let gate_text = _localctx.id().text;
				    if(!this.gateList.hasOwnProperty(gate_text)){
				        let errorMsg = {start: _localctx.id().start.charPositionInLine, end: _localctx.id().start.charPositionInLine+_localctx.id().text.length,message: "Gate " + gate_text + " is not defined"};
				        this.notifyErrorListeners(JSON.stringify(errorMsg));
				    } else {
				        let param_len = _localctx._argument_list.length;
				        let now_gate = this.gateList[gate_text];
				        if(this.isValidKey(this.key1, now_gate)){
				            let params: object = now_gate[this.key1];
				            let arg_len = Object.keys(params).length;
				            if(param_len != arg_len){
				                let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length, message: "Gate call to " + gate_text + " expect " + arg_len + " qubit but found " + param_len};
				                this.notifyErrorListeners(JSON.stringify(errorMsg));
				            }
				        }
				        let parameters = _localctx._argument_list;
				        let paramMap: {[key: string]: number; } = {};
				        for(let i = 0; i < parameters.length; i++){
				            let txt = parameters[i].text;
				            if(paramMap.hasOwnProperty(txt)){
				                let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length, message: "Duplicated register"};
				                this.notifyErrorListeners(JSON.stringify(errorMsg));
				            }
				            paramMap[txt] = 1;
				        }
				    }


				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 344;
				this.id();
				this.state = 345;
				_localctx._q_KEY_declaration = this.q_KEY_declaration();
				_localctx._argument_list.push(_localctx._q_KEY_declaration);
				this.state = 350;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 12, this._ctx);
				while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
					if (_alt === 1) {
						{
						{
						this.state = 346;
						this.match(TodoLangGrammarParser.COMMA);
						this.state = 347;
						_localctx._q_KEY_declaration = this.q_KEY_declaration();
						_localctx._argument_list.push(_localctx._q_KEY_declaration);
						}
						}
					}
					this.state = 352;
					this._errHandler.sync(this);
					_alt = this.interpreter.adaptivePredict(this._input, 12, this._ctx);
				}
				this.state = 353;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 354;
				this.match(TodoLangGrammarParser.LPAREN);
				this.state = 355;
				_localctx._constant_expression = this.constant_expression();
				_localctx._angle_list.push(_localctx._constant_expression);
				this.state = 360;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === TodoLangGrammarParser.COMMA) {
					{
					{
					this.state = 356;
					this.match(TodoLangGrammarParser.COMMA);
					this.state = 357;
					_localctx._constant_expression = this.constant_expression();
					_localctx._angle_list.push(_localctx._constant_expression);
					}
					}
					this.state = 362;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 363;
				this.match(TodoLangGrammarParser.RPAREN);

				                            let gate_text = _localctx.id().text;
				                            if(!this.gateList.hasOwnProperty(gate_text)){
				                                let errorMsg = {start: _localctx.id().start.charPositionInLine, end: _localctx.id().start.charPositionInLine+_localctx.id().text.length, message: "Gate " + gate_text + " is not defined"};
				                                this.notifyErrorListeners(JSON.stringify(errorMsg));
				                            } else {
				                                let param_len = _localctx._argument_list.length;
				                                let angle_len = _localctx._angle_list.length;
				                                let now_gate = this.gateList[gate_text];
				                                if(this.isValidKey(this.key1, now_gate)){
				                                    let params: object = now_gate[this.key1];
				                                    let arg_len = Object.keys(params).length;
				                                    if(param_len != arg_len){
				                                        let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine + _localctx.text.length, message: "Gate call to " + gate_text + " expect " + arg_len + " qubit but found " + param_len};
				                                        this.notifyErrorListeners(JSON.stringify(errorMsg));
				                                    }
				                                }
				                                if(now_gate[this.key2] != null){
				                                    let params: object = now_gate[this.key1];
				                                    let arg_len = Object.keys(params).length;
				                                    if(angle_len != arg_len){
				                                        let errorMsg = {start: _localctx.start.charPositionInLine, end:_localctx.start.charPositionInLine+_localctx.text.length,  message: "Gate call to " + gate_text + " expect " + arg_len + " parameter but found " + angle_len};
				                                        this.notifyErrorListeners(JSON.stringify(errorMsg));
				                                    }
				                                } else {
				                                    let errorMsg = {start: _localctx.start.charPositionInLine, end:_localctx.start.charPositionInLine+_localctx.text.length, message: "Gate call to " + gate_text + " don't expect angle parameter"};
				                                    this.notifyErrorListeners(JSON.stringify(errorMsg));
				                                }
				                                let parameters = _localctx._argument_list;
				                                let paramMap: {[key: string]: number; } = {};
				                                for(let i = 0; i < parameters.length; i++){
				                                    let txt = parameters[i].text;
				                                    if(paramMap.hasOwnProperty(txt)){
				                                        let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length, message: "Duplicated register"};
				                                        this.notifyErrorListeners(JSON.stringify(errorMsg));
				                                    }
				                                    paramMap[txt] = 1;
				                                }
				                            }
				                       
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public single_gate_without_parameter_type(): Single_gate_without_parameter_typeContext {
		let _localctx: Single_gate_without_parameter_typeContext = new Single_gate_without_parameter_typeContext(this._ctx, this.state);
		this.enterRule(_localctx, 36, TodoLangGrammarParser.RULE_single_gate_without_parameter_type);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 368;
			_la = this._input.LA(1);
			if (!((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << TodoLangGrammarParser.ECHO_GATE) | (1 << TodoLangGrammarParser.H_GATE) | (1 << TodoLangGrammarParser.X_GATE) | (1 << TodoLangGrammarParser.T_GATE) | (1 << TodoLangGrammarParser.S_GATE) | (1 << TodoLangGrammarParser.Y_GATE) | (1 << TodoLangGrammarParser.Z_GATE) | (1 << TodoLangGrammarParser.X1_GATE) | (1 << TodoLangGrammarParser.Y1_GATE) | (1 << TodoLangGrammarParser.Z1_GATE) | (1 << TodoLangGrammarParser.I_GATE))) !== 0))) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public single_gate_with_one_parameter_type(): Single_gate_with_one_parameter_typeContext {
		let _localctx: Single_gate_with_one_parameter_typeContext = new Single_gate_with_one_parameter_typeContext(this._ctx, this.state);
		this.enterRule(_localctx, 38, TodoLangGrammarParser.RULE_single_gate_with_one_parameter_type);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 370;
			_la = this._input.LA(1);
			if (!((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << TodoLangGrammarParser.RX_GATE) | (1 << TodoLangGrammarParser.RY_GATE) | (1 << TodoLangGrammarParser.RZ_GATE) | (1 << TodoLangGrammarParser.U1_GATE))) !== 0))) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public single_gate_with_two_parameter_type(): Single_gate_with_two_parameter_typeContext {
		let _localctx: Single_gate_with_two_parameter_typeContext = new Single_gate_with_two_parameter_typeContext(this._ctx, this.state);
		this.enterRule(_localctx, 40, TodoLangGrammarParser.RULE_single_gate_with_two_parameter_type);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 372;
			_la = this._input.LA(1);
			if (!(_la === TodoLangGrammarParser.U2_GATE || _la === TodoLangGrammarParser.RPHI_GATE)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public single_gate_with_three_parameter_type(): Single_gate_with_three_parameter_typeContext {
		let _localctx: Single_gate_with_three_parameter_typeContext = new Single_gate_with_three_parameter_typeContext(this._ctx, this.state);
		this.enterRule(_localctx, 42, TodoLangGrammarParser.RULE_single_gate_with_three_parameter_type);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 374;
			this.match(TodoLangGrammarParser.U3_GATE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public single_gate_with_four_parameter_type(): Single_gate_with_four_parameter_typeContext {
		let _localctx: Single_gate_with_four_parameter_typeContext = new Single_gate_with_four_parameter_typeContext(this._ctx, this.state);
		this.enterRule(_localctx, 44, TodoLangGrammarParser.RULE_single_gate_with_four_parameter_type);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 376;
			this.match(TodoLangGrammarParser.U4_GATE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public double_gate_without_parameter_type(): Double_gate_without_parameter_typeContext {
		let _localctx: Double_gate_without_parameter_typeContext = new Double_gate_without_parameter_typeContext(this._ctx, this.state);
		this.enterRule(_localctx, 46, TodoLangGrammarParser.RULE_double_gate_without_parameter_type);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 378;
			_la = this._input.LA(1);
			if (!(((((_la - 29)) & ~0x1F) === 0 && ((1 << (_la - 29)) & ((1 << (TodoLangGrammarParser.CNOT_GATE - 29)) | (1 << (TodoLangGrammarParser.CZ_GATE - 29)) | (1 << (TodoLangGrammarParser.ISWAP_GATE - 29)) | (1 << (TodoLangGrammarParser.SQISWAP_GATE - 29)) | (1 << (TodoLangGrammarParser.SWAPZ1_GATE - 29)))) !== 0))) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public double_gate_with_one_parameter_type(): Double_gate_with_one_parameter_typeContext {
		let _localctx: Double_gate_with_one_parameter_typeContext = new Double_gate_with_one_parameter_typeContext(this._ctx, this.state);
		this.enterRule(_localctx, 48, TodoLangGrammarParser.RULE_double_gate_with_one_parameter_type);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 380;
			_la = this._input.LA(1);
			if (!(_la === TodoLangGrammarParser.ISWAPTHETA_GATE || _la === TodoLangGrammarParser.CR_GATE)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public double_gate_with_four_parameter_type(): Double_gate_with_four_parameter_typeContext {
		let _localctx: Double_gate_with_four_parameter_typeContext = new Double_gate_with_four_parameter_typeContext(this._ctx, this.state);
		this.enterRule(_localctx, 50, TodoLangGrammarParser.RULE_double_gate_with_four_parameter_type);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 382;
			this.match(TodoLangGrammarParser.CU_GATE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public triple_gate_without_parameter_type(): Triple_gate_without_parameter_typeContext {
		let _localctx: Triple_gate_without_parameter_typeContext = new Triple_gate_without_parameter_typeContext(this._ctx, this.state);
		this.enterRule(_localctx, 52, TodoLangGrammarParser.RULE_triple_gate_without_parameter_type);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 384;
			this.match(TodoLangGrammarParser.TOFFOLI_GATE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public primary_expression(): Primary_expressionContext {
		let _localctx: Primary_expressionContext = new Primary_expressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 54, TodoLangGrammarParser.RULE_primary_expression);
		try {
			this.state = 392;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case TodoLangGrammarParser.C_KEY:
				_localctx = new Pri_ckeyContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 386;
				this.c_KEY_declaration();
				}
				break;
			case TodoLangGrammarParser.PI:
			case TodoLangGrammarParser.Integer_Literal:
			case TodoLangGrammarParser.Double_Literal:
				_localctx = new Pri_cstContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 387;
				this.constant();
				}
				break;
			case TodoLangGrammarParser.LPAREN:
				_localctx = new Pri_exprContext(_localctx);
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 388;
				this.match(TodoLangGrammarParser.LPAREN);
				this.state = 389;
				this.expression();
				this.state = 390;
				this.match(TodoLangGrammarParser.LPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public unary_expression(): Unary_expressionContext {
		let _localctx: Unary_expressionContext = new Unary_expressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 56, TodoLangGrammarParser.RULE_unary_expression);
		try {
			this.state = 401;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case TodoLangGrammarParser.PI:
			case TodoLangGrammarParser.C_KEY:
			case TodoLangGrammarParser.LPAREN:
			case TodoLangGrammarParser.Integer_Literal:
			case TodoLangGrammarParser.Double_Literal:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 394;
				this.primary_expression();
				}
				break;
			case TodoLangGrammarParser.PLUS:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 395;
				this.match(TodoLangGrammarParser.PLUS);
				this.state = 396;
				this.primary_expression();
				}
				break;
			case TodoLangGrammarParser.MINUS:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 397;
				this.match(TodoLangGrammarParser.MINUS);
				this.state = 398;
				this.primary_expression();
				}
				break;
			case TodoLangGrammarParser.NOT:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 399;
				this.match(TodoLangGrammarParser.NOT);
				this.state = 400;
				this.primary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public multiplicative_expression(): Multiplicative_expressionContext;
	public multiplicative_expression(_p: number): Multiplicative_expressionContext;
	// @RuleVersion(0)
	public multiplicative_expression(_p?: number): Multiplicative_expressionContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: Multiplicative_expressionContext = new Multiplicative_expressionContext(this._ctx, _parentState);
		let _prevctx: Multiplicative_expressionContext = _localctx;
		let _startState: number = 58;
		this.enterRecursionRule(_localctx, 58, TodoLangGrammarParser.RULE_multiplicative_expression, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 404;
			this.unary_expression();
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 416;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 18, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 414;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 17, this._ctx) ) {
					case 1:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, TodoLangGrammarParser.RULE_multiplicative_expression);
						this.state = 406;
						if (!(this.precpred(this._ctx, 2))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 2)");
						}
						this.state = 407;
						this.match(TodoLangGrammarParser.MUL);
						this.state = 408;
						this.unary_expression();
						}
						break;

					case 2:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, TodoLangGrammarParser.RULE_multiplicative_expression);
						this.state = 409;
						if (!(this.precpred(this._ctx, 1))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
						}
						this.state = 410;
						this.match(TodoLangGrammarParser.DIV);
						this.state = 411;
						_localctx._denominator = this.unary_expression();

						                                       if (_localctx._denominator.text === '0') {
						                                          let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length, message: "The denominator cannot be zero"};
						                                          this.notifyErrorListeners(JSON.stringify(errorMsg));
						                                       }
						                                   
						}
						break;
					}
					}
				}
				this.state = 418;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 18, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public addtive_expression(): Addtive_expressionContext;
	public addtive_expression(_p: number): Addtive_expressionContext;
	// @RuleVersion(0)
	public addtive_expression(_p?: number): Addtive_expressionContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: Addtive_expressionContext = new Addtive_expressionContext(this._ctx, _parentState);
		let _prevctx: Addtive_expressionContext = _localctx;
		let _startState: number = 60;
		this.enterRecursionRule(_localctx, 60, TodoLangGrammarParser.RULE_addtive_expression, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 420;
			this.multiplicative_expression(0);
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 430;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 20, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 428;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 19, this._ctx) ) {
					case 1:
						{
						_localctx = new Addtive_expressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, TodoLangGrammarParser.RULE_addtive_expression);
						this.state = 422;
						if (!(this.precpred(this._ctx, 2))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 2)");
						}
						this.state = 423;
						this.match(TodoLangGrammarParser.PLUS);
						this.state = 424;
						this.multiplicative_expression(0);
						}
						break;

					case 2:
						{
						_localctx = new Addtive_expressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, TodoLangGrammarParser.RULE_addtive_expression);
						this.state = 425;
						if (!(this.precpred(this._ctx, 1))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
						}
						this.state = 426;
						this.match(TodoLangGrammarParser.MINUS);
						this.state = 427;
						this.multiplicative_expression(0);
						}
						break;
					}
					}
				}
				this.state = 432;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 20, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public relational_expression(): Relational_expressionContext;
	public relational_expression(_p: number): Relational_expressionContext;
	// @RuleVersion(0)
	public relational_expression(_p?: number): Relational_expressionContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: Relational_expressionContext = new Relational_expressionContext(this._ctx, _parentState);
		let _prevctx: Relational_expressionContext = _localctx;
		let _startState: number = 62;
		this.enterRecursionRule(_localctx, 62, TodoLangGrammarParser.RULE_relational_expression, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 434;
			this.addtive_expression(0);
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 450;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 22, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 448;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 21, this._ctx) ) {
					case 1:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, TodoLangGrammarParser.RULE_relational_expression);
						this.state = 436;
						if (!(this.precpred(this._ctx, 4))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 4)");
						}
						this.state = 437;
						this.match(TodoLangGrammarParser.LT);
						this.state = 438;
						this.addtive_expression(0);
						}
						break;

					case 2:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, TodoLangGrammarParser.RULE_relational_expression);
						this.state = 439;
						if (!(this.precpred(this._ctx, 3))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 3)");
						}
						this.state = 440;
						this.match(TodoLangGrammarParser.GT);
						this.state = 441;
						this.addtive_expression(0);
						}
						break;

					case 3:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, TodoLangGrammarParser.RULE_relational_expression);
						this.state = 442;
						if (!(this.precpred(this._ctx, 2))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 2)");
						}
						this.state = 443;
						this.match(TodoLangGrammarParser.LEQ);
						this.state = 444;
						this.addtive_expression(0);
						}
						break;

					case 4:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, TodoLangGrammarParser.RULE_relational_expression);
						this.state = 445;
						if (!(this.precpred(this._ctx, 1))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
						}
						this.state = 446;
						this.match(TodoLangGrammarParser.GEQ);
						this.state = 447;
						this.addtive_expression(0);
						}
						break;
					}
					}
				}
				this.state = 452;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 22, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public equality_expression(): Equality_expressionContext;
	public equality_expression(_p: number): Equality_expressionContext;
	// @RuleVersion(0)
	public equality_expression(_p?: number): Equality_expressionContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: Equality_expressionContext = new Equality_expressionContext(this._ctx, _parentState);
		let _prevctx: Equality_expressionContext = _localctx;
		let _startState: number = 64;
		this.enterRecursionRule(_localctx, 64, TodoLangGrammarParser.RULE_equality_expression, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 454;
			this.relational_expression(0);
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 464;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 24, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 462;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 23, this._ctx) ) {
					case 1:
						{
						_localctx = new Equality_expressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, TodoLangGrammarParser.RULE_equality_expression);
						this.state = 456;
						if (!(this.precpred(this._ctx, 2))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 2)");
						}
						this.state = 457;
						this.match(TodoLangGrammarParser.EQ);
						this.state = 458;
						this.relational_expression(0);
						}
						break;

					case 2:
						{
						_localctx = new Equality_expressionContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, TodoLangGrammarParser.RULE_equality_expression);
						this.state = 459;
						if (!(this.precpred(this._ctx, 1))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
						}
						this.state = 460;
						this.match(TodoLangGrammarParser.NE);
						this.state = 461;
						this.relational_expression(0);
						}
						break;
					}
					}
				}
				this.state = 466;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 24, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public logical_and_expression(): Logical_and_expressionContext;
	public logical_and_expression(_p: number): Logical_and_expressionContext;
	// @RuleVersion(0)
	public logical_and_expression(_p?: number): Logical_and_expressionContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: Logical_and_expressionContext = new Logical_and_expressionContext(this._ctx, _parentState);
		let _prevctx: Logical_and_expressionContext = _localctx;
		let _startState: number = 66;
		this.enterRecursionRule(_localctx, 66, TodoLangGrammarParser.RULE_logical_and_expression, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 468;
			this.equality_expression(0);
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 475;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 25, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_and_expressionContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, TodoLangGrammarParser.RULE_logical_and_expression);
					this.state = 470;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 471;
					this.match(TodoLangGrammarParser.AND);
					this.state = 472;
					this.equality_expression(0);
					}
					}
				}
				this.state = 477;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 25, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public logical_or_expression(): Logical_or_expressionContext;
	public logical_or_expression(_p: number): Logical_or_expressionContext;
	// @RuleVersion(0)
	public logical_or_expression(_p?: number): Logical_or_expressionContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: Logical_or_expressionContext = new Logical_or_expressionContext(this._ctx, _parentState);
		let _prevctx: Logical_or_expressionContext = _localctx;
		let _startState: number = 68;
		this.enterRecursionRule(_localctx, 68, TodoLangGrammarParser.RULE_logical_or_expression, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			{
			this.state = 479;
			this.logical_and_expression(0);
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 486;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 26, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_or_expressionContext(_parentctx, _parentState);
					this.pushNewRecursionContext(_localctx, _startState, TodoLangGrammarParser.RULE_logical_or_expression);
					this.state = 481;
					if (!(this.precpred(this._ctx, 1))) {
						throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
					}
					this.state = 482;
					this.match(TodoLangGrammarParser.OR);
					this.state = 483;
					this.logical_and_expression(0);
					}
					}
				}
				this.state = 488;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 26, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public assignment_expression(): Assignment_expressionContext {
		let _localctx: Assignment_expressionContext = new Assignment_expressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 70, TodoLangGrammarParser.RULE_assignment_expression);
		try {
			this.state = 494;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 27, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 489;
				this.logical_or_expression(0);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 490;
				this.c_KEY_declaration();
				this.state = 491;
				this.match(TodoLangGrammarParser.ASSIGN);
				this.state = 492;
				this.logical_or_expression(0);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public expression(): ExpressionContext {
		let _localctx: ExpressionContext = new ExpressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 72, TodoLangGrammarParser.RULE_expression);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 496;
			this.assignment_expression();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public controlbit_list(): Controlbit_listContext {
		let _localctx: Controlbit_listContext = new Controlbit_listContext(this._ctx, this.state);
		this.enterRule(_localctx, 74, TodoLangGrammarParser.RULE_controlbit_list);
		let _la: number;
		try {
			this.state = 514;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case TodoLangGrammarParser.Q_KEY:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 498;
				this.q_KEY_declaration();
				this.state = 503;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === TodoLangGrammarParser.COMMA) {
					{
					{
					this.state = 499;
					this.match(TodoLangGrammarParser.COMMA);
					this.state = 500;
					this.q_KEY_declaration();
					}
					}
					this.state = 505;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
				break;
			case TodoLangGrammarParser.Identifier:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 506;
				this.match(TodoLangGrammarParser.Identifier);
				this.state = 511;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === TodoLangGrammarParser.COMMA) {
					{
					{
					this.state = 507;
					this.match(TodoLangGrammarParser.COMMA);
					this.state = 508;
					this.match(TodoLangGrammarParser.Identifier);
					}
					}
					this.state = 513;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public statement(): StatementContext {
		let _localctx: StatementContext = new StatementContext(this._ctx, this.state);
		this.enterRule(_localctx, 76, TodoLangGrammarParser.RULE_statement);
		try {
			this.state = 532;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case TodoLangGrammarParser.ECHO_GATE:
			case TodoLangGrammarParser.H_GATE:
			case TodoLangGrammarParser.X_GATE:
			case TodoLangGrammarParser.T_GATE:
			case TodoLangGrammarParser.S_GATE:
			case TodoLangGrammarParser.Y_GATE:
			case TodoLangGrammarParser.Z_GATE:
			case TodoLangGrammarParser.X1_GATE:
			case TodoLangGrammarParser.Y1_GATE:
			case TodoLangGrammarParser.Z1_GATE:
			case TodoLangGrammarParser.I_GATE:
			case TodoLangGrammarParser.U2_GATE:
			case TodoLangGrammarParser.RPHI_GATE:
			case TodoLangGrammarParser.U3_GATE:
			case TodoLangGrammarParser.U4_GATE:
			case TodoLangGrammarParser.RX_GATE:
			case TodoLangGrammarParser.RY_GATE:
			case TodoLangGrammarParser.RZ_GATE:
			case TodoLangGrammarParser.U1_GATE:
			case TodoLangGrammarParser.CNOT_GATE:
			case TodoLangGrammarParser.CZ_GATE:
			case TodoLangGrammarParser.CU_GATE:
			case TodoLangGrammarParser.ISWAP_GATE:
			case TodoLangGrammarParser.SQISWAP_GATE:
			case TodoLangGrammarParser.SWAPZ1_GATE:
			case TodoLangGrammarParser.ISWAPTHETA_GATE:
			case TodoLangGrammarParser.CR_GATE:
			case TodoLangGrammarParser.TOFFOLI_GATE:
			case TodoLangGrammarParser.Identifier:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 516;
				this.quantum_gate_declaration();
				this.state = 517;
				this.match(TodoLangGrammarParser.NEWLINE);
				}
				break;
			case TodoLangGrammarParser.CONTROL_KEY:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 519;
				this.control_statement();
				}
				break;
			case TodoLangGrammarParser.QIF_KEY:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 520;
				this.qif_statement();
				}
				break;
			case TodoLangGrammarParser.QWHILE_KEY:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 521;
				this.qwhile_statement();
				}
				break;
			case TodoLangGrammarParser.DAGGER_KEY:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 522;
				this.dagger_statement();
				}
				break;
			case TodoLangGrammarParser.MEASURE_KEY:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 523;
				this.measure_statement();
				this.state = 524;
				this.match(TodoLangGrammarParser.NEWLINE);
				}
				break;
			case TodoLangGrammarParser.RESET_KEY:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 526;
				this.reset_statement();
				}
				break;
			case TodoLangGrammarParser.PI:
			case TodoLangGrammarParser.C_KEY:
			case TodoLangGrammarParser.NOT:
			case TodoLangGrammarParser.PLUS:
			case TodoLangGrammarParser.MINUS:
			case TodoLangGrammarParser.LPAREN:
			case TodoLangGrammarParser.Integer_Literal:
			case TodoLangGrammarParser.Double_Literal:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 527;
				this.expression_statement();
				}
				break;
			case TodoLangGrammarParser.BARRIER_KEY:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 528;
				this.barrier_statement();
				this.state = 529;
				this.match(TodoLangGrammarParser.NEWLINE);
				}
				break;
			case TodoLangGrammarParser.QGATE_KEY:
				this.enterOuterAlt(_localctx, 10);
				{
				this.state = 531;
				this.gate_func_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public dagger_statement(): Dagger_statementContext {
		let _localctx: Dagger_statementContext = new Dagger_statementContext(this._ctx, this.state);
		this.enterRule(_localctx, 78, TodoLangGrammarParser.RULE_dagger_statement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 534;
			this.match(TodoLangGrammarParser.DAGGER_KEY);
			this.state = 535;
			this.match(TodoLangGrammarParser.NEWLINE);
			 this.inDagger = true; 
			this.state = 540;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << TodoLangGrammarParser.PI) | (1 << TodoLangGrammarParser.C_KEY) | (1 << TodoLangGrammarParser.BARRIER_KEY) | (1 << TodoLangGrammarParser.QGATE_KEY) | (1 << TodoLangGrammarParser.ECHO_GATE) | (1 << TodoLangGrammarParser.H_GATE) | (1 << TodoLangGrammarParser.X_GATE) | (1 << TodoLangGrammarParser.T_GATE) | (1 << TodoLangGrammarParser.S_GATE) | (1 << TodoLangGrammarParser.Y_GATE) | (1 << TodoLangGrammarParser.Z_GATE) | (1 << TodoLangGrammarParser.X1_GATE) | (1 << TodoLangGrammarParser.Y1_GATE) | (1 << TodoLangGrammarParser.Z1_GATE) | (1 << TodoLangGrammarParser.I_GATE) | (1 << TodoLangGrammarParser.U2_GATE) | (1 << TodoLangGrammarParser.RPHI_GATE) | (1 << TodoLangGrammarParser.U3_GATE) | (1 << TodoLangGrammarParser.U4_GATE) | (1 << TodoLangGrammarParser.RX_GATE) | (1 << TodoLangGrammarParser.RY_GATE) | (1 << TodoLangGrammarParser.RZ_GATE) | (1 << TodoLangGrammarParser.U1_GATE) | (1 << TodoLangGrammarParser.CNOT_GATE) | (1 << TodoLangGrammarParser.CZ_GATE) | (1 << TodoLangGrammarParser.CU_GATE))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (TodoLangGrammarParser.ISWAP_GATE - 32)) | (1 << (TodoLangGrammarParser.SQISWAP_GATE - 32)) | (1 << (TodoLangGrammarParser.SWAPZ1_GATE - 32)) | (1 << (TodoLangGrammarParser.ISWAPTHETA_GATE - 32)) | (1 << (TodoLangGrammarParser.CR_GATE - 32)) | (1 << (TodoLangGrammarParser.TOFFOLI_GATE - 32)) | (1 << (TodoLangGrammarParser.DAGGER_KEY - 32)) | (1 << (TodoLangGrammarParser.CONTROL_KEY - 32)) | (1 << (TodoLangGrammarParser.QIF_KEY - 32)) | (1 << (TodoLangGrammarParser.QWHILE_KEY - 32)) | (1 << (TodoLangGrammarParser.MEASURE_KEY - 32)) | (1 << (TodoLangGrammarParser.RESET_KEY - 32)) | (1 << (TodoLangGrammarParser.NOT - 32)) | (1 << (TodoLangGrammarParser.PLUS - 32)) | (1 << (TodoLangGrammarParser.MINUS - 32)))) !== 0) || ((((_la - 65)) & ~0x1F) === 0 && ((1 << (_la - 65)) & ((1 << (TodoLangGrammarParser.LPAREN - 65)) | (1 << (TodoLangGrammarParser.Identifier - 65)) | (1 << (TodoLangGrammarParser.Integer_Literal - 65)) | (1 << (TodoLangGrammarParser.Double_Literal - 65)))) !== 0)) {
				{
				{
				this.state = 537;
				this.statement();
				}
				}
				this.state = 542;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 543;
			this.match(TodoLangGrammarParser.ENDDAGGER_KEY);
			this.state = 544;
			this.match(TodoLangGrammarParser.NEWLINE);
			this.inDagger = false;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public control_statement(): Control_statementContext {
		let _localctx: Control_statementContext = new Control_statementContext(this._ctx, this.state);
		this.enterRule(_localctx, 80, TodoLangGrammarParser.RULE_control_statement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 547;
			this.match(TodoLangGrammarParser.CONTROL_KEY);
			this.state = 548;
			this.controlbit_list();

			    if(_localctx.controlbit_list().Identifier().length != 0){
			            let errorMsg = {start: _localctx.controlbit_list().start.charPositionInLine, end:_localctx.controlbit_list().start.charPositionInLine+_localctx.controlbit_list().text.length, message: "Can not define Id here"};
			            this.notifyErrorListeners(JSON.stringify(errorMsg));
			    }
			    let bit = _localctx.controlbit_list().q_KEY_declaration();
			    for(let i = 0; i < bit.length; i++){
			        let txt = bit[i].text;
			        if(this.controlBit.hasOwnProperty(txt)){
			            let errorMsg = {start: _localctx.controlbit_list().start.charPositionInLine, end:_localctx.controlbit_list().start.charPositionInLine+_localctx.controlbit_list().text.length, message: "Duplicated register"};
			            this.notifyErrorListeners(JSON.stringify(errorMsg));
			        } else {
			            this.controlBit[txt] = 1;
			        }
			    }
			    this.inControl = true;

			this.state = 550;
			this.match(TodoLangGrammarParser.NEWLINE);
			this.state = 554;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << TodoLangGrammarParser.PI) | (1 << TodoLangGrammarParser.C_KEY) | (1 << TodoLangGrammarParser.BARRIER_KEY) | (1 << TodoLangGrammarParser.QGATE_KEY) | (1 << TodoLangGrammarParser.ECHO_GATE) | (1 << TodoLangGrammarParser.H_GATE) | (1 << TodoLangGrammarParser.X_GATE) | (1 << TodoLangGrammarParser.T_GATE) | (1 << TodoLangGrammarParser.S_GATE) | (1 << TodoLangGrammarParser.Y_GATE) | (1 << TodoLangGrammarParser.Z_GATE) | (1 << TodoLangGrammarParser.X1_GATE) | (1 << TodoLangGrammarParser.Y1_GATE) | (1 << TodoLangGrammarParser.Z1_GATE) | (1 << TodoLangGrammarParser.I_GATE) | (1 << TodoLangGrammarParser.U2_GATE) | (1 << TodoLangGrammarParser.RPHI_GATE) | (1 << TodoLangGrammarParser.U3_GATE) | (1 << TodoLangGrammarParser.U4_GATE) | (1 << TodoLangGrammarParser.RX_GATE) | (1 << TodoLangGrammarParser.RY_GATE) | (1 << TodoLangGrammarParser.RZ_GATE) | (1 << TodoLangGrammarParser.U1_GATE) | (1 << TodoLangGrammarParser.CNOT_GATE) | (1 << TodoLangGrammarParser.CZ_GATE) | (1 << TodoLangGrammarParser.CU_GATE))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (TodoLangGrammarParser.ISWAP_GATE - 32)) | (1 << (TodoLangGrammarParser.SQISWAP_GATE - 32)) | (1 << (TodoLangGrammarParser.SWAPZ1_GATE - 32)) | (1 << (TodoLangGrammarParser.ISWAPTHETA_GATE - 32)) | (1 << (TodoLangGrammarParser.CR_GATE - 32)) | (1 << (TodoLangGrammarParser.TOFFOLI_GATE - 32)) | (1 << (TodoLangGrammarParser.DAGGER_KEY - 32)) | (1 << (TodoLangGrammarParser.CONTROL_KEY - 32)) | (1 << (TodoLangGrammarParser.QIF_KEY - 32)) | (1 << (TodoLangGrammarParser.QWHILE_KEY - 32)) | (1 << (TodoLangGrammarParser.MEASURE_KEY - 32)) | (1 << (TodoLangGrammarParser.RESET_KEY - 32)) | (1 << (TodoLangGrammarParser.NOT - 32)) | (1 << (TodoLangGrammarParser.PLUS - 32)) | (1 << (TodoLangGrammarParser.MINUS - 32)))) !== 0) || ((((_la - 65)) & ~0x1F) === 0 && ((1 << (_la - 65)) & ((1 << (TodoLangGrammarParser.LPAREN - 65)) | (1 << (TodoLangGrammarParser.Identifier - 65)) | (1 << (TodoLangGrammarParser.Integer_Literal - 65)) | (1 << (TodoLangGrammarParser.Double_Literal - 65)))) !== 0)) {
				{
				{
				this.state = 551;
				this.statement();
				}
				}
				this.state = 556;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 557;
			this.match(TodoLangGrammarParser.ENDCONTROL_KEY);
			this.state = 558;
			this.match(TodoLangGrammarParser.NEWLINE);

			    this.controlBit = {};
			    this.inControl = false;

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public qelse_statement_fragment(): Qelse_statement_fragmentContext {
		let _localctx: Qelse_statement_fragmentContext = new Qelse_statement_fragmentContext(this._ctx, this.state);
		this.enterRule(_localctx, 82, TodoLangGrammarParser.RULE_qelse_statement_fragment);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 561;
			this.match(TodoLangGrammarParser.ELSE_KEY);
			this.state = 562;
			this.match(TodoLangGrammarParser.NEWLINE);
			this.state = 566;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << TodoLangGrammarParser.PI) | (1 << TodoLangGrammarParser.C_KEY) | (1 << TodoLangGrammarParser.BARRIER_KEY) | (1 << TodoLangGrammarParser.QGATE_KEY) | (1 << TodoLangGrammarParser.ECHO_GATE) | (1 << TodoLangGrammarParser.H_GATE) | (1 << TodoLangGrammarParser.X_GATE) | (1 << TodoLangGrammarParser.T_GATE) | (1 << TodoLangGrammarParser.S_GATE) | (1 << TodoLangGrammarParser.Y_GATE) | (1 << TodoLangGrammarParser.Z_GATE) | (1 << TodoLangGrammarParser.X1_GATE) | (1 << TodoLangGrammarParser.Y1_GATE) | (1 << TodoLangGrammarParser.Z1_GATE) | (1 << TodoLangGrammarParser.I_GATE) | (1 << TodoLangGrammarParser.U2_GATE) | (1 << TodoLangGrammarParser.RPHI_GATE) | (1 << TodoLangGrammarParser.U3_GATE) | (1 << TodoLangGrammarParser.U4_GATE) | (1 << TodoLangGrammarParser.RX_GATE) | (1 << TodoLangGrammarParser.RY_GATE) | (1 << TodoLangGrammarParser.RZ_GATE) | (1 << TodoLangGrammarParser.U1_GATE) | (1 << TodoLangGrammarParser.CNOT_GATE) | (1 << TodoLangGrammarParser.CZ_GATE) | (1 << TodoLangGrammarParser.CU_GATE))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (TodoLangGrammarParser.ISWAP_GATE - 32)) | (1 << (TodoLangGrammarParser.SQISWAP_GATE - 32)) | (1 << (TodoLangGrammarParser.SWAPZ1_GATE - 32)) | (1 << (TodoLangGrammarParser.ISWAPTHETA_GATE - 32)) | (1 << (TodoLangGrammarParser.CR_GATE - 32)) | (1 << (TodoLangGrammarParser.TOFFOLI_GATE - 32)) | (1 << (TodoLangGrammarParser.DAGGER_KEY - 32)) | (1 << (TodoLangGrammarParser.CONTROL_KEY - 32)) | (1 << (TodoLangGrammarParser.QIF_KEY - 32)) | (1 << (TodoLangGrammarParser.QWHILE_KEY - 32)) | (1 << (TodoLangGrammarParser.MEASURE_KEY - 32)) | (1 << (TodoLangGrammarParser.RESET_KEY - 32)) | (1 << (TodoLangGrammarParser.NOT - 32)) | (1 << (TodoLangGrammarParser.PLUS - 32)) | (1 << (TodoLangGrammarParser.MINUS - 32)))) !== 0) || ((((_la - 65)) & ~0x1F) === 0 && ((1 << (_la - 65)) & ((1 << (TodoLangGrammarParser.LPAREN - 65)) | (1 << (TodoLangGrammarParser.Identifier - 65)) | (1 << (TodoLangGrammarParser.Integer_Literal - 65)) | (1 << (TodoLangGrammarParser.Double_Literal - 65)))) !== 0)) {
				{
				{
				this.state = 563;
				this.statement();
				}
				}
				this.state = 568;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public qif_statement(): Qif_statementContext {
		let _localctx: Qif_statementContext = new Qif_statementContext(this._ctx, this.state);
		this.enterRule(_localctx, 84, TodoLangGrammarParser.RULE_qif_statement);
		let _la: number;
		try {
			this.state = 594;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 37, this._ctx) ) {
			case 1:
				_localctx = new Qif_ifContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 569;
				this.match(TodoLangGrammarParser.QIF_KEY);
				this.state = 570;
				this.expression();
				this.state = 571;
				this.match(TodoLangGrammarParser.NEWLINE);
				this.state = 575;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << TodoLangGrammarParser.PI) | (1 << TodoLangGrammarParser.C_KEY) | (1 << TodoLangGrammarParser.BARRIER_KEY) | (1 << TodoLangGrammarParser.QGATE_KEY) | (1 << TodoLangGrammarParser.ECHO_GATE) | (1 << TodoLangGrammarParser.H_GATE) | (1 << TodoLangGrammarParser.X_GATE) | (1 << TodoLangGrammarParser.T_GATE) | (1 << TodoLangGrammarParser.S_GATE) | (1 << TodoLangGrammarParser.Y_GATE) | (1 << TodoLangGrammarParser.Z_GATE) | (1 << TodoLangGrammarParser.X1_GATE) | (1 << TodoLangGrammarParser.Y1_GATE) | (1 << TodoLangGrammarParser.Z1_GATE) | (1 << TodoLangGrammarParser.I_GATE) | (1 << TodoLangGrammarParser.U2_GATE) | (1 << TodoLangGrammarParser.RPHI_GATE) | (1 << TodoLangGrammarParser.U3_GATE) | (1 << TodoLangGrammarParser.U4_GATE) | (1 << TodoLangGrammarParser.RX_GATE) | (1 << TodoLangGrammarParser.RY_GATE) | (1 << TodoLangGrammarParser.RZ_GATE) | (1 << TodoLangGrammarParser.U1_GATE) | (1 << TodoLangGrammarParser.CNOT_GATE) | (1 << TodoLangGrammarParser.CZ_GATE) | (1 << TodoLangGrammarParser.CU_GATE))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (TodoLangGrammarParser.ISWAP_GATE - 32)) | (1 << (TodoLangGrammarParser.SQISWAP_GATE - 32)) | (1 << (TodoLangGrammarParser.SWAPZ1_GATE - 32)) | (1 << (TodoLangGrammarParser.ISWAPTHETA_GATE - 32)) | (1 << (TodoLangGrammarParser.CR_GATE - 32)) | (1 << (TodoLangGrammarParser.TOFFOLI_GATE - 32)) | (1 << (TodoLangGrammarParser.DAGGER_KEY - 32)) | (1 << (TodoLangGrammarParser.CONTROL_KEY - 32)) | (1 << (TodoLangGrammarParser.QIF_KEY - 32)) | (1 << (TodoLangGrammarParser.QWHILE_KEY - 32)) | (1 << (TodoLangGrammarParser.MEASURE_KEY - 32)) | (1 << (TodoLangGrammarParser.RESET_KEY - 32)) | (1 << (TodoLangGrammarParser.NOT - 32)) | (1 << (TodoLangGrammarParser.PLUS - 32)) | (1 << (TodoLangGrammarParser.MINUS - 32)))) !== 0) || ((((_la - 65)) & ~0x1F) === 0 && ((1 << (_la - 65)) & ((1 << (TodoLangGrammarParser.LPAREN - 65)) | (1 << (TodoLangGrammarParser.Identifier - 65)) | (1 << (TodoLangGrammarParser.Integer_Literal - 65)) | (1 << (TodoLangGrammarParser.Double_Literal - 65)))) !== 0)) {
					{
					{
					this.state = 572;
					this.statement();
					}
					}
					this.state = 577;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 578;
				this.qelse_statement_fragment();
				this.state = 579;
				this.match(TodoLangGrammarParser.ENDIF_KEY);
				this.state = 580;
				this.match(TodoLangGrammarParser.NEWLINE);
				}
				break;

			case 2:
				_localctx = new Qif_ifelseContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 582;
				this.match(TodoLangGrammarParser.QIF_KEY);
				this.state = 583;
				this.expression();
				this.state = 584;
				this.match(TodoLangGrammarParser.NEWLINE);
				this.state = 588;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << TodoLangGrammarParser.PI) | (1 << TodoLangGrammarParser.C_KEY) | (1 << TodoLangGrammarParser.BARRIER_KEY) | (1 << TodoLangGrammarParser.QGATE_KEY) | (1 << TodoLangGrammarParser.ECHO_GATE) | (1 << TodoLangGrammarParser.H_GATE) | (1 << TodoLangGrammarParser.X_GATE) | (1 << TodoLangGrammarParser.T_GATE) | (1 << TodoLangGrammarParser.S_GATE) | (1 << TodoLangGrammarParser.Y_GATE) | (1 << TodoLangGrammarParser.Z_GATE) | (1 << TodoLangGrammarParser.X1_GATE) | (1 << TodoLangGrammarParser.Y1_GATE) | (1 << TodoLangGrammarParser.Z1_GATE) | (1 << TodoLangGrammarParser.I_GATE) | (1 << TodoLangGrammarParser.U2_GATE) | (1 << TodoLangGrammarParser.RPHI_GATE) | (1 << TodoLangGrammarParser.U3_GATE) | (1 << TodoLangGrammarParser.U4_GATE) | (1 << TodoLangGrammarParser.RX_GATE) | (1 << TodoLangGrammarParser.RY_GATE) | (1 << TodoLangGrammarParser.RZ_GATE) | (1 << TodoLangGrammarParser.U1_GATE) | (1 << TodoLangGrammarParser.CNOT_GATE) | (1 << TodoLangGrammarParser.CZ_GATE) | (1 << TodoLangGrammarParser.CU_GATE))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (TodoLangGrammarParser.ISWAP_GATE - 32)) | (1 << (TodoLangGrammarParser.SQISWAP_GATE - 32)) | (1 << (TodoLangGrammarParser.SWAPZ1_GATE - 32)) | (1 << (TodoLangGrammarParser.ISWAPTHETA_GATE - 32)) | (1 << (TodoLangGrammarParser.CR_GATE - 32)) | (1 << (TodoLangGrammarParser.TOFFOLI_GATE - 32)) | (1 << (TodoLangGrammarParser.DAGGER_KEY - 32)) | (1 << (TodoLangGrammarParser.CONTROL_KEY - 32)) | (1 << (TodoLangGrammarParser.QIF_KEY - 32)) | (1 << (TodoLangGrammarParser.QWHILE_KEY - 32)) | (1 << (TodoLangGrammarParser.MEASURE_KEY - 32)) | (1 << (TodoLangGrammarParser.RESET_KEY - 32)) | (1 << (TodoLangGrammarParser.NOT - 32)) | (1 << (TodoLangGrammarParser.PLUS - 32)) | (1 << (TodoLangGrammarParser.MINUS - 32)))) !== 0) || ((((_la - 65)) & ~0x1F) === 0 && ((1 << (_la - 65)) & ((1 << (TodoLangGrammarParser.LPAREN - 65)) | (1 << (TodoLangGrammarParser.Identifier - 65)) | (1 << (TodoLangGrammarParser.Integer_Literal - 65)) | (1 << (TodoLangGrammarParser.Double_Literal - 65)))) !== 0)) {
					{
					{
					this.state = 585;
					this.statement();
					}
					}
					this.state = 590;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 591;
				this.match(TodoLangGrammarParser.ENDIF_KEY);
				this.state = 592;
				this.match(TodoLangGrammarParser.NEWLINE);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public qwhile_statement(): Qwhile_statementContext {
		let _localctx: Qwhile_statementContext = new Qwhile_statementContext(this._ctx, this.state);
		this.enterRule(_localctx, 86, TodoLangGrammarParser.RULE_qwhile_statement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 596;
			this.match(TodoLangGrammarParser.QWHILE_KEY);
			this.state = 597;
			this.expression();
			this.state = 598;
			this.match(TodoLangGrammarParser.NEWLINE);
			this.state = 602;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << TodoLangGrammarParser.PI) | (1 << TodoLangGrammarParser.C_KEY) | (1 << TodoLangGrammarParser.BARRIER_KEY) | (1 << TodoLangGrammarParser.QGATE_KEY) | (1 << TodoLangGrammarParser.ECHO_GATE) | (1 << TodoLangGrammarParser.H_GATE) | (1 << TodoLangGrammarParser.X_GATE) | (1 << TodoLangGrammarParser.T_GATE) | (1 << TodoLangGrammarParser.S_GATE) | (1 << TodoLangGrammarParser.Y_GATE) | (1 << TodoLangGrammarParser.Z_GATE) | (1 << TodoLangGrammarParser.X1_GATE) | (1 << TodoLangGrammarParser.Y1_GATE) | (1 << TodoLangGrammarParser.Z1_GATE) | (1 << TodoLangGrammarParser.I_GATE) | (1 << TodoLangGrammarParser.U2_GATE) | (1 << TodoLangGrammarParser.RPHI_GATE) | (1 << TodoLangGrammarParser.U3_GATE) | (1 << TodoLangGrammarParser.U4_GATE) | (1 << TodoLangGrammarParser.RX_GATE) | (1 << TodoLangGrammarParser.RY_GATE) | (1 << TodoLangGrammarParser.RZ_GATE) | (1 << TodoLangGrammarParser.U1_GATE) | (1 << TodoLangGrammarParser.CNOT_GATE) | (1 << TodoLangGrammarParser.CZ_GATE) | (1 << TodoLangGrammarParser.CU_GATE))) !== 0) || ((((_la - 32)) & ~0x1F) === 0 && ((1 << (_la - 32)) & ((1 << (TodoLangGrammarParser.ISWAP_GATE - 32)) | (1 << (TodoLangGrammarParser.SQISWAP_GATE - 32)) | (1 << (TodoLangGrammarParser.SWAPZ1_GATE - 32)) | (1 << (TodoLangGrammarParser.ISWAPTHETA_GATE - 32)) | (1 << (TodoLangGrammarParser.CR_GATE - 32)) | (1 << (TodoLangGrammarParser.TOFFOLI_GATE - 32)) | (1 << (TodoLangGrammarParser.DAGGER_KEY - 32)) | (1 << (TodoLangGrammarParser.CONTROL_KEY - 32)) | (1 << (TodoLangGrammarParser.QIF_KEY - 32)) | (1 << (TodoLangGrammarParser.QWHILE_KEY - 32)) | (1 << (TodoLangGrammarParser.MEASURE_KEY - 32)) | (1 << (TodoLangGrammarParser.RESET_KEY - 32)) | (1 << (TodoLangGrammarParser.NOT - 32)) | (1 << (TodoLangGrammarParser.PLUS - 32)) | (1 << (TodoLangGrammarParser.MINUS - 32)))) !== 0) || ((((_la - 65)) & ~0x1F) === 0 && ((1 << (_la - 65)) & ((1 << (TodoLangGrammarParser.LPAREN - 65)) | (1 << (TodoLangGrammarParser.Identifier - 65)) | (1 << (TodoLangGrammarParser.Integer_Literal - 65)) | (1 << (TodoLangGrammarParser.Double_Literal - 65)))) !== 0)) {
				{
				{
				this.state = 599;
				this.statement();
				}
				}
				this.state = 604;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 605;
			this.match(TodoLangGrammarParser.ENDQWHILE_KEY);
			this.state = 606;
			this.match(TodoLangGrammarParser.NEWLINE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public measure_statement(): Measure_statementContext {
		let _localctx: Measure_statementContext = new Measure_statementContext(this._ctx, this.state);
		this.enterRule(_localctx, 88, TodoLangGrammarParser.RULE_measure_statement);
		try {
			this.state = 620;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 39, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 608;
				this.match(TodoLangGrammarParser.MEASURE_KEY);
				this.state = 609;
				this.q_KEY_declaration();
				this.state = 610;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 611;
				this.c_KEY_declaration();

				    if (this.measureList.hasOwnProperty(_localctx.q_KEY_declaration()!.text)) {
				        let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.q_KEY_declaration()!.stop!.charPositionInLine+_localctx.q_KEY_declaration()!.text.length, message: "Duplicated measure"};
				        this.notifyErrorListeners(JSON.stringify(errorMsg));
				    } else {
				        this.measureList[_localctx.q_KEY_declaration()!.text] = 1;
				    }
				    if (this.inControl || this.inDagger) {
				        let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length, message: "can not define measure or barrier here"};
				        this.notifyErrorListeners(JSON.stringify(errorMsg));
				    }

				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 614;
				this.match(TodoLangGrammarParser.MEASURE_KEY);
				this.state = 615;
				this.match(TodoLangGrammarParser.Q_KEY);
				this.state = 616;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 617;
				this.match(TodoLangGrammarParser.C_KEY);
				this.state = 618;
				this.match(TodoLangGrammarParser.NEWLINE);

				    if(this.measureList.hasOwnProperty("q")) {
				        let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length, message: "Duplicated measure"};
				        this.notifyErrorListeners(JSON.stringify(errorMsg));
				    } else {
				        this.measureList["q"] = 1;
				    }
				    if (this.inControl || this.inDagger) {
				        let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length, message: "can not define measure or barrier here"};
				        this.notifyErrorListeners(JSON.stringify(errorMsg));
				    }

				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public reset_statement(): Reset_statementContext {
		let _localctx: Reset_statementContext = new Reset_statementContext(this._ctx, this.state);
		this.enterRule(_localctx, 90, TodoLangGrammarParser.RULE_reset_statement);
		try {
			this.state = 629;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 40, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 622;
				this.match(TodoLangGrammarParser.RESET_KEY);
				this.state = 623;
				this.q_KEY_declaration();
				this.state = 624;
				this.match(TodoLangGrammarParser.NEWLINE);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 626;
				this.match(TodoLangGrammarParser.RESET_KEY);
				this.state = 627;
				this.match(TodoLangGrammarParser.Q_KEY);
				this.state = 628;
				this.match(TodoLangGrammarParser.NEWLINE);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public barrier_statement(): Barrier_statementContext {
		let _localctx: Barrier_statementContext = new Barrier_statementContext(this._ctx, this.state);
		this.enterRule(_localctx, 92, TodoLangGrammarParser.RULE_barrier_statement);
		try {
			this.state = 638;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 41, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 631;
				this.match(TodoLangGrammarParser.BARRIER_KEY);
				this.state = 632;
				this.controlbit_list();

				    if (this.inDagger || this.inControl){
				        let errorMsg = {start: _localctx.start.charPositionInLine, end:_localctx.start.charPositionInLine+_localctx.text.length, message: "can not define measure or barrier here"};
				        this.notifyErrorListeners(JSON.stringify(errorMsg));
				    }
				    let bit = _localctx.controlbit_list()!.q_KEY_declaration();
				    let barrieBits: {[key: string]: number; } = {};
				    for(let i = 0; i < bit.length; i++) {
				        let txt = bit[i].text;
				        if(barrieBits.hasOwnProperty(txt)){
				            let errorMsg = {start: _localctx.controlbit_list()!.start.charPositionInLine, end:_localctx.controlbit_list()!.start.charPositionInLine+_localctx.controlbit_list()!.text.length, message: "Duplicated register"};
				            this.notifyErrorListeners(JSON.stringify(errorMsg));
				        } else {
				            barrieBits[txt] = 1;
				        }
				    }

				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 635;
				this.match(TodoLangGrammarParser.BARRIER_KEY);
				this.state = 636;
				this.match(TodoLangGrammarParser.Q_KEY);
				this.state = 637;
				this.match(TodoLangGrammarParser.NEWLINE);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public expression_statement(): Expression_statementContext {
		let _localctx: Expression_statementContext = new Expression_statementContext(this._ctx, this.state);
		this.enterRule(_localctx, 94, TodoLangGrammarParser.RULE_expression_statement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 640;
			this.expression();
			this.state = 641;
			this.match(TodoLangGrammarParser.NEWLINE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public define_gate_statement(): Define_gate_statementContext {
		let _localctx: Define_gate_statementContext = new Define_gate_statementContext(this._ctx, this.state);
		this.enterRule(_localctx, 96, TodoLangGrammarParser.RULE_define_gate_statement);
		try {
			this.state = 659;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 42, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 643;
				this.gate_name();

				    if(_localctx.gate_name().id() != null) {
				        let customName = _localctx.gate_name().id()!.text;
				        if(!this.gateList.hasOwnProperty(customName)) {
				            let errorMsg = {start: _localctx.gate_name().start.charPositionInLine, end: _localctx.gate_name().start.charPositionInLine+_localctx.gate_name().text.length, message: "can not find define " + customName};
				            this.notifyErrorListeners(JSON.stringify(errorMsg));
				        }
				    }

				this.state = 645;
				this.id_list();

				    let args = _localctx.id_list()._params;
				    if(this.gateList.hasOwnProperty(this.currentGateName)) {
				        let nowGate = this.gateList[this.currentGateName];
				        if(this.isValidKey(this.key1, nowGate)){
				            let params: object = nowGate[this.key1];
				            for(let i = 0; i < args.length; i++){
				                let arg_name = args[i].text;
				                if(!params.hasOwnProperty(arg_name)){
				                    let errorMsg = {start: _localctx.start.charPositionInLine, end:_localctx.start.charPositionInLine+_localctx.text.length, message: "can not find define " + arg_name};
				                    this.notifyErrorListeners(JSON.stringify(errorMsg));
				                }
				            }
				        }
				    }
				    for(let i = 0; i < args.length; i++){
				        let arg_name = args[i].text;
				        if(this.controlBit.hasOwnProperty(arg_name)){
				            let errorMsg = {start: _localctx.start.charPositionInLine, end:_localctx.start.charPositionInLine+_localctx.text.length, message: "duplicated register"};
				            this.notifyErrorListeners(JSON.stringify(errorMsg));
				        }
				    }

				this.state = 647;
				this.match(TodoLangGrammarParser.NEWLINE);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 649;
				this.gate_name();
				this.state = 650;
				this.id_list();

				    let customName = _localctx.gate_name().text;
				    if(_localctx.gate_name().id() != null) {
				        if(!this.gateList.hasOwnProperty(customName)) {
				            let errorMsg = {start: _localctx.gate_name().start.charPositionInLine, end: _localctx.gate_name().start.charPositionInLine+_localctx.gate_name().text.length, message: "can not find define " + customName};
				            this.notifyErrorListeners(JSON.stringify(errorMsg));
				        }
				    }
				    let args = _localctx.id_list()._params;
				    if(this.gateList.hasOwnProperty(this.currentGateName)) {
				        let nowGate = this.gateList[this.currentGateName];
				        if(this.isValidKey(this.key1, nowGate)){
				            let params:object = nowGate[this.key1];
				            for(let i = 0; i < args.length; i++){
				                let arg_name = args[i].text;
				                if(!params.hasOwnProperty(arg_name)){
				                    let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.text.length, message: "can not find define " + arg_name};
				                    this.notifyErrorListeners(JSON.stringify(errorMsg));
				                }
				            }
				        }
				    }
				    for(let i = 0; i < args.length; i++){
				        let arg_name = args[i].text;
				        if(this.controlBit.hasOwnProperty(arg_name)){
				            let errorMsg = {start: _localctx.start.charPositionInLine, end:_localctx.start.charPositionInLine+_localctx.text.length, message: "duplicated register"};
				            this.notifyErrorListeners(JSON.stringify(errorMsg));
				        }
				    }
				                     
				this.state = 652;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 653;
				this.match(TodoLangGrammarParser.LPAREN);
				this.state = 654;
				this.explist();

				    if(this.gateList.hasOwnProperty(this.currentGateName)) {
				        let nowGate = this.gateList[this.currentGateName];
				        if(this.isValidKey(this.key2, nowGate)){
				            let argument_list: object = nowGate[this.key2];
				            let angles = _localctx.explist()!._angles;
				            for(let i = 0; i < angles.length; i++){
				                if(angles[i].id() != null){
				                    if(argument_list == null){
				                        let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length, message: "can not find define angle parameter " + angles[i].id()!.text};
				                        this.notifyErrorListeners(JSON.stringify(errorMsg));
				                    } else {
				                        let angle_name = angles[i].id()!.text;
				                        if(!argument_list.hasOwnProperty(angle_name)){
				                            let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length, message: "can not find define angle parameter " + angle_name};
				                            this.notifyErrorListeners(JSON.stringify(errorMsg));
				                        }
				                    }
				                }
				            }            
				        }
				        
				    }
				                     
				this.state = 656;
				this.match(TodoLangGrammarParser.RPAREN);
				this.state = 657;
				this.match(TodoLangGrammarParser.NEWLINE);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public define_dagger_statement(): Define_dagger_statementContext {
		let _localctx: Define_dagger_statementContext = new Define_dagger_statementContext(this._ctx, this.state);
		this.enterRule(_localctx, 98, TodoLangGrammarParser.RULE_define_dagger_statement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 661;
			this.match(TodoLangGrammarParser.DAGGER_KEY);
			this.state = 662;
			this.match(TodoLangGrammarParser.NEWLINE);
			this.state = 664;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				{
				this.state = 663;
				this.user_defined_gate();
				}
				}
				this.state = 666;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while (((((_la - 9)) & ~0x1F) === 0 && ((1 << (_la - 9)) & ((1 << (TodoLangGrammarParser.ECHO_GATE - 9)) | (1 << (TodoLangGrammarParser.H_GATE - 9)) | (1 << (TodoLangGrammarParser.X_GATE - 9)) | (1 << (TodoLangGrammarParser.T_GATE - 9)) | (1 << (TodoLangGrammarParser.S_GATE - 9)) | (1 << (TodoLangGrammarParser.Y_GATE - 9)) | (1 << (TodoLangGrammarParser.Z_GATE - 9)) | (1 << (TodoLangGrammarParser.X1_GATE - 9)) | (1 << (TodoLangGrammarParser.Y1_GATE - 9)) | (1 << (TodoLangGrammarParser.Z1_GATE - 9)) | (1 << (TodoLangGrammarParser.I_GATE - 9)) | (1 << (TodoLangGrammarParser.U2_GATE - 9)) | (1 << (TodoLangGrammarParser.RPHI_GATE - 9)) | (1 << (TodoLangGrammarParser.U3_GATE - 9)) | (1 << (TodoLangGrammarParser.U4_GATE - 9)) | (1 << (TodoLangGrammarParser.RX_GATE - 9)) | (1 << (TodoLangGrammarParser.RY_GATE - 9)) | (1 << (TodoLangGrammarParser.RZ_GATE - 9)) | (1 << (TodoLangGrammarParser.U1_GATE - 9)) | (1 << (TodoLangGrammarParser.CNOT_GATE - 9)) | (1 << (TodoLangGrammarParser.CZ_GATE - 9)) | (1 << (TodoLangGrammarParser.CU_GATE - 9)) | (1 << (TodoLangGrammarParser.ISWAP_GATE - 9)) | (1 << (TodoLangGrammarParser.SQISWAP_GATE - 9)) | (1 << (TodoLangGrammarParser.SWAPZ1_GATE - 9)) | (1 << (TodoLangGrammarParser.ISWAPTHETA_GATE - 9)) | (1 << (TodoLangGrammarParser.CR_GATE - 9)) | (1 << (TodoLangGrammarParser.TOFFOLI_GATE - 9)) | (1 << (TodoLangGrammarParser.DAGGER_KEY - 9)))) !== 0) || _la === TodoLangGrammarParser.CONTROL_KEY || _la === TodoLangGrammarParser.Identifier);
			this.state = 668;
			this.match(TodoLangGrammarParser.ENDDAGGER_KEY);
			this.state = 669;
			this.match(TodoLangGrammarParser.NEWLINE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public define_control_statement(): Define_control_statementContext {
		let _localctx: Define_control_statementContext = new Define_control_statementContext(this._ctx, this.state);
		this.enterRule(_localctx, 100, TodoLangGrammarParser.RULE_define_control_statement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 671;
			this.match(TodoLangGrammarParser.CONTROL_KEY);
			this.state = 672;
			this.controlbit_list();

			    let bit;
			    if (_localctx.controlbit_list().q_KEY_declaration().length > 0){
			        bit = _localctx.controlbit_list().q_KEY_declaration();
			    } else {
			        bit = _localctx.controlbit_list().Identifier();
			    }
			    for(let i = 0; i < bit.length; i++){
			        let txt = bit[i].text;
			        if(this.controlBit.hasOwnProperty(txt)){
			            let errorMsg = {start: _localctx.controlbit_list().start.charPositionInLine, end:_localctx.controlbit_list().start.charPositionInLine+_localctx.controlbit_list().text.length, message: "Duplicated register"};
			            this.notifyErrorListeners(JSON.stringify(errorMsg));
			        } else {
			            this.controlBit[txt] = 1;
			        }
			    }

			this.state = 674;
			this.match(TodoLangGrammarParser.NEWLINE);
			this.state = 676;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				{
				this.state = 675;
				this.user_defined_gate();
				}
				}
				this.state = 678;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while (((((_la - 9)) & ~0x1F) === 0 && ((1 << (_la - 9)) & ((1 << (TodoLangGrammarParser.ECHO_GATE - 9)) | (1 << (TodoLangGrammarParser.H_GATE - 9)) | (1 << (TodoLangGrammarParser.X_GATE - 9)) | (1 << (TodoLangGrammarParser.T_GATE - 9)) | (1 << (TodoLangGrammarParser.S_GATE - 9)) | (1 << (TodoLangGrammarParser.Y_GATE - 9)) | (1 << (TodoLangGrammarParser.Z_GATE - 9)) | (1 << (TodoLangGrammarParser.X1_GATE - 9)) | (1 << (TodoLangGrammarParser.Y1_GATE - 9)) | (1 << (TodoLangGrammarParser.Z1_GATE - 9)) | (1 << (TodoLangGrammarParser.I_GATE - 9)) | (1 << (TodoLangGrammarParser.U2_GATE - 9)) | (1 << (TodoLangGrammarParser.RPHI_GATE - 9)) | (1 << (TodoLangGrammarParser.U3_GATE - 9)) | (1 << (TodoLangGrammarParser.U4_GATE - 9)) | (1 << (TodoLangGrammarParser.RX_GATE - 9)) | (1 << (TodoLangGrammarParser.RY_GATE - 9)) | (1 << (TodoLangGrammarParser.RZ_GATE - 9)) | (1 << (TodoLangGrammarParser.U1_GATE - 9)) | (1 << (TodoLangGrammarParser.CNOT_GATE - 9)) | (1 << (TodoLangGrammarParser.CZ_GATE - 9)) | (1 << (TodoLangGrammarParser.CU_GATE - 9)) | (1 << (TodoLangGrammarParser.ISWAP_GATE - 9)) | (1 << (TodoLangGrammarParser.SQISWAP_GATE - 9)) | (1 << (TodoLangGrammarParser.SWAPZ1_GATE - 9)) | (1 << (TodoLangGrammarParser.ISWAPTHETA_GATE - 9)) | (1 << (TodoLangGrammarParser.CR_GATE - 9)) | (1 << (TodoLangGrammarParser.TOFFOLI_GATE - 9)) | (1 << (TodoLangGrammarParser.DAGGER_KEY - 9)))) !== 0) || _la === TodoLangGrammarParser.CONTROL_KEY || _la === TodoLangGrammarParser.Identifier);
			this.state = 680;
			this.match(TodoLangGrammarParser.ENDCONTROL_KEY);
			this.state = 681;
			this.match(TodoLangGrammarParser.NEWLINE);

			    this.controlBit = {};

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public user_defined_gate(): User_defined_gateContext {
		let _localctx: User_defined_gateContext = new User_defined_gateContext(this._ctx, this.state);
		this.enterRule(_localctx, 102, TodoLangGrammarParser.RULE_user_defined_gate);
		try {
			this.state = 687;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case TodoLangGrammarParser.ECHO_GATE:
			case TodoLangGrammarParser.H_GATE:
			case TodoLangGrammarParser.X_GATE:
			case TodoLangGrammarParser.T_GATE:
			case TodoLangGrammarParser.S_GATE:
			case TodoLangGrammarParser.Y_GATE:
			case TodoLangGrammarParser.Z_GATE:
			case TodoLangGrammarParser.X1_GATE:
			case TodoLangGrammarParser.Y1_GATE:
			case TodoLangGrammarParser.Z1_GATE:
			case TodoLangGrammarParser.I_GATE:
			case TodoLangGrammarParser.U2_GATE:
			case TodoLangGrammarParser.RPHI_GATE:
			case TodoLangGrammarParser.U3_GATE:
			case TodoLangGrammarParser.U4_GATE:
			case TodoLangGrammarParser.RX_GATE:
			case TodoLangGrammarParser.RY_GATE:
			case TodoLangGrammarParser.RZ_GATE:
			case TodoLangGrammarParser.U1_GATE:
			case TodoLangGrammarParser.CNOT_GATE:
			case TodoLangGrammarParser.CZ_GATE:
			case TodoLangGrammarParser.CU_GATE:
			case TodoLangGrammarParser.ISWAP_GATE:
			case TodoLangGrammarParser.SQISWAP_GATE:
			case TodoLangGrammarParser.SWAPZ1_GATE:
			case TodoLangGrammarParser.ISWAPTHETA_GATE:
			case TodoLangGrammarParser.CR_GATE:
			case TodoLangGrammarParser.TOFFOLI_GATE:
			case TodoLangGrammarParser.Identifier:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 684;
				this.define_gate_statement();
				}
				break;
			case TodoLangGrammarParser.DAGGER_KEY:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 685;
				this.define_dagger_statement();
				}
				break;
			case TodoLangGrammarParser.CONTROL_KEY:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 686;
				this.define_control_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public explist(): ExplistContext {
		let _localctx: ExplistContext = new ExplistContext(this._ctx, this.state);
		this.enterRule(_localctx, 104, TodoLangGrammarParser.RULE_explist);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 689;
			_localctx._exp = this.exp(0);
			_localctx._angles.push(_localctx._exp);
			this.state = 694;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === TodoLangGrammarParser.COMMA) {
				{
				{
				this.state = 690;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 691;
				_localctx._exp = this.exp(0);
				_localctx._angles.push(_localctx._exp);
				}
				}
				this.state = 696;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public exp(): ExpContext;
	public exp(_p: number): ExpContext;
	// @RuleVersion(0)
	public exp(_p?: number): ExpContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: ExpContext = new ExpContext(this._ctx, _parentState);
		let _prevctx: ExpContext = _localctx;
		let _startState: number = 106;
		this.enterRecursionRule(_localctx, 106, TodoLangGrammarParser.RULE_exp, _p);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 708;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case TodoLangGrammarParser.Identifier:
				{
				this.state = 698;
				this.id();
				}
				break;
			case TodoLangGrammarParser.Integer_Literal:
				{
				this.state = 699;
				this.match(TodoLangGrammarParser.Integer_Literal);
				}
				break;
			case TodoLangGrammarParser.Double_Literal:
				{
				this.state = 700;
				this.match(TodoLangGrammarParser.Double_Literal);
				}
				break;
			case TodoLangGrammarParser.PI:
				{
				this.state = 701;
				this.match(TodoLangGrammarParser.PI);
				}
				break;
			case TodoLangGrammarParser.LPAREN:
				{
				this.state = 702;
				this.match(TodoLangGrammarParser.LPAREN);
				this.state = 703;
				this.exp(0);
				this.state = 704;
				this.match(TodoLangGrammarParser.RPAREN);
				}
				break;
			case TodoLangGrammarParser.MINUS:
				{
				this.state = 706;
				this.match(TodoLangGrammarParser.MINUS);
				this.state = 707;
				this.exp(5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 726;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 49, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 724;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 48, this._ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, TodoLangGrammarParser.RULE_exp);
						this.state = 710;
						if (!(this.precpred(this._ctx, 4))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 4)");
						}
						this.state = 711;
						this.match(TodoLangGrammarParser.MUL);
						this.state = 712;
						this.exp(5);
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, TodoLangGrammarParser.RULE_exp);
						this.state = 713;
						if (!(this.precpred(this._ctx, 3))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 3)");
						}
						this.state = 714;
						this.match(TodoLangGrammarParser.DIV);
						this.state = 715;
						_localctx._denominator = this.exp(4);
						 if(_localctx._denominator.text === '0') {
						                              let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length, message: "The denominator cannot be zero"};
						                              this.notifyErrorListeners(JSON.stringify(errorMsg));
						                          } 
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, TodoLangGrammarParser.RULE_exp);
						this.state = 718;
						if (!(this.precpred(this._ctx, 2))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 2)");
						}
						this.state = 719;
						this.match(TodoLangGrammarParser.PLUS);
						this.state = 720;
						this.exp(3);
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						this.pushNewRecursionContext(_localctx, _startState, TodoLangGrammarParser.RULE_exp);
						this.state = 721;
						if (!(this.precpred(this._ctx, 1))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 1)");
						}
						this.state = 722;
						this.match(TodoLangGrammarParser.MINUS);
						this.state = 723;
						this.exp(2);
						}
						break;
					}
					}
				}
				this.state = 728;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 49, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public gate_func_statement(): Gate_func_statementContext {
		let _localctx: Gate_func_statementContext = new Gate_func_statementContext(this._ctx, this.state);
		this.enterRule(_localctx, 108, TodoLangGrammarParser.RULE_gate_func_statement);
		let _la: number;
		try {
			this.state = 761;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 52, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 729;
				this.match(TodoLangGrammarParser.QGATE_KEY);
				this.state = 730;
				_localctx._name = this.id();
				this.state = 731;
				_localctx._params = this.id_list();

				        let gateName = _localctx._name.text;
				        if(this.gateList.hasOwnProperty(gateName)){
				            let errorMsg = {start: _localctx.id().start.charPositionInLine, end: _localctx.id().start.charPositionInLine+_localctx.id().text.length, message: "A gate named " +gateName+ " is already declared"};
				            this.notifyErrorListeners(JSON.stringify(errorMsg));
				        }
				        if (gateName.length > 6) {
				            let errorMsg = {start: _localctx.id().start.charPositionInLine, end: _localctx.id().start.charPositionInLine+_localctx.id().text.length, message: "gate name too long"};
				            this.notifyErrorListeners(JSON.stringify(errorMsg));
				        }
				        if (gateName.length < 2) {
				            let errorMsg = {start: _localctx.id().start.charPositionInLine, end: _localctx.id().start.charPositionInLine+_localctx.id().text.length, message: "gate name too short"};
				            this.notifyErrorListeners(JSON.stringify(errorMsg));
				        }
				        this.currentGateName = gateName;
				        let parameters = _localctx._params!._params;
				        let json1 = {};
				        parameters.forEach(element => {
				            let param_text = element.text;
				            if (json1.hasOwnProperty(param_text)) {
				                let errorMsg = {start: _localctx._params.start.charPositionInLine, end: _localctx._params.start.charPositionInLine+_localctx._params.text.length, message: "parameter "+ param_text +" is already declared"};
				                this.notifyErrorListeners(JSON.stringify(errorMsg));
				            }
				            json1[param_text] = 1;
				        });
				        let newGate = {"params": json1, arguments: null}
				        this.gateList[gateName] = newGate;

				this.state = 733;
				this.match(TodoLangGrammarParser.NEWLINE);
				this.state = 737;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (((((_la - 9)) & ~0x1F) === 0 && ((1 << (_la - 9)) & ((1 << (TodoLangGrammarParser.ECHO_GATE - 9)) | (1 << (TodoLangGrammarParser.H_GATE - 9)) | (1 << (TodoLangGrammarParser.X_GATE - 9)) | (1 << (TodoLangGrammarParser.T_GATE - 9)) | (1 << (TodoLangGrammarParser.S_GATE - 9)) | (1 << (TodoLangGrammarParser.Y_GATE - 9)) | (1 << (TodoLangGrammarParser.Z_GATE - 9)) | (1 << (TodoLangGrammarParser.X1_GATE - 9)) | (1 << (TodoLangGrammarParser.Y1_GATE - 9)) | (1 << (TodoLangGrammarParser.Z1_GATE - 9)) | (1 << (TodoLangGrammarParser.I_GATE - 9)) | (1 << (TodoLangGrammarParser.U2_GATE - 9)) | (1 << (TodoLangGrammarParser.RPHI_GATE - 9)) | (1 << (TodoLangGrammarParser.U3_GATE - 9)) | (1 << (TodoLangGrammarParser.U4_GATE - 9)) | (1 << (TodoLangGrammarParser.RX_GATE - 9)) | (1 << (TodoLangGrammarParser.RY_GATE - 9)) | (1 << (TodoLangGrammarParser.RZ_GATE - 9)) | (1 << (TodoLangGrammarParser.U1_GATE - 9)) | (1 << (TodoLangGrammarParser.CNOT_GATE - 9)) | (1 << (TodoLangGrammarParser.CZ_GATE - 9)) | (1 << (TodoLangGrammarParser.CU_GATE - 9)) | (1 << (TodoLangGrammarParser.ISWAP_GATE - 9)) | (1 << (TodoLangGrammarParser.SQISWAP_GATE - 9)) | (1 << (TodoLangGrammarParser.SWAPZ1_GATE - 9)) | (1 << (TodoLangGrammarParser.ISWAPTHETA_GATE - 9)) | (1 << (TodoLangGrammarParser.CR_GATE - 9)) | (1 << (TodoLangGrammarParser.TOFFOLI_GATE - 9)) | (1 << (TodoLangGrammarParser.DAGGER_KEY - 9)))) !== 0) || _la === TodoLangGrammarParser.CONTROL_KEY || _la === TodoLangGrammarParser.Identifier) {
					{
					{
					this.state = 734;
					this.user_defined_gate();
					}
					}
					this.state = 739;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 740;
				this.match(TodoLangGrammarParser.ENDQGATE_KEY);
				this.state = 741;
				this.match(TodoLangGrammarParser.NEWLINE);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 743;
				this.match(TodoLangGrammarParser.QGATE_KEY);
				this.state = 744;
				_localctx._name = this.id();
				this.state = 745;
				_localctx._params = this.id_list();
				this.state = 746;
				this.match(TodoLangGrammarParser.COMMA);
				this.state = 747;
				this.match(TodoLangGrammarParser.LPAREN);
				this.state = 748;
				_localctx._arguments = this.id_list();
				this.state = 749;
				this.match(TodoLangGrammarParser.RPAREN);

				                            let gateName = _localctx._name.text;
				                            if(this.gateList.hasOwnProperty(gateName)){
				                                let errorMsg = {start: _localctx.id().start.charPositionInLine, end: _localctx.id().start.charPositionInLine+_localctx._params.text.length, message: "A gate named " +gateName+ " is already declared"};
				                                this.notifyErrorListeners(JSON.stringify(errorMsg));
				                            }
				                            this.currentGateName = gateName;
				                            if (gateName.length > 6) {
				                                let errorMsg = {start: _localctx.id().start.charPositionInLine, end: _localctx.id().start.charPositionInLine+_localctx.id().text.length, message: "gate name too long"};
				                                this.notifyErrorListeners(JSON.stringify(errorMsg));
				                            }
				                            if (gateName.length < 2) {
				                                let errorMsg = {start: _localctx.id().start.charPositionInLine, end: _localctx.id().start.charPositionInLine+_localctx.id().text.length, message: "gate name too short"};
				                                this.notifyErrorListeners(JSON.stringify(errorMsg));
				                            }
				                            let parameters = _localctx._params!._params;
				                            let angles = _localctx._arguments!._params;
				                            let json1 = {};
				                            let json2 = {};
				                            parameters.forEach(element => {
				                                let param_text = element.text;
				                                if (json1.hasOwnProperty(param_text)) {
				                                    let errorMsg = {start: _localctx._params.start.charPositionInLine, end: _localctx._params.start.charPositionInLine+_localctx._params.text.length, message: "parameter "+ param_text +" is already declared"};
				                                    this.notifyErrorListeners(JSON.stringify(errorMsg));
				                                }
				                                json1[param_text] = 1;
				                            });
				                            angles.forEach(element => {
				                                let param_text = element.text;
				                                if (json2.hasOwnProperty(param_text)) {
				                                    let errorMsg = {start: _localctx._arguments.start.charPositionInLine, end: _localctx._arguments.start.charPositionInLine+_localctx._arguments.text.length, message: "parameter "+ param_text +" is already declared"};
				                                    this.notifyErrorListeners(JSON.stringify(errorMsg));
				                                }
				                                json2[param_text] = 1;
				                            });
				                            let newGate = {"params": json1, arguments: json2}
				                            this.gateList[gateName] = newGate;
				                    
				this.state = 751;
				this.match(TodoLangGrammarParser.NEWLINE);
				this.state = 755;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (((((_la - 9)) & ~0x1F) === 0 && ((1 << (_la - 9)) & ((1 << (TodoLangGrammarParser.ECHO_GATE - 9)) | (1 << (TodoLangGrammarParser.H_GATE - 9)) | (1 << (TodoLangGrammarParser.X_GATE - 9)) | (1 << (TodoLangGrammarParser.T_GATE - 9)) | (1 << (TodoLangGrammarParser.S_GATE - 9)) | (1 << (TodoLangGrammarParser.Y_GATE - 9)) | (1 << (TodoLangGrammarParser.Z_GATE - 9)) | (1 << (TodoLangGrammarParser.X1_GATE - 9)) | (1 << (TodoLangGrammarParser.Y1_GATE - 9)) | (1 << (TodoLangGrammarParser.Z1_GATE - 9)) | (1 << (TodoLangGrammarParser.I_GATE - 9)) | (1 << (TodoLangGrammarParser.U2_GATE - 9)) | (1 << (TodoLangGrammarParser.RPHI_GATE - 9)) | (1 << (TodoLangGrammarParser.U3_GATE - 9)) | (1 << (TodoLangGrammarParser.U4_GATE - 9)) | (1 << (TodoLangGrammarParser.RX_GATE - 9)) | (1 << (TodoLangGrammarParser.RY_GATE - 9)) | (1 << (TodoLangGrammarParser.RZ_GATE - 9)) | (1 << (TodoLangGrammarParser.U1_GATE - 9)) | (1 << (TodoLangGrammarParser.CNOT_GATE - 9)) | (1 << (TodoLangGrammarParser.CZ_GATE - 9)) | (1 << (TodoLangGrammarParser.CU_GATE - 9)) | (1 << (TodoLangGrammarParser.ISWAP_GATE - 9)) | (1 << (TodoLangGrammarParser.SQISWAP_GATE - 9)) | (1 << (TodoLangGrammarParser.SWAPZ1_GATE - 9)) | (1 << (TodoLangGrammarParser.ISWAPTHETA_GATE - 9)) | (1 << (TodoLangGrammarParser.CR_GATE - 9)) | (1 << (TodoLangGrammarParser.TOFFOLI_GATE - 9)) | (1 << (TodoLangGrammarParser.DAGGER_KEY - 9)))) !== 0) || _la === TodoLangGrammarParser.CONTROL_KEY || _la === TodoLangGrammarParser.Identifier) {
					{
					{
					this.state = 752;
					this.user_defined_gate();
					}
					}
					this.state = 757;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 758;
				this.match(TodoLangGrammarParser.ENDQGATE_KEY);
				this.state = 759;
				this.match(TodoLangGrammarParser.NEWLINE);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public id(): IdContext {
		let _localctx: IdContext = new IdContext(this._ctx, this.state);
		this.enterRule(_localctx, 110, TodoLangGrammarParser.RULE_id);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 763;
			this.match(TodoLangGrammarParser.Identifier);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public id_list(): Id_listContext {
		let _localctx: Id_listContext = new Id_listContext(this._ctx, this.state);
		this.enterRule(_localctx, 112, TodoLangGrammarParser.RULE_id_list);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 765;
			_localctx._id = this.id();
			_localctx._params.push(_localctx._id);
			this.state = 770;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 53, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 766;
					this.match(TodoLangGrammarParser.COMMA);
					this.state = 767;
					_localctx._id = this.id();
					_localctx._params.push(_localctx._id);
					}
					}
				}
				this.state = 772;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 53, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public gate_name(): Gate_nameContext {
		let _localctx: Gate_nameContext = new Gate_nameContext(this._ctx, this.state);
		this.enterRule(_localctx, 114, TodoLangGrammarParser.RULE_gate_name);
		try {
			this.state = 783;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case TodoLangGrammarParser.ECHO_GATE:
			case TodoLangGrammarParser.H_GATE:
			case TodoLangGrammarParser.X_GATE:
			case TodoLangGrammarParser.T_GATE:
			case TodoLangGrammarParser.S_GATE:
			case TodoLangGrammarParser.Y_GATE:
			case TodoLangGrammarParser.Z_GATE:
			case TodoLangGrammarParser.X1_GATE:
			case TodoLangGrammarParser.Y1_GATE:
			case TodoLangGrammarParser.Z1_GATE:
			case TodoLangGrammarParser.I_GATE:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 773;
				this.single_gate_without_parameter_type();
				}
				break;
			case TodoLangGrammarParser.RX_GATE:
			case TodoLangGrammarParser.RY_GATE:
			case TodoLangGrammarParser.RZ_GATE:
			case TodoLangGrammarParser.U1_GATE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 774;
				this.single_gate_with_one_parameter_type();
				}
				break;
			case TodoLangGrammarParser.U2_GATE:
			case TodoLangGrammarParser.RPHI_GATE:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 775;
				this.single_gate_with_two_parameter_type();
				}
				break;
			case TodoLangGrammarParser.U3_GATE:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 776;
				this.single_gate_with_three_parameter_type();
				}
				break;
			case TodoLangGrammarParser.U4_GATE:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 777;
				this.single_gate_with_four_parameter_type();
				}
				break;
			case TodoLangGrammarParser.CNOT_GATE:
			case TodoLangGrammarParser.CZ_GATE:
			case TodoLangGrammarParser.ISWAP_GATE:
			case TodoLangGrammarParser.SQISWAP_GATE:
			case TodoLangGrammarParser.SWAPZ1_GATE:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 778;
				this.double_gate_without_parameter_type();
				}
				break;
			case TodoLangGrammarParser.ISWAPTHETA_GATE:
			case TodoLangGrammarParser.CR_GATE:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 779;
				this.double_gate_with_one_parameter_type();
				}
				break;
			case TodoLangGrammarParser.CU_GATE:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 780;
				this.double_gate_with_four_parameter_type();
				}
				break;
			case TodoLangGrammarParser.TOFFOLI_GATE:
				this.enterOuterAlt(_localctx, 9);
				{
				this.state = 781;
				this.triple_gate_without_parameter_type();
				}
				break;
			case TodoLangGrammarParser.Identifier:
				this.enterOuterAlt(_localctx, 10);
				{
				this.state = 782;
				this.id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public constant_expression(): Constant_expressionContext {
		let _localctx: Constant_expressionContext = new Constant_expressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 116, TodoLangGrammarParser.RULE_constant_expression);
		try {
			this.state = 794;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 55, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 785;
				this.constant();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 786;
				this.constant();
				this.state = 787;
				this.arithmetic_op();
				this.state = 788;
				_localctx._denominator = this.constant();
				 if(_localctx.arithmetic_op()!.DIV() != null) {
				        if(_localctx._denominator.text === '0') {
				            let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length, message: "The denominator cannot be zero"};
				            this.notifyErrorListeners(JSON.stringify(errorMsg));
				        }
				    } 
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 791;
				this.arithmetic_op();
				this.state = 792;
				this.constant();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public arithmetic_op(): Arithmetic_opContext {
		let _localctx: Arithmetic_opContext = new Arithmetic_opContext(this._ctx, this.state);
		this.enterRule(_localctx, 118, TodoLangGrammarParser.RULE_arithmetic_op);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 796;
			_la = this._input.LA(1);
			if (!(((((_la - 60)) & ~0x1F) === 0 && ((1 << (_la - 60)) & ((1 << (TodoLangGrammarParser.PLUS - 60)) | (1 << (TodoLangGrammarParser.MINUS - 60)) | (1 << (TodoLangGrammarParser.MUL - 60)) | (1 << (TodoLangGrammarParser.DIV - 60)))) !== 0))) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public unary_op(): Unary_opContext {
		let _localctx: Unary_opContext = new Unary_opContext(this._ctx, this.state);
		this.enterRule(_localctx, 120, TodoLangGrammarParser.RULE_unary_op);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 798;
			_la = this._input.LA(1);
			if (!(_la === TodoLangGrammarParser.PLUS || _la === TodoLangGrammarParser.MINUS)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public constant(): ConstantContext {
		let _localctx: ConstantContext = new ConstantContext(this._ctx, this.state);
		this.enterRule(_localctx, 122, TodoLangGrammarParser.RULE_constant);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 800;
			_la = this._input.LA(1);
			if (!(_la === TodoLangGrammarParser.PI || _la === TodoLangGrammarParser.Integer_Literal || _la === TodoLangGrammarParser.Double_Literal)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public sempred(_localctx: RuleContext, ruleIndex: number, predIndex: number): boolean {
		switch (ruleIndex) {
		case 29:
			return this.multiplicative_expression_sempred(_localctx as Multiplicative_expressionContext, predIndex);

		case 30:
			return this.addtive_expression_sempred(_localctx as Addtive_expressionContext, predIndex);

		case 31:
			return this.relational_expression_sempred(_localctx as Relational_expressionContext, predIndex);

		case 32:
			return this.equality_expression_sempred(_localctx as Equality_expressionContext, predIndex);

		case 33:
			return this.logical_and_expression_sempred(_localctx as Logical_and_expressionContext, predIndex);

		case 34:
			return this.logical_or_expression_sempred(_localctx as Logical_or_expressionContext, predIndex);

		case 53:
			return this.exp_sempred(_localctx as ExpContext, predIndex);
		}
		return true;
	}
	private multiplicative_expression_sempred(_localctx: Multiplicative_expressionContext, predIndex: number): boolean {
		switch (predIndex) {
		case 0:
			return this.precpred(this._ctx, 2);

		case 1:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private addtive_expression_sempred(_localctx: Addtive_expressionContext, predIndex: number): boolean {
		switch (predIndex) {
		case 2:
			return this.precpred(this._ctx, 2);

		case 3:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private relational_expression_sempred(_localctx: Relational_expressionContext, predIndex: number): boolean {
		switch (predIndex) {
		case 4:
			return this.precpred(this._ctx, 4);

		case 5:
			return this.precpred(this._ctx, 3);

		case 6:
			return this.precpred(this._ctx, 2);

		case 7:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private equality_expression_sempred(_localctx: Equality_expressionContext, predIndex: number): boolean {
		switch (predIndex) {
		case 8:
			return this.precpred(this._ctx, 2);

		case 9:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private logical_and_expression_sempred(_localctx: Logical_and_expressionContext, predIndex: number): boolean {
		switch (predIndex) {
		case 10:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private logical_or_expression_sempred(_localctx: Logical_or_expressionContext, predIndex: number): boolean {
		switch (predIndex) {
		case 11:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}
	private exp_sempred(_localctx: ExpContext, predIndex: number): boolean {
		switch (predIndex) {
		case 12:
			return this.precpred(this._ctx, 4);

		case 13:
			return this.precpred(this._ctx, 3);

		case 14:
			return this.precpred(this._ctx, 2);

		case 15:
			return this.precpred(this._ctx, 1);
		}
		return true;
	}

	private static readonly _serializedATNSegments: number = 2;
	private static readonly _serializedATNSegment0: string =
		"\x03\uC91D\uCABA\u058D\uAFBA\u4F53\u0607\uEA8B\uC241\x03O\u0325\x04\x02" +
		"\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04\x07" +
		"\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x04\f\t\f\x04\r\t\r\x04" +
		"\x0E\t\x0E\x04\x0F\t\x0F\x04\x10\t\x10\x04\x11\t\x11\x04\x12\t\x12\x04" +
		"\x13\t\x13\x04\x14\t\x14\x04\x15\t\x15\x04\x16\t\x16\x04\x17\t\x17\x04" +
		"\x18\t\x18\x04\x19\t\x19\x04\x1A\t\x1A\x04\x1B\t\x1B\x04\x1C\t\x1C\x04" +
		"\x1D\t\x1D\x04\x1E\t\x1E\x04\x1F\t\x1F\x04 \t \x04!\t!\x04\"\t\"\x04#" +
		"\t#\x04$\t$\x04%\t%\x04&\t&\x04\'\t\'\x04(\t(\x04)\t)\x04*\t*\x04+\t+" +
		"\x04,\t,\x04-\t-\x04.\t.\x04/\t/\x040\t0\x041\t1\x042\t2\x043\t3\x044" +
		"\t4\x045\t5\x046\t6\x047\t7\x048\t8\x049\t9\x04:\t:\x04;\t;\x04<\t<\x04" +
		"=\t=\x04>\t>\x04?\t?\x03\x02\x07\x02\x80\n\x02\f\x02\x0E\x02\x83\v\x02" +
		"\x03\x02\x07\x02\x86\n\x02\f\x02\x0E\x02\x89\v\x02\x03\x02\x07\x02\x8C" +
		"\n\x02\f\x02\x0E\x02\x8F\v\x02\x03\x02\x06\x02\x92\n\x02\r\x02\x0E\x02" +
		"\x93\x03\x02\x03\x02\x03\x03\x03\x03\x05\x03\x9A\n\x03\x03\x04\x03\x04" +
		"\x03\x04\x03\x04\x03\x04\x03\x05\x03\x05\x03\x05\x03\x05\x03\x05\x03\x06" +
		"\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06" +
		"\x05\x06\xB0\n\x06\x03\x07\x03\x07\x03\x07\x03\x07\x03\b\x03\b\x03\b\x03" +
		"\b\x03\t\x03\t\x03\t\x03\t\x03\n\x03\n\x03\n\x03\n\x03\n\x03\n\x03\n\x03" +
		"\n\x05\n\xC6\n\n\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v" +
		"\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x03\v\x05\v\xD8\n\v\x03\f\x03\f\x03" +
		"\f\x03\f\x03\f\x03\f\x03\f\x03\f\x03\f\x03\f\x03\f\x03\f\x03\f\x03\f\x03" +
		"\f\x03\f\x03\f\x03\f\x03\f\x03\f\x05\f\xEE\n\f\x03\r\x03\r\x03\r\x03\r" +
		"\x03\r\x03\r\x03\r\x03\r\x03\r\x03\r\x03\r\x03\r\x03\r\x03\r\x03\r\x03" +
		"\r\x03\r\x03\r\x03\r\x03\r\x03\r\x03\r\x03\r\x03\r\x05\r\u0108\n\r\x03" +
		"\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03" +
		"\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03" +
		"\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03\x0E\x03" +
		"\x0E\x05\x0E\u0126\n\x0E\x03\x0F\x03\x0F\x03\x0F\x03\x0F\x03\x0F\x03\x0F" +
		"\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10\x03\x10" +
		"\x03\x10\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11" +
		"\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11\x03\x12" +
		"\x03\x12\x03\x12\x03\x12\x03\x12\x03\x12\x03\x12\x03\x12\x03\x13\x03\x13" +
		"\x03\x13\x03\x13\x07\x13\u0154\n\x13\f\x13\x0E\x13\u0157\v\x13\x03\x13" +
		"\x03\x13\x03\x13\x03\x13\x03\x13\x03\x13\x07\x13\u015F\n\x13\f\x13\x0E" +
		"\x13\u0162\v\x13\x03\x13\x03\x13\x03\x13\x03\x13\x03\x13\x07\x13\u0169" +
		"\n\x13\f\x13\x0E\x13\u016C\v\x13\x03\x13\x03\x13\x03\x13\x05\x13\u0171" +
		"\n\x13\x03\x14\x03\x14\x03\x15\x03\x15\x03\x16\x03\x16\x03\x17\x03\x17" +
		"\x03\x18\x03\x18\x03\x19\x03\x19\x03\x1A\x03\x1A\x03\x1B\x03\x1B\x03\x1C" +
		"\x03\x1C\x03\x1D\x03\x1D\x03\x1D\x03\x1D\x03\x1D\x03\x1D\x05\x1D\u018B" +
		"\n\x1D\x03\x1E\x03\x1E\x03\x1E\x03\x1E\x03\x1E\x03\x1E\x03\x1E\x05\x1E" +
		"\u0194\n\x1E\x03\x1F\x03\x1F\x03\x1F\x03\x1F\x03\x1F\x03\x1F\x03\x1F\x03" +
		"\x1F\x03\x1F\x03\x1F\x03\x1F\x07\x1F\u01A1\n\x1F\f\x1F\x0E\x1F\u01A4\v" +
		"\x1F\x03 \x03 \x03 \x03 \x03 \x03 \x03 \x03 \x03 \x07 \u01AF\n \f \x0E" +
		" \u01B2\v \x03!\x03!\x03!\x03!\x03!\x03!\x03!\x03!\x03!\x03!\x03!\x03" +
		"!\x03!\x03!\x03!\x07!\u01C3\n!\f!\x0E!\u01C6\v!\x03\"\x03\"\x03\"\x03" +
		"\"\x03\"\x03\"\x03\"\x03\"\x03\"\x07\"\u01D1\n\"\f\"\x0E\"\u01D4\v\"\x03" +
		"#\x03#\x03#\x03#\x03#\x03#\x07#\u01DC\n#\f#\x0E#\u01DF\v#\x03$\x03$\x03" +
		"$\x03$\x03$\x03$\x07$\u01E7\n$\f$\x0E$\u01EA\v$\x03%\x03%\x03%\x03%\x03" +
		"%\x05%\u01F1\n%\x03&\x03&\x03\'\x03\'\x03\'\x07\'\u01F8\n\'\f\'\x0E\'" +
		"\u01FB\v\'\x03\'\x03\'\x03\'\x07\'\u0200\n\'\f\'\x0E\'\u0203\v\'\x05\'" +
		"\u0205\n\'\x03(\x03(\x03(\x03(\x03(\x03(\x03(\x03(\x03(\x03(\x03(\x03" +
		"(\x03(\x03(\x03(\x03(\x05(\u0217\n(\x03)\x03)\x03)\x03)\x07)\u021D\n)" +
		"\f)\x0E)\u0220\v)\x03)\x03)\x03)\x03)\x03*\x03*\x03*\x03*\x03*\x07*\u022B" +
		"\n*\f*\x0E*\u022E\v*\x03*\x03*\x03*\x03*\x03+\x03+\x03+\x07+\u0237\n+" +
		"\f+\x0E+\u023A\v+\x03,\x03,\x03,\x03,\x07,\u0240\n,\f,\x0E,\u0243\v,\x03" +
		",\x03,\x03,\x03,\x03,\x03,\x03,\x03,\x07,\u024D\n,\f,\x0E,\u0250\v,\x03" +
		",\x03,\x03,\x05,\u0255\n,\x03-\x03-\x03-\x03-\x07-\u025B\n-\f-\x0E-\u025E" +
		"\v-\x03-\x03-\x03-\x03.\x03.\x03.\x03.\x03.\x03.\x03.\x03.\x03.\x03.\x03" +
		".\x03.\x05.\u026F\n.\x03/\x03/\x03/\x03/\x03/\x03/\x03/\x05/\u0278\n/" +
		"\x030\x030\x030\x030\x030\x030\x030\x050\u0281\n0\x031\x031\x031\x032" +
		"\x032\x032\x032\x032\x032\x032\x032\x032\x032\x032\x032\x032\x032\x03" +
		"2\x032\x052\u0296\n2\x033\x033\x033\x063\u029B\n3\r3\x0E3\u029C\x033\x03" +
		"3\x033\x034\x034\x034\x034\x034\x064\u02A7\n4\r4\x0E4\u02A8\x034\x034" +
		"\x034\x034\x035\x035\x035\x055\u02B2\n5\x036\x036\x036\x076\u02B7\n6\f" +
		"6\x0E6\u02BA\v6\x037\x037\x037\x037\x037\x037\x037\x037\x037\x037\x03" +
		"7\x057\u02C7\n7\x037\x037\x037\x037\x037\x037\x037\x037\x037\x037\x03" +
		"7\x037\x037\x037\x077\u02D7\n7\f7\x0E7\u02DA\v7\x038\x038\x038\x038\x03" +
		"8\x038\x078\u02E2\n8\f8\x0E8\u02E5\v8\x038\x038\x038\x038\x038\x038\x03" +
		"8\x038\x038\x038\x038\x038\x038\x078\u02F4\n8\f8\x0E8\u02F7\v8\x038\x03" +
		"8\x038\x058\u02FC\n8\x039\x039\x03:\x03:\x03:\x07:\u0303\n:\f:\x0E:\u0306" +
		"\v:\x03;\x03;\x03;\x03;\x03;\x03;\x03;\x03;\x03;\x03;\x05;\u0312\n;\x03" +
		"<\x03<\x03<\x03<\x03<\x03<\x03<\x03<\x03<\x05<\u031D\n<\x03=\x03=\x03" +
		">\x03>\x03?\x03?\x03?\x02\x02\t<>@BDFl@\x02\x02\x04\x02\x06\x02\b\x02" +
		"\n\x02\f\x02\x0E\x02\x10\x02\x12\x02\x14\x02\x16\x02\x18\x02\x1A\x02\x1C" +
		"\x02\x1E\x02 \x02\"\x02$\x02&\x02(\x02*\x02,\x02.\x020\x022\x024\x026" +
		"\x028\x02:\x02<\x02>\x02@\x02B\x02D\x02F\x02H\x02J\x02L\x02N\x02P\x02" +
		"R\x02T\x02V\x02X\x02Z\x02\\\x02^\x02`\x02b\x02d\x02f\x02h\x02j\x02l\x02" +
		"n\x02p\x02r\x02t\x02v\x02x\x02z\x02|\x02\x02\n\x04\x02\v\r\x0F\x16\x03" +
		"\x02\x1B\x1E\x03\x02\x17\x18\x04\x02\x1F \"$\x03\x02%&\x03\x02>A\x03\x02" +
		">?\x04\x02\x03\x03IJ\x02\u0343\x02\x81\x03\x02\x02\x02\x04\x99\x03\x02" +
		"\x02\x02\x06\x9B\x03\x02\x02\x02\b\xA0\x03\x02\x02\x02\n\xAF\x03\x02\x02" +
		"\x02\f\xB1\x03\x02\x02\x02\x0E\xB5\x03\x02\x02\x02\x10\xB9\x03\x02\x02" +
		"\x02\x12\xC5\x03\x02\x02\x02\x14\xD7\x03\x02\x02\x02\x16\xED\x03\x02\x02" +
		"\x02\x18\u0107\x03\x02\x02\x02\x1A\u0125\x03\x02\x02\x02\x1C\u0127\x03" +
		"\x02\x02\x02\x1E\u012D\x03\x02\x02\x02 \u0137\x03\x02\x02\x02\"\u0147" +
		"\x03\x02\x02\x02$\u0170\x03\x02\x02\x02&\u0172\x03\x02\x02\x02(\u0174" +
		"\x03\x02\x02\x02*\u0176\x03\x02\x02\x02,\u0178\x03\x02\x02\x02.\u017A" +
		"\x03\x02\x02\x020\u017C\x03\x02\x02\x022\u017E\x03\x02\x02\x024\u0180" +
		"\x03\x02\x02\x026\u0182\x03\x02\x02\x028\u018A\x03\x02\x02\x02:\u0193" +
		"\x03\x02\x02\x02<\u0195\x03\x02\x02\x02>\u01A5\x03\x02\x02\x02@\u01B3" +
		"\x03\x02\x02\x02B\u01C7\x03\x02\x02\x02D\u01D5\x03\x02\x02\x02F\u01E0" +
		"\x03\x02\x02\x02H\u01F0\x03\x02\x02\x02J\u01F2\x03\x02\x02\x02L\u0204" +
		"\x03\x02\x02\x02N\u0216\x03\x02\x02\x02P\u0218\x03\x02\x02\x02R\u0225" +
		"\x03\x02\x02\x02T\u0233\x03\x02\x02\x02V\u0254\x03\x02\x02\x02X\u0256" +
		"\x03\x02\x02\x02Z\u026E\x03\x02\x02\x02\\\u0277\x03\x02\x02\x02^\u0280" +
		"\x03\x02\x02\x02`\u0282\x03\x02\x02\x02b\u0295\x03\x02\x02\x02d\u0297" +
		"\x03\x02\x02\x02f\u02A1\x03\x02\x02\x02h\u02B1\x03\x02\x02\x02j\u02B3" +
		"\x03\x02\x02\x02l\u02C6\x03\x02\x02\x02n\u02FB\x03\x02\x02\x02p\u02FD" +
		"\x03\x02\x02\x02r\u02FF\x03\x02\x02\x02t\u0311\x03\x02\x02\x02v\u031C" +
		"\x03\x02\x02\x02x\u031E\x03\x02\x02\x02z\u0320\x03\x02\x02\x02|\u0322" +
		"\x03\x02\x02\x02~\x80\x07G\x02\x02\x7F~\x03\x02\x02\x02\x80\x83\x03\x02" +
		"\x02\x02\x81\x7F\x03\x02\x02\x02\x81\x82\x03\x02\x02\x02\x82\x87\x03\x02" +
		"\x02\x02\x83\x81\x03\x02\x02\x02\x84\x86\x05\x04\x03\x02\x85\x84\x03\x02" +
		"\x02\x02\x86\x89\x03\x02\x02\x02\x87\x85\x03\x02\x02\x02\x87\x88\x03\x02" +
		"\x02\x02\x88\x8D\x03\x02\x02\x02\x89\x87\x03\x02\x02\x02\x8A\x8C\x05n" +
		"8\x02\x8B\x8A\x03\x02\x02\x02\x8C\x8F\x03\x02\x02\x02\x8D\x8B\x03\x02" +
		"\x02\x02\x8D\x8E\x03\x02\x02\x02\x8E\x91\x03\x02\x02\x02\x8F\x8D\x03\x02" +
		"\x02\x02\x90\x92\x05N(\x02\x91\x90\x03\x02\x02\x02\x92\x93\x03\x02\x02" +
		"\x02\x93\x91\x03\x02\x02\x02\x93\x94\x03\x02\x02\x02\x94\x95\x03\x02\x02" +
		"\x02\x95\x96\x07\x02\x02\x03\x96\x03\x03\x02\x02\x02\x97\x9A\x05\x06\x04" +
		"\x02\x98\x9A\x05\b\x05\x02\x99\x97\x03\x02\x02\x02\x99\x98\x03\x02\x02" +
		"\x02\x9A\x05\x03\x02\x02\x02\x9B\x9C\x07\x04\x02\x02\x9C\x9D\x07I\x02" +
		"\x02\x9D\x9E\b\x04\x01\x02\x9E\x9F\x07G\x02\x02\x9F\x07\x03\x02\x02\x02" +
		"\xA0\xA1\x07\x05\x02\x02\xA1\xA2\x07I\x02\x02\xA2\xA3\b\x05\x01\x02\xA3" +
		"\xA4\x07G\x02\x02\xA4\t\x03\x02\x02\x02\xA5\xB0\x05\x12\n\x02\xA6\xB0" +
		"\x05\x14\v\x02\xA7\xB0\x05\x16\f\x02\xA8\xB0\x05\x18\r\x02\xA9\xB0\x05" +
		"\x1A\x0E\x02\xAA\xB0\x05\x1C\x0F\x02\xAB\xB0\x05\x1E\x10\x02\xAC\xB0\x05" +
		" \x11\x02\xAD\xB0\x05\"\x12\x02\xAE\xB0\x05$\x13\x02\xAF\xA5\x03\x02\x02" +
		"\x02\xAF\xA6\x03\x02\x02\x02\xAF\xA7\x03\x02\x02\x02\xAF\xA8\x03\x02\x02" +
		"\x02\xAF\xA9\x03\x02\x02\x02\xAF\xAA\x03\x02\x02\x02\xAF\xAB\x03\x02\x02" +
		"\x02\xAF\xAC\x03\x02\x02\x02\xAF\xAD\x03\x02\x02\x02\xAF\xAE\x03\x02\x02" +
		"\x02\xB0\v\x03\x02\x02\x02\xB1\xB2\x07E\x02\x02\xB2\xB3\x07I\x02\x02\xB3" +
		"\xB4\x07F\x02\x02\xB4\r\x03\x02\x02\x02\xB5\xB6\x07\x07\x02\x02\xB6\xB7" +
		"\x05\f\x07\x02\xB7\xB8\b\b\x01\x02\xB8\x0F\x03\x02\x02\x02\xB9\xBA\x07" +
		"\x06\x02\x02\xBA\xBB\x05\f\x07\x02\xBB\xBC\b\t\x01\x02\xBC\x11\x03\x02" +
		"\x02\x02\xBD\xBE\x05&\x14\x02\xBE\xBF\x05\x10\t\x02\xBF\xC0\b\n\x01\x02" +
		"\xC0\xC6\x03\x02\x02\x02\xC1\xC2\x05&\x14\x02\xC2\xC3\x07\x06\x02\x02" +
		"\xC3\xC4\b\n\x01\x02\xC4\xC6\x03\x02\x02\x02\xC5\xBD\x03\x02\x02\x02\xC5" +
		"\xC1\x03\x02\x02\x02\xC6\x13\x03\x02\x02\x02\xC7\xC8\x05(\x15\x02\xC8" +
		"\xC9\x05\x10\t\x02\xC9\xCA\x07B\x02\x02\xCA\xCB\x07C\x02\x02\xCB\xCC\x05" +
		"v<\x02\xCC\xCD\x07D\x02\x02\xCD\xCE\b\v\x01\x02\xCE\xD8\x03\x02\x02\x02" +
		"\xCF\xD0\x05(\x15\x02\xD0\xD1\x07\x06\x02\x02\xD1\xD2\x07B\x02\x02\xD2" +
		"\xD3\x07C\x02\x02\xD3\xD4\x05J&\x02\xD4\xD5\x07D\x02\x02\xD5\xD6\b\v\x01" +
		"\x02\xD6\xD8\x03\x02\x02\x02\xD7\xC7\x03\x02\x02\x02\xD7\xCF\x03\x02\x02" +
		"\x02\xD8\x15\x03\x02\x02\x02\xD9\xDA\x05*\x16\x02\xDA\xDB\x05\x10\t\x02" +
		"\xDB\xDC\x07B\x02\x02\xDC\xDD\x07C\x02\x02\xDD\xDE\x05v<\x02\xDE\xDF\x07" +
		"B\x02\x02\xDF\xE0\x05v<\x02\xE0\xE1\x07D\x02\x02\xE1\xE2\b\f\x01\x02\xE2" +
		"\xEE\x03\x02\x02\x02\xE3\xE4\x05*\x16\x02\xE4\xE5\x07\x06\x02\x02\xE5" +
		"\xE6\x07B\x02\x02\xE6\xE7\x07C\x02\x02\xE7\xE8\x05v<\x02\xE8\xE9\x07B" +
		"\x02\x02\xE9\xEA\x05v<\x02\xEA\xEB\x07D\x02\x02\xEB\xEC\b\f\x01\x02\xEC" +
		"\xEE\x03\x02\x02\x02\xED\xD9\x03\x02\x02\x02\xED\xE3\x03\x02\x02\x02\xEE" +
		"\x17\x03\x02\x02\x02\xEF\xF0\x05,\x17\x02\xF0\xF1\x05\x10\t\x02\xF1\xF2" +
		"\x07B\x02\x02\xF2\xF3\x07C\x02\x02\xF3\xF4\x05v<\x02\xF4\xF5\x07B\x02" +
		"\x02\xF5\xF6\x05v<\x02\xF6\xF7\x07B\x02\x02\xF7\xF8\x05v<\x02\xF8\xF9" +
		"\x07D\x02\x02\xF9\xFA\b\r\x01\x02\xFA\u0108\x03\x02\x02\x02\xFB\xFC\x05" +
		",\x17\x02\xFC\xFD\x07\x06\x02\x02\xFD\xFE\x07B\x02\x02\xFE\xFF\x07C\x02" +
		"\x02\xFF\u0100\x05v<\x02\u0100\u0101\x07B\x02\x02\u0101\u0102\x05v<\x02" +
		"\u0102\u0103\x07B\x02\x02\u0103\u0104\x05v<\x02\u0104\u0105\x07D\x02\x02" +
		"\u0105\u0106\b\r\x01\x02\u0106\u0108\x03\x02\x02\x02\u0107\xEF\x03\x02" +
		"\x02\x02\u0107\xFB\x03\x02\x02\x02\u0108\x19\x03\x02\x02\x02\u0109\u010A" +
		"\x05.\x18\x02\u010A\u010B\x05\x10\t\x02\u010B\u010C\x07B\x02\x02\u010C" +
		"\u010D\x07C\x02\x02\u010D\u010E\x05v<\x02\u010E\u010F\x07B\x02\x02\u010F" +
		"\u0110\x05v<\x02\u0110\u0111\x07B\x02\x02\u0111\u0112\x05v<\x02\u0112" +
		"\u0113\x07B\x02\x02\u0113\u0114\x05v<\x02\u0114\u0115\x07D\x02\x02\u0115" +
		"\u0116\b\x0E\x01\x02\u0116\u0126\x03\x02\x02\x02\u0117\u0118\x05.\x18" +
		"\x02\u0118\u0119\x07\x06\x02\x02\u0119\u011A\x07B\x02\x02\u011A\u011B" +
		"\x07C\x02\x02\u011B\u011C\x05v<\x02\u011C\u011D\x07B\x02\x02\u011D\u011E" +
		"\x05v<\x02\u011E\u011F\x07B\x02\x02\u011F\u0120\x05v<\x02\u0120\u0121" +
		"\x07B\x02\x02\u0121\u0122\x05v<\x02\u0122\u0123\x07D\x02\x02\u0123\u0124" +
		"\b\x0E\x01\x02\u0124\u0126\x03\x02\x02\x02\u0125\u0109\x03\x02\x02\x02" +
		"\u0125\u0117\x03\x02\x02\x02\u0126\x1B\x03\x02\x02\x02\u0127\u0128\x05" +
		"0\x19\x02\u0128\u0129\x05\x10\t\x02\u0129\u012A\x07B\x02\x02\u012A\u012B" +
		"\x05\x10\t\x02\u012B\u012C\b\x0F\x01\x02\u012C\x1D\x03\x02\x02\x02\u012D" +
		"\u012E\x052\x1A\x02\u012E\u012F\x05\x10\t\x02\u012F\u0130\x07B\x02\x02" +
		"\u0130\u0131\x05\x10\t\x02\u0131\u0132\x07B\x02\x02\u0132\u0133\x07C\x02" +
		"\x02\u0133\u0134\x05v<\x02\u0134\u0135\x07D\x02\x02\u0135\u0136\b\x10" +
		"\x01\x02\u0136\x1F\x03\x02\x02\x02\u0137\u0138\x054\x1B\x02\u0138\u0139" +
		"\x05\x10\t\x02\u0139\u013A\x07B\x02\x02\u013A\u013B\x05\x10\t\x02\u013B" +
		"\u013C\x07B\x02\x02\u013C\u013D\x07C\x02\x02\u013D\u013E\x05v<\x02\u013E" +
		"\u013F\x07B\x02\x02\u013F\u0140\x05v<\x02\u0140\u0141\x07B\x02\x02\u0141" +
		"\u0142\x05v<\x02\u0142\u0143\x07B\x02\x02\u0143\u0144\x05v<\x02\u0144" +
		"\u0145\x07D\x02\x02\u0145\u0146\b\x11\x01\x02\u0146!\x03\x02\x02\x02\u0147" +
		"\u0148\x056\x1C\x02\u0148\u0149\x05\x10\t\x02\u0149\u014A\x07B\x02\x02" +
		"\u014A\u014B\x05\x10\t\x02\u014B\u014C\x07B\x02\x02\u014C\u014D\x05\x10" +
		"\t\x02\u014D\u014E\b\x12\x01\x02\u014E#\x03\x02\x02\x02\u014F\u0150\x05" +
		"p9\x02\u0150\u0155\x05\x10\t\x02\u0151\u0152\x07B\x02\x02\u0152\u0154" +
		"\x05\x10\t\x02\u0153\u0151\x03\x02\x02\x02\u0154\u0157\x03\x02\x02\x02" +
		"\u0155\u0153\x03\x02\x02\x02\u0155\u0156\x03\x02\x02\x02\u0156\u0158\x03" +
		"\x02\x02\x02\u0157\u0155\x03\x02\x02\x02\u0158\u0159\b\x13\x01\x02\u0159" +
		"\u0171\x03\x02\x02\x02\u015A\u015B\x05p9\x02\u015B\u0160\x05\x10\t\x02" +
		"\u015C\u015D\x07B\x02\x02\u015D\u015F\x05\x10\t\x02\u015E\u015C\x03\x02" +
		"\x02\x02\u015F\u0162\x03\x02\x02\x02\u0160\u015E\x03\x02\x02\x02\u0160" +
		"\u0161\x03\x02\x02\x02\u0161\u0163\x03\x02\x02\x02\u0162\u0160\x03\x02" +
		"\x02\x02\u0163\u0164\x07B\x02\x02\u0164\u0165\x07C\x02\x02\u0165\u016A" +
		"\x05v<\x02\u0166\u0167\x07B\x02\x02\u0167\u0169\x05v<\x02\u0168\u0166" +
		"\x03\x02\x02\x02\u0169\u016C\x03\x02\x02\x02\u016A\u0168\x03\x02\x02\x02" +
		"\u016A\u016B\x03\x02\x02\x02\u016B\u016D\x03\x02\x02\x02\u016C\u016A\x03" +
		"\x02\x02\x02\u016D\u016E\x07D\x02\x02\u016E\u016F\b\x13\x01\x02\u016F" +
		"\u0171\x03\x02\x02\x02\u0170\u014F\x03\x02\x02\x02\u0170\u015A\x03\x02" +
		"\x02\x02\u0171%\x03\x02\x02\x02\u0172\u0173\t\x02\x02\x02\u0173\'\x03" +
		"\x02\x02\x02\u0174\u0175\t\x03\x02\x02\u0175)\x03\x02\x02\x02\u0176\u0177" +
		"\t\x04\x02\x02\u0177+\x03\x02\x02\x02\u0178\u0179\x07\x19\x02\x02\u0179" +
		"-\x03\x02\x02\x02\u017A\u017B\x07\x1A\x02\x02\u017B/\x03\x02\x02\x02\u017C" +
		"\u017D\t\x05\x02\x02\u017D1\x03\x02\x02\x02\u017E\u017F\t\x06\x02\x02" +
		"\u017F3\x03\x02\x02\x02\u0180\u0181\x07!\x02\x02\u01815\x03\x02\x02\x02" +
		"\u0182\u0183\x07\'\x02\x02\u01837\x03\x02\x02\x02\u0184\u018B\x05\x0E" +
		"\b\x02\u0185\u018B\x05|?\x02\u0186\u0187\x07C\x02\x02\u0187\u0188\x05" +
		"J&\x02\u0188\u0189\x07C\x02\x02\u0189\u018B\x03\x02\x02\x02\u018A\u0184" +
		"\x03\x02\x02\x02\u018A\u0185\x03\x02\x02\x02\u018A\u0186\x03\x02\x02\x02" +
		"\u018B9\x03\x02\x02\x02\u018C\u0194\x058\x1D\x02\u018D\u018E\x07>\x02" +
		"\x02\u018E\u0194\x058\x1D\x02\u018F\u0190\x07?\x02\x02\u0190\u0194\x05" +
		"8\x1D\x02\u0191\u0192\x077\x02\x02\u0192\u0194\x058\x1D\x02\u0193\u018C" +
		"\x03\x02\x02\x02\u0193\u018D\x03\x02\x02\x02\u0193\u018F\x03\x02\x02\x02" +
		"\u0193\u0191\x03\x02\x02\x02\u0194;\x03\x02\x02\x02\u0195\u0196\b\x1F" +
		"\x01\x02\u0196\u0197\x05:\x1E\x02\u0197\u01A2\x03\x02\x02\x02\u0198\u0199" +
		"\f\x04\x02\x02\u0199\u019A\x07@\x02\x02\u019A\u01A1\x05:\x1E\x02\u019B" +
		"\u019C\f\x03\x02\x02\u019C\u019D\x07A\x02\x02\u019D\u019E\x05:\x1E\x02" +
		"\u019E\u019F\b\x1F\x01\x02\u019F\u01A1\x03\x02\x02\x02\u01A0\u0198\x03" +
		"\x02\x02\x02\u01A0\u019B\x03\x02\x02\x02\u01A1\u01A4\x03\x02\x02\x02\u01A2" +
		"\u01A0\x03\x02\x02\x02\u01A2\u01A3\x03\x02\x02\x02\u01A3=\x03\x02\x02" +
		"\x02\u01A4\u01A2\x03\x02\x02\x02\u01A5\u01A6\b \x01\x02\u01A6\u01A7\x05" +
		"<\x1F\x02\u01A7\u01B0\x03\x02\x02\x02\u01A8\u01A9\f\x04\x02\x02\u01A9" +
		"\u01AA\x07>\x02\x02\u01AA\u01AF\x05<\x1F\x02\u01AB\u01AC\f\x03\x02\x02" +
		"\u01AC\u01AD\x07?\x02\x02\u01AD\u01AF\x05<\x1F\x02\u01AE\u01A8\x03\x02" +
		"\x02\x02\u01AE\u01AB\x03\x02\x02\x02\u01AF\u01B2\x03\x02\x02\x02\u01B0" +
		"\u01AE\x03\x02\x02\x02\u01B0\u01B1\x03\x02\x02\x02\u01B1?\x03\x02\x02" +
		"\x02\u01B2\u01B0\x03\x02\x02\x02\u01B3\u01B4\b!\x01\x02\u01B4\u01B5\x05" +
		"> \x02\u01B5\u01C4\x03\x02\x02\x02\u01B6\u01B7\f\x06\x02\x02\u01B7\u01B8" +
		"\x076\x02\x02\u01B8\u01C3\x05> \x02\u01B9\u01BA\f\x05\x02\x02\u01BA\u01BB" +
		"\x075\x02\x02\u01BB\u01C3\x05> \x02\u01BC\u01BD\f\x04\x02\x02\u01BD\u01BE" +
		"\x079\x02\x02\u01BE\u01C3\x05> \x02\u01BF\u01C0\f\x03\x02\x02\u01C0\u01C1" +
		"\x07:\x02\x02\u01C1\u01C3\x05> \x02\u01C2\u01B6\x03\x02\x02\x02\u01C2" +
		"\u01B9\x03\x02\x02\x02\u01C2\u01BC\x03\x02\x02\x02\u01C2\u01BF\x03\x02" +
		"\x02\x02\u01C3\u01C6\x03\x02\x02\x02\u01C4\u01C2\x03\x02\x02\x02\u01C4" +
		"\u01C5\x03\x02\x02\x02\u01C5A\x03\x02\x02\x02\u01C6\u01C4\x03\x02\x02" +
		"\x02\u01C7\u01C8\b\"\x01\x02\u01C8\u01C9\x05@!\x02\u01C9\u01D2\x03\x02" +
		"\x02\x02\u01CA\u01CB\f\x04\x02\x02\u01CB\u01CC\x078\x02\x02\u01CC\u01D1" +
		"\x05@!\x02\u01CD\u01CE\f\x03\x02\x02\u01CE\u01CF\x07;\x02\x02\u01CF\u01D1" +
		"\x05@!\x02\u01D0\u01CA\x03\x02\x02\x02\u01D0\u01CD\x03\x02\x02\x02\u01D1" +
		"\u01D4\x03\x02\x02\x02\u01D2\u01D0\x03\x02\x02\x02\u01D2\u01D3\x03\x02" +
		"\x02\x02\u01D3C\x03\x02\x02\x02\u01D4\u01D2\x03\x02\x02\x02\u01D5\u01D6" +
		"\b#\x01\x02\u01D6\u01D7\x05B\"\x02\u01D7\u01DD\x03\x02\x02\x02\u01D8\u01D9" +
		"\f\x03\x02\x02\u01D9\u01DA\x07<\x02\x02\u01DA\u01DC\x05B\"\x02\u01DB\u01D8" +
		"\x03\x02\x02\x02\u01DC\u01DF\x03\x02\x02\x02\u01DD\u01DB\x03\x02\x02\x02" +
		"\u01DD\u01DE\x03\x02\x02\x02\u01DEE\x03\x02\x02\x02\u01DF\u01DD\x03\x02" +
		"\x02\x02\u01E0\u01E1\b$\x01\x02\u01E1\u01E2\x05D#\x02\u01E2\u01E8\x03" +
		"\x02\x02\x02\u01E3\u01E4\f\x03\x02\x02\u01E4\u01E5\x07=\x02\x02\u01E5" +
		"\u01E7\x05D#\x02\u01E6\u01E3\x03\x02\x02\x02\u01E7\u01EA\x03\x02\x02\x02" +
		"\u01E8\u01E6\x03\x02\x02\x02\u01E8\u01E9\x03\x02\x02\x02\u01E9G\x03\x02" +
		"\x02\x02\u01EA\u01E8\x03\x02\x02\x02\u01EB\u01F1\x05F$\x02\u01EC\u01ED" +
		"\x05\x0E\b\x02\u01ED\u01EE\x074\x02\x02\u01EE\u01EF\x05F$\x02\u01EF\u01F1" +
		"\x03\x02\x02\x02\u01F0\u01EB\x03\x02\x02\x02\u01F0\u01EC\x03\x02\x02\x02" +
		"\u01F1I\x03\x02\x02\x02\u01F2\u01F3\x05H%\x02\u01F3K\x03\x02\x02\x02\u01F4" +
		"\u01F9\x05\x10\t\x02\u01F5\u01F6\x07B\x02\x02\u01F6\u01F8\x05\x10\t\x02" +
		"\u01F7\u01F5\x03\x02\x02\x02\u01F8\u01FB\x03\x02\x02\x02\u01F9\u01F7\x03" +
		"\x02\x02\x02\u01F9\u01FA\x03\x02\x02\x02\u01FA\u0205\x03\x02\x02\x02\u01FB" +
		"\u01F9\x03\x02\x02\x02\u01FC\u0201\x07H\x02\x02\u01FD\u01FE\x07B\x02\x02" +
		"\u01FE\u0200\x07H\x02\x02\u01FF\u01FD\x03\x02\x02\x02\u0200\u0203\x03" +
		"\x02\x02\x02\u0201\u01FF\x03\x02\x02\x02\u0201\u0202\x03\x02\x02\x02\u0202" +
		"\u0205\x03\x02\x02\x02\u0203\u0201\x03\x02\x02\x02\u0204\u01F4\x03\x02" +
		"\x02\x02\u0204\u01FC\x03\x02\x02\x02\u0205M\x03\x02\x02\x02\u0206\u0207" +
		"\x05\n\x06\x02\u0207\u0208\x07G\x02\x02\u0208\u0217\x03\x02\x02\x02\u0209" +
		"\u0217\x05R*\x02\u020A\u0217\x05V,\x02\u020B\u0217\x05X-\x02\u020C\u0217" +
		"\x05P)\x02\u020D\u020E\x05Z.\x02\u020E\u020F\x07G\x02\x02\u020F\u0217" +
		"\x03\x02\x02\x02\u0210\u0217\x05\\/\x02\u0211\u0217\x05`1\x02\u0212\u0213" +
		"\x05^0\x02\u0213\u0214\x07G\x02\x02\u0214\u0217\x03\x02\x02\x02\u0215" +
		"\u0217\x05n8\x02\u0216\u0206\x03\x02\x02\x02\u0216\u0209\x03\x02\x02\x02" +
		"\u0216\u020A\x03\x02\x02\x02\u0216\u020B\x03\x02\x02\x02\u0216\u020C\x03" +
		"\x02\x02\x02\u0216\u020D\x03\x02\x02\x02\u0216\u0210\x03\x02\x02\x02";
	private static readonly _serializedATNSegment1: string =
		"\u0216\u0211\x03\x02\x02\x02\u0216\u0212\x03\x02\x02\x02\u0216\u0215\x03" +
		"\x02\x02\x02\u0217O\x03\x02\x02\x02\u0218\u0219\x07)\x02\x02\u0219\u021A" +
		"\x07G\x02\x02\u021A\u021E\b)\x01\x02\u021B\u021D\x05N(\x02\u021C\u021B" +
		"\x03\x02\x02\x02\u021D\u0220\x03\x02\x02\x02\u021E\u021C\x03\x02\x02\x02" +
		"\u021E\u021F\x03\x02\x02\x02\u021F\u0221\x03\x02\x02\x02\u0220\u021E\x03" +
		"\x02\x02\x02\u0221\u0222\x07*\x02\x02\u0222\u0223\x07G\x02\x02\u0223\u0224" +
		"\b)\x01\x02\u0224Q\x03\x02\x02\x02\u0225\u0226\x07+\x02\x02\u0226\u0227" +
		"\x05L\'\x02\u0227\u0228\b*\x01\x02\u0228\u022C\x07G\x02\x02\u0229\u022B" +
		"\x05N(\x02\u022A\u0229\x03\x02\x02\x02\u022B\u022E\x03\x02\x02\x02\u022C" +
		"\u022A\x03\x02\x02\x02\u022C\u022D\x03\x02\x02\x02\u022D\u022F\x03\x02" +
		"\x02\x02\u022E\u022C\x03\x02\x02\x02\u022F\u0230\x07,\x02\x02\u0230\u0231" +
		"\x07G\x02\x02\u0231\u0232\b*\x01\x02\u0232S\x03\x02\x02\x02\u0233\u0234" +
		"\x07.\x02\x02\u0234\u0238\x07G\x02\x02\u0235\u0237\x05N(\x02\u0236\u0235" +
		"\x03\x02\x02\x02\u0237\u023A\x03\x02\x02\x02\u0238\u0236\x03\x02\x02\x02" +
		"\u0238\u0239\x03\x02\x02\x02\u0239U\x03\x02\x02\x02\u023A\u0238\x03\x02" +
		"\x02\x02\u023B\u023C\x07-\x02\x02\u023C\u023D\x05J&\x02\u023D\u0241\x07" +
		"G\x02\x02\u023E\u0240\x05N(\x02\u023F\u023E\x03\x02\x02\x02\u0240\u0243" +
		"\x03\x02\x02\x02\u0241\u023F\x03\x02\x02\x02\u0241\u0242\x03\x02\x02\x02" +
		"\u0242\u0244\x03\x02\x02\x02\u0243\u0241\x03\x02\x02\x02\u0244\u0245\x05" +
		"T+\x02\u0245\u0246\x07/\x02\x02\u0246\u0247\x07G\x02\x02\u0247\u0255\x03" +
		"\x02\x02\x02\u0248\u0249\x07-\x02\x02\u0249\u024A\x05J&\x02\u024A\u024E" +
		"\x07G\x02\x02\u024B\u024D\x05N(\x02\u024C\u024B\x03\x02\x02\x02\u024D" +
		"\u0250\x03\x02\x02\x02\u024E\u024C\x03\x02\x02\x02\u024E\u024F\x03\x02" +
		"\x02\x02\u024F\u0251\x03\x02\x02\x02\u0250\u024E\x03\x02\x02\x02\u0251" +
		"\u0252\x07/\x02\x02\u0252\u0253\x07G\x02\x02\u0253\u0255\x03\x02\x02\x02" +
		"\u0254\u023B\x03\x02\x02\x02\u0254\u0248\x03\x02\x02\x02\u0255W\x03\x02" +
		"\x02\x02\u0256\u0257\x070\x02\x02\u0257\u0258\x05J&\x02\u0258\u025C\x07" +
		"G\x02\x02\u0259\u025B\x05N(\x02\u025A\u0259\x03\x02\x02\x02\u025B\u025E" +
		"\x03\x02\x02\x02\u025C\u025A\x03\x02\x02\x02\u025C\u025D\x03\x02\x02\x02" +
		"\u025D\u025F\x03\x02\x02\x02\u025E\u025C\x03\x02\x02\x02\u025F\u0260\x07" +
		"1\x02\x02\u0260\u0261\x07G\x02\x02\u0261Y\x03\x02\x02\x02\u0262\u0263" +
		"\x072\x02\x02\u0263\u0264\x05\x10\t\x02\u0264\u0265\x07B\x02\x02\u0265" +
		"\u0266\x05\x0E\b\x02\u0266\u0267\b.\x01\x02\u0267\u026F\x03\x02\x02\x02" +
		"\u0268\u0269\x072\x02\x02\u0269\u026A\x07\x06\x02\x02\u026A\u026B\x07" +
		"B\x02\x02\u026B\u026C\x07\x07\x02\x02\u026C\u026D\x07G\x02\x02\u026D\u026F" +
		"\b.\x01\x02\u026E\u0262\x03\x02\x02\x02\u026E\u0268\x03\x02\x02\x02\u026F" +
		"[\x03\x02\x02\x02\u0270\u0271\x073\x02\x02\u0271\u0272\x05\x10\t\x02\u0272" +
		"\u0273\x07G\x02\x02\u0273\u0278\x03\x02\x02\x02\u0274\u0275\x073\x02\x02" +
		"\u0275\u0276\x07\x06\x02\x02\u0276\u0278\x07G\x02\x02\u0277\u0270\x03" +
		"\x02\x02\x02\u0277\u0274\x03\x02\x02\x02\u0278]\x03\x02\x02\x02\u0279" +
		"\u027A\x07\b\x02\x02\u027A\u027B\x05L\'\x02\u027B\u027C\b0\x01\x02\u027C" +
		"\u0281\x03\x02\x02\x02\u027D\u027E\x07\b\x02\x02\u027E\u027F\x07\x06\x02" +
		"\x02\u027F\u0281\x07G\x02\x02\u0280\u0279\x03\x02\x02\x02\u0280\u027D" +
		"\x03\x02\x02\x02\u0281_\x03\x02\x02\x02\u0282\u0283\x05J&\x02\u0283\u0284" +
		"\x07G\x02\x02\u0284a\x03\x02\x02\x02\u0285\u0286\x05t;\x02\u0286\u0287" +
		"\b2\x01\x02\u0287\u0288\x05r:\x02\u0288\u0289\b2\x01\x02\u0289\u028A\x07" +
		"G\x02\x02\u028A\u0296\x03\x02\x02\x02\u028B\u028C\x05t;\x02\u028C\u028D" +
		"\x05r:\x02\u028D\u028E\b2\x01\x02\u028E\u028F\x07B\x02\x02\u028F\u0290" +
		"\x07C\x02\x02\u0290\u0291\x05j6\x02\u0291\u0292\b2\x01\x02\u0292\u0293" +
		"\x07D\x02\x02\u0293\u0294\x07G\x02\x02\u0294\u0296\x03\x02\x02\x02\u0295" +
		"\u0285\x03\x02\x02\x02\u0295\u028B\x03\x02\x02\x02\u0296c\x03\x02\x02" +
		"\x02\u0297\u0298\x07)\x02\x02\u0298\u029A\x07G\x02\x02\u0299\u029B\x05" +
		"h5\x02\u029A\u0299\x03\x02\x02\x02\u029B\u029C\x03\x02\x02\x02\u029C\u029A" +
		"\x03\x02\x02\x02\u029C\u029D\x03\x02\x02\x02\u029D\u029E\x03\x02\x02\x02" +
		"\u029E\u029F\x07*\x02\x02\u029F\u02A0\x07G\x02\x02\u02A0e\x03\x02\x02" +
		"\x02\u02A1\u02A2\x07+\x02\x02\u02A2\u02A3\x05L\'\x02\u02A3\u02A4\b4\x01" +
		"\x02\u02A4\u02A6\x07G\x02\x02\u02A5\u02A7\x05h5\x02\u02A6\u02A5\x03\x02" +
		"\x02\x02\u02A7\u02A8\x03\x02\x02\x02\u02A8\u02A6\x03\x02\x02\x02\u02A8" +
		"\u02A9\x03\x02\x02\x02\u02A9\u02AA\x03\x02\x02\x02\u02AA\u02AB\x07,\x02" +
		"\x02\u02AB\u02AC\x07G\x02\x02\u02AC\u02AD\b4\x01\x02\u02ADg\x03\x02\x02" +
		"\x02\u02AE\u02B2\x05b2\x02\u02AF\u02B2\x05d3\x02\u02B0\u02B2\x05f4\x02" +
		"\u02B1\u02AE\x03\x02\x02\x02\u02B1\u02AF\x03\x02\x02\x02\u02B1\u02B0\x03" +
		"\x02\x02\x02\u02B2i\x03\x02\x02\x02\u02B3\u02B8\x05l7\x02\u02B4\u02B5" +
		"\x07B\x02\x02\u02B5\u02B7\x05l7\x02\u02B6\u02B4\x03\x02\x02\x02\u02B7" +
		"\u02BA\x03\x02\x02\x02\u02B8\u02B6\x03\x02\x02\x02\u02B8\u02B9\x03\x02" +
		"\x02\x02\u02B9k\x03\x02\x02\x02\u02BA\u02B8\x03\x02\x02\x02\u02BB\u02BC" +
		"\b7\x01\x02\u02BC\u02C7\x05p9\x02\u02BD\u02C7\x07I\x02\x02\u02BE\u02C7" +
		"\x07J\x02\x02\u02BF\u02C7\x07\x03\x02\x02\u02C0\u02C1\x07C\x02\x02\u02C1" +
		"\u02C2\x05l7\x02\u02C2\u02C3\x07D\x02\x02\u02C3\u02C7\x03\x02\x02\x02" +
		"\u02C4\u02C5\x07?\x02\x02\u02C5\u02C7\x05l7\x07\u02C6\u02BB\x03\x02\x02" +
		"\x02\u02C6\u02BD\x03\x02\x02\x02\u02C6\u02BE\x03\x02\x02\x02\u02C6\u02BF" +
		"\x03\x02\x02\x02\u02C6\u02C0\x03\x02\x02\x02\u02C6\u02C4\x03\x02\x02\x02" +
		"\u02C7\u02D8\x03\x02\x02\x02\u02C8\u02C9\f\x06\x02\x02\u02C9\u02CA\x07" +
		"@\x02\x02\u02CA\u02D7\x05l7\x07\u02CB\u02CC\f\x05\x02\x02\u02CC\u02CD" +
		"\x07A\x02\x02\u02CD\u02CE\x05l7\x06\u02CE\u02CF\b7\x01\x02\u02CF\u02D7" +
		"\x03\x02\x02\x02\u02D0\u02D1\f\x04\x02\x02\u02D1\u02D2\x07>\x02\x02\u02D2" +
		"\u02D7\x05l7\x05\u02D3\u02D4\f\x03\x02\x02\u02D4\u02D5\x07?\x02\x02\u02D5" +
		"\u02D7\x05l7\x04\u02D6\u02C8\x03\x02\x02\x02\u02D6\u02CB\x03\x02\x02\x02" +
		"\u02D6\u02D0\x03\x02\x02\x02\u02D6\u02D3\x03\x02\x02\x02\u02D7\u02DA\x03" +
		"\x02\x02\x02\u02D8\u02D6\x03\x02\x02\x02\u02D8\u02D9\x03\x02\x02\x02\u02D9" +
		"m\x03\x02\x02\x02\u02DA\u02D8\x03\x02\x02\x02\u02DB\u02DC\x07\t\x02\x02" +
		"\u02DC\u02DD\x05p9\x02\u02DD\u02DE\x05r:\x02\u02DE\u02DF\b8\x01\x02\u02DF" +
		"\u02E3\x07G\x02\x02\u02E0\u02E2\x05h5\x02\u02E1\u02E0\x03\x02\x02\x02" +
		"\u02E2\u02E5\x03\x02\x02\x02\u02E3\u02E1\x03\x02\x02\x02\u02E3\u02E4\x03" +
		"\x02\x02\x02\u02E4\u02E6\x03\x02\x02\x02\u02E5\u02E3\x03\x02\x02\x02\u02E6" +
		"\u02E7\x07\n\x02\x02\u02E7\u02E8\x07G\x02\x02\u02E8\u02FC\x03\x02\x02" +
		"\x02\u02E9\u02EA\x07\t\x02\x02\u02EA\u02EB\x05p9\x02\u02EB\u02EC\x05r" +
		":\x02\u02EC\u02ED\x07B\x02\x02\u02ED\u02EE\x07C\x02\x02\u02EE\u02EF\x05" +
		"r:\x02\u02EF\u02F0\x07D\x02\x02\u02F0\u02F1\b8\x01\x02\u02F1\u02F5\x07" +
		"G\x02\x02\u02F2\u02F4\x05h5\x02\u02F3\u02F2\x03\x02\x02\x02\u02F4\u02F7" +
		"\x03\x02\x02\x02\u02F5\u02F3\x03\x02\x02\x02\u02F5\u02F6\x03\x02\x02\x02" +
		"\u02F6\u02F8\x03\x02\x02\x02\u02F7\u02F5\x03\x02\x02\x02\u02F8\u02F9\x07" +
		"\n\x02\x02\u02F9\u02FA\x07G\x02\x02\u02FA\u02FC\x03\x02\x02\x02\u02FB" +
		"\u02DB\x03\x02\x02\x02\u02FB\u02E9\x03\x02\x02\x02\u02FCo\x03\x02\x02" +
		"\x02\u02FD\u02FE\x07H\x02\x02\u02FEq\x03\x02\x02\x02\u02FF\u0304\x05p" +
		"9\x02\u0300\u0301\x07B\x02\x02\u0301\u0303\x05p9\x02\u0302\u0300\x03\x02" +
		"\x02\x02\u0303\u0306\x03\x02\x02\x02\u0304\u0302\x03\x02\x02\x02\u0304" +
		"\u0305\x03\x02\x02\x02\u0305s\x03\x02\x02\x02\u0306\u0304\x03\x02\x02" +
		"\x02\u0307\u0312\x05&\x14\x02\u0308\u0312\x05(\x15\x02\u0309\u0312\x05" +
		"*\x16\x02\u030A\u0312\x05,\x17\x02\u030B\u0312\x05.\x18\x02\u030C\u0312" +
		"\x050\x19\x02\u030D\u0312\x052\x1A\x02\u030E\u0312\x054\x1B\x02\u030F" +
		"\u0312\x056\x1C\x02\u0310\u0312\x05p9\x02\u0311\u0307\x03\x02\x02\x02" +
		"\u0311\u0308\x03\x02\x02\x02\u0311\u0309\x03\x02\x02\x02\u0311\u030A\x03" +
		"\x02\x02\x02\u0311\u030B\x03\x02\x02\x02\u0311\u030C\x03\x02\x02\x02\u0311" +
		"\u030D\x03\x02\x02\x02\u0311\u030E\x03\x02\x02\x02\u0311\u030F\x03\x02" +
		"\x02\x02\u0311\u0310\x03\x02\x02\x02\u0312u\x03\x02\x02\x02\u0313\u031D" +
		"\x05|?\x02\u0314\u0315\x05|?\x02\u0315\u0316\x05x=\x02\u0316\u0317\x05" +
		"|?\x02\u0317\u0318\b<\x01\x02\u0318\u031D\x03\x02\x02\x02\u0319\u031A" +
		"\x05x=\x02\u031A\u031B\x05|?\x02\u031B\u031D\x03\x02\x02\x02\u031C\u0313" +
		"\x03\x02\x02\x02\u031C\u0314\x03\x02\x02\x02\u031C\u0319\x03\x02\x02\x02" +
		"\u031Dw\x03\x02\x02\x02\u031E\u031F\t\x07\x02\x02\u031Fy\x03\x02\x02\x02" +
		"\u0320\u0321\t\b\x02\x02\u0321{\x03\x02\x02\x02\u0322\u0323\t\t\x02\x02" +
		"\u0323}\x03\x02\x02\x02:\x81\x87\x8D\x93\x99\xAF\xC5\xD7\xED\u0107\u0125" +
		"\u0155\u0160\u016A\u0170\u018A\u0193\u01A0\u01A2\u01AE\u01B0\u01C2\u01C4" +
		"\u01D0\u01D2\u01DD\u01E8\u01F0\u01F9\u0201\u0204\u0216\u021E\u022C\u0238" +
		"\u0241\u024E\u0254\u025C\u026E\u0277\u0280\u0295\u029C\u02A8\u02B1\u02B8" +
		"\u02C6\u02D6\u02D8\u02E3\u02F5\u02FB\u0304\u0311\u031C";
	public static readonly _serializedATN: string = Utils.join(
		[
			TodoLangGrammarParser._serializedATNSegment0,
			TodoLangGrammarParser._serializedATNSegment1,
		],
		"",
	);
	public static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!TodoLangGrammarParser.__ATN) {
			TodoLangGrammarParser.__ATN = new ATNDeserializer().deserialize(Utils.toCharArray(TodoLangGrammarParser._serializedATN));
		}

		return TodoLangGrammarParser.__ATN;
	}

}

export class TranslationunitContext extends ParserRuleContext {
	public EOF(): TerminalNode { return this.getToken(TodoLangGrammarParser.EOF, 0); }
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(TodoLangGrammarParser.NEWLINE);
		} else {
			return this.getToken(TodoLangGrammarParser.NEWLINE, i);
		}
	}
	public declaration(): DeclarationContext[];
	public declaration(i: number): DeclarationContext;
	public declaration(i?: number): DeclarationContext | DeclarationContext[] {
		if (i === undefined) {
			return this.getRuleContexts(DeclarationContext);
		} else {
			return this.getRuleContext(i, DeclarationContext);
		}
	}
	public gate_func_statement(): Gate_func_statementContext[];
	public gate_func_statement(i: number): Gate_func_statementContext;
	public gate_func_statement(i?: number): Gate_func_statementContext | Gate_func_statementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(Gate_func_statementContext);
		} else {
			return this.getRuleContext(i, Gate_func_statementContext);
		}
	}
	public statement(): StatementContext[];
	public statement(i: number): StatementContext;
	public statement(i?: number): StatementContext | StatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StatementContext);
		} else {
			return this.getRuleContext(i, StatementContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_translationunit; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterTranslationunit) {
			listener.enterTranslationunit(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitTranslationunit) {
			listener.exitTranslationunit(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitTranslationunit) {
			return visitor.visitTranslationunit(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DeclarationContext extends ParserRuleContext {
	public qinit_declaration(): Qinit_declarationContext | undefined {
		return this.tryGetRuleContext(0, Qinit_declarationContext);
	}
	public cinit_declaration(): Cinit_declarationContext | undefined {
		return this.tryGetRuleContext(0, Cinit_declarationContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_declaration; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterDeclaration) {
			listener.enterDeclaration(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitDeclaration) {
			listener.exitDeclaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitDeclaration) {
			return visitor.visitDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Qinit_declarationContext extends ParserRuleContext {
	public QINIT_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.QINIT_KEY, 0); }
	public Integer_Literal(): TerminalNode { return this.getToken(TodoLangGrammarParser.Integer_Literal, 0); }
	public NEWLINE(): TerminalNode { return this.getToken(TodoLangGrammarParser.NEWLINE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_qinit_declaration; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterQinit_declaration) {
			listener.enterQinit_declaration(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitQinit_declaration) {
			listener.exitQinit_declaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitQinit_declaration) {
			return visitor.visitQinit_declaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Cinit_declarationContext extends ParserRuleContext {
	public CREG_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.CREG_KEY, 0); }
	public Integer_Literal(): TerminalNode { return this.getToken(TodoLangGrammarParser.Integer_Literal, 0); }
	public NEWLINE(): TerminalNode { return this.getToken(TodoLangGrammarParser.NEWLINE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_cinit_declaration; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterCinit_declaration) {
			listener.enterCinit_declaration(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitCinit_declaration) {
			listener.exitCinit_declaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitCinit_declaration) {
			return visitor.visitCinit_declaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Quantum_gate_declarationContext extends ParserRuleContext {
	public single_gate_without_parameter_declaration(): Single_gate_without_parameter_declarationContext | undefined {
		return this.tryGetRuleContext(0, Single_gate_without_parameter_declarationContext);
	}
	public single_gate_with_one_parameter_declaration(): Single_gate_with_one_parameter_declarationContext | undefined {
		return this.tryGetRuleContext(0, Single_gate_with_one_parameter_declarationContext);
	}
	public single_gate_with_two_parameter_declaration(): Single_gate_with_two_parameter_declarationContext | undefined {
		return this.tryGetRuleContext(0, Single_gate_with_two_parameter_declarationContext);
	}
	public single_gate_with_three_parameter_declaration(): Single_gate_with_three_parameter_declarationContext | undefined {
		return this.tryGetRuleContext(0, Single_gate_with_three_parameter_declarationContext);
	}
	public single_gate_with_four_parameter_declaration(): Single_gate_with_four_parameter_declarationContext | undefined {
		return this.tryGetRuleContext(0, Single_gate_with_four_parameter_declarationContext);
	}
	public double_gate_without_parameter_declaration(): Double_gate_without_parameter_declarationContext | undefined {
		return this.tryGetRuleContext(0, Double_gate_without_parameter_declarationContext);
	}
	public double_gate_with_one_parameter_declaration(): Double_gate_with_one_parameter_declarationContext | undefined {
		return this.tryGetRuleContext(0, Double_gate_with_one_parameter_declarationContext);
	}
	public double_gate_with_four_parameter_declaration(): Double_gate_with_four_parameter_declarationContext | undefined {
		return this.tryGetRuleContext(0, Double_gate_with_four_parameter_declarationContext);
	}
	public triple_gate_without_parameter_declaration(): Triple_gate_without_parameter_declarationContext | undefined {
		return this.tryGetRuleContext(0, Triple_gate_without_parameter_declarationContext);
	}
	public define_gate_declaration(): Define_gate_declarationContext | undefined {
		return this.tryGetRuleContext(0, Define_gate_declarationContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_quantum_gate_declaration; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterQuantum_gate_declaration) {
			listener.enterQuantum_gate_declaration(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitQuantum_gate_declaration) {
			listener.exitQuantum_gate_declaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitQuantum_gate_declaration) {
			return visitor.visitQuantum_gate_declaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IndexContext extends ParserRuleContext {
	public LBRACK(): TerminalNode { return this.getToken(TodoLangGrammarParser.LBRACK, 0); }
	public Integer_Literal(): TerminalNode { return this.getToken(TodoLangGrammarParser.Integer_Literal, 0); }
	public RBRACK(): TerminalNode { return this.getToken(TodoLangGrammarParser.RBRACK, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_index; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterIndex) {
			listener.enterIndex(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitIndex) {
			listener.exitIndex(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitIndex) {
			return visitor.visitIndex(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class C_KEY_declarationContext extends ParserRuleContext {
	public C_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.C_KEY, 0); }
	public index(): IndexContext {
		return this.getRuleContext(0, IndexContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_c_KEY_declaration; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterC_KEY_declaration) {
			listener.enterC_KEY_declaration(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitC_KEY_declaration) {
			listener.exitC_KEY_declaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitC_KEY_declaration) {
			return visitor.visitC_KEY_declaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Q_KEY_declarationContext extends ParserRuleContext {
	public Q_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.Q_KEY, 0); }
	public index(): IndexContext {
		return this.getRuleContext(0, IndexContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_q_KEY_declaration; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterQ_KEY_declaration) {
			listener.enterQ_KEY_declaration(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitQ_KEY_declaration) {
			listener.exitQ_KEY_declaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitQ_KEY_declaration) {
			return visitor.visitQ_KEY_declaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Single_gate_without_parameter_declarationContext extends ParserRuleContext {
	public single_gate_without_parameter_type(): Single_gate_without_parameter_typeContext {
		return this.getRuleContext(0, Single_gate_without_parameter_typeContext);
	}
	public q_KEY_declaration(): Q_KEY_declarationContext | undefined {
		return this.tryGetRuleContext(0, Q_KEY_declarationContext);
	}
	public Q_KEY(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.Q_KEY, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_single_gate_without_parameter_declaration; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterSingle_gate_without_parameter_declaration) {
			listener.enterSingle_gate_without_parameter_declaration(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitSingle_gate_without_parameter_declaration) {
			listener.exitSingle_gate_without_parameter_declaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitSingle_gate_without_parameter_declaration) {
			return visitor.visitSingle_gate_without_parameter_declaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Single_gate_with_one_parameter_declarationContext extends ParserRuleContext {
	public single_gate_with_one_parameter_type(): Single_gate_with_one_parameter_typeContext {
		return this.getRuleContext(0, Single_gate_with_one_parameter_typeContext);
	}
	public q_KEY_declaration(): Q_KEY_declarationContext | undefined {
		return this.tryGetRuleContext(0, Q_KEY_declarationContext);
	}
	public COMMA(): TerminalNode { return this.getToken(TodoLangGrammarParser.COMMA, 0); }
	public LPAREN(): TerminalNode { return this.getToken(TodoLangGrammarParser.LPAREN, 0); }
	public constant_expression(): Constant_expressionContext | undefined {
		return this.tryGetRuleContext(0, Constant_expressionContext);
	}
	public RPAREN(): TerminalNode { return this.getToken(TodoLangGrammarParser.RPAREN, 0); }
	public Q_KEY(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.Q_KEY, 0); }
	public expression(): ExpressionContext | undefined {
		return this.tryGetRuleContext(0, ExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_single_gate_with_one_parameter_declaration; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterSingle_gate_with_one_parameter_declaration) {
			listener.enterSingle_gate_with_one_parameter_declaration(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitSingle_gate_with_one_parameter_declaration) {
			listener.exitSingle_gate_with_one_parameter_declaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitSingle_gate_with_one_parameter_declaration) {
			return visitor.visitSingle_gate_with_one_parameter_declaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Single_gate_with_two_parameter_declarationContext extends ParserRuleContext {
	public single_gate_with_two_parameter_type(): Single_gate_with_two_parameter_typeContext {
		return this.getRuleContext(0, Single_gate_with_two_parameter_typeContext);
	}
	public q_KEY_declaration(): Q_KEY_declarationContext | undefined {
		return this.tryGetRuleContext(0, Q_KEY_declarationContext);
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(TodoLangGrammarParser.COMMA);
		} else {
			return this.getToken(TodoLangGrammarParser.COMMA, i);
		}
	}
	public LPAREN(): TerminalNode { return this.getToken(TodoLangGrammarParser.LPAREN, 0); }
	public constant_expression(): Constant_expressionContext[];
	public constant_expression(i: number): Constant_expressionContext;
	public constant_expression(i?: number): Constant_expressionContext | Constant_expressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(Constant_expressionContext);
		} else {
			return this.getRuleContext(i, Constant_expressionContext);
		}
	}
	public RPAREN(): TerminalNode { return this.getToken(TodoLangGrammarParser.RPAREN, 0); }
	public Q_KEY(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.Q_KEY, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_single_gate_with_two_parameter_declaration; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterSingle_gate_with_two_parameter_declaration) {
			listener.enterSingle_gate_with_two_parameter_declaration(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitSingle_gate_with_two_parameter_declaration) {
			listener.exitSingle_gate_with_two_parameter_declaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitSingle_gate_with_two_parameter_declaration) {
			return visitor.visitSingle_gate_with_two_parameter_declaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Single_gate_with_three_parameter_declarationContext extends ParserRuleContext {
	public single_gate_with_three_parameter_type(): Single_gate_with_three_parameter_typeContext {
		return this.getRuleContext(0, Single_gate_with_three_parameter_typeContext);
	}
	public q_KEY_declaration(): Q_KEY_declarationContext | undefined {
		return this.tryGetRuleContext(0, Q_KEY_declarationContext);
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(TodoLangGrammarParser.COMMA);
		} else {
			return this.getToken(TodoLangGrammarParser.COMMA, i);
		}
	}
	public LPAREN(): TerminalNode { return this.getToken(TodoLangGrammarParser.LPAREN, 0); }
	public constant_expression(): Constant_expressionContext[];
	public constant_expression(i: number): Constant_expressionContext;
	public constant_expression(i?: number): Constant_expressionContext | Constant_expressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(Constant_expressionContext);
		} else {
			return this.getRuleContext(i, Constant_expressionContext);
		}
	}
	public RPAREN(): TerminalNode { return this.getToken(TodoLangGrammarParser.RPAREN, 0); }
	public Q_KEY(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.Q_KEY, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_single_gate_with_three_parameter_declaration; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterSingle_gate_with_three_parameter_declaration) {
			listener.enterSingle_gate_with_three_parameter_declaration(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitSingle_gate_with_three_parameter_declaration) {
			listener.exitSingle_gate_with_three_parameter_declaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitSingle_gate_with_three_parameter_declaration) {
			return visitor.visitSingle_gate_with_three_parameter_declaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Single_gate_with_four_parameter_declarationContext extends ParserRuleContext {
	public single_gate_with_four_parameter_type(): Single_gate_with_four_parameter_typeContext {
		return this.getRuleContext(0, Single_gate_with_four_parameter_typeContext);
	}
	public q_KEY_declaration(): Q_KEY_declarationContext | undefined {
		return this.tryGetRuleContext(0, Q_KEY_declarationContext);
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(TodoLangGrammarParser.COMMA);
		} else {
			return this.getToken(TodoLangGrammarParser.COMMA, i);
		}
	}
	public LPAREN(): TerminalNode { return this.getToken(TodoLangGrammarParser.LPAREN, 0); }
	public constant_expression(): Constant_expressionContext[];
	public constant_expression(i: number): Constant_expressionContext;
	public constant_expression(i?: number): Constant_expressionContext | Constant_expressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(Constant_expressionContext);
		} else {
			return this.getRuleContext(i, Constant_expressionContext);
		}
	}
	public RPAREN(): TerminalNode { return this.getToken(TodoLangGrammarParser.RPAREN, 0); }
	public Q_KEY(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.Q_KEY, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_single_gate_with_four_parameter_declaration; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterSingle_gate_with_four_parameter_declaration) {
			listener.enterSingle_gate_with_four_parameter_declaration(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitSingle_gate_with_four_parameter_declaration) {
			listener.exitSingle_gate_with_four_parameter_declaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitSingle_gate_with_four_parameter_declaration) {
			return visitor.visitSingle_gate_with_four_parameter_declaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Double_gate_without_parameter_declarationContext extends ParserRuleContext {
	public double_gate_without_parameter_type(): Double_gate_without_parameter_typeContext {
		return this.getRuleContext(0, Double_gate_without_parameter_typeContext);
	}
	public q_KEY_declaration(): Q_KEY_declarationContext[];
	public q_KEY_declaration(i: number): Q_KEY_declarationContext;
	public q_KEY_declaration(i?: number): Q_KEY_declarationContext | Q_KEY_declarationContext[] {
		if (i === undefined) {
			return this.getRuleContexts(Q_KEY_declarationContext);
		} else {
			return this.getRuleContext(i, Q_KEY_declarationContext);
		}
	}
	public COMMA(): TerminalNode { return this.getToken(TodoLangGrammarParser.COMMA, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_double_gate_without_parameter_declaration; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterDouble_gate_without_parameter_declaration) {
			listener.enterDouble_gate_without_parameter_declaration(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitDouble_gate_without_parameter_declaration) {
			listener.exitDouble_gate_without_parameter_declaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitDouble_gate_without_parameter_declaration) {
			return visitor.visitDouble_gate_without_parameter_declaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Double_gate_with_one_parameter_declarationContext extends ParserRuleContext {
	public double_gate_with_one_parameter_type(): Double_gate_with_one_parameter_typeContext {
		return this.getRuleContext(0, Double_gate_with_one_parameter_typeContext);
	}
	public q_KEY_declaration(): Q_KEY_declarationContext[];
	public q_KEY_declaration(i: number): Q_KEY_declarationContext;
	public q_KEY_declaration(i?: number): Q_KEY_declarationContext | Q_KEY_declarationContext[] {
		if (i === undefined) {
			return this.getRuleContexts(Q_KEY_declarationContext);
		} else {
			return this.getRuleContext(i, Q_KEY_declarationContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(TodoLangGrammarParser.COMMA);
		} else {
			return this.getToken(TodoLangGrammarParser.COMMA, i);
		}
	}
	public LPAREN(): TerminalNode { return this.getToken(TodoLangGrammarParser.LPAREN, 0); }
	public constant_expression(): Constant_expressionContext {
		return this.getRuleContext(0, Constant_expressionContext);
	}
	public RPAREN(): TerminalNode { return this.getToken(TodoLangGrammarParser.RPAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_double_gate_with_one_parameter_declaration; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterDouble_gate_with_one_parameter_declaration) {
			listener.enterDouble_gate_with_one_parameter_declaration(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitDouble_gate_with_one_parameter_declaration) {
			listener.exitDouble_gate_with_one_parameter_declaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitDouble_gate_with_one_parameter_declaration) {
			return visitor.visitDouble_gate_with_one_parameter_declaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Double_gate_with_four_parameter_declarationContext extends ParserRuleContext {
	public double_gate_with_four_parameter_type(): Double_gate_with_four_parameter_typeContext {
		return this.getRuleContext(0, Double_gate_with_four_parameter_typeContext);
	}
	public q_KEY_declaration(): Q_KEY_declarationContext[];
	public q_KEY_declaration(i: number): Q_KEY_declarationContext;
	public q_KEY_declaration(i?: number): Q_KEY_declarationContext | Q_KEY_declarationContext[] {
		if (i === undefined) {
			return this.getRuleContexts(Q_KEY_declarationContext);
		} else {
			return this.getRuleContext(i, Q_KEY_declarationContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(TodoLangGrammarParser.COMMA);
		} else {
			return this.getToken(TodoLangGrammarParser.COMMA, i);
		}
	}
	public LPAREN(): TerminalNode { return this.getToken(TodoLangGrammarParser.LPAREN, 0); }
	public constant_expression(): Constant_expressionContext[];
	public constant_expression(i: number): Constant_expressionContext;
	public constant_expression(i?: number): Constant_expressionContext | Constant_expressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(Constant_expressionContext);
		} else {
			return this.getRuleContext(i, Constant_expressionContext);
		}
	}
	public RPAREN(): TerminalNode { return this.getToken(TodoLangGrammarParser.RPAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_double_gate_with_four_parameter_declaration; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterDouble_gate_with_four_parameter_declaration) {
			listener.enterDouble_gate_with_four_parameter_declaration(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitDouble_gate_with_four_parameter_declaration) {
			listener.exitDouble_gate_with_four_parameter_declaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitDouble_gate_with_four_parameter_declaration) {
			return visitor.visitDouble_gate_with_four_parameter_declaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Triple_gate_without_parameter_declarationContext extends ParserRuleContext {
	public triple_gate_without_parameter_type(): Triple_gate_without_parameter_typeContext {
		return this.getRuleContext(0, Triple_gate_without_parameter_typeContext);
	}
	public q_KEY_declaration(): Q_KEY_declarationContext[];
	public q_KEY_declaration(i: number): Q_KEY_declarationContext;
	public q_KEY_declaration(i?: number): Q_KEY_declarationContext | Q_KEY_declarationContext[] {
		if (i === undefined) {
			return this.getRuleContexts(Q_KEY_declarationContext);
		} else {
			return this.getRuleContext(i, Q_KEY_declarationContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(TodoLangGrammarParser.COMMA);
		} else {
			return this.getToken(TodoLangGrammarParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_triple_gate_without_parameter_declaration; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterTriple_gate_without_parameter_declaration) {
			listener.enterTriple_gate_without_parameter_declaration(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitTriple_gate_without_parameter_declaration) {
			listener.exitTriple_gate_without_parameter_declaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitTriple_gate_without_parameter_declaration) {
			return visitor.visitTriple_gate_without_parameter_declaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Define_gate_declarationContext extends ParserRuleContext {
	public _q_KEY_declaration!: Q_KEY_declarationContext;
	public _argument_list: Q_KEY_declarationContext[] = [];
	public _constant_expression!: Constant_expressionContext;
	public _angle_list: Constant_expressionContext[] = [];
	public id(): IdContext {
		return this.getRuleContext(0, IdContext);
	}
	public q_KEY_declaration(): Q_KEY_declarationContext[];
	public q_KEY_declaration(i: number): Q_KEY_declarationContext;
	public q_KEY_declaration(i?: number): Q_KEY_declarationContext | Q_KEY_declarationContext[] {
		if (i === undefined) {
			return this.getRuleContexts(Q_KEY_declarationContext);
		} else {
			return this.getRuleContext(i, Q_KEY_declarationContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(TodoLangGrammarParser.COMMA);
		} else {
			return this.getToken(TodoLangGrammarParser.COMMA, i);
		}
	}
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.LPAREN, 0); }
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.RPAREN, 0); }
	public constant_expression(): Constant_expressionContext[];
	public constant_expression(i: number): Constant_expressionContext;
	public constant_expression(i?: number): Constant_expressionContext | Constant_expressionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(Constant_expressionContext);
		} else {
			return this.getRuleContext(i, Constant_expressionContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_define_gate_declaration; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterDefine_gate_declaration) {
			listener.enterDefine_gate_declaration(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitDefine_gate_declaration) {
			listener.exitDefine_gate_declaration(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitDefine_gate_declaration) {
			return visitor.visitDefine_gate_declaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Single_gate_without_parameter_typeContext extends ParserRuleContext {
	public H_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.H_GATE, 0); }
	public T_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.T_GATE, 0); }
	public S_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.S_GATE, 0); }
	public X_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.X_GATE, 0); }
	public Y_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.Y_GATE, 0); }
	public Z_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.Z_GATE, 0); }
	public X1_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.X1_GATE, 0); }
	public Y1_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.Y1_GATE, 0); }
	public Z1_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.Z1_GATE, 0); }
	public I_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.I_GATE, 0); }
	public ECHO_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.ECHO_GATE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_single_gate_without_parameter_type; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterSingle_gate_without_parameter_type) {
			listener.enterSingle_gate_without_parameter_type(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitSingle_gate_without_parameter_type) {
			listener.exitSingle_gate_without_parameter_type(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitSingle_gate_without_parameter_type) {
			return visitor.visitSingle_gate_without_parameter_type(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Single_gate_with_one_parameter_typeContext extends ParserRuleContext {
	public RX_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.RX_GATE, 0); }
	public RY_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.RY_GATE, 0); }
	public RZ_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.RZ_GATE, 0); }
	public U1_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.U1_GATE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_single_gate_with_one_parameter_type; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterSingle_gate_with_one_parameter_type) {
			listener.enterSingle_gate_with_one_parameter_type(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitSingle_gate_with_one_parameter_type) {
			listener.exitSingle_gate_with_one_parameter_type(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitSingle_gate_with_one_parameter_type) {
			return visitor.visitSingle_gate_with_one_parameter_type(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Single_gate_with_two_parameter_typeContext extends ParserRuleContext {
	public U2_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.U2_GATE, 0); }
	public RPHI_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.RPHI_GATE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_single_gate_with_two_parameter_type; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterSingle_gate_with_two_parameter_type) {
			listener.enterSingle_gate_with_two_parameter_type(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitSingle_gate_with_two_parameter_type) {
			listener.exitSingle_gate_with_two_parameter_type(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitSingle_gate_with_two_parameter_type) {
			return visitor.visitSingle_gate_with_two_parameter_type(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Single_gate_with_three_parameter_typeContext extends ParserRuleContext {
	public U3_GATE(): TerminalNode { return this.getToken(TodoLangGrammarParser.U3_GATE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_single_gate_with_three_parameter_type; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterSingle_gate_with_three_parameter_type) {
			listener.enterSingle_gate_with_three_parameter_type(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitSingle_gate_with_three_parameter_type) {
			listener.exitSingle_gate_with_three_parameter_type(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitSingle_gate_with_three_parameter_type) {
			return visitor.visitSingle_gate_with_three_parameter_type(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Single_gate_with_four_parameter_typeContext extends ParserRuleContext {
	public U4_GATE(): TerminalNode { return this.getToken(TodoLangGrammarParser.U4_GATE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_single_gate_with_four_parameter_type; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterSingle_gate_with_four_parameter_type) {
			listener.enterSingle_gate_with_four_parameter_type(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitSingle_gate_with_four_parameter_type) {
			listener.exitSingle_gate_with_four_parameter_type(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitSingle_gate_with_four_parameter_type) {
			return visitor.visitSingle_gate_with_four_parameter_type(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Double_gate_without_parameter_typeContext extends ParserRuleContext {
	public CNOT_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.CNOT_GATE, 0); }
	public CZ_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.CZ_GATE, 0); }
	public ISWAP_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.ISWAP_GATE, 0); }
	public SQISWAP_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.SQISWAP_GATE, 0); }
	public SWAPZ1_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.SWAPZ1_GATE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_double_gate_without_parameter_type; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterDouble_gate_without_parameter_type) {
			listener.enterDouble_gate_without_parameter_type(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitDouble_gate_without_parameter_type) {
			listener.exitDouble_gate_without_parameter_type(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitDouble_gate_without_parameter_type) {
			return visitor.visitDouble_gate_without_parameter_type(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Double_gate_with_one_parameter_typeContext extends ParserRuleContext {
	public ISWAPTHETA_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.ISWAPTHETA_GATE, 0); }
	public CR_GATE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.CR_GATE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_double_gate_with_one_parameter_type; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterDouble_gate_with_one_parameter_type) {
			listener.enterDouble_gate_with_one_parameter_type(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitDouble_gate_with_one_parameter_type) {
			listener.exitDouble_gate_with_one_parameter_type(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitDouble_gate_with_one_parameter_type) {
			return visitor.visitDouble_gate_with_one_parameter_type(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Double_gate_with_four_parameter_typeContext extends ParserRuleContext {
	public CU_GATE(): TerminalNode { return this.getToken(TodoLangGrammarParser.CU_GATE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_double_gate_with_four_parameter_type; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterDouble_gate_with_four_parameter_type) {
			listener.enterDouble_gate_with_four_parameter_type(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitDouble_gate_with_four_parameter_type) {
			listener.exitDouble_gate_with_four_parameter_type(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitDouble_gate_with_four_parameter_type) {
			return visitor.visitDouble_gate_with_four_parameter_type(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Triple_gate_without_parameter_typeContext extends ParserRuleContext {
	public TOFFOLI_GATE(): TerminalNode { return this.getToken(TodoLangGrammarParser.TOFFOLI_GATE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_triple_gate_without_parameter_type; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterTriple_gate_without_parameter_type) {
			listener.enterTriple_gate_without_parameter_type(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitTriple_gate_without_parameter_type) {
			listener.exitTriple_gate_without_parameter_type(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitTriple_gate_without_parameter_type) {
			return visitor.visitTriple_gate_without_parameter_type(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Primary_expressionContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_primary_expression; }
	public copyFrom(ctx: Primary_expressionContext): void {
		super.copyFrom(ctx);
	}
}
export class Pri_ckeyContext extends Primary_expressionContext {
	public c_KEY_declaration(): C_KEY_declarationContext {
		return this.getRuleContext(0, C_KEY_declarationContext);
	}
	constructor(ctx: Primary_expressionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterPri_ckey) {
			listener.enterPri_ckey(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitPri_ckey) {
			listener.exitPri_ckey(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitPri_ckey) {
			return visitor.visitPri_ckey(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class Pri_cstContext extends Primary_expressionContext {
	public constant(): ConstantContext {
		return this.getRuleContext(0, ConstantContext);
	}
	constructor(ctx: Primary_expressionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterPri_cst) {
			listener.enterPri_cst(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitPri_cst) {
			listener.exitPri_cst(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitPri_cst) {
			return visitor.visitPri_cst(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class Pri_exprContext extends Primary_expressionContext {
	public LPAREN(): TerminalNode[];
	public LPAREN(i: number): TerminalNode;
	public LPAREN(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(TodoLangGrammarParser.LPAREN);
		} else {
			return this.getToken(TodoLangGrammarParser.LPAREN, i);
		}
	}
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	constructor(ctx: Primary_expressionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterPri_expr) {
			listener.enterPri_expr(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitPri_expr) {
			listener.exitPri_expr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitPri_expr) {
			return visitor.visitPri_expr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Unary_expressionContext extends ParserRuleContext {
	public primary_expression(): Primary_expressionContext {
		return this.getRuleContext(0, Primary_expressionContext);
	}
	public PLUS(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.PLUS, 0); }
	public MINUS(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.MINUS, 0); }
	public NOT(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.NOT, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_unary_expression; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterUnary_expression) {
			listener.enterUnary_expression(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitUnary_expression) {
			listener.exitUnary_expression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitUnary_expression) {
			return visitor.visitUnary_expression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Multiplicative_expressionContext extends ParserRuleContext {
	public _denominator!: Unary_expressionContext;
	public unary_expression(): Unary_expressionContext {
		return this.getRuleContext(0, Unary_expressionContext);
	}
	public multiplicative_expression(): Multiplicative_expressionContext | undefined {
		return this.tryGetRuleContext(0, Multiplicative_expressionContext);
	}
	public MUL(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.MUL, 0); }
	public DIV(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.DIV, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_multiplicative_expression; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterMultiplicative_expression) {
			listener.enterMultiplicative_expression(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitMultiplicative_expression) {
			listener.exitMultiplicative_expression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitMultiplicative_expression) {
			return visitor.visitMultiplicative_expression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Addtive_expressionContext extends ParserRuleContext {
	public multiplicative_expression(): Multiplicative_expressionContext {
		return this.getRuleContext(0, Multiplicative_expressionContext);
	}
	public addtive_expression(): Addtive_expressionContext | undefined {
		return this.tryGetRuleContext(0, Addtive_expressionContext);
	}
	public PLUS(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.PLUS, 0); }
	public MINUS(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.MINUS, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_addtive_expression; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterAddtive_expression) {
			listener.enterAddtive_expression(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitAddtive_expression) {
			listener.exitAddtive_expression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitAddtive_expression) {
			return visitor.visitAddtive_expression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Relational_expressionContext extends ParserRuleContext {
	public addtive_expression(): Addtive_expressionContext {
		return this.getRuleContext(0, Addtive_expressionContext);
	}
	public relational_expression(): Relational_expressionContext | undefined {
		return this.tryGetRuleContext(0, Relational_expressionContext);
	}
	public LT(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.LT, 0); }
	public GT(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.GT, 0); }
	public LEQ(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.LEQ, 0); }
	public GEQ(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.GEQ, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_relational_expression; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterRelational_expression) {
			listener.enterRelational_expression(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitRelational_expression) {
			listener.exitRelational_expression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitRelational_expression) {
			return visitor.visitRelational_expression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Equality_expressionContext extends ParserRuleContext {
	public relational_expression(): Relational_expressionContext {
		return this.getRuleContext(0, Relational_expressionContext);
	}
	public equality_expression(): Equality_expressionContext | undefined {
		return this.tryGetRuleContext(0, Equality_expressionContext);
	}
	public EQ(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.EQ, 0); }
	public NE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.NE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_equality_expression; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterEquality_expression) {
			listener.enterEquality_expression(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitEquality_expression) {
			listener.exitEquality_expression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitEquality_expression) {
			return visitor.visitEquality_expression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Logical_and_expressionContext extends ParserRuleContext {
	public equality_expression(): Equality_expressionContext {
		return this.getRuleContext(0, Equality_expressionContext);
	}
	public logical_and_expression(): Logical_and_expressionContext | undefined {
		return this.tryGetRuleContext(0, Logical_and_expressionContext);
	}
	public AND(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.AND, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_logical_and_expression; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterLogical_and_expression) {
			listener.enterLogical_and_expression(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitLogical_and_expression) {
			listener.exitLogical_and_expression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitLogical_and_expression) {
			return visitor.visitLogical_and_expression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Logical_or_expressionContext extends ParserRuleContext {
	public logical_and_expression(): Logical_and_expressionContext {
		return this.getRuleContext(0, Logical_and_expressionContext);
	}
	public logical_or_expression(): Logical_or_expressionContext | undefined {
		return this.tryGetRuleContext(0, Logical_or_expressionContext);
	}
	public OR(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.OR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_logical_or_expression; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterLogical_or_expression) {
			listener.enterLogical_or_expression(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitLogical_or_expression) {
			listener.exitLogical_or_expression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitLogical_or_expression) {
			return visitor.visitLogical_or_expression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Assignment_expressionContext extends ParserRuleContext {
	public logical_or_expression(): Logical_or_expressionContext {
		return this.getRuleContext(0, Logical_or_expressionContext);
	}
	public c_KEY_declaration(): C_KEY_declarationContext | undefined {
		return this.tryGetRuleContext(0, C_KEY_declarationContext);
	}
	public ASSIGN(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.ASSIGN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_assignment_expression; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterAssignment_expression) {
			listener.enterAssignment_expression(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitAssignment_expression) {
			listener.exitAssignment_expression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitAssignment_expression) {
			return visitor.visitAssignment_expression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExpressionContext extends ParserRuleContext {
	public assignment_expression(): Assignment_expressionContext {
		return this.getRuleContext(0, Assignment_expressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_expression; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterExpression) {
			listener.enterExpression(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitExpression) {
			listener.exitExpression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitExpression) {
			return visitor.visitExpression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Controlbit_listContext extends ParserRuleContext {
	public q_KEY_declaration(): Q_KEY_declarationContext[];
	public q_KEY_declaration(i: number): Q_KEY_declarationContext;
	public q_KEY_declaration(i?: number): Q_KEY_declarationContext | Q_KEY_declarationContext[] {
		if (i === undefined) {
			return this.getRuleContexts(Q_KEY_declarationContext);
		} else {
			return this.getRuleContext(i, Q_KEY_declarationContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(TodoLangGrammarParser.COMMA);
		} else {
			return this.getToken(TodoLangGrammarParser.COMMA, i);
		}
	}
	public Identifier(): TerminalNode[];
	public Identifier(i: number): TerminalNode;
	public Identifier(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(TodoLangGrammarParser.Identifier);
		} else {
			return this.getToken(TodoLangGrammarParser.Identifier, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_controlbit_list; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterControlbit_list) {
			listener.enterControlbit_list(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitControlbit_list) {
			listener.exitControlbit_list(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitControlbit_list) {
			return visitor.visitControlbit_list(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StatementContext extends ParserRuleContext {
	public quantum_gate_declaration(): Quantum_gate_declarationContext | undefined {
		return this.tryGetRuleContext(0, Quantum_gate_declarationContext);
	}
	public NEWLINE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.NEWLINE, 0); }
	public control_statement(): Control_statementContext | undefined {
		return this.tryGetRuleContext(0, Control_statementContext);
	}
	public qif_statement(): Qif_statementContext | undefined {
		return this.tryGetRuleContext(0, Qif_statementContext);
	}
	public qwhile_statement(): Qwhile_statementContext | undefined {
		return this.tryGetRuleContext(0, Qwhile_statementContext);
	}
	public dagger_statement(): Dagger_statementContext | undefined {
		return this.tryGetRuleContext(0, Dagger_statementContext);
	}
	public measure_statement(): Measure_statementContext | undefined {
		return this.tryGetRuleContext(0, Measure_statementContext);
	}
	public reset_statement(): Reset_statementContext | undefined {
		return this.tryGetRuleContext(0, Reset_statementContext);
	}
	public expression_statement(): Expression_statementContext | undefined {
		return this.tryGetRuleContext(0, Expression_statementContext);
	}
	public barrier_statement(): Barrier_statementContext | undefined {
		return this.tryGetRuleContext(0, Barrier_statementContext);
	}
	public gate_func_statement(): Gate_func_statementContext | undefined {
		return this.tryGetRuleContext(0, Gate_func_statementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_statement; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterStatement) {
			listener.enterStatement(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitStatement) {
			listener.exitStatement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitStatement) {
			return visitor.visitStatement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Dagger_statementContext extends ParserRuleContext {
	public DAGGER_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.DAGGER_KEY, 0); }
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(TodoLangGrammarParser.NEWLINE);
		} else {
			return this.getToken(TodoLangGrammarParser.NEWLINE, i);
		}
	}
	public ENDDAGGER_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.ENDDAGGER_KEY, 0); }
	public statement(): StatementContext[];
	public statement(i: number): StatementContext;
	public statement(i?: number): StatementContext | StatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StatementContext);
		} else {
			return this.getRuleContext(i, StatementContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_dagger_statement; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterDagger_statement) {
			listener.enterDagger_statement(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitDagger_statement) {
			listener.exitDagger_statement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitDagger_statement) {
			return visitor.visitDagger_statement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Control_statementContext extends ParserRuleContext {
	public CONTROL_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.CONTROL_KEY, 0); }
	public controlbit_list(): Controlbit_listContext {
		return this.getRuleContext(0, Controlbit_listContext);
	}
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(TodoLangGrammarParser.NEWLINE);
		} else {
			return this.getToken(TodoLangGrammarParser.NEWLINE, i);
		}
	}
	public ENDCONTROL_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.ENDCONTROL_KEY, 0); }
	public statement(): StatementContext[];
	public statement(i: number): StatementContext;
	public statement(i?: number): StatementContext | StatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StatementContext);
		} else {
			return this.getRuleContext(i, StatementContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_control_statement; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterControl_statement) {
			listener.enterControl_statement(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitControl_statement) {
			listener.exitControl_statement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitControl_statement) {
			return visitor.visitControl_statement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Qelse_statement_fragmentContext extends ParserRuleContext {
	public ELSE_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.ELSE_KEY, 0); }
	public NEWLINE(): TerminalNode { return this.getToken(TodoLangGrammarParser.NEWLINE, 0); }
	public statement(): StatementContext[];
	public statement(i: number): StatementContext;
	public statement(i?: number): StatementContext | StatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StatementContext);
		} else {
			return this.getRuleContext(i, StatementContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_qelse_statement_fragment; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterQelse_statement_fragment) {
			listener.enterQelse_statement_fragment(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitQelse_statement_fragment) {
			listener.exitQelse_statement_fragment(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitQelse_statement_fragment) {
			return visitor.visitQelse_statement_fragment(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Qif_statementContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_qif_statement; }
	public copyFrom(ctx: Qif_statementContext): void {
		super.copyFrom(ctx);
	}
}
export class Qif_ifContext extends Qif_statementContext {
	public QIF_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.QIF_KEY, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(TodoLangGrammarParser.NEWLINE);
		} else {
			return this.getToken(TodoLangGrammarParser.NEWLINE, i);
		}
	}
	public qelse_statement_fragment(): Qelse_statement_fragmentContext {
		return this.getRuleContext(0, Qelse_statement_fragmentContext);
	}
	public ENDIF_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.ENDIF_KEY, 0); }
	public statement(): StatementContext[];
	public statement(i: number): StatementContext;
	public statement(i?: number): StatementContext | StatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StatementContext);
		} else {
			return this.getRuleContext(i, StatementContext);
		}
	}
	constructor(ctx: Qif_statementContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterQif_if) {
			listener.enterQif_if(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitQif_if) {
			listener.exitQif_if(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitQif_if) {
			return visitor.visitQif_if(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class Qif_ifelseContext extends Qif_statementContext {
	public QIF_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.QIF_KEY, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(TodoLangGrammarParser.NEWLINE);
		} else {
			return this.getToken(TodoLangGrammarParser.NEWLINE, i);
		}
	}
	public ENDIF_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.ENDIF_KEY, 0); }
	public statement(): StatementContext[];
	public statement(i: number): StatementContext;
	public statement(i?: number): StatementContext | StatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StatementContext);
		} else {
			return this.getRuleContext(i, StatementContext);
		}
	}
	constructor(ctx: Qif_statementContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterQif_ifelse) {
			listener.enterQif_ifelse(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitQif_ifelse) {
			listener.exitQif_ifelse(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitQif_ifelse) {
			return visitor.visitQif_ifelse(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Qwhile_statementContext extends ParserRuleContext {
	public QWHILE_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.QWHILE_KEY, 0); }
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(TodoLangGrammarParser.NEWLINE);
		} else {
			return this.getToken(TodoLangGrammarParser.NEWLINE, i);
		}
	}
	public ENDQWHILE_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.ENDQWHILE_KEY, 0); }
	public statement(): StatementContext[];
	public statement(i: number): StatementContext;
	public statement(i?: number): StatementContext | StatementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(StatementContext);
		} else {
			return this.getRuleContext(i, StatementContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_qwhile_statement; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterQwhile_statement) {
			listener.enterQwhile_statement(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitQwhile_statement) {
			listener.exitQwhile_statement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitQwhile_statement) {
			return visitor.visitQwhile_statement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Measure_statementContext extends ParserRuleContext {
	public MEASURE_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.MEASURE_KEY, 0); }
	public q_KEY_declaration(): Q_KEY_declarationContext | undefined {
		return this.tryGetRuleContext(0, Q_KEY_declarationContext);
	}
	public COMMA(): TerminalNode { return this.getToken(TodoLangGrammarParser.COMMA, 0); }
	public c_KEY_declaration(): C_KEY_declarationContext | undefined {
		return this.tryGetRuleContext(0, C_KEY_declarationContext);
	}
	public Q_KEY(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.Q_KEY, 0); }
	public C_KEY(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.C_KEY, 0); }
	public NEWLINE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.NEWLINE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_measure_statement; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterMeasure_statement) {
			listener.enterMeasure_statement(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitMeasure_statement) {
			listener.exitMeasure_statement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitMeasure_statement) {
			return visitor.visitMeasure_statement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Reset_statementContext extends ParserRuleContext {
	public RESET_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.RESET_KEY, 0); }
	public q_KEY_declaration(): Q_KEY_declarationContext | undefined {
		return this.tryGetRuleContext(0, Q_KEY_declarationContext);
	}
	public NEWLINE(): TerminalNode { return this.getToken(TodoLangGrammarParser.NEWLINE, 0); }
	public Q_KEY(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.Q_KEY, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_reset_statement; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterReset_statement) {
			listener.enterReset_statement(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitReset_statement) {
			listener.exitReset_statement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitReset_statement) {
			return visitor.visitReset_statement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Barrier_statementContext extends ParserRuleContext {
	public BARRIER_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.BARRIER_KEY, 0); }
	public controlbit_list(): Controlbit_listContext | undefined {
		return this.tryGetRuleContext(0, Controlbit_listContext);
	}
	public Q_KEY(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.Q_KEY, 0); }
	public NEWLINE(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.NEWLINE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_barrier_statement; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterBarrier_statement) {
			listener.enterBarrier_statement(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitBarrier_statement) {
			listener.exitBarrier_statement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitBarrier_statement) {
			return visitor.visitBarrier_statement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Expression_statementContext extends ParserRuleContext {
	public expression(): ExpressionContext {
		return this.getRuleContext(0, ExpressionContext);
	}
	public NEWLINE(): TerminalNode { return this.getToken(TodoLangGrammarParser.NEWLINE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_expression_statement; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterExpression_statement) {
			listener.enterExpression_statement(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitExpression_statement) {
			listener.exitExpression_statement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitExpression_statement) {
			return visitor.visitExpression_statement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Define_gate_statementContext extends ParserRuleContext {
	public gate_name(): Gate_nameContext {
		return this.getRuleContext(0, Gate_nameContext);
	}
	public id_list(): Id_listContext {
		return this.getRuleContext(0, Id_listContext);
	}
	public NEWLINE(): TerminalNode { return this.getToken(TodoLangGrammarParser.NEWLINE, 0); }
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.COMMA, 0); }
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.LPAREN, 0); }
	public explist(): ExplistContext | undefined {
		return this.tryGetRuleContext(0, ExplistContext);
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.RPAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_define_gate_statement; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterDefine_gate_statement) {
			listener.enterDefine_gate_statement(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitDefine_gate_statement) {
			listener.exitDefine_gate_statement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitDefine_gate_statement) {
			return visitor.visitDefine_gate_statement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Define_dagger_statementContext extends ParserRuleContext {
	public DAGGER_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.DAGGER_KEY, 0); }
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(TodoLangGrammarParser.NEWLINE);
		} else {
			return this.getToken(TodoLangGrammarParser.NEWLINE, i);
		}
	}
	public ENDDAGGER_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.ENDDAGGER_KEY, 0); }
	public user_defined_gate(): User_defined_gateContext[];
	public user_defined_gate(i: number): User_defined_gateContext;
	public user_defined_gate(i?: number): User_defined_gateContext | User_defined_gateContext[] {
		if (i === undefined) {
			return this.getRuleContexts(User_defined_gateContext);
		} else {
			return this.getRuleContext(i, User_defined_gateContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_define_dagger_statement; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterDefine_dagger_statement) {
			listener.enterDefine_dagger_statement(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitDefine_dagger_statement) {
			listener.exitDefine_dagger_statement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitDefine_dagger_statement) {
			return visitor.visitDefine_dagger_statement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Define_control_statementContext extends ParserRuleContext {
	public CONTROL_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.CONTROL_KEY, 0); }
	public controlbit_list(): Controlbit_listContext {
		return this.getRuleContext(0, Controlbit_listContext);
	}
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(TodoLangGrammarParser.NEWLINE);
		} else {
			return this.getToken(TodoLangGrammarParser.NEWLINE, i);
		}
	}
	public ENDCONTROL_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.ENDCONTROL_KEY, 0); }
	public user_defined_gate(): User_defined_gateContext[];
	public user_defined_gate(i: number): User_defined_gateContext;
	public user_defined_gate(i?: number): User_defined_gateContext | User_defined_gateContext[] {
		if (i === undefined) {
			return this.getRuleContexts(User_defined_gateContext);
		} else {
			return this.getRuleContext(i, User_defined_gateContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_define_control_statement; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterDefine_control_statement) {
			listener.enterDefine_control_statement(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitDefine_control_statement) {
			listener.exitDefine_control_statement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitDefine_control_statement) {
			return visitor.visitDefine_control_statement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class User_defined_gateContext extends ParserRuleContext {
	public define_gate_statement(): Define_gate_statementContext | undefined {
		return this.tryGetRuleContext(0, Define_gate_statementContext);
	}
	public define_dagger_statement(): Define_dagger_statementContext | undefined {
		return this.tryGetRuleContext(0, Define_dagger_statementContext);
	}
	public define_control_statement(): Define_control_statementContext | undefined {
		return this.tryGetRuleContext(0, Define_control_statementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_user_defined_gate; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterUser_defined_gate) {
			listener.enterUser_defined_gate(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitUser_defined_gate) {
			listener.exitUser_defined_gate(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitUser_defined_gate) {
			return visitor.visitUser_defined_gate(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExplistContext extends ParserRuleContext {
	public _exp!: ExpContext;
	public _angles: ExpContext[] = [];
	public exp(): ExpContext[];
	public exp(i: number): ExpContext;
	public exp(i?: number): ExpContext | ExpContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpContext);
		} else {
			return this.getRuleContext(i, ExpContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(TodoLangGrammarParser.COMMA);
		} else {
			return this.getToken(TodoLangGrammarParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_explist; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterExplist) {
			listener.enterExplist(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitExplist) {
			listener.exitExplist(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitExplist) {
			return visitor.visitExplist(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExpContext extends ParserRuleContext {
	public _denominator!: ExpContext;
	public id(): IdContext | undefined {
		return this.tryGetRuleContext(0, IdContext);
	}
	public Integer_Literal(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.Integer_Literal, 0); }
	public Double_Literal(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.Double_Literal, 0); }
	public PI(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.PI, 0); }
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.LPAREN, 0); }
	public exp(): ExpContext[];
	public exp(i: number): ExpContext;
	public exp(i?: number): ExpContext | ExpContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExpContext);
		} else {
			return this.getRuleContext(i, ExpContext);
		}
	}
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.RPAREN, 0); }
	public MINUS(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.MINUS, 0); }
	public MUL(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.MUL, 0); }
	public DIV(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.DIV, 0); }
	public PLUS(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.PLUS, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_exp; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterExp) {
			listener.enterExp(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitExp) {
			listener.exitExp(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitExp) {
			return visitor.visitExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Gate_func_statementContext extends ParserRuleContext {
	public _name!: IdContext;
	public _params!: Id_listContext;
	public _arguments!: Id_listContext;
	public QGATE_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.QGATE_KEY, 0); }
	public NEWLINE(): TerminalNode[];
	public NEWLINE(i: number): TerminalNode;
	public NEWLINE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(TodoLangGrammarParser.NEWLINE);
		} else {
			return this.getToken(TodoLangGrammarParser.NEWLINE, i);
		}
	}
	public ENDQGATE_KEY(): TerminalNode { return this.getToken(TodoLangGrammarParser.ENDQGATE_KEY, 0); }
	public id(): IdContext {
		return this.getRuleContext(0, IdContext);
	}
	public id_list(): Id_listContext[];
	public id_list(i: number): Id_listContext;
	public id_list(i?: number): Id_listContext | Id_listContext[] {
		if (i === undefined) {
			return this.getRuleContexts(Id_listContext);
		} else {
			return this.getRuleContext(i, Id_listContext);
		}
	}
	public user_defined_gate(): User_defined_gateContext[];
	public user_defined_gate(i: number): User_defined_gateContext;
	public user_defined_gate(i?: number): User_defined_gateContext | User_defined_gateContext[] {
		if (i === undefined) {
			return this.getRuleContexts(User_defined_gateContext);
		} else {
			return this.getRuleContext(i, User_defined_gateContext);
		}
	}
	public COMMA(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.COMMA, 0); }
	public LPAREN(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.LPAREN, 0); }
	public RPAREN(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.RPAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_gate_func_statement; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterGate_func_statement) {
			listener.enterGate_func_statement(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitGate_func_statement) {
			listener.exitGate_func_statement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitGate_func_statement) {
			return visitor.visitGate_func_statement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class IdContext extends ParserRuleContext {
	public Identifier(): TerminalNode { return this.getToken(TodoLangGrammarParser.Identifier, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_id; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterId) {
			listener.enterId(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitId) {
			listener.exitId(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitId) {
			return visitor.visitId(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Id_listContext extends ParserRuleContext {
	public _id!: IdContext;
	public _params: IdContext[] = [];
	public id(): IdContext[];
	public id(i: number): IdContext;
	public id(i?: number): IdContext | IdContext[] {
		if (i === undefined) {
			return this.getRuleContexts(IdContext);
		} else {
			return this.getRuleContext(i, IdContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(TodoLangGrammarParser.COMMA);
		} else {
			return this.getToken(TodoLangGrammarParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_id_list; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterId_list) {
			listener.enterId_list(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitId_list) {
			listener.exitId_list(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitId_list) {
			return visitor.visitId_list(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Gate_nameContext extends ParserRuleContext {
	public single_gate_without_parameter_type(): Single_gate_without_parameter_typeContext | undefined {
		return this.tryGetRuleContext(0, Single_gate_without_parameter_typeContext);
	}
	public single_gate_with_one_parameter_type(): Single_gate_with_one_parameter_typeContext | undefined {
		return this.tryGetRuleContext(0, Single_gate_with_one_parameter_typeContext);
	}
	public single_gate_with_two_parameter_type(): Single_gate_with_two_parameter_typeContext | undefined {
		return this.tryGetRuleContext(0, Single_gate_with_two_parameter_typeContext);
	}
	public single_gate_with_three_parameter_type(): Single_gate_with_three_parameter_typeContext | undefined {
		return this.tryGetRuleContext(0, Single_gate_with_three_parameter_typeContext);
	}
	public single_gate_with_four_parameter_type(): Single_gate_with_four_parameter_typeContext | undefined {
		return this.tryGetRuleContext(0, Single_gate_with_four_parameter_typeContext);
	}
	public double_gate_without_parameter_type(): Double_gate_without_parameter_typeContext | undefined {
		return this.tryGetRuleContext(0, Double_gate_without_parameter_typeContext);
	}
	public double_gate_with_one_parameter_type(): Double_gate_with_one_parameter_typeContext | undefined {
		return this.tryGetRuleContext(0, Double_gate_with_one_parameter_typeContext);
	}
	public double_gate_with_four_parameter_type(): Double_gate_with_four_parameter_typeContext | undefined {
		return this.tryGetRuleContext(0, Double_gate_with_four_parameter_typeContext);
	}
	public triple_gate_without_parameter_type(): Triple_gate_without_parameter_typeContext | undefined {
		return this.tryGetRuleContext(0, Triple_gate_without_parameter_typeContext);
	}
	public id(): IdContext | undefined {
		return this.tryGetRuleContext(0, IdContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_gate_name; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterGate_name) {
			listener.enterGate_name(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitGate_name) {
			listener.exitGate_name(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitGate_name) {
			return visitor.visitGate_name(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Constant_expressionContext extends ParserRuleContext {
	public _denominator!: ConstantContext;
	public constant(): ConstantContext[];
	public constant(i: number): ConstantContext;
	public constant(i?: number): ConstantContext | ConstantContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ConstantContext);
		} else {
			return this.getRuleContext(i, ConstantContext);
		}
	}
	public arithmetic_op(): Arithmetic_opContext | undefined {
		return this.tryGetRuleContext(0, Arithmetic_opContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_constant_expression; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterConstant_expression) {
			listener.enterConstant_expression(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitConstant_expression) {
			listener.exitConstant_expression(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitConstant_expression) {
			return visitor.visitConstant_expression(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Arithmetic_opContext extends ParserRuleContext {
	public MUL(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.MUL, 0); }
	public MINUS(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.MINUS, 0); }
	public PLUS(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.PLUS, 0); }
	public DIV(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.DIV, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_arithmetic_op; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterArithmetic_op) {
			listener.enterArithmetic_op(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitArithmetic_op) {
			listener.exitArithmetic_op(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitArithmetic_op) {
			return visitor.visitArithmetic_op(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Unary_opContext extends ParserRuleContext {
	public MINUS(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.MINUS, 0); }
	public PLUS(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.PLUS, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_unary_op; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterUnary_op) {
			listener.enterUnary_op(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitUnary_op) {
			listener.exitUnary_op(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitUnary_op) {
			return visitor.visitUnary_op(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConstantContext extends ParserRuleContext {
	public Integer_Literal(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.Integer_Literal, 0); }
	public Double_Literal(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.Double_Literal, 0); }
	public PI(): TerminalNode | undefined { return this.tryGetToken(TodoLangGrammarParser.PI, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return TodoLangGrammarParser.RULE_constant; }
	// @Override
	public enterRule(listener: TodoLangGrammarListener): void {
		if (listener.enterConstant) {
			listener.enterConstant(this);
		}
	}
	// @Override
	public exitRule(listener: TodoLangGrammarListener): void {
		if (listener.exitConstant) {
			listener.exitConstant(this);
		}
	}
	// @Override
	public accept<Result>(visitor: TodoLangGrammarVisitor<Result>): Result {
		if (visitor.visitConstant) {
			return visitor.visitConstant(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


