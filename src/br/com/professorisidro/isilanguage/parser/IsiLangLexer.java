// Generated from IsiLang.g4 by ANTLR 4.7.1
package br.com.professorisidro.isilanguage.parser;

	import br.com.professorisidro.isilanguage.datastructures.IsiSymbol;
	import br.com.professorisidro.isilanguage.datastructures.IsiVariable;
	import br.com.professorisidro.isilanguage.datastructures.IsiSymbolTable;
	import br.com.professorisidro.isilanguage.exceptions.IsiSemanticException;
	import br.com.professorisidro.isilanguage.ast.IsiProgram;
	import br.com.professorisidro.isilanguage.ast.AbstractCommand;
	import br.com.professorisidro.isilanguage.ast.CommandLeitura;
	import br.com.professorisidro.isilanguage.ast.CommandEscrita;
	import br.com.professorisidro.isilanguage.ast.CommandAtribuicao;
	import br.com.professorisidro.isilanguage.ast.CommandDecisao;
	import br.com.professorisidro.isilanguage.ast.CommandRepeticao;
	import java.util.ArrayList;
	import java.util.Stack;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, LOGARITHM=14, SQUAREROOT=15, AP=16, 
		FP=17, SC=18, OP=19, ATTR=20, VIR=21, ACH=22, FCH=23, OPREL=24, ID=25, 
		INT=26, DOUBLE=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "LOGARITHM", "SQUAREROOT", "AP", "FP", 
		"SC", "OP", "ATTR", "VIR", "ACH", "FCH", "OPREL", "ID", "INT", "DOUBLE", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'programa'", "'fimprog;'", "'texto'", "'booleano'", "'inteiro'", 
		"'real'", "'leia'", "'escreva'", "'se'", "'senao'", "'enquanto'", "'true'", 
		"'false'", null, null, "'('", "')'", "';'", null, "'='", "','", "'{'", 
		"'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "LOGARITHM", "SQUAREROOT", "AP", "FP", "SC", "OP", "ATTR", 
		"VIR", "ACH", "FCH", "OPREL", "ID", "INT", "DOUBLE", "WS"
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


		private int _tipo;
		private String _varName;
		private String _varValue;
		private IsiSymbolTable symbolTable = new IsiSymbolTable();
		private IsiSymbol symbol;
		private IsiProgram program = new IsiProgram();
		private ArrayList<AbstractCommand> curThread;
		private Stack<ArrayList<AbstractCommand>> stack = new Stack<ArrayList<AbstractCommand>>();
		private String _readID;
		private String _writeID;
		private String _exprID;
		private String _exprContent;
		private String _exprDecision;
		private String _exprRepetition;
		private ArrayList<AbstractCommand> listaTrue;
		private ArrayList<AbstractCommand> listaFalse;
		
		public void verificaID(String id){
			if (!symbolTable.exists(id)){
				throw new IsiSemanticException("Symbol "+id+" not declared");
			}
		}
		
		public void exibeComandos(){
			for (AbstractCommand c: program.getComandos()){
				System.out.println(c);
			}
		}
		
		public String generateCode(){
			return program.generateTarget();
		}

		public ArrayList<String> getUnusedVars(){  
			return program.getVariaveisInutilizadas();
		}


	public IsiLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IsiLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00e3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u009a\n\17\3\17\3\17\3\17\3\17\5\17\u00a0\n"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ad"+
		"\n\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u00ca\n\31\3\32\3\32\7\32\u00ce\n\32\f\32\16\32\u00d1\13\32\3\33"+
		"\6\33\u00d4\n\33\r\33\16\33\u00d5\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00de"+
		"\n\34\3\35\3\35\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36\3\2\b\6\2,-//\61\61``\4\2>>@@\3\2c|\5\2\62"+
		";C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00ee\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5D\3\2\2\2\7M\3\2\2\2"+
		"\tS\3\2\2\2\13\\\3\2\2\2\rd\3\2\2\2\17i\3\2\2\2\21n\3\2\2\2\23v\3\2\2"+
		"\2\25y\3\2\2\2\27\177\3\2\2\2\31\u0088\3\2\2\2\33\u008d\3\2\2\2\35\u0093"+
		"\3\2\2\2\37\u00a3\3\2\2\2!\u00b0\3\2\2\2#\u00b2\3\2\2\2%\u00b4\3\2\2\2"+
		"\'\u00b6\3\2\2\2)\u00b8\3\2\2\2+\u00ba\3\2\2\2-\u00bc\3\2\2\2/\u00be\3"+
		"\2\2\2\61\u00c9\3\2\2\2\63\u00cb\3\2\2\2\65\u00d3\3\2\2\2\67\u00dd\3\2"+
		"\2\29\u00df\3\2\2\2;<\7r\2\2<=\7t\2\2=>\7q\2\2>?\7i\2\2?@\7t\2\2@A\7c"+
		"\2\2AB\7o\2\2BC\7c\2\2C\4\3\2\2\2DE\7h\2\2EF\7k\2\2FG\7o\2\2GH\7r\2\2"+
		"HI\7t\2\2IJ\7q\2\2JK\7i\2\2KL\7=\2\2L\6\3\2\2\2MN\7v\2\2NO\7g\2\2OP\7"+
		"z\2\2PQ\7v\2\2QR\7q\2\2R\b\3\2\2\2ST\7d\2\2TU\7q\2\2UV\7q\2\2VW\7n\2\2"+
		"WX\7g\2\2XY\7c\2\2YZ\7p\2\2Z[\7q\2\2[\n\3\2\2\2\\]\7k\2\2]^\7p\2\2^_\7"+
		"v\2\2_`\7g\2\2`a\7k\2\2ab\7t\2\2bc\7q\2\2c\f\3\2\2\2de\7t\2\2ef\7g\2\2"+
		"fg\7c\2\2gh\7n\2\2h\16\3\2\2\2ij\7n\2\2jk\7g\2\2kl\7k\2\2lm\7c\2\2m\20"+
		"\3\2\2\2no\7g\2\2op\7u\2\2pq\7e\2\2qr\7t\2\2rs\7g\2\2st\7x\2\2tu\7c\2"+
		"\2u\22\3\2\2\2vw\7u\2\2wx\7g\2\2x\24\3\2\2\2yz\7u\2\2z{\7g\2\2{|\7p\2"+
		"\2|}\7c\2\2}~\7q\2\2~\26\3\2\2\2\177\u0080\7g\2\2\u0080\u0081\7p\2\2\u0081"+
		"\u0082\7s\2\2\u0082\u0083\7w\2\2\u0083\u0084\7c\2\2\u0084\u0085\7p\2\2"+
		"\u0085\u0086\7v\2\2\u0086\u0087\7q\2\2\u0087\30\3\2\2\2\u0088\u0089\7"+
		"v\2\2\u0089\u008a\7t\2\2\u008a\u008b\7w\2\2\u008b\u008c\7g\2\2\u008c\32"+
		"\3\2\2\2\u008d\u008e\7h\2\2\u008e\u008f\7c\2\2\u008f\u0090\7n\2\2\u0090"+
		"\u0091\7u\2\2\u0091\u0092\7g\2\2\u0092\34\3\2\2\2\u0093\u0094\7n\2\2\u0094"+
		"\u0095\7q\2\2\u0095\u0096\7i\2\2\u0096\u0099\3\2\2\2\u0097\u009a\5\65"+
		"\33\2\u0098\u009a\5\67\34\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009f\5!\21\2\u009c\u00a0\5\65\33\2\u009d\u00a0\5"+
		"\67\34\2\u009e\u00a0\5\63\32\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2"+
		"\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\5#\22\2\u00a2\36"+
		"\3\2\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7s\2\2\u00a5\u00a6\7t\2\2\u00a6"+
		"\u00a7\7v\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ac\5!\21\2\u00a9\u00ad\5\65"+
		"\33\2\u00aa\u00ad\5\67\34\2\u00ab\u00ad\5\63\32\2\u00ac\u00a9\3\2\2\2"+
		"\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af"+
		"\5#\22\2\u00af \3\2\2\2\u00b0\u00b1\7*\2\2\u00b1\"\3\2\2\2\u00b2\u00b3"+
		"\7+\2\2\u00b3$\3\2\2\2\u00b4\u00b5\7=\2\2\u00b5&\3\2\2\2\u00b6\u00b7\t"+
		"\2\2\2\u00b7(\3\2\2\2\u00b8\u00b9\7?\2\2\u00b9*\3\2\2\2\u00ba\u00bb\7"+
		".\2\2\u00bb,\3\2\2\2\u00bc\u00bd\7}\2\2\u00bd.\3\2\2\2\u00be\u00bf\7\177"+
		"\2\2\u00bf\60\3\2\2\2\u00c0\u00ca\t\3\2\2\u00c1\u00c2\7@\2\2\u00c2\u00ca"+
		"\7?\2\2\u00c3\u00c4\7>\2\2\u00c4\u00ca\7?\2\2\u00c5\u00c6\7?\2\2\u00c6"+
		"\u00ca\7?\2\2\u00c7\u00c8\7#\2\2\u00c8\u00ca\7?\2\2\u00c9\u00c0\3\2\2"+
		"\2\u00c9\u00c1\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00ca\62\3\2\2\2\u00cb\u00cf\t\4\2\2\u00cc\u00ce\t\5\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\64\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4\t\6\2\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\66\3\2\2\2\u00d7\u00d8\5\65\33\2\u00d8\u00d9\7\60\2\2\u00d9\u00da\5\65"+
		"\33\2\u00da\u00de\3\2\2\2\u00db\u00dc\7\60\2\2\u00dc\u00de\5\65\33\2\u00dd"+
		"\u00d7\3\2\2\2\u00dd\u00db\3\2\2\2\u00de8\3\2\2\2\u00df\u00e0\t\7\2\2"+
		"\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b\35\2\2\u00e2:\3\2\2\2\13\2\u0099\u009f"+
		"\u00ac\u00c9\u00cd\u00cf\u00d5\u00dd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}