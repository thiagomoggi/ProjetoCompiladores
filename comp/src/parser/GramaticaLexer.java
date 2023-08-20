// Generated from Gramatica.g4 by ANTLR 4.13.0
package comp.src.parser;

    import comp.src.datastructures.*;
    import comp.src.ast.*;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Stack;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, RZ=11, AP=12, FP=13, AC=14, FC=15, SC=16, OP=17, ATTR=18, OR=19, 
		ID=20, NUMBER=21, TEXT=22, VIR=23, AD=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "RZ", "AP", "FP", "AC", "FC", "SC", "OP", "ATTR", "OR", "ID", 
			"NUMBER", "TEXT", "VIR", "AD", "WS"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

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
		"\u0004\u0000\u0019\u00bf\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u008c"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u009a\b\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u009e"+
		"\b\u0013\n\u0013\f\u0013\u00a1\t\u0013\u0001\u0014\u0004\u0014\u00a4\b"+
		"\u0014\u000b\u0014\f\u0014\u00a5\u0001\u0014\u0001\u0014\u0004\u0014\u00aa"+
		"\b\u0014\u000b\u0014\f\u0014\u00ab\u0003\u0014\u00ae\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0004\u0015\u00b2\b\u0015\u000b\u0015\f\u0015\u00b3\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u0019\u0001\u0000\u0007\u0003\u0000*+--//\u0002\u0000<<>>\u0001\u0000"+
		"az\u0003\u000009AZaz\u0001\u000009\u0004\u0000  09AZaz\u0003\u0000\t\n"+
		"\r\r  \u00c8\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0001"+
		"3\u0001\u0000\u0000\u0000\u0003<\u0001\u0000\u0000\u0000\u0005E\u0001"+
		"\u0000\u0000\u0000\u0007M\u0001\u0000\u0000\u0000\tR\u0001\u0000\u0000"+
		"\u0000\u000bZ\u0001\u0000\u0000\u0000\r]\u0001\u0000\u0000\u0000\u000f"+
		"c\u0001\u0000\u0000\u0000\u0011l\u0001\u0000\u0000\u0000\u0013r\u0001"+
		"\u0000\u0000\u0000\u0015y\u0001\u0000\u0000\u0000\u0017~\u0001\u0000\u0000"+
		"\u0000\u0019\u0080\u0001\u0000\u0000\u0000\u001b\u0082\u0001\u0000\u0000"+
		"\u0000\u001d\u0084\u0001\u0000\u0000\u0000\u001f\u0086\u0001\u0000\u0000"+
		"\u0000!\u008b\u0001\u0000\u0000\u0000#\u008d\u0001\u0000\u0000\u0000%"+
		"\u0099\u0001\u0000\u0000\u0000\'\u009b\u0001\u0000\u0000\u0000)\u00a3"+
		"\u0001\u0000\u0000\u0000+\u00af\u0001\u0000\u0000\u0000-\u00b7\u0001\u0000"+
		"\u0000\u0000/\u00b9\u0001\u0000\u0000\u00001\u00bb\u0001\u0000\u0000\u0000"+
		"34\u0005p\u0000\u000045\u0005r\u0000\u000056\u0005o\u0000\u000067\u0005"+
		"g\u0000\u000078\u0005r\u0000\u000089\u0005a\u0000\u00009:\u0005m\u0000"+
		"\u0000:;\u0005a\u0000\u0000;\u0002\u0001\u0000\u0000\u0000<=\u0005f\u0000"+
		"\u0000=>\u0005i\u0000\u0000>?\u0005m\u0000\u0000?@\u0005p\u0000\u0000"+
		"@A\u0005r\u0000\u0000AB\u0005o\u0000\u0000BC\u0005g\u0000\u0000CD\u0005"+
		";\u0000\u0000D\u0004\u0001\u0000\u0000\u0000EF\u0005d\u0000\u0000FG\u0005"+
		"e\u0000\u0000GH\u0005c\u0000\u0000HI\u0005l\u0000\u0000IJ\u0005a\u0000"+
		"\u0000JK\u0005r\u0000\u0000KL\u0005e\u0000\u0000L\u0006\u0001\u0000\u0000"+
		"\u0000MN\u0005l\u0000\u0000NO\u0005e\u0000\u0000OP\u0005i\u0000\u0000"+
		"PQ\u0005a\u0000\u0000Q\b\u0001\u0000\u0000\u0000RS\u0005e\u0000\u0000"+
		"ST\u0005s\u0000\u0000TU\u0005c\u0000\u0000UV\u0005r\u0000\u0000VW\u0005"+
		"e\u0000\u0000WX\u0005v\u0000\u0000XY\u0005a\u0000\u0000Y\n\u0001\u0000"+
		"\u0000\u0000Z[\u0005s\u0000\u0000[\\\u0005e\u0000\u0000\\\f\u0001\u0000"+
		"\u0000\u0000]^\u0005s\u0000\u0000^_\u0005e\u0000\u0000_`\u0005n\u0000"+
		"\u0000`a\u0005a\u0000\u0000ab\u0005o\u0000\u0000b\u000e\u0001\u0000\u0000"+
		"\u0000cd\u0005e\u0000\u0000de\u0005n\u0000\u0000ef\u0005q\u0000\u0000"+
		"fg\u0005u\u0000\u0000gh\u0005a\u0000\u0000hi\u0005n\u0000\u0000ij\u0005"+
		"t\u0000\u0000jk\u0005o\u0000\u0000k\u0010\u0001\u0000\u0000\u0000lm\u0005"+
		"t\u0000\u0000mn\u0005e\u0000\u0000no\u0005x\u0000\u0000op\u0005t\u0000"+
		"\u0000pq\u0005o\u0000\u0000q\u0012\u0001\u0000\u0000\u0000rs\u0005n\u0000"+
		"\u0000st\u0005u\u0000\u0000tu\u0005m\u0000\u0000uv\u0005e\u0000\u0000"+
		"vw\u0005r\u0000\u0000wx\u0005o\u0000\u0000x\u0014\u0001\u0000\u0000\u0000"+
		"yz\u0005r\u0000\u0000z{\u0005a\u0000\u0000{|\u0005i\u0000\u0000|}\u0005"+
		"z\u0000\u0000}\u0016\u0001\u0000\u0000\u0000~\u007f\u0005(\u0000\u0000"+
		"\u007f\u0018\u0001\u0000\u0000\u0000\u0080\u0081\u0005)\u0000\u0000\u0081"+
		"\u001a\u0001\u0000\u0000\u0000\u0082\u0083\u0005{\u0000\u0000\u0083\u001c"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0005}\u0000\u0000\u0085\u001e\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005;\u0000\u0000\u0087 \u0001\u0000\u0000"+
		"\u0000\u0088\u008c\u0007\u0000\u0000\u0000\u0089\u008a\u0005*\u0000\u0000"+
		"\u008a\u008c\u0005*\u0000\u0000\u008b\u0088\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008c\"\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0005:\u0000\u0000\u008e\u008f\u0005=\u0000\u0000\u008f$\u0001\u0000"+
		"\u0000\u0000\u0090\u009a\u0007\u0001\u0000\u0000\u0091\u0092\u0005>\u0000"+
		"\u0000\u0092\u009a\u0005=\u0000\u0000\u0093\u0094\u0005<\u0000\u0000\u0094"+
		"\u009a\u0005=\u0000\u0000\u0095\u0096\u0005=\u0000\u0000\u0096\u009a\u0005"+
		"=\u0000\u0000\u0097\u0098\u0005!\u0000\u0000\u0098\u009a\u0005=\u0000"+
		"\u0000\u0099\u0090\u0001\u0000\u0000\u0000\u0099\u0091\u0001\u0000\u0000"+
		"\u0000\u0099\u0093\u0001\u0000\u0000\u0000\u0099\u0095\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a&\u0001\u0000\u0000\u0000"+
		"\u009b\u009f\u0007\u0002\u0000\u0000\u009c\u009e\u0007\u0003\u0000\u0000"+
		"\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0(\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a4\u0007\u0004\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6\u00ad\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a9\u0005.\u0000\u0000\u00a8\u00aa\u0007\u0004\u0000\u0000\u00a9\u00a8"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ad\u00a7\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ae*\u0001\u0000\u0000\u0000\u00af\u00b1\u0003"+
		"/\u0017\u0000\u00b0\u00b2\u0007\u0005\u0000\u0000\u00b1\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0003/\u0017\u0000\u00b6,\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0005,\u0000\u0000\u00b8.\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0005\"\u0000\u0000\u00ba0\u0001\u0000\u0000\u0000\u00bb\u00bc\u0007"+
		"\u0006\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0006"+
		"\u0018\u0000\u0000\u00be2\u0001\u0000\u0000\u0000\n\u0000\u008b\u0099"+
		"\u009d\u009f\u00a5\u00ab\u00ad\u00b1\u00b3\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}