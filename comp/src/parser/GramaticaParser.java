// Generated from Gramatica.g4 by ANTLR 4.13.0
package comp.src.parser;

    import comp.src.datastructures.*;
    import comp.src.ast.*;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Stack;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, RZ=11, AP=12, FP=13, AC=14, FC=15, SC=16, OP=17, ATTR=18, OR=19, 
		ID=20, NUMBER=21, TEXT=22, VIR=23, AD=24, WS=25;
	public static final int
		RULE_program = 0, RULE_declara = 1, RULE_declaracao = 2, RULE_bloco = 3, 
		RULE_cmd = 4, RULE_cmdLeitura = 5, RULE_cmdEscrita = 6, RULE_cmdExpr = 7, 
		RULE_cmdIf = 8, RULE_cmdWhile = 9, RULE_expr = 10, RULE_termo = 11, RULE_type = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declara", "declaracao", "bloco", "cmd", "cmdLeitura", "cmdEscrita", 
			"cmdExpr", "cmdIf", "cmdWhile", "expr", "termo", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog;'", "'declare'", "'leia'", "'escreva'", 
			"'se'", "'senao'", "'enquanto'", "'texto'", "'numero'", "'raiz'", "'('", 
			"')'", "'{'", "'}'", "';'", null, "':='", null, null, null, null, "','", 
			"'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "RZ", 
			"AP", "FP", "AC", "FC", "SC", "OP", "ATTR", "OR", "ID", "NUMBER", "TEXT", 
			"VIR", "AD", "WS"
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
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private int _tipo;
	    private String _varName;
	    private String _varValue;
	    private List<String> _variaveisSemUso = new ArrayList<String>();
	    private Simbolos symbol;
	    private SimbolosTable symbolTable = new SimbolosTable();

	    private Program program = new Program();
	    private ArrayList<AbstractCommand> currentThread;

	    private Stack<ArrayList<AbstractCommand>> allcomandos = new Stack<ArrayList<AbstractCommand>>();

	    private String _commandId;
	    private String _expressionId;
	    private String _expressionContent;
	    private Stack<String> _expressionConditionStack = new Stack<String>();
	    private String _expressionCondition;
	    private String _expressionWhileCondition;
	    private Stack<String> _expressionWhileConditionStack = new Stack<String>();
	    private ArrayList<AbstractCommand> TipoLista;
	    private ArrayList<AbstractCommand> NaoLista;
	    private ArrayList<AbstractCommand> whileList;

	    public void exibeComandos(){
	        for (AbstractCommand c : program.getcomandos()){
	             System.out.println(c);
	        }
	    }
	    public void generateCode(){
	        program.generateTarget();
	    }

	    public void verifyID(String id) throws Exception{
	       if (!symbolTable.exists(id)){
	           throw new Exception("Simbolo nao declarado no input: "+id);
	       }
	    }
	    public void verifyType(String id, int type) throws Exception{
	       if (((Variaveis) symbolTable.get(id)).getType() != type){
	           throw new Exception("Simbolo com tipo errado: "+id);
	       }
	    }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public DeclaraContext declara() {
			return getRuleContext(DeclaraContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws Exception {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			declara();
			setState(28);
			bloco();
			setState(29);
			match(T__1);

			    program.setVartable(symbolTable);
			    program.setcomandos(allcomandos.pop());
			    if(_variaveisSemUso.size() > 0){
			        System.err.println("Variaveis sem uso: "+_variaveisSemUso);
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
	public static class DeclaraContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public DeclaraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclara(this);
		}
	}

	public final DeclaraContext declara() throws Exception {
		DeclaraContext _localctx = new DeclaraContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				declaracao();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
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
	public static class DeclaracaoContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public TerminalNode SC() { return getToken(GramaticaParser.SC, 0); }
		public List<TerminalNode> VIR() { return getTokens(GramaticaParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(GramaticaParser.VIR, i);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws Exception {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__2);
			setState(38);
			type();
			setState(39);
			match(ID);

				                  _varName = _input.LT(-1).getText();
				                  _varValue = null;
				                  symbol = new Variaveis(_varName, _tipo, _varValue);
				                  if (!symbolTable.exists(_varName)){
				                     symbolTable.add(symbol);
				                     _variaveisSemUso.add(_varName);
				                  }
				                  else{
				                  	 throw new Exception("Variavel ja declarada: " +_varName);
				                  }
			                    
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(41);
				match(VIR);
				setState(42);
				match(ID);

					                  _varName = _input.LT(-1).getText();
					                  _varValue = null;
					                  symbol = new Variaveis(_varName, _tipo, _varValue);
					                  if (!symbolTable.exists(_varName)){
					                    symbolTable.add(symbol);
					                    _variaveisSemUso.add(_varName);
					                  }
					                  else{
					                  	 throw new Exception("Variavel ja declarada: " +_varName);
					                  }
				                    
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(SC);
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
	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws Exception {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			    currentThread = new ArrayList<AbstractCommand>();
			    allcomandos.push(currentThread);

			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				cmd();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1048944L) != 0) );
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
	public static class CmdContext extends ParserRuleContext {
		public CmdLeituraContext cmdLeitura() {
			return getRuleContext(CmdLeituraContext.class,0);
		}
		public CmdEscritaContext cmdEscrita() {
			return getRuleContext(CmdEscritaContext.class,0);
		}
		public CmdExprContext cmdExpr() {
			return getRuleContext(CmdExprContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws Exception {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmd);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				cmdLeitura();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				cmdEscrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				cmdExpr();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				cmdIf();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				cmdWhile();
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
	public static class CmdLeituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public TerminalNode SC() { return getToken(GramaticaParser.SC, 0); }
		public CmdLeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCmdLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCmdLeitura(this);
		}
	}

	public final CmdLeituraContext cmdLeitura() throws Exception {
		CmdLeituraContext _localctx = new CmdLeituraContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdLeitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__3);
			setState(65);
			match(AP);
			setState(66);
			match(ID);

			                   verifyID(_input.LT(-1).getText());
			                   _commandId = _input.LT(-1).getText();
			               
			setState(68);
			match(FP);
			setState(69);
			match(SC);

			                    Variaveis var = (Variaveis) symbolTable.get(_commandId);
			                    cmdLeitura command = new cmdLeitura(_commandId, var);
			                    allcomandos.peek().add(command);
			               
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
	public static class CmdEscritaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public TerminalNode SC() { return getToken(GramaticaParser.SC, 0); }
		public CmdEscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCmdEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCmdEscrita(this);
		}
	}

	public final CmdEscritaContext cmdEscrita() throws Exception {
		CmdEscritaContext _localctx = new CmdEscritaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdEscrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__4);
			setState(73);
			match(AP);
			setState(74);
			match(ID);

			                            verifyID(_input.LT(-1).getText());
			                            _commandId = _input.LT(-1).getText();
			                        
			setState(76);
			match(FP);
			setState(77);
			match(SC);

			                            cmdEscrita command = new cmdEscrita(_commandId);
			                            allcomandos.peek().add(command);
			                        
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
	public static class CmdExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(GramaticaParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SC() { return getToken(GramaticaParser.SC, 0); }
		public CmdExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCmdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCmdExpr(this);
		}
	}

	public final CmdExprContext cmdExpr() throws Exception {
		CmdExprContext _localctx = new CmdExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(ID);

			                   _varName = _input.LT(-1).getText();
			                   verifyID(_varName);
			                   _variaveisSemUso.remove(_varName);
			                   _expressionId = _varName;
			               
			setState(82);
			match(ATTR);
			 _expressionContent = ""; 
			setState(84);
			expr();
			setState(85);
			match(SC);

			                   verifyType(_varName, _tipo);
			                   cmdExpr command = new cmdExpr(_expressionId, _expressionContent);
			                   allcomandos.peek().add(command);
			               
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
	public static class CmdIfContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public List<TerminalNode> AC() { return getTokens(GramaticaParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(GramaticaParser.AC, i);
		}
		public List<TerminalNode> FC() { return getTokens(GramaticaParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(GramaticaParser.FC, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode OR() { return getToken(GramaticaParser.OR, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(GramaticaParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GramaticaParser.NUMBER, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(GramaticaParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(GramaticaParser.TEXT, i);
		}
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCmdIf(this);
		}
	}

	public final CmdIfContext cmdIf() throws Exception {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__5);
			setState(89);
			match(AP);
			{
			{
			setState(90);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}

			                    _expressionCondition = _input.LT(-1).getText();
			                
			setState(92);
			match(OR);
			 _expressionCondition += _input.LT(-1).getText(); 
			setState(94);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 _expressionCondition += _input.LT(-1).getText(); 
			}
			}
			setState(97);
			match(FP);

			                    _expressionConditionStack.push(_expressionCondition);
			                
			setState(99);
			match(AC);

			                    currentThread = new ArrayList<AbstractCommand>();
			                    allcomandos.push(currentThread);
			                
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				cmd();
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1048944L) != 0) );
			setState(106);
			match(FC);

			                    TipoLista = allcomandos.pop();
			                
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(108);
				match(T__6);
				setState(109);
				match(AC);

				                      currentThread = new ArrayList<AbstractCommand>();
				                      allcomandos.push(currentThread);
				                  
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(111);
					cmd();
					}
					}
					setState(114); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1048944L) != 0) );
				setState(116);
				match(FC);

				                      NaoLista = allcomandos.pop();
				                      cmdIf command = new cmdIf(_expressionConditionStack.pop(), TipoLista, NaoLista);
				                      allcomandos.peek().add(command);
				                  
				}
			}


			                      if(NaoLista == null){
			                          cmdIf command = new cmdIf(_expressionConditionStack.pop(), TipoLista, new ArrayList<AbstractCommand>());
			                          allcomandos.peek().add(command);
			                      }
			                      NaoLista = null;
			                
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
	public static class CmdWhileContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(GramaticaParser.AP, 0); }
		public TerminalNode FP() { return getToken(GramaticaParser.FP, 0); }
		public TerminalNode AC() { return getToken(GramaticaParser.AC, 0); }
		public TerminalNode FC() { return getToken(GramaticaParser.FC, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode OR() { return getToken(GramaticaParser.OR, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(GramaticaParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GramaticaParser.NUMBER, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(GramaticaParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(GramaticaParser.TEXT, i);
		}
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCmdWhile(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws Exception {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__7);
			setState(124);
			match(AP);
			{
			{
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 _expressionWhileCondition = _input.LT(-1).getText(); 
			setState(127);
			match(OR);
			 _expressionWhileCondition += _input.LT(-1).getText(); 
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 _expressionWhileCondition += _input.LT(-1).getText(); 
			}
			}
			setState(132);
			match(FP);

			                     _expressionWhileConditionStack.push(_expressionWhileCondition);
			                
			setState(134);
			match(AC);

			                    currentThread = new ArrayList<AbstractCommand>();
			                    allcomandos.push(currentThread);
			                
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				cmd();
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1048944L) != 0) );
			setState(141);
			match(FC);

			                    whileList = allcomandos.pop();
			                    cmdWhile command = new cmdWhile(_expressionWhileConditionStack.pop(), whileList);
			                    allcomandos.peek().add(command);
			                
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
	public static class ExprContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode OP() { return getToken(GramaticaParser.OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RZ() { return getToken(GramaticaParser.RZ, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws Exception {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case NUMBER:
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				termo();
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP) {
					{
					setState(145);
					match(OP);
					 _expressionContent += _input.LT(-1).getText(); 
					setState(147);
					expr();
					}
				}

				}
				break;
			case RZ:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(RZ);
				 _expressionContent += _input.LT(-1).getText(); 
				setState(152);
				termo();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP) {
					{
					setState(153);
					match(OP);
					 _expressionContent += _input.LT(-1).getText(); 
					setState(155);
					expr();
					}
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
	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(GramaticaParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(GramaticaParser.TEXT, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws Exception {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_termo);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(ID);
				 verifyID(_input.LT(-1).getText());
				                  _tipo = ((Variaveis) symbolTable.get(_input.LT(-1).getText())).getType();
				                  _expressionContent += _input.LT(-1).getText();
				                
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(NUMBER);

				        _tipo = Variaveis.NUMBER;
				        _expressionContent += _input.LT(-1).getText();
				    
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(TEXT);

				        _tipo = Variaveis.TEXT;
				        _expressionContent += _input.LT(-1).getText();
				    
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
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(T__8);
				_tipo = Variaveis.TEXT;
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(T__9);
				_tipo = Variaveis.NUMBER;
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

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u00af\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0004\u0001\"\b\u0001\u000b\u0001\f\u0001"+
		"#\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002-\b\u0002\n\u0002\f\u00020\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0004\u00036\b\u0003\u000b\u0003"+
		"\f\u00037\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004?\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004"+
		"\bg\b\b\u000b\b\f\bh\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004"+
		"\bq\b\b\u000b\b\f\br\u0001\b\u0001\b\u0001\b\u0003\bx\b\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u008a\b\t\u000b\t\f"+
		"\t\u008b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0095\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u009d"+
		"\b\n\u0003\n\u009f\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00a7\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00ad\b\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0001\u0001\u0000\u0014"+
		"\u0016\u00b2\u0000\u001a\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000"+
		"\u0000\u0004%\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000\b"+
		">\u0001\u0000\u0000\u0000\n@\u0001\u0000\u0000\u0000\fH\u0001\u0000\u0000"+
		"\u0000\u000eP\u0001\u0000\u0000\u0000\u0010X\u0001\u0000\u0000\u0000\u0012"+
		"{\u0001\u0000\u0000\u0000\u0014\u009e\u0001\u0000\u0000\u0000\u0016\u00a6"+
		"\u0001\u0000\u0000\u0000\u0018\u00ac\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0005\u0001\u0000\u0000\u001b\u001c\u0003\u0002\u0001\u0000\u001c\u001d"+
		"\u0003\u0006\u0003\u0000\u001d\u001e\u0005\u0002\u0000\u0000\u001e\u001f"+
		"\u0006\u0000\uffff\uffff\u0000\u001f\u0001\u0001\u0000\u0000\u0000 \""+
		"\u0003\u0004\u0002\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0003\u0001"+
		"\u0000\u0000\u0000%&\u0005\u0003\u0000\u0000&\'\u0003\u0018\f\u0000\'"+
		"(\u0005\u0014\u0000\u0000(.\u0006\u0002\uffff\uffff\u0000)*\u0005\u0017"+
		"\u0000\u0000*+\u0005\u0014\u0000\u0000+-\u0006\u0002\uffff\uffff\u0000"+
		",)\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u00000.\u0001\u0000"+
		"\u0000\u000012\u0005\u0010\u0000\u00002\u0005\u0001\u0000\u0000\u0000"+
		"35\u0006\u0003\uffff\uffff\u000046\u0003\b\u0004\u000054\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u00008\u0007\u0001\u0000\u0000\u00009?\u0003\n\u0005\u0000:?\u0003"+
		"\f\u0006\u0000;?\u0003\u000e\u0007\u0000<?\u0003\u0010\b\u0000=?\u0003"+
		"\u0012\t\u0000>9\u0001\u0000\u0000\u0000>:\u0001\u0000\u0000\u0000>;\u0001"+
		"\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000"+
		"?\t\u0001\u0000\u0000\u0000@A\u0005\u0004\u0000\u0000AB\u0005\f\u0000"+
		"\u0000BC\u0005\u0014\u0000\u0000CD\u0006\u0005\uffff\uffff\u0000DE\u0005"+
		"\r\u0000\u0000EF\u0005\u0010\u0000\u0000FG\u0006\u0005\uffff\uffff\u0000"+
		"G\u000b\u0001\u0000\u0000\u0000HI\u0005\u0005\u0000\u0000IJ\u0005\f\u0000"+
		"\u0000JK\u0005\u0014\u0000\u0000KL\u0006\u0006\uffff\uffff\u0000LM\u0005"+
		"\r\u0000\u0000MN\u0005\u0010\u0000\u0000NO\u0006\u0006\uffff\uffff\u0000"+
		"O\r\u0001\u0000\u0000\u0000PQ\u0005\u0014\u0000\u0000QR\u0006\u0007\uffff"+
		"\uffff\u0000RS\u0005\u0012\u0000\u0000ST\u0006\u0007\uffff\uffff\u0000"+
		"TU\u0003\u0014\n\u0000UV\u0005\u0010\u0000\u0000VW\u0006\u0007\uffff\uffff"+
		"\u0000W\u000f\u0001\u0000\u0000\u0000XY\u0005\u0006\u0000\u0000YZ\u0005"+
		"\f\u0000\u0000Z[\u0007\u0000\u0000\u0000[\\\u0006\b\uffff\uffff\u0000"+
		"\\]\u0005\u0013\u0000\u0000]^\u0006\b\uffff\uffff\u0000^_\u0007\u0000"+
		"\u0000\u0000_`\u0006\b\uffff\uffff\u0000`a\u0001\u0000\u0000\u0000ab\u0005"+
		"\r\u0000\u0000bc\u0006\b\uffff\uffff\u0000cd\u0005\u000e\u0000\u0000d"+
		"f\u0006\b\uffff\uffff\u0000eg\u0003\b\u0004\u0000fe\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0005\u000f\u0000\u0000kw\u0006"+
		"\b\uffff\uffff\u0000lm\u0005\u0007\u0000\u0000mn\u0005\u000e\u0000\u0000"+
		"np\u0006\b\uffff\uffff\u0000oq\u0003\b\u0004\u0000po\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0005\u000f\u0000\u0000uv\u0006"+
		"\b\uffff\uffff\u0000vx\u0001\u0000\u0000\u0000wl\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0006\b\uffff\uffff"+
		"\u0000z\u0011\u0001\u0000\u0000\u0000{|\u0005\b\u0000\u0000|}\u0005\f"+
		"\u0000\u0000}~\u0007\u0000\u0000\u0000~\u007f\u0006\t\uffff\uffff\u0000"+
		"\u007f\u0080\u0005\u0013\u0000\u0000\u0080\u0081\u0006\t\uffff\uffff\u0000"+
		"\u0081\u0082\u0007\u0000\u0000\u0000\u0082\u0083\u0006\t\uffff\uffff\u0000"+
		"\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0005\r\u0000\u0000\u0085"+
		"\u0086\u0006\t\uffff\uffff\u0000\u0086\u0087\u0005\u000e\u0000\u0000\u0087"+
		"\u0089\u0006\t\uffff\uffff\u0000\u0088\u008a\u0003\b\u0004\u0000\u0089"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u000f\u0000\u0000\u008e"+
		"\u008f\u0006\t\uffff\uffff\u0000\u008f\u0013\u0001\u0000\u0000\u0000\u0090"+
		"\u0094\u0003\u0016\u000b\u0000\u0091\u0092\u0005\u0011\u0000\u0000\u0092"+
		"\u0093\u0006\n\uffff\uffff\u0000\u0093\u0095\u0003\u0014\n\u0000\u0094"+
		"\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u009f\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u000b\u0000\u0000\u0097"+
		"\u0098\u0006\n\uffff\uffff\u0000\u0098\u009c\u0003\u0016\u000b\u0000\u0099"+
		"\u009a\u0005\u0011\u0000\u0000\u009a\u009b\u0006\n\uffff\uffff\u0000\u009b"+
		"\u009d\u0003\u0014\n\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u0090"+
		"\u0001\u0000\u0000\u0000\u009e\u0096\u0001\u0000\u0000\u0000\u009f\u0015"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0014\u0000\u0000\u00a1\u00a7"+
		"\u0006\u000b\uffff\uffff\u0000\u00a2\u00a3\u0005\u0015\u0000\u0000\u00a3"+
		"\u00a7\u0006\u000b\uffff\uffff\u0000\u00a4\u00a5\u0005\u0016\u0000\u0000"+
		"\u00a5\u00a7\u0006\u000b\uffff\uffff\u0000\u00a6\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a2\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a7\u0017\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\t\u0000\u0000"+
		"\u00a9\u00ad\u0006\f\uffff\uffff\u0000\u00aa\u00ab\u0005\n\u0000\u0000"+
		"\u00ab\u00ad\u0006\f\uffff\uffff\u0000\u00ac\u00a8\u0001\u0000\u0000\u0000"+
		"\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u0019\u0001\u0000\u0000\u0000"+
		"\r#.7>hrw\u008b\u0094\u009c\u009e\u00a6\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}