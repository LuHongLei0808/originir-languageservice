// Generated from c:/Users/BY23015S/Desktop/project/originir-languageservice/originir����/TodoLangGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TodoLangGrammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PI", "QINIT_KEY", "CREG_KEY", "Q_KEY", "C_KEY", "BARRIER_KEY", "QGATE_KEY", 
			"ENDQGATE_KEY", "ECHO_GATE", "H_GATE", "X_GATE", "NOT_GATE", "T_GATE", 
			"S_GATE", "Y_GATE", "Z_GATE", "X1_GATE", "Y1_GATE", "Z1_GATE", "I_GATE", 
			"U2_GATE", "RPHI_GATE", "U3_GATE", "U4_GATE", "RX_GATE", "RY_GATE", "RZ_GATE", 
			"U1_GATE", "CNOT_GATE", "CZ_GATE", "CU_GATE", "ISWAP_GATE", "SQISWAP_GATE", 
			"SWAPZ1_GATE", "ISWAPTHETA_GATE", "CR_GATE", "TOFFOLI_GATE", "CP_GATE", 
			"DAGGER_KEY", "ENDDAGGER_KEY", "CONTROL_KEY", "ENDCONTROL_KEY", "QIF_KEY", 
			"ELSE_KEY", "ENDIF_KEY", "QWHILE_KEY", "ENDQWHILE_KEY", "MEASURE_KEY", 
			"RESET_KEY", "ASSIGN", "GT", "LT", "NOT", "EQ", "LEQ", "GEQ", "NE", "AND", 
			"OR", "PLUS", "MINUS", "MUL", "DIV", "COMMA", "LPAREN", "RPAREN", "LBRACK", 
			"RBRACK", "NEWLINE", "Identifier", "IdentifierNotDigit", "Digit", "Integer_Literal", 
			"Decimal_Literal", "DigitNotZero", "Double_Literal", "Decimal_Double_Literal", 
			"Digit_Sequence", "REALEXP", "WhiteSpace", "SingleLineComment", "WS"
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


	public TodoLangGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TodoLangGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000M\u021a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007"+
		"D\u0002E\u0007E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007"+
		"I\u0002J\u0007J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007"+
		"N\u0002O\u0007O\u0002P\u0007P\u0002Q\u0007Q\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#"+
		"\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u00012\u00012\u0001"+
		"3\u00013\u00014\u00014\u00015\u00015\u00015\u00016\u00016\u00016\u0001"+
		"7\u00017\u00017\u00018\u00018\u00018\u00019\u00019\u00019\u0001:\u0001"+
		":\u0001:\u0001;\u0001;\u0001<\u0001<\u0001=\u0001=\u0001>\u0001>\u0001"+
		"?\u0001?\u0001@\u0001@\u0001A\u0001A\u0001B\u0001B\u0001C\u0001C\u0001"+
		"D\u0005D\u01c0\bD\nD\fD\u01c3\tD\u0001D\u0003D\u01c6\bD\u0001D\u0001D"+
		"\u0001E\u0001E\u0001E\u0005E\u01cd\bE\nE\fE\u01d0\tE\u0001F\u0001F\u0001"+
		"G\u0001G\u0001H\u0001H\u0001I\u0001I\u0005I\u01da\bI\nI\fI\u01dd\tI\u0001"+
		"I\u0003I\u01e0\bI\u0001J\u0001J\u0001K\u0001K\u0001L\u0003L\u01e7\bL\u0001"+
		"L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0003L\u01f0\bL\u0001M\u0004"+
		"M\u01f3\bM\u000bM\fM\u01f4\u0001N\u0004N\u01f8\bN\u000bN\fN\u01f9\u0001"+
		"N\u0001N\u0003N\u01fe\bN\u0001N\u0004N\u0201\bN\u000bN\fN\u0202\u0001"+
		"O\u0001O\u0001O\u0001O\u0001P\u0001P\u0005P\u020b\bP\nP\fP\u020e\tP\u0001"+
		"P\u0003P\u0211\bP\u0001P\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0000\u0000R\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f"+
		"? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s:u;w<y={>}?\u007f"+
		"@\u0081A\u0083B\u0085C\u0087D\u0089E\u008bF\u008d\u0000\u008f\u0000\u0091"+
		"G\u0093\u0000\u0095\u0000\u0097H\u0099\u0000\u009bI\u009dJ\u009fK\u00a1"+
		"L\u00a3M\u0001\u0000\u0007\u0002\u0000\n\n\r\r\u0003\u0000AZ__az\u0001"+
		"\u000009\u0001\u000019\u0002\u0000EEee\u0002\u0000++--\u0002\u0000\t\t"+
		"  \u0223\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003"+
		"\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000"+
		"\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000"+
		"\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A"+
		"\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000"+
		"\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000"+
		"\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O"+
		"\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000"+
		"\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000"+
		"\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]"+
		"\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000"+
		"\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000"+
		"\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000k"+
		"\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001\u0000"+
		"\u0000\u0000\u0000q\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000\u0000"+
		"\u0000u\u0001\u0000\u0000\u0000\u0000w\u0001\u0000\u0000\u0000\u0000y"+
		"\u0001\u0000\u0000\u0000\u0000{\u0001\u0000\u0000\u0000\u0000}\u0001\u0000"+
		"\u0000\u0000\u0000\u007f\u0001\u0000\u0000\u0000\u0000\u0081\u0001\u0000"+
		"\u0000\u0000\u0000\u0083\u0001\u0000\u0000\u0000\u0000\u0085\u0001\u0000"+
		"\u0000\u0000\u0000\u0087\u0001\u0000\u0000\u0000\u0000\u0089\u0001\u0000"+
		"\u0000\u0000\u0000\u008b\u0001\u0000\u0000\u0000\u0000\u0091\u0001\u0000"+
		"\u0000\u0000\u0000\u0097\u0001\u0000\u0000\u0000\u0000\u009b\u0001\u0000"+
		"\u0000\u0000\u0000\u009d\u0001\u0000\u0000\u0000\u0000\u009f\u0001\u0000"+
		"\u0000\u0000\u0000\u00a1\u0001\u0000\u0000\u0000\u0000\u00a3\u0001\u0000"+
		"\u0000\u0000\u0001\u00a5\u0001\u0000\u0000\u0000\u0003\u00a8\u0001\u0000"+
		"\u0000\u0000\u0005\u00ae\u0001\u0000\u0000\u0000\u0007\u00b3\u0001\u0000"+
		"\u0000\u0000\t\u00b5\u0001\u0000\u0000\u0000\u000b\u00b7\u0001\u0000\u0000"+
		"\u0000\r\u00bf\u0001\u0000\u0000\u0000\u000f\u00c5\u0001\u0000\u0000\u0000"+
		"\u0011\u00ce\u0001\u0000\u0000\u0000\u0013\u00d3\u0001\u0000\u0000\u0000"+
		"\u0015\u00d5\u0001\u0000\u0000\u0000\u0017\u00d7\u0001\u0000\u0000\u0000"+
		"\u0019\u00db\u0001\u0000\u0000\u0000\u001b\u00dd\u0001\u0000\u0000\u0000"+
		"\u001d\u00df\u0001\u0000\u0000\u0000\u001f\u00e1\u0001\u0000\u0000\u0000"+
		"!\u00e3\u0001\u0000\u0000\u0000#\u00e6\u0001\u0000\u0000\u0000%\u00e9"+
		"\u0001\u0000\u0000\u0000\'\u00ec\u0001\u0000\u0000\u0000)\u00ee\u0001"+
		"\u0000\u0000\u0000+\u00f1\u0001\u0000\u0000\u0000-\u00f6\u0001\u0000\u0000"+
		"\u0000/\u00f9\u0001\u0000\u0000\u00001\u00fc\u0001\u0000\u0000\u00003"+
		"\u00ff\u0001\u0000\u0000\u00005\u0102\u0001\u0000\u0000\u00007\u0105\u0001"+
		"\u0000\u0000\u00009\u0108\u0001\u0000\u0000\u0000;\u010d\u0001\u0000\u0000"+
		"\u0000=\u0110\u0001\u0000\u0000\u0000?\u0113\u0001\u0000\u0000\u0000A"+
		"\u0119\u0001\u0000\u0000\u0000C\u0121\u0001\u0000\u0000\u0000E\u0126\u0001"+
		"\u0000\u0000\u0000G\u0131\u0001\u0000\u0000\u0000I\u0134\u0001\u0000\u0000"+
		"\u0000K\u013c\u0001\u0000\u0000\u0000M\u013f\u0001\u0000\u0000\u0000O"+
		"\u0146\u0001\u0000\u0000\u0000Q\u0150\u0001\u0000\u0000\u0000S\u0158\u0001"+
		"\u0000\u0000\u0000U\u0163\u0001\u0000\u0000\u0000W\u0167\u0001\u0000\u0000"+
		"\u0000Y\u016c\u0001\u0000\u0000\u0000[\u0173\u0001\u0000\u0000\u0000]"+
		"\u017a\u0001\u0000\u0000\u0000_\u0184\u0001\u0000\u0000\u0000a\u018c\u0001"+
		"\u0000\u0000\u0000c\u0192\u0001\u0000\u0000\u0000e\u0194\u0001\u0000\u0000"+
		"\u0000g\u0196\u0001\u0000\u0000\u0000i\u0198\u0001\u0000\u0000\u0000k"+
		"\u019a\u0001\u0000\u0000\u0000m\u019d\u0001\u0000\u0000\u0000o\u01a0\u0001"+
		"\u0000\u0000\u0000q\u01a3\u0001\u0000\u0000\u0000s\u01a6\u0001\u0000\u0000"+
		"\u0000u\u01a9\u0001\u0000\u0000\u0000w\u01ac\u0001\u0000\u0000\u0000y"+
		"\u01ae\u0001\u0000\u0000\u0000{\u01b0\u0001\u0000\u0000\u0000}\u01b2\u0001"+
		"\u0000\u0000\u0000\u007f\u01b4\u0001\u0000\u0000\u0000\u0081\u01b6\u0001"+
		"\u0000\u0000\u0000\u0083\u01b8\u0001\u0000\u0000\u0000\u0085\u01ba\u0001"+
		"\u0000\u0000\u0000\u0087\u01bc\u0001\u0000\u0000\u0000\u0089\u01c1\u0001"+
		"\u0000\u0000\u0000\u008b\u01c9\u0001\u0000\u0000\u0000\u008d\u01d1\u0001"+
		"\u0000\u0000\u0000\u008f\u01d3\u0001\u0000\u0000\u0000\u0091\u01d5\u0001"+
		"\u0000\u0000\u0000\u0093\u01df\u0001\u0000\u0000\u0000\u0095\u01e1\u0001"+
		"\u0000\u0000\u0000\u0097\u01e3\u0001\u0000\u0000\u0000\u0099\u01ef\u0001"+
		"\u0000\u0000\u0000\u009b\u01f2\u0001\u0000\u0000\u0000\u009d\u01f7\u0001"+
		"\u0000\u0000\u0000\u009f\u0204\u0001\u0000\u0000\u0000\u00a1\u0208\u0001"+
		"\u0000\u0000\u0000\u00a3\u0216\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005"+
		"P\u0000\u0000\u00a6\u00a7\u0005I\u0000\u0000\u00a7\u0002\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0005Q\u0000\u0000\u00a9\u00aa\u0005I\u0000\u0000\u00aa"+
		"\u00ab\u0005N\u0000\u0000\u00ab\u00ac\u0005I\u0000\u0000\u00ac\u00ad\u0005"+
		"T\u0000\u0000\u00ad\u0004\u0001\u0000\u0000\u0000\u00ae\u00af\u0005C\u0000"+
		"\u0000\u00af\u00b0\u0005R\u0000\u0000\u00b0\u00b1\u0005E\u0000\u0000\u00b1"+
		"\u00b2\u0005G\u0000\u0000\u00b2\u0006\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0005q\u0000\u0000\u00b4\b\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005"+
		"c\u0000\u0000\u00b6\n\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005B\u0000"+
		"\u0000\u00b8\u00b9\u0005A\u0000\u0000\u00b9\u00ba\u0005R\u0000\u0000\u00ba"+
		"\u00bb\u0005R\u0000\u0000\u00bb\u00bc\u0005I\u0000\u0000\u00bc\u00bd\u0005"+
		"E\u0000\u0000\u00bd\u00be\u0005R\u0000\u0000\u00be\f\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0005Q\u0000\u0000\u00c0\u00c1\u0005G\u0000\u0000\u00c1"+
		"\u00c2\u0005A\u0000\u0000\u00c2\u00c3\u0005T\u0000\u0000\u00c3\u00c4\u0005"+
		"E\u0000\u0000\u00c4\u000e\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005E\u0000"+
		"\u0000\u00c6\u00c7\u0005N\u0000\u0000\u00c7\u00c8\u0005D\u0000\u0000\u00c8"+
		"\u00c9\u0005Q\u0000\u0000\u00c9\u00ca\u0005G\u0000\u0000\u00ca\u00cb\u0005"+
		"A\u0000\u0000\u00cb\u00cc\u0005T\u0000\u0000\u00cc\u00cd\u0005E\u0000"+
		"\u0000\u00cd\u0010\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005E\u0000\u0000"+
		"\u00cf\u00d0\u0005C\u0000\u0000\u00d0\u00d1\u0005H\u0000\u0000\u00d1\u00d2"+
		"\u0005O\u0000\u0000\u00d2\u0012\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005"+
		"H\u0000\u0000\u00d4\u0014\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005X\u0000"+
		"\u0000\u00d6\u0016\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005N\u0000\u0000"+
		"\u00d8\u00d9\u0005O\u0000\u0000\u00d9\u00da\u0005T\u0000\u0000\u00da\u0018"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0005T\u0000\u0000\u00dc\u001a\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0005S\u0000\u0000\u00de\u001c\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0005Y\u0000\u0000\u00e0\u001e\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0005Z\u0000\u0000\u00e2 \u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0005X\u0000\u0000\u00e4\u00e5\u00051\u0000\u0000\u00e5\"\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0005Y\u0000\u0000\u00e7\u00e8\u00051\u0000"+
		"\u0000\u00e8$\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005Z\u0000\u0000\u00ea"+
		"\u00eb\u00051\u0000\u0000\u00eb&\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005"+
		"I\u0000\u0000\u00ed(\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005U\u0000"+
		"\u0000\u00ef\u00f0\u00052\u0000\u0000\u00f0*\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0005R\u0000\u0000\u00f2\u00f3\u0005P\u0000\u0000\u00f3\u00f4\u0005"+
		"h\u0000\u0000\u00f4\u00f5\u0005i\u0000\u0000\u00f5,\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0005U\u0000\u0000\u00f7\u00f8\u00053\u0000\u0000\u00f8"+
		".\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005U\u0000\u0000\u00fa\u00fb\u0005"+
		"4\u0000\u0000\u00fb0\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005R\u0000"+
		"\u0000\u00fd\u00fe\u0005X\u0000\u0000\u00fe2\u0001\u0000\u0000\u0000\u00ff"+
		"\u0100\u0005R\u0000\u0000\u0100\u0101\u0005Y\u0000\u0000\u01014\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0005R\u0000\u0000\u0103\u0104\u0005Z\u0000"+
		"\u0000\u01046\u0001\u0000\u0000\u0000\u0105\u0106\u0005U\u0000\u0000\u0106"+
		"\u0107\u00051\u0000\u0000\u01078\u0001\u0000\u0000\u0000\u0108\u0109\u0005"+
		"C\u0000\u0000\u0109\u010a\u0005N\u0000\u0000\u010a\u010b\u0005O\u0000"+
		"\u0000\u010b\u010c\u0005T\u0000\u0000\u010c:\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0005C\u0000\u0000\u010e\u010f\u0005Z\u0000\u0000\u010f<\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0005C\u0000\u0000\u0111\u0112\u0005U\u0000"+
		"\u0000\u0112>\u0001\u0000\u0000\u0000\u0113\u0114\u0005I\u0000\u0000\u0114"+
		"\u0115\u0005S\u0000\u0000\u0115\u0116\u0005W\u0000\u0000\u0116\u0117\u0005"+
		"A\u0000\u0000\u0117\u0118\u0005P\u0000\u0000\u0118@\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0005S\u0000\u0000\u011a\u011b\u0005Q\u0000\u0000\u011b"+
		"\u011c\u0005I\u0000\u0000\u011c\u011d\u0005S\u0000\u0000\u011d\u011e\u0005"+
		"W\u0000\u0000\u011e\u011f\u0005A\u0000\u0000\u011f\u0120\u0005P\u0000"+
		"\u0000\u0120B\u0001\u0000\u0000\u0000\u0121\u0122\u0005S\u0000\u0000\u0122"+
		"\u0123\u0005W\u0000\u0000\u0123\u0124\u0005A\u0000\u0000\u0124\u0125\u0005"+
		"P\u0000\u0000\u0125D\u0001\u0000\u0000\u0000\u0126\u0127\u0005I\u0000"+
		"\u0000\u0127\u0128\u0005S\u0000\u0000\u0128\u0129\u0005W\u0000\u0000\u0129"+
		"\u012a\u0005A\u0000\u0000\u012a\u012b\u0005P\u0000\u0000\u012b\u012c\u0005"+
		"T\u0000\u0000\u012c\u012d\u0005H\u0000\u0000\u012d\u012e\u0005E\u0000"+
		"\u0000\u012e\u012f\u0005T\u0000\u0000\u012f\u0130\u0005A\u0000\u0000\u0130"+
		"F\u0001\u0000\u0000\u0000\u0131\u0132\u0005C\u0000\u0000\u0132\u0133\u0005"+
		"R\u0000\u0000\u0133H\u0001\u0000\u0000\u0000\u0134\u0135\u0005T\u0000"+
		"\u0000\u0135\u0136\u0005O\u0000\u0000\u0136\u0137\u0005F\u0000\u0000\u0137"+
		"\u0138\u0005F\u0000\u0000\u0138\u0139\u0005O\u0000\u0000\u0139\u013a\u0005"+
		"L\u0000\u0000\u013a\u013b\u0005I\u0000\u0000\u013bJ\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0005C\u0000\u0000\u013d\u013e\u0005P\u0000\u0000\u013e"+
		"L\u0001\u0000\u0000\u0000\u013f\u0140\u0005D\u0000\u0000\u0140\u0141\u0005"+
		"A\u0000\u0000\u0141\u0142\u0005G\u0000\u0000\u0142\u0143\u0005G\u0000"+
		"\u0000\u0143\u0144\u0005E\u0000\u0000\u0144\u0145\u0005R\u0000\u0000\u0145"+
		"N\u0001\u0000\u0000\u0000\u0146\u0147\u0005E\u0000\u0000\u0147\u0148\u0005"+
		"N\u0000\u0000\u0148\u0149\u0005D\u0000\u0000\u0149\u014a\u0005D\u0000"+
		"\u0000\u014a\u014b\u0005A\u0000\u0000\u014b\u014c\u0005G\u0000\u0000\u014c"+
		"\u014d\u0005G\u0000\u0000\u014d\u014e\u0005E\u0000\u0000\u014e\u014f\u0005"+
		"R\u0000\u0000\u014fP\u0001\u0000\u0000\u0000\u0150\u0151\u0005C\u0000"+
		"\u0000\u0151\u0152\u0005O\u0000\u0000\u0152\u0153\u0005N\u0000\u0000\u0153"+
		"\u0154\u0005T\u0000\u0000\u0154\u0155\u0005R\u0000\u0000\u0155\u0156\u0005"+
		"O\u0000\u0000\u0156\u0157\u0005L\u0000\u0000\u0157R\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0005E\u0000\u0000\u0159\u015a\u0005N\u0000\u0000\u015a"+
		"\u015b\u0005D\u0000\u0000\u015b\u015c\u0005C\u0000\u0000\u015c\u015d\u0005"+
		"O\u0000\u0000\u015d\u015e\u0005N\u0000\u0000\u015e\u015f\u0005T\u0000"+
		"\u0000\u015f\u0160\u0005R\u0000\u0000\u0160\u0161\u0005O\u0000\u0000\u0161"+
		"\u0162\u0005L\u0000\u0000\u0162T\u0001\u0000\u0000\u0000\u0163\u0164\u0005"+
		"Q\u0000\u0000\u0164\u0165\u0005I\u0000\u0000\u0165\u0166\u0005F\u0000"+
		"\u0000\u0166V\u0001\u0000\u0000\u0000\u0167\u0168\u0005E\u0000\u0000\u0168"+
		"\u0169\u0005L\u0000\u0000\u0169\u016a\u0005S\u0000\u0000\u016a\u016b\u0005"+
		"E\u0000\u0000\u016bX\u0001\u0000\u0000\u0000\u016c\u016d\u0005E\u0000"+
		"\u0000\u016d\u016e\u0005N\u0000\u0000\u016e\u016f\u0005D\u0000\u0000\u016f"+
		"\u0170\u0005Q\u0000\u0000\u0170\u0171\u0005I\u0000\u0000\u0171\u0172\u0005"+
		"F\u0000\u0000\u0172Z\u0001\u0000\u0000\u0000\u0173\u0174\u0005Q\u0000"+
		"\u0000\u0174\u0175\u0005W\u0000\u0000\u0175\u0176\u0005H\u0000\u0000\u0176"+
		"\u0177\u0005I\u0000\u0000\u0177\u0178\u0005L\u0000\u0000\u0178\u0179\u0005"+
		"E\u0000\u0000\u0179\\\u0001\u0000\u0000\u0000\u017a\u017b\u0005E\u0000"+
		"\u0000\u017b\u017c\u0005N\u0000\u0000\u017c\u017d\u0005D\u0000\u0000\u017d"+
		"\u017e\u0005Q\u0000\u0000\u017e\u017f\u0005W\u0000\u0000\u017f\u0180\u0005"+
		"H\u0000\u0000\u0180\u0181\u0005I\u0000\u0000\u0181\u0182\u0005L\u0000"+
		"\u0000\u0182\u0183\u0005E\u0000\u0000\u0183^\u0001\u0000\u0000\u0000\u0184"+
		"\u0185\u0005M\u0000\u0000\u0185\u0186\u0005E\u0000\u0000\u0186\u0187\u0005"+
		"A\u0000\u0000\u0187\u0188\u0005S\u0000\u0000\u0188\u0189\u0005U\u0000"+
		"\u0000\u0189\u018a\u0005R\u0000\u0000\u018a\u018b\u0005E\u0000\u0000\u018b"+
		"`\u0001\u0000\u0000\u0000\u018c\u018d\u0005R\u0000\u0000\u018d\u018e\u0005"+
		"E\u0000\u0000\u018e\u018f\u0005S\u0000\u0000\u018f\u0190\u0005E\u0000"+
		"\u0000\u0190\u0191\u0005T\u0000\u0000\u0191b\u0001\u0000\u0000\u0000\u0192"+
		"\u0193\u0005=\u0000\u0000\u0193d\u0001\u0000\u0000\u0000\u0194\u0195\u0005"+
		">\u0000\u0000\u0195f\u0001\u0000\u0000\u0000\u0196\u0197\u0005<\u0000"+
		"\u0000\u0197h\u0001\u0000\u0000\u0000\u0198\u0199\u0005!\u0000\u0000\u0199"+
		"j\u0001\u0000\u0000\u0000\u019a\u019b\u0005=\u0000\u0000\u019b\u019c\u0005"+
		"=\u0000\u0000\u019cl\u0001\u0000\u0000\u0000\u019d\u019e\u0005<\u0000"+
		"\u0000\u019e\u019f\u0005=\u0000\u0000\u019fn\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0005>\u0000\u0000\u01a1\u01a2\u0005=\u0000\u0000\u01a2p\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a4\u0005!\u0000\u0000\u01a4\u01a5\u0005=\u0000"+
		"\u0000\u01a5r\u0001\u0000\u0000\u0000\u01a6\u01a7\u0005&\u0000\u0000\u01a7"+
		"\u01a8\u0005&\u0000\u0000\u01a8t\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005"+
		"|\u0000\u0000\u01aa\u01ab\u0005|\u0000\u0000\u01abv\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0005+\u0000\u0000\u01adx\u0001\u0000\u0000\u0000\u01ae"+
		"\u01af\u0005-\u0000\u0000\u01afz\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005"+
		"*\u0000\u0000\u01b1|\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005/\u0000"+
		"\u0000\u01b3~\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005,\u0000\u0000\u01b5"+
		"\u0080\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005(\u0000\u0000\u01b7\u0082"+
		"\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005)\u0000\u0000\u01b9\u0084\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bb\u0005[\u0000\u0000\u01bb\u0086\u0001\u0000"+
		"\u0000\u0000\u01bc\u01bd\u0005]\u0000\u0000\u01bd\u0088\u0001\u0000\u0000"+
		"\u0000\u01be\u01c0\u0007\u0000\u0000\u0000\u01bf\u01be\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c3\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c4\u01c6\u0005\r\u0000\u0000"+
		"\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005\n\u0000\u0000\u01c8"+
		"\u008a\u0001\u0000\u0000\u0000\u01c9\u01ce\u0003\u008dF\u0000\u01ca\u01cd"+
		"\u0003\u008dF\u0000\u01cb\u01cd\u0003\u008fG\u0000\u01cc\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cd\u01d0\u0001\u0000"+
		"\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000"+
		"\u0000\u0000\u01cf\u008c\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d2\u0007\u0001\u0000\u0000\u01d2\u008e\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d4\u0007\u0002\u0000\u0000\u01d4\u0090\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d6\u0003\u0093I\u0000\u01d6\u0092\u0001\u0000\u0000"+
		"\u0000\u01d7\u01db\u0003\u0095J\u0000\u01d8\u01da\u0003\u008fG\u0000\u01d9"+
		"\u01d8\u0001\u0000\u0000\u0000\u01da\u01dd\u0001\u0000\u0000\u0000\u01db"+
		"\u01d9\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc"+
		"\u01e0\u0001\u0000\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01de"+
		"\u01e0\u0003\u008fG\u0000\u01df\u01d7\u0001\u0000\u0000\u0000\u01df\u01de"+
		"\u0001\u0000\u0000\u0000\u01e0\u0094\u0001\u0000\u0000\u0000\u01e1\u01e2"+
		"\u0007\u0003\u0000\u0000\u01e2\u0096\u0001\u0000\u0000\u0000\u01e3\u01e4"+
		"\u0003\u0099L\u0000\u01e4\u0098\u0001\u0000\u0000\u0000\u01e5\u01e7\u0003"+
		"\u009bM\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01e9\u0005.\u0000"+
		"\u0000\u01e9\u01f0\u0003\u009bM\u0000\u01ea\u01eb\u0003\u009bM\u0000\u01eb"+
		"\u01ec\u0005.\u0000\u0000\u01ec\u01ed\u0003\u009dN\u0000\u01ed\u01f0\u0001"+
		"\u0000\u0000\u0000\u01ee\u01f0\u0003\u009dN\u0000\u01ef\u01e6\u0001\u0000"+
		"\u0000\u0000\u01ef\u01ea\u0001\u0000\u0000\u0000\u01ef\u01ee\u0001\u0000"+
		"\u0000\u0000\u01f0\u009a\u0001\u0000\u0000\u0000\u01f1\u01f3\u0003\u008f"+
		"G\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f5\u009c\u0001\u0000\u0000\u0000\u01f6\u01f8\u0007\u0002\u0000"+
		"\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000"+
		"\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000"+
		"\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fd\u0007\u0004\u0000"+
		"\u0000\u01fc\u01fe\u0007\u0005\u0000\u0000\u01fd\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u0200\u0001\u0000\u0000"+
		"\u0000\u01ff\u0201\u0007\u0002\u0000\u0000\u0200\u01ff\u0001\u0000\u0000"+
		"\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0200\u0001\u0000\u0000"+
		"\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u009e\u0001\u0000\u0000"+
		"\u0000\u0204\u0205\u0007\u0006\u0000\u0000\u0205\u0206\u0001\u0000\u0000"+
		"\u0000\u0206\u0207\u0006O\u0000\u0000\u0207\u00a0\u0001\u0000\u0000\u0000"+
		"\u0208\u020c\u0005#\u0000\u0000\u0209\u020b\b\u0000\u0000\u0000\u020a"+
		"\u0209\u0001\u0000\u0000\u0000\u020b\u020e\u0001\u0000\u0000\u0000\u020c"+
		"\u020a\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d"+
		"\u0210\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020f"+
		"\u0211\u0005\r\u0000\u0000\u0210\u020f\u0001\u0000\u0000\u0000\u0210\u0211"+
		"\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0213"+
		"\u0005\n\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214\u0215\u0006"+
		"P\u0000\u0000\u0215\u00a2\u0001\u0000\u0000\u0000\u0216\u0217\u0007\u0006"+
		"\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0219\u0006Q\u0000"+
		"\u0000\u0219\u00a4\u0001\u0000\u0000\u0000\u000f\u0000\u01c1\u01c5\u01cc"+
		"\u01ce\u01db\u01df\u01e6\u01ef\u01f4\u01f9\u01fd\u0202\u020c\u0210\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}