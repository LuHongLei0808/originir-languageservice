// Generated from c:\\Users\\BY23015S\\Desktop\\project\\originir-languageservice\\originir½âñî\\TodoLangGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TodoLangGrammarLexer extends Lexer {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2O\u021c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3"+
		".\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3>\3>\3?\3?\3"+
		"@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\7F\u01c2\nF\fF\16F\u01c5\13F\3F"+
		"\5F\u01c8\nF\3F\3F\3G\3G\3G\7G\u01cf\nG\fG\16G\u01d2\13G\3H\3H\3I\3I\3"+
		"J\3J\3K\3K\7K\u01dc\nK\fK\16K\u01df\13K\3K\5K\u01e2\nK\3L\3L\3M\3M\3N"+
		"\5N\u01e9\nN\3N\3N\3N\3N\3N\3N\3N\5N\u01f2\nN\3O\6O\u01f5\nO\rO\16O\u01f6"+
		"\3P\6P\u01fa\nP\rP\16P\u01fb\3P\3P\5P\u0200\nP\3P\6P\u0203\nP\rP\16P\u0204"+
		"\3Q\3Q\3Q\3Q\3R\3R\7R\u020d\nR\fR\16R\u0210\13R\3R\5R\u0213\nR\3R\3R\3"+
		"R\3R\3S\3S\3S\3S\2\2T\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008f\2\u0091\2\u0093I\u0095\2\u0097\2\u0099J\u009b\2"+
		"\u009dK\u009fL\u00a1M\u00a3N\u00a5O\3\2\t\4\2\f\f\17\17\5\2C\\aac|\3\2"+
		"\62;\3\2\63;\4\2GGgg\4\2--//\4\2\13\13\"\"\2\u0225\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u0093\3\2\2\2"+
		"\2\u0099\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\3\u00a7\3\2\2\2\5\u00aa\3\2\2\2\7\u00b0\3\2\2"+
		"\2\t\u00b5\3\2\2\2\13\u00b7\3\2\2\2\r\u00b9\3\2\2\2\17\u00c1\3\2\2\2\21"+
		"\u00c7\3\2\2\2\23\u00d0\3\2\2\2\25\u00d5\3\2\2\2\27\u00d7\3\2\2\2\31\u00d9"+
		"\3\2\2\2\33\u00dd\3\2\2\2\35\u00df\3\2\2\2\37\u00e1\3\2\2\2!\u00e3\3\2"+
		"\2\2#\u00e5\3\2\2\2%\u00e8\3\2\2\2\'\u00eb\3\2\2\2)\u00ee\3\2\2\2+\u00f0"+
		"\3\2\2\2-\u00f3\3\2\2\2/\u00f8\3\2\2\2\61\u00fb\3\2\2\2\63\u00fe\3\2\2"+
		"\2\65\u0101\3\2\2\2\67\u0104\3\2\2\29\u0107\3\2\2\2;\u010a\3\2\2\2=\u010f"+
		"\3\2\2\2?\u0112\3\2\2\2A\u0115\3\2\2\2C\u011b\3\2\2\2E\u0123\3\2\2\2G"+
		"\u0128\3\2\2\2I\u0133\3\2\2\2K\u0136\3\2\2\2M\u013e\3\2\2\2O\u0141\3\2"+
		"\2\2Q\u0148\3\2\2\2S\u0152\3\2\2\2U\u015a\3\2\2\2W\u0165\3\2\2\2Y\u0169"+
		"\3\2\2\2[\u016e\3\2\2\2]\u0175\3\2\2\2_\u017c\3\2\2\2a\u0186\3\2\2\2c"+
		"\u018e\3\2\2\2e\u0194\3\2\2\2g\u0196\3\2\2\2i\u0198\3\2\2\2k\u019a\3\2"+
		"\2\2m\u019c\3\2\2\2o\u019f\3\2\2\2q\u01a2\3\2\2\2s\u01a5\3\2\2\2u\u01a8"+
		"\3\2\2\2w\u01ab\3\2\2\2y\u01ae\3\2\2\2{\u01b0\3\2\2\2}\u01b2\3\2\2\2\177"+
		"\u01b4\3\2\2\2\u0081\u01b6\3\2\2\2\u0083\u01b8\3\2\2\2\u0085\u01ba\3\2"+
		"\2\2\u0087\u01bc\3\2\2\2\u0089\u01be\3\2\2\2\u008b\u01c3\3\2\2\2\u008d"+
		"\u01cb\3\2\2\2\u008f\u01d3\3\2\2\2\u0091\u01d5\3\2\2\2\u0093\u01d7\3\2"+
		"\2\2\u0095\u01e1\3\2\2\2\u0097\u01e3\3\2\2\2\u0099\u01e5\3\2\2\2\u009b"+
		"\u01f1\3\2\2\2\u009d\u01f4\3\2\2\2\u009f\u01f9\3\2\2\2\u00a1\u0206\3\2"+
		"\2\2\u00a3\u020a\3\2\2\2\u00a5\u0218\3\2\2\2\u00a7\u00a8\7R\2\2\u00a8"+
		"\u00a9\7K\2\2\u00a9\4\3\2\2\2\u00aa\u00ab\7S\2\2\u00ab\u00ac\7K\2\2\u00ac"+
		"\u00ad\7P\2\2\u00ad\u00ae\7K\2\2\u00ae\u00af\7V\2\2\u00af\6\3\2\2\2\u00b0"+
		"\u00b1\7E\2\2\u00b1\u00b2\7T\2\2\u00b2\u00b3\7G\2\2\u00b3\u00b4\7I\2\2"+
		"\u00b4\b\3\2\2\2\u00b5\u00b6\7s\2\2\u00b6\n\3\2\2\2\u00b7\u00b8\7e\2\2"+
		"\u00b8\f\3\2\2\2\u00b9\u00ba\7D\2\2\u00ba\u00bb\7C\2\2\u00bb\u00bc\7T"+
		"\2\2\u00bc\u00bd\7T\2\2\u00bd\u00be\7K\2\2\u00be\u00bf\7G\2\2\u00bf\u00c0"+
		"\7T\2\2\u00c0\16\3\2\2\2\u00c1\u00c2\7S\2\2\u00c2\u00c3\7I\2\2\u00c3\u00c4"+
		"\7C\2\2\u00c4\u00c5\7V\2\2\u00c5\u00c6\7G\2\2\u00c6\20\3\2\2\2\u00c7\u00c8"+
		"\7G\2\2\u00c8\u00c9\7P\2\2\u00c9\u00ca\7F\2\2\u00ca\u00cb\7S\2\2\u00cb"+
		"\u00cc\7I\2\2\u00cc\u00cd\7C\2\2\u00cd\u00ce\7V\2\2\u00ce\u00cf\7G\2\2"+
		"\u00cf\22\3\2\2\2\u00d0\u00d1\7G\2\2\u00d1\u00d2\7E\2\2\u00d2\u00d3\7"+
		"J\2\2\u00d3\u00d4\7Q\2\2\u00d4\24\3\2\2\2\u00d5\u00d6\7J\2\2\u00d6\26"+
		"\3\2\2\2\u00d7\u00d8\7Z\2\2\u00d8\30\3\2\2\2\u00d9\u00da\7P\2\2\u00da"+
		"\u00db\7Q\2\2\u00db\u00dc\7V\2\2\u00dc\32\3\2\2\2\u00dd\u00de\7V\2\2\u00de"+
		"\34\3\2\2\2\u00df\u00e0\7U\2\2\u00e0\36\3\2\2\2\u00e1\u00e2\7[\2\2\u00e2"+
		" \3\2\2\2\u00e3\u00e4\7\\\2\2\u00e4\"\3\2\2\2\u00e5\u00e6\7Z\2\2\u00e6"+
		"\u00e7\7\63\2\2\u00e7$\3\2\2\2\u00e8\u00e9\7[\2\2\u00e9\u00ea\7\63\2\2"+
		"\u00ea&\3\2\2\2\u00eb\u00ec\7\\\2\2\u00ec\u00ed\7\63\2\2\u00ed(\3\2\2"+
		"\2\u00ee\u00ef\7K\2\2\u00ef*\3\2\2\2\u00f0\u00f1\7W\2\2\u00f1\u00f2\7"+
		"\64\2\2\u00f2,\3\2\2\2\u00f3\u00f4\7T\2\2\u00f4\u00f5\7R\2\2\u00f5\u00f6"+
		"\7j\2\2\u00f6\u00f7\7k\2\2\u00f7.\3\2\2\2\u00f8\u00f9\7W\2\2\u00f9\u00fa"+
		"\7\65\2\2\u00fa\60\3\2\2\2\u00fb\u00fc\7W\2\2\u00fc\u00fd\7\66\2\2\u00fd"+
		"\62\3\2\2\2\u00fe\u00ff\7T\2\2\u00ff\u0100\7Z\2\2\u0100\64\3\2\2\2\u0101"+
		"\u0102\7T\2\2\u0102\u0103\7[\2\2\u0103\66\3\2\2\2\u0104\u0105\7T\2\2\u0105"+
		"\u0106\7\\\2\2\u01068\3\2\2\2\u0107\u0108\7W\2\2\u0108\u0109\7\63\2\2"+
		"\u0109:\3\2\2\2\u010a\u010b\7E\2\2\u010b\u010c\7P\2\2\u010c\u010d\7Q\2"+
		"\2\u010d\u010e\7V\2\2\u010e<\3\2\2\2\u010f\u0110\7E\2\2\u0110\u0111\7"+
		"\\\2\2\u0111>\3\2\2\2\u0112\u0113\7E\2\2\u0113\u0114\7W\2\2\u0114@\3\2"+
		"\2\2\u0115\u0116\7K\2\2\u0116\u0117\7U\2\2\u0117\u0118\7Y\2\2\u0118\u0119"+
		"\7C\2\2\u0119\u011a\7R\2\2\u011aB\3\2\2\2\u011b\u011c\7U\2\2\u011c\u011d"+
		"\7S\2\2\u011d\u011e\7K\2\2\u011e\u011f\7U\2\2\u011f\u0120\7Y\2\2\u0120"+
		"\u0121\7C\2\2\u0121\u0122\7R\2\2\u0122D\3\2\2\2\u0123\u0124\7U\2\2\u0124"+
		"\u0125\7Y\2\2\u0125\u0126\7C\2\2\u0126\u0127\7R\2\2\u0127F\3\2\2\2\u0128"+
		"\u0129\7K\2\2\u0129\u012a\7U\2\2\u012a\u012b\7Y\2\2\u012b\u012c\7C\2\2"+
		"\u012c\u012d\7R\2\2\u012d\u012e\7V\2\2\u012e\u012f\7J\2\2\u012f\u0130"+
		"\7G\2\2\u0130\u0131\7V\2\2\u0131\u0132\7C\2\2\u0132H\3\2\2\2\u0133\u0134"+
		"\7E\2\2\u0134\u0135\7T\2\2\u0135J\3\2\2\2\u0136\u0137\7V\2\2\u0137\u0138"+
		"\7Q\2\2\u0138\u0139\7H\2\2\u0139\u013a\7H\2\2\u013a\u013b\7Q\2\2\u013b"+
		"\u013c\7N\2\2\u013c\u013d\7K\2\2\u013dL\3\2\2\2\u013e\u013f\7E\2\2\u013f"+
		"\u0140\7R\2\2\u0140N\3\2\2\2\u0141\u0142\7F\2\2\u0142\u0143\7C\2\2\u0143"+
		"\u0144\7I\2\2\u0144\u0145\7I\2\2\u0145\u0146\7G\2\2\u0146\u0147\7T\2\2"+
		"\u0147P\3\2\2\2\u0148\u0149\7G\2\2\u0149\u014a\7P\2\2\u014a\u014b\7F\2"+
		"\2\u014b\u014c\7F\2\2\u014c\u014d\7C\2\2\u014d\u014e\7I\2\2\u014e\u014f"+
		"\7I\2\2\u014f\u0150\7G\2\2\u0150\u0151\7T\2\2\u0151R\3\2\2\2\u0152\u0153"+
		"\7E\2\2\u0153\u0154\7Q\2\2\u0154\u0155\7P\2\2\u0155\u0156\7V\2\2\u0156"+
		"\u0157\7T\2\2\u0157\u0158\7Q\2\2\u0158\u0159\7N\2\2\u0159T\3\2\2\2\u015a"+
		"\u015b\7G\2\2\u015b\u015c\7P\2\2\u015c\u015d\7F\2\2\u015d\u015e\7E\2\2"+
		"\u015e\u015f\7Q\2\2\u015f\u0160\7P\2\2\u0160\u0161\7V\2\2\u0161\u0162"+
		"\7T\2\2\u0162\u0163\7Q\2\2\u0163\u0164\7N\2\2\u0164V\3\2\2\2\u0165\u0166"+
		"\7S\2\2\u0166\u0167\7K\2\2\u0167\u0168\7H\2\2\u0168X\3\2\2\2\u0169\u016a"+
		"\7G\2\2\u016a\u016b\7N\2\2\u016b\u016c\7U\2\2\u016c\u016d\7G\2\2\u016d"+
		"Z\3\2\2\2\u016e\u016f\7G\2\2\u016f\u0170\7P\2\2\u0170\u0171\7F\2\2\u0171"+
		"\u0172\7S\2\2\u0172\u0173\7K\2\2\u0173\u0174\7H\2\2\u0174\\\3\2\2\2\u0175"+
		"\u0176\7S\2\2\u0176\u0177\7Y\2\2\u0177\u0178\7J\2\2\u0178\u0179\7K\2\2"+
		"\u0179\u017a\7N\2\2\u017a\u017b\7G\2\2\u017b^\3\2\2\2\u017c\u017d\7G\2"+
		"\2\u017d\u017e\7P\2\2\u017e\u017f\7F\2\2\u017f\u0180\7S\2\2\u0180\u0181"+
		"\7Y\2\2\u0181\u0182\7J\2\2\u0182\u0183\7K\2\2\u0183\u0184\7N\2\2\u0184"+
		"\u0185\7G\2\2\u0185`\3\2\2\2\u0186\u0187\7O\2\2\u0187\u0188\7G\2\2\u0188"+
		"\u0189\7C\2\2\u0189\u018a\7U\2\2\u018a\u018b\7W\2\2\u018b\u018c\7T\2\2"+
		"\u018c\u018d\7G\2\2\u018db\3\2\2\2\u018e\u018f\7T\2\2\u018f\u0190\7G\2"+
		"\2\u0190\u0191\7U\2\2\u0191\u0192\7G\2\2\u0192\u0193\7V\2\2\u0193d\3\2"+
		"\2\2\u0194\u0195\7?\2\2\u0195f\3\2\2\2\u0196\u0197\7@\2\2\u0197h\3\2\2"+
		"\2\u0198\u0199\7>\2\2\u0199j\3\2\2\2\u019a\u019b\7#\2\2\u019bl\3\2\2\2"+
		"\u019c\u019d\7?\2\2\u019d\u019e\7?\2\2\u019en\3\2\2\2\u019f\u01a0\7>\2"+
		"\2\u01a0\u01a1\7?\2\2\u01a1p\3\2\2\2\u01a2\u01a3\7@\2\2\u01a3\u01a4\7"+
		"?\2\2\u01a4r\3\2\2\2\u01a5\u01a6\7#\2\2\u01a6\u01a7\7?\2\2\u01a7t\3\2"+
		"\2\2\u01a8\u01a9\7(\2\2\u01a9\u01aa\7(\2\2\u01aav\3\2\2\2\u01ab\u01ac"+
		"\7~\2\2\u01ac\u01ad\7~\2\2\u01adx\3\2\2\2\u01ae\u01af\7-\2\2\u01afz\3"+
		"\2\2\2\u01b0\u01b1\7/\2\2\u01b1|\3\2\2\2\u01b2\u01b3\7,\2\2\u01b3~\3\2"+
		"\2\2\u01b4\u01b5\7\61\2\2\u01b5\u0080\3\2\2\2\u01b6\u01b7\7.\2\2\u01b7"+
		"\u0082\3\2\2\2\u01b8\u01b9\7*\2\2\u01b9\u0084\3\2\2\2\u01ba\u01bb\7+\2"+
		"\2\u01bb\u0086\3\2\2\2\u01bc\u01bd\7]\2\2\u01bd\u0088\3\2\2\2\u01be\u01bf"+
		"\7_\2\2\u01bf\u008a\3\2\2\2\u01c0\u01c2\t\2\2\2\u01c1\u01c0\3\2\2\2\u01c2"+
		"\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c7\3\2"+
		"\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c8\7\17\2\2\u01c7\u01c6\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\7\f\2\2\u01ca\u008c\3\2"+
		"\2\2\u01cb\u01d0\5\u008fH\2\u01cc\u01cf\5\u008fH\2\u01cd\u01cf\5\u0091"+
		"I\2\u01ce\u01cc\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0"+
		"\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u008e\3\2\2\2\u01d2\u01d0\3\2"+
		"\2\2\u01d3\u01d4\t\3\2\2\u01d4\u0090\3\2\2\2\u01d5\u01d6\t\4\2\2\u01d6"+
		"\u0092\3\2\2\2\u01d7\u01d8\5\u0095K\2\u01d8\u0094\3\2\2\2\u01d9\u01dd"+
		"\5\u0097L\2\u01da\u01dc\5\u0091I\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2"+
		"\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e2\3\2\2\2\u01df"+
		"\u01dd\3\2\2\2\u01e0\u01e2\5\u0091I\2\u01e1\u01d9\3\2\2\2\u01e1\u01e0"+
		"\3\2\2\2\u01e2\u0096\3\2\2\2\u01e3\u01e4\t\5\2\2\u01e4\u0098\3\2\2\2\u01e5"+
		"\u01e6\5\u009bN\2\u01e6\u009a\3\2\2\2\u01e7\u01e9\5\u009dO\2\u01e8\u01e7"+
		"\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\7\60\2\2"+
		"\u01eb\u01f2\5\u009dO\2\u01ec\u01ed\5\u009dO\2\u01ed\u01ee\7\60\2\2\u01ee"+
		"\u01ef\5\u009fP\2\u01ef\u01f2\3\2\2\2\u01f0\u01f2\5\u009fP\2\u01f1\u01e8"+
		"\3\2\2\2\u01f1\u01ec\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2\u009c\3\2\2\2\u01f3"+
		"\u01f5\5\u0091I\2\u01f4\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f4"+
		"\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u009e\3\2\2\2\u01f8\u01fa\t\4\2\2\u01f9"+
		"\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2"+
		"\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\t\6\2\2\u01fe\u0200\t\7\2\2\u01ff"+
		"\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2\2\2\u0201\u0203\t\4"+
		"\2\2\u0202\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0202\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u00a0\3\2\2\2\u0206\u0207\t\b\2\2\u0207\u0208\3\2"+
		"\2\2\u0208\u0209\bQ\2\2\u0209\u00a2\3\2\2\2\u020a\u020e\7%\2\2\u020b\u020d"+
		"\n\2\2\2\u020c\u020b\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0213\7\17"+
		"\2\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0214"+
		"\u0215\7\f\2\2\u0215\u0216\3\2\2\2\u0216\u0217\bR\2\2\u0217\u00a4\3\2"+
		"\2\2\u0218\u0219\t\b\2\2\u0219\u021a\3\2\2\2\u021a\u021b\bS\2\2\u021b"+
		"\u00a6\3\2\2\2\21\2\u01c3\u01c7\u01ce\u01d0\u01dd\u01e1\u01e8\u01f1\u01f6"+
		"\u01fb\u01ff\u0204\u020e\u0212\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}