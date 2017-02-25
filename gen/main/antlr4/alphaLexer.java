// Generated from E:/Dropbox/Saxion/Jaar 2/Kwartiel 3/Compilers & Operating Systems/Practicumopdracht1/src/main/antlr4\alpha.g4 by ANTLR 4.6
package main.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class alphaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		INTEGER=10, DOUBLE=11, STRING=12, CHAR=13, BOOLEAN=14, TRUE=15, FALSE=16, 
		PLUS=17, MINUS=18, MULTIPLY=19, DIVIDE=20, MODULO=21, LBRACKET=22, RBRACKET=23, 
		SMALLERTHAN=24, GREATERTHAN=25, EQUALTO=26, NOTEQUALTO=27, SMALLEROREQUAL=28, 
		GREATEROREQUAL=29, OR=30, AND=31, NOT=32, TRY=33, CATCH=34, THROW=35, 
		IF=36, ELSEIF=37, ELSE=38, WHILE=39, COFFEE=40, PRINT=41, READ=42, RETURN=43, 
		START=44, END=45, NUMBER=46, CHAR_TYPE=47, TEXT=48, STRING_TYPE=49, TAB=50, 
		COMMENT=51, LINE_COMMENT=52, NEWLINE=53;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"INTEGER", "DOUBLE", "STRING", "CHAR", "BOOLEAN", "TRUE", "FALSE", "PLUS", 
		"MINUS", "MULTIPLY", "DIVIDE", "MODULO", "LBRACKET", "RBRACKET", "SMALLERTHAN", 
		"GREATERTHAN", "EQUALTO", "NOTEQUALTO", "SMALLEROREQUAL", "GREATEROREQUAL", 
		"OR", "AND", "NOT", "TRY", "CATCH", "THROW", "IF", "ELSEIF", "ELSE", "WHILE", 
		"COFFEE", "PRINT", "READ", "RETURN", "START", "END", "DIGITS", "INTEGER_TYPE", 
		"NUMBER", "CHAR_TYPE", "TEXT", "STRING_TYPE", "TAB", "COMMENT", "LINE_COMMENT", 
		"NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'\\+'", "' '", "' = '", "';'", "', '", "'~'", "'~ '", "'++'", 
		"'in'", "'do'", "'st'", "'ch'", "'bo'", "'tr'", "'fs'", "' + '", "' - '", 
		"' * '", "' / '", "' % '", "'('", "')'", "' < '", "' > '", "' == '", "' != '", 
		"' <= '", "' >= '", "' || '", "' && '", "'! '", "'ty'", "'ca'", "'th'", 
		"'if'", "'ef'", "'el'", "'wh'", null, "'sp'", "'he'", "'re'", "'Alpha'", 
		"'Omega'", null, null, null, null, null, null, null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "INTEGER", 
		"DOUBLE", "STRING", "CHAR", "BOOLEAN", "TRUE", "FALSE", "PLUS", "MINUS", 
		"MULTIPLY", "DIVIDE", "MODULO", "LBRACKET", "RBRACKET", "SMALLERTHAN", 
		"GREATERTHAN", "EQUALTO", "NOTEQUALTO", "SMALLEROREQUAL", "GREATEROREQUAL", 
		"OR", "AND", "NOT", "TRY", "CATCH", "THROW", "IF", "ELSEIF", "ELSE", "WHILE", 
		"COFFEE", "PRINT", "READ", "RETURN", "START", "END", "NUMBER", "CHAR_TYPE", 
		"TEXT", "STRING_TYPE", "TAB", "COMMENT", "LINE_COMMENT", "NEWLINE"
	};
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


	public alphaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "alpha.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\67\u0168\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\""+
		"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)"+
		"\5)\u00f9\n)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3."+
		"\3.\3.\3/\3/\3\60\3\60\7\60\u0114\n\60\f\60\16\60\u0117\13\60\3\60\5\60"+
		"\u011a\n\60\3\61\3\61\3\61\6\61\u011f\n\61\r\61\16\61\u0120\5\61\u0123"+
		"\n\61\3\62\3\62\3\62\3\62\3\63\3\63\5\63\u012b\n\63\3\63\5\63\u012e\n"+
		"\63\3\63\5\63\u0131\n\63\3\63\5\63\u0134\n\63\3\64\3\64\5\64\u0138\n\64"+
		"\3\64\5\64\u013b\n\64\3\64\5\64\u013e\n\64\3\64\5\64\u0141\n\64\3\64\5"+
		"\64\u0144\n\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\7\66"+
		"\u0150\n\66\f\66\16\66\u0153\13\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\7\67\u015e\n\67\f\67\16\67\u0161\13\67\3\67\3\67\38\38\38\3"+
		"8\3\u0151\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\2_\2a\60c\61e\62g\63"+
		"i\64k\65m\66o\67\3\2\b\3\2\62;\3\2\63;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13"+
		"\13\16\17\"\"\4\2\f\f\17\17\u0175\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5s\3\2\2\2\7v\3\2\2\2\tx\3\2\2\2\13"+
		"|\3\2\2\2\r~\3\2\2\2\17\u0081\3\2\2\2\21\u0083\3\2\2\2\23\u0086\3\2\2"+
		"\2\25\u0089\3\2\2\2\27\u008c\3\2\2\2\31\u008f\3\2\2\2\33\u0092\3\2\2\2"+
		"\35\u0095\3\2\2\2\37\u0098\3\2\2\2!\u009b\3\2\2\2#\u009e\3\2\2\2%\u00a2"+
		"\3\2\2\2\'\u00a6\3\2\2\2)\u00aa\3\2\2\2+\u00ae\3\2\2\2-\u00b2\3\2\2\2"+
		"/\u00b4\3\2\2\2\61\u00b6\3\2\2\2\63\u00ba\3\2\2\2\65\u00be\3\2\2\2\67"+
		"\u00c3\3\2\2\29\u00c8\3\2\2\2;\u00cd\3\2\2\2=\u00d2\3\2\2\2?\u00d7\3\2"+
		"\2\2A\u00dc\3\2\2\2C\u00df\3\2\2\2E\u00e2\3\2\2\2G\u00e5\3\2\2\2I\u00e8"+
		"\3\2\2\2K\u00eb\3\2\2\2M\u00ee\3\2\2\2O\u00f1\3\2\2\2Q\u00f8\3\2\2\2S"+
		"\u00fa\3\2\2\2U\u00fd\3\2\2\2W\u0100\3\2\2\2Y\u0103\3\2\2\2[\u0109\3\2"+
		"\2\2]\u010f\3\2\2\2_\u0119\3\2\2\2a\u011b\3\2\2\2c\u0124\3\2\2\2e\u0128"+
		"\3\2\2\2g\u0135\3\2\2\2i\u0147\3\2\2\2k\u014b\3\2\2\2m\u0159\3\2\2\2o"+
		"\u0164\3\2\2\2qr\7/\2\2r\4\3\2\2\2st\7^\2\2tu\7-\2\2u\6\3\2\2\2vw\7\""+
		"\2\2w\b\3\2\2\2xy\7\"\2\2yz\7?\2\2z{\7\"\2\2{\n\3\2\2\2|}\7=\2\2}\f\3"+
		"\2\2\2~\177\7.\2\2\177\u0080\7\"\2\2\u0080\16\3\2\2\2\u0081\u0082\7\u0080"+
		"\2\2\u0082\20\3\2\2\2\u0083\u0084\7\u0080\2\2\u0084\u0085\7\"\2\2\u0085"+
		"\22\3\2\2\2\u0086\u0087\7-\2\2\u0087\u0088\7-\2\2\u0088\24\3\2\2\2\u0089"+
		"\u008a\7k\2\2\u008a\u008b\7p\2\2\u008b\26\3\2\2\2\u008c\u008d\7f\2\2\u008d"+
		"\u008e\7q\2\2\u008e\30\3\2\2\2\u008f\u0090\7u\2\2\u0090\u0091\7v\2\2\u0091"+
		"\32\3\2\2\2\u0092\u0093\7e\2\2\u0093\u0094\7j\2\2\u0094\34\3\2\2\2\u0095"+
		"\u0096\7d\2\2\u0096\u0097\7q\2\2\u0097\36\3\2\2\2\u0098\u0099\7v\2\2\u0099"+
		"\u009a\7t\2\2\u009a \3\2\2\2\u009b\u009c\7h\2\2\u009c\u009d\7u\2\2\u009d"+
		"\"\3\2\2\2\u009e\u009f\7\"\2\2\u009f\u00a0\7-\2\2\u00a0\u00a1\7\"\2\2"+
		"\u00a1$\3\2\2\2\u00a2\u00a3\7\"\2\2\u00a3\u00a4\7/\2\2\u00a4\u00a5\7\""+
		"\2\2\u00a5&\3\2\2\2\u00a6\u00a7\7\"\2\2\u00a7\u00a8\7,\2\2\u00a8\u00a9"+
		"\7\"\2\2\u00a9(\3\2\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\7\61\2\2\u00ac"+
		"\u00ad\7\"\2\2\u00ad*\3\2\2\2\u00ae\u00af\7\"\2\2\u00af\u00b0\7\'\2\2"+
		"\u00b0\u00b1\7\"\2\2\u00b1,\3\2\2\2\u00b2\u00b3\7*\2\2\u00b3.\3\2\2\2"+
		"\u00b4\u00b5\7+\2\2\u00b5\60\3\2\2\2\u00b6\u00b7\7\"\2\2\u00b7\u00b8\7"+
		">\2\2\u00b8\u00b9\7\"\2\2\u00b9\62\3\2\2\2\u00ba\u00bb\7\"\2\2\u00bb\u00bc"+
		"\7@\2\2\u00bc\u00bd\7\"\2\2\u00bd\64\3\2\2\2\u00be\u00bf\7\"\2\2\u00bf"+
		"\u00c0\7?\2\2\u00c0\u00c1\7?\2\2\u00c1\u00c2\7\"\2\2\u00c2\66\3\2\2\2"+
		"\u00c3\u00c4\7\"\2\2\u00c4\u00c5\7#\2\2\u00c5\u00c6\7?\2\2\u00c6\u00c7"+
		"\7\"\2\2\u00c78\3\2\2\2\u00c8\u00c9\7\"\2\2\u00c9\u00ca\7>\2\2\u00ca\u00cb"+
		"\7?\2\2\u00cb\u00cc\7\"\2\2\u00cc:\3\2\2\2\u00cd\u00ce\7\"\2\2\u00ce\u00cf"+
		"\7@\2\2\u00cf\u00d0\7?\2\2\u00d0\u00d1\7\"\2\2\u00d1<\3\2\2\2\u00d2\u00d3"+
		"\7\"\2\2\u00d3\u00d4\7~\2\2\u00d4\u00d5\7~\2\2\u00d5\u00d6\7\"\2\2\u00d6"+
		">\3\2\2\2\u00d7\u00d8\7\"\2\2\u00d8\u00d9\7(\2\2\u00d9\u00da\7(\2\2\u00da"+
		"\u00db\7\"\2\2\u00db@\3\2\2\2\u00dc\u00dd\7#\2\2\u00dd\u00de\7\"\2\2\u00de"+
		"B\3\2\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7{\2\2\u00e1D\3\2\2\2\u00e2\u00e3"+
		"\7e\2\2\u00e3\u00e4\7c\2\2\u00e4F\3\2\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7"+
		"\7j\2\2\u00e7H\3\2\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7h\2\2\u00eaJ\3"+
		"\2\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7h\2\2\u00edL\3\2\2\2\u00ee\u00ef"+
		"\7g\2\2\u00ef\u00f0\7n\2\2\u00f0N\3\2\2\2\u00f1\u00f2\7y\2\2\u00f2\u00f3"+
		"\7j\2\2\u00f3P\3\2\2\2\u00f4\u00f5\7\u00e4\2\2\u00f5\u00f6\7\u02de\2\2"+
		"\u00f6\u00f9\7\u2024\2\2\u00f7\u00f9\7\u2617\2\2\u00f8\u00f4\3\2\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9R\3\2\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7r\2\2\u00fc"+
		"T\3\2\2\2\u00fd\u00fe\7j\2\2\u00fe\u00ff\7g\2\2\u00ffV\3\2\2\2\u0100\u0101"+
		"\7t\2\2\u0101\u0102\7g\2\2\u0102X\3\2\2\2\u0103\u0104\7C\2\2\u0104\u0105"+
		"\7n\2\2\u0105\u0106\7r\2\2\u0106\u0107\7j\2\2\u0107\u0108\7c\2\2\u0108"+
		"Z\3\2\2\2\u0109\u010a\7Q\2\2\u010a\u010b\7o\2\2\u010b\u010c\7g\2\2\u010c"+
		"\u010d\7i\2\2\u010d\u010e\7c\2\2\u010e\\\3\2\2\2\u010f\u0110\t\2\2\2\u0110"+
		"^\3\2\2\2\u0111\u0115\t\3\2\2\u0112\u0114\5]/\2\u0113\u0112\3\2\2\2\u0114"+
		"\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u011a\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0118\u011a\7\62\2\2\u0119\u0111\3\2\2\2\u0119"+
		"\u0118\3\2\2\2\u011a`\3\2\2\2\u011b\u0122\5_\60\2\u011c\u011e\7\60\2\2"+
		"\u011d\u011f\5]/\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u011c\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123b\3\2\2\2\u0124\u0125\7)\2\2\u0125\u0126\13\2\2\2"+
		"\u0126\u0127\7)\2\2\u0127d\3\2\2\2\u0128\u012a\t\4\2\2\u0129\u012b\t\5"+
		"\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c"+
		"\u012e\t\5\2\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2"+
		"\2\2\u012f\u0131\t\5\2\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0133\3\2\2\2\u0132\u0134\t\5\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134f\3\2\2\2\u0135\u0137\7$\2\2\u0136\u0138\13\2\2\2\u0137\u0136"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u013b\13\2\2\2"+
		"\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013e"+
		"\13\2\2\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2"+
		"\u013f\u0141\13\2\2\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143"+
		"\3\2\2\2\u0142\u0144\13\2\2\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2"+
		"\u0144\u0145\3\2\2\2\u0145\u0146\7$\2\2\u0146h\3\2\2\2\u0147\u0148\t\6"+
		"\2\2\u0148\u0149\3\2\2\2\u0149\u014a\b\65\2\2\u014aj\3\2\2\2\u014b\u014c"+
		"\7\61\2\2\u014c\u014d\7,\2\2\u014d\u0151\3\2\2\2\u014e\u0150\13\2\2\2"+
		"\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u0152\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7,\2\2\u0155"+
		"\u0156\7\61\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b\66\2\2\u0158l\3\2\2"+
		"\2\u0159\u015a\7\61\2\2\u015a\u015b\7\61\2\2\u015b\u015f\3\2\2\2\u015c"+
		"\u015e\n\7\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0163\b\67\2\2\u0163n\3\2\2\2\u0164\u0165\7\f\2\2\u0165\u0166\3\2\2\2"+
		"\u0166\u0167\b8\2\2\u0167p\3\2\2\2\23\2\u00f8\u0115\u0119\u0120\u0122"+
		"\u012a\u012d\u0130\u0133\u0137\u013a\u013d\u0140\u0143\u0151\u015f\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}