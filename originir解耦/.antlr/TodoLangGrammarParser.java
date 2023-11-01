// Generated from c:/Users/BY23015S/Desktop/project/originir-languageservice/originir½âñî/TodoLangGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TodoLangGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PI=1, QINIT_KEY=2, CREG_KEY=3, Q_KEY=4, C_KEY=5, BARRIER_KEY=6, QGATE_KEY=7, 
		ENDQGATE_KEY=8, ECHO_GATE=9, H_GATE=10, X_GATE=11, NOT_GATE=12, T_GATE=13, 
		S_GATE=14, Y_GATE=15, Z_GATE=16, X1_GATE=17, Y1_GATE=18, Z1_GATE=19, I_GATE=20, 
		U2_GATE=21, RPHI_GATE=22, U3_GATE=23, U4_GATE=24, RX_GATE=25, RY_GATE=26, 
		RZ_GATE=27, U1_GATE=28, CNOT_GATE=29, CZ_GATE=30, CU_GATE=31, ISWAP_GATE=32, 
		SQISWAP_GATE=33, SWAPZ1_GATE=34, ISWAPTHETA_GATE=35, CR_GATE=36, TOFFOLI_GATE=37, 
		CP_GATE=38, DAGGER_KEY=39, ENDDAGGER_KEY=40, CONTROL_KEY=41, ENDCONTROL_KEY=42, 
		QIF_KEY=43, ELSE_KEY=44, ENDIF_KEY=45, QWHILE_KEY=46, ENDQWHILE_KEY=47, 
		MEASURE_KEY=48, RESET_KEY=49, ASSIGN=50, GT=51, LT=52, NOT=53, EQ=54, 
		LEQ=55, GEQ=56, NE=57, AND=58, OR=59, PLUS=60, MINUS=61, MUL=62, DIV=63, 
		COMMA=64, LPAREN=65, RPAREN=66, LBRACK=67, RBRACK=68, NEWLINE=69, Identifier=70, 
		Integer_Literal=71, Double_Literal=72, Digit_Sequence=73, REALEXP=74, 
		WhiteSpace=75, SingleLineComment=76, WS=77;
	public static final int
		RULE_translationunit = 0, RULE_declaration = 1, RULE_qinit_declaration = 2, 
		RULE_cinit_declaration = 3, RULE_quantum_gate_declaration = 4, RULE_index = 5, 
		RULE_c_KEY_declaration = 6, RULE_q_KEY_declaration = 7, RULE_single_gate_without_parameter_declaration = 8, 
		RULE_single_gate_with_one_parameter_declaration = 9, RULE_single_gate_with_two_parameter_declaration = 10, 
		RULE_single_gate_with_three_parameter_declaration = 11, RULE_single_gate_with_four_parameter_declaration = 12, 
		RULE_double_gate_without_parameter_declaration = 13, RULE_double_gate_with_one_parameter_declaration = 14, 
		RULE_double_gate_with_four_parameter_declaration = 15, RULE_triple_gate_without_parameter_declaration = 16, 
		RULE_define_gate_declaration = 17, RULE_single_gate_without_parameter_type = 18, 
		RULE_single_gate_with_one_parameter_type = 19, RULE_single_gate_with_two_parameter_type = 20, 
		RULE_single_gate_with_three_parameter_type = 21, RULE_single_gate_with_four_parameter_type = 22, 
		RULE_double_gate_without_parameter_type = 23, RULE_double_gate_with_one_parameter_type = 24, 
		RULE_double_gate_with_four_parameter_type = 25, RULE_triple_gate_without_parameter_type = 26, 
		RULE_primary_expression = 27, RULE_unary_expression = 28, RULE_multiplicative_expression = 29, 
		RULE_addtive_expression = 30, RULE_relational_expression = 31, RULE_equality_expression = 32, 
		RULE_logical_and_expression = 33, RULE_logical_or_expression = 34, RULE_assignment_expression = 35, 
		RULE_expression = 36, RULE_controlbit_list = 37, RULE_statement = 38, 
		RULE_dagger_statement = 39, RULE_control_statement = 40, RULE_qelse_statement_fragment = 41, 
		RULE_qif_statement = 42, RULE_qwhile_statement = 43, RULE_measure_statement = 44, 
		RULE_reset_statement = 45, RULE_barrier_statement = 46, RULE_expression_statement = 47, 
		RULE_define_gate_statement = 48, RULE_define_dagger_statement = 49, RULE_define_control_statement = 50, 
		RULE_user_defined_gate = 51, RULE_explist = 52, RULE_exp = 53, RULE_gate_func_statement = 54, 
		RULE_id = 55, RULE_id_list = 56, RULE_gate_name = 57, RULE_constant_expression = 58, 
		RULE_arithmetic_op = 59, RULE_unary_op = 60, RULE_constant = 61;
	private static String[] makeRuleNames() {
		return new String[] {
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
			"dagger_statement", "control_statement", "qelse_statement_fragment", 
			"qif_statement", "qwhile_statement", "measure_statement", "reset_statement", 
			"barrier_statement", "expression_statement", "define_gate_statement", 
			"define_dagger_statement", "define_control_statement", "user_defined_gate", 
			"explist", "exp", "gate_func_statement", "id", "id_list", "gate_name", 
			"constant_expression", "arithmetic_op", "unary_op", "constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PI'", "'QINIT'", "'CREG'", "'q'", "'c'", "'BARRIER'", "'QGATE'", 
			"'ENDQGATE'", "'ECHO'", "'H'", "'X'", "'NOT'", "'T'", "'S'", "'Y'", "'Z'", 
			"'X1'", "'Y1'", "'Z1'", "'I'", "'U2'", "'RPhi'", "'U3'", "'U4'", "'RX'", 
			"'RY'", "'RZ'", "'U1'", "'CNOT'", "'CZ'", "'CU'", "'ISWAP'", "'SQISWAP'", 
			"'SWAP'", "'ISWAPTHETA'", "'CR'", "'TOFFOLI'", "'CP'", "'DAGGER'", "'ENDDAGGER'", 
			"'CONTROL'", "'ENDCONTROL'", "'QIF'", "'ELSE'", "'ENDQIF'", "'QWHILE'", 
			"'ENDQWHILE'", "'MEASURE'", "'RESET'", "'='", "'>'", "'<'", "'!'", "'=='", 
			"'<='", "'>='", "'!='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "','", 
			"'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PI", "QINIT_KEY", "CREG_KEY", "Q_KEY", "C_KEY", "BARRIER_KEY", 
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
			"Digit_Sequence", "REALEXP", "WhiteSpace", "SingleLineComment", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TodoLangGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TodoLangGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TranslationunitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TodoLangGrammarParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(TodoLangGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TodoLangGrammarParser.NEWLINE, i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<Gate_func_statementContext> gate_func_statement() {
			return getRuleContexts(Gate_func_statementContext.class);
		}
		public Gate_func_statementContext gate_func_statement(int i) {
			return getRuleContext(Gate_func_statementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TranslationunitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationunit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterTranslationunit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitTranslationunit(this);
		}
	}

	public final TranslationunitContext translationunit() throws RecognitionException {
		TranslationunitContext _localctx = new TranslationunitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationunit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(124);
				match(NEWLINE);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==QINIT_KEY || _la==CREG_KEY) {
				{
				{
				setState(130);
				declaration();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(136);
					gate_func_statement();
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(142);
				statement();
				}
				}
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3468698326499585762L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 225L) != 0) );
			setState(147);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public Qinit_declarationContext qinit_declaration() {
			return getRuleContext(Qinit_declarationContext.class,0);
		}
		public Cinit_declarationContext cinit_declaration() {
			return getRuleContext(Cinit_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QINIT_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				qinit_declaration();
				}
				break;
			case CREG_KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				cinit_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Qinit_declarationContext extends ParserRuleContext {
		public TerminalNode QINIT_KEY() { return getToken(TodoLangGrammarParser.QINIT_KEY, 0); }
		public TerminalNode Integer_Literal() { return getToken(TodoLangGrammarParser.Integer_Literal, 0); }
		public TerminalNode NEWLINE() { return getToken(TodoLangGrammarParser.NEWLINE, 0); }
		public Qinit_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qinit_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterQinit_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitQinit_declaration(this);
		}
	}

	public final Qinit_declarationContext qinit_declaration() throws RecognitionException {
		Qinit_declarationContext _localctx = new Qinit_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_qinit_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(QINIT_KEY);
			setState(154);
			match(Integer_Literal);
			setState(155);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cinit_declarationContext extends ParserRuleContext {
		public TerminalNode CREG_KEY() { return getToken(TodoLangGrammarParser.CREG_KEY, 0); }
		public TerminalNode Integer_Literal() { return getToken(TodoLangGrammarParser.Integer_Literal, 0); }
		public TerminalNode NEWLINE() { return getToken(TodoLangGrammarParser.NEWLINE, 0); }
		public Cinit_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cinit_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterCinit_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitCinit_declaration(this);
		}
	}

	public final Cinit_declarationContext cinit_declaration() throws RecognitionException {
		Cinit_declarationContext _localctx = new Cinit_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cinit_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(CREG_KEY);
			setState(158);
			match(Integer_Literal);
			setState(159);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Quantum_gate_declarationContext extends ParserRuleContext {
		public Single_gate_without_parameter_declarationContext single_gate_without_parameter_declaration() {
			return getRuleContext(Single_gate_without_parameter_declarationContext.class,0);
		}
		public Single_gate_with_one_parameter_declarationContext single_gate_with_one_parameter_declaration() {
			return getRuleContext(Single_gate_with_one_parameter_declarationContext.class,0);
		}
		public Single_gate_with_two_parameter_declarationContext single_gate_with_two_parameter_declaration() {
			return getRuleContext(Single_gate_with_two_parameter_declarationContext.class,0);
		}
		public Single_gate_with_three_parameter_declarationContext single_gate_with_three_parameter_declaration() {
			return getRuleContext(Single_gate_with_three_parameter_declarationContext.class,0);
		}
		public Single_gate_with_four_parameter_declarationContext single_gate_with_four_parameter_declaration() {
			return getRuleContext(Single_gate_with_four_parameter_declarationContext.class,0);
		}
		public Double_gate_without_parameter_declarationContext double_gate_without_parameter_declaration() {
			return getRuleContext(Double_gate_without_parameter_declarationContext.class,0);
		}
		public Double_gate_with_one_parameter_declarationContext double_gate_with_one_parameter_declaration() {
			return getRuleContext(Double_gate_with_one_parameter_declarationContext.class,0);
		}
		public Double_gate_with_four_parameter_declarationContext double_gate_with_four_parameter_declaration() {
			return getRuleContext(Double_gate_with_four_parameter_declarationContext.class,0);
		}
		public Triple_gate_without_parameter_declarationContext triple_gate_without_parameter_declaration() {
			return getRuleContext(Triple_gate_without_parameter_declarationContext.class,0);
		}
		public Define_gate_declarationContext define_gate_declaration() {
			return getRuleContext(Define_gate_declarationContext.class,0);
		}
		public Quantum_gate_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantum_gate_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterQuantum_gate_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitQuantum_gate_declaration(this);
		}
	}

	public final Quantum_gate_declarationContext quantum_gate_declaration() throws RecognitionException {
		Quantum_gate_declarationContext _localctx = new Quantum_gate_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_quantum_gate_declaration);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ECHO_GATE:
			case H_GATE:
			case X_GATE:
			case T_GATE:
			case S_GATE:
			case Y_GATE:
			case Z_GATE:
			case X1_GATE:
			case Y1_GATE:
			case Z1_GATE:
			case I_GATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				single_gate_without_parameter_declaration();
				}
				break;
			case RX_GATE:
			case RY_GATE:
			case RZ_GATE:
			case U1_GATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				single_gate_with_one_parameter_declaration();
				}
				break;
			case U2_GATE:
			case RPHI_GATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				single_gate_with_two_parameter_declaration();
				}
				break;
			case U3_GATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				single_gate_with_three_parameter_declaration();
				}
				break;
			case U4_GATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				single_gate_with_four_parameter_declaration();
				}
				break;
			case CNOT_GATE:
			case CZ_GATE:
			case ISWAP_GATE:
			case SQISWAP_GATE:
			case SWAPZ1_GATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(166);
				double_gate_without_parameter_declaration();
				}
				break;
			case ISWAPTHETA_GATE:
			case CR_GATE:
				enterOuterAlt(_localctx, 7);
				{
				setState(167);
				double_gate_with_one_parameter_declaration();
				}
				break;
			case CU_GATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(168);
				double_gate_with_four_parameter_declaration();
				}
				break;
			case TOFFOLI_GATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(169);
				triple_gate_without_parameter_declaration();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 10);
				{
				setState(170);
				define_gate_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(TodoLangGrammarParser.LBRACK, 0); }
		public TerminalNode Integer_Literal() { return getToken(TodoLangGrammarParser.Integer_Literal, 0); }
		public TerminalNode RBRACK() { return getToken(TodoLangGrammarParser.RBRACK, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitIndex(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(LBRACK);
			setState(174);
			match(Integer_Literal);
			setState(175);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class C_KEY_declarationContext extends ParserRuleContext {
		public TerminalNode C_KEY() { return getToken(TodoLangGrammarParser.C_KEY, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public C_KEY_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_KEY_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterC_KEY_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitC_KEY_declaration(this);
		}
	}

	public final C_KEY_declarationContext c_KEY_declaration() throws RecognitionException {
		C_KEY_declarationContext _localctx = new C_KEY_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_c_KEY_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(C_KEY);
			setState(178);
			index();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Q_KEY_declarationContext extends ParserRuleContext {
		public TerminalNode Q_KEY() { return getToken(TodoLangGrammarParser.Q_KEY, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public Q_KEY_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_q_KEY_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterQ_KEY_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitQ_KEY_declaration(this);
		}
	}

	public final Q_KEY_declarationContext q_KEY_declaration() throws RecognitionException {
		Q_KEY_declarationContext _localctx = new Q_KEY_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_q_KEY_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(Q_KEY);
			setState(181);
			index();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_gate_without_parameter_declarationContext extends ParserRuleContext {
		public Single_gate_without_parameter_typeContext single_gate_without_parameter_type() {
			return getRuleContext(Single_gate_without_parameter_typeContext.class,0);
		}
		public Q_KEY_declarationContext q_KEY_declaration() {
			return getRuleContext(Q_KEY_declarationContext.class,0);
		}
		public TerminalNode Q_KEY() { return getToken(TodoLangGrammarParser.Q_KEY, 0); }
		public Single_gate_without_parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_gate_without_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterSingle_gate_without_parameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitSingle_gate_without_parameter_declaration(this);
		}
	}

	public final Single_gate_without_parameter_declarationContext single_gate_without_parameter_declaration() throws RecognitionException {
		Single_gate_without_parameter_declarationContext _localctx = new Single_gate_without_parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_single_gate_without_parameter_declaration);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				single_gate_without_parameter_type();
				setState(184);
				q_KEY_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				single_gate_without_parameter_type();
				setState(187);
				match(Q_KEY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_gate_with_one_parameter_declarationContext extends ParserRuleContext {
		public Single_gate_with_one_parameter_typeContext single_gate_with_one_parameter_type() {
			return getRuleContext(Single_gate_with_one_parameter_typeContext.class,0);
		}
		public Q_KEY_declarationContext q_KEY_declaration() {
			return getRuleContext(Q_KEY_declarationContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(TodoLangGrammarParser.COMMA, 0); }
		public TerminalNode LPAREN() { return getToken(TodoLangGrammarParser.LPAREN, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TodoLangGrammarParser.RPAREN, 0); }
		public TerminalNode Q_KEY() { return getToken(TodoLangGrammarParser.Q_KEY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Single_gate_with_one_parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_gate_with_one_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterSingle_gate_with_one_parameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitSingle_gate_with_one_parameter_declaration(this);
		}
	}

	public final Single_gate_with_one_parameter_declarationContext single_gate_with_one_parameter_declaration() throws RecognitionException {
		Single_gate_with_one_parameter_declarationContext _localctx = new Single_gate_with_one_parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_single_gate_with_one_parameter_declaration);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				single_gate_with_one_parameter_type();
				setState(192);
				q_KEY_declaration();
				setState(193);
				match(COMMA);
				setState(194);
				match(LPAREN);
				setState(195);
				constant_expression();
				setState(196);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				single_gate_with_one_parameter_type();
				setState(199);
				match(Q_KEY);
				setState(200);
				match(COMMA);
				setState(201);
				match(LPAREN);
				setState(202);
				expression();
				setState(203);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_gate_with_two_parameter_declarationContext extends ParserRuleContext {
		public Single_gate_with_two_parameter_typeContext single_gate_with_two_parameter_type() {
			return getRuleContext(Single_gate_with_two_parameter_typeContext.class,0);
		}
		public Q_KEY_declarationContext q_KEY_declaration() {
			return getRuleContext(Q_KEY_declarationContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(TodoLangGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TodoLangGrammarParser.COMMA, i);
		}
		public TerminalNode LPAREN() { return getToken(TodoLangGrammarParser.LPAREN, 0); }
		public List<Constant_expressionContext> constant_expression() {
			return getRuleContexts(Constant_expressionContext.class);
		}
		public Constant_expressionContext constant_expression(int i) {
			return getRuleContext(Constant_expressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(TodoLangGrammarParser.RPAREN, 0); }
		public TerminalNode Q_KEY() { return getToken(TodoLangGrammarParser.Q_KEY, 0); }
		public Single_gate_with_two_parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_gate_with_two_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterSingle_gate_with_two_parameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitSingle_gate_with_two_parameter_declaration(this);
		}
	}

	public final Single_gate_with_two_parameter_declarationContext single_gate_with_two_parameter_declaration() throws RecognitionException {
		Single_gate_with_two_parameter_declarationContext _localctx = new Single_gate_with_two_parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_single_gate_with_two_parameter_declaration);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				single_gate_with_two_parameter_type();
				setState(208);
				q_KEY_declaration();
				setState(209);
				match(COMMA);
				setState(210);
				match(LPAREN);
				setState(211);
				constant_expression();
				setState(212);
				match(COMMA);
				setState(213);
				constant_expression();
				setState(214);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				single_gate_with_two_parameter_type();
				setState(217);
				match(Q_KEY);
				setState(218);
				match(COMMA);
				setState(219);
				match(LPAREN);
				setState(220);
				constant_expression();
				setState(221);
				match(COMMA);
				setState(222);
				constant_expression();
				setState(223);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_gate_with_three_parameter_declarationContext extends ParserRuleContext {
		public Single_gate_with_three_parameter_typeContext single_gate_with_three_parameter_type() {
			return getRuleContext(Single_gate_with_three_parameter_typeContext.class,0);
		}
		public Q_KEY_declarationContext q_KEY_declaration() {
			return getRuleContext(Q_KEY_declarationContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(TodoLangGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TodoLangGrammarParser.COMMA, i);
		}
		public TerminalNode LPAREN() { return getToken(TodoLangGrammarParser.LPAREN, 0); }
		public List<Constant_expressionContext> constant_expression() {
			return getRuleContexts(Constant_expressionContext.class);
		}
		public Constant_expressionContext constant_expression(int i) {
			return getRuleContext(Constant_expressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(TodoLangGrammarParser.RPAREN, 0); }
		public TerminalNode Q_KEY() { return getToken(TodoLangGrammarParser.Q_KEY, 0); }
		public Single_gate_with_three_parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_gate_with_three_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterSingle_gate_with_three_parameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitSingle_gate_with_three_parameter_declaration(this);
		}
	}

	public final Single_gate_with_three_parameter_declarationContext single_gate_with_three_parameter_declaration() throws RecognitionException {
		Single_gate_with_three_parameter_declarationContext _localctx = new Single_gate_with_three_parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_single_gate_with_three_parameter_declaration);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				single_gate_with_three_parameter_type();
				setState(228);
				q_KEY_declaration();
				setState(229);
				match(COMMA);
				setState(230);
				match(LPAREN);
				setState(231);
				constant_expression();
				setState(232);
				match(COMMA);
				setState(233);
				constant_expression();
				setState(234);
				match(COMMA);
				setState(235);
				constant_expression();
				setState(236);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				single_gate_with_three_parameter_type();
				setState(239);
				match(Q_KEY);
				setState(240);
				match(COMMA);
				setState(241);
				match(LPAREN);
				setState(242);
				constant_expression();
				setState(243);
				match(COMMA);
				setState(244);
				constant_expression();
				setState(245);
				match(COMMA);
				setState(246);
				constant_expression();
				setState(247);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_gate_with_four_parameter_declarationContext extends ParserRuleContext {
		public Single_gate_with_four_parameter_typeContext single_gate_with_four_parameter_type() {
			return getRuleContext(Single_gate_with_four_parameter_typeContext.class,0);
		}
		public Q_KEY_declarationContext q_KEY_declaration() {
			return getRuleContext(Q_KEY_declarationContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(TodoLangGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TodoLangGrammarParser.COMMA, i);
		}
		public TerminalNode LPAREN() { return getToken(TodoLangGrammarParser.LPAREN, 0); }
		public List<Constant_expressionContext> constant_expression() {
			return getRuleContexts(Constant_expressionContext.class);
		}
		public Constant_expressionContext constant_expression(int i) {
			return getRuleContext(Constant_expressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(TodoLangGrammarParser.RPAREN, 0); }
		public TerminalNode Q_KEY() { return getToken(TodoLangGrammarParser.Q_KEY, 0); }
		public Single_gate_with_four_parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_gate_with_four_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterSingle_gate_with_four_parameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitSingle_gate_with_four_parameter_declaration(this);
		}
	}

	public final Single_gate_with_four_parameter_declarationContext single_gate_with_four_parameter_declaration() throws RecognitionException {
		Single_gate_with_four_parameter_declarationContext _localctx = new Single_gate_with_four_parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_single_gate_with_four_parameter_declaration);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				single_gate_with_four_parameter_type();
				setState(252);
				q_KEY_declaration();
				setState(253);
				match(COMMA);
				setState(254);
				match(LPAREN);
				setState(255);
				constant_expression();
				setState(256);
				match(COMMA);
				setState(257);
				constant_expression();
				setState(258);
				match(COMMA);
				setState(259);
				constant_expression();
				setState(260);
				match(COMMA);
				setState(261);
				constant_expression();
				setState(262);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				single_gate_with_four_parameter_type();
				setState(265);
				match(Q_KEY);
				setState(266);
				match(COMMA);
				setState(267);
				match(LPAREN);
				setState(268);
				constant_expression();
				setState(269);
				match(COMMA);
				setState(270);
				constant_expression();
				setState(271);
				match(COMMA);
				setState(272);
				constant_expression();
				setState(273);
				match(COMMA);
				setState(274);
				constant_expression();
				setState(275);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Double_gate_without_parameter_declarationContext extends ParserRuleContext {
		public Double_gate_without_parameter_typeContext double_gate_without_parameter_type() {
			return getRuleContext(Double_gate_without_parameter_typeContext.class,0);
		}
		public List<Q_KEY_declarationContext> q_KEY_declaration() {
			return getRuleContexts(Q_KEY_declarationContext.class);
		}
		public Q_KEY_declarationContext q_KEY_declaration(int i) {
			return getRuleContext(Q_KEY_declarationContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(TodoLangGrammarParser.COMMA, 0); }
		public Double_gate_without_parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_gate_without_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterDouble_gate_without_parameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitDouble_gate_without_parameter_declaration(this);
		}
	}

	public final Double_gate_without_parameter_declarationContext double_gate_without_parameter_declaration() throws RecognitionException {
		Double_gate_without_parameter_declarationContext _localctx = new Double_gate_without_parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_double_gate_without_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			double_gate_without_parameter_type();
			setState(280);
			q_KEY_declaration();
			setState(281);
			match(COMMA);
			setState(282);
			q_KEY_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Double_gate_with_one_parameter_declarationContext extends ParserRuleContext {
		public Double_gate_with_one_parameter_typeContext double_gate_with_one_parameter_type() {
			return getRuleContext(Double_gate_with_one_parameter_typeContext.class,0);
		}
		public List<Q_KEY_declarationContext> q_KEY_declaration() {
			return getRuleContexts(Q_KEY_declarationContext.class);
		}
		public Q_KEY_declarationContext q_KEY_declaration(int i) {
			return getRuleContext(Q_KEY_declarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TodoLangGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TodoLangGrammarParser.COMMA, i);
		}
		public TerminalNode LPAREN() { return getToken(TodoLangGrammarParser.LPAREN, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TodoLangGrammarParser.RPAREN, 0); }
		public Double_gate_with_one_parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_gate_with_one_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterDouble_gate_with_one_parameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitDouble_gate_with_one_parameter_declaration(this);
		}
	}

	public final Double_gate_with_one_parameter_declarationContext double_gate_with_one_parameter_declaration() throws RecognitionException {
		Double_gate_with_one_parameter_declarationContext _localctx = new Double_gate_with_one_parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_double_gate_with_one_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			double_gate_with_one_parameter_type();
			setState(285);
			q_KEY_declaration();
			setState(286);
			match(COMMA);
			setState(287);
			q_KEY_declaration();
			setState(288);
			match(COMMA);
			setState(289);
			match(LPAREN);
			setState(290);
			constant_expression();
			setState(291);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Double_gate_with_four_parameter_declarationContext extends ParserRuleContext {
		public Double_gate_with_four_parameter_typeContext double_gate_with_four_parameter_type() {
			return getRuleContext(Double_gate_with_four_parameter_typeContext.class,0);
		}
		public List<Q_KEY_declarationContext> q_KEY_declaration() {
			return getRuleContexts(Q_KEY_declarationContext.class);
		}
		public Q_KEY_declarationContext q_KEY_declaration(int i) {
			return getRuleContext(Q_KEY_declarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TodoLangGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TodoLangGrammarParser.COMMA, i);
		}
		public TerminalNode LPAREN() { return getToken(TodoLangGrammarParser.LPAREN, 0); }
		public List<Constant_expressionContext> constant_expression() {
			return getRuleContexts(Constant_expressionContext.class);
		}
		public Constant_expressionContext constant_expression(int i) {
			return getRuleContext(Constant_expressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(TodoLangGrammarParser.RPAREN, 0); }
		public Double_gate_with_four_parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_gate_with_four_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterDouble_gate_with_four_parameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitDouble_gate_with_four_parameter_declaration(this);
		}
	}

	public final Double_gate_with_four_parameter_declarationContext double_gate_with_four_parameter_declaration() throws RecognitionException {
		Double_gate_with_four_parameter_declarationContext _localctx = new Double_gate_with_four_parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_double_gate_with_four_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			double_gate_with_four_parameter_type();
			setState(294);
			q_KEY_declaration();
			setState(295);
			match(COMMA);
			setState(296);
			q_KEY_declaration();
			setState(297);
			match(COMMA);
			setState(298);
			match(LPAREN);
			setState(299);
			constant_expression();
			setState(300);
			match(COMMA);
			setState(301);
			constant_expression();
			setState(302);
			match(COMMA);
			setState(303);
			constant_expression();
			setState(304);
			match(COMMA);
			setState(305);
			constant_expression();
			setState(306);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Triple_gate_without_parameter_declarationContext extends ParserRuleContext {
		public Triple_gate_without_parameter_typeContext triple_gate_without_parameter_type() {
			return getRuleContext(Triple_gate_without_parameter_typeContext.class,0);
		}
		public List<Q_KEY_declarationContext> q_KEY_declaration() {
			return getRuleContexts(Q_KEY_declarationContext.class);
		}
		public Q_KEY_declarationContext q_KEY_declaration(int i) {
			return getRuleContext(Q_KEY_declarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TodoLangGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TodoLangGrammarParser.COMMA, i);
		}
		public Triple_gate_without_parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triple_gate_without_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterTriple_gate_without_parameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitTriple_gate_without_parameter_declaration(this);
		}
	}

	public final Triple_gate_without_parameter_declarationContext triple_gate_without_parameter_declaration() throws RecognitionException {
		Triple_gate_without_parameter_declarationContext _localctx = new Triple_gate_without_parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_triple_gate_without_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			triple_gate_without_parameter_type();
			setState(309);
			q_KEY_declaration();
			setState(310);
			match(COMMA);
			setState(311);
			q_KEY_declaration();
			setState(312);
			match(COMMA);
			setState(313);
			q_KEY_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Define_gate_declarationContext extends ParserRuleContext {
		public Q_KEY_declarationContext q_KEY_declaration;
		public List<Q_KEY_declarationContext> argument_list = new ArrayList<Q_KEY_declarationContext>();
		public Constant_expressionContext constant_expression;
		public List<Constant_expressionContext> angle_list = new ArrayList<Constant_expressionContext>();
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<Q_KEY_declarationContext> q_KEY_declaration() {
			return getRuleContexts(Q_KEY_declarationContext.class);
		}
		public Q_KEY_declarationContext q_KEY_declaration(int i) {
			return getRuleContext(Q_KEY_declarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TodoLangGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TodoLangGrammarParser.COMMA, i);
		}
		public TerminalNode LPAREN() { return getToken(TodoLangGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TodoLangGrammarParser.RPAREN, 0); }
		public List<Constant_expressionContext> constant_expression() {
			return getRuleContexts(Constant_expressionContext.class);
		}
		public Constant_expressionContext constant_expression(int i) {
			return getRuleContext(Constant_expressionContext.class,i);
		}
		public Define_gate_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_gate_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterDefine_gate_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitDefine_gate_declaration(this);
		}
	}

	public final Define_gate_declarationContext define_gate_declaration() throws RecognitionException {
		Define_gate_declarationContext _localctx = new Define_gate_declarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_define_gate_declaration);
		int _la;
		try {
			int _alt;
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				id();
				setState(316);
				((Define_gate_declarationContext)_localctx).q_KEY_declaration = q_KEY_declaration();
				((Define_gate_declarationContext)_localctx).argument_list.add(((Define_gate_declarationContext)_localctx).q_KEY_declaration);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(317);
					match(COMMA);
					setState(318);
					((Define_gate_declarationContext)_localctx).q_KEY_declaration = q_KEY_declaration();
					((Define_gate_declarationContext)_localctx).argument_list.add(((Define_gate_declarationContext)_localctx).q_KEY_declaration);
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				id();
				setState(325);
				((Define_gate_declarationContext)_localctx).q_KEY_declaration = q_KEY_declaration();
				((Define_gate_declarationContext)_localctx).argument_list.add(((Define_gate_declarationContext)_localctx).q_KEY_declaration);
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(326);
						match(COMMA);
						setState(327);
						((Define_gate_declarationContext)_localctx).q_KEY_declaration = q_KEY_declaration();
						((Define_gate_declarationContext)_localctx).argument_list.add(((Define_gate_declarationContext)_localctx).q_KEY_declaration);
						}
						} 
					}
					setState(332);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(333);
				match(COMMA);
				setState(334);
				match(LPAREN);
				setState(335);
				((Define_gate_declarationContext)_localctx).constant_expression = constant_expression();
				((Define_gate_declarationContext)_localctx).angle_list.add(((Define_gate_declarationContext)_localctx).constant_expression);
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(336);
					match(COMMA);
					setState(337);
					((Define_gate_declarationContext)_localctx).constant_expression = constant_expression();
					((Define_gate_declarationContext)_localctx).angle_list.add(((Define_gate_declarationContext)_localctx).constant_expression);
					}
					}
					setState(342);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(343);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_gate_without_parameter_typeContext extends ParserRuleContext {
		public TerminalNode H_GATE() { return getToken(TodoLangGrammarParser.H_GATE, 0); }
		public TerminalNode T_GATE() { return getToken(TodoLangGrammarParser.T_GATE, 0); }
		public TerminalNode S_GATE() { return getToken(TodoLangGrammarParser.S_GATE, 0); }
		public TerminalNode X_GATE() { return getToken(TodoLangGrammarParser.X_GATE, 0); }
		public TerminalNode Y_GATE() { return getToken(TodoLangGrammarParser.Y_GATE, 0); }
		public TerminalNode Z_GATE() { return getToken(TodoLangGrammarParser.Z_GATE, 0); }
		public TerminalNode X1_GATE() { return getToken(TodoLangGrammarParser.X1_GATE, 0); }
		public TerminalNode Y1_GATE() { return getToken(TodoLangGrammarParser.Y1_GATE, 0); }
		public TerminalNode Z1_GATE() { return getToken(TodoLangGrammarParser.Z1_GATE, 0); }
		public TerminalNode I_GATE() { return getToken(TodoLangGrammarParser.I_GATE, 0); }
		public TerminalNode ECHO_GATE() { return getToken(TodoLangGrammarParser.ECHO_GATE, 0); }
		public Single_gate_without_parameter_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_gate_without_parameter_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterSingle_gate_without_parameter_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitSingle_gate_without_parameter_type(this);
		}
	}

	public final Single_gate_without_parameter_typeContext single_gate_without_parameter_type() throws RecognitionException {
		Single_gate_without_parameter_typeContext _localctx = new Single_gate_without_parameter_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_single_gate_without_parameter_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2092544L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_gate_with_one_parameter_typeContext extends ParserRuleContext {
		public TerminalNode RX_GATE() { return getToken(TodoLangGrammarParser.RX_GATE, 0); }
		public TerminalNode RY_GATE() { return getToken(TodoLangGrammarParser.RY_GATE, 0); }
		public TerminalNode RZ_GATE() { return getToken(TodoLangGrammarParser.RZ_GATE, 0); }
		public TerminalNode U1_GATE() { return getToken(TodoLangGrammarParser.U1_GATE, 0); }
		public Single_gate_with_one_parameter_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_gate_with_one_parameter_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterSingle_gate_with_one_parameter_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitSingle_gate_with_one_parameter_type(this);
		}
	}

	public final Single_gate_with_one_parameter_typeContext single_gate_with_one_parameter_type() throws RecognitionException {
		Single_gate_with_one_parameter_typeContext _localctx = new Single_gate_with_one_parameter_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_single_gate_with_one_parameter_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_gate_with_two_parameter_typeContext extends ParserRuleContext {
		public TerminalNode U2_GATE() { return getToken(TodoLangGrammarParser.U2_GATE, 0); }
		public TerminalNode RPHI_GATE() { return getToken(TodoLangGrammarParser.RPHI_GATE, 0); }
		public Single_gate_with_two_parameter_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_gate_with_two_parameter_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterSingle_gate_with_two_parameter_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitSingle_gate_with_two_parameter_type(this);
		}
	}

	public final Single_gate_with_two_parameter_typeContext single_gate_with_two_parameter_type() throws RecognitionException {
		Single_gate_with_two_parameter_typeContext _localctx = new Single_gate_with_two_parameter_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_single_gate_with_two_parameter_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !(_la==U2_GATE || _la==RPHI_GATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_gate_with_three_parameter_typeContext extends ParserRuleContext {
		public TerminalNode U3_GATE() { return getToken(TodoLangGrammarParser.U3_GATE, 0); }
		public Single_gate_with_three_parameter_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_gate_with_three_parameter_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterSingle_gate_with_three_parameter_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitSingle_gate_with_three_parameter_type(this);
		}
	}

	public final Single_gate_with_three_parameter_typeContext single_gate_with_three_parameter_type() throws RecognitionException {
		Single_gate_with_three_parameter_typeContext _localctx = new Single_gate_with_three_parameter_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_single_gate_with_three_parameter_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(U3_GATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_gate_with_four_parameter_typeContext extends ParserRuleContext {
		public TerminalNode U4_GATE() { return getToken(TodoLangGrammarParser.U4_GATE, 0); }
		public Single_gate_with_four_parameter_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_gate_with_four_parameter_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterSingle_gate_with_four_parameter_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitSingle_gate_with_four_parameter_type(this);
		}
	}

	public final Single_gate_with_four_parameter_typeContext single_gate_with_four_parameter_type() throws RecognitionException {
		Single_gate_with_four_parameter_typeContext _localctx = new Single_gate_with_four_parameter_typeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_single_gate_with_four_parameter_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(U4_GATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Double_gate_without_parameter_typeContext extends ParserRuleContext {
		public TerminalNode CNOT_GATE() { return getToken(TodoLangGrammarParser.CNOT_GATE, 0); }
		public TerminalNode CZ_GATE() { return getToken(TodoLangGrammarParser.CZ_GATE, 0); }
		public TerminalNode ISWAP_GATE() { return getToken(TodoLangGrammarParser.ISWAP_GATE, 0); }
		public TerminalNode SQISWAP_GATE() { return getToken(TodoLangGrammarParser.SQISWAP_GATE, 0); }
		public TerminalNode SWAPZ1_GATE() { return getToken(TodoLangGrammarParser.SWAPZ1_GATE, 0); }
		public Double_gate_without_parameter_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_gate_without_parameter_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterDouble_gate_without_parameter_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitDouble_gate_without_parameter_type(this);
		}
	}

	public final Double_gate_without_parameter_typeContext double_gate_without_parameter_type() throws RecognitionException {
		Double_gate_without_parameter_typeContext _localctx = new Double_gate_without_parameter_typeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_double_gate_without_parameter_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31675383808L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Double_gate_with_one_parameter_typeContext extends ParserRuleContext {
		public TerminalNode ISWAPTHETA_GATE() { return getToken(TodoLangGrammarParser.ISWAPTHETA_GATE, 0); }
		public TerminalNode CR_GATE() { return getToken(TodoLangGrammarParser.CR_GATE, 0); }
		public Double_gate_with_one_parameter_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_gate_with_one_parameter_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterDouble_gate_with_one_parameter_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitDouble_gate_with_one_parameter_type(this);
		}
	}

	public final Double_gate_with_one_parameter_typeContext double_gate_with_one_parameter_type() throws RecognitionException {
		Double_gate_with_one_parameter_typeContext _localctx = new Double_gate_with_one_parameter_typeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_double_gate_with_one_parameter_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !(_la==ISWAPTHETA_GATE || _la==CR_GATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Double_gate_with_four_parameter_typeContext extends ParserRuleContext {
		public TerminalNode CU_GATE() { return getToken(TodoLangGrammarParser.CU_GATE, 0); }
		public Double_gate_with_four_parameter_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_gate_with_four_parameter_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterDouble_gate_with_four_parameter_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitDouble_gate_with_four_parameter_type(this);
		}
	}

	public final Double_gate_with_four_parameter_typeContext double_gate_with_four_parameter_type() throws RecognitionException {
		Double_gate_with_four_parameter_typeContext _localctx = new Double_gate_with_four_parameter_typeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_double_gate_with_four_parameter_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(CU_GATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Triple_gate_without_parameter_typeContext extends ParserRuleContext {
		public TerminalNode TOFFOLI_GATE() { return getToken(TodoLangGrammarParser.TOFFOLI_GATE, 0); }
		public Triple_gate_without_parameter_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triple_gate_without_parameter_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterTriple_gate_without_parameter_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitTriple_gate_without_parameter_type(this);
		}
	}

	public final Triple_gate_without_parameter_typeContext triple_gate_without_parameter_type() throws RecognitionException {
		Triple_gate_without_parameter_typeContext _localctx = new Triple_gate_without_parameter_typeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_triple_gate_without_parameter_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(TOFFOLI_GATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Primary_expressionContext extends ParserRuleContext {
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
	 
		public Primary_expressionContext() { }
		public void copyFrom(Primary_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Pri_ckeyContext extends Primary_expressionContext {
		public C_KEY_declarationContext c_KEY_declaration() {
			return getRuleContext(C_KEY_declarationContext.class,0);
		}
		public Pri_ckeyContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterPri_ckey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitPri_ckey(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Pri_cstContext extends Primary_expressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Pri_cstContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterPri_cst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitPri_cst(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Pri_exprContext extends Primary_expressionContext {
		public List<TerminalNode> LPAREN() { return getTokens(TodoLangGrammarParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(TodoLangGrammarParser.LPAREN, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Pri_exprContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterPri_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitPri_expr(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primary_expression);
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case C_KEY:
				_localctx = new Pri_ckeyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				c_KEY_declaration();
				}
				break;
			case PI:
			case Integer_Literal:
			case Double_Literal:
				_localctx = new Pri_cstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				constant();
				}
				break;
			case LPAREN:
				_localctx = new Pri_exprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				match(LPAREN);
				setState(368);
				expression();
				setState(369);
				match(LPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_expressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(TodoLangGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TodoLangGrammarParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(TodoLangGrammarParser.NOT, 0); }
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitUnary_expression(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unary_expression);
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PI:
			case C_KEY:
			case LPAREN:
			case Integer_Literal:
			case Double_Literal:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				primary_expression();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(PLUS);
				setState(375);
				primary_expression();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				match(MINUS);
				setState(377);
				primary_expression();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				match(NOT);
				setState(379);
				primary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public Unary_expressionContext denominator;
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(TodoLangGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(TodoLangGrammarParser.DIV, 0); }
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitMultiplicative_expression(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		return multiplicative_expression(0);
	}

	private Multiplicative_expressionContext multiplicative_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, _parentState);
		Multiplicative_expressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_multiplicative_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(383);
			unary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(391);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(385);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(386);
						match(MUL);
						setState(387);
						unary_expression();
						}
						break;
					case 2:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(388);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(389);
						match(DIV);
						setState(390);
						((Multiplicative_expressionContext)_localctx).denominator = unary_expression();
						}
						break;
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Addtive_expressionContext extends ParserRuleContext {
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Addtive_expressionContext addtive_expression() {
			return getRuleContext(Addtive_expressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(TodoLangGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TodoLangGrammarParser.MINUS, 0); }
		public Addtive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addtive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterAddtive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitAddtive_expression(this);
		}
	}

	public final Addtive_expressionContext addtive_expression() throws RecognitionException {
		return addtive_expression(0);
	}

	private Addtive_expressionContext addtive_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Addtive_expressionContext _localctx = new Addtive_expressionContext(_ctx, _parentState);
		Addtive_expressionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_addtive_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(397);
			multiplicative_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(405);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new Addtive_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addtive_expression);
						setState(399);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(400);
						match(PLUS);
						setState(401);
						multiplicative_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Addtive_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addtive_expression);
						setState(402);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(403);
						match(MINUS);
						setState(404);
						multiplicative_expression(0);
						}
						break;
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Relational_expressionContext extends ParserRuleContext {
		public Addtive_expressionContext addtive_expression() {
			return getRuleContext(Addtive_expressionContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public TerminalNode LT() { return getToken(TodoLangGrammarParser.LT, 0); }
		public TerminalNode GT() { return getToken(TodoLangGrammarParser.GT, 0); }
		public TerminalNode LEQ() { return getToken(TodoLangGrammarParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(TodoLangGrammarParser.GEQ, 0); }
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitRelational_expression(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		return relational_expression(0);
	}

	private Relational_expressionContext relational_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, _parentState);
		Relational_expressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_relational_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(411);
			addtive_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(425);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(413);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(414);
						match(LT);
						setState(415);
						addtive_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(416);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(417);
						match(GT);
						setState(418);
						addtive_expression(0);
						}
						break;
					case 3:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(419);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(420);
						match(LEQ);
						setState(421);
						addtive_expression(0);
						}
						break;
					case 4:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(422);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(423);
						match(GEQ);
						setState(424);
						addtive_expression(0);
						}
						break;
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Equality_expressionContext extends ParserRuleContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public TerminalNode EQ() { return getToken(TodoLangGrammarParser.EQ, 0); }
		public TerminalNode NE() { return getToken(TodoLangGrammarParser.NE, 0); }
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitEquality_expression(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		return equality_expression(0);
	}

	private Equality_expressionContext equality_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, _parentState);
		Equality_expressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_equality_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(431);
			relational_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(439);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new Equality_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
						setState(433);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(434);
						match(EQ);
						setState(435);
						relational_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Equality_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
						setState(436);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(437);
						match(NE);
						setState(438);
						relational_expression(0);
						}
						break;
					}
					} 
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_and_expressionContext extends ParserRuleContext {
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(TodoLangGrammarParser.AND, 0); }
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterLogical_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitLogical_and_expression(this);
		}
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		return logical_and_expression(0);
	}

	private Logical_and_expressionContext logical_and_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, _parentState);
		Logical_and_expressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_logical_and_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(445);
			equality_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_and_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_and_expression);
					setState(447);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(448);
					match(AND);
					setState(449);
					equality_expression(0);
					}
					} 
				}
				setState(454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_or_expressionContext extends ParserRuleContext {
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(TodoLangGrammarParser.OR, 0); }
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterLogical_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitLogical_or_expression(this);
		}
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		return logical_or_expression(0);
	}

	private Logical_or_expressionContext logical_or_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, _parentState);
		Logical_or_expressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_logical_or_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(456);
			logical_and_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_or_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_or_expression);
					setState(458);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(459);
					match(OR);
					setState(460);
					logical_and_expression(0);
					}
					} 
				}
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_expressionContext extends ParserRuleContext {
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public C_KEY_declarationContext c_KEY_declaration() {
			return getRuleContext(C_KEY_declarationContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TodoLangGrammarParser.ASSIGN, 0); }
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitAssignment_expression(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_assignment_expression);
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				logical_or_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				c_KEY_declaration();
				setState(468);
				match(ASSIGN);
				setState(469);
				logical_or_expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			assignment_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Controlbit_listContext extends ParserRuleContext {
		public List<Q_KEY_declarationContext> q_KEY_declaration() {
			return getRuleContexts(Q_KEY_declarationContext.class);
		}
		public Q_KEY_declarationContext q_KEY_declaration(int i) {
			return getRuleContext(Q_KEY_declarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TodoLangGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TodoLangGrammarParser.COMMA, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(TodoLangGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TodoLangGrammarParser.Identifier, i);
		}
		public Controlbit_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlbit_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterControlbit_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitControlbit_list(this);
		}
	}

	public final Controlbit_listContext controlbit_list() throws RecognitionException {
		Controlbit_listContext _localctx = new Controlbit_listContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_controlbit_list);
		int _la;
		try {
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Q_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				q_KEY_declaration();
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(476);
					match(COMMA);
					setState(477);
					q_KEY_declaration();
					}
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				match(Identifier);
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(484);
					match(COMMA);
					setState(485);
					match(Identifier);
					}
					}
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Quantum_gate_declarationContext quantum_gate_declaration() {
			return getRuleContext(Quantum_gate_declarationContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TodoLangGrammarParser.NEWLINE, 0); }
		public Control_statementContext control_statement() {
			return getRuleContext(Control_statementContext.class,0);
		}
		public Qif_statementContext qif_statement() {
			return getRuleContext(Qif_statementContext.class,0);
		}
		public Qwhile_statementContext qwhile_statement() {
			return getRuleContext(Qwhile_statementContext.class,0);
		}
		public Dagger_statementContext dagger_statement() {
			return getRuleContext(Dagger_statementContext.class,0);
		}
		public Measure_statementContext measure_statement() {
			return getRuleContext(Measure_statementContext.class,0);
		}
		public Reset_statementContext reset_statement() {
			return getRuleContext(Reset_statementContext.class,0);
		}
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Barrier_statementContext barrier_statement() {
			return getRuleContext(Barrier_statementContext.class,0);
		}
		public Gate_func_statementContext gate_func_statement() {
			return getRuleContext(Gate_func_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_statement);
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ECHO_GATE:
			case H_GATE:
			case X_GATE:
			case T_GATE:
			case S_GATE:
			case Y_GATE:
			case Z_GATE:
			case X1_GATE:
			case Y1_GATE:
			case Z1_GATE:
			case I_GATE:
			case U2_GATE:
			case RPHI_GATE:
			case U3_GATE:
			case U4_GATE:
			case RX_GATE:
			case RY_GATE:
			case RZ_GATE:
			case U1_GATE:
			case CNOT_GATE:
			case CZ_GATE:
			case CU_GATE:
			case ISWAP_GATE:
			case SQISWAP_GATE:
			case SWAPZ1_GATE:
			case ISWAPTHETA_GATE:
			case CR_GATE:
			case TOFFOLI_GATE:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				quantum_gate_declaration();
				setState(494);
				match(NEWLINE);
				}
				break;
			case CONTROL_KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				control_statement();
				}
				break;
			case QIF_KEY:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				qif_statement();
				}
				break;
			case QWHILE_KEY:
				enterOuterAlt(_localctx, 4);
				{
				setState(498);
				qwhile_statement();
				}
				break;
			case DAGGER_KEY:
				enterOuterAlt(_localctx, 5);
				{
				setState(499);
				dagger_statement();
				}
				break;
			case MEASURE_KEY:
				enterOuterAlt(_localctx, 6);
				{
				setState(500);
				measure_statement();
				setState(501);
				match(NEWLINE);
				}
				break;
			case RESET_KEY:
				enterOuterAlt(_localctx, 7);
				{
				setState(503);
				reset_statement();
				}
				break;
			case PI:
			case C_KEY:
			case NOT:
			case PLUS:
			case MINUS:
			case LPAREN:
			case Integer_Literal:
			case Double_Literal:
				enterOuterAlt(_localctx, 8);
				{
				setState(504);
				expression_statement();
				}
				break;
			case BARRIER_KEY:
				enterOuterAlt(_localctx, 9);
				{
				setState(505);
				barrier_statement();
				setState(506);
				match(NEWLINE);
				}
				break;
			case QGATE_KEY:
				enterOuterAlt(_localctx, 10);
				{
				setState(508);
				gate_func_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dagger_statementContext extends ParserRuleContext {
		public TerminalNode DAGGER_KEY() { return getToken(TodoLangGrammarParser.DAGGER_KEY, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(TodoLangGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TodoLangGrammarParser.NEWLINE, i);
		}
		public TerminalNode ENDDAGGER_KEY() { return getToken(TodoLangGrammarParser.ENDDAGGER_KEY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Dagger_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dagger_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterDagger_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitDagger_statement(this);
		}
	}

	public final Dagger_statementContext dagger_statement() throws RecognitionException {
		Dagger_statementContext _localctx = new Dagger_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dagger_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(DAGGER_KEY);
			setState(512);
			match(NEWLINE);
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3468698326499585762L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 225L) != 0)) {
				{
				{
				setState(513);
				statement();
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(519);
			match(ENDDAGGER_KEY);
			setState(520);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Control_statementContext extends ParserRuleContext {
		public TerminalNode CONTROL_KEY() { return getToken(TodoLangGrammarParser.CONTROL_KEY, 0); }
		public Controlbit_listContext controlbit_list() {
			return getRuleContext(Controlbit_listContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(TodoLangGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TodoLangGrammarParser.NEWLINE, i);
		}
		public TerminalNode ENDCONTROL_KEY() { return getToken(TodoLangGrammarParser.ENDCONTROL_KEY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Control_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterControl_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitControl_statement(this);
		}
	}

	public final Control_statementContext control_statement() throws RecognitionException {
		Control_statementContext _localctx = new Control_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_control_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(CONTROL_KEY);
			setState(523);
			controlbit_list();
			setState(524);
			match(NEWLINE);
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3468698326499585762L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 225L) != 0)) {
				{
				{
				setState(525);
				statement();
				}
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(531);
			match(ENDCONTROL_KEY);
			setState(532);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Qelse_statement_fragmentContext extends ParserRuleContext {
		public TerminalNode ELSE_KEY() { return getToken(TodoLangGrammarParser.ELSE_KEY, 0); }
		public TerminalNode NEWLINE() { return getToken(TodoLangGrammarParser.NEWLINE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Qelse_statement_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qelse_statement_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterQelse_statement_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitQelse_statement_fragment(this);
		}
	}

	public final Qelse_statement_fragmentContext qelse_statement_fragment() throws RecognitionException {
		Qelse_statement_fragmentContext _localctx = new Qelse_statement_fragmentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_qelse_statement_fragment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(ELSE_KEY);
			setState(535);
			match(NEWLINE);
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3468698326499585762L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 225L) != 0)) {
				{
				{
				setState(536);
				statement();
				}
				}
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Qif_statementContext extends ParserRuleContext {
		public Qif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qif_statement; }
	 
		public Qif_statementContext() { }
		public void copyFrom(Qif_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Qif_ifContext extends Qif_statementContext {
		public TerminalNode QIF_KEY() { return getToken(TodoLangGrammarParser.QIF_KEY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(TodoLangGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TodoLangGrammarParser.NEWLINE, i);
		}
		public Qelse_statement_fragmentContext qelse_statement_fragment() {
			return getRuleContext(Qelse_statement_fragmentContext.class,0);
		}
		public TerminalNode ENDIF_KEY() { return getToken(TodoLangGrammarParser.ENDIF_KEY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Qif_ifContext(Qif_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterQif_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitQif_if(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Qif_ifelseContext extends Qif_statementContext {
		public TerminalNode QIF_KEY() { return getToken(TodoLangGrammarParser.QIF_KEY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(TodoLangGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TodoLangGrammarParser.NEWLINE, i);
		}
		public TerminalNode ENDIF_KEY() { return getToken(TodoLangGrammarParser.ENDIF_KEY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Qif_ifelseContext(Qif_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterQif_ifelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitQif_ifelse(this);
		}
	}

	public final Qif_statementContext qif_statement() throws RecognitionException {
		Qif_statementContext _localctx = new Qif_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_qif_statement);
		int _la;
		try {
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new Qif_ifContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				match(QIF_KEY);
				setState(543);
				expression();
				setState(544);
				match(NEWLINE);
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3468698326499585762L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 225L) != 0)) {
					{
					{
					setState(545);
					statement();
					}
					}
					setState(550);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(551);
				qelse_statement_fragment();
				setState(552);
				match(ENDIF_KEY);
				setState(553);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new Qif_ifelseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				match(QIF_KEY);
				setState(556);
				expression();
				setState(557);
				match(NEWLINE);
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3468698326499585762L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 225L) != 0)) {
					{
					{
					setState(558);
					statement();
					}
					}
					setState(563);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(564);
				match(ENDIF_KEY);
				setState(565);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Qwhile_statementContext extends ParserRuleContext {
		public TerminalNode QWHILE_KEY() { return getToken(TodoLangGrammarParser.QWHILE_KEY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(TodoLangGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TodoLangGrammarParser.NEWLINE, i);
		}
		public TerminalNode ENDQWHILE_KEY() { return getToken(TodoLangGrammarParser.ENDQWHILE_KEY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Qwhile_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qwhile_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterQwhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitQwhile_statement(this);
		}
	}

	public final Qwhile_statementContext qwhile_statement() throws RecognitionException {
		Qwhile_statementContext _localctx = new Qwhile_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_qwhile_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(QWHILE_KEY);
			setState(570);
			expression();
			setState(571);
			match(NEWLINE);
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3468698326499585762L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 225L) != 0)) {
				{
				{
				setState(572);
				statement();
				}
				}
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(578);
			match(ENDQWHILE_KEY);
			setState(579);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Measure_statementContext extends ParserRuleContext {
		public TerminalNode MEASURE_KEY() { return getToken(TodoLangGrammarParser.MEASURE_KEY, 0); }
		public Q_KEY_declarationContext q_KEY_declaration() {
			return getRuleContext(Q_KEY_declarationContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(TodoLangGrammarParser.COMMA, 0); }
		public C_KEY_declarationContext c_KEY_declaration() {
			return getRuleContext(C_KEY_declarationContext.class,0);
		}
		public TerminalNode Q_KEY() { return getToken(TodoLangGrammarParser.Q_KEY, 0); }
		public TerminalNode C_KEY() { return getToken(TodoLangGrammarParser.C_KEY, 0); }
		public TerminalNode NEWLINE() { return getToken(TodoLangGrammarParser.NEWLINE, 0); }
		public Measure_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measure_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterMeasure_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitMeasure_statement(this);
		}
	}

	public final Measure_statementContext measure_statement() throws RecognitionException {
		Measure_statementContext _localctx = new Measure_statementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_measure_statement);
		try {
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				match(MEASURE_KEY);
				setState(582);
				q_KEY_declaration();
				setState(583);
				match(COMMA);
				setState(584);
				c_KEY_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
				match(MEASURE_KEY);
				setState(587);
				match(Q_KEY);
				setState(588);
				match(COMMA);
				setState(589);
				match(C_KEY);
				setState(590);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Reset_statementContext extends ParserRuleContext {
		public TerminalNode RESET_KEY() { return getToken(TodoLangGrammarParser.RESET_KEY, 0); }
		public Q_KEY_declarationContext q_KEY_declaration() {
			return getRuleContext(Q_KEY_declarationContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TodoLangGrammarParser.NEWLINE, 0); }
		public TerminalNode Q_KEY() { return getToken(TodoLangGrammarParser.Q_KEY, 0); }
		public Reset_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reset_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterReset_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitReset_statement(this);
		}
	}

	public final Reset_statementContext reset_statement() throws RecognitionException {
		Reset_statementContext _localctx = new Reset_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_reset_statement);
		try {
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				match(RESET_KEY);
				setState(594);
				q_KEY_declaration();
				setState(595);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				match(RESET_KEY);
				setState(598);
				match(Q_KEY);
				setState(599);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Barrier_statementContext extends ParserRuleContext {
		public TerminalNode BARRIER_KEY() { return getToken(TodoLangGrammarParser.BARRIER_KEY, 0); }
		public Controlbit_listContext controlbit_list() {
			return getRuleContext(Controlbit_listContext.class,0);
		}
		public TerminalNode Q_KEY() { return getToken(TodoLangGrammarParser.Q_KEY, 0); }
		public TerminalNode NEWLINE() { return getToken(TodoLangGrammarParser.NEWLINE, 0); }
		public Barrier_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_barrier_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterBarrier_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitBarrier_statement(this);
		}
	}

	public final Barrier_statementContext barrier_statement() throws RecognitionException {
		Barrier_statementContext _localctx = new Barrier_statementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_barrier_statement);
		try {
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				match(BARRIER_KEY);
				setState(603);
				controlbit_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				match(BARRIER_KEY);
				setState(605);
				match(Q_KEY);
				setState(606);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TodoLangGrammarParser.NEWLINE, 0); }
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitExpression_statement(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expression_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			expression();
			setState(610);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Define_gate_statementContext extends ParserRuleContext {
		public Gate_nameContext gate_name() {
			return getRuleContext(Gate_nameContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TodoLangGrammarParser.NEWLINE, 0); }
		public TerminalNode RPAREN() { return getToken(TodoLangGrammarParser.RPAREN, 0); }
		public Define_gate_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_gate_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterDefine_gate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitDefine_gate_statement(this);
		}
	}

	public final Define_gate_statementContext define_gate_statement() throws RecognitionException {
		Define_gate_statementContext _localctx = new Define_gate_statementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_define_gate_statement);
		try {
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				gate_name();
				setState(613);
				id_list();
				setState(614);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				gate_name();
				setState(617);
				id_list();
				setState(618);
				match(RPAREN);
				setState(619);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Define_dagger_statementContext extends ParserRuleContext {
		public TerminalNode DAGGER_KEY() { return getToken(TodoLangGrammarParser.DAGGER_KEY, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(TodoLangGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TodoLangGrammarParser.NEWLINE, i);
		}
		public TerminalNode ENDDAGGER_KEY() { return getToken(TodoLangGrammarParser.ENDDAGGER_KEY, 0); }
		public List<User_defined_gateContext> user_defined_gate() {
			return getRuleContexts(User_defined_gateContext.class);
		}
		public User_defined_gateContext user_defined_gate(int i) {
			return getRuleContext(User_defined_gateContext.class,i);
		}
		public Define_dagger_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_dagger_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterDefine_dagger_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitDefine_dagger_statement(this);
		}
	}

	public final Define_dagger_statementContext define_dagger_statement() throws RecognitionException {
		Define_dagger_statementContext _localctx = new Define_dagger_statementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_define_dagger_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(DAGGER_KEY);
			setState(624);
			match(NEWLINE);
			setState(626); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(625);
				user_defined_gate();
				}
				}
				setState(628); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 2305843015119273975L) != 0) );
			setState(630);
			match(ENDDAGGER_KEY);
			setState(631);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Define_control_statementContext extends ParserRuleContext {
		public TerminalNode CONTROL_KEY() { return getToken(TodoLangGrammarParser.CONTROL_KEY, 0); }
		public Controlbit_listContext controlbit_list() {
			return getRuleContext(Controlbit_listContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(TodoLangGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TodoLangGrammarParser.NEWLINE, i);
		}
		public TerminalNode ENDCONTROL_KEY() { return getToken(TodoLangGrammarParser.ENDCONTROL_KEY, 0); }
		public List<User_defined_gateContext> user_defined_gate() {
			return getRuleContexts(User_defined_gateContext.class);
		}
		public User_defined_gateContext user_defined_gate(int i) {
			return getRuleContext(User_defined_gateContext.class,i);
		}
		public Define_control_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_control_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterDefine_control_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitDefine_control_statement(this);
		}
	}

	public final Define_control_statementContext define_control_statement() throws RecognitionException {
		Define_control_statementContext _localctx = new Define_control_statementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_define_control_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(CONTROL_KEY);
			setState(634);
			controlbit_list();
			setState(635);
			match(NEWLINE);
			setState(637); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(636);
				user_defined_gate();
				}
				}
				setState(639); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 2305843015119273975L) != 0) );
			setState(641);
			match(ENDCONTROL_KEY);
			setState(642);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class User_defined_gateContext extends ParserRuleContext {
		public Define_gate_statementContext define_gate_statement() {
			return getRuleContext(Define_gate_statementContext.class,0);
		}
		public Define_dagger_statementContext define_dagger_statement() {
			return getRuleContext(Define_dagger_statementContext.class,0);
		}
		public Define_control_statementContext define_control_statement() {
			return getRuleContext(Define_control_statementContext.class,0);
		}
		public User_defined_gateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_defined_gate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterUser_defined_gate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitUser_defined_gate(this);
		}
	}

	public final User_defined_gateContext user_defined_gate() throws RecognitionException {
		User_defined_gateContext _localctx = new User_defined_gateContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_user_defined_gate);
		try {
			setState(647);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ECHO_GATE:
			case H_GATE:
			case X_GATE:
			case T_GATE:
			case S_GATE:
			case Y_GATE:
			case Z_GATE:
			case X1_GATE:
			case Y1_GATE:
			case Z1_GATE:
			case I_GATE:
			case U2_GATE:
			case RPHI_GATE:
			case U3_GATE:
			case U4_GATE:
			case RX_GATE:
			case RY_GATE:
			case RZ_GATE:
			case U1_GATE:
			case CNOT_GATE:
			case CZ_GATE:
			case CU_GATE:
			case ISWAP_GATE:
			case SQISWAP_GATE:
			case SWAPZ1_GATE:
			case ISWAPTHETA_GATE:
			case CR_GATE:
			case TOFFOLI_GATE:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				define_gate_statement();
				}
				break;
			case DAGGER_KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
				define_dagger_statement();
				}
				break;
			case CONTROL_KEY:
				enterOuterAlt(_localctx, 3);
				{
				setState(646);
				define_control_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExplistContext extends ParserRuleContext {
		public ExpContext exp;
		public List<ExpContext> angles = new ArrayList<ExpContext>();
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TodoLangGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TodoLangGrammarParser.COMMA, i);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitExplist(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_explist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			((ExplistContext)_localctx).exp = exp(0);
			((ExplistContext)_localctx).angles.add(((ExplistContext)_localctx).exp);
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(650);
				match(COMMA);
				setState(651);
				((ExplistContext)_localctx).exp = exp(0);
				((ExplistContext)_localctx).angles.add(((ExplistContext)_localctx).exp);
				}
				}
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext denominator;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Integer_Literal() { return getToken(TodoLangGrammarParser.Integer_Literal, 0); }
		public TerminalNode Double_Literal() { return getToken(TodoLangGrammarParser.Double_Literal, 0); }
		public TerminalNode PI() { return getToken(TodoLangGrammarParser.PI, 0); }
		public TerminalNode LPAREN() { return getToken(TodoLangGrammarParser.LPAREN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(TodoLangGrammarParser.RPAREN, 0); }
		public TerminalNode MINUS() { return getToken(TodoLangGrammarParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(TodoLangGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(TodoLangGrammarParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(TodoLangGrammarParser.PLUS, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(658);
				id();
				}
				break;
			case Integer_Literal:
				{
				setState(659);
				match(Integer_Literal);
				}
				break;
			case Double_Literal:
				{
				setState(660);
				match(Double_Literal);
				}
				break;
			case PI:
				{
				setState(661);
				match(PI);
				}
				break;
			case LPAREN:
				{
				setState(662);
				match(LPAREN);
				setState(663);
				exp(0);
				setState(664);
				match(RPAREN);
				}
				break;
			case MINUS:
				{
				setState(666);
				match(MINUS);
				setState(667);
				exp(5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(684);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(682);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(670);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(671);
						match(MUL);
						setState(672);
						exp(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(673);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(674);
						match(DIV);
						setState(675);
						((ExpContext)_localctx).denominator = exp(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(676);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(677);
						match(PLUS);
						setState(678);
						exp(3);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(679);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(680);
						match(MINUS);
						setState(681);
						exp(2);
						}
						break;
					}
					} 
				}
				setState(686);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Gate_func_statementContext extends ParserRuleContext {
		public IdContext name;
		public Id_listContext params;
		public Id_listContext arguments;
		public TerminalNode QGATE_KEY() { return getToken(TodoLangGrammarParser.QGATE_KEY, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(TodoLangGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TodoLangGrammarParser.NEWLINE, i);
		}
		public TerminalNode ENDQGATE_KEY() { return getToken(TodoLangGrammarParser.ENDQGATE_KEY, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<Id_listContext> id_list() {
			return getRuleContexts(Id_listContext.class);
		}
		public Id_listContext id_list(int i) {
			return getRuleContext(Id_listContext.class,i);
		}
		public List<User_defined_gateContext> user_defined_gate() {
			return getRuleContexts(User_defined_gateContext.class);
		}
		public User_defined_gateContext user_defined_gate(int i) {
			return getRuleContext(User_defined_gateContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(TodoLangGrammarParser.COMMA, 0); }
		public TerminalNode LPAREN() { return getToken(TodoLangGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TodoLangGrammarParser.RPAREN, 0); }
		public Gate_func_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gate_func_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterGate_func_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitGate_func_statement(this);
		}
	}

	public final Gate_func_statementContext gate_func_statement() throws RecognitionException {
		Gate_func_statementContext _localctx = new Gate_func_statementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_gate_func_statement);
		int _la;
		try {
			setState(717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
				match(QGATE_KEY);
				setState(688);
				((Gate_func_statementContext)_localctx).name = id();
				setState(689);
				((Gate_func_statementContext)_localctx).params = id_list();
				setState(690);
				match(NEWLINE);
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 2305843015119273975L) != 0)) {
					{
					{
					setState(691);
					user_defined_gate();
					}
					}
					setState(696);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(697);
				match(ENDQGATE_KEY);
				setState(698);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
				match(QGATE_KEY);
				setState(701);
				((Gate_func_statementContext)_localctx).name = id();
				setState(702);
				((Gate_func_statementContext)_localctx).params = id_list();
				setState(703);
				match(COMMA);
				setState(704);
				match(LPAREN);
				setState(705);
				((Gate_func_statementContext)_localctx).arguments = id_list();
				setState(706);
				match(RPAREN);
				setState(707);
				match(NEWLINE);
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 2305843015119273975L) != 0)) {
					{
					{
					setState(708);
					user_defined_gate();
					}
					}
					setState(713);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(714);
				match(ENDQGATE_KEY);
				setState(715);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TodoLangGrammarParser.Identifier, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Id_listContext extends ParserRuleContext {
		public IdContext id;
		public List<IdContext> params = new ArrayList<IdContext>();
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TodoLangGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TodoLangGrammarParser.COMMA, i);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitId_list(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_id_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			((Id_listContext)_localctx).id = id();
			((Id_listContext)_localctx).params.add(((Id_listContext)_localctx).id);
			setState(726);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(722);
					match(COMMA);
					setState(723);
					((Id_listContext)_localctx).id = id();
					((Id_listContext)_localctx).params.add(((Id_listContext)_localctx).id);
					}
					} 
				}
				setState(728);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Gate_nameContext extends ParserRuleContext {
		public Single_gate_without_parameter_typeContext single_gate_without_parameter_type() {
			return getRuleContext(Single_gate_without_parameter_typeContext.class,0);
		}
		public Single_gate_with_one_parameter_typeContext single_gate_with_one_parameter_type() {
			return getRuleContext(Single_gate_with_one_parameter_typeContext.class,0);
		}
		public Single_gate_with_two_parameter_typeContext single_gate_with_two_parameter_type() {
			return getRuleContext(Single_gate_with_two_parameter_typeContext.class,0);
		}
		public Single_gate_with_three_parameter_typeContext single_gate_with_three_parameter_type() {
			return getRuleContext(Single_gate_with_three_parameter_typeContext.class,0);
		}
		public Single_gate_with_four_parameter_typeContext single_gate_with_four_parameter_type() {
			return getRuleContext(Single_gate_with_four_parameter_typeContext.class,0);
		}
		public Double_gate_without_parameter_typeContext double_gate_without_parameter_type() {
			return getRuleContext(Double_gate_without_parameter_typeContext.class,0);
		}
		public Double_gate_with_one_parameter_typeContext double_gate_with_one_parameter_type() {
			return getRuleContext(Double_gate_with_one_parameter_typeContext.class,0);
		}
		public Double_gate_with_four_parameter_typeContext double_gate_with_four_parameter_type() {
			return getRuleContext(Double_gate_with_four_parameter_typeContext.class,0);
		}
		public Triple_gate_without_parameter_typeContext triple_gate_without_parameter_type() {
			return getRuleContext(Triple_gate_without_parameter_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Gate_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gate_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterGate_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitGate_name(this);
		}
	}

	public final Gate_nameContext gate_name() throws RecognitionException {
		Gate_nameContext _localctx = new Gate_nameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_gate_name);
		try {
			setState(739);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ECHO_GATE:
			case H_GATE:
			case X_GATE:
			case T_GATE:
			case S_GATE:
			case Y_GATE:
			case Z_GATE:
			case X1_GATE:
			case Y1_GATE:
			case Z1_GATE:
			case I_GATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				single_gate_without_parameter_type();
				}
				break;
			case RX_GATE:
			case RY_GATE:
			case RZ_GATE:
			case U1_GATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				single_gate_with_one_parameter_type();
				}
				break;
			case U2_GATE:
			case RPHI_GATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(731);
				single_gate_with_two_parameter_type();
				}
				break;
			case U3_GATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(732);
				single_gate_with_three_parameter_type();
				}
				break;
			case U4_GATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(733);
				single_gate_with_four_parameter_type();
				}
				break;
			case CNOT_GATE:
			case CZ_GATE:
			case ISWAP_GATE:
			case SQISWAP_GATE:
			case SWAPZ1_GATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(734);
				double_gate_without_parameter_type();
				}
				break;
			case ISWAPTHETA_GATE:
			case CR_GATE:
				enterOuterAlt(_localctx, 7);
				{
				setState(735);
				double_gate_with_one_parameter_type();
				}
				break;
			case CU_GATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(736);
				double_gate_with_four_parameter_type();
				}
				break;
			case TOFFOLI_GATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(737);
				triple_gate_without_parameter_type();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 10);
				{
				setState(738);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_expressionContext extends ParserRuleContext {
		public ConstantContext denominator;
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public Arithmetic_opContext arithmetic_op() {
			return getRuleContext(Arithmetic_opContext.class,0);
		}
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitConstant_expression(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_constant_expression);
		try {
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(741);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				constant();
				setState(743);
				arithmetic_op();
				setState(744);
				((Constant_expressionContext)_localctx).denominator = constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(746);
				arithmetic_op();
				setState(747);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arithmetic_opContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(TodoLangGrammarParser.MUL, 0); }
		public TerminalNode MINUS() { return getToken(TodoLangGrammarParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(TodoLangGrammarParser.PLUS, 0); }
		public TerminalNode DIV() { return getToken(TodoLangGrammarParser.DIV, 0); }
		public Arithmetic_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterArithmetic_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitArithmetic_op(this);
		}
	}

	public final Arithmetic_opContext arithmetic_op() throws RecognitionException {
		Arithmetic_opContext _localctx = new Arithmetic_opContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_arithmetic_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -1152921504606846976L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_opContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(TodoLangGrammarParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(TodoLangGrammarParser.PLUS, 0); }
		public Unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterUnary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitUnary_op(this);
		}
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode Integer_Literal() { return getToken(TodoLangGrammarParser.Integer_Literal, 0); }
		public TerminalNode Double_Literal() { return getToken(TodoLangGrammarParser.Double_Literal, 0); }
		public TerminalNode PI() { return getToken(TodoLangGrammarParser.PI, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TodoLangGrammarListener ) ((TodoLangGrammarListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			_la = _input.LA(1);
			if ( !(_la==PI || _la==Integer_Literal || _la==Double_Literal) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 29:
			return multiplicative_expression_sempred((Multiplicative_expressionContext)_localctx, predIndex);
		case 30:
			return addtive_expression_sempred((Addtive_expressionContext)_localctx, predIndex);
		case 31:
			return relational_expression_sempred((Relational_expressionContext)_localctx, predIndex);
		case 32:
			return equality_expression_sempred((Equality_expressionContext)_localctx, predIndex);
		case 33:
			return logical_and_expression_sempred((Logical_and_expressionContext)_localctx, predIndex);
		case 34:
			return logical_or_expression_sempred((Logical_or_expressionContext)_localctx, predIndex);
		case 53:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean multiplicative_expression_sempred(Multiplicative_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addtive_expression_sempred(Addtive_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relational_expression_sempred(Relational_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equality_expression_sempred(Equality_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logical_and_expression_sempred(Logical_and_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logical_or_expression_sempred(Logical_or_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001M\u02f6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0001\u0000\u0005\u0000~\b\u0000\n\u0000\f\u0000"+
		"\u0081\t\u0000\u0001\u0000\u0005\u0000\u0084\b\u0000\n\u0000\f\u0000\u0087"+
		"\t\u0000\u0001\u0000\u0005\u0000\u008a\b\u0000\n\u0000\f\u0000\u008d\t"+
		"\u0000\u0001\u0000\u0004\u0000\u0090\b\u0000\u000b\u0000\f\u0000\u0091"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u0098\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u00ac\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00be\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00ce\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e2\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00fa\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0116"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0140\b\u0011\n\u0011\f\u0011"+
		"\u0143\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u0149\b\u0011\n\u0011\f\u0011\u014c\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0153\b\u0011\n\u0011\f\u0011"+
		"\u0156\t\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u015a\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u0174\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u017d\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0005\u001d\u0188\b\u001d\n\u001d\f\u001d\u018b\t\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0196\b\u001e\n\u001e"+
		"\f\u001e\u0199\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f"+
		"\u01aa\b\u001f\n\u001f\f\u001f\u01ad\t\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u01b8\b \n \f \u01bb\t \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u01c3\b!\n!\f!\u01c6\t!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u01ce\b\"\n\"\f\"\u01d1"+
		"\t\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u01d8\b#\u0001$\u0001$"+
		"\u0001%\u0001%\u0001%\u0005%\u01df\b%\n%\f%\u01e2\t%\u0001%\u0001%\u0001"+
		"%\u0005%\u01e7\b%\n%\f%\u01ea\t%\u0003%\u01ec\b%\u0001&\u0001&\u0001&"+
		"\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u01fe\b&\u0001\'\u0001\'\u0001\'\u0005\'"+
		"\u0203\b\'\n\'\f\'\u0206\t\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0005(\u020f\b(\n(\f(\u0212\t(\u0001(\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0005)\u021a\b)\n)\f)\u021d\t)\u0001*\u0001*\u0001*\u0001*\u0005"+
		"*\u0223\b*\n*\f*\u0226\t*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0005*\u0230\b*\n*\f*\u0233\t*\u0001*\u0001*\u0001*\u0003*\u0238"+
		"\b*\u0001+\u0001+\u0001+\u0001+\u0005+\u023e\b+\n+\f+\u0241\t+\u0001+"+
		"\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0003,\u0250\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0003-\u0259\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u0260"+
		"\b.\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00030\u026e\b0\u00011\u00011\u00011\u00041\u0273\b1\u000b"+
		"1\f1\u0274\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00042\u027e"+
		"\b2\u000b2\f2\u027f\u00012\u00012\u00012\u00013\u00013\u00013\u00033\u0288"+
		"\b3\u00014\u00014\u00014\u00054\u028d\b4\n4\f4\u0290\t4\u00015\u00015"+
		"\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0003"+
		"5\u029d\b5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00055\u02ab\b5\n5\f5\u02ae\t5\u00016\u00016\u0001"+
		"6\u00016\u00016\u00056\u02b5\b6\n6\f6\u02b8\t6\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00056\u02c6"+
		"\b6\n6\f6\u02c9\t6\u00016\u00016\u00016\u00036\u02ce\b6\u00017\u00017"+
		"\u00018\u00018\u00018\u00058\u02d5\b8\n8\f8\u02d8\t8\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00039\u02e4\b9\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u02ee\b:\u0001"+
		";\u0001;\u0001<\u0001<\u0001=\u0001=\u0001=\u0000\u0007:<>@BDj>\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz\u0000\b\u0002\u0000"+
		"\t\u000b\r\u0014\u0001\u0000\u0019\u001c\u0001\u0000\u0015\u0016\u0002"+
		"\u0000\u001d\u001e \"\u0001\u0000#$\u0001\u0000<?\u0001\u0000<=\u0002"+
		"\u0000\u0001\u0001GH\u0314\u0000\u007f\u0001\u0000\u0000\u0000\u0002\u0097"+
		"\u0001\u0000\u0000\u0000\u0004\u0099\u0001\u0000\u0000\u0000\u0006\u009d"+
		"\u0001\u0000\u0000\u0000\b\u00ab\u0001\u0000\u0000\u0000\n\u00ad\u0001"+
		"\u0000\u0000\u0000\f\u00b1\u0001\u0000\u0000\u0000\u000e\u00b4\u0001\u0000"+
		"\u0000\u0000\u0010\u00bd\u0001\u0000\u0000\u0000\u0012\u00cd\u0001\u0000"+
		"\u0000\u0000\u0014\u00e1\u0001\u0000\u0000\u0000\u0016\u00f9\u0001\u0000"+
		"\u0000\u0000\u0018\u0115\u0001\u0000\u0000\u0000\u001a\u0117\u0001\u0000"+
		"\u0000\u0000\u001c\u011c\u0001\u0000\u0000\u0000\u001e\u0125\u0001\u0000"+
		"\u0000\u0000 \u0134\u0001\u0000\u0000\u0000\"\u0159\u0001\u0000\u0000"+
		"\u0000$\u015b\u0001\u0000\u0000\u0000&\u015d\u0001\u0000\u0000\u0000("+
		"\u015f\u0001\u0000\u0000\u0000*\u0161\u0001\u0000\u0000\u0000,\u0163\u0001"+
		"\u0000\u0000\u0000.\u0165\u0001\u0000\u0000\u00000\u0167\u0001\u0000\u0000"+
		"\u00002\u0169\u0001\u0000\u0000\u00004\u016b\u0001\u0000\u0000\u00006"+
		"\u0173\u0001\u0000\u0000\u00008\u017c\u0001\u0000\u0000\u0000:\u017e\u0001"+
		"\u0000\u0000\u0000<\u018c\u0001\u0000\u0000\u0000>\u019a\u0001\u0000\u0000"+
		"\u0000@\u01ae\u0001\u0000\u0000\u0000B\u01bc\u0001\u0000\u0000\u0000D"+
		"\u01c7\u0001\u0000\u0000\u0000F\u01d7\u0001\u0000\u0000\u0000H\u01d9\u0001"+
		"\u0000\u0000\u0000J\u01eb\u0001\u0000\u0000\u0000L\u01fd\u0001\u0000\u0000"+
		"\u0000N\u01ff\u0001\u0000\u0000\u0000P\u020a\u0001\u0000\u0000\u0000R"+
		"\u0216\u0001\u0000\u0000\u0000T\u0237\u0001\u0000\u0000\u0000V\u0239\u0001"+
		"\u0000\u0000\u0000X\u024f\u0001\u0000\u0000\u0000Z\u0258\u0001\u0000\u0000"+
		"\u0000\\\u025f\u0001\u0000\u0000\u0000^\u0261\u0001\u0000\u0000\u0000"+
		"`\u026d\u0001\u0000\u0000\u0000b\u026f\u0001\u0000\u0000\u0000d\u0279"+
		"\u0001\u0000\u0000\u0000f\u0287\u0001\u0000\u0000\u0000h\u0289\u0001\u0000"+
		"\u0000\u0000j\u029c\u0001\u0000\u0000\u0000l\u02cd\u0001\u0000\u0000\u0000"+
		"n\u02cf\u0001\u0000\u0000\u0000p\u02d1\u0001\u0000\u0000\u0000r\u02e3"+
		"\u0001\u0000\u0000\u0000t\u02ed\u0001\u0000\u0000\u0000v\u02ef\u0001\u0000"+
		"\u0000\u0000x\u02f1\u0001\u0000\u0000\u0000z\u02f3\u0001\u0000\u0000\u0000"+
		"|~\u0005E\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0085\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0082\u0084\u0003\u0002\u0001\u0000\u0083\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u008b\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008a\u0003l6\u0000\u0089\u0088"+
		"\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008f"+
		"\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0090"+
		"\u0003L&\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0000"+
		"\u0000\u0001\u0094\u0001\u0001\u0000\u0000\u0000\u0095\u0098\u0003\u0004"+
		"\u0002\u0000\u0096\u0098\u0003\u0006\u0003\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0003\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0005\u0002\u0000\u0000\u009a\u009b\u0005G\u0000"+
		"\u0000\u009b\u009c\u0005E\u0000\u0000\u009c\u0005\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0005\u0003\u0000\u0000\u009e\u009f\u0005G\u0000\u0000\u009f"+
		"\u00a0\u0005E\u0000\u0000\u00a0\u0007\u0001\u0000\u0000\u0000\u00a1\u00ac"+
		"\u0003\u0010\b\u0000\u00a2\u00ac\u0003\u0012\t\u0000\u00a3\u00ac\u0003"+
		"\u0014\n\u0000\u00a4\u00ac\u0003\u0016\u000b\u0000\u00a5\u00ac\u0003\u0018"+
		"\f\u0000\u00a6\u00ac\u0003\u001a\r\u0000\u00a7\u00ac\u0003\u001c\u000e"+
		"\u0000\u00a8\u00ac\u0003\u001e\u000f\u0000\u00a9\u00ac\u0003 \u0010\u0000"+
		"\u00aa\u00ac\u0003\"\u0011\u0000\u00ab\u00a1\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a2\u0001\u0000\u0000\u0000\u00ab\u00a3\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a4\u0001\u0000\u0000\u0000\u00ab\u00a5\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a6\u0001\u0000\u0000\u0000\u00ab\u00a7\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a8\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ac\t\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0005C\u0000\u0000\u00ae\u00af\u0005G\u0000\u0000\u00af\u00b0\u0005D"+
		"\u0000\u0000\u00b0\u000b\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0005"+
		"\u0000\u0000\u00b2\u00b3\u0003\n\u0005\u0000\u00b3\r\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0005\u0004\u0000\u0000\u00b5\u00b6\u0003\n\u0005\u0000"+
		"\u00b6\u000f\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003$\u0012\u0000\u00b8"+
		"\u00b9\u0003\u000e\u0007\u0000\u00b9\u00be\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0003$\u0012\u0000\u00bb\u00bc\u0005\u0004\u0000\u0000\u00bc\u00be"+
		"\u0001\u0000\u0000\u0000\u00bd\u00b7\u0001\u0000\u0000\u0000\u00bd\u00ba"+
		"\u0001\u0000\u0000\u0000\u00be\u0011\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0003&\u0013\u0000\u00c0\u00c1\u0003\u000e\u0007\u0000\u00c1\u00c2\u0005"+
		"@\u0000\u0000\u00c2\u00c3\u0005A\u0000\u0000\u00c3\u00c4\u0003t:\u0000"+
		"\u00c4\u00c5\u0005B\u0000\u0000\u00c5\u00ce\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0003&\u0013\u0000\u00c7\u00c8\u0005\u0004\u0000\u0000\u00c8\u00c9"+
		"\u0005@\u0000\u0000\u00c9\u00ca\u0005A\u0000\u0000\u00ca\u00cb\u0003H"+
		"$\u0000\u00cb\u00cc\u0005B\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000"+
		"\u00cd\u00bf\u0001\u0000\u0000\u0000\u00cd\u00c6\u0001\u0000\u0000\u0000"+
		"\u00ce\u0013\u0001\u0000\u0000\u0000\u00cf\u00d0\u0003(\u0014\u0000\u00d0"+
		"\u00d1\u0003\u000e\u0007\u0000\u00d1\u00d2\u0005@\u0000\u0000\u00d2\u00d3"+
		"\u0005A\u0000\u0000\u00d3\u00d4\u0003t:\u0000\u00d4\u00d5\u0005@\u0000"+
		"\u0000\u00d5\u00d6\u0003t:\u0000\u00d6\u00d7\u0005B\u0000\u0000\u00d7"+
		"\u00e2\u0001\u0000\u0000\u0000\u00d8\u00d9\u0003(\u0014\u0000\u00d9\u00da"+
		"\u0005\u0004\u0000\u0000\u00da\u00db\u0005@\u0000\u0000\u00db\u00dc\u0005"+
		"A\u0000\u0000\u00dc\u00dd\u0003t:\u0000\u00dd\u00de\u0005@\u0000\u0000"+
		"\u00de\u00df\u0003t:\u0000\u00df\u00e0\u0005B\u0000\u0000\u00e0\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e1\u00cf\u0001\u0000\u0000\u0000\u00e1\u00d8"+
		"\u0001\u0000\u0000\u0000\u00e2\u0015\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0003*\u0015\u0000\u00e4\u00e5\u0003\u000e\u0007\u0000\u00e5\u00e6\u0005"+
		"@\u0000\u0000\u00e6\u00e7\u0005A\u0000\u0000\u00e7\u00e8\u0003t:\u0000"+
		"\u00e8\u00e9\u0005@\u0000\u0000\u00e9\u00ea\u0003t:\u0000\u00ea\u00eb"+
		"\u0005@\u0000\u0000\u00eb\u00ec\u0003t:\u0000\u00ec\u00ed\u0005B\u0000"+
		"\u0000\u00ed\u00fa\u0001\u0000\u0000\u0000\u00ee\u00ef\u0003*\u0015\u0000"+
		"\u00ef\u00f0\u0005\u0004\u0000\u0000\u00f0\u00f1\u0005@\u0000\u0000\u00f1"+
		"\u00f2\u0005A\u0000\u0000\u00f2\u00f3\u0003t:\u0000\u00f3\u00f4\u0005"+
		"@\u0000\u0000\u00f4\u00f5\u0003t:\u0000\u00f5\u00f6\u0005@\u0000\u0000"+
		"\u00f6\u00f7\u0003t:\u0000\u00f7\u00f8\u0005B\u0000\u0000\u00f8\u00fa"+
		"\u0001\u0000\u0000\u0000\u00f9\u00e3\u0001\u0000\u0000\u0000\u00f9\u00ee"+
		"\u0001\u0000\u0000\u0000\u00fa\u0017\u0001\u0000\u0000\u0000\u00fb\u00fc"+
		"\u0003,\u0016\u0000\u00fc\u00fd\u0003\u000e\u0007\u0000\u00fd\u00fe\u0005"+
		"@\u0000\u0000\u00fe\u00ff\u0005A\u0000\u0000\u00ff\u0100\u0003t:\u0000"+
		"\u0100\u0101\u0005@\u0000\u0000\u0101\u0102\u0003t:\u0000\u0102\u0103"+
		"\u0005@\u0000\u0000\u0103\u0104\u0003t:\u0000\u0104\u0105\u0005@\u0000"+
		"\u0000\u0105\u0106\u0003t:\u0000\u0106\u0107\u0005B\u0000\u0000\u0107"+
		"\u0116\u0001\u0000\u0000\u0000\u0108\u0109\u0003,\u0016\u0000\u0109\u010a"+
		"\u0005\u0004\u0000\u0000\u010a\u010b\u0005@\u0000\u0000\u010b\u010c\u0005"+
		"A\u0000\u0000\u010c\u010d\u0003t:\u0000\u010d\u010e\u0005@\u0000\u0000"+
		"\u010e\u010f\u0003t:\u0000\u010f\u0110\u0005@\u0000\u0000\u0110\u0111"+
		"\u0003t:\u0000\u0111\u0112\u0005@\u0000\u0000\u0112\u0113\u0003t:\u0000"+
		"\u0113\u0114\u0005B\u0000\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115"+
		"\u00fb\u0001\u0000\u0000\u0000\u0115\u0108\u0001\u0000\u0000\u0000\u0116"+
		"\u0019\u0001\u0000\u0000\u0000\u0117\u0118\u0003.\u0017\u0000\u0118\u0119"+
		"\u0003\u000e\u0007\u0000\u0119\u011a\u0005@\u0000\u0000\u011a\u011b\u0003"+
		"\u000e\u0007\u0000\u011b\u001b\u0001\u0000\u0000\u0000\u011c\u011d\u0003"+
		"0\u0018\u0000\u011d\u011e\u0003\u000e\u0007\u0000\u011e\u011f\u0005@\u0000"+
		"\u0000\u011f\u0120\u0003\u000e\u0007\u0000\u0120\u0121\u0005@\u0000\u0000"+
		"\u0121\u0122\u0005A\u0000\u0000\u0122\u0123\u0003t:\u0000\u0123\u0124"+
		"\u0005B\u0000\u0000\u0124\u001d\u0001\u0000\u0000\u0000\u0125\u0126\u0003"+
		"2\u0019\u0000\u0126\u0127\u0003\u000e\u0007\u0000\u0127\u0128\u0005@\u0000"+
		"\u0000\u0128\u0129\u0003\u000e\u0007\u0000\u0129\u012a\u0005@\u0000\u0000"+
		"\u012a\u012b\u0005A\u0000\u0000\u012b\u012c\u0003t:\u0000\u012c\u012d"+
		"\u0005@\u0000\u0000\u012d\u012e\u0003t:\u0000\u012e\u012f\u0005@\u0000"+
		"\u0000\u012f\u0130\u0003t:\u0000\u0130\u0131\u0005@\u0000\u0000\u0131"+
		"\u0132\u0003t:\u0000\u0132\u0133\u0005B\u0000\u0000\u0133\u001f\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u00034\u001a\u0000\u0135\u0136\u0003\u000e"+
		"\u0007\u0000\u0136\u0137\u0005@\u0000\u0000\u0137\u0138\u0003\u000e\u0007"+
		"\u0000\u0138\u0139\u0005@\u0000\u0000\u0139\u013a\u0003\u000e\u0007\u0000"+
		"\u013a!\u0001\u0000\u0000\u0000\u013b\u013c\u0003n7\u0000\u013c\u0141"+
		"\u0003\u000e\u0007\u0000\u013d\u013e\u0005@\u0000\u0000\u013e\u0140\u0003"+
		"\u000e\u0007\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0143\u0001"+
		"\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001"+
		"\u0000\u0000\u0000\u0142\u015a\u0001\u0000\u0000\u0000\u0143\u0141\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0003n7\u0000\u0145\u014a\u0003\u000e\u0007"+
		"\u0000\u0146\u0147\u0005@\u0000\u0000\u0147\u0149\u0003\u000e\u0007\u0000"+
		"\u0148\u0146\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000"+
		"\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000"+
		"\u014b\u014d\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0005@\u0000\u0000\u014e\u014f\u0005A\u0000\u0000\u014f\u0154"+
		"\u0003t:\u0000\u0150\u0151\u0005@\u0000\u0000\u0151\u0153\u0003t:\u0000"+
		"\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u0156\u0001\u0000\u0000\u0000"+
		"\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000"+
		"\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000"+
		"\u0157\u0158\u0005B\u0000\u0000\u0158\u015a\u0001\u0000\u0000\u0000\u0159"+
		"\u013b\u0001\u0000\u0000\u0000\u0159\u0144\u0001\u0000\u0000\u0000\u015a"+
		"#\u0001\u0000\u0000\u0000\u015b\u015c\u0007\u0000\u0000\u0000\u015c%\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u0007\u0001\u0000\u0000\u015e\'\u0001\u0000"+
		"\u0000\u0000\u015f\u0160\u0007\u0002\u0000\u0000\u0160)\u0001\u0000\u0000"+
		"\u0000\u0161\u0162\u0005\u0017\u0000\u0000\u0162+\u0001\u0000\u0000\u0000"+
		"\u0163\u0164\u0005\u0018\u0000\u0000\u0164-\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0007\u0003\u0000\u0000\u0166/\u0001\u0000\u0000\u0000\u0167\u0168"+
		"\u0007\u0004\u0000\u0000\u01681\u0001\u0000\u0000\u0000\u0169\u016a\u0005"+
		"\u001f\u0000\u0000\u016a3\u0001\u0000\u0000\u0000\u016b\u016c\u0005%\u0000"+
		"\u0000\u016c5\u0001\u0000\u0000\u0000\u016d\u0174\u0003\f\u0006\u0000"+
		"\u016e\u0174\u0003z=\u0000\u016f\u0170\u0005A\u0000\u0000\u0170\u0171"+
		"\u0003H$\u0000\u0171\u0172\u0005A\u0000\u0000\u0172\u0174\u0001\u0000"+
		"\u0000\u0000\u0173\u016d\u0001\u0000\u0000\u0000\u0173\u016e\u0001\u0000"+
		"\u0000\u0000\u0173\u016f\u0001\u0000\u0000\u0000\u01747\u0001\u0000\u0000"+
		"\u0000\u0175\u017d\u00036\u001b\u0000\u0176\u0177\u0005<\u0000\u0000\u0177"+
		"\u017d\u00036\u001b\u0000\u0178\u0179\u0005=\u0000\u0000\u0179\u017d\u0003"+
		"6\u001b\u0000\u017a\u017b\u00055\u0000\u0000\u017b\u017d\u00036\u001b"+
		"\u0000\u017c\u0175\u0001\u0000\u0000\u0000\u017c\u0176\u0001\u0000\u0000"+
		"\u0000\u017c\u0178\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000"+
		"\u0000\u017d9\u0001\u0000\u0000\u0000\u017e\u017f\u0006\u001d\uffff\uffff"+
		"\u0000\u017f\u0180\u00038\u001c\u0000\u0180\u0189\u0001\u0000\u0000\u0000"+
		"\u0181\u0182\n\u0002\u0000\u0000\u0182\u0183\u0005>\u0000\u0000\u0183"+
		"\u0188\u00038\u001c\u0000\u0184\u0185\n\u0001\u0000\u0000\u0185\u0186"+
		"\u0005?\u0000\u0000\u0186\u0188\u00038\u001c\u0000\u0187\u0181\u0001\u0000"+
		"\u0000\u0000\u0187\u0184\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000"+
		"\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000"+
		"\u0000\u0000\u018a;\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u0006\u001e\uffff\uffff\u0000\u018d\u018e\u0003:\u001d"+
		"\u0000\u018e\u0197\u0001\u0000\u0000\u0000\u018f\u0190\n\u0002\u0000\u0000"+
		"\u0190\u0191\u0005<\u0000\u0000\u0191\u0196\u0003:\u001d\u0000\u0192\u0193"+
		"\n\u0001\u0000\u0000\u0193\u0194\u0005=\u0000\u0000\u0194\u0196\u0003"+
		":\u001d\u0000\u0195\u018f\u0001\u0000\u0000\u0000\u0195\u0192\u0001\u0000"+
		"\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000"+
		"\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198=\u0001\u0000\u0000"+
		"\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a\u019b\u0006\u001f\uffff"+
		"\uffff\u0000\u019b\u019c\u0003<\u001e\u0000\u019c\u01ab\u0001\u0000\u0000"+
		"\u0000\u019d\u019e\n\u0004\u0000\u0000\u019e\u019f\u00054\u0000\u0000"+
		"\u019f\u01aa\u0003<\u001e\u0000\u01a0\u01a1\n\u0003\u0000\u0000\u01a1"+
		"\u01a2\u00053\u0000\u0000\u01a2\u01aa\u0003<\u001e\u0000\u01a3\u01a4\n"+
		"\u0002\u0000\u0000\u01a4\u01a5\u00057\u0000\u0000\u01a5\u01aa\u0003<\u001e"+
		"\u0000\u01a6\u01a7\n\u0001\u0000\u0000\u01a7\u01a8\u00058\u0000\u0000"+
		"\u01a8\u01aa\u0003<\u001e\u0000\u01a9\u019d\u0001\u0000\u0000\u0000\u01a9"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a9\u01a3\u0001\u0000\u0000\u0000\u01a9"+
		"\u01a6\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab"+
		"\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac"+
		"?\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae\u01af"+
		"\u0006 \uffff\uffff\u0000\u01af\u01b0\u0003>\u001f\u0000\u01b0\u01b9\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b2\n\u0002\u0000\u0000\u01b2\u01b3\u00056"+
		"\u0000\u0000\u01b3\u01b8\u0003>\u001f\u0000\u01b4\u01b5\n\u0001\u0000"+
		"\u0000\u01b5\u01b6\u00059\u0000\u0000\u01b6\u01b8\u0003>\u001f\u0000\u01b7"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b7\u01b4\u0001\u0000\u0000\u0000\u01b8"+
		"\u01bb\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u0001\u0000\u0000\u0000\u01baA\u0001\u0000\u0000\u0000\u01bb\u01b9"+
		"\u0001\u0000\u0000\u0000\u01bc\u01bd\u0006!\uffff\uffff\u0000\u01bd\u01be"+
		"\u0003@ \u0000\u01be\u01c4\u0001\u0000\u0000\u0000\u01bf\u01c0\n\u0001"+
		"\u0000\u0000\u01c0\u01c1\u0005:\u0000\u0000\u01c1\u01c3\u0003@ \u0000"+
		"\u01c2\u01bf\u0001\u0000\u0000\u0000\u01c3\u01c6\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c5C\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c8\u0006\"\uffff\uffff\u0000\u01c8\u01c9\u0003B!\u0000\u01c9\u01cf"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cb\n\u0001\u0000\u0000\u01cb\u01cc\u0005"+
		";\u0000\u0000\u01cc\u01ce\u0003B!\u0000\u01cd\u01ca\u0001\u0000\u0000"+
		"\u0000\u01ce\u01d1\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0E\u0001\u0000\u0000\u0000"+
		"\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d8\u0003D\"\u0000\u01d3"+
		"\u01d4\u0003\f\u0006\u0000\u01d4\u01d5\u00052\u0000\u0000\u01d5\u01d6"+
		"\u0003D\"\u0000\u01d6\u01d8\u0001\u0000\u0000\u0000\u01d7\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d7\u01d3\u0001\u0000\u0000\u0000\u01d8G\u0001\u0000"+
		"\u0000\u0000\u01d9\u01da\u0003F#\u0000\u01daI\u0001\u0000\u0000\u0000"+
		"\u01db\u01e0\u0003\u000e\u0007\u0000\u01dc\u01dd\u0005@\u0000\u0000\u01dd"+
		"\u01df\u0003\u000e\u0007\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e1\u01ec\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e3\u01e8\u0005F\u0000\u0000\u01e4\u01e5"+
		"\u0005@\u0000\u0000\u01e5\u01e7\u0005F\u0000\u0000\u01e6\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01ec\u0001\u0000"+
		"\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb\u01db\u0001\u0000"+
		"\u0000\u0000\u01eb\u01e3\u0001\u0000\u0000\u0000\u01ecK\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ee\u0003\b\u0004\u0000\u01ee\u01ef\u0005E\u0000\u0000"+
		"\u01ef\u01fe\u0001\u0000\u0000\u0000\u01f0\u01fe\u0003P(\u0000\u01f1\u01fe"+
		"\u0003T*\u0000\u01f2\u01fe\u0003V+\u0000\u01f3\u01fe\u0003N\'\u0000\u01f4"+
		"\u01f5\u0003X,\u0000\u01f5\u01f6\u0005E\u0000\u0000\u01f6\u01fe\u0001"+
		"\u0000\u0000\u0000\u01f7\u01fe\u0003Z-\u0000\u01f8\u01fe\u0003^/\u0000"+
		"\u01f9\u01fa\u0003\\.\u0000\u01fa\u01fb\u0005E\u0000\u0000\u01fb\u01fe"+
		"\u0001\u0000\u0000\u0000\u01fc\u01fe\u0003l6\u0000\u01fd\u01ed\u0001\u0000"+
		"\u0000\u0000\u01fd\u01f0\u0001\u0000\u0000\u0000\u01fd\u01f1\u0001\u0000"+
		"\u0000\u0000\u01fd\u01f2\u0001\u0000\u0000\u0000\u01fd\u01f3\u0001\u0000"+
		"\u0000\u0000\u01fd\u01f4\u0001\u0000\u0000\u0000\u01fd\u01f7\u0001\u0000"+
		"\u0000\u0000\u01fd\u01f8\u0001\u0000\u0000\u0000\u01fd\u01f9\u0001\u0000"+
		"\u0000\u0000\u01fd\u01fc\u0001\u0000\u0000\u0000\u01feM\u0001\u0000\u0000"+
		"\u0000\u01ff\u0200\u0005\'\u0000\u0000\u0200\u0204\u0005E\u0000\u0000"+
		"\u0201\u0203\u0003L&\u0000\u0202\u0201\u0001\u0000\u0000\u0000\u0203\u0206"+
		"\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204\u0205"+
		"\u0001\u0000\u0000\u0000\u0205\u0207\u0001\u0000\u0000\u0000\u0206\u0204"+
		"\u0001\u0000\u0000\u0000\u0207\u0208\u0005(\u0000\u0000\u0208\u0209\u0005"+
		"E\u0000\u0000\u0209O\u0001\u0000\u0000\u0000\u020a\u020b\u0005)\u0000"+
		"\u0000\u020b\u020c\u0003J%\u0000\u020c\u0210\u0005E\u0000\u0000\u020d"+
		"\u020f\u0003L&\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020f\u0212\u0001"+
		"\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0210\u0211\u0001"+
		"\u0000\u0000\u0000\u0211\u0213\u0001\u0000\u0000\u0000\u0212\u0210\u0001"+
		"\u0000\u0000\u0000\u0213\u0214\u0005*\u0000\u0000\u0214\u0215\u0005E\u0000"+
		"\u0000\u0215Q\u0001\u0000\u0000\u0000\u0216\u0217\u0005,\u0000\u0000\u0217"+
		"\u021b\u0005E\u0000\u0000\u0218\u021a\u0003L&\u0000\u0219\u0218\u0001"+
		"\u0000\u0000\u0000\u021a\u021d\u0001\u0000\u0000\u0000\u021b\u0219\u0001"+
		"\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021cS\u0001\u0000"+
		"\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e\u021f\u0005+\u0000"+
		"\u0000\u021f\u0220\u0003H$\u0000\u0220\u0224\u0005E\u0000\u0000\u0221"+
		"\u0223\u0003L&\u0000\u0222\u0221\u0001\u0000\u0000\u0000\u0223\u0226\u0001"+
		"\u0000\u0000\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0224\u0225\u0001"+
		"\u0000\u0000\u0000\u0225\u0227\u0001\u0000\u0000\u0000\u0226\u0224\u0001"+
		"\u0000\u0000\u0000\u0227\u0228\u0003R)\u0000\u0228\u0229\u0005-\u0000"+
		"\u0000\u0229\u022a\u0005E\u0000\u0000\u022a\u0238\u0001\u0000\u0000\u0000"+
		"\u022b\u022c\u0005+\u0000\u0000\u022c\u022d\u0003H$\u0000\u022d\u0231"+
		"\u0005E\u0000\u0000\u022e\u0230\u0003L&\u0000\u022f\u022e\u0001\u0000"+
		"\u0000\u0000\u0230\u0233\u0001\u0000\u0000\u0000\u0231\u022f\u0001\u0000"+
		"\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0234\u0001\u0000"+
		"\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0234\u0235\u0005-\u0000"+
		"\u0000\u0235\u0236\u0005E\u0000\u0000\u0236\u0238\u0001\u0000\u0000\u0000"+
		"\u0237\u021e\u0001\u0000\u0000\u0000\u0237\u022b\u0001\u0000\u0000\u0000"+
		"\u0238U\u0001\u0000\u0000\u0000\u0239\u023a\u0005.\u0000\u0000\u023a\u023b"+
		"\u0003H$\u0000\u023b\u023f\u0005E\u0000\u0000\u023c\u023e\u0003L&\u0000"+
		"\u023d\u023c\u0001\u0000\u0000\u0000\u023e\u0241\u0001\u0000\u0000\u0000"+
		"\u023f\u023d\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000"+
		"\u0240\u0242\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000"+
		"\u0242\u0243\u0005/\u0000\u0000\u0243\u0244\u0005E\u0000\u0000\u0244W"+
		"\u0001\u0000\u0000\u0000\u0245\u0246\u00050\u0000\u0000\u0246\u0247\u0003"+
		"\u000e\u0007\u0000\u0247\u0248\u0005@\u0000\u0000\u0248\u0249\u0003\f"+
		"\u0006\u0000\u0249\u0250\u0001\u0000\u0000\u0000\u024a\u024b\u00050\u0000"+
		"\u0000\u024b\u024c\u0005\u0004\u0000\u0000\u024c\u024d\u0005@\u0000\u0000"+
		"\u024d\u024e\u0005\u0005\u0000\u0000\u024e\u0250\u0005E\u0000\u0000\u024f"+
		"\u0245\u0001\u0000\u0000\u0000\u024f\u024a\u0001\u0000\u0000\u0000\u0250"+
		"Y\u0001\u0000\u0000\u0000\u0251\u0252\u00051\u0000\u0000\u0252\u0253\u0003"+
		"\u000e\u0007\u0000\u0253\u0254\u0005E\u0000\u0000\u0254\u0259\u0001\u0000"+
		"\u0000\u0000\u0255\u0256\u00051\u0000\u0000\u0256\u0257\u0005\u0004\u0000"+
		"\u0000\u0257\u0259\u0005E\u0000\u0000\u0258\u0251\u0001\u0000\u0000\u0000"+
		"\u0258\u0255\u0001\u0000\u0000\u0000\u0259[\u0001\u0000\u0000\u0000\u025a"+
		"\u025b\u0005\u0006\u0000\u0000\u025b\u0260\u0003J%\u0000\u025c\u025d\u0005"+
		"\u0006\u0000\u0000\u025d\u025e\u0005\u0004\u0000\u0000\u025e\u0260\u0005"+
		"E\u0000\u0000\u025f\u025a\u0001\u0000\u0000\u0000\u025f\u025c\u0001\u0000"+
		"\u0000\u0000\u0260]\u0001\u0000\u0000\u0000\u0261\u0262\u0003H$\u0000"+
		"\u0262\u0263\u0005E\u0000\u0000\u0263_\u0001\u0000\u0000\u0000\u0264\u0265"+
		"\u0003r9\u0000\u0265\u0266\u0003p8\u0000\u0266\u0267\u0005E\u0000\u0000"+
		"\u0267\u026e\u0001\u0000\u0000\u0000\u0268\u0269\u0003r9\u0000\u0269\u026a"+
		"\u0003p8\u0000\u026a\u026b\u0005B\u0000\u0000\u026b\u026c\u0005E\u0000"+
		"\u0000\u026c\u026e\u0001\u0000\u0000\u0000\u026d\u0264\u0001\u0000\u0000"+
		"\u0000\u026d\u0268\u0001\u0000\u0000\u0000\u026ea\u0001\u0000\u0000\u0000"+
		"\u026f\u0270\u0005\'\u0000\u0000\u0270\u0272\u0005E\u0000\u0000\u0271"+
		"\u0273\u0003f3\u0000\u0272\u0271\u0001\u0000\u0000\u0000\u0273\u0274\u0001"+
		"\u0000\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0274\u0275\u0001"+
		"\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0277\u0005"+
		"(\u0000\u0000\u0277\u0278\u0005E\u0000\u0000\u0278c\u0001\u0000\u0000"+
		"\u0000\u0279\u027a\u0005)\u0000\u0000\u027a\u027b\u0003J%\u0000\u027b"+
		"\u027d\u0005E\u0000\u0000\u027c\u027e\u0003f3\u0000\u027d\u027c\u0001"+
		"\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u027d\u0001"+
		"\u0000\u0000\u0000\u027f\u0280\u0001\u0000\u0000\u0000\u0280\u0281\u0001"+
		"\u0000\u0000\u0000\u0281\u0282\u0005*\u0000\u0000\u0282\u0283\u0005E\u0000"+
		"\u0000\u0283e\u0001\u0000\u0000\u0000\u0284\u0288\u0003`0\u0000\u0285"+
		"\u0288\u0003b1\u0000\u0286\u0288\u0003d2\u0000\u0287\u0284\u0001\u0000"+
		"\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0287\u0286\u0001\u0000"+
		"\u0000\u0000\u0288g\u0001\u0000\u0000\u0000\u0289\u028e\u0003j5\u0000"+
		"\u028a\u028b\u0005@\u0000\u0000\u028b\u028d\u0003j5\u0000\u028c\u028a"+
		"\u0001\u0000\u0000\u0000\u028d\u0290\u0001\u0000\u0000\u0000\u028e\u028c"+
		"\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028fi\u0001"+
		"\u0000\u0000\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0291\u0292\u0006"+
		"5\uffff\uffff\u0000\u0292\u029d\u0003n7\u0000\u0293\u029d\u0005G\u0000"+
		"\u0000\u0294\u029d\u0005H\u0000\u0000\u0295\u029d\u0005\u0001\u0000\u0000"+
		"\u0296\u0297\u0005A\u0000\u0000\u0297\u0298\u0003j5\u0000\u0298\u0299"+
		"\u0005B\u0000\u0000\u0299\u029d\u0001\u0000\u0000\u0000\u029a\u029b\u0005"+
		"=\u0000\u0000\u029b\u029d\u0003j5\u0005\u029c\u0291\u0001\u0000\u0000"+
		"\u0000\u029c\u0293\u0001\u0000\u0000\u0000\u029c\u0294\u0001\u0000\u0000"+
		"\u0000\u029c\u0295\u0001\u0000\u0000\u0000\u029c\u0296\u0001\u0000\u0000"+
		"\u0000\u029c\u029a\u0001\u0000\u0000\u0000\u029d\u02ac\u0001\u0000\u0000"+
		"\u0000\u029e\u029f\n\u0004\u0000\u0000\u029f\u02a0\u0005>\u0000\u0000"+
		"\u02a0\u02ab\u0003j5\u0005\u02a1\u02a2\n\u0003\u0000\u0000\u02a2\u02a3"+
		"\u0005?\u0000\u0000\u02a3\u02ab\u0003j5\u0004\u02a4\u02a5\n\u0002\u0000"+
		"\u0000\u02a5\u02a6\u0005<\u0000\u0000\u02a6\u02ab\u0003j5\u0003\u02a7"+
		"\u02a8\n\u0001\u0000\u0000\u02a8\u02a9\u0005=\u0000\u0000\u02a9\u02ab"+
		"\u0003j5\u0002\u02aa\u029e\u0001\u0000\u0000\u0000\u02aa\u02a1\u0001\u0000"+
		"\u0000\u0000\u02aa\u02a4\u0001\u0000\u0000\u0000\u02aa\u02a7\u0001\u0000"+
		"\u0000\u0000\u02ab\u02ae\u0001\u0000\u0000\u0000\u02ac\u02aa\u0001\u0000"+
		"\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02adk\u0001\u0000\u0000"+
		"\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000\u02af\u02b0\u0005\u0007\u0000"+
		"\u0000\u02b0\u02b1\u0003n7\u0000\u02b1\u02b2\u0003p8\u0000\u02b2\u02b6"+
		"\u0005E\u0000\u0000\u02b3\u02b5\u0003f3\u0000\u02b4\u02b3\u0001\u0000"+
		"\u0000\u0000\u02b5\u02b8\u0001\u0000\u0000\u0000\u02b6\u02b4\u0001\u0000"+
		"\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7\u02b9\u0001\u0000"+
		"\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b9\u02ba\u0005\b\u0000"+
		"\u0000\u02ba\u02bb\u0005E\u0000\u0000\u02bb\u02ce\u0001\u0000\u0000\u0000"+
		"\u02bc\u02bd\u0005\u0007\u0000\u0000\u02bd\u02be\u0003n7\u0000\u02be\u02bf"+
		"\u0003p8\u0000\u02bf\u02c0\u0005@\u0000\u0000\u02c0\u02c1\u0005A\u0000"+
		"\u0000\u02c1\u02c2\u0003p8\u0000\u02c2\u02c3\u0005B\u0000\u0000\u02c3"+
		"\u02c7\u0005E\u0000\u0000\u02c4\u02c6\u0003f3\u0000\u02c5\u02c4\u0001"+
		"\u0000\u0000\u0000\u02c6\u02c9\u0001\u0000\u0000\u0000\u02c7\u02c5\u0001"+
		"\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8\u02ca\u0001"+
		"\u0000\u0000\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000\u02ca\u02cb\u0005"+
		"\b\u0000\u0000\u02cb\u02cc\u0005E\u0000\u0000\u02cc\u02ce\u0001\u0000"+
		"\u0000\u0000\u02cd\u02af\u0001\u0000\u0000\u0000\u02cd\u02bc\u0001\u0000"+
		"\u0000\u0000\u02cem\u0001\u0000\u0000\u0000\u02cf\u02d0\u0005F\u0000\u0000"+
		"\u02d0o\u0001\u0000\u0000\u0000\u02d1\u02d6\u0003n7\u0000\u02d2\u02d3"+
		"\u0005@\u0000\u0000\u02d3\u02d5\u0003n7\u0000\u02d4\u02d2\u0001\u0000"+
		"\u0000\u0000\u02d5\u02d8\u0001\u0000\u0000\u0000\u02d6\u02d4\u0001\u0000"+
		"\u0000\u0000\u02d6\u02d7\u0001\u0000\u0000\u0000\u02d7q\u0001\u0000\u0000"+
		"\u0000\u02d8\u02d6\u0001\u0000\u0000\u0000\u02d9\u02e4\u0003$\u0012\u0000"+
		"\u02da\u02e4\u0003&\u0013\u0000\u02db\u02e4\u0003(\u0014\u0000\u02dc\u02e4"+
		"\u0003*\u0015\u0000\u02dd\u02e4\u0003,\u0016\u0000\u02de\u02e4\u0003."+
		"\u0017\u0000\u02df\u02e4\u00030\u0018\u0000\u02e0\u02e4\u00032\u0019\u0000"+
		"\u02e1\u02e4\u00034\u001a\u0000\u02e2\u02e4\u0003n7\u0000\u02e3\u02d9"+
		"\u0001\u0000\u0000\u0000\u02e3\u02da\u0001\u0000\u0000\u0000\u02e3\u02db"+
		"\u0001\u0000\u0000\u0000\u02e3\u02dc\u0001\u0000\u0000\u0000\u02e3\u02dd"+
		"\u0001\u0000\u0000\u0000\u02e3\u02de\u0001\u0000\u0000\u0000\u02e3\u02df"+
		"\u0001\u0000\u0000\u0000\u02e3\u02e0\u0001\u0000\u0000\u0000\u02e3\u02e1"+
		"\u0001\u0000\u0000\u0000\u02e3\u02e2\u0001\u0000\u0000\u0000\u02e4s\u0001"+
		"\u0000\u0000\u0000\u02e5\u02ee\u0003z=\u0000\u02e6\u02e7\u0003z=\u0000"+
		"\u02e7\u02e8\u0003v;\u0000\u02e8\u02e9\u0003z=\u0000\u02e9\u02ee\u0001"+
		"\u0000\u0000\u0000\u02ea\u02eb\u0003v;\u0000\u02eb\u02ec\u0003z=\u0000"+
		"\u02ec\u02ee\u0001\u0000\u0000\u0000\u02ed\u02e5\u0001\u0000\u0000\u0000"+
		"\u02ed\u02e6\u0001\u0000\u0000\u0000\u02ed\u02ea\u0001\u0000\u0000\u0000"+
		"\u02eeu\u0001\u0000\u0000\u0000\u02ef\u02f0\u0007\u0005\u0000\u0000\u02f0"+
		"w\u0001\u0000\u0000\u0000\u02f1\u02f2\u0007\u0006\u0000\u0000\u02f2y\u0001"+
		"\u0000\u0000\u0000\u02f3\u02f4\u0007\u0007\u0000\u0000\u02f4{\u0001\u0000"+
		"\u0000\u00008\u007f\u0085\u008b\u0091\u0097\u00ab\u00bd\u00cd\u00e1\u00f9"+
		"\u0115\u0141\u014a\u0154\u0159\u0173\u017c\u0187\u0189\u0195\u0197\u01a9"+
		"\u01ab\u01b7\u01b9\u01c4\u01cf\u01d7\u01e0\u01e8\u01eb\u01fd\u0204\u0210"+
		"\u021b\u0224\u0231\u0237\u023f\u024f\u0258\u025f\u026d\u0274\u027f\u0287"+
		"\u028e\u029c\u02aa\u02ac\u02b6\u02c7\u02cd\u02d6\u02e3\u02ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}