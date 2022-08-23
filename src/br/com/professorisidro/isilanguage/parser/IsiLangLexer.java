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
		T__9=10, T__10=11, T__11=12, LOGARITHM=13, SQUAREROOT=14, AP=15, FP=16, 
		SC=17, OP=18, ATTR=19, VIR=20, ACH=21, FCH=22, OPREL=23, ID=24, NUMBER=25, 
		WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "LOGARITHM", "SQUAREROOT", "AP", "FP", "SC", 
		"OP", "ATTR", "VIR", "ACH", "FCH", "OPREL", "ID", "NUMBER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'programa'", "'fimprog;'", "'numero'", "'texto'", "'booleano'", 
		"'leia'", "'escreva'", "'se'", "'senao'", "'enquanto'", "'true'", "'false'", 
		null, null, "'('", "')'", "';'", null, "'='", "','", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "LOGARITHM", "SQUAREROOT", "AP", "FP", "SC", "OP", "ATTR", "VIR", 
		"ACH", "FCH", "OPREL", "ID", "NUMBER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00d4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0092\n\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u009e\n\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00bb"+
		"\n\30\3\31\3\31\7\31\u00bf\n\31\f\31\16\31\u00c2\13\31\3\32\6\32\u00c5"+
		"\n\32\r\32\16\32\u00c6\3\32\3\32\6\32\u00cb\n\32\r\32\16\32\u00cc\5\32"+
		"\u00cf\n\32\3\33\3\33\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\3\2\b\6\2,-//\61\61``\4\2>>@@\3\2c|\5\2\62;C\\"+
		"c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00dd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\3\67\3\2\2\2\5@\3\2\2\2\7I\3\2\2\2\tP\3\2\2\2\13V\3\2\2\2\r_"+
		"\3\2\2\2\17d\3\2\2\2\21l\3\2\2\2\23o\3\2\2\2\25u\3\2\2\2\27~\3\2\2\2\31"+
		"\u0083\3\2\2\2\33\u0089\3\2\2\2\35\u0095\3\2\2\2\37\u00a1\3\2\2\2!\u00a3"+
		"\3\2\2\2#\u00a5\3\2\2\2%\u00a7\3\2\2\2\'\u00a9\3\2\2\2)\u00ab\3\2\2\2"+
		"+\u00ad\3\2\2\2-\u00af\3\2\2\2/\u00ba\3\2\2\2\61\u00bc\3\2\2\2\63\u00c4"+
		"\3\2\2\2\65\u00d0\3\2\2\2\678\7r\2\289\7t\2\29:\7q\2\2:;\7i\2\2;<\7t\2"+
		"\2<=\7c\2\2=>\7o\2\2>?\7c\2\2?\4\3\2\2\2@A\7h\2\2AB\7k\2\2BC\7o\2\2CD"+
		"\7r\2\2DE\7t\2\2EF\7q\2\2FG\7i\2\2GH\7=\2\2H\6\3\2\2\2IJ\7p\2\2JK\7w\2"+
		"\2KL\7o\2\2LM\7g\2\2MN\7t\2\2NO\7q\2\2O\b\3\2\2\2PQ\7v\2\2QR\7g\2\2RS"+
		"\7z\2\2ST\7v\2\2TU\7q\2\2U\n\3\2\2\2VW\7d\2\2WX\7q\2\2XY\7q\2\2YZ\7n\2"+
		"\2Z[\7g\2\2[\\\7c\2\2\\]\7p\2\2]^\7q\2\2^\f\3\2\2\2_`\7n\2\2`a\7g\2\2"+
		"ab\7k\2\2bc\7c\2\2c\16\3\2\2\2de\7g\2\2ef\7u\2\2fg\7e\2\2gh\7t\2\2hi\7"+
		"g\2\2ij\7x\2\2jk\7c\2\2k\20\3\2\2\2lm\7u\2\2mn\7g\2\2n\22\3\2\2\2op\7"+
		"u\2\2pq\7g\2\2qr\7p\2\2rs\7c\2\2st\7q\2\2t\24\3\2\2\2uv\7g\2\2vw\7p\2"+
		"\2wx\7s\2\2xy\7w\2\2yz\7c\2\2z{\7p\2\2{|\7v\2\2|}\7q\2\2}\26\3\2\2\2~"+
		"\177\7v\2\2\177\u0080\7t\2\2\u0080\u0081\7w\2\2\u0081\u0082\7g\2\2\u0082"+
		"\30\3\2\2\2\u0083\u0084\7h\2\2\u0084\u0085\7c\2\2\u0085\u0086\7n\2\2\u0086"+
		"\u0087\7u\2\2\u0087\u0088\7g\2\2\u0088\32\3\2\2\2\u0089\u008a\7n\2\2\u008a"+
		"\u008b\7q\2\2\u008b\u008c\7i\2\2\u008c\u008d\3\2\2\2\u008d\u008e\5\63"+
		"\32\2\u008e\u0091\5\37\20\2\u008f\u0092\5\63\32\2\u0090\u0092\5\61\31"+
		"\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094"+
		"\5!\21\2\u0094\34\3\2\2\2\u0095\u0096\7u\2\2\u0096\u0097\7s\2\2\u0097"+
		"\u0098\7t\2\2\u0098\u0099\7v\2\2\u0099\u009a\3\2\2\2\u009a\u009d\5\37"+
		"\20\2\u009b\u009e\5\63\32\2\u009c\u009e\5\61\31\2\u009d\u009b\3\2\2\2"+
		"\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\5!\21\2\u00a0\36"+
		"\3\2\2\2\u00a1\u00a2\7*\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7+\2\2\u00a4\""+
		"\3\2\2\2\u00a5\u00a6\7=\2\2\u00a6$\3\2\2\2\u00a7\u00a8\t\2\2\2\u00a8&"+
		"\3\2\2\2\u00a9\u00aa\7?\2\2\u00aa(\3\2\2\2\u00ab\u00ac\7.\2\2\u00ac*\3"+
		"\2\2\2\u00ad\u00ae\7}\2\2\u00ae,\3\2\2\2\u00af\u00b0\7\177\2\2\u00b0."+
		"\3\2\2\2\u00b1\u00bb\t\3\2\2\u00b2\u00b3\7@\2\2\u00b3\u00bb\7?\2\2\u00b4"+
		"\u00b5\7>\2\2\u00b5\u00bb\7?\2\2\u00b6\u00b7\7?\2\2\u00b7\u00bb\7?\2\2"+
		"\u00b8\u00b9\7#\2\2\u00b9\u00bb\7?\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b2"+
		"\3\2\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\60\3\2\2\2\u00bc\u00c0\t\4\2\2\u00bd\u00bf\t\5\2\2\u00be\u00bd\3\2\2"+
		"\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\62"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c5\t\6\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ce\3\2"+
		"\2\2\u00c8\u00ca\7\60\2\2\u00c9\u00cb\t\6\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2"+
		"\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\64\3\2\2\2\u00d0\u00d1"+
		"\t\7\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\b\33\2\2\u00d3\66\3\2\2\2\13"+
		"\2\u0091\u009d\u00ba\u00be\u00c0\u00c6\u00cc\u00ce\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}