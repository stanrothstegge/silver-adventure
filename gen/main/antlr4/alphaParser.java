// Generated from E:/Dropbox/Saxion/Jaar 2/Kwartiel 3/Compilers & Operating Systems/Practitum/src/main/antlr4\alpha.g4 by ANTLR 4.6
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
		IF=36, ELSEIF=37, ELSE=38, WHILE=39, COFFEE=40, PRINT=41, READ=42, RETURN=43, 
		START=44, END=45, NUMBER=46, CHAR_TYPE=47, TEXT=48, STRING_TYPE=49, TAB=50, 
		COMMENT=51, LINE_COMMENT=52, NEWLINE=53;
	public static final int
		RULE_language = 0, RULE_expression = 1, RULE_declaration = 2, RULE_declarationFill = 3, 
		RULE_declarationFinal = 4, RULE_declarationFunction = 5, RULE_argumentsDeclaration = 6, 
		RULE_argumentsCall = 7, RULE_functionDeclaration = 8, RULE_functionCall = 9, 
		RULE_printFunction = 10, RULE_readFunction = 11, RULE_throwFunction = 12, 
		RULE_catchFunction = 13, RULE_globalStatements = 14, RULE_declarationStatement = 15, 
		RULE_statement = 16, RULE_returnMethod = 17, RULE_throwBlock = 18, RULE_function = 19, 
		RULE_ifStatement = 20, RULE_whileMethod = 21, RULE_dataType = 22, RULE_variable = 23;
	public static final String[] ruleNames = {
		"language", "expression", "declaration", "declarationFill", "declarationFinal", 
		"declarationFunction", "argumentsDeclaration", "argumentsCall", "functionDeclaration", 
		"functionCall", "printFunction", "readFunction", "throwFunction", "catchFunction", 
		"globalStatements", "declarationStatement", "statement", "returnMethod", 
		"throwBlock", "function", "ifStatement", "whileMethod", "dataType", "variable"
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
			setState(48);
			match(START);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TEXT))) != 0)) {
				{
				setState(51);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER:
				case DOUBLE:
				case STRING:
				case CHAR:
				case BOOLEAN:
				case TEXT:
					{
					setState(49);
					globalStatements();
					}
					break;
				case T__6:
					{
					setState(50);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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
	public static class EqualToExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALTO() { return getToken(alphaParser.EQUALTO, 0); }
		public EqualToExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitEqualToExpression(this);
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
	public static class SmallerOrEqualExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SMALLEROREQUAL() { return getToken(alphaParser.SMALLEROREQUAL, 0); }
		public SmallerOrEqualExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitSmallerOrEqualExpression(this);
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
	public static class GreaterOrEqualExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATEROREQUAL() { return getToken(alphaParser.GREATEROREQUAL, 0); }
		public GreaterOrEqualExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitGreaterOrEqualExpression(this);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(59);
				match(T__0);
				setState(60);
				expression(24);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(NOT);
				setState(62);
				expression(23);
				}
				break;
			case 3:
				{
				_localctx = new LeftBracketExpressionRightBracketExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				match(LBRACKET);
				setState(64);
				expression(0);
				setState(65);
				match(RBRACKET);
				}
				break;
			case 4:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(NUMBER);
				}
				break;
			case 5:
				{
				_localctx = new CharExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(CHAR_TYPE);
				}
				break;
			case 6:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(STRING_TYPE);
				}
				break;
			case 7:
				{
				_localctx = new TrueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(TRUE);
				}
				break;
			case 8:
				{
				_localctx = new FalseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(FALSE);
				}
				break;
			case 9:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				variable();
				}
				break;
			case 10:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				functionCall();
				}
				break;
			case 11:
				{
				_localctx = new AddCustomExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(T__1);
				setState(82); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(75);
						match(T__2);
						setState(80);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case NUMBER:
							{
							setState(76);
							match(NUMBER);
							}
							break;
						case TEXT:
							{
							setState(77);
							variable();
							}
							break;
						case CHAR_TYPE:
							{
							setState(78);
							match(CHAR_TYPE);
							}
							break;
						case STRING_TYPE:
							{
							setState(79);
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
					setState(84); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(127);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(89);
						match(MULTIPLY);
						setState(90);
						expression(23);
						}
						break;
					case 2:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(91);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(92);
						match(DIVIDE);
						setState(93);
						expression(22);
						}
						break;
					case 3:
						{
						_localctx = new ModuloExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(94);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(95);
						match(MODULO);
						setState(96);
						expression(21);
						}
						break;
					case 4:
						{
						_localctx = new PlusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(97);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(98);
						match(PLUS);
						setState(99);
						expression(20);
						}
						break;
					case 5:
						{
						_localctx = new MinusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(100);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(101);
						match(MINUS);
						setState(102);
						expression(19);
						}
						break;
					case 6:
						{
						_localctx = new GreaterOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(103);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(104);
						match(GREATEROREQUAL);
						setState(105);
						expression(18);
						}
						break;
					case 7:
						{
						_localctx = new SmallerOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(107);
						match(SMALLEROREQUAL);
						setState(108);
						expression(17);
						}
						break;
					case 8:
						{
						_localctx = new GreaterThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(109);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(110);
						match(GREATERTHAN);
						setState(111);
						expression(16);
						}
						break;
					case 9:
						{
						_localctx = new SmallerThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(112);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(113);
						match(SMALLERTHAN);
						setState(114);
						expression(15);
						}
						break;
					case 10:
						{
						_localctx = new EqualToExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(115);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(116);
						match(EQUALTO);
						setState(117);
						expression(14);
						}
						break;
					case 11:
						{
						_localctx = new NotEqualToExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(119);
						match(NOTEQUALTO);
						setState(120);
						expression(13);
						}
						break;
					case 12:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(121);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(122);
						match(AND);
						setState(123);
						expression(12);
						}
						break;
					case 13:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(124);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(125);
						match(OR);
						setState(126);
						expression(11);
						}
						break;
					}
					} 
				}
				setState(131);
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
			setState(132);
			dataType();
			setState(133);
			match(T__2);
			setState(134);
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
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case DOUBLE:
			case STRING:
			case CHAR:
			case BOOLEAN:
				{
				setState(136);
				declaration();
				}
				break;
			case TEXT:
				{
				setState(137);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(140);
			match(T__3);
			{
			setState(141);
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
			setState(143);
			declarationFill();
			setState(144);
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
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				declarationFill();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
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
			setState(150);
			declarationFunction();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(151);
				match(T__5);
				setState(152);
				declarationFunction();
				}
				}
				setState(157);
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
			setState(158);
			expression(0);
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(159);
				match(T__5);
				{
				setState(160);
				expression(0);
				}
				}
				}
				setState(165);
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
			setState(166);
			match(T__6);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN))) != 0)) {
				{
				setState(167);
				dataType();
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(168);
					match(T__2);
					setState(169);
					dataType();
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				match(T__7);
				}
			}

			setState(179);
			match(TEXT);
			setState(180);
			match(T__2);
			setState(181);
			match(LBRACKET);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TEXT))) != 0)) {
				{
				setState(182);
				argumentsDeclaration();
				}
			}

			setState(185);
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
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(187);
				match(NUMBER);
				setState(188);
				match(MULTIPLY);
				}
			}

			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(193);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER:
				case DOUBLE:
				case STRING:
				case CHAR:
				case BOOLEAN:
					{
					setState(191);
					declaration();
					}
					break;
				case TEXT:
					{
					setState(192);
					variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				{
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(195);
					match(T__5);
					setState(198);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INTEGER:
					case DOUBLE:
					case STRING:
					case CHAR:
					case BOOLEAN:
						{
						setState(196);
						declaration();
						}
						break;
					case TEXT:
						{
						setState(197);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				match(T__3);
				}
				}
				break;
			}
			setState(209);
			match(TEXT);
			setState(210);
			match(T__2);
			setState(211);
			match(LBRACKET);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRUE) | (1L << FALSE) | (1L << LBRACKET) | (1L << NOT) | (1L << NUMBER) | (1L << CHAR_TYPE) | (1L << TEXT) | (1L << STRING_TYPE))) != 0)) {
				{
				setState(212);
				argumentsCall();
				}
			}

			setState(215);
			match(RBRACKET);
			setState(216);
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
			setState(218);
			match(PRINT);
			setState(219);
			match(T__2);
			setState(220);
			match(LBRACKET);
			setState(221);
			expression(0);
			setState(222);
			match(RBRACKET);
			setState(223);
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
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case DOUBLE:
			case STRING:
			case CHAR:
			case BOOLEAN:
				{
				setState(225);
				declaration();
				}
				break;
			case TEXT:
				{
				setState(226);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(229);
			match(T__3);
			setState(230);
			match(READ);
			setState(231);
			match(T__2);
			setState(232);
			match(LBRACKET);
			setState(233);
			match(RBRACKET);
			setState(234);
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
			setState(236);
			match(THROW);
			setState(237);
			match(T__2);
			setState(238);
			match(LBRACKET);
			setState(239);
			expression(0);
			setState(240);
			match(RBRACKET);
			setState(241);
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
			setState(243);
			match(CATCH);
			setState(244);
			match(T__2);
			setState(245);
			match(LBRACKET);
			setState(246);
			variable();
			setState(247);
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
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				declarationFinal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				declaration();
				setState(251);
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

	public static class DeclarationStatementContext extends ParserRuleContext {
		public DeclarationFinalContext declarationFinal() {
			return getRuleContext(DeclarationFinalContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declarationStatement);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				declarationFinal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				declaration();
				setState(257);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStatementContext extends StatementContext {
		public PrintFunctionContext printFunction() {
			return getRuleContext(PrintFunctionContext.class,0);
		}
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementStatementContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStatementStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitIfStatementStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileMethodStatementContext extends StatementContext {
		public WhileMethodContext whileMethod() {
			return getRuleContext(WhileMethodContext.class,0);
		}
		public WhileMethodStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitWhileMethodStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarationStatementStatementContext extends StatementContext {
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public DeclarationStatementStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitDeclarationStatementStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnMethodStatementContext extends StatementContext {
		public ReturnMethodContext returnMethod() {
			return getRuleContext(ReturnMethodContext.class,0);
		}
		public ReturnMethodStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitReturnMethodStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallStatementContext extends StatementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitFunctionCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadStatementContext extends StatementContext {
		public ReadFunctionContext readFunction() {
			return getRuleContext(ReadFunctionContext.class,0);
		}
		public ReadStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitReadStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThrowBlockStatementContext extends StatementContext {
		public ThrowBlockContext throwBlock() {
			return getRuleContext(ThrowBlockContext.class,0);
		}
		public ThrowBlockStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitThrowBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusPlusStatementContext extends StatementContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PlusPlusStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitPlusPlusStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new DeclarationStatementStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				declarationStatement();
				}
				break;
			case 2:
				_localctx = new PlusPlusStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(T__8);
				{
				setState(263);
				variable();
				}
				setState(264);
				match(T__4);
				}
				break;
			case 3:
				_localctx = new FunctionCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				functionCall();
				}
				break;
			case 4:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				printFunction();
				}
				break;
			case 5:
				_localctx = new ReadStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				readFunction();
				}
				break;
			case 6:
				_localctx = new ThrowBlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				throwBlock();
				}
				break;
			case 7:
				_localctx = new IfStatementStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(270);
				ifStatement();
				}
				break;
			case 8:
				_localctx = new ReturnMethodStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(271);
				returnMethod();
				}
				break;
			case 9:
				_localctx = new WhileMethodStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(272);
				whileMethod();
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
		enterRule(_localctx, 34, RULE_returnMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(RETURN);
			setState(276);
			match(T__2);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRUE) | (1L << FALSE) | (1L << LBRACKET) | (1L << NOT) | (1L << NUMBER) | (1L << CHAR_TYPE) | (1L << TEXT) | (1L << STRING_TYPE))) != 0)) {
				{
				setState(277);
				expression(0);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(278);
					match(T__5);
					{
					setState(279);
					expression(0);
					}
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(287);
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
		enterRule(_localctx, 36, RULE_throwBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(TRY);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
				{
				{
				setState(290);
				statement();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			throwFunction();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
				{
				{
				setState(297);
				statement();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			catchFunction();
			setState(305); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(304);
				statement();
				}
				}
				setState(307); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0) );
			setState(309);
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
		enterRule(_localctx, 38, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			functionDeclaration();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
				{
				{
				setState(312);
				statement();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318);
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
		enterRule(_localctx, 40, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(IF);
			setState(321);
			match(T__2);
			setState(322);
			match(LBRACKET);
			setState(323);
			expression(0);
			setState(324);
			match(RBRACKET);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
				{
				{
				setState(325);
				statement();
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(331);
				match(ELSEIF);
				setState(332);
				match(T__2);
				setState(333);
				match(LBRACKET);
				setState(334);
				expression(0);
				setState(335);
				match(RBRACKET);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
					{
					{
					setState(336);
					statement();
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(347);
				match(ELSE);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
					{
					{
					setState(348);
					statement();
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(356);
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
		enterRule(_localctx, 42, RULE_whileMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(WHILE);
			setState(359);
			match(T__2);
			setState(360);
			match(LBRACKET);
			setState(361);
			expression(0);
			setState(362);
			match(RBRACKET);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
				{
				{
				setState(363);
				statement();
				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(369);
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
		enterRule(_localctx, 44, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
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
		enterRule(_localctx, 46, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u017a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3S"+
		"\n\3\6\3U\n\3\r\3\16\3V\5\3Y\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0082\n\3\f\3\16"+
		"\3\u0085\13\3\3\4\3\4\3\4\3\4\3\5\3\5\5\5\u008d\n\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\7\3\7\5\7\u0097\n\7\3\b\3\b\3\b\7\b\u009c\n\b\f\b\16\b\u009f"+
		"\13\b\3\t\3\t\3\t\7\t\u00a4\n\t\f\t\16\t\u00a7\13\t\3\n\3\n\3\n\3\n\7"+
		"\n\u00ad\n\n\f\n\16\n\u00b0\13\n\3\n\3\n\5\n\u00b4\n\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00ba\n\n\3\n\3\n\3\13\3\13\5\13\u00c0\n\13\3\13\3\13\5\13\u00c4"+
		"\n\13\3\13\3\13\3\13\5\13\u00c9\n\13\7\13\u00cb\n\13\f\13\16\13\u00ce"+
		"\13\13\3\13\3\13\5\13\u00d2\n\13\3\13\3\13\3\13\3\13\5\13\u00d8\n\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u00e6\n\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u0100\n\20\3\21\3\21\3\21"+
		"\3\21\5\21\u0106\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0114\n\22\3\23\3\23\3\23\3\23\3\23\7\23\u011b\n\23\f"+
		"\23\16\23\u011e\13\23\5\23\u0120\n\23\3\23\3\23\3\24\3\24\7\24\u0126\n"+
		"\24\f\24\16\24\u0129\13\24\3\24\3\24\7\24\u012d\n\24\f\24\16\24\u0130"+
		"\13\24\3\24\3\24\6\24\u0134\n\24\r\24\16\24\u0135\3\24\3\24\3\25\3\25"+
		"\7\25\u013c\n\25\f\25\16\25\u013f\13\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u0149\n\26\f\26\16\26\u014c\13\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u0154\n\26\f\26\16\26\u0157\13\26\7\26\u0159\n\26\f\26"+
		"\16\26\u015c\13\26\3\26\3\26\7\26\u0160\n\26\f\26\16\26\u0163\13\26\5"+
		"\26\u0165\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u016f\n\27"+
		"\f\27\16\27\u0172\13\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\2\3\4\32\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\3\3\2\f\20\u01a2\2"+
		"\62\3\2\2\2\4X\3\2\2\2\6\u0086\3\2\2\2\b\u008c\3\2\2\2\n\u0091\3\2\2\2"+
		"\f\u0096\3\2\2\2\16\u0098\3\2\2\2\20\u00a0\3\2\2\2\22\u00a8\3\2\2\2\24"+
		"\u00bf\3\2\2\2\26\u00dc\3\2\2\2\30\u00e5\3\2\2\2\32\u00ee\3\2\2\2\34\u00f5"+
		"\3\2\2\2\36\u00ff\3\2\2\2 \u0105\3\2\2\2\"\u0113\3\2\2\2$\u0115\3\2\2"+
		"\2&\u0123\3\2\2\2(\u0139\3\2\2\2*\u0142\3\2\2\2,\u0168\3\2\2\2.\u0175"+
		"\3\2\2\2\60\u0177\3\2\2\2\62\67\7.\2\2\63\66\5\36\20\2\64\66\5(\25\2\65"+
		"\63\3\2\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2"+
		"\2\29\67\3\2\2\2:;\7/\2\2;\3\3\2\2\2<=\b\3\1\2=>\7\3\2\2>Y\5\4\3\32?@"+
		"\7\"\2\2@Y\5\4\3\31AB\7\30\2\2BC\5\4\3\2CD\7\31\2\2DY\3\2\2\2EY\7\60\2"+
		"\2FY\7\61\2\2GY\7\63\2\2HY\7\21\2\2IY\7\22\2\2JY\5\60\31\2KY\5\24\13\2"+
		"LT\7\4\2\2MR\7\5\2\2NS\7\60\2\2OS\5\60\31\2PS\7\61\2\2QS\7\63\2\2RN\3"+
		"\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2SU\3\2\2\2TM\3\2\2\2UV\3\2\2\2VT\3"+
		"\2\2\2VW\3\2\2\2WY\3\2\2\2X<\3\2\2\2X?\3\2\2\2XA\3\2\2\2XE\3\2\2\2XF\3"+
		"\2\2\2XG\3\2\2\2XH\3\2\2\2XI\3\2\2\2XJ\3\2\2\2XK\3\2\2\2XL\3\2\2\2Y\u0083"+
		"\3\2\2\2Z[\f\30\2\2[\\\7\25\2\2\\\u0082\5\4\3\31]^\f\27\2\2^_\7\26\2\2"+
		"_\u0082\5\4\3\30`a\f\26\2\2ab\7\27\2\2b\u0082\5\4\3\27cd\f\25\2\2de\7"+
		"\23\2\2e\u0082\5\4\3\26fg\f\24\2\2gh\7\24\2\2h\u0082\5\4\3\25ij\f\23\2"+
		"\2jk\7\37\2\2k\u0082\5\4\3\24lm\f\22\2\2mn\7\36\2\2n\u0082\5\4\3\23op"+
		"\f\21\2\2pq\7\33\2\2q\u0082\5\4\3\22rs\f\20\2\2st\7\32\2\2t\u0082\5\4"+
		"\3\21uv\f\17\2\2vw\7\34\2\2w\u0082\5\4\3\20xy\f\16\2\2yz\7\35\2\2z\u0082"+
		"\5\4\3\17{|\f\r\2\2|}\7!\2\2}\u0082\5\4\3\16~\177\f\f\2\2\177\u0080\7"+
		" \2\2\u0080\u0082\5\4\3\r\u0081Z\3\2\2\2\u0081]\3\2\2\2\u0081`\3\2\2\2"+
		"\u0081c\3\2\2\2\u0081f\3\2\2\2\u0081i\3\2\2\2\u0081l\3\2\2\2\u0081o\3"+
		"\2\2\2\u0081r\3\2\2\2\u0081u\3\2\2\2\u0081x\3\2\2\2\u0081{\3\2\2\2\u0081"+
		"~\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\5\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\5.\30\2\u0087\u0088\7"+
		"\5\2\2\u0088\u0089\7\62\2\2\u0089\7\3\2\2\2\u008a\u008d\5\6\4\2\u008b"+
		"\u008d\5\60\31\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3"+
		"\2\2\2\u008e\u008f\7\6\2\2\u008f\u0090\5\4\3\2\u0090\t\3\2\2\2\u0091\u0092"+
		"\5\b\5\2\u0092\u0093\7\7\2\2\u0093\13\3\2\2\2\u0094\u0097\5\b\5\2\u0095"+
		"\u0097\5\6\4\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\r\3\2\2\2"+
		"\u0098\u009d\5\f\7\2\u0099\u009a\7\b\2\2\u009a\u009c\5\f\7\2\u009b\u0099"+
		"\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\17\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a5\5\4\3\2\u00a1\u00a2\7\b\2"+
		"\2\u00a2\u00a4\5\4\3\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\21\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00b3\7\t\2\2\u00a9\u00ae\5.\30\2\u00aa\u00ab\7\5\2\2\u00ab\u00ad\5."+
		"\30\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\n"+
		"\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00a9\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\7\62\2\2\u00b6\u00b7\7\5\2\2\u00b7\u00b9\7"+
		"\30\2\2\u00b8\u00ba\5\16\b\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\7\31\2\2\u00bc\23\3\2\2\2\u00bd\u00be\7\60"+
		"\2\2\u00be\u00c0\7\25\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00d1\3\2\2\2\u00c1\u00c4\5\6\4\2\u00c2\u00c4\5\60\31\2\u00c3\u00c1\3"+
		"\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00cc\3\2\2\2\u00c5\u00c8\7\b\2\2\u00c6"+
		"\u00c9\5\6\4\2\u00c7\u00c9\5\60\31\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3"+
		"\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c5\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d0\7\6\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00c3\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\62\2\2\u00d4\u00d5\7"+
		"\5\2\2\u00d5\u00d7\7\30\2\2\u00d6\u00d8\5\20\t\2\u00d7\u00d6\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\31\2\2\u00da\u00db\7"+
		"\7\2\2\u00db\25\3\2\2\2\u00dc\u00dd\7+\2\2\u00dd\u00de\7\5\2\2\u00de\u00df"+
		"\7\30\2\2\u00df\u00e0\5\4\3\2\u00e0\u00e1\7\31\2\2\u00e1\u00e2\7\7\2\2"+
		"\u00e2\27\3\2\2\2\u00e3\u00e6\5\6\4\2\u00e4\u00e6\5\60\31\2\u00e5\u00e3"+
		"\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7\6\2\2\u00e8"+
		"\u00e9\7,\2\2\u00e9\u00ea\7\5\2\2\u00ea\u00eb\7\30\2\2\u00eb\u00ec\7\31"+
		"\2\2\u00ec\u00ed\7\7\2\2\u00ed\31\3\2\2\2\u00ee\u00ef\7%\2\2\u00ef\u00f0"+
		"\7\5\2\2\u00f0\u00f1\7\30\2\2\u00f1\u00f2\5\4\3\2\u00f2\u00f3\7\31\2\2"+
		"\u00f3\u00f4\7\7\2\2\u00f4\33\3\2\2\2\u00f5\u00f6\7$\2\2\u00f6\u00f7\7"+
		"\5\2\2\u00f7\u00f8\7\30\2\2\u00f8\u00f9\5\60\31\2\u00f9\u00fa\7\31\2\2"+
		"\u00fa\35\3\2\2\2\u00fb\u0100\5\n\6\2\u00fc\u00fd\5\6\4\2\u00fd\u00fe"+
		"\7\7\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fb\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100"+
		"\37\3\2\2\2\u0101\u0106\5\n\6\2\u0102\u0103\5\6\4\2\u0103\u0104\7\7\2"+
		"\2\u0104\u0106\3\2\2\2\u0105\u0101\3\2\2\2\u0105\u0102\3\2\2\2\u0106!"+
		"\3\2\2\2\u0107\u0114\5 \21\2\u0108\u0109\7\13\2\2\u0109\u010a\5\60\31"+
		"\2\u010a\u010b\7\7\2\2\u010b\u0114\3\2\2\2\u010c\u0114\5\24\13\2\u010d"+
		"\u0114\5\26\f\2\u010e\u0114\5\30\r\2\u010f\u0114\5&\24\2\u0110\u0114\5"+
		"*\26\2\u0111\u0114\5$\23\2\u0112\u0114\5,\27\2\u0113\u0107\3\2\2\2\u0113"+
		"\u0108\3\2\2\2\u0113\u010c\3\2\2\2\u0113\u010d\3\2\2\2\u0113\u010e\3\2"+
		"\2\2\u0113\u010f\3\2\2\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0112\3\2\2\2\u0114#\3\2\2\2\u0115\u0116\7-\2\2\u0116\u011f\7\5\2\2\u0117"+
		"\u011c\5\4\3\2\u0118\u0119\7\b\2\2\u0119\u011b\5\4\3\2\u011a\u0118\3\2"+
		"\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0117\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7\7\2\2\u0122%\3\2\2\2\u0123\u0127"+
		"\7#\2\2\u0124\u0126\5\"\22\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u012a\u012e\5\32\16\2\u012b\u012d\5\"\22\2\u012c\u012b\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2"+
		"\2\2\u0130\u012e\3\2\2\2\u0131\u0133\5\34\17\2\u0132\u0134\5\"\22\2\u0133"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7*\2\2\u0138\'\3\2\2\2\u0139\u013d"+
		"\5\22\n\2\u013a\u013c\5\"\22\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2"+
		"\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\u0140\u0141\7*\2\2\u0141)\3\2\2\2\u0142\u0143\7&\2\2\u0143\u0144"+
		"\7\5\2\2\u0144\u0145\7\30\2\2\u0145\u0146\5\4\3\2\u0146\u014a\7\31\2\2"+
		"\u0147\u0149\5\"\22\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u015a\3\2\2\2\u014c\u014a\3\2\2\2\u014d"+
		"\u014e\7\'\2\2\u014e\u014f\7\5\2\2\u014f\u0150\7\30\2\2\u0150\u0151\5"+
		"\4\3\2\u0151\u0155\7\31\2\2\u0152\u0154\5\"\22\2\u0153\u0152\3\2\2\2\u0154"+
		"\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0159\3\2"+
		"\2\2\u0157\u0155\3\2\2\2\u0158\u014d\3\2\2\2\u0159\u015c\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0164\3\2\2\2\u015c\u015a\3\2"+
		"\2\2\u015d\u0161\7(\2\2\u015e\u0160\5\"\22\2\u015f\u015e\3\2\2\2\u0160"+
		"\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0165\3\2"+
		"\2\2\u0163\u0161\3\2\2\2\u0164\u015d\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0167\7*\2\2\u0167+\3\2\2\2\u0168\u0169\7)\2\2\u0169"+
		"\u016a\7\5\2\2\u016a\u016b\7\30\2\2\u016b\u016c\5\4\3\2\u016c\u0170\7"+
		"\31\2\2\u016d\u016f\5\"\22\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0170\3\2"+
		"\2\2\u0173\u0174\7*\2\2\u0174-\3\2\2\2\u0175\u0176\t\2\2\2\u0176/\3\2"+
		"\2\2\u0177\u0178\7\62\2\2\u0178\61\3\2\2\2&\65\67RVX\u0081\u0083\u008c"+
		"\u0096\u009d\u00a5\u00ae\u00b3\u00b9\u00bf\u00c3\u00c8\u00cc\u00d1\u00d7"+
		"\u00e5\u00ff\u0105\u0113\u011c\u011f\u0127\u012e\u0135\u013d\u014a\u0155"+
		"\u015a\u0161\u0164\u0170";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}