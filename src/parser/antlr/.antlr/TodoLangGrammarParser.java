// Generated from c:\\Users\\BY23015S\\Desktop\\project\\originir-languageservice\\src\\parser\\antlr\\TodoLangGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TodoLangGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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


	    public gateList: { [key: string]: object; } = {"q": {}}; // gateList是一个公共成员变量，该字典的键是字符串类型，值为object类型，并赋�?�{"q": {}}
	    public qubitNum = 0;  //量子位数�?0
	    public cbitNum = 0;   //经典位数�?0
	    public currentGateName: string = "";
	    public key1 = "params";
	    public key2 = "arguments";
	    public inDagger = false;   //当前是否在处理反�?
	    public inControl = false;   //当前是否在处理控�?
	    public measureList: {[key: string]: number; } = {"a": 1};
	    public isValidKey(key: string , object: object): key is keyof typeof object {
				return key in object;
		}          //判断key是否在object�?
	    public controlBit: {[key: string]: number; } = {};

	public TodoLangGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PI) | (1L << C_KEY) | (1L << BARRIER_KEY) | (1L << QGATE_KEY) | (1L << ECHO_GATE) | (1L << H_GATE) | (1L << X_GATE) | (1L << T_GATE) | (1L << S_GATE) | (1L << Y_GATE) | (1L << Z_GATE) | (1L << X1_GATE) | (1L << Y1_GATE) | (1L << Z1_GATE) | (1L << I_GATE) | (1L << U2_GATE) | (1L << RPHI_GATE) | (1L << U3_GATE) | (1L << U4_GATE) | (1L << RX_GATE) | (1L << RY_GATE) | (1L << RZ_GATE) | (1L << U1_GATE) | (1L << CNOT_GATE) | (1L << CZ_GATE) | (1L << CU_GATE) | (1L << ISWAP_GATE) | (1L << SQISWAP_GATE) | (1L << SWAPZ1_GATE) | (1L << ISWAPTHETA_GATE) | (1L << CR_GATE) | (1L << TOFFOLI_GATE) | (1L << DAGGER_KEY) | (1L << CONTROL_KEY) | (1L << QIF_KEY) | (1L << QWHILE_KEY) | (1L << MEASURE_KEY) | (1L << RESET_KEY) | (1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LPAREN - 65)) | (1L << (Identifier - 65)) | (1L << (Integer_Literal - 65)) | (1L << (Double_Literal - 65)))) != 0) );
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

	public static class Qinit_declarationContext extends ParserRuleContext {
		public TerminalNode QINIT_KEY() { return getToken(TodoLangGrammarParser.QINIT_KEY, 0); }
		public TerminalNode Integer_Literal() { return getToken(TodoLangGrammarParser.Integer_Literal, 0); }
		public TerminalNode NEWLINE() { return getToken(TodoLangGrammarParser.NEWLINE, 0); }
		public Qinit_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qinit_declaration; }
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
			 
			    try {
			        this.qubitNum = parseInt(_localctx.Integer_Literal().text, 10);
			    } catch(err){
			        let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length,message: "grammar error"};
			        this.notifyErrorListeners(JSON.stringify(errorMsg));
			    }
			 
			setState(156);
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

	public static class Cinit_declarationContext extends ParserRuleContext {
		public TerminalNode CREG_KEY() { return getToken(TodoLangGrammarParser.CREG_KEY, 0); }
		public TerminalNode Integer_Literal() { return getToken(TodoLangGrammarParser.Integer_Literal, 0); }
		public TerminalNode NEWLINE() { return getToken(TodoLangGrammarParser.NEWLINE, 0); }
		public Cinit_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cinit_declaration; }
	}

	public final Cinit_declarationContext cinit_declaration() throws RecognitionException {
		Cinit_declarationContext _localctx = new Cinit_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cinit_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(CREG_KEY);
			setState(159);
			match(Integer_Literal);
			 this.cbitNum = parseInt(_localctx.Integer_Literal().text, 10); 
			setState(161);
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
	}

	public final Quantum_gate_declarationContext quantum_gate_declaration() throws RecognitionException {
		Quantum_gate_declarationContext _localctx = new Quantum_gate_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_quantum_gate_declaration);
		try {
			setState(173);
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
				setState(163);
				single_gate_without_parameter_declaration();
				}
				break;
			case RX_GATE:
			case RY_GATE:
			case RZ_GATE:
			case U1_GATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				single_gate_with_one_parameter_declaration();
				}
				break;
			case U2_GATE:
			case RPHI_GATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				single_gate_with_two_parameter_declaration();
				}
				break;
			case U3_GATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				single_gate_with_three_parameter_declaration();
				}
				break;
			case U4_GATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
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
				setState(168);
				double_gate_without_parameter_declaration();
				}
				break;
			case ISWAPTHETA_GATE:
			case CR_GATE:
				enterOuterAlt(_localctx, 7);
				{
				setState(169);
				double_gate_with_one_parameter_declaration();
				}
				break;
			case CU_GATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(170);
				double_gate_with_four_parameter_declaration();
				}
				break;
			case TOFFOLI_GATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(171);
				triple_gate_without_parameter_declaration();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 10);
				{
				setState(172);
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

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(TodoLangGrammarParser.LBRACK, 0); }
		public TerminalNode Integer_Literal() { return getToken(TodoLangGrammarParser.Integer_Literal, 0); }
		public TerminalNode RBRACK() { return getToken(TodoLangGrammarParser.RBRACK, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(LBRACK);
			setState(176);
			match(Integer_Literal);
			setState(177);
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

	public static class C_KEY_declarationContext extends ParserRuleContext {
		public TerminalNode C_KEY() { return getToken(TodoLangGrammarParser.C_KEY, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public C_KEY_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_KEY_declaration; }
	}

	public final C_KEY_declarationContext c_KEY_declaration() throws RecognitionException {
		C_KEY_declarationContext _localctx = new C_KEY_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_c_KEY_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(C_KEY);
			setState(180);
			index();
			 
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

	public static class Q_KEY_declarationContext extends ParserRuleContext {
		public TerminalNode Q_KEY() { return getToken(TodoLangGrammarParser.Q_KEY, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public Q_KEY_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_q_KEY_declaration; }
	}

	public final Q_KEY_declarationContext q_KEY_declaration() throws RecognitionException {
		Q_KEY_declarationContext _localctx = new Q_KEY_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_q_KEY_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(Q_KEY);
			setState(184);
			index();
			 
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
	}

	public final Single_gate_without_parameter_declarationContext single_gate_without_parameter_declaration() throws RecognitionException {
		Single_gate_without_parameter_declarationContext _localctx = new Single_gate_without_parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_single_gate_without_parameter_declaration);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				single_gate_without_parameter_type();
				setState(188);
				q_KEY_declaration();

				    if(this.controlBit.hasOwnProperty(_localctx.q_KEY_declaration()!.text)){
				        let errorMsg = {start: _localctx.q_KEY_declaration()!.start.charPositionInLine, end: _localctx.q_KEY_declaration()!.start.charPositionInLine+_localctx.q_KEY_declaration()!.text.length,message: "Duplicated register"};
				        this.notifyErrorListeners(JSON.stringify(errorMsg));
				    }

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				single_gate_without_parameter_type();
				setState(192);
				match(Q_KEY);

				                                    if(this.controlBit.hasOwnProperty("q")){
				                                        let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length,message: "Duplicated register"};
				                                        this.notifyErrorListeners(JSON.stringify(errorMsg));
				                                    }
				                                
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
	}

	public final Single_gate_with_one_parameter_declarationContext single_gate_with_one_parameter_declaration() throws RecognitionException {
		Single_gate_with_one_parameter_declarationContext _localctx = new Single_gate_with_one_parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_single_gate_with_one_parameter_declaration);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				single_gate_with_one_parameter_type();
				setState(198);
				q_KEY_declaration();
				setState(199);
				match(COMMA);
				setState(200);
				match(LPAREN);
				setState(201);
				constant_expression();
				setState(202);
				match(RPAREN);

				    if(this.controlBit.hasOwnProperty(_localctx.q_KEY_declaration()!.text)){
				        let errorMsg = {start: _localctx.q_KEY_declaration()!.start.charPositionInLine, end: _localctx.q_KEY_declaration()!.start.charPositionInLine+_localctx.q_KEY_declaration()!.text.length,message: "Duplicated register"};
				        this.notifyErrorListeners(JSON.stringify(errorMsg));
				    }

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				single_gate_with_one_parameter_type();
				setState(206);
				match(Q_KEY);
				setState(207);
				match(COMMA);
				setState(208);
				match(LPAREN);
				setState(209);
				expression();
				setState(210);
				match(RPAREN);

				                                    if(this.controlBit.hasOwnProperty("q")){
				                                        let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length,message: "Duplicated register"};
				                                        this.notifyErrorListeners(JSON.stringify(errorMsg));
				                                    }
				                                
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
	}

	public final Single_gate_with_two_parameter_declarationContext single_gate_with_two_parameter_declaration() throws RecognitionException {
		Single_gate_with_two_parameter_declarationContext _localctx = new Single_gate_with_two_parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_single_gate_with_two_parameter_declaration);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				single_gate_with_two_parameter_type();
				setState(216);
				q_KEY_declaration();
				setState(217);
				match(COMMA);
				setState(218);
				match(LPAREN);
				setState(219);
				constant_expression();
				setState(220);
				match(COMMA);
				setState(221);
				constant_expression();
				setState(222);
				match(RPAREN);

				    if(this.controlBit.hasOwnProperty(_localctx.q_KEY_declaration()!.text)){
				        let errorMsg = {start: _localctx.q_KEY_declaration()!.start.charPositionInLine, end: _localctx.q_KEY_declaration()!.start.charPositionInLine+_localctx.q_KEY_declaration()!.text.length,message: "Duplicated register"};
				        this.notifyErrorListeners(JSON.stringify(errorMsg));
				    }

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				single_gate_with_two_parameter_type();
				setState(226);
				match(Q_KEY);
				setState(227);
				match(COMMA);
				setState(228);
				match(LPAREN);
				setState(229);
				constant_expression();
				setState(230);
				match(COMMA);
				setState(231);
				constant_expression();
				setState(232);
				match(RPAREN);

				                                    if(this.controlBit.hasOwnProperty("q")){
				                                        let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length,message: "Duplicated register"};
				                                        this.notifyErrorListeners(JSON.stringify(errorMsg));
				                                    }
				                                
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
	}

	public final Single_gate_with_three_parameter_declarationContext single_gate_with_three_parameter_declaration() throws RecognitionException {
		Single_gate_with_three_parameter_declarationContext _localctx = new Single_gate_with_three_parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_single_gate_with_three_parameter_declaration);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				single_gate_with_three_parameter_type();
				setState(238);
				q_KEY_declaration();
				setState(239);
				match(COMMA);
				setState(240);
				match(LPAREN);
				setState(241);
				constant_expression();
				setState(242);
				match(COMMA);
				setState(243);
				constant_expression();
				setState(244);
				match(COMMA);
				setState(245);
				constant_expression();
				setState(246);
				match(RPAREN);

				    if(this.controlBit.hasOwnProperty(_localctx.q_KEY_declaration()!.text)){
				        let errorMsg = {start: _localctx.q_KEY_declaration()!.start.charPositionInLine, end: _localctx.q_KEY_declaration()!.start.charPositionInLine+_localctx.q_KEY_declaration()!.text.length,message: "Duplicated register"};
				        this.notifyErrorListeners(JSON.stringify(errorMsg));
				    }

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				single_gate_with_three_parameter_type();
				setState(250);
				match(Q_KEY);
				setState(251);
				match(COMMA);
				setState(252);
				match(LPAREN);
				setState(253);
				constant_expression();
				setState(254);
				match(COMMA);
				setState(255);
				constant_expression();
				setState(256);
				match(COMMA);
				setState(257);
				constant_expression();
				setState(258);
				match(RPAREN);

				                                    if(this.controlBit.hasOwnProperty("q")){
				                                        let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length,message: "Duplicated register"};
				                                        this.notifyErrorListeners(JSON.stringify(errorMsg));
				                                    }
				                                
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
	}

	public final Single_gate_with_four_parameter_declarationContext single_gate_with_four_parameter_declaration() throws RecognitionException {
		Single_gate_with_four_parameter_declarationContext _localctx = new Single_gate_with_four_parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_single_gate_with_four_parameter_declaration);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				single_gate_with_four_parameter_type();
				setState(264);
				q_KEY_declaration();
				setState(265);
				match(COMMA);
				setState(266);
				match(LPAREN);
				setState(267);
				constant_expression();
				setState(268);
				match(COMMA);
				setState(269);
				constant_expression();
				setState(270);
				match(COMMA);
				setState(271);
				constant_expression();
				setState(272);
				match(COMMA);
				setState(273);
				constant_expression();
				setState(274);
				match(RPAREN);

				    if(this.controlBit.hasOwnProperty(_localctx.q_KEY_declaration()!.text)){
				        let errorMsg = {start: _localctx.q_KEY_declaration()!.start.charPositionInLine, end: _localctx.q_KEY_declaration()!.start.charPositionInLine+_localctx.q_KEY_declaration()!.text.length,message: "Duplicated register"};
				        this.notifyErrorListeners(JSON.stringify(errorMsg));
				    }

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				single_gate_with_four_parameter_type();
				setState(278);
				match(Q_KEY);
				setState(279);
				match(COMMA);
				setState(280);
				match(LPAREN);
				setState(281);
				constant_expression();
				setState(282);
				match(COMMA);
				setState(283);
				constant_expression();
				setState(284);
				match(COMMA);
				setState(285);
				constant_expression();
				setState(286);
				match(COMMA);
				setState(287);
				constant_expression();
				setState(288);
				match(RPAREN);

				                                    if(this.controlBit.hasOwnProperty("q")){
				                                        let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length,message: "Duplicated register"};
				                                        this.notifyErrorListeners(JSON.stringify(errorMsg));
				                                    }
				                                
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
	}

	public final Double_gate_without_parameter_declarationContext double_gate_without_parameter_declaration() throws RecognitionException {
		Double_gate_without_parameter_declarationContext _localctx = new Double_gate_without_parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_double_gate_without_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			double_gate_without_parameter_type();
			setState(294);
			q_KEY_declaration();
			setState(295);
			match(COMMA);
			setState(296);
			q_KEY_declaration();

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
	}

	public final Double_gate_with_one_parameter_declarationContext double_gate_with_one_parameter_declaration() throws RecognitionException {
		Double_gate_with_one_parameter_declarationContext _localctx = new Double_gate_with_one_parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_double_gate_with_one_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			double_gate_with_one_parameter_type();
			setState(300);
			q_KEY_declaration();
			setState(301);
			match(COMMA);
			setState(302);
			q_KEY_declaration();
			setState(303);
			match(COMMA);
			setState(304);
			match(LPAREN);
			setState(305);
			constant_expression();
			setState(306);
			match(RPAREN);

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
	}

	public final Double_gate_with_four_parameter_declarationContext double_gate_with_four_parameter_declaration() throws RecognitionException {
		Double_gate_with_four_parameter_declarationContext _localctx = new Double_gate_with_four_parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_double_gate_with_four_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			double_gate_with_four_parameter_type();
			setState(310);
			q_KEY_declaration();
			setState(311);
			match(COMMA);
			setState(312);
			q_KEY_declaration();
			setState(313);
			match(COMMA);
			setState(314);
			match(LPAREN);
			setState(315);
			constant_expression();
			setState(316);
			match(COMMA);
			setState(317);
			constant_expression();
			setState(318);
			match(COMMA);
			setState(319);
			constant_expression();
			setState(320);
			match(COMMA);
			setState(321);
			constant_expression();
			setState(322);
			match(RPAREN);

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
	}

	public final Triple_gate_without_parameter_declarationContext triple_gate_without_parameter_declaration() throws RecognitionException {
		Triple_gate_without_parameter_declarationContext _localctx = new Triple_gate_without_parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_triple_gate_without_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			triple_gate_without_parameter_type();
			setState(326);
			q_KEY_declaration();
			setState(327);
			match(COMMA);
			setState(328);
			q_KEY_declaration();
			setState(329);
			match(COMMA);
			setState(330);
			q_KEY_declaration();

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
	}

	public final Define_gate_declarationContext define_gate_declaration() throws RecognitionException {
		Define_gate_declarationContext _localctx = new Define_gate_declarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_define_gate_declaration);
		int _la;
		try {
			int _alt;
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				id();
				setState(334);
				((Define_gate_declarationContext)_localctx).q_KEY_declaration = q_KEY_declaration();
				((Define_gate_declarationContext)_localctx).argument_list.add(((Define_gate_declarationContext)_localctx).q_KEY_declaration);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(335);
					match(COMMA);
					setState(336);
					((Define_gate_declarationContext)_localctx).q_KEY_declaration = q_KEY_declaration();
					((Define_gate_declarationContext)_localctx).argument_list.add(((Define_gate_declarationContext)_localctx).q_KEY_declaration);
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				id();
				setState(345);
				((Define_gate_declarationContext)_localctx).q_KEY_declaration = q_KEY_declaration();
				((Define_gate_declarationContext)_localctx).argument_list.add(((Define_gate_declarationContext)_localctx).q_KEY_declaration);
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(346);
						match(COMMA);
						setState(347);
						((Define_gate_declarationContext)_localctx).q_KEY_declaration = q_KEY_declaration();
						((Define_gate_declarationContext)_localctx).argument_list.add(((Define_gate_declarationContext)_localctx).q_KEY_declaration);
						}
						} 
					}
					setState(352);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(353);
				match(COMMA);
				setState(354);
				match(LPAREN);
				setState(355);
				((Define_gate_declarationContext)_localctx).constant_expression = constant_expression();
				((Define_gate_declarationContext)_localctx).angle_list.add(((Define_gate_declarationContext)_localctx).constant_expression);
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(356);
					match(COMMA);
					setState(357);
					((Define_gate_declarationContext)_localctx).constant_expression = constant_expression();
					((Define_gate_declarationContext)_localctx).angle_list.add(((Define_gate_declarationContext)_localctx).constant_expression);
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(363);
				match(RPAREN);

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
	}

	public final Single_gate_without_parameter_typeContext single_gate_without_parameter_type() throws RecognitionException {
		Single_gate_without_parameter_typeContext _localctx = new Single_gate_without_parameter_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_single_gate_without_parameter_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ECHO_GATE) | (1L << H_GATE) | (1L << X_GATE) | (1L << T_GATE) | (1L << S_GATE) | (1L << Y_GATE) | (1L << Z_GATE) | (1L << X1_GATE) | (1L << Y1_GATE) | (1L << Z1_GATE) | (1L << I_GATE))) != 0)) ) {
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

	public static class Single_gate_with_one_parameter_typeContext extends ParserRuleContext {
		public TerminalNode RX_GATE() { return getToken(TodoLangGrammarParser.RX_GATE, 0); }
		public TerminalNode RY_GATE() { return getToken(TodoLangGrammarParser.RY_GATE, 0); }
		public TerminalNode RZ_GATE() { return getToken(TodoLangGrammarParser.RZ_GATE, 0); }
		public TerminalNode U1_GATE() { return getToken(TodoLangGrammarParser.U1_GATE, 0); }
		public Single_gate_with_one_parameter_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_gate_with_one_parameter_type; }
	}

	public final Single_gate_with_one_parameter_typeContext single_gate_with_one_parameter_type() throws RecognitionException {
		Single_gate_with_one_parameter_typeContext _localctx = new Single_gate_with_one_parameter_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_single_gate_with_one_parameter_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RX_GATE) | (1L << RY_GATE) | (1L << RZ_GATE) | (1L << U1_GATE))) != 0)) ) {
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

	public static class Single_gate_with_two_parameter_typeContext extends ParserRuleContext {
		public TerminalNode U2_GATE() { return getToken(TodoLangGrammarParser.U2_GATE, 0); }
		public TerminalNode RPHI_GATE() { return getToken(TodoLangGrammarParser.RPHI_GATE, 0); }
		public Single_gate_with_two_parameter_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_gate_with_two_parameter_type; }
	}

	public final Single_gate_with_two_parameter_typeContext single_gate_with_two_parameter_type() throws RecognitionException {
		Single_gate_with_two_parameter_typeContext _localctx = new Single_gate_with_two_parameter_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_single_gate_with_two_parameter_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
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

	public static class Single_gate_with_three_parameter_typeContext extends ParserRuleContext {
		public TerminalNode U3_GATE() { return getToken(TodoLangGrammarParser.U3_GATE, 0); }
		public Single_gate_with_three_parameter_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_gate_with_three_parameter_type; }
	}

	public final Single_gate_with_three_parameter_typeContext single_gate_with_three_parameter_type() throws RecognitionException {
		Single_gate_with_three_parameter_typeContext _localctx = new Single_gate_with_three_parameter_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_single_gate_with_three_parameter_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
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

	public static class Single_gate_with_four_parameter_typeContext extends ParserRuleContext {
		public TerminalNode U4_GATE() { return getToken(TodoLangGrammarParser.U4_GATE, 0); }
		public Single_gate_with_four_parameter_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_gate_with_four_parameter_type; }
	}

	public final Single_gate_with_four_parameter_typeContext single_gate_with_four_parameter_type() throws RecognitionException {
		Single_gate_with_four_parameter_typeContext _localctx = new Single_gate_with_four_parameter_typeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_single_gate_with_four_parameter_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
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
	}

	public final Double_gate_without_parameter_typeContext double_gate_without_parameter_type() throws RecognitionException {
		Double_gate_without_parameter_typeContext _localctx = new Double_gate_without_parameter_typeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_double_gate_without_parameter_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CNOT_GATE) | (1L << CZ_GATE) | (1L << ISWAP_GATE) | (1L << SQISWAP_GATE) | (1L << SWAPZ1_GATE))) != 0)) ) {
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

	public static class Double_gate_with_one_parameter_typeContext extends ParserRuleContext {
		public TerminalNode ISWAPTHETA_GATE() { return getToken(TodoLangGrammarParser.ISWAPTHETA_GATE, 0); }
		public TerminalNode CR_GATE() { return getToken(TodoLangGrammarParser.CR_GATE, 0); }
		public Double_gate_with_one_parameter_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_gate_with_one_parameter_type; }
	}

	public final Double_gate_with_one_parameter_typeContext double_gate_with_one_parameter_type() throws RecognitionException {
		Double_gate_with_one_parameter_typeContext _localctx = new Double_gate_with_one_parameter_typeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_double_gate_with_one_parameter_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
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

	public static class Double_gate_with_four_parameter_typeContext extends ParserRuleContext {
		public TerminalNode CU_GATE() { return getToken(TodoLangGrammarParser.CU_GATE, 0); }
		public Double_gate_with_four_parameter_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_gate_with_four_parameter_type; }
	}

	public final Double_gate_with_four_parameter_typeContext double_gate_with_four_parameter_type() throws RecognitionException {
		Double_gate_with_four_parameter_typeContext _localctx = new Double_gate_with_four_parameter_typeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_double_gate_with_four_parameter_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
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

	public static class Triple_gate_without_parameter_typeContext extends ParserRuleContext {
		public TerminalNode TOFFOLI_GATE() { return getToken(TodoLangGrammarParser.TOFFOLI_GATE, 0); }
		public Triple_gate_without_parameter_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triple_gate_without_parameter_type; }
	}

	public final Triple_gate_without_parameter_typeContext triple_gate_without_parameter_type() throws RecognitionException {
		Triple_gate_without_parameter_typeContext _localctx = new Triple_gate_without_parameter_typeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_triple_gate_without_parameter_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
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
	public static class Pri_ckeyContext extends Primary_expressionContext {
		public C_KEY_declarationContext c_KEY_declaration() {
			return getRuleContext(C_KEY_declarationContext.class,0);
		}
		public Pri_ckeyContext(Primary_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class Pri_cstContext extends Primary_expressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Pri_cstContext(Primary_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class Pri_exprContext extends Primary_expressionContext {
		public List<TerminalNode> LPAREN() { return getTokens(TodoLangGrammarParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(TodoLangGrammarParser.LPAREN, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Pri_exprContext(Primary_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primary_expression);
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case C_KEY:
				_localctx = new Pri_ckeyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				c_KEY_declaration();
				}
				break;
			case PI:
			case Integer_Literal:
			case Double_Literal:
				_localctx = new Pri_cstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				constant();
				}
				break;
			case LPAREN:
				_localctx = new Pri_exprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				match(LPAREN);
				setState(389);
				expression();
				setState(390);
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
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unary_expression);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PI:
			case C_KEY:
			case LPAREN:
			case Integer_Literal:
			case Double_Literal:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				primary_expression();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(PLUS);
				setState(396);
				primary_expression();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				match(MINUS);
				setState(398);
				primary_expression();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				match(NOT);
				setState(400);
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
			setState(404);
			unary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(414);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(406);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(407);
						match(MUL);
						setState(408);
						unary_expression();
						}
						break;
					case 2:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(409);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(410);
						match(DIV);
						setState(411);
						((Multiplicative_expressionContext)_localctx).denominator = unary_expression();

						                                       if (_localctx._denominator.text === '0') {
						                                          let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length, message: "The denominator cannot be zero"};
						                                          this.notifyErrorListeners(JSON.stringify(errorMsg));
						                                       }
						                                   
						}
						break;
					}
					} 
				}
				setState(418);
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
			setState(420);
			multiplicative_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new Addtive_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addtive_expression);
						setState(422);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(423);
						match(PLUS);
						setState(424);
						multiplicative_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Addtive_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addtive_expression);
						setState(425);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(426);
						match(MINUS);
						setState(427);
						multiplicative_expression(0);
						}
						break;
					}
					} 
				}
				setState(432);
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
			setState(434);
			addtive_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(448);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(436);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(437);
						match(LT);
						setState(438);
						addtive_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(439);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(440);
						match(GT);
						setState(441);
						addtive_expression(0);
						}
						break;
					case 3:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(442);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(443);
						match(LEQ);
						setState(444);
						addtive_expression(0);
						}
						break;
					case 4:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(445);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(446);
						match(GEQ);
						setState(447);
						addtive_expression(0);
						}
						break;
					}
					} 
				}
				setState(452);
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
			setState(454);
			relational_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(464);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(462);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new Equality_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
						setState(456);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(457);
						match(EQ);
						setState(458);
						relational_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Equality_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
						setState(459);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(460);
						match(NE);
						setState(461);
						relational_expression(0);
						}
						break;
					}
					} 
				}
				setState(466);
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
			setState(468);
			equality_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(475);
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
					setState(470);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(471);
					match(AND);
					setState(472);
					equality_expression(0);
					}
					} 
				}
				setState(477);
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
			setState(479);
			logical_and_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(486);
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
					setState(481);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(482);
					match(OR);
					setState(483);
					logical_and_expression(0);
					}
					} 
				}
				setState(488);
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
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_assignment_expression);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				logical_or_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				c_KEY_declaration();
				setState(491);
				match(ASSIGN);
				setState(492);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
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
	}

	public final Controlbit_listContext controlbit_list() throws RecognitionException {
		Controlbit_listContext _localctx = new Controlbit_listContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_controlbit_list);
		int _la;
		try {
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Q_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				q_KEY_declaration();
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(499);
					match(COMMA);
					setState(500);
					q_KEY_declaration();
					}
					}
					setState(505);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				match(Identifier);
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(507);
					match(COMMA);
					setState(508);
					match(Identifier);
					}
					}
					setState(513);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_statement);
		try {
			setState(532);
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
				setState(516);
				quantum_gate_declaration();
				setState(517);
				match(NEWLINE);
				}
				break;
			case CONTROL_KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				control_statement();
				}
				break;
			case QIF_KEY:
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
				qif_statement();
				}
				break;
			case QWHILE_KEY:
				enterOuterAlt(_localctx, 4);
				{
				setState(521);
				qwhile_statement();
				}
				break;
			case DAGGER_KEY:
				enterOuterAlt(_localctx, 5);
				{
				setState(522);
				dagger_statement();
				}
				break;
			case MEASURE_KEY:
				enterOuterAlt(_localctx, 6);
				{
				setState(523);
				measure_statement();
				setState(524);
				match(NEWLINE);
				}
				break;
			case RESET_KEY:
				enterOuterAlt(_localctx, 7);
				{
				setState(526);
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
				setState(527);
				expression_statement();
				}
				break;
			case BARRIER_KEY:
				enterOuterAlt(_localctx, 9);
				{
				setState(528);
				barrier_statement();
				setState(529);
				match(NEWLINE);
				}
				break;
			case QGATE_KEY:
				enterOuterAlt(_localctx, 10);
				{
				setState(531);
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
	}

	public final Dagger_statementContext dagger_statement() throws RecognitionException {
		Dagger_statementContext _localctx = new Dagger_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dagger_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(DAGGER_KEY);
			setState(535);
			match(NEWLINE);
			 this.inDagger = true; 
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PI) | (1L << C_KEY) | (1L << BARRIER_KEY) | (1L << QGATE_KEY) | (1L << ECHO_GATE) | (1L << H_GATE) | (1L << X_GATE) | (1L << T_GATE) | (1L << S_GATE) | (1L << Y_GATE) | (1L << Z_GATE) | (1L << X1_GATE) | (1L << Y1_GATE) | (1L << Z1_GATE) | (1L << I_GATE) | (1L << U2_GATE) | (1L << RPHI_GATE) | (1L << U3_GATE) | (1L << U4_GATE) | (1L << RX_GATE) | (1L << RY_GATE) | (1L << RZ_GATE) | (1L << U1_GATE) | (1L << CNOT_GATE) | (1L << CZ_GATE) | (1L << CU_GATE) | (1L << ISWAP_GATE) | (1L << SQISWAP_GATE) | (1L << SWAPZ1_GATE) | (1L << ISWAPTHETA_GATE) | (1L << CR_GATE) | (1L << TOFFOLI_GATE) | (1L << DAGGER_KEY) | (1L << CONTROL_KEY) | (1L << QIF_KEY) | (1L << QWHILE_KEY) | (1L << MEASURE_KEY) | (1L << RESET_KEY) | (1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LPAREN - 65)) | (1L << (Identifier - 65)) | (1L << (Integer_Literal - 65)) | (1L << (Double_Literal - 65)))) != 0)) {
				{
				{
				setState(537);
				statement();
				}
				}
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(543);
			match(ENDDAGGER_KEY);
			setState(544);
			match(NEWLINE);
			this.inDagger = false;
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
	}

	public final Control_statementContext control_statement() throws RecognitionException {
		Control_statementContext _localctx = new Control_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_control_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(CONTROL_KEY);
			setState(548);
			controlbit_list();

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

			setState(550);
			match(NEWLINE);
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PI) | (1L << C_KEY) | (1L << BARRIER_KEY) | (1L << QGATE_KEY) | (1L << ECHO_GATE) | (1L << H_GATE) | (1L << X_GATE) | (1L << T_GATE) | (1L << S_GATE) | (1L << Y_GATE) | (1L << Z_GATE) | (1L << X1_GATE) | (1L << Y1_GATE) | (1L << Z1_GATE) | (1L << I_GATE) | (1L << U2_GATE) | (1L << RPHI_GATE) | (1L << U3_GATE) | (1L << U4_GATE) | (1L << RX_GATE) | (1L << RY_GATE) | (1L << RZ_GATE) | (1L << U1_GATE) | (1L << CNOT_GATE) | (1L << CZ_GATE) | (1L << CU_GATE) | (1L << ISWAP_GATE) | (1L << SQISWAP_GATE) | (1L << SWAPZ1_GATE) | (1L << ISWAPTHETA_GATE) | (1L << CR_GATE) | (1L << TOFFOLI_GATE) | (1L << DAGGER_KEY) | (1L << CONTROL_KEY) | (1L << QIF_KEY) | (1L << QWHILE_KEY) | (1L << MEASURE_KEY) | (1L << RESET_KEY) | (1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LPAREN - 65)) | (1L << (Identifier - 65)) | (1L << (Integer_Literal - 65)) | (1L << (Double_Literal - 65)))) != 0)) {
				{
				{
				setState(551);
				statement();
				}
				}
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(557);
			match(ENDCONTROL_KEY);
			setState(558);
			match(NEWLINE);

			    this.controlBit = {};
			    this.inControl = false;

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
	}

	public final Qelse_statement_fragmentContext qelse_statement_fragment() throws RecognitionException {
		Qelse_statement_fragmentContext _localctx = new Qelse_statement_fragmentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_qelse_statement_fragment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(ELSE_KEY);
			setState(562);
			match(NEWLINE);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PI) | (1L << C_KEY) | (1L << BARRIER_KEY) | (1L << QGATE_KEY) | (1L << ECHO_GATE) | (1L << H_GATE) | (1L << X_GATE) | (1L << T_GATE) | (1L << S_GATE) | (1L << Y_GATE) | (1L << Z_GATE) | (1L << X1_GATE) | (1L << Y1_GATE) | (1L << Z1_GATE) | (1L << I_GATE) | (1L << U2_GATE) | (1L << RPHI_GATE) | (1L << U3_GATE) | (1L << U4_GATE) | (1L << RX_GATE) | (1L << RY_GATE) | (1L << RZ_GATE) | (1L << U1_GATE) | (1L << CNOT_GATE) | (1L << CZ_GATE) | (1L << CU_GATE) | (1L << ISWAP_GATE) | (1L << SQISWAP_GATE) | (1L << SWAPZ1_GATE) | (1L << ISWAPTHETA_GATE) | (1L << CR_GATE) | (1L << TOFFOLI_GATE) | (1L << DAGGER_KEY) | (1L << CONTROL_KEY) | (1L << QIF_KEY) | (1L << QWHILE_KEY) | (1L << MEASURE_KEY) | (1L << RESET_KEY) | (1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LPAREN - 65)) | (1L << (Identifier - 65)) | (1L << (Integer_Literal - 65)) | (1L << (Double_Literal - 65)))) != 0)) {
				{
				{
				setState(563);
				statement();
				}
				}
				setState(568);
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
	}
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
	}

	public final Qif_statementContext qif_statement() throws RecognitionException {
		Qif_statementContext _localctx = new Qif_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_qif_statement);
		int _la;
		try {
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new Qif_ifContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				match(QIF_KEY);
				setState(570);
				expression();
				setState(571);
				match(NEWLINE);
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PI) | (1L << C_KEY) | (1L << BARRIER_KEY) | (1L << QGATE_KEY) | (1L << ECHO_GATE) | (1L << H_GATE) | (1L << X_GATE) | (1L << T_GATE) | (1L << S_GATE) | (1L << Y_GATE) | (1L << Z_GATE) | (1L << X1_GATE) | (1L << Y1_GATE) | (1L << Z1_GATE) | (1L << I_GATE) | (1L << U2_GATE) | (1L << RPHI_GATE) | (1L << U3_GATE) | (1L << U4_GATE) | (1L << RX_GATE) | (1L << RY_GATE) | (1L << RZ_GATE) | (1L << U1_GATE) | (1L << CNOT_GATE) | (1L << CZ_GATE) | (1L << CU_GATE) | (1L << ISWAP_GATE) | (1L << SQISWAP_GATE) | (1L << SWAPZ1_GATE) | (1L << ISWAPTHETA_GATE) | (1L << CR_GATE) | (1L << TOFFOLI_GATE) | (1L << DAGGER_KEY) | (1L << CONTROL_KEY) | (1L << QIF_KEY) | (1L << QWHILE_KEY) | (1L << MEASURE_KEY) | (1L << RESET_KEY) | (1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LPAREN - 65)) | (1L << (Identifier - 65)) | (1L << (Integer_Literal - 65)) | (1L << (Double_Literal - 65)))) != 0)) {
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
				qelse_statement_fragment();
				setState(579);
				match(ENDIF_KEY);
				setState(580);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new Qif_ifelseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				match(QIF_KEY);
				setState(583);
				expression();
				setState(584);
				match(NEWLINE);
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PI) | (1L << C_KEY) | (1L << BARRIER_KEY) | (1L << QGATE_KEY) | (1L << ECHO_GATE) | (1L << H_GATE) | (1L << X_GATE) | (1L << T_GATE) | (1L << S_GATE) | (1L << Y_GATE) | (1L << Z_GATE) | (1L << X1_GATE) | (1L << Y1_GATE) | (1L << Z1_GATE) | (1L << I_GATE) | (1L << U2_GATE) | (1L << RPHI_GATE) | (1L << U3_GATE) | (1L << U4_GATE) | (1L << RX_GATE) | (1L << RY_GATE) | (1L << RZ_GATE) | (1L << U1_GATE) | (1L << CNOT_GATE) | (1L << CZ_GATE) | (1L << CU_GATE) | (1L << ISWAP_GATE) | (1L << SQISWAP_GATE) | (1L << SWAPZ1_GATE) | (1L << ISWAPTHETA_GATE) | (1L << CR_GATE) | (1L << TOFFOLI_GATE) | (1L << DAGGER_KEY) | (1L << CONTROL_KEY) | (1L << QIF_KEY) | (1L << QWHILE_KEY) | (1L << MEASURE_KEY) | (1L << RESET_KEY) | (1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LPAREN - 65)) | (1L << (Identifier - 65)) | (1L << (Integer_Literal - 65)) | (1L << (Double_Literal - 65)))) != 0)) {
					{
					{
					setState(585);
					statement();
					}
					}
					setState(590);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(591);
				match(ENDIF_KEY);
				setState(592);
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
	}

	public final Qwhile_statementContext qwhile_statement() throws RecognitionException {
		Qwhile_statementContext _localctx = new Qwhile_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_qwhile_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(QWHILE_KEY);
			setState(597);
			expression();
			setState(598);
			match(NEWLINE);
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PI) | (1L << C_KEY) | (1L << BARRIER_KEY) | (1L << QGATE_KEY) | (1L << ECHO_GATE) | (1L << H_GATE) | (1L << X_GATE) | (1L << T_GATE) | (1L << S_GATE) | (1L << Y_GATE) | (1L << Z_GATE) | (1L << X1_GATE) | (1L << Y1_GATE) | (1L << Z1_GATE) | (1L << I_GATE) | (1L << U2_GATE) | (1L << RPHI_GATE) | (1L << U3_GATE) | (1L << U4_GATE) | (1L << RX_GATE) | (1L << RY_GATE) | (1L << RZ_GATE) | (1L << U1_GATE) | (1L << CNOT_GATE) | (1L << CZ_GATE) | (1L << CU_GATE) | (1L << ISWAP_GATE) | (1L << SQISWAP_GATE) | (1L << SWAPZ1_GATE) | (1L << ISWAPTHETA_GATE) | (1L << CR_GATE) | (1L << TOFFOLI_GATE) | (1L << DAGGER_KEY) | (1L << CONTROL_KEY) | (1L << QIF_KEY) | (1L << QWHILE_KEY) | (1L << MEASURE_KEY) | (1L << RESET_KEY) | (1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LPAREN - 65)) | (1L << (Identifier - 65)) | (1L << (Integer_Literal - 65)) | (1L << (Double_Literal - 65)))) != 0)) {
				{
				{
				setState(599);
				statement();
				}
				}
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(605);
			match(ENDQWHILE_KEY);
			setState(606);
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
	}

	public final Measure_statementContext measure_statement() throws RecognitionException {
		Measure_statementContext _localctx = new Measure_statementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_measure_statement);
		try {
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				match(MEASURE_KEY);
				setState(609);
				q_KEY_declaration();
				setState(610);
				match(COMMA);
				setState(611);
				c_KEY_declaration();

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
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				match(MEASURE_KEY);
				setState(615);
				match(Q_KEY);
				setState(616);
				match(COMMA);
				setState(617);
				match(C_KEY);
				setState(618);
				match(NEWLINE);

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
	}

	public final Reset_statementContext reset_statement() throws RecognitionException {
		Reset_statementContext _localctx = new Reset_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_reset_statement);
		try {
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				match(RESET_KEY);
				setState(623);
				q_KEY_declaration();
				setState(624);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				match(RESET_KEY);
				setState(627);
				match(Q_KEY);
				setState(628);
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
	}

	public final Barrier_statementContext barrier_statement() throws RecognitionException {
		Barrier_statementContext _localctx = new Barrier_statementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_barrier_statement);
		try {
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				match(BARRIER_KEY);
				setState(632);
				controlbit_list();

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
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
				match(BARRIER_KEY);
				setState(636);
				match(Q_KEY);
				setState(637);
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

	public static class Expression_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TodoLangGrammarParser.NEWLINE, 0); }
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expression_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			expression();
			setState(641);
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

	public static class Define_gate_statementContext extends ParserRuleContext {
		public Gate_nameContext gate_name() {
			return getRuleContext(Gate_nameContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TodoLangGrammarParser.NEWLINE, 0); }
		public TerminalNode COMMA() { return getToken(TodoLangGrammarParser.COMMA, 0); }
		public TerminalNode LPAREN() { return getToken(TodoLangGrammarParser.LPAREN, 0); }
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TodoLangGrammarParser.RPAREN, 0); }
		public Define_gate_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_gate_statement; }
	}

	public final Define_gate_statementContext define_gate_statement() throws RecognitionException {
		Define_gate_statementContext _localctx = new Define_gate_statementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_define_gate_statement);
		try {
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				gate_name();

				    if(_localctx.gate_name().id() != null) {
				        let customName = _localctx.gate_name().id()!.text;
				        if(!this.gateList.hasOwnProperty(customName)) {
				            let errorMsg = {start: _localctx.gate_name().start.charPositionInLine, end: _localctx.gate_name().start.charPositionInLine+_localctx.gate_name().text.length, message: "can not find define " + customName};
				            this.notifyErrorListeners(JSON.stringify(errorMsg));
				        }
				    }

				setState(645);
				id_list();

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

				setState(647);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				gate_name();
				setState(650);
				id_list();

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
				                     
				setState(652);
				match(COMMA);
				setState(653);
				match(LPAREN);
				setState(654);
				explist();

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
				                     
				setState(656);
				match(RPAREN);
				setState(657);
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
	}

	public final Define_dagger_statementContext define_dagger_statement() throws RecognitionException {
		Define_dagger_statementContext _localctx = new Define_dagger_statementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_define_dagger_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(DAGGER_KEY);
			setState(662);
			match(NEWLINE);
			setState(664); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(663);
				user_defined_gate();
				}
				}
				setState(666); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (ECHO_GATE - 9)) | (1L << (H_GATE - 9)) | (1L << (X_GATE - 9)) | (1L << (T_GATE - 9)) | (1L << (S_GATE - 9)) | (1L << (Y_GATE - 9)) | (1L << (Z_GATE - 9)) | (1L << (X1_GATE - 9)) | (1L << (Y1_GATE - 9)) | (1L << (Z1_GATE - 9)) | (1L << (I_GATE - 9)) | (1L << (U2_GATE - 9)) | (1L << (RPHI_GATE - 9)) | (1L << (U3_GATE - 9)) | (1L << (U4_GATE - 9)) | (1L << (RX_GATE - 9)) | (1L << (RY_GATE - 9)) | (1L << (RZ_GATE - 9)) | (1L << (U1_GATE - 9)) | (1L << (CNOT_GATE - 9)) | (1L << (CZ_GATE - 9)) | (1L << (CU_GATE - 9)) | (1L << (ISWAP_GATE - 9)) | (1L << (SQISWAP_GATE - 9)) | (1L << (SWAPZ1_GATE - 9)) | (1L << (ISWAPTHETA_GATE - 9)) | (1L << (CR_GATE - 9)) | (1L << (TOFFOLI_GATE - 9)) | (1L << (DAGGER_KEY - 9)) | (1L << (CONTROL_KEY - 9)) | (1L << (Identifier - 9)))) != 0) );
			setState(668);
			match(ENDDAGGER_KEY);
			setState(669);
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
	}

	public final Define_control_statementContext define_control_statement() throws RecognitionException {
		Define_control_statementContext _localctx = new Define_control_statementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_define_control_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(CONTROL_KEY);
			setState(672);
			controlbit_list();

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

			setState(674);
			match(NEWLINE);
			setState(676); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(675);
				user_defined_gate();
				}
				}
				setState(678); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (ECHO_GATE - 9)) | (1L << (H_GATE - 9)) | (1L << (X_GATE - 9)) | (1L << (T_GATE - 9)) | (1L << (S_GATE - 9)) | (1L << (Y_GATE - 9)) | (1L << (Z_GATE - 9)) | (1L << (X1_GATE - 9)) | (1L << (Y1_GATE - 9)) | (1L << (Z1_GATE - 9)) | (1L << (I_GATE - 9)) | (1L << (U2_GATE - 9)) | (1L << (RPHI_GATE - 9)) | (1L << (U3_GATE - 9)) | (1L << (U4_GATE - 9)) | (1L << (RX_GATE - 9)) | (1L << (RY_GATE - 9)) | (1L << (RZ_GATE - 9)) | (1L << (U1_GATE - 9)) | (1L << (CNOT_GATE - 9)) | (1L << (CZ_GATE - 9)) | (1L << (CU_GATE - 9)) | (1L << (ISWAP_GATE - 9)) | (1L << (SQISWAP_GATE - 9)) | (1L << (SWAPZ1_GATE - 9)) | (1L << (ISWAPTHETA_GATE - 9)) | (1L << (CR_GATE - 9)) | (1L << (TOFFOLI_GATE - 9)) | (1L << (DAGGER_KEY - 9)) | (1L << (CONTROL_KEY - 9)) | (1L << (Identifier - 9)))) != 0) );
			setState(680);
			match(ENDCONTROL_KEY);
			setState(681);
			match(NEWLINE);

			    this.controlBit = {};

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
	}

	public final User_defined_gateContext user_defined_gate() throws RecognitionException {
		User_defined_gateContext _localctx = new User_defined_gateContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_user_defined_gate);
		try {
			setState(687);
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
				setState(684);
				define_gate_statement();
				}
				break;
			case DAGGER_KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				define_dagger_statement();
				}
				break;
			case CONTROL_KEY:
				enterOuterAlt(_localctx, 3);
				{
				setState(686);
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
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_explist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			((ExplistContext)_localctx).exp = exp(0);
			((ExplistContext)_localctx).angles.add(((ExplistContext)_localctx).exp);
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(690);
				match(COMMA);
				setState(691);
				((ExplistContext)_localctx).exp = exp(0);
				((ExplistContext)_localctx).angles.add(((ExplistContext)_localctx).exp);
				}
				}
				setState(696);
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
			setState(708);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(698);
				id();
				}
				break;
			case Integer_Literal:
				{
				setState(699);
				match(Integer_Literal);
				}
				break;
			case Double_Literal:
				{
				setState(700);
				match(Double_Literal);
				}
				break;
			case PI:
				{
				setState(701);
				match(PI);
				}
				break;
			case LPAREN:
				{
				setState(702);
				match(LPAREN);
				setState(703);
				exp(0);
				setState(704);
				match(RPAREN);
				}
				break;
			case MINUS:
				{
				setState(706);
				match(MINUS);
				setState(707);
				exp(5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(726);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(724);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(710);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(711);
						match(MUL);
						setState(712);
						exp(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(713);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(714);
						match(DIV);
						setState(715);
						((ExpContext)_localctx).denominator = exp(4);
						 if(_localctx._denominator.text === '0') {
						                              let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length, message: "The denominator cannot be zero"};
						                              this.notifyErrorListeners(JSON.stringify(errorMsg));
						                          } 
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(718);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(719);
						match(PLUS);
						setState(720);
						exp(3);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(721);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(722);
						match(MINUS);
						setState(723);
						exp(2);
						}
						break;
					}
					} 
				}
				setState(728);
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
	}

	public final Gate_func_statementContext gate_func_statement() throws RecognitionException {
		Gate_func_statementContext _localctx = new Gate_func_statementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_gate_func_statement);
		int _la;
		try {
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				match(QGATE_KEY);
				setState(730);
				((Gate_func_statementContext)_localctx).name = id();
				setState(731);
				((Gate_func_statementContext)_localctx).params = id_list();

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

				setState(733);
				match(NEWLINE);
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (ECHO_GATE - 9)) | (1L << (H_GATE - 9)) | (1L << (X_GATE - 9)) | (1L << (T_GATE - 9)) | (1L << (S_GATE - 9)) | (1L << (Y_GATE - 9)) | (1L << (Z_GATE - 9)) | (1L << (X1_GATE - 9)) | (1L << (Y1_GATE - 9)) | (1L << (Z1_GATE - 9)) | (1L << (I_GATE - 9)) | (1L << (U2_GATE - 9)) | (1L << (RPHI_GATE - 9)) | (1L << (U3_GATE - 9)) | (1L << (U4_GATE - 9)) | (1L << (RX_GATE - 9)) | (1L << (RY_GATE - 9)) | (1L << (RZ_GATE - 9)) | (1L << (U1_GATE - 9)) | (1L << (CNOT_GATE - 9)) | (1L << (CZ_GATE - 9)) | (1L << (CU_GATE - 9)) | (1L << (ISWAP_GATE - 9)) | (1L << (SQISWAP_GATE - 9)) | (1L << (SWAPZ1_GATE - 9)) | (1L << (ISWAPTHETA_GATE - 9)) | (1L << (CR_GATE - 9)) | (1L << (TOFFOLI_GATE - 9)) | (1L << (DAGGER_KEY - 9)) | (1L << (CONTROL_KEY - 9)) | (1L << (Identifier - 9)))) != 0)) {
					{
					{
					setState(734);
					user_defined_gate();
					}
					}
					setState(739);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(740);
				match(ENDQGATE_KEY);
				setState(741);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				match(QGATE_KEY);
				setState(744);
				((Gate_func_statementContext)_localctx).name = id();
				setState(745);
				((Gate_func_statementContext)_localctx).params = id_list();
				setState(746);
				match(COMMA);
				setState(747);
				match(LPAREN);
				setState(748);
				((Gate_func_statementContext)_localctx).arguments = id_list();
				setState(749);
				match(RPAREN);

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
				                    
				setState(751);
				match(NEWLINE);
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (ECHO_GATE - 9)) | (1L << (H_GATE - 9)) | (1L << (X_GATE - 9)) | (1L << (T_GATE - 9)) | (1L << (S_GATE - 9)) | (1L << (Y_GATE - 9)) | (1L << (Z_GATE - 9)) | (1L << (X1_GATE - 9)) | (1L << (Y1_GATE - 9)) | (1L << (Z1_GATE - 9)) | (1L << (I_GATE - 9)) | (1L << (U2_GATE - 9)) | (1L << (RPHI_GATE - 9)) | (1L << (U3_GATE - 9)) | (1L << (U4_GATE - 9)) | (1L << (RX_GATE - 9)) | (1L << (RY_GATE - 9)) | (1L << (RZ_GATE - 9)) | (1L << (U1_GATE - 9)) | (1L << (CNOT_GATE - 9)) | (1L << (CZ_GATE - 9)) | (1L << (CU_GATE - 9)) | (1L << (ISWAP_GATE - 9)) | (1L << (SQISWAP_GATE - 9)) | (1L << (SWAPZ1_GATE - 9)) | (1L << (ISWAPTHETA_GATE - 9)) | (1L << (CR_GATE - 9)) | (1L << (TOFFOLI_GATE - 9)) | (1L << (DAGGER_KEY - 9)) | (1L << (CONTROL_KEY - 9)) | (1L << (Identifier - 9)))) != 0)) {
					{
					{
					setState(752);
					user_defined_gate();
					}
					}
					setState(757);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(758);
				match(ENDQGATE_KEY);
				setState(759);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TodoLangGrammarParser.Identifier, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
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
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_id_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			((Id_listContext)_localctx).id = id();
			((Id_listContext)_localctx).params.add(((Id_listContext)_localctx).id);
			setState(770);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(766);
					match(COMMA);
					setState(767);
					((Id_listContext)_localctx).id = id();
					((Id_listContext)_localctx).params.add(((Id_listContext)_localctx).id);
					}
					} 
				}
				setState(772);
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
	}

	public final Gate_nameContext gate_name() throws RecognitionException {
		Gate_nameContext _localctx = new Gate_nameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_gate_name);
		try {
			setState(783);
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
				setState(773);
				single_gate_without_parameter_type();
				}
				break;
			case RX_GATE:
			case RY_GATE:
			case RZ_GATE:
			case U1_GATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(774);
				single_gate_with_one_parameter_type();
				}
				break;
			case U2_GATE:
			case RPHI_GATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(775);
				single_gate_with_two_parameter_type();
				}
				break;
			case U3_GATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(776);
				single_gate_with_three_parameter_type();
				}
				break;
			case U4_GATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(777);
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
				setState(778);
				double_gate_without_parameter_type();
				}
				break;
			case ISWAPTHETA_GATE:
			case CR_GATE:
				enterOuterAlt(_localctx, 7);
				{
				setState(779);
				double_gate_with_one_parameter_type();
				}
				break;
			case CU_GATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(780);
				double_gate_with_four_parameter_type();
				}
				break;
			case TOFFOLI_GATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(781);
				triple_gate_without_parameter_type();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 10);
				{
				setState(782);
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
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_constant_expression);
		try {
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(785);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(786);
				constant();
				setState(787);
				arithmetic_op();
				setState(788);
				((Constant_expressionContext)_localctx).denominator = constant();
				 if(_localctx.arithmetic_op()!.DIV() != null) {
				        if(_localctx._denominator.text === '0') {
				            let errorMsg = {start: _localctx.start.charPositionInLine, end: _localctx.start.charPositionInLine+_localctx.text.length, message: "The denominator cannot be zero"};
				            this.notifyErrorListeners(JSON.stringify(errorMsg));
				        }
				    } 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(791);
				arithmetic_op();
				setState(792);
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

	public static class Arithmetic_opContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(TodoLangGrammarParser.MUL, 0); }
		public TerminalNode MINUS() { return getToken(TodoLangGrammarParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(TodoLangGrammarParser.PLUS, 0); }
		public TerminalNode DIV() { return getToken(TodoLangGrammarParser.DIV, 0); }
		public Arithmetic_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_op; }
	}

	public final Arithmetic_opContext arithmetic_op() throws RecognitionException {
		Arithmetic_opContext _localctx = new Arithmetic_opContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_arithmetic_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DIV))) != 0)) ) {
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

	public static class Unary_opContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(TodoLangGrammarParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(TodoLangGrammarParser.PLUS, 0); }
		public Unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op; }
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode Integer_Literal() { return getToken(TodoLangGrammarParser.Integer_Literal, 0); }
		public TerminalNode Double_Literal() { return getToken(TodoLangGrammarParser.Double_Literal, 0); }
		public TerminalNode PI() { return getToken(TodoLangGrammarParser.PI, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u0325\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\7\2\u0080\n\2\f\2\16\2\u0083\13\2\3\2\7\2\u0086\n\2\f"+
		"\2\16\2\u0089\13\2\3\2\7\2\u008c\n\2\f\2\16\2\u008f\13\2\3\2\6\2\u0092"+
		"\n\2\r\2\16\2\u0093\3\2\3\2\3\3\3\3\5\3\u009a\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b0"+
		"\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00c6\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d8\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ee"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0108\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0126\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\7\23\u0154\n\23\f\23\16\23\u0157\13\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u015f\n\23\f\23\16\23\u0162\13\23\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u0169\n\23\f\23\16\23\u016c\13\23\3\23\3\23\3\23\5\23\u0171\n\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u018b\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u0194\n\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\7\37\u01a1\n\37\f\37\16\37\u01a4\13\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \7 \u01af\n \f \16 \u01b2\13 \3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u01c3\n!\f!\16!\u01c6\13!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\7\"\u01d1\n\"\f\"\16\"\u01d4\13\"\3#\3#\3#\3#\3"+
		"#\3#\7#\u01dc\n#\f#\16#\u01df\13#\3$\3$\3$\3$\3$\3$\7$\u01e7\n$\f$\16"+
		"$\u01ea\13$\3%\3%\3%\3%\3%\5%\u01f1\n%\3&\3&\3\'\3\'\3\'\7\'\u01f8\n\'"+
		"\f\'\16\'\u01fb\13\'\3\'\3\'\3\'\7\'\u0200\n\'\f\'\16\'\u0203\13\'\5\'"+
		"\u0205\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0217\n"+
		"(\3)\3)\3)\3)\7)\u021d\n)\f)\16)\u0220\13)\3)\3)\3)\3)\3*\3*\3*\3*\3*"+
		"\7*\u022b\n*\f*\16*\u022e\13*\3*\3*\3*\3*\3+\3+\3+\7+\u0237\n+\f+\16+"+
		"\u023a\13+\3,\3,\3,\3,\7,\u0240\n,\f,\16,\u0243\13,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\7,\u024d\n,\f,\16,\u0250\13,\3,\3,\3,\5,\u0255\n,\3-\3-\3-\3-\7"+
		"-\u025b\n-\f-\16-\u025e\13-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\5.\u026f\n.\3/\3/\3/\3/\3/\3/\3/\5/\u0278\n/\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\5\60\u0281\n\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0296\n\62"+
		"\3\63\3\63\3\63\6\63\u029b\n\63\r\63\16\63\u029c\3\63\3\63\3\63\3\64\3"+
		"\64\3\64\3\64\3\64\6\64\u02a7\n\64\r\64\16\64\u02a8\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\5\65\u02b2\n\65\3\66\3\66\3\66\7\66\u02b7\n\66\f\66\16"+
		"\66\u02ba\13\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\5\67\u02c7\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\7\67\u02d7\n\67\f\67\16\67\u02da\13\67\38\38\38\38\38"+
		"\38\78\u02e2\n8\f8\168\u02e5\138\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\78\u02f4\n8\f8\168\u02f7\138\38\38\38\58\u02fc\n8\39\39\3:\3:\3:\7:"+
		"\u0303\n:\f:\16:\u0306\13:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0312\n;\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u031d\n<\3=\3=\3>\3>\3?\3?\3?\2\t<>@BDFl"+
		"@\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\n\4\2\13\r\17\26\3\2\33\36\3\2\27\30\4"+
		"\2\37 \"$\3\2%&\3\2>A\3\2>?\4\2\3\3IJ\2\u0343\2\u0081\3\2\2\2\4\u0099"+
		"\3\2\2\2\6\u009b\3\2\2\2\b\u00a0\3\2\2\2\n\u00af\3\2\2\2\f\u00b1\3\2\2"+
		"\2\16\u00b5\3\2\2\2\20\u00b9\3\2\2\2\22\u00c5\3\2\2\2\24\u00d7\3\2\2\2"+
		"\26\u00ed\3\2\2\2\30\u0107\3\2\2\2\32\u0125\3\2\2\2\34\u0127\3\2\2\2\36"+
		"\u012d\3\2\2\2 \u0137\3\2\2\2\"\u0147\3\2\2\2$\u0170\3\2\2\2&\u0172\3"+
		"\2\2\2(\u0174\3\2\2\2*\u0176\3\2\2\2,\u0178\3\2\2\2.\u017a\3\2\2\2\60"+
		"\u017c\3\2\2\2\62\u017e\3\2\2\2\64\u0180\3\2\2\2\66\u0182\3\2\2\28\u018a"+
		"\3\2\2\2:\u0193\3\2\2\2<\u0195\3\2\2\2>\u01a5\3\2\2\2@\u01b3\3\2\2\2B"+
		"\u01c7\3\2\2\2D\u01d5\3\2\2\2F\u01e0\3\2\2\2H\u01f0\3\2\2\2J\u01f2\3\2"+
		"\2\2L\u0204\3\2\2\2N\u0216\3\2\2\2P\u0218\3\2\2\2R\u0225\3\2\2\2T\u0233"+
		"\3\2\2\2V\u0254\3\2\2\2X\u0256\3\2\2\2Z\u026e\3\2\2\2\\\u0277\3\2\2\2"+
		"^\u0280\3\2\2\2`\u0282\3\2\2\2b\u0295\3\2\2\2d\u0297\3\2\2\2f\u02a1\3"+
		"\2\2\2h\u02b1\3\2\2\2j\u02b3\3\2\2\2l\u02c6\3\2\2\2n\u02fb\3\2\2\2p\u02fd"+
		"\3\2\2\2r\u02ff\3\2\2\2t\u0311\3\2\2\2v\u031c\3\2\2\2x\u031e\3\2\2\2z"+
		"\u0320\3\2\2\2|\u0322\3\2\2\2~\u0080\7G\2\2\177~\3\2\2\2\u0080\u0083\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0087\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0086\5\4\3\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008d\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008c\5n8\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2"+
		"\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u0090\u0092\5N(\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\2"+
		"\2\3\u0096\3\3\2\2\2\u0097\u009a\5\6\4\2\u0098\u009a\5\b\5\2\u0099\u0097"+
		"\3\2\2\2\u0099\u0098\3\2\2\2\u009a\5\3\2\2\2\u009b\u009c\7\4\2\2\u009c"+
		"\u009d\7I\2\2\u009d\u009e\b\4\1\2\u009e\u009f\7G\2\2\u009f\7\3\2\2\2\u00a0"+
		"\u00a1\7\5\2\2\u00a1\u00a2\7I\2\2\u00a2\u00a3\b\5\1\2\u00a3\u00a4\7G\2"+
		"\2\u00a4\t\3\2\2\2\u00a5\u00b0\5\22\n\2\u00a6\u00b0\5\24\13\2\u00a7\u00b0"+
		"\5\26\f\2\u00a8\u00b0\5\30\r\2\u00a9\u00b0\5\32\16\2\u00aa\u00b0\5\34"+
		"\17\2\u00ab\u00b0\5\36\20\2\u00ac\u00b0\5 \21\2\u00ad\u00b0\5\"\22\2\u00ae"+
		"\u00b0\5$\23\2\u00af\u00a5\3\2\2\2\u00af\u00a6\3\2\2\2\u00af\u00a7\3\2"+
		"\2\2\u00af\u00a8\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00aa\3\2\2\2\u00af"+
		"\u00ab\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2"+
		"\2\2\u00b0\13\3\2\2\2\u00b1\u00b2\7E\2\2\u00b2\u00b3\7I\2\2\u00b3\u00b4"+
		"\7F\2\2\u00b4\r\3\2\2\2\u00b5\u00b6\7\7\2\2\u00b6\u00b7\5\f\7\2\u00b7"+
		"\u00b8\b\b\1\2\u00b8\17\3\2\2\2\u00b9\u00ba\7\6\2\2\u00ba\u00bb\5\f\7"+
		"\2\u00bb\u00bc\b\t\1\2\u00bc\21\3\2\2\2\u00bd\u00be\5&\24\2\u00be\u00bf"+
		"\5\20\t\2\u00bf\u00c0\b\n\1\2\u00c0\u00c6\3\2\2\2\u00c1\u00c2\5&\24\2"+
		"\u00c2\u00c3\7\6\2\2\u00c3\u00c4\b\n\1\2\u00c4\u00c6\3\2\2\2\u00c5\u00bd"+
		"\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6\23\3\2\2\2\u00c7\u00c8\5(\25\2\u00c8"+
		"\u00c9\5\20\t\2\u00c9\u00ca\7B\2\2\u00ca\u00cb\7C\2\2\u00cb\u00cc\5v<"+
		"\2\u00cc\u00cd\7D\2\2\u00cd\u00ce\b\13\1\2\u00ce\u00d8\3\2\2\2\u00cf\u00d0"+
		"\5(\25\2\u00d0\u00d1\7\6\2\2\u00d1\u00d2\7B\2\2\u00d2\u00d3\7C\2\2\u00d3"+
		"\u00d4\5J&\2\u00d4\u00d5\7D\2\2\u00d5\u00d6\b\13\1\2\u00d6\u00d8\3\2\2"+
		"\2\u00d7\u00c7\3\2\2\2\u00d7\u00cf\3\2\2\2\u00d8\25\3\2\2\2\u00d9\u00da"+
		"\5*\26\2\u00da\u00db\5\20\t\2\u00db\u00dc\7B\2\2\u00dc\u00dd\7C\2\2\u00dd"+
		"\u00de\5v<\2\u00de\u00df\7B\2\2\u00df\u00e0\5v<\2\u00e0\u00e1\7D\2\2\u00e1"+
		"\u00e2\b\f\1\2\u00e2\u00ee\3\2\2\2\u00e3\u00e4\5*\26\2\u00e4\u00e5\7\6"+
		"\2\2\u00e5\u00e6\7B\2\2\u00e6\u00e7\7C\2\2\u00e7\u00e8\5v<\2\u00e8\u00e9"+
		"\7B\2\2\u00e9\u00ea\5v<\2\u00ea\u00eb\7D\2\2\u00eb\u00ec\b\f\1\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00d9\3\2\2\2\u00ed\u00e3\3\2\2\2\u00ee\27\3\2\2"+
		"\2\u00ef\u00f0\5,\27\2\u00f0\u00f1\5\20\t\2\u00f1\u00f2\7B\2\2\u00f2\u00f3"+
		"\7C\2\2\u00f3\u00f4\5v<\2\u00f4\u00f5\7B\2\2\u00f5\u00f6\5v<\2\u00f6\u00f7"+
		"\7B\2\2\u00f7\u00f8\5v<\2\u00f8\u00f9\7D\2\2\u00f9\u00fa\b\r\1\2\u00fa"+
		"\u0108\3\2\2\2\u00fb\u00fc\5,\27\2\u00fc\u00fd\7\6\2\2\u00fd\u00fe\7B"+
		"\2\2\u00fe\u00ff\7C\2\2\u00ff\u0100\5v<\2\u0100\u0101\7B\2\2\u0101\u0102"+
		"\5v<\2\u0102\u0103\7B\2\2\u0103\u0104\5v<\2\u0104\u0105\7D\2\2\u0105\u0106"+
		"\b\r\1\2\u0106\u0108\3\2\2\2\u0107\u00ef\3\2\2\2\u0107\u00fb\3\2\2\2\u0108"+
		"\31\3\2\2\2\u0109\u010a\5.\30\2\u010a\u010b\5\20\t\2\u010b\u010c\7B\2"+
		"\2\u010c\u010d\7C\2\2\u010d\u010e\5v<\2\u010e\u010f\7B\2\2\u010f\u0110"+
		"\5v<\2\u0110\u0111\7B\2\2\u0111\u0112\5v<\2\u0112\u0113\7B\2\2\u0113\u0114"+
		"\5v<\2\u0114\u0115\7D\2\2\u0115\u0116\b\16\1\2\u0116\u0126\3\2\2\2\u0117"+
		"\u0118\5.\30\2\u0118\u0119\7\6\2\2\u0119\u011a\7B\2\2\u011a\u011b\7C\2"+
		"\2\u011b\u011c\5v<\2\u011c\u011d\7B\2\2\u011d\u011e\5v<\2\u011e\u011f"+
		"\7B\2\2\u011f\u0120\5v<\2\u0120\u0121\7B\2\2\u0121\u0122\5v<\2\u0122\u0123"+
		"\7D\2\2\u0123\u0124\b\16\1\2\u0124\u0126\3\2\2\2\u0125\u0109\3\2\2\2\u0125"+
		"\u0117\3\2\2\2\u0126\33\3\2\2\2\u0127\u0128\5\60\31\2\u0128\u0129\5\20"+
		"\t\2\u0129\u012a\7B\2\2\u012a\u012b\5\20\t\2\u012b\u012c\b\17\1\2\u012c"+
		"\35\3\2\2\2\u012d\u012e\5\62\32\2\u012e\u012f\5\20\t\2\u012f\u0130\7B"+
		"\2\2\u0130\u0131\5\20\t\2\u0131\u0132\7B\2\2\u0132\u0133\7C\2\2\u0133"+
		"\u0134\5v<\2\u0134\u0135\7D\2\2\u0135\u0136\b\20\1\2\u0136\37\3\2\2\2"+
		"\u0137\u0138\5\64\33\2\u0138\u0139\5\20\t\2\u0139\u013a\7B\2\2\u013a\u013b"+
		"\5\20\t\2\u013b\u013c\7B\2\2\u013c\u013d\7C\2\2\u013d\u013e\5v<\2\u013e"+
		"\u013f\7B\2\2\u013f\u0140\5v<\2\u0140\u0141\7B\2\2\u0141\u0142\5v<\2\u0142"+
		"\u0143\7B\2\2\u0143\u0144\5v<\2\u0144\u0145\7D\2\2\u0145\u0146\b\21\1"+
		"\2\u0146!\3\2\2\2\u0147\u0148\5\66\34\2\u0148\u0149\5\20\t\2\u0149\u014a"+
		"\7B\2\2\u014a\u014b\5\20\t\2\u014b\u014c\7B\2\2\u014c\u014d\5\20\t\2\u014d"+
		"\u014e\b\22\1\2\u014e#\3\2\2\2\u014f\u0150\5p9\2\u0150\u0155\5\20\t\2"+
		"\u0151\u0152\7B\2\2\u0152\u0154\5\20\t\2\u0153\u0151\3\2\2\2\u0154\u0157"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0158\u0159\b\23\1\2\u0159\u0171\3\2\2\2\u015a\u015b\5"+
		"p9\2\u015b\u0160\5\20\t\2\u015c\u015d\7B\2\2\u015d\u015f\5\20\t\2\u015e"+
		"\u015c\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7B\2\2\u0164"+
		"\u0165\7C\2\2\u0165\u016a\5v<\2\u0166\u0167\7B\2\2\u0167\u0169\5v<\2\u0168"+
		"\u0166\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\7D\2\2\u016e"+
		"\u016f\b\23\1\2\u016f\u0171\3\2\2\2\u0170\u014f\3\2\2\2\u0170\u015a\3"+
		"\2\2\2\u0171%\3\2\2\2\u0172\u0173\t\2\2\2\u0173\'\3\2\2\2\u0174\u0175"+
		"\t\3\2\2\u0175)\3\2\2\2\u0176\u0177\t\4\2\2\u0177+\3\2\2\2\u0178\u0179"+
		"\7\31\2\2\u0179-\3\2\2\2\u017a\u017b\7\32\2\2\u017b/\3\2\2\2\u017c\u017d"+
		"\t\5\2\2\u017d\61\3\2\2\2\u017e\u017f\t\6\2\2\u017f\63\3\2\2\2\u0180\u0181"+
		"\7!\2\2\u0181\65\3\2\2\2\u0182\u0183\7\'\2\2\u0183\67\3\2\2\2\u0184\u018b"+
		"\5\16\b\2\u0185\u018b\5|?\2\u0186\u0187\7C\2\2\u0187\u0188\5J&\2\u0188"+
		"\u0189\7C\2\2\u0189\u018b\3\2\2\2\u018a\u0184\3\2\2\2\u018a\u0185\3\2"+
		"\2\2\u018a\u0186\3\2\2\2\u018b9\3\2\2\2\u018c\u0194\58\35\2\u018d\u018e"+
		"\7>\2\2\u018e\u0194\58\35\2\u018f\u0190\7?\2\2\u0190\u0194\58\35\2\u0191"+
		"\u0192\7\67\2\2\u0192\u0194\58\35\2\u0193\u018c\3\2\2\2\u0193\u018d\3"+
		"\2\2\2\u0193\u018f\3\2\2\2\u0193\u0191\3\2\2\2\u0194;\3\2\2\2\u0195\u0196"+
		"\b\37\1\2\u0196\u0197\5:\36\2\u0197\u01a2\3\2\2\2\u0198\u0199\f\4\2\2"+
		"\u0199\u019a\7@\2\2\u019a\u01a1\5:\36\2\u019b\u019c\f\3\2\2\u019c\u019d"+
		"\7A\2\2\u019d\u019e\5:\36\2\u019e\u019f\b\37\1\2\u019f\u01a1\3\2\2\2\u01a0"+
		"\u0198\3\2\2\2\u01a0\u019b\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2"+
		"\2\2\u01a2\u01a3\3\2\2\2\u01a3=\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6"+
		"\b \1\2\u01a6\u01a7\5<\37\2\u01a7\u01b0\3\2\2\2\u01a8\u01a9\f\4\2\2\u01a9"+
		"\u01aa\7>\2\2\u01aa\u01af\5<\37\2\u01ab\u01ac\f\3\2\2\u01ac\u01ad\7?\2"+
		"\2\u01ad\u01af\5<\37\2\u01ae\u01a8\3\2\2\2\u01ae\u01ab\3\2\2\2\u01af\u01b2"+
		"\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1?\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b3\u01b4\b!\1\2\u01b4\u01b5\5> \2\u01b5\u01c4\3\2\2"+
		"\2\u01b6\u01b7\f\6\2\2\u01b7\u01b8\7\66\2\2\u01b8\u01c3\5> \2\u01b9\u01ba"+
		"\f\5\2\2\u01ba\u01bb\7\65\2\2\u01bb\u01c3\5> \2\u01bc\u01bd\f\4\2\2\u01bd"+
		"\u01be\79\2\2\u01be\u01c3\5> \2\u01bf\u01c0\f\3\2\2\u01c0\u01c1\7:\2\2"+
		"\u01c1\u01c3\5> \2\u01c2\u01b6\3\2\2\2\u01c2\u01b9\3\2\2\2\u01c2\u01bc"+
		"\3\2\2\2\u01c2\u01bf\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5A\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\b\"\1\2"+
		"\u01c8\u01c9\5@!\2\u01c9\u01d2\3\2\2\2\u01ca\u01cb\f\4\2\2\u01cb\u01cc"+
		"\78\2\2\u01cc\u01d1\5@!\2\u01cd\u01ce\f\3\2\2\u01ce\u01cf\7;\2\2\u01cf"+
		"\u01d1\5@!\2\u01d0\u01ca\3\2\2\2\u01d0\u01cd\3\2\2\2\u01d1\u01d4\3\2\2"+
		"\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3C\3\2\2\2\u01d4\u01d2"+
		"\3\2\2\2\u01d5\u01d6\b#\1\2\u01d6\u01d7\5B\"\2\u01d7\u01dd\3\2\2\2\u01d8"+
		"\u01d9\f\3\2\2\u01d9\u01da\7<\2\2\u01da\u01dc\5B\"\2\u01db\u01d8\3\2\2"+
		"\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01deE"+
		"\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e1\b$\1\2\u01e1\u01e2\5D#\2\u01e2"+
		"\u01e8\3\2\2\2\u01e3\u01e4\f\3\2\2\u01e4\u01e5\7=\2\2\u01e5\u01e7\5D#"+
		"\2\u01e6\u01e3\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9"+
		"\3\2\2\2\u01e9G\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01f1\5F$\2\u01ec\u01ed"+
		"\5\16\b\2\u01ed\u01ee\7\64\2\2\u01ee\u01ef\5F$\2\u01ef\u01f1\3\2\2\2\u01f0"+
		"\u01eb\3\2\2\2\u01f0\u01ec\3\2\2\2\u01f1I\3\2\2\2\u01f2\u01f3\5H%\2\u01f3"+
		"K\3\2\2\2\u01f4\u01f9\5\20\t\2\u01f5\u01f6\7B\2\2\u01f6\u01f8\5\20\t\2"+
		"\u01f7\u01f5\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa"+
		"\3\2\2\2\u01fa\u0205\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u0201\7H\2\2\u01fd"+
		"\u01fe\7B\2\2\u01fe\u0200\7H\2\2\u01ff\u01fd\3\2\2\2\u0200\u0203\3\2\2"+
		"\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201"+
		"\3\2\2\2\u0204\u01f4\3\2\2\2\u0204\u01fc\3\2\2\2\u0205M\3\2\2\2\u0206"+
		"\u0207\5\n\6\2\u0207\u0208\7G\2\2\u0208\u0217\3\2\2\2\u0209\u0217\5R*"+
		"\2\u020a\u0217\5V,\2\u020b\u0217\5X-\2\u020c\u0217\5P)\2\u020d\u020e\5"+
		"Z.\2\u020e\u020f\7G\2\2\u020f\u0217\3\2\2\2\u0210\u0217\5\\/\2\u0211\u0217"+
		"\5`\61\2\u0212\u0213\5^\60\2\u0213\u0214\7G\2\2\u0214\u0217\3\2\2\2\u0215"+
		"\u0217\5n8\2\u0216\u0206\3\2\2\2\u0216\u0209\3\2\2\2\u0216\u020a\3\2\2"+
		"\2\u0216\u020b\3\2\2\2\u0216\u020c\3\2\2\2\u0216\u020d\3\2\2\2\u0216\u0210"+
		"\3\2\2\2\u0216\u0211\3\2\2\2\u0216\u0212\3\2\2\2\u0216\u0215\3\2\2\2\u0217"+
		"O\3\2\2\2\u0218\u0219\7)\2\2\u0219\u021a\7G\2\2\u021a\u021e\b)\1\2\u021b"+
		"\u021d\5N(\2\u021c\u021b\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2"+
		"\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0222"+
		"\7*\2\2\u0222\u0223\7G\2\2\u0223\u0224\b)\1\2\u0224Q\3\2\2\2\u0225\u0226"+
		"\7+\2\2\u0226\u0227\5L\'\2\u0227\u0228\b*\1\2\u0228\u022c\7G\2\2\u0229"+
		"\u022b\5N(\2\u022a\u0229\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2\2"+
		"\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u0230"+
		"\7,\2\2\u0230\u0231\7G\2\2\u0231\u0232\b*\1\2\u0232S\3\2\2\2\u0233\u0234"+
		"\7.\2\2\u0234\u0238\7G\2\2\u0235\u0237\5N(\2\u0236\u0235\3\2\2\2\u0237"+
		"\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239U\3\2\2\2"+
		"\u023a\u0238\3\2\2\2\u023b\u023c\7-\2\2\u023c\u023d\5J&\2\u023d\u0241"+
		"\7G\2\2\u023e\u0240\5N(\2\u023f\u023e\3\2\2\2\u0240\u0243\3\2\2\2\u0241"+
		"\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243\u0241\3\2"+
		"\2\2\u0244\u0245\5T+\2\u0245\u0246\7/\2\2\u0246\u0247\7G\2\2\u0247\u0255"+
		"\3\2\2\2\u0248\u0249\7-\2\2\u0249\u024a\5J&\2\u024a\u024e\7G\2\2\u024b"+
		"\u024d\5N(\2\u024c\u024b\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2"+
		"\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0252"+
		"\7/\2\2\u0252\u0253\7G\2\2\u0253\u0255\3\2\2\2\u0254\u023b\3\2\2\2\u0254"+
		"\u0248\3\2\2\2\u0255W\3\2\2\2\u0256\u0257\7\60\2\2\u0257\u0258\5J&\2\u0258"+
		"\u025c\7G\2\2\u0259\u025b\5N(\2\u025a\u0259\3\2\2\2\u025b\u025e\3\2\2"+
		"\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025f\3\2\2\2\u025e\u025c"+
		"\3\2\2\2\u025f\u0260\7\61\2\2\u0260\u0261\7G\2\2\u0261Y\3\2\2\2\u0262"+
		"\u0263\7\62\2\2\u0263\u0264\5\20\t\2\u0264\u0265\7B\2\2\u0265\u0266\5"+
		"\16\b\2\u0266\u0267\b.\1\2\u0267\u026f\3\2\2\2\u0268\u0269\7\62\2\2\u0269"+
		"\u026a\7\6\2\2\u026a\u026b\7B\2\2\u026b\u026c\7\7\2\2\u026c\u026d\7G\2"+
		"\2\u026d\u026f\b.\1\2\u026e\u0262\3\2\2\2\u026e\u0268\3\2\2\2\u026f[\3"+
		"\2\2\2\u0270\u0271\7\63\2\2\u0271\u0272\5\20\t\2\u0272\u0273\7G\2\2\u0273"+
		"\u0278\3\2\2\2\u0274\u0275\7\63\2\2\u0275\u0276\7\6\2\2\u0276\u0278\7"+
		"G\2\2\u0277\u0270\3\2\2\2\u0277\u0274\3\2\2\2\u0278]\3\2\2\2\u0279\u027a"+
		"\7\b\2\2\u027a\u027b\5L\'\2\u027b\u027c\b\60\1\2\u027c\u0281\3\2\2\2\u027d"+
		"\u027e\7\b\2\2\u027e\u027f\7\6\2\2\u027f\u0281\7G\2\2\u0280\u0279\3\2"+
		"\2\2\u0280\u027d\3\2\2\2\u0281_\3\2\2\2\u0282\u0283\5J&\2\u0283\u0284"+
		"\7G\2\2\u0284a\3\2\2\2\u0285\u0286\5t;\2\u0286\u0287\b\62\1\2\u0287\u0288"+
		"\5r:\2\u0288\u0289\b\62\1\2\u0289\u028a\7G\2\2\u028a\u0296\3\2\2\2\u028b"+
		"\u028c\5t;\2\u028c\u028d\5r:\2\u028d\u028e\b\62\1\2\u028e\u028f\7B\2\2"+
		"\u028f\u0290\7C\2\2\u0290\u0291\5j\66\2\u0291\u0292\b\62\1\2\u0292\u0293"+
		"\7D\2\2\u0293\u0294\7G\2\2\u0294\u0296\3\2\2\2\u0295\u0285\3\2\2\2\u0295"+
		"\u028b\3\2\2\2\u0296c\3\2\2\2\u0297\u0298\7)\2\2\u0298\u029a\7G\2\2\u0299"+
		"\u029b\5h\65\2\u029a\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029a\3\2"+
		"\2\2\u029c\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\7*\2\2\u029f"+
		"\u02a0\7G\2\2\u02a0e\3\2\2\2\u02a1\u02a2\7+\2\2\u02a2\u02a3\5L\'\2\u02a3"+
		"\u02a4\b\64\1\2\u02a4\u02a6\7G\2\2\u02a5\u02a7\5h\65\2\u02a6\u02a5\3\2"+
		"\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9"+
		"\u02aa\3\2\2\2\u02aa\u02ab\7,\2\2\u02ab\u02ac\7G\2\2\u02ac\u02ad\b\64"+
		"\1\2\u02adg\3\2\2\2\u02ae\u02b2\5b\62\2\u02af\u02b2\5d\63\2\u02b0\u02b2"+
		"\5f\64\2\u02b1\u02ae\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b0\3\2\2\2\u02b2"+
		"i\3\2\2\2\u02b3\u02b8\5l\67\2\u02b4\u02b5\7B\2\2\u02b5\u02b7\5l\67\2\u02b6"+
		"\u02b4\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2"+
		"\2\2\u02b9k\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02bc\b\67\1\2\u02bc\u02c7"+
		"\5p9\2\u02bd\u02c7\7I\2\2\u02be\u02c7\7J\2\2\u02bf\u02c7\7\3\2\2\u02c0"+
		"\u02c1\7C\2\2\u02c1\u02c2\5l\67\2\u02c2\u02c3\7D\2\2\u02c3\u02c7\3\2\2"+
		"\2\u02c4\u02c5\7?\2\2\u02c5\u02c7\5l\67\7\u02c6\u02bb\3\2\2\2\u02c6\u02bd"+
		"\3\2\2\2\u02c6\u02be\3\2\2\2\u02c6\u02bf\3\2\2\2\u02c6\u02c0\3\2\2\2\u02c6"+
		"\u02c4\3\2\2\2\u02c7\u02d8\3\2\2\2\u02c8\u02c9\f\6\2\2\u02c9\u02ca\7@"+
		"\2\2\u02ca\u02d7\5l\67\7\u02cb\u02cc\f\5\2\2\u02cc\u02cd\7A\2\2\u02cd"+
		"\u02ce\5l\67\6\u02ce\u02cf\b\67\1\2\u02cf\u02d7\3\2\2\2\u02d0\u02d1\f"+
		"\4\2\2\u02d1\u02d2\7>\2\2\u02d2\u02d7\5l\67\5\u02d3\u02d4\f\3\2\2\u02d4"+
		"\u02d5\7?\2\2\u02d5\u02d7\5l\67\4\u02d6\u02c8\3\2\2\2\u02d6\u02cb\3\2"+
		"\2\2\u02d6\u02d0\3\2\2\2\u02d6\u02d3\3\2\2\2\u02d7\u02da\3\2\2\2\u02d8"+
		"\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9m\3\2\2\2\u02da\u02d8\3\2\2\2"+
		"\u02db\u02dc\7\t\2\2\u02dc\u02dd\5p9\2\u02dd\u02de\5r:\2\u02de\u02df\b"+
		"8\1\2\u02df\u02e3\7G\2\2\u02e0\u02e2\5h\65\2\u02e1\u02e0\3\2\2\2\u02e2"+
		"\u02e5\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e6\3\2"+
		"\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02e7\7\n\2\2\u02e7\u02e8\7G\2\2\u02e8"+
		"\u02fc\3\2\2\2\u02e9\u02ea\7\t\2\2\u02ea\u02eb\5p9\2\u02eb\u02ec\5r:\2"+
		"\u02ec\u02ed\7B\2\2\u02ed\u02ee\7C\2\2\u02ee\u02ef\5r:\2\u02ef\u02f0\7"+
		"D\2\2\u02f0\u02f1\b8\1\2\u02f1\u02f5\7G\2\2\u02f2\u02f4\5h\65\2\u02f3"+
		"\u02f2\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2"+
		"\2\2\u02f6\u02f8\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02f9\7\n\2\2\u02f9"+
		"\u02fa\7G\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02db\3\2\2\2\u02fb\u02e9\3\2"+
		"\2\2\u02fco\3\2\2\2\u02fd\u02fe\7H\2\2\u02feq\3\2\2\2\u02ff\u0304\5p9"+
		"\2\u0300\u0301\7B\2\2\u0301\u0303\5p9\2\u0302\u0300\3\2\2\2\u0303\u0306"+
		"\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305s\3\2\2\2\u0306"+
		"\u0304\3\2\2\2\u0307\u0312\5&\24\2\u0308\u0312\5(\25\2\u0309\u0312\5*"+
		"\26\2\u030a\u0312\5,\27\2\u030b\u0312\5.\30\2\u030c\u0312\5\60\31\2\u030d"+
		"\u0312\5\62\32\2\u030e\u0312\5\64\33\2\u030f\u0312\5\66\34\2\u0310\u0312"+
		"\5p9\2\u0311\u0307\3\2\2\2\u0311\u0308\3\2\2\2\u0311\u0309\3\2\2\2\u0311"+
		"\u030a\3\2\2\2\u0311\u030b\3\2\2\2\u0311\u030c\3\2\2\2\u0311\u030d\3\2"+
		"\2\2\u0311\u030e\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0310\3\2\2\2\u0312"+
		"u\3\2\2\2\u0313\u031d\5|?\2\u0314\u0315\5|?\2\u0315\u0316\5x=\2\u0316"+
		"\u0317\5|?\2\u0317\u0318\b<\1\2\u0318\u031d\3\2\2\2\u0319\u031a\5x=\2"+
		"\u031a\u031b\5|?\2\u031b\u031d\3\2\2\2\u031c\u0313\3\2\2\2\u031c\u0314"+
		"\3\2\2\2\u031c\u0319\3\2\2\2\u031dw\3\2\2\2\u031e\u031f\t\7\2\2\u031f"+
		"y\3\2\2\2\u0320\u0321\t\b\2\2\u0321{\3\2\2\2\u0322\u0323\t\t\2\2\u0323"+
		"}\3\2\2\2:\u0081\u0087\u008d\u0093\u0099\u00af\u00c5\u00d7\u00ed\u0107"+
		"\u0125\u0155\u0160\u016a\u0170\u018a\u0193\u01a0\u01a2\u01ae\u01b0\u01c2"+
		"\u01c4\u01d0\u01d2\u01dd\u01e8\u01f0\u01f9\u0201\u0204\u0216\u021e\u022c"+
		"\u0238\u0241\u024e\u0254\u025c\u026e\u0277\u0280\u0295\u029c\u02a8\u02b1"+
		"\u02b8\u02c6\u02d6\u02d8\u02e3\u02f5\u02fb\u0304\u0311\u031c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}