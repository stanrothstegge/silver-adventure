// Generated from C:/Users/Robin/Documents/School/Jaar 2/Kwartiel 3/Compilers/ProgrammeerTaal/src\alpha.g4 by ANTLR 4.6
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
		IF=36, ELSEIF=37, ELSE=38, WHILE=39, COFFEE=40, THIS=41, GLOBAL_TYPE=42, 
		PRINT=43, READ=44, RETURN=45, START=46, END=47, NUMBER=48, CHAR_TYPE=49, 
		TEXT=50, STRING_TYPE=51, TAB=52, COMMENT=53, LINE_COMMENT=54, NEWLINE=55;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"INTEGER", "DOUBLE", "STRING", "CHAR", "BOOLEAN", "TRUE", "FALSE", "PLUS", 
		"MINUS", "MULTIPLY", "DIVIDE", "MODULO", "LBRACKET", "RBRACKET", "SMALLERTHAN", 
		"GREATERTHAN", "EQUALTO", "NOTEQUALTO", "SMALLEROREQUAL", "GREATEROREQUAL", 
		"OR", "AND", "NOT", "TRY", "CATCH", "THROW", "IF", "ELSEIF", "ELSE", "WHILE", 
		"COFFEE", "THIS", "GLOBAL_TYPE", "PRINT", "READ", "RETURN", "START", "END", 
		"DIGITS", "INTEGER_TYPE", "NUMBER", "CHAR_TYPE", "TEXT", "STRING_TYPE", 
		"TAB", "COMMENT", "LINE_COMMENT", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'\\+'", "' '", "' = '", "';'", "', '", "'~'", "'~ '", "'++'", 
		"'in'", "'do'", "'st'", "'ch'", "'bo'", "'tr'", "'fs'", "' + '", "' - '", 
		"' * '", "' / '", "' % '", "'('", "')'", "' < '", "' > '", "' == '", "' != '", 
		"' <= '", "' >= '", "' || '", "' && '", "'! '", "'ty'", "'ca'", "'th'", 
		"'if'", "'ef'", "'el'", "'wh'", null, "'gl'", null, "'sp'", "'he'", "'re'", 
		"'Alpha'", "'Omega'", null, null, null, null, null, null, null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "INTEGER", 
		"DOUBLE", "STRING", "CHAR", "BOOLEAN", "TRUE", "FALSE", "PLUS", "MINUS", 
		"MULTIPLY", "DIVIDE", "MODULO", "LBRACKET", "RBRACKET", "SMALLERTHAN", 
		"GREATERTHAN", "EQUALTO", "NOTEQUALTO", "SMALLEROREQUAL", "GREATEROREQUAL", 
		"OR", "AND", "NOT", "TRY", "CATCH", "THROW", "IF", "ELSEIF", "ELSE", "WHILE", 
		"COFFEE", "THIS", "GLOBAL_TYPE", "PRINT", "READ", "RETURN", "START", "END", 
		"NUMBER", "CHAR_TYPE", "TEXT", "STRING_TYPE", "TAB", "COMMENT", "LINE_COMMENT", 
		"NEWLINE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\29\u0173\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3"+
		")\3)\3)\3)\5)\u00fd\n)\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3"+
		".\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\7\62\u011f\n\62\f\62\16\62\u0122\13\62\3\62\5\62\u0125\n\62\3\63\3\63"+
		"\3\63\6\63\u012a\n\63\r\63\16\63\u012b\5\63\u012e\n\63\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\5\65\u0136\n\65\3\65\5\65\u0139\n\65\3\65\5\65\u013c\n"+
		"\65\3\65\5\65\u013f\n\65\3\66\3\66\5\66\u0143\n\66\3\66\5\66\u0146\n\66"+
		"\3\66\5\66\u0149\n\66\3\66\5\66\u014c\n\66\3\66\5\66\u014f\n\66\3\66\3"+
		"\66\3\67\3\67\3\67\3\67\38\38\38\38\78\u015b\n8\f8\168\u015e\138\38\3"+
		"8\38\38\38\39\39\39\39\79\u0169\n9\f9\169\u016c\139\39\39\3:\3:\3:\3:"+
		"\3\u015c\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\2c\2e\62g\63i\64"+
		"k\65m\66o\67q8s9\3\2\7\3\2\62;\3\2\63;\5\2C\\aac|\6\2\62;C\\aac|\4\2\f"+
		"\f\17\17\u0180\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5w\3\2\2\2\7z\3\2\2\2\t|\3\2\2"+
		"\2\13\u0080\3\2\2\2\r\u0082\3\2\2\2\17\u0085\3\2\2\2\21\u0087\3\2\2\2"+
		"\23\u008a\3\2\2\2\25\u008d\3\2\2\2\27\u0090\3\2\2\2\31\u0093\3\2\2\2\33"+
		"\u0096\3\2\2\2\35\u0099\3\2\2\2\37\u009c\3\2\2\2!\u009f\3\2\2\2#\u00a2"+
		"\3\2\2\2%\u00a6\3\2\2\2\'\u00aa\3\2\2\2)\u00ae\3\2\2\2+\u00b2\3\2\2\2"+
		"-\u00b6\3\2\2\2/\u00b8\3\2\2\2\61\u00ba\3\2\2\2\63\u00be\3\2\2\2\65\u00c2"+
		"\3\2\2\2\67\u00c7\3\2\2\29\u00cc\3\2\2\2;\u00d1\3\2\2\2=\u00d6\3\2\2\2"+
		"?\u00db\3\2\2\2A\u00e0\3\2\2\2C\u00e3\3\2\2\2E\u00e6\3\2\2\2G\u00e9\3"+
		"\2\2\2I\u00ec\3\2\2\2K\u00ef\3\2\2\2M\u00f2\3\2\2\2O\u00f5\3\2\2\2Q\u00fc"+
		"\3\2\2\2S\u00fe\3\2\2\2U\u0101\3\2\2\2W\u0105\3\2\2\2Y\u0108\3\2\2\2["+
		"\u010b\3\2\2\2]\u010e\3\2\2\2_\u0114\3\2\2\2a\u011a\3\2\2\2c\u0124\3\2"+
		"\2\2e\u0126\3\2\2\2g\u012f\3\2\2\2i\u0133\3\2\2\2k\u0140\3\2\2\2m\u0152"+
		"\3\2\2\2o\u0156\3\2\2\2q\u0164\3\2\2\2s\u016f\3\2\2\2uv\7/\2\2v\4\3\2"+
		"\2\2wx\7^\2\2xy\7-\2\2y\6\3\2\2\2z{\7\"\2\2{\b\3\2\2\2|}\7\"\2\2}~\7?"+
		"\2\2~\177\7\"\2\2\177\n\3\2\2\2\u0080\u0081\7=\2\2\u0081\f\3\2\2\2\u0082"+
		"\u0083\7.\2\2\u0083\u0084\7\"\2\2\u0084\16\3\2\2\2\u0085\u0086\7\u0080"+
		"\2\2\u0086\20\3\2\2\2\u0087\u0088\7\u0080\2\2\u0088\u0089\7\"\2\2\u0089"+
		"\22\3\2\2\2\u008a\u008b\7-\2\2\u008b\u008c\7-\2\2\u008c\24\3\2\2\2\u008d"+
		"\u008e\7k\2\2\u008e\u008f\7p\2\2\u008f\26\3\2\2\2\u0090\u0091\7f\2\2\u0091"+
		"\u0092\7q\2\2\u0092\30\3\2\2\2\u0093\u0094\7u\2\2\u0094\u0095\7v\2\2\u0095"+
		"\32\3\2\2\2\u0096\u0097\7e\2\2\u0097\u0098\7j\2\2\u0098\34\3\2\2\2\u0099"+
		"\u009a\7d\2\2\u009a\u009b\7q\2\2\u009b\36\3\2\2\2\u009c\u009d\7v\2\2\u009d"+
		"\u009e\7t\2\2\u009e \3\2\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1\7u\2\2\u00a1"+
		"\"\3\2\2\2\u00a2\u00a3\7\"\2\2\u00a3\u00a4\7-\2\2\u00a4\u00a5\7\"\2\2"+
		"\u00a5$\3\2\2\2\u00a6\u00a7\7\"\2\2\u00a7\u00a8\7/\2\2\u00a8\u00a9\7\""+
		"\2\2\u00a9&\3\2\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\7,\2\2\u00ac\u00ad"+
		"\7\"\2\2\u00ad(\3\2\2\2\u00ae\u00af\7\"\2\2\u00af\u00b0\7\61\2\2\u00b0"+
		"\u00b1\7\"\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4\7\'\2\2"+
		"\u00b4\u00b5\7\"\2\2\u00b5,\3\2\2\2\u00b6\u00b7\7*\2\2\u00b7.\3\2\2\2"+
		"\u00b8\u00b9\7+\2\2\u00b9\60\3\2\2\2\u00ba\u00bb\7\"\2\2\u00bb\u00bc\7"+
		">\2\2\u00bc\u00bd\7\"\2\2\u00bd\62\3\2\2\2\u00be\u00bf\7\"\2\2\u00bf\u00c0"+
		"\7@\2\2\u00c0\u00c1\7\"\2\2\u00c1\64\3\2\2\2\u00c2\u00c3\7\"\2\2\u00c3"+
		"\u00c4\7?\2\2\u00c4\u00c5\7?\2\2\u00c5\u00c6\7\"\2\2\u00c6\66\3\2\2\2"+
		"\u00c7\u00c8\7\"\2\2\u00c8\u00c9\7#\2\2\u00c9\u00ca\7?\2\2\u00ca\u00cb"+
		"\7\"\2\2\u00cb8\3\2\2\2\u00cc\u00cd\7\"\2\2\u00cd\u00ce\7>\2\2\u00ce\u00cf"+
		"\7?\2\2\u00cf\u00d0\7\"\2\2\u00d0:\3\2\2\2\u00d1\u00d2\7\"\2\2\u00d2\u00d3"+
		"\7@\2\2\u00d3\u00d4\7?\2\2\u00d4\u00d5\7\"\2\2\u00d5<\3\2\2\2\u00d6\u00d7"+
		"\7\"\2\2\u00d7\u00d8\7~\2\2\u00d8\u00d9\7~\2\2\u00d9\u00da\7\"\2\2\u00da"+
		">\3\2\2\2\u00db\u00dc\7\"\2\2\u00dc\u00dd\7(\2\2\u00dd\u00de\7(\2\2\u00de"+
		"\u00df\7\"\2\2\u00df@\3\2\2\2\u00e0\u00e1\7#\2\2\u00e1\u00e2\7\"\2\2\u00e2"+
		"B\3\2\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7{\2\2\u00e5D\3\2\2\2\u00e6\u00e7"+
		"\7e\2\2\u00e7\u00e8\7c\2\2\u00e8F\3\2\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb"+
		"\7j\2\2\u00ebH\3\2\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7h\2\2\u00eeJ\3"+
		"\2\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7h\2\2\u00f1L\3\2\2\2\u00f2\u00f3"+
		"\7g\2\2\u00f3\u00f4\7n\2\2\u00f4N\3\2\2\2\u00f5\u00f6\7y\2\2\u00f6\u00f7"+
		"\7j\2\2\u00f7P\3\2\2\2\u00f8\u00f9\7\u00e4\2\2\u00f9\u00fa\7\u02de\2\2"+
		"\u00fa\u00fd\7\u2024\2\2\u00fb\u00fd\7\u2617\2\2\u00fc\u00f8\3\2\2\2\u00fc"+
		"\u00fb\3\2\2\2\u00fdR\3\2\2\2\u00fe\u00ff\7i\2\2\u00ff\u0100\7n\2\2\u0100"+
		"T\3\2\2\2\u0101\u0102\5S*\2\u0102\u0103\7\60\2\2\u0103\u0104\5i\65\2\u0104"+
		"V\3\2\2\2\u0105\u0106\7u\2\2\u0106\u0107\7r\2\2\u0107X\3\2\2\2\u0108\u0109"+
		"\7j\2\2\u0109\u010a\7g\2\2\u010aZ\3\2\2\2\u010b\u010c\7t\2\2\u010c\u010d"+
		"\7g\2\2\u010d\\\3\2\2\2\u010e\u010f\7C\2\2\u010f\u0110\7n\2\2\u0110\u0111"+
		"\7r\2\2\u0111\u0112\7j\2\2\u0112\u0113\7c\2\2\u0113^\3\2\2\2\u0114\u0115"+
		"\7Q\2\2\u0115\u0116\7o\2\2\u0116\u0117\7g\2\2\u0117\u0118\7i\2\2\u0118"+
		"\u0119\7c\2\2\u0119`\3\2\2\2\u011a\u011b\t\2\2\2\u011bb\3\2\2\2\u011c"+
		"\u0120\t\3\2\2\u011d\u011f\5a\61\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0125\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0123\u0125\7\62\2\2\u0124\u011c\3\2\2\2\u0124\u0123\3"+
		"\2\2\2\u0125d\3\2\2\2\u0126\u012d\5c\62\2\u0127\u0129\7\60\2\2\u0128\u012a"+
		"\5a\61\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u0127\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012ef\3\2\2\2\u012f\u0130\7)\2\2\u0130\u0131\13\2\2\2\u0131\u0132"+
		"\7)\2\2\u0132h\3\2\2\2\u0133\u0135\t\4\2\2\u0134\u0136\t\5\2\2\u0135\u0134"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0139\t\5\2\2\u0138"+
		"\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u013c\t\5"+
		"\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d"+
		"\u013f\t\5\2\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013fj\3\2\2\2"+
		"\u0140\u0142\7$\2\2\u0141\u0143\13\2\2\2\u0142\u0141\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0146\13\2\2\2\u0145\u0144\3\2\2\2"+
		"\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0149\13\2\2\2\u0148\u0147"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u014c\13\2\2\2"+
		"\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014f"+
		"\13\2\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2"+
		"\u0150\u0151\7$\2\2\u0151l\3\2\2\2\u0152\u0153\4\13\13\2\u0153\u0154\3"+
		"\2\2\2\u0154\u0155\b\67\2\2\u0155n\3\2\2\2\u0156\u0157\7\61\2\2\u0157"+
		"\u0158\7,\2\2\u0158\u015c\3\2\2\2\u0159\u015b\13\2\2\2\u015a\u0159\3\2"+
		"\2\2\u015b\u015e\3\2\2\2\u015c\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d"+
		"\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\7,\2\2\u0160\u0161\7\61"+
		"\2\2\u0161\u0162\3\2\2\2\u0162\u0163\b8\2\2\u0163p\3\2\2\2\u0164\u0165"+
		"\7\61\2\2\u0165\u0166\7\61\2\2\u0166\u016a\3\2\2\2\u0167\u0169\n\6\2\2"+
		"\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b"+
		"\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\b9\2\2\u016e"+
		"r\3\2\2\2\u016f\u0170\7\f\2\2\u0170\u0171\3\2\2\2\u0171\u0172\b:\2\2\u0172"+
		"t\3\2\2\2\23\2\u00fc\u0120\u0124\u012b\u012d\u0135\u0138\u013b\u013e\u0142"+
		"\u0145\u0148\u014b\u014e\u015c\u016a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}