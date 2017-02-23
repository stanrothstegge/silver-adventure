// Generated from E:/Dropbox/Saxion/Jaar 2/Kwartiel 3/Compilers & Operating Systems/Practicumopdracht1/src/main/antlr4\alpha.g4 by ANTLR 4.6
package main.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class alphaParser extends Parser {
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
	public static final int
		RULE_language = 0, RULE_expression = 1, RULE_declaration = 2, RULE_declarationFill = 3, 
		RULE_declarationFinal = 4, RULE_declarationFunction = 5, RULE_argumentsDeclaration = 6, 
		RULE_argumentsCall = 7, RULE_functionDeclaration = 8, RULE_functionCall = 9, 
		RULE_printFunction = 10, RULE_readFunction = 11, RULE_throwFunction = 12, 
		RULE_catchFunction = 13, RULE_globalStatements = 14, RULE_statement = 15, 
		RULE_returnMethod = 16, RULE_throwBlock = 17, RULE_function = 18, RULE_ifStatement = 19, 
		RULE_whileMethod = 20, RULE_dataType = 21, RULE_variable = 22;
	public static final String[] ruleNames = {
		"language", "expression", "declaration", "declarationFill", "declarationFinal", 
		"declarationFunction", "argumentsDeclaration", "argumentsCall", "functionDeclaration", 
		"functionCall", "printFunction", "readFunction", "throwFunction", "catchFunction", 
		"globalStatements", "statement", "returnMethod", "throwBlock", "function", 
		"ifStatement", "whileMethod", "dataType", "variable"
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

	@Override
	public String getGrammarFileName() { return "alpha.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public alphaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LanguageContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(alphaParser.START, 0); }
		public TerminalNode END() { return getToken(alphaParser.END, 0); }
		public List<GlobalStatementsContext> globalStatements() {
			return getRuleContexts(GlobalStatementsContext.class);
		}
		public GlobalStatementsContext globalStatements(int i) {
			return getRuleContext(GlobalStatementsContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public LanguageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_language; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitLanguage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LanguageContext language() throws RecognitionException {
		LanguageContext _localctx = new LanguageContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_language);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(START);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << GLOBAL_TYPE) | (1L << TEXT))) != 0)) {
				{
				setState(49);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER:
				case DOUBLE:
				case STRING:
				case CHAR:
				case BOOLEAN:
				case GLOBAL_TYPE:
				case TEXT:
					{
					setState(47);
					globalStatements();
					}
					break;
				case T__6:
					{
					setState(48);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(END);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LeftBracketExpressionRightBracketExpressionContext extends ExpressionContext {
		public TerminalNode LBRACKET() { return getToken(alphaParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(alphaParser.RBRACKET, 0); }
		public LeftBracketExpressionRightBracketExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitLeftBracketExpressionRightBracketExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(alphaParser.MINUS, 0); }
		public MinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddCustomExpressionContext extends ExpressionContext {
		public List<TerminalNode> NUMBER() { return getTokens(alphaParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(alphaParser.NUMBER, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> CHAR_TYPE() { return getTokens(alphaParser.CHAR_TYPE); }
		public TerminalNode CHAR_TYPE(int i) {
			return getToken(alphaParser.CHAR_TYPE, i);
		}
		public List<TerminalNode> STRING_TYPE() { return getTokens(alphaParser.STRING_TYPE); }
		public TerminalNode STRING_TYPE(int i) {
			return getToken(alphaParser.STRING_TYPE, i);
		}
		public AddCustomExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitAddCustomExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuloExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MODULO() { return getToken(alphaParser.MODULO, 0); }
		public ModuloExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitModuloExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExpressionContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(alphaParser.NUMBER, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(alphaParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseExpressionContext extends ExpressionContext {
		public TerminalNode FALSE() { return getToken(alphaParser.FALSE, 0); }
		public FalseExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitFalseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallerThanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SMALLERTHAN() { return getToken(alphaParser.SMALLERTHAN, 0); }
		public SmallerThanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitSmallerThanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QualeToEpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALTO() { return getToken(alphaParser.EQUALTO, 0); }
		public QualeToEpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitQualeToEpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(alphaParser.MULTIPLY, 0); }
		public MultiplyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitMultiplyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATERTHAN() { return getToken(alphaParser.GREATERTHAN, 0); }
		public GreaterThanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitGreaterThanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableExpressionContext extends ExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivideExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(alphaParser.DIVIDE, 0); }
		public DivideExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitDivideExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(alphaParser.OR, 0); }
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(alphaParser.AND, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode STRING_TYPE() { return getToken(alphaParser.STRING_TYPE, 0); }
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueExpressionContext extends ExpressionContext {
		public TerminalNode TRUE() { return getToken(alphaParser.TRUE, 0); }
		public TrueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitTrueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallerOrRequalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SMALLEROREQUAL() { return getToken(alphaParser.SMALLEROREQUAL, 0); }
		public SmallerOrRequalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitSmallerOrRequalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharExpressionContext extends ExpressionContext {
		public TerminalNode CHAR_TYPE() { return getToken(alphaParser.CHAR_TYPE, 0); }
		public CharExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitCharExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(alphaParser.PLUS, 0); }
		public PlusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitPlusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualToExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOTEQUALTO() { return getToken(alphaParser.NOTEQUALTO, 0); }
		public NotEqualToExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitNotEqualToExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreatOrRequalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATEROREQUAL() { return getToken(alphaParser.GREATEROREQUAL, 0); }
		public GreatOrRequalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitGreatOrRequalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(57);
				match(T__0);
				setState(58);
				expression(24);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(NOT);
				setState(60);
				expression(23);
				}
				break;
			case 3:
				{
				_localctx = new LeftBracketExpressionRightBracketExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(LBRACKET);
				setState(62);
				expression(0);
				setState(63);
				match(RBRACKET);
				}
				break;
			case 4:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(NUMBER);
				}
				break;
			case 5:
				{
				_localctx = new CharExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(CHAR_TYPE);
				}
				break;
			case 6:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(STRING_TYPE);
				}
				break;
			case 7:
				{
				_localctx = new TrueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(TRUE);
				}
				break;
			case 8:
				{
				_localctx = new FalseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(FALSE);
				}
				break;
			case 9:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				variable();
				}
				break;
			case 10:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				functionCall();
				}
				break;
			case 11:
				{
				_localctx = new AddCustomExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(T__1);
				setState(80); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(73);
						match(T__2);
						setState(78);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case NUMBER:
							{
							setState(74);
							match(NUMBER);
							}
							break;
						case GLOBAL_TYPE:
						case TEXT:
							{
							setState(75);
							variable();
							}
							break;
						case CHAR_TYPE:
							{
							setState(76);
							match(CHAR_TYPE);
							}
							break;
						case STRING_TYPE:
							{
							setState(77);
							match(STRING_TYPE);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(82); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(86);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(87);
						match(MULTIPLY);
						setState(88);
						expression(23);
						}
						break;
					case 2:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(89);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(90);
						match(DIVIDE);
						setState(91);
						expression(22);
						}
						break;
					case 3:
						{
						_localctx = new ModuloExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(92);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(93);
						match(MODULO);
						setState(94);
						expression(21);
						}
						break;
					case 4:
						{
						_localctx = new PlusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(95);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(96);
						match(PLUS);
						setState(97);
						expression(20);
						}
						break;
					case 5:
						{
						_localctx = new MinusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(98);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(99);
						match(MINUS);
						setState(100);
						expression(19);
						}
						break;
					case 6:
						{
						_localctx = new GreatOrRequalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(101);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(102);
						match(GREATEROREQUAL);
						setState(103);
						expression(18);
						}
						break;
					case 7:
						{
						_localctx = new SmallerOrRequalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(105);
						match(SMALLEROREQUAL);
						setState(106);
						expression(17);
						}
						break;
					case 8:
						{
						_localctx = new GreaterThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(107);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(108);
						match(GREATERTHAN);
						setState(109);
						expression(16);
						}
						break;
					case 9:
						{
						_localctx = new SmallerThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(111);
						match(SMALLERTHAN);
						setState(112);
						expression(15);
						}
						break;
					case 10:
						{
						_localctx = new QualeToEpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(113);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(114);
						match(EQUALTO);
						setState(115);
						expression(14);
						}
						break;
					case 11:
						{
						_localctx = new NotEqualToExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(117);
						match(NOTEQUALTO);
						setState(118);
						expression(13);
						}
						break;
					case 12:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(119);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(120);
						match(AND);
						setState(121);
						expression(12);
						}
						break;
					case 13:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(123);
						match(OR);
						setState(124);
						expression(11);
						}
						break;
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(alphaParser.TEXT, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			dataType();
			setState(131);
			match(T__2);
			setState(132);
			match(TEXT);
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

	public static class DeclarationFillContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationFillContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationFill; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitDeclarationFill(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationFillContext declarationFill() throws RecognitionException {
		DeclarationFillContext _localctx = new DeclarationFillContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarationFill);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case DOUBLE:
			case STRING:
			case CHAR:
			case BOOLEAN:
				{
				setState(134);
				declaration();
				}
				break;
			case GLOBAL_TYPE:
			case TEXT:
				{
				setState(135);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(138);
			match(T__3);
			{
			setState(139);
			expression(0);
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

	public static class DeclarationFinalContext extends ParserRuleContext {
		public DeclarationFillContext declarationFill() {
			return getRuleContext(DeclarationFillContext.class,0);
		}
		public DeclarationFinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationFinal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitDeclarationFinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationFinalContext declarationFinal() throws RecognitionException {
		DeclarationFinalContext _localctx = new DeclarationFinalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationFinal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			declarationFill();
			setState(142);
			match(T__4);
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

	public static class DeclarationFunctionContext extends ParserRuleContext {
		public DeclarationFillContext declarationFill() {
			return getRuleContext(DeclarationFillContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitDeclarationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationFunctionContext declarationFunction() throws RecognitionException {
		DeclarationFunctionContext _localctx = new DeclarationFunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declarationFunction);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				declarationFill();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				declaration();
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

	public static class ArgumentsDeclarationContext extends ParserRuleContext {
		public List<DeclarationFunctionContext> declarationFunction() {
			return getRuleContexts(DeclarationFunctionContext.class);
		}
		public DeclarationFunctionContext declarationFunction(int i) {
			return getRuleContext(DeclarationFunctionContext.class,i);
		}
		public ArgumentsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitArgumentsDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsDeclarationContext argumentsDeclaration() throws RecognitionException {
		ArgumentsDeclarationContext _localctx = new ArgumentsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argumentsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			declarationFunction();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(149);
				match(T__5);
				setState(150);
				declarationFunction();
				}
				}
				setState(155);
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

	public static class ArgumentsCallContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentsCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitArgumentsCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsCallContext argumentsCall() throws RecognitionException {
		ArgumentsCallContext _localctx = new ArgumentsCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argumentsCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(156);
			expression(0);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(157);
				match(T__5);
				{
				setState(158);
				expression(0);
				}
				}
				}
				setState(163);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(alphaParser.TEXT, 0); }
		public TerminalNode LBRACKET() { return getToken(alphaParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(alphaParser.RBRACKET, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public ArgumentsDeclarationContext argumentsDeclaration() {
			return getRuleContext(ArgumentsDeclarationContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__6);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN))) != 0)) {
				{
				setState(165);
				dataType();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(166);
					match(T__2);
					setState(167);
					dataType();
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				match(T__7);
				}
			}

			setState(177);
			match(TEXT);
			setState(178);
			match(T__2);
			setState(179);
			match(LBRACKET);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << GLOBAL_TYPE) | (1L << TEXT))) != 0)) {
				{
				setState(180);
				argumentsDeclaration();
				}
			}

			setState(183);
			match(RBRACKET);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(alphaParser.TEXT, 0); }
		public TerminalNode LBRACKET() { return getToken(alphaParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(alphaParser.RBRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(alphaParser.NUMBER, 0); }
		public ArgumentsCallContext argumentsCall() {
			return getRuleContext(ArgumentsCallContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(185);
				match(NUMBER);
				setState(186);
				match(MULTIPLY);
				}
			}

			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(191);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER:
				case DOUBLE:
				case STRING:
				case CHAR:
				case BOOLEAN:
					{
					setState(189);
					declaration();
					}
					break;
				case GLOBAL_TYPE:
				case TEXT:
					{
					setState(190);
					variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				{
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(193);
					match(T__5);
					setState(196);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INTEGER:
					case DOUBLE:
					case STRING:
					case CHAR:
					case BOOLEAN:
						{
						setState(194);
						declaration();
						}
						break;
					case GLOBAL_TYPE:
					case TEXT:
						{
						setState(195);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				match(T__3);
				}
				}
				break;
			}
			setState(207);
			match(TEXT);
			setState(208);
			match(T__2);
			setState(209);
			match(LBRACKET);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRUE) | (1L << FALSE) | (1L << LBRACKET) | (1L << NOT) | (1L << GLOBAL_TYPE) | (1L << NUMBER) | (1L << CHAR_TYPE) | (1L << TEXT) | (1L << STRING_TYPE))) != 0)) {
				{
				setState(210);
				argumentsCall();
				}
			}

			setState(213);
			match(RBRACKET);
			setState(214);
			match(T__4);
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

	public static class PrintFunctionContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(alphaParser.PRINT, 0); }
		public TerminalNode LBRACKET() { return getToken(alphaParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(alphaParser.RBRACKET, 0); }
		public PrintFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitPrintFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintFunctionContext printFunction() throws RecognitionException {
		PrintFunctionContext _localctx = new PrintFunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(PRINT);
			setState(217);
			match(T__2);
			setState(218);
			match(LBRACKET);
			setState(219);
			expression(0);
			setState(220);
			match(RBRACKET);
			setState(221);
			match(T__4);
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

	public static class ReadFunctionContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(alphaParser.READ, 0); }
		public TerminalNode LBRACKET() { return getToken(alphaParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(alphaParser.RBRACKET, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ReadFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitReadFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadFunctionContext readFunction() throws RecognitionException {
		ReadFunctionContext _localctx = new ReadFunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_readFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case DOUBLE:
			case STRING:
			case CHAR:
			case BOOLEAN:
				{
				setState(223);
				declaration();
				}
				break;
			case GLOBAL_TYPE:
			case TEXT:
				{
				setState(224);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(227);
			match(T__3);
			setState(228);
			match(READ);
			setState(229);
			match(T__2);
			setState(230);
			match(LBRACKET);
			setState(231);
			match(RBRACKET);
			setState(232);
			match(T__4);
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

	public static class ThrowFunctionContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(alphaParser.THROW, 0); }
		public TerminalNode LBRACKET() { return getToken(alphaParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(alphaParser.RBRACKET, 0); }
		public ThrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitThrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowFunctionContext throwFunction() throws RecognitionException {
		ThrowFunctionContext _localctx = new ThrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_throwFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(THROW);
			setState(235);
			match(T__2);
			setState(236);
			match(LBRACKET);
			setState(237);
			expression(0);
			setState(238);
			match(RBRACKET);
			setState(239);
			match(T__4);
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

	public static class CatchFunctionContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(alphaParser.CATCH, 0); }
		public TerminalNode LBRACKET() { return getToken(alphaParser.LBRACKET, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(alphaParser.RBRACKET, 0); }
		public CatchFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitCatchFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchFunctionContext catchFunction() throws RecognitionException {
		CatchFunctionContext _localctx = new CatchFunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_catchFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(CATCH);
			setState(242);
			match(T__2);
			setState(243);
			match(LBRACKET);
			setState(244);
			variable();
			setState(245);
			match(RBRACKET);
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

	public static class GlobalStatementsContext extends ParserRuleContext {
		public DeclarationFinalContext declarationFinal() {
			return getRuleContext(DeclarationFinalContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public GlobalStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStatements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitGlobalStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalStatementsContext globalStatements() throws RecognitionException {
		GlobalStatementsContext _localctx = new GlobalStatementsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_globalStatements);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				declarationFinal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				declaration();
				setState(249);
				match(T__4);
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

	public static class StatementContext extends ParserRuleContext {
		public GlobalStatementsContext globalStatements() {
			return getRuleContext(GlobalStatementsContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public PrintFunctionContext printFunction() {
			return getRuleContext(PrintFunctionContext.class,0);
		}
		public ReadFunctionContext readFunction() {
			return getRuleContext(ReadFunctionContext.class,0);
		}
		public ThrowBlockContext throwBlock() {
			return getRuleContext(ThrowBlockContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ReturnMethodContext returnMethod() {
			return getRuleContext(ReturnMethodContext.class,0);
		}
		public WhileMethodContext whileMethod() {
			return getRuleContext(WhileMethodContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(253);
				globalStatements();
				}
				break;
			case 2:
				{
				setState(254);
				match(T__8);
				{
				setState(255);
				variable();
				}
				setState(256);
				match(T__4);
				}
				break;
			case 3:
				{
				setState(258);
				functionCall();
				}
				break;
			case 4:
				{
				setState(259);
				printFunction();
				}
				break;
			case 5:
				{
				setState(260);
				readFunction();
				}
				break;
			case 6:
				{
				setState(261);
				throwBlock();
				}
				break;
			case 7:
				{
				setState(262);
				ifStatement();
				}
				break;
			case 8:
				{
				setState(263);
				returnMethod();
				}
				break;
			case 9:
				{
				setState(264);
				whileMethod();
				}
				break;
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

	public static class ReturnMethodContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(alphaParser.RETURN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ReturnMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnMethod; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitReturnMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnMethodContext returnMethod() throws RecognitionException {
		ReturnMethodContext _localctx = new ReturnMethodContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(RETURN);
			setState(268);
			match(T__2);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRUE) | (1L << FALSE) | (1L << LBRACKET) | (1L << NOT) | (1L << GLOBAL_TYPE) | (1L << NUMBER) | (1L << CHAR_TYPE) | (1L << TEXT) | (1L << STRING_TYPE))) != 0)) {
				{
				setState(269);
				expression(0);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(270);
					match(T__5);
					{
					setState(271);
					expression(0);
					}
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(279);
			match(T__4);
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

	public static class ThrowBlockContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(alphaParser.TRY, 0); }
		public ThrowFunctionContext throwFunction() {
			return getRuleContext(ThrowFunctionContext.class,0);
		}
		public CatchFunctionContext catchFunction() {
			return getRuleContext(CatchFunctionContext.class,0);
		}
		public TerminalNode COFFEE() { return getToken(alphaParser.COFFEE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ThrowBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitThrowBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowBlockContext throwBlock() throws RecognitionException {
		ThrowBlockContext _localctx = new ThrowBlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_throwBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(TRY);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << GLOBAL_TYPE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
				{
				{
				setState(282);
				statement();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			throwFunction();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << GLOBAL_TYPE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
				{
				{
				setState(289);
				statement();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			catchFunction();
			setState(297); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(296);
				statement();
				}
				}
				setState(299); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << GLOBAL_TYPE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0) );
			setState(301);
			match(COFFEE);
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public TerminalNode COFFEE() { return getToken(alphaParser.COFFEE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			functionDeclaration();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << GLOBAL_TYPE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
				{
				{
				setState(304);
				statement();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			match(COFFEE);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(alphaParser.IF, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(alphaParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(alphaParser.LBRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(alphaParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(alphaParser.RBRACKET, i);
		}
		public TerminalNode COFFEE() { return getToken(alphaParser.COFFEE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(alphaParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(alphaParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(alphaParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(IF);
			setState(313);
			match(T__2);
			setState(314);
			match(LBRACKET);
			setState(315);
			expression(0);
			setState(316);
			match(RBRACKET);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << GLOBAL_TYPE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
				{
				{
				setState(317);
				statement();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(323);
				match(ELSEIF);
				setState(324);
				match(T__2);
				setState(325);
				match(LBRACKET);
				setState(326);
				expression(0);
				setState(327);
				match(RBRACKET);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << GLOBAL_TYPE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
					{
					{
					setState(328);
					statement();
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(339);
				match(ELSE);
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << GLOBAL_TYPE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
					{
					{
					setState(340);
					statement();
					}
					}
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(348);
			match(COFFEE);
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

	public static class WhileMethodContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(alphaParser.WHILE, 0); }
		public TerminalNode LBRACKET() { return getToken(alphaParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(alphaParser.RBRACKET, 0); }
		public TerminalNode COFFEE() { return getToken(alphaParser.COFFEE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileMethod; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitWhileMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileMethodContext whileMethod() throws RecognitionException {
		WhileMethodContext _localctx = new WhileMethodContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whileMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(WHILE);
			setState(351);
			match(T__2);
			setState(352);
			match(LBRACKET);
			setState(353);
			expression(0);
			setState(354);
			match(RBRACKET);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << GLOBAL_TYPE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
				{
				{
				setState(355);
				statement();
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			match(COFFEE);
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

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(alphaParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(alphaParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(alphaParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(alphaParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(alphaParser.BOOLEAN, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN))) != 0)) ) {
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(alphaParser.TEXT, 0); }
		public TerminalNode GLOBAL_TYPE() { return getToken(alphaParser.GLOBAL_TYPE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_la = _input.LA(1);
			if ( !(_la==GLOBAL_TYPE || _la==TEXT) ) {
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
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 22);
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 13);
		case 10:
			return precpred(_ctx, 12);
		case 11:
			return precpred(_ctx, 11);
		case 12:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\39\u0172\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Q\n\3\6\3"+
		"S\n\3\r\3\16\3T\5\3W\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0080\n\3\f\3\16\3\u0083"+
		"\13\3\3\4\3\4\3\4\3\4\3\5\3\5\5\5\u008b\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\5\7\u0095\n\7\3\b\3\b\3\b\7\b\u009a\n\b\f\b\16\b\u009d\13\b\3\t"+
		"\3\t\3\t\7\t\u00a2\n\t\f\t\16\t\u00a5\13\t\3\n\3\n\3\n\3\n\7\n\u00ab\n"+
		"\n\f\n\16\n\u00ae\13\n\3\n\3\n\5\n\u00b2\n\n\3\n\3\n\3\n\3\n\5\n\u00b8"+
		"\n\n\3\n\3\n\3\13\3\13\5\13\u00be\n\13\3\13\3\13\5\13\u00c2\n\13\3\13"+
		"\3\13\3\13\5\13\u00c7\n\13\7\13\u00c9\n\13\f\13\16\13\u00cc\13\13\3\13"+
		"\3\13\5\13\u00d0\n\13\3\13\3\13\3\13\3\13\5\13\u00d6\n\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u00e4\n\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\5\20\u00fe\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u010c\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u0113\n\22\f\22\16\22\u0116\13\22\5\22\u0118\n\22\3\22\3\22"+
		"\3\23\3\23\7\23\u011e\n\23\f\23\16\23\u0121\13\23\3\23\3\23\7\23\u0125"+
		"\n\23\f\23\16\23\u0128\13\23\3\23\3\23\6\23\u012c\n\23\r\23\16\23\u012d"+
		"\3\23\3\23\3\24\3\24\7\24\u0134\n\24\f\24\16\24\u0137\13\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0141\n\25\f\25\16\25\u0144\13\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u014c\n\25\f\25\16\25\u014f\13\25"+
		"\7\25\u0151\n\25\f\25\16\25\u0154\13\25\3\25\3\25\7\25\u0158\n\25\f\25"+
		"\16\25\u015b\13\25\5\25\u015d\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u0167\n\26\f\26\16\26\u016a\13\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\2\3\4\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2"+
		"\4\3\2\f\20\4\2,,\64\64\u019a\2\60\3\2\2\2\4V\3\2\2\2\6\u0084\3\2\2\2"+
		"\b\u008a\3\2\2\2\n\u008f\3\2\2\2\f\u0094\3\2\2\2\16\u0096\3\2\2\2\20\u009e"+
		"\3\2\2\2\22\u00a6\3\2\2\2\24\u00bd\3\2\2\2\26\u00da\3\2\2\2\30\u00e3\3"+
		"\2\2\2\32\u00ec\3\2\2\2\34\u00f3\3\2\2\2\36\u00fd\3\2\2\2 \u010b\3\2\2"+
		"\2\"\u010d\3\2\2\2$\u011b\3\2\2\2&\u0131\3\2\2\2(\u013a\3\2\2\2*\u0160"+
		"\3\2\2\2,\u016d\3\2\2\2.\u016f\3\2\2\2\60\65\7\60\2\2\61\64\5\36\20\2"+
		"\62\64\5&\24\2\63\61\3\2\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2"+
		"\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\61\2\29\3\3\2\2\2:;\b\3\1"+
		"\2;<\7\3\2\2<W\5\4\3\32=>\7\"\2\2>W\5\4\3\31?@\7\30\2\2@A\5\4\3\2AB\7"+
		"\31\2\2BW\3\2\2\2CW\7\62\2\2DW\7\63\2\2EW\7\65\2\2FW\7\21\2\2GW\7\22\2"+
		"\2HW\5.\30\2IW\5\24\13\2JR\7\4\2\2KP\7\5\2\2LQ\7\62\2\2MQ\5.\30\2NQ\7"+
		"\63\2\2OQ\7\65\2\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2QS\3\2\2\2R"+
		"K\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2V:\3\2\2\2V=\3\2\2\2"+
		"V?\3\2\2\2VC\3\2\2\2VD\3\2\2\2VE\3\2\2\2VF\3\2\2\2VG\3\2\2\2VH\3\2\2\2"+
		"VI\3\2\2\2VJ\3\2\2\2W\u0081\3\2\2\2XY\f\30\2\2YZ\7\25\2\2Z\u0080\5\4\3"+
		"\31[\\\f\27\2\2\\]\7\26\2\2]\u0080\5\4\3\30^_\f\26\2\2_`\7\27\2\2`\u0080"+
		"\5\4\3\27ab\f\25\2\2bc\7\23\2\2c\u0080\5\4\3\26de\f\24\2\2ef\7\24\2\2"+
		"f\u0080\5\4\3\25gh\f\23\2\2hi\7\37\2\2i\u0080\5\4\3\24jk\f\22\2\2kl\7"+
		"\36\2\2l\u0080\5\4\3\23mn\f\21\2\2no\7\33\2\2o\u0080\5\4\3\22pq\f\20\2"+
		"\2qr\7\32\2\2r\u0080\5\4\3\21st\f\17\2\2tu\7\34\2\2u\u0080\5\4\3\20vw"+
		"\f\16\2\2wx\7\35\2\2x\u0080\5\4\3\17yz\f\r\2\2z{\7!\2\2{\u0080\5\4\3\16"+
		"|}\f\f\2\2}~\7 \2\2~\u0080\5\4\3\r\177X\3\2\2\2\177[\3\2\2\2\177^\3\2"+
		"\2\2\177a\3\2\2\2\177d\3\2\2\2\177g\3\2\2\2\177j\3\2\2\2\177m\3\2\2\2"+
		"\177p\3\2\2\2\177s\3\2\2\2\177v\3\2\2\2\177y\3\2\2\2\177|\3\2\2\2\u0080"+
		"\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\5\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\5,\27\2\u0085\u0086\7\5\2\2\u0086\u0087\7\64"+
		"\2\2\u0087\7\3\2\2\2\u0088\u008b\5\6\4\2\u0089\u008b\5.\30\2\u008a\u0088"+
		"\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\6\2\2\u008d"+
		"\u008e\5\4\3\2\u008e\t\3\2\2\2\u008f\u0090\5\b\5\2\u0090\u0091\7\7\2\2"+
		"\u0091\13\3\2\2\2\u0092\u0095\5\b\5\2\u0093\u0095\5\6\4\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0093\3\2\2\2\u0095\r\3\2\2\2\u0096\u009b\5\f\7\2\u0097"+
		"\u0098\7\b\2\2\u0098\u009a\5\f\7\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\17\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u00a3\5\4\3\2\u009f\u00a0\7\b\2\2\u00a0\u00a2\5\4\3\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\21\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00b1\7\t\2\2\u00a7\u00ac"+
		"\5,\27\2\u00a8\u00a9\7\5\2\2\u00a9\u00ab\5,\27\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\n\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00a7\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\64"+
		"\2\2\u00b4\u00b5\7\5\2\2\u00b5\u00b7\7\30\2\2\u00b6\u00b8\5\16\b\2\u00b7"+
		"\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\31"+
		"\2\2\u00ba\23\3\2\2\2\u00bb\u00bc\7\62\2\2\u00bc\u00be\7\25\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00cf\3\2\2\2\u00bf\u00c2\5\6"+
		"\4\2\u00c0\u00c2\5.\30\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\u00ca\3\2\2\2\u00c3\u00c6\7\b\2\2\u00c4\u00c7\5\6\4\2\u00c5\u00c7\5."+
		"\30\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c3\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\6\2\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00c1\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d2\7\64\2\2\u00d2\u00d3\7\5\2\2\u00d3\u00d5\7\30\2\2\u00d4"+
		"\u00d6\5\20\t\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3"+
		"\2\2\2\u00d7\u00d8\7\31\2\2\u00d8\u00d9\7\7\2\2\u00d9\25\3\2\2\2\u00da"+
		"\u00db\7-\2\2\u00db\u00dc\7\5\2\2\u00dc\u00dd\7\30\2\2\u00dd\u00de\5\4"+
		"\3\2\u00de\u00df\7\31\2\2\u00df\u00e0\7\7\2\2\u00e0\27\3\2\2\2\u00e1\u00e4"+
		"\5\6\4\2\u00e2\u00e4\5.\30\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\7\6\2\2\u00e6\u00e7\7.\2\2\u00e7\u00e8\7\5"+
		"\2\2\u00e8\u00e9\7\30\2\2\u00e9\u00ea\7\31\2\2\u00ea\u00eb\7\7\2\2\u00eb"+
		"\31\3\2\2\2\u00ec\u00ed\7%\2\2\u00ed\u00ee\7\5\2\2\u00ee\u00ef\7\30\2"+
		"\2\u00ef\u00f0\5\4\3\2\u00f0\u00f1\7\31\2\2\u00f1\u00f2\7\7\2\2\u00f2"+
		"\33\3\2\2\2\u00f3\u00f4\7$\2\2\u00f4\u00f5\7\5\2\2\u00f5\u00f6\7\30\2"+
		"\2\u00f6\u00f7\5.\30\2\u00f7\u00f8\7\31\2\2\u00f8\35\3\2\2\2\u00f9\u00fe"+
		"\5\n\6\2\u00fa\u00fb\5\6\4\2\u00fb\u00fc\7\7\2\2\u00fc\u00fe\3\2\2\2\u00fd"+
		"\u00f9\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fe\37\3\2\2\2\u00ff\u010c\5\36\20"+
		"\2\u0100\u0101\7\13\2\2\u0101\u0102\5.\30\2\u0102\u0103\7\7\2\2\u0103"+
		"\u010c\3\2\2\2\u0104\u010c\5\24\13\2\u0105\u010c\5\26\f\2\u0106\u010c"+
		"\5\30\r\2\u0107\u010c\5$\23\2\u0108\u010c\5(\25\2\u0109\u010c\5\"\22\2"+
		"\u010a\u010c\5*\26\2\u010b\u00ff\3\2\2\2\u010b\u0100\3\2\2\2\u010b\u0104"+
		"\3\2\2\2\u010b\u0105\3\2\2\2\u010b\u0106\3\2\2\2\u010b\u0107\3\2\2\2\u010b"+
		"\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c!\3\2\2\2"+
		"\u010d\u010e\7/\2\2\u010e\u0117\7\5\2\2\u010f\u0114\5\4\3\2\u0110\u0111"+
		"\7\b\2\2\u0111\u0113\5\4\3\2\u0112\u0110\3\2\2\2\u0113\u0116\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0117\u010f\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\7\7\2\2\u011a#\3\2\2\2\u011b\u011f\7#\2\2\u011c\u011e\5 \21\2\u011d"+
		"\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0126\5\32\16\2\u0123"+
		"\u0125\5 \21\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129"+
		"\u012b\5\34\17\2\u012a\u012c\5 \21\2\u012b\u012a\3\2\2\2\u012c\u012d\3"+
		"\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0130\7*\2\2\u0130%\3\2\2\2\u0131\u0135\5\22\n\2\u0132\u0134\5 \21\2"+
		"\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7*\2\2\u0139"+
		"\'\3\2\2\2\u013a\u013b\7&\2\2\u013b\u013c\7\5\2\2\u013c\u013d\7\30\2\2"+
		"\u013d\u013e\5\4\3\2\u013e\u0142\7\31\2\2\u013f\u0141\5 \21\2\u0140\u013f"+
		"\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0152\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7\'\2\2\u0146\u0147\7\5"+
		"\2\2\u0147\u0148\7\30\2\2\u0148\u0149\5\4\3\2\u0149\u014d\7\31\2\2\u014a"+
		"\u014c\5 \21\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u0150"+
		"\u0145\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\u015c\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0159\7(\2\2\u0156"+
		"\u0158\5 \21\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u0159\u015a\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u0155\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\7*"+
		"\2\2\u015f)\3\2\2\2\u0160\u0161\7)\2\2\u0161\u0162\7\5\2\2\u0162\u0163"+
		"\7\30\2\2\u0163\u0164\5\4\3\2\u0164\u0168\7\31\2\2\u0165\u0167\5 \21\2"+
		"\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169"+
		"\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\7*\2\2\u016c"+
		"+\3\2\2\2\u016d\u016e\t\2\2\2\u016e-\3\2\2\2\u016f\u0170\t\3\2\2\u0170"+
		"/\3\2\2\2%\63\65PTV\177\u0081\u008a\u0094\u009b\u00a3\u00ac\u00b1\u00b7"+
		"\u00bd\u00c1\u00c6\u00ca\u00cf\u00d5\u00e3\u00fd\u010b\u0114\u0117\u011f"+
		"\u0126\u012d\u0135\u0142\u014d\u0152\u0159\u015c\u0168";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}