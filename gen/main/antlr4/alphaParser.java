// Generated from C:/Users/Robin/Documents/School/Jaar 2/Kwartiel 3/Compilers/ProgrammeerTaal/src/main/antlr4\alpha.g4 by ANTLR 4.6
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
		RULE_ifStatement = 20, RULE_whileMethod = 21, RULE_value = 22, RULE_dataType = 23, 
		RULE_variable = 24;
	public static final String[] ruleNames = {
		"language", "expression", "declaration", "declarationFill", "declarationFinal", 
		"declarationFunction", "argumentsDeclaration", "argumentsCall", "functionDeclaration", 
		"functionCall", "printFunction", "readFunction", "throwFunction", "catchFunction", 
		"globalStatements", "declarationStatement", "statement", "returnMethod", 
		"throwBlock", "function", "ifStatement", "whileMethod", "value", "dataType", 
		"variable"
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
			setState(50);
			match(START);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TEXT))) != 0)) {
				{
				setState(53);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER:
				case DOUBLE:
				case STRING:
				case CHAR:
				case BOOLEAN:
				case TEXT:
					{
					setState(51);
					globalStatements();
					}
					break;
				case T__6:
					{
					setState(52);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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
	public static class ValueExpressionContext extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegativeExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitNegativeExpression(this);
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
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
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new NegativeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(61);
				match(T__0);
				setState(62);
				expression(20);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				match(NOT);
				setState(64);
				expression(19);
				}
				break;
			case 3:
				{
				_localctx = new LeftBracketExpressionRightBracketExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(LBRACKET);
				setState(66);
				expression(0);
				setState(67);
				match(RBRACKET);
				}
				break;
			case 4:
				{
				_localctx = new ValueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				value();
				}
				break;
			case 5:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				variable();
				}
				break;
			case 6:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				functionCall();
				}
				break;
			case 7:
				{
				_localctx = new AddCustomExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(T__1);
				setState(78); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(73);
						match(T__2);
						setState(76);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case TRUE:
						case FALSE:
						case NUMBER:
						case CHAR_TYPE:
						case STRING_TYPE:
							{
							setState(74);
							value();
							}
							break;
						case TEXT:
							{
							setState(75);
							variable();
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
					setState(80); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(84);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(85);
						match(MULTIPLY);
						setState(86);
						expression(19);
						}
						break;
					case 2:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(87);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(88);
						match(DIVIDE);
						setState(89);
						expression(18);
						}
						break;
					case 3:
						{
						_localctx = new ModuloExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(90);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(91);
						match(MODULO);
						setState(92);
						expression(17);
						}
						break;
					case 4:
						{
						_localctx = new PlusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(93);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(94);
						match(PLUS);
						setState(95);
						expression(16);
						}
						break;
					case 5:
						{
						_localctx = new MinusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(96);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(97);
						match(MINUS);
						setState(98);
						expression(15);
						}
						break;
					case 6:
						{
						_localctx = new GreaterOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(99);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(100);
						match(GREATEROREQUAL);
						setState(101);
						expression(14);
						}
						break;
					case 7:
						{
						_localctx = new SmallerOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(102);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(103);
						match(SMALLEROREQUAL);
						setState(104);
						expression(13);
						}
						break;
					case 8:
						{
						_localctx = new GreaterThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(105);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(106);
						match(GREATERTHAN);
						setState(107);
						expression(12);
						}
						break;
					case 9:
						{
						_localctx = new SmallerThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(108);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(109);
						match(SMALLERTHAN);
						setState(110);
						expression(11);
						}
						break;
					case 10:
						{
						_localctx = new EqualToExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(111);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(112);
						match(EQUALTO);
						setState(113);
						expression(10);
						}
						break;
					case 11:
						{
						_localctx = new NotEqualToExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(114);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(115);
						match(NOTEQUALTO);
						setState(116);
						expression(9);
						}
						break;
					case 12:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(117);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(118);
						match(AND);
						setState(119);
						expression(8);
						}
						break;
					case 13:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(120);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(121);
						match(OR);
						setState(122);
						expression(7);
						}
						break;
					}
					} 
				}
				setState(127);
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
			setState(128);
			dataType();
			setState(129);
			match(T__2);
			setState(130);
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
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case DOUBLE:
			case STRING:
			case CHAR:
			case BOOLEAN:
				{
				setState(132);
				declaration();
				}
				break;
			case TEXT:
				{
				setState(133);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(136);
			match(T__3);
			{
			setState(137);
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
			setState(139);
			declarationFill();
			setState(140);
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
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				declarationFill();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
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
			setState(146);
			declarationFunction();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(147);
				match(T__5);
				setState(148);
				declarationFunction();
				}
				}
				setState(153);
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
			setState(154);
			expression(0);
			}
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(155);
				match(T__5);
				{
				setState(156);
				expression(0);
				}
				}
				}
				setState(161);
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
			setState(162);
			match(T__6);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN))) != 0)) {
				{
				setState(163);
				dataType();
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(164);
					match(T__2);
					setState(165);
					dataType();
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171);
				match(T__7);
				}
			}

			setState(175);
			match(TEXT);
			setState(176);
			match(T__2);
			setState(177);
			match(LBRACKET);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TEXT))) != 0)) {
				{
				setState(178);
				argumentsDeclaration();
				}
			}

			setState(181);
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
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(183);
				match(NUMBER);
				setState(184);
				match(MULTIPLY);
				}
			}

			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(189);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER:
				case DOUBLE:
				case STRING:
				case CHAR:
				case BOOLEAN:
					{
					setState(187);
					declaration();
					}
					break;
				case TEXT:
					{
					setState(188);
					variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				{
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(191);
					match(T__5);
					setState(194);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INTEGER:
					case DOUBLE:
					case STRING:
					case CHAR:
					case BOOLEAN:
						{
						setState(192);
						declaration();
						}
						break;
					case TEXT:
						{
						setState(193);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
				match(T__3);
				}
				}
				break;
			}
			setState(205);
			match(TEXT);
			setState(206);
			match(T__2);
			setState(207);
			match(LBRACKET);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRUE) | (1L << FALSE) | (1L << LBRACKET) | (1L << NOT) | (1L << NUMBER) | (1L << CHAR_TYPE) | (1L << TEXT) | (1L << STRING_TYPE))) != 0)) {
				{
				setState(208);
				argumentsCall();
				}
			}

			setState(211);
			match(RBRACKET);
			setState(212);
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
			setState(214);
			match(PRINT);
			setState(215);
			match(T__2);
			setState(216);
			match(LBRACKET);
			setState(217);
			expression(0);
			setState(218);
			match(RBRACKET);
			setState(219);
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
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case DOUBLE:
			case STRING:
			case CHAR:
			case BOOLEAN:
				{
				setState(221);
				declaration();
				}
				break;
			case TEXT:
				{
				setState(222);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(225);
			match(T__3);
			setState(226);
			match(READ);
			setState(227);
			match(T__2);
			setState(228);
			match(LBRACKET);
			setState(229);
			match(RBRACKET);
			setState(230);
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
			setState(232);
			match(THROW);
			setState(233);
			match(T__2);
			setState(234);
			match(LBRACKET);
			setState(235);
			expression(0);
			setState(236);
			match(RBRACKET);
			setState(237);
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
			setState(239);
			match(CATCH);
			setState(240);
			match(T__2);
			setState(241);
			match(LBRACKET);
			setState(242);
			variable();
			setState(243);
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
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				declarationFinal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				declaration();
				setState(247);
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
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				declarationFinal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				declaration();
				setState(253);
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
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new DeclarationStatementStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				declarationStatement();
				}
				break;
			case 2:
				_localctx = new PlusPlusStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(T__8);
				{
				setState(259);
				variable();
				}
				setState(260);
				match(T__4);
				}
				break;
			case 3:
				_localctx = new FunctionCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				functionCall();
				}
				break;
			case 4:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
				printFunction();
				}
				break;
			case 5:
				_localctx = new ReadStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(264);
				readFunction();
				}
				break;
			case 6:
				_localctx = new ThrowBlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(265);
				throwBlock();
				}
				break;
			case 7:
				_localctx = new IfStatementStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(266);
				ifStatement();
				}
				break;
			case 8:
				_localctx = new ReturnMethodStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(267);
				returnMethod();
				}
				break;
			case 9:
				_localctx = new WhileMethodStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(268);
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
			setState(271);
			match(RETURN);
			setState(272);
			match(T__2);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRUE) | (1L << FALSE) | (1L << LBRACKET) | (1L << NOT) | (1L << NUMBER) | (1L << CHAR_TYPE) | (1L << TEXT) | (1L << STRING_TYPE))) != 0)) {
				{
				setState(273);
				expression(0);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(274);
					match(T__5);
					{
					setState(275);
					expression(0);
					}
					}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(283);
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
			setState(285);
			match(TRY);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
				{
				{
				setState(286);
				statement();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			throwFunction();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
				{
				{
				setState(293);
				statement();
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			catchFunction();
			setState(301); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(300);
				statement();
				}
				}
				setState(303); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0) );
			setState(305);
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
			setState(307);
			functionDeclaration();
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
				{
				{
				setState(308);
				statement();
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
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
			setState(316);
			match(IF);
			setState(317);
			match(T__2);
			setState(318);
			match(LBRACKET);
			setState(319);
			expression(0);
			setState(320);
			match(RBRACKET);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
				{
				{
				setState(321);
				statement();
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(327);
				match(ELSEIF);
				setState(328);
				match(T__2);
				setState(329);
				match(LBRACKET);
				setState(330);
				expression(0);
				setState(331);
				match(RBRACKET);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
					{
					{
					setState(332);
					statement();
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(343);
				match(ELSE);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
					{
					{
					setState(344);
					statement();
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(352);
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
			setState(354);
			match(WHILE);
			setState(355);
			match(T__2);
			setState(356);
			match(LBRACKET);
			setState(357);
			expression(0);
			setState(358);
			match(RBRACKET);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << TRY) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << RETURN) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
				{
				{
				setState(359);
				statement();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FalseValueContext extends ValueContext {
		public TerminalNode FALSE() { return getToken(alphaParser.FALSE, 0); }
		public FalseValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitFalseValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringValueContext extends ValueContext {
		public TerminalNode STRING_TYPE() { return getToken(alphaParser.STRING_TYPE, 0); }
		public StringValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharValueContext extends ValueContext {
		public TerminalNode CHAR_TYPE() { return getToken(alphaParser.CHAR_TYPE, 0); }
		public CharValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitCharValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueValueContext extends ValueContext {
		public TerminalNode TRUE() { return getToken(alphaParser.TRUE, 0); }
		public TrueValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitTrueValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberValueContext extends ValueContext {
		public TerminalNode NUMBER() { return getToken(alphaParser.NUMBER, 0); }
		public NumberValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alphaVisitor ) return ((alphaVisitor<? extends T>)visitor).visitNumberValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_value);
		try {
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				match(NUMBER);
				}
				break;
			case CHAR_TYPE:
				_localctx = new CharValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				match(CHAR_TYPE);
				}
				break;
			case STRING_TYPE:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				match(STRING_TYPE);
				}
				break;
			case TRUE:
				_localctx = new TrueValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(370);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(371);
				match(FALSE);
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
		enterRule(_localctx, 46, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
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
		enterRule(_localctx, 48, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
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
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u017d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\6\3Q\n\3\r\3"+
		"\16\3R\5\3U\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3~\n\3\f\3\16\3\u0081\13\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\5\5\u0089\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\5\7\u0093"+
		"\n\7\3\b\3\b\3\b\7\b\u0098\n\b\f\b\16\b\u009b\13\b\3\t\3\t\3\t\7\t\u00a0"+
		"\n\t\f\t\16\t\u00a3\13\t\3\n\3\n\3\n\3\n\7\n\u00a9\n\n\f\n\16\n\u00ac"+
		"\13\n\3\n\3\n\5\n\u00b0\n\n\3\n\3\n\3\n\3\n\5\n\u00b6\n\n\3\n\3\n\3\13"+
		"\3\13\5\13\u00bc\n\13\3\13\3\13\5\13\u00c0\n\13\3\13\3\13\3\13\5\13\u00c5"+
		"\n\13\7\13\u00c7\n\13\f\13\16\13\u00ca\13\13\3\13\3\13\5\13\u00ce\n\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00d4\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\5\r\u00e2\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\5\20\u00fc\n\20\3\21\3\21\3\21\3\21\5\21\u0102\n\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0110\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u0117\n\23\f\23\16\23\u011a\13\23\5\23\u011c"+
		"\n\23\3\23\3\23\3\24\3\24\7\24\u0122\n\24\f\24\16\24\u0125\13\24\3\24"+
		"\3\24\7\24\u0129\n\24\f\24\16\24\u012c\13\24\3\24\3\24\6\24\u0130\n\24"+
		"\r\24\16\24\u0131\3\24\3\24\3\25\3\25\7\25\u0138\n\25\f\25\16\25\u013b"+
		"\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0145\n\26\f\26\16"+
		"\26\u0148\13\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0150\n\26\f\26\16"+
		"\26\u0153\13\26\7\26\u0155\n\26\f\26\16\26\u0158\13\26\3\26\3\26\7\26"+
		"\u015c\n\26\f\26\16\26\u015f\13\26\5\26\u0161\n\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u016b\n\27\f\27\16\27\u016e\13\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u0177\n\30\3\31\3\31\3\32\3\32\3\32\2\3"+
		"\4\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\3\3\2\f"+
		"\20\u01a2\2\64\3\2\2\2\4T\3\2\2\2\6\u0082\3\2\2\2\b\u0088\3\2\2\2\n\u008d"+
		"\3\2\2\2\f\u0092\3\2\2\2\16\u0094\3\2\2\2\20\u009c\3\2\2\2\22\u00a4\3"+
		"\2\2\2\24\u00bb\3\2\2\2\26\u00d8\3\2\2\2\30\u00e1\3\2\2\2\32\u00ea\3\2"+
		"\2\2\34\u00f1\3\2\2\2\36\u00fb\3\2\2\2 \u0101\3\2\2\2\"\u010f\3\2\2\2"+
		"$\u0111\3\2\2\2&\u011f\3\2\2\2(\u0135\3\2\2\2*\u013e\3\2\2\2,\u0164\3"+
		"\2\2\2.\u0176\3\2\2\2\60\u0178\3\2\2\2\62\u017a\3\2\2\2\649\7.\2\2\65"+
		"8\5\36\20\2\668\5(\25\2\67\65\3\2\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2"+
		"\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7/\2\2=\3\3\2\2\2>?\b\3\1\2?@\7\3"+
		"\2\2@U\5\4\3\26AB\7\"\2\2BU\5\4\3\25CD\7\30\2\2DE\5\4\3\2EF\7\31\2\2F"+
		"U\3\2\2\2GU\5.\30\2HU\5\62\32\2IU\5\24\13\2JP\7\4\2\2KN\7\5\2\2LO\5.\30"+
		"\2MO\5\62\32\2NL\3\2\2\2NM\3\2\2\2OQ\3\2\2\2PK\3\2\2\2QR\3\2\2\2RP\3\2"+
		"\2\2RS\3\2\2\2SU\3\2\2\2T>\3\2\2\2TA\3\2\2\2TC\3\2\2\2TG\3\2\2\2TH\3\2"+
		"\2\2TI\3\2\2\2TJ\3\2\2\2U\177\3\2\2\2VW\f\24\2\2WX\7\25\2\2X~\5\4\3\25"+
		"YZ\f\23\2\2Z[\7\26\2\2[~\5\4\3\24\\]\f\22\2\2]^\7\27\2\2^~\5\4\3\23_`"+
		"\f\21\2\2`a\7\23\2\2a~\5\4\3\22bc\f\20\2\2cd\7\24\2\2d~\5\4\3\21ef\f\17"+
		"\2\2fg\7\37\2\2g~\5\4\3\20hi\f\16\2\2ij\7\36\2\2j~\5\4\3\17kl\f\r\2\2"+
		"lm\7\33\2\2m~\5\4\3\16no\f\f\2\2op\7\32\2\2p~\5\4\3\rqr\f\13\2\2rs\7\34"+
		"\2\2s~\5\4\3\ftu\f\n\2\2uv\7\35\2\2v~\5\4\3\13wx\f\t\2\2xy\7!\2\2y~\5"+
		"\4\3\nz{\f\b\2\2{|\7 \2\2|~\5\4\3\t}V\3\2\2\2}Y\3\2\2\2}\\\3\2\2\2}_\3"+
		"\2\2\2}b\3\2\2\2}e\3\2\2\2}h\3\2\2\2}k\3\2\2\2}n\3\2\2\2}q\3\2\2\2}t\3"+
		"\2\2\2}w\3\2\2\2}z\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\5\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\5\60\31\2\u0083\u0084"+
		"\7\5\2\2\u0084\u0085\7\62\2\2\u0085\7\3\2\2\2\u0086\u0089\5\6\4\2\u0087"+
		"\u0089\5\62\32\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3"+
		"\2\2\2\u008a\u008b\7\6\2\2\u008b\u008c\5\4\3\2\u008c\t\3\2\2\2\u008d\u008e"+
		"\5\b\5\2\u008e\u008f\7\7\2\2\u008f\13\3\2\2\2\u0090\u0093\5\b\5\2\u0091"+
		"\u0093\5\6\4\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\r\3\2\2\2"+
		"\u0094\u0099\5\f\7\2\u0095\u0096\7\b\2\2\u0096\u0098\5\f\7\2\u0097\u0095"+
		"\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\17\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00a1\5\4\3\2\u009d\u009e\7\b\2"+
		"\2\u009e\u00a0\5\4\3\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\21\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00af\7\t\2\2\u00a5\u00aa\5\60\31\2\u00a6\u00a7\7\5\2\2\u00a7\u00a9\5"+
		"\60\31\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\n"+
		"\2\2\u00ae\u00b0\3\2\2\2\u00af\u00a5\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b2\7\62\2\2\u00b2\u00b3\7\5\2\2\u00b3\u00b5\7"+
		"\30\2\2\u00b4\u00b6\5\16\b\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b8\7\31\2\2\u00b8\23\3\2\2\2\u00b9\u00ba\7\60"+
		"\2\2\u00ba\u00bc\7\25\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00cd\3\2\2\2\u00bd\u00c0\5\6\4\2\u00be\u00c0\5\62\32\2\u00bf\u00bd\3"+
		"\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c8\3\2\2\2\u00c1\u00c4\7\b\2\2\u00c2"+
		"\u00c5\5\6\4\2\u00c3\u00c5\5\62\32\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3"+
		"\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00cb\u00cc\7\6\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00bf\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7\62\2\2\u00d0\u00d1\7"+
		"\5\2\2\u00d1\u00d3\7\30\2\2\u00d2\u00d4\5\20\t\2\u00d3\u00d2\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\31\2\2\u00d6\u00d7\7"+
		"\7\2\2\u00d7\25\3\2\2\2\u00d8\u00d9\7+\2\2\u00d9\u00da\7\5\2\2\u00da\u00db"+
		"\7\30\2\2\u00db\u00dc\5\4\3\2\u00dc\u00dd\7\31\2\2\u00dd\u00de\7\7\2\2"+
		"\u00de\27\3\2\2\2\u00df\u00e2\5\6\4\2\u00e0\u00e2\5\62\32\2\u00e1\u00df"+
		"\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7\6\2\2\u00e4"+
		"\u00e5\7,\2\2\u00e5\u00e6\7\5\2\2\u00e6\u00e7\7\30\2\2\u00e7\u00e8\7\31"+
		"\2\2\u00e8\u00e9\7\7\2\2\u00e9\31\3\2\2\2\u00ea\u00eb\7%\2\2\u00eb\u00ec"+
		"\7\5\2\2\u00ec\u00ed\7\30\2\2\u00ed\u00ee\5\4\3\2\u00ee\u00ef\7\31\2\2"+
		"\u00ef\u00f0\7\7\2\2\u00f0\33\3\2\2\2\u00f1\u00f2\7$\2\2\u00f2\u00f3\7"+
		"\5\2\2\u00f3\u00f4\7\30\2\2\u00f4\u00f5\5\62\32\2\u00f5\u00f6\7\31\2\2"+
		"\u00f6\35\3\2\2\2\u00f7\u00fc\5\n\6\2\u00f8\u00f9\5\6\4\2\u00f9\u00fa"+
		"\7\7\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fc"+
		"\37\3\2\2\2\u00fd\u0102\5\n\6\2\u00fe\u00ff\5\6\4\2\u00ff\u0100\7\7\2"+
		"\2\u0100\u0102\3\2\2\2\u0101\u00fd\3\2\2\2\u0101\u00fe\3\2\2\2\u0102!"+
		"\3\2\2\2\u0103\u0110\5 \21\2\u0104\u0105\7\13\2\2\u0105\u0106\5\62\32"+
		"\2\u0106\u0107\7\7\2\2\u0107\u0110\3\2\2\2\u0108\u0110\5\24\13\2\u0109"+
		"\u0110\5\26\f\2\u010a\u0110\5\30\r\2\u010b\u0110\5&\24\2\u010c\u0110\5"+
		"*\26\2\u010d\u0110\5$\23\2\u010e\u0110\5,\27\2\u010f\u0103\3\2\2\2\u010f"+
		"\u0104\3\2\2\2\u010f\u0108\3\2\2\2\u010f\u0109\3\2\2\2\u010f\u010a\3\2"+
		"\2\2\u010f\u010b\3\2\2\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u010e\3\2\2\2\u0110#\3\2\2\2\u0111\u0112\7-\2\2\u0112\u011b\7\5\2\2\u0113"+
		"\u0118\5\4\3\2\u0114\u0115\7\b\2\2\u0115\u0117\5\4\3\2\u0116\u0114\3\2"+
		"\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u0113\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u011e\7\7\2\2\u011e%\3\2\2\2\u011f\u0123"+
		"\7#\2\2\u0120\u0122\5\"\22\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0126\u012a\5\32\16\2\u0127\u0129\5\"\22\2\u0128\u0127\3\2\2\2\u0129"+
		"\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012d\u012f\5\34\17\2\u012e\u0130\5\"\22\2\u012f"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133\u0134\7*\2\2\u0134\'\3\2\2\2\u0135\u0139"+
		"\5\22\n\2\u0136\u0138\5\"\22\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2"+
		"\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013c\u013d\7*\2\2\u013d)\3\2\2\2\u013e\u013f\7&\2\2\u013f\u0140"+
		"\7\5\2\2\u0140\u0141\7\30\2\2\u0141\u0142\5\4\3\2\u0142\u0146\7\31\2\2"+
		"\u0143\u0145\5\"\22\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0156\3\2\2\2\u0148\u0146\3\2\2\2\u0149"+
		"\u014a\7\'\2\2\u014a\u014b\7\5\2\2\u014b\u014c\7\30\2\2\u014c\u014d\5"+
		"\4\3\2\u014d\u0151\7\31\2\2\u014e\u0150\5\"\22\2\u014f\u014e\3\2\2\2\u0150"+
		"\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0155\3\2"+
		"\2\2\u0153\u0151\3\2\2\2\u0154\u0149\3\2\2\2\u0155\u0158\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0160\3\2\2\2\u0158\u0156\3\2"+
		"\2\2\u0159\u015d\7(\2\2\u015a\u015c\5\"\22\2\u015b\u015a\3\2\2\2\u015c"+
		"\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0161\3\2"+
		"\2\2\u015f\u015d\3\2\2\2\u0160\u0159\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0163\7*\2\2\u0163+\3\2\2\2\u0164\u0165\7)\2\2\u0165"+
		"\u0166\7\5\2\2\u0166\u0167\7\30\2\2\u0167\u0168\5\4\3\2\u0168\u016c\7"+
		"\31\2\2\u0169\u016b\5\"\22\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u016c\3\2"+
		"\2\2\u016f\u0170\7*\2\2\u0170-\3\2\2\2\u0171\u0177\7\60\2\2\u0172\u0177"+
		"\7\61\2\2\u0173\u0177\7\63\2\2\u0174\u0177\7\21\2\2\u0175\u0177\7\22\2"+
		"\2\u0176\u0171\3\2\2\2\u0176\u0172\3\2\2\2\u0176\u0173\3\2\2\2\u0176\u0174"+
		"\3\2\2\2\u0176\u0175\3\2\2\2\u0177/\3\2\2\2\u0178\u0179\t\2\2\2\u0179"+
		"\61\3\2\2\2\u017a\u017b\7\62\2\2\u017b\63\3\2\2\2\'\679NRT}\177\u0088"+
		"\u0092\u0099\u00a1\u00aa\u00af\u00b5\u00bb\u00bf\u00c4\u00c8\u00cd\u00d3"+
		"\u00e1\u00fb\u0101\u010f\u0118\u011b\u0123\u012a\u0131\u0139\u0146\u0151"+
		"\u0156\u015d\u0160\u016c\u0176";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}