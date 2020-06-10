// Generated from /home/tabuas/Desktop/uni/lfa/Projeto2020/lfa1920-g01/QuizGenerator/QuizGenerator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QuizGeneratorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, NUM=48, ID=49, WORD=50, WS=51, COMMENT=52;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_forBlock = 2, RULE_endf = 3, RULE_ifBlock = 4, 
		RULE_other = 5, RULE_instructions = 6, RULE_createQuestion = 7, RULE_assignment = 8, 
		RULE_declaration = 9, RULE_attribution = 10, RULE_expr = 11, RULE_type = 12, 
		RULE_bdAttribution = 13, RULE_questionType = 14, RULE_questionDeclaration = 15, 
		RULE_questionAttribution = 16, RULE_command = 17, RULE_mathExpr = 18, 
		RULE_randMethod = 19, RULE_testType = 20, RULE_difficulty = 21;
	public static final String[] ruleNames = {
		"program", "stat", "forBlock", "endf", "ifBlock", "other", "instructions", 
		"createQuestion", "assignment", "declaration", "attribution", "expr", 
		"type", "bdAttribution", "questionType", "questionDeclaration", "questionAttribution", 
		"command", "mathExpr", "randMethod", "testType", "difficulty"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Begin'", "'create'", "'endcreate'", "';'", "'for'", "'in'", "':'", 
		"'endfor'", "'if'", "'('", "'=='", "'.correctAnswer()'", "')'", "'endif'", 
		"'else'", "'Question'", "'.text'", "'='", "'.theme'", "'.difficulty'", 
		"'.answer'", "','", "'.name'", "'[]'", "'['", "']'", "'String'", "'int'", 
		"'double'", "'DB'", "'load'", "'.get'", "'answersMode'", "'.add'", "'rand'", 
		"'.numAnswers'", "'print'", "'*'", "'/'", "'+'", "'-'", "'.answers()'", 
		"'multipleChoice'", "'trueOrFalse'", "'easy'", "'medium'", "'hard'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"NUM", "ID", "WORD", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "QuizGenerator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QuizGeneratorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QuizGeneratorParser.ID, 0); }
		public TerminalNode EOF() { return getToken(QuizGeneratorParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__0);
			setState(45);
			match(T__1);
			setState(46);
			match(ID);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__15) | (1L << T__23) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << ID))) != 0)) {
				{
				{
				setState(47);
				stat();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(T__2);
			setState(54);
			match(EOF);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatContext extends StatContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public IfStatContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class InstStatContext extends StatContext {
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public InstStatContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class ForStatContext extends StatContext {
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public ForStatContext(StatContext ctx) { copyFrom(ctx); }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__23:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__32:
			case T__34:
			case T__36:
			case ID:
				_localctx = new InstStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				instructions();
				setState(57);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new ForStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				forBlock();
				}
				break;
			case T__8:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				ifBlock();
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

	public static class ForBlockContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(QuizGeneratorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(QuizGeneratorParser.ID, i);
		}
		public EndfContext endf() {
			return getRuleContext(EndfContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_forBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__4);
			setState(64);
			match(ID);
			setState(65);
			match(T__5);
			setState(66);
			match(ID);
			setState(67);
			match(T__6);
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				stat();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__15) | (1L << T__23) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << ID))) != 0) );
			setState(73);
			endf();
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

	public static class EndfContext extends ParserRuleContext {
		public EndfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endf; }
	}

	public final EndfContext endf() throws RecognitionException {
		EndfContext _localctx = new EndfContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_endf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__7);
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

	public static class IfBlockContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(QuizGeneratorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(QuizGeneratorParser.ID, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public OtherContext other() {
			return getRuleContext(OtherContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__8);
			setState(78);
			match(T__9);
			setState(79);
			match(ID);
			setState(80);
			match(T__10);
			setState(81);
			match(ID);
			setState(82);
			match(T__11);
			setState(83);
			match(T__12);
			setState(84);
			match(T__6);
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				stat();
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__15) | (1L << T__23) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << ID))) != 0) );
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(90);
				other();
				}
			}

			setState(93);
			match(T__13);
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

	public static class OtherContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public OtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other; }
	}

	public final OtherContext other() throws RecognitionException {
		OtherContext _localctx = new OtherContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_other);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__14);
			setState(96);
			match(T__6);
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				stat();
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__15) | (1L << T__23) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << ID))) != 0) );
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

	public static class InstructionsContext extends ParserRuleContext {
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
	 
		public InstructionsContext() { }
		public void copyFrom(InstructionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommandInstContext extends InstructionsContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CommandInstContext(InstructionsContext ctx) { copyFrom(ctx); }
	}
	public static class AssignInstContext extends InstructionsContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignInstContext(InstructionsContext ctx) { copyFrom(ctx); }
	}
	public static class QuestInstContext extends InstructionsContext {
		public CreateQuestionContext createQuestion() {
			return getRuleContext(CreateQuestionContext.class,0);
		}
		public QuestInstContext(InstructionsContext ctx) { copyFrom(ctx); }
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instructions);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AssignInstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				assignment();
				}
				break;
			case 2:
				_localctx = new CommandInstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				command();
				}
				break;
			case 3:
				_localctx = new QuestInstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				createQuestion();
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

	public static class CreateQuestionContext extends ParserRuleContext {
		public CreateQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createQuestion; }
	 
		public CreateQuestionContext() { }
		public void copyFrom(CreateQuestionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateQuestionThemeContext extends CreateQuestionContext {
		public TerminalNode ID() { return getToken(QuizGeneratorParser.ID, 0); }
		public TerminalNode WORD() { return getToken(QuizGeneratorParser.WORD, 0); }
		public CreateQuestionThemeContext(CreateQuestionContext ctx) { copyFrom(ctx); }
	}
	public static class CreateQuestionAnswerContext extends CreateQuestionContext {
		public TerminalNode ID() { return getToken(QuizGeneratorParser.ID, 0); }
		public TerminalNode WORD() { return getToken(QuizGeneratorParser.WORD, 0); }
		public TerminalNode NUM() { return getToken(QuizGeneratorParser.NUM, 0); }
		public CreateQuestionAnswerContext(CreateQuestionContext ctx) { copyFrom(ctx); }
	}
	public static class CreateQuestionDifficultyContext extends CreateQuestionContext {
		public TerminalNode ID() { return getToken(QuizGeneratorParser.ID, 0); }
		public DifficultyContext difficulty() {
			return getRuleContext(DifficultyContext.class,0);
		}
		public CreateQuestionDifficultyContext(CreateQuestionContext ctx) { copyFrom(ctx); }
	}
	public static class CreateQuestionphraseContext extends CreateQuestionContext {
		public TerminalNode ID() { return getToken(QuizGeneratorParser.ID, 0); }
		public TerminalNode WORD() { return getToken(QuizGeneratorParser.WORD, 0); }
		public CreateQuestionphraseContext(CreateQuestionContext ctx) { copyFrom(ctx); }
	}
	public static class CreateQuestionNameContext extends CreateQuestionContext {
		public TerminalNode ID() { return getToken(QuizGeneratorParser.ID, 0); }
		public TerminalNode WORD() { return getToken(QuizGeneratorParser.WORD, 0); }
		public CreateQuestionNameContext(CreateQuestionContext ctx) { copyFrom(ctx); }
	}

	public final CreateQuestionContext createQuestion() throws RecognitionException {
		CreateQuestionContext _localctx = new CreateQuestionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_createQuestion);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new CreateQuestionphraseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__15);
				setState(108);
				match(ID);
				setState(109);
				match(T__16);
				setState(110);
				match(T__17);
				setState(111);
				match(WORD);
				}
				break;
			case 2:
				_localctx = new CreateQuestionThemeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(ID);
				setState(113);
				match(T__18);
				setState(114);
				match(T__17);
				setState(115);
				match(WORD);
				}
				break;
			case 3:
				_localctx = new CreateQuestionDifficultyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(ID);
				setState(117);
				match(T__19);
				setState(118);
				match(T__17);
				setState(119);
				difficulty();
				}
				break;
			case 4:
				_localctx = new CreateQuestionAnswerContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(ID);
				setState(121);
				match(T__20);
				setState(122);
				match(T__9);
				setState(123);
				match(WORD);
				setState(124);
				match(T__21);
				setState(125);
				match(NUM);
				setState(126);
				match(T__12);
				}
				break;
			case 5:
				_localctx = new CreateQuestionNameContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				match(ID);
				setState(128);
				match(T__22);
				setState(129);
				match(T__17);
				setState(130);
				match(WORD);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarAssignContext extends AssignmentContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class QuestDeclarAssignContext extends AssignmentContext {
		public QuestionDeclarationContext questionDeclaration() {
			return getRuleContext(QuestionDeclarationContext.class,0);
		}
		public QuestDeclarAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class QuestAttribAssignContext extends AssignmentContext {
		public QuestionAttributionContext questionAttribution() {
			return getRuleContext(QuestionAttributionContext.class,0);
		}
		public QuestAttribAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class AttribAssignContext extends AssignmentContext {
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public AttribAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class BdAttribAssignContext extends AssignmentContext {
		public BdAttributionContext bdAttribution() {
			return getRuleContext(BdAttributionContext.class,0);
		}
		public BdAttribAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new DeclarAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				declaration();
				}
				break;
			case 2:
				_localctx = new AttribAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				attribution();
				}
				break;
			case 3:
				_localctx = new QuestDeclarAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				questionDeclaration();
				}
				break;
			case 4:
				_localctx = new QuestAttribAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				questionAttribution();
				}
				break;
			case 5:
				_localctx = new BdAttribAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				bdAttribution();
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarArrayContext extends DeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(QuizGeneratorParser.ID, 0); }
		public DeclarArrayContext(DeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class DeclarVarContext extends DeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(QuizGeneratorParser.ID, 0); }
		public DeclarVarContext(DeclarationContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaration);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new DeclarVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				type();
				setState(141);
				match(ID);
				}
				break;
			case 2:
				_localctx = new DeclarArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				type();
				setState(144);
				match(T__23);
				setState(145);
				match(ID);
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

	public static class AttributionContext extends ParserRuleContext {
		public AttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution; }
	 
		public AttributionContext() { }
		public void copyFrom(AttributionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttribArrayContext extends AttributionContext {
		public TerminalNode ID() { return getToken(QuizGeneratorParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttribArrayContext(AttributionContext ctx) { copyFrom(ctx); }
	}
	public static class AttribVarContext extends AttributionContext {
		public TerminalNode ID() { return getToken(QuizGeneratorParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttribVarContext(AttributionContext ctx) { copyFrom(ctx); }
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attribution);
		int _la;
		try {
			int _alt;
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new AttribVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) {
					{
					setState(149);
					type();
					}
				}

				setState(152);
				match(ID);
				setState(153);
				match(T__17);
				setState(154);
				expr();
				}
				break;
			case 2:
				_localctx = new AttribArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) {
					{
					setState(155);
					type();
					}
				}

				setState(158);
				match(T__23);
				setState(159);
				match(ID);
				setState(160);
				match(T__17);
				setState(161);
				match(T__24);
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(162);
						expr();
						setState(163);
						match(T__21);
						}
						} 
					}
					setState(169);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(170);
				expr();
				setState(171);
				match(T__25);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WordExprContext extends ExprContext {
		public TerminalNode WORD() { return getToken(QuizGeneratorParser.WORD, 0); }
		public WordExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MathContext extends ExprContext {
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public MathContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				_localctx = new WordExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(WORD);
				}
				break;
			case T__9:
			case NUM:
			case ID:
				_localctx = new MathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				mathExpr(0);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeIntContext extends TypeContext {
		public TypeIntContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class TypeStringContext extends TypeContext {
		public TypeStringContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class TypeDoubleContext extends TypeContext {
		public TypeDoubleContext(TypeContext ctx) { copyFrom(ctx); }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				_localctx = new TypeStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(T__26);
				}
				break;
			case T__27:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(T__27);
				}
				break;
			case T__28:
				_localctx = new TypeDoubleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(T__28);
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

	public static class BdAttributionContext extends ParserRuleContext {
		public BdAttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bdAttribution; }
	 
		public BdAttributionContext() { }
		public void copyFrom(BdAttributionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BdAttribContext extends BdAttributionContext {
		public TerminalNode ID() { return getToken(QuizGeneratorParser.ID, 0); }
		public TerminalNode WORD() { return getToken(QuizGeneratorParser.WORD, 0); }
		public BdAttribContext(BdAttributionContext ctx) { copyFrom(ctx); }
	}

	public final BdAttributionContext bdAttribution() throws RecognitionException {
		BdAttributionContext _localctx = new BdAttributionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bdAttribution);
		try {
			_localctx = new BdAttribContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__29);
			setState(185);
			match(ID);
			setState(186);
			match(T__17);
			setState(187);
			match(T__30);
			setState(188);
			match(T__9);
			setState(189);
			match(WORD);
			setState(190);
			match(T__12);
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

	public static class QuestionTypeContext extends ParserRuleContext {
		public QuestionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionType; }
	}

	public final QuestionTypeContext questionType() throws RecognitionException {
		QuestionTypeContext _localctx = new QuestionTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_questionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__15);
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

	public static class QuestionDeclarationContext extends ParserRuleContext {
		public QuestionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionDeclaration; }
	 
		public QuestionDeclarationContext() { }
		public void copyFrom(QuestionDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuestDeclarVarContext extends QuestionDeclarationContext {
		public QuestionTypeContext questionType() {
			return getRuleContext(QuestionTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(QuizGeneratorParser.ID, 0); }
		public QuestDeclarVarContext(QuestionDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class QuestDeclarArrayContext extends QuestionDeclarationContext {
		public QuestionTypeContext questionType() {
			return getRuleContext(QuestionTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(QuizGeneratorParser.ID, 0); }
		public QuestDeclarArrayContext(QuestionDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final QuestionDeclarationContext questionDeclaration() throws RecognitionException {
		QuestionDeclarationContext _localctx = new QuestionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_questionDeclaration);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new QuestDeclarVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				questionType();
				setState(195);
				match(ID);
				}
				break;
			case 2:
				_localctx = new QuestDeclarArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				questionType();
				setState(198);
				match(T__23);
				setState(199);
				match(ID);
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

	public static class QuestionAttributionContext extends ParserRuleContext {
		public QuestionAttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionAttribution; }
	 
		public QuestionAttributionContext() { }
		public void copyFrom(QuestionAttributionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuestAttribVarContext extends QuestionAttributionContext {
		public List<TerminalNode> ID() { return getTokens(QuizGeneratorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(QuizGeneratorParser.ID, i);
		}
		public DifficultyContext difficulty() {
			return getRuleContext(DifficultyContext.class,0);
		}
		public TerminalNode WORD() { return getToken(QuizGeneratorParser.WORD, 0); }
		public QuestionTypeContext questionType() {
			return getRuleContext(QuestionTypeContext.class,0);
		}
		public QuestAttribVarContext(QuestionAttributionContext ctx) { copyFrom(ctx); }
	}
	public static class QuestAttribArrayContext extends QuestionAttributionContext {
		public List<TerminalNode> ID() { return getTokens(QuizGeneratorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(QuizGeneratorParser.ID, i);
		}
		public TerminalNode NUM() { return getToken(QuizGeneratorParser.NUM, 0); }
		public DifficultyContext difficulty() {
			return getRuleContext(DifficultyContext.class,0);
		}
		public TerminalNode WORD() { return getToken(QuizGeneratorParser.WORD, 0); }
		public QuestionTypeContext questionType() {
			return getRuleContext(QuestionTypeContext.class,0);
		}
		public QuestAttribArrayContext(QuestionAttributionContext ctx) { copyFrom(ctx); }
	}

	public final QuestionAttributionContext questionAttribution() throws RecognitionException {
		QuestionAttributionContext _localctx = new QuestionAttributionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_questionAttribution);
		int _la;
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new QuestAttribVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(203);
					questionType();
					}
				}

				setState(206);
				match(ID);
				setState(207);
				match(T__17);
				setState(208);
				match(ID);
				setState(209);
				match(T__31);
				setState(210);
				match(T__9);
				setState(211);
				difficulty();
				setState(212);
				match(T__21);
				setState(213);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(214);
				match(T__12);
				}
				break;
			case 2:
				_localctx = new QuestAttribArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(216);
					questionType();
					}
				}

				setState(219);
				match(T__23);
				setState(220);
				match(ID);
				setState(221);
				match(T__17);
				setState(222);
				match(ID);
				setState(223);
				match(T__31);
				setState(224);
				match(T__9);
				setState(225);
				match(NUM);
				setState(226);
				match(T__21);
				setState(227);
				difficulty();
				setState(228);
				match(T__21);
				setState(229);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(230);
				match(T__12);
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

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RandCommandContext extends CommandContext {
		public RandMethodContext randMethod() {
			return getRuleContext(RandMethodContext.class,0);
		}
		public RandCommandContext(CommandContext ctx) { copyFrom(ctx); }
	}
	public static class PrintCommandContext extends CommandContext {
		public TerminalNode ID() { return getToken(QuizGeneratorParser.ID, 0); }
		public TerminalNode WORD() { return getToken(QuizGeneratorParser.WORD, 0); }
		public PrintCommandContext(CommandContext ctx) { copyFrom(ctx); }
	}
	public static class AnswerModeCommandContext extends CommandContext {
		public TestTypeContext testType() {
			return getRuleContext(TestTypeContext.class,0);
		}
		public AnswerModeCommandContext(CommandContext ctx) { copyFrom(ctx); }
	}
	public static class AddCommandContext extends CommandContext {
		public List<TerminalNode> ID() { return getTokens(QuizGeneratorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(QuizGeneratorParser.ID, i);
		}
		public AddCommandContext(CommandContext ctx) { copyFrom(ctx); }
	}
	public static class NumAnswersCommandContext extends CommandContext {
		public TerminalNode ID() { return getToken(QuizGeneratorParser.ID, 0); }
		public TerminalNode NUM() { return getToken(QuizGeneratorParser.NUM, 0); }
		public NumAnswersCommandContext(CommandContext ctx) { copyFrom(ctx); }
	}
	public static class MathExprCommandContext extends CommandContext {
		public TerminalNode ID() { return getToken(QuizGeneratorParser.ID, 0); }
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public MathExprCommandContext(CommandContext ctx) { copyFrom(ctx); }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_command);
		int _la;
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new AnswerModeCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(T__32);
				setState(235);
				match(T__17);
				setState(236);
				testType();
				}
				break;
			case 2:
				_localctx = new AddCommandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(ID);
				setState(238);
				match(T__33);
				setState(239);
				match(T__9);
				setState(240);
				match(ID);
				setState(241);
				match(T__12);
				}
				break;
			case 3:
				_localctx = new RandCommandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(T__34);
				setState(243);
				randMethod();
				}
				break;
			case 4:
				_localctx = new NumAnswersCommandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				match(ID);
				setState(245);
				match(T__35);
				setState(246);
				match(T__9);
				setState(247);
				match(NUM);
				setState(248);
				match(T__12);
				}
				break;
			case 5:
				_localctx = new PrintCommandContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				match(T__36);
				setState(250);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				_localctx = new MathExprCommandContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				match(ID);
				setState(252);
				match(T__17);
				setState(253);
				mathExpr(0);
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

	public static class MathExprContext extends ParserRuleContext {
		public MathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpr; }
	 
		public MathExprContext() { }
		public void copyFrom(MathExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddSubExprContext extends MathExprContext {
		public Token op;
		public List<MathExprContext> mathExpr() {
			return getRuleContexts(MathExprContext.class);
		}
		public MathExprContext mathExpr(int i) {
			return getRuleContext(MathExprContext.class,i);
		}
		public AddSubExprContext(MathExprContext ctx) { copyFrom(ctx); }
	}
	public static class MultDivExprContext extends MathExprContext {
		public Token op;
		public List<MathExprContext> mathExpr() {
			return getRuleContexts(MathExprContext.class);
		}
		public MathExprContext mathExpr(int i) {
			return getRuleContext(MathExprContext.class,i);
		}
		public MultDivExprContext(MathExprContext ctx) { copyFrom(ctx); }
	}
	public static class NumMathExprContext extends MathExprContext {
		public TerminalNode NUM() { return getToken(QuizGeneratorParser.NUM, 0); }
		public NumMathExprContext(MathExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthExprContext extends MathExprContext {
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public ParenthExprContext(MathExprContext ctx) { copyFrom(ctx); }
	}
	public static class IdExprContext extends MathExprContext {
		public TerminalNode ID() { return getToken(QuizGeneratorParser.ID, 0); }
		public IdExprContext(MathExprContext ctx) { copyFrom(ctx); }
	}

	public final MathExprContext mathExpr() throws RecognitionException {
		return mathExpr(0);
	}

	private MathExprContext mathExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathExprContext _localctx = new MathExprContext(_ctx, _parentState);
		MathExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_mathExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				_localctx = new NumMathExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(257);
				match(NUM);
				}
				break;
			case T__9:
				{
				_localctx = new ParenthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				match(T__9);
				setState(259);
				mathExpr(0);
				setState(260);
				match(T__12);
				}
				break;
			case ID:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(271);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivExprContext(new MathExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
						setState(265);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(266);
						((MultDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__37 || _la==T__38) ) {
							((MultDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(267);
						mathExpr(6);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new MathExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
						setState(268);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(269);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__39 || _la==T__40) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(270);
						mathExpr(5);
						}
						break;
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class RandMethodContext extends ParserRuleContext {
		public RandMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_randMethod; }
	 
		public RandMethodContext() { }
		public void copyFrom(RandMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdRandMethodContext extends RandMethodContext {
		public TerminalNode ID() { return getToken(QuizGeneratorParser.ID, 0); }
		public IdRandMethodContext(RandMethodContext ctx) { copyFrom(ctx); }
	}
	public static class AnswersRandMethodContext extends RandMethodContext {
		public TerminalNode ID() { return getToken(QuizGeneratorParser.ID, 0); }
		public AnswersRandMethodContext(RandMethodContext ctx) { copyFrom(ctx); }
	}

	public final RandMethodContext randMethod() throws RecognitionException {
		RandMethodContext _localctx = new RandMethodContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_randMethod);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new IdRandMethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(ID);
				}
				break;
			case 2:
				_localctx = new AnswersRandMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(ID);
				setState(278);
				match(T__41);
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

	public static class TestTypeContext extends ParserRuleContext {
		public TestTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testType; }
	 
		public TestTypeContext() { }
		public void copyFrom(TestTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrueOrFalseTypeContext extends TestTypeContext {
		public TrueOrFalseTypeContext(TestTypeContext ctx) { copyFrom(ctx); }
	}
	public static class MultipleChoiceTypeContext extends TestTypeContext {
		public MultipleChoiceTypeContext(TestTypeContext ctx) { copyFrom(ctx); }
	}

	public final TestTypeContext testType() throws RecognitionException {
		TestTypeContext _localctx = new TestTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_testType);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				_localctx = new MultipleChoiceTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(T__42);
				}
				break;
			case T__43:
				_localctx = new TrueOrFalseTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(T__43);
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

	public static class DifficultyContext extends ParserRuleContext {
		public DifficultyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_difficulty; }
	 
		public DifficultyContext() { }
		public void copyFrom(DifficultyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EasyDifficultyContext extends DifficultyContext {
		public EasyDifficultyContext(DifficultyContext ctx) { copyFrom(ctx); }
	}
	public static class HardDifficultyContext extends DifficultyContext {
		public HardDifficultyContext(DifficultyContext ctx) { copyFrom(ctx); }
	}
	public static class MediumDifficultyContext extends DifficultyContext {
		public MediumDifficultyContext(DifficultyContext ctx) { copyFrom(ctx); }
	}

	public final DifficultyContext difficulty() throws RecognitionException {
		DifficultyContext _localctx = new DifficultyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_difficulty);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
				_localctx = new EasyDifficultyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(T__44);
				}
				break;
			case T__45:
				_localctx = new MediumDifficultyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(T__45);
				}
				break;
			case T__46:
				_localctx = new HardDifficultyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				match(T__46);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return mathExpr_sempred((MathExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mathExpr_sempred(MathExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0125\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\7\2"+
		"\63\n\2\f\2\16\2\66\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\6\4H\n\4\r\4\16\4I\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\6\6Y\n\6\r\6\16\6Z\3\6\5\6^\n\6\3\6\3\6\3\7\3\7"+
		"\3\7\6\7e\n\7\r\7\16\7f\3\b\3\b\3\b\5\bl\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u0086\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u008d\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u0096\n\13\3\f\5\f\u0099\n\f\3\f\3\f\3\f\3\f\5\f\u009f"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00a8\n\f\f\f\16\f\u00ab\13\f\3\f"+
		"\3\f\3\f\5\f\u00b0\n\f\3\r\3\r\5\r\u00b4\n\r\3\16\3\16\3\16\5\16\u00b9"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00cc\n\21\3\22\5\22\u00cf\n\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00dc\n\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00eb\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0101\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u010a\n\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0112\n"+
		"\24\f\24\16\24\u0115\13\24\3\25\3\25\3\25\5\25\u011a\n\25\3\26\3\26\5"+
		"\26\u011e\n\26\3\27\3\27\3\27\5\27\u0123\n\27\3\27\2\3&\30\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,\2\5\3\2\63\64\3\2()\3\2*+\2\u0138"+
		"\2.\3\2\2\2\4?\3\2\2\2\6A\3\2\2\2\bM\3\2\2\2\nO\3\2\2\2\fa\3\2\2\2\16"+
		"k\3\2\2\2\20\u0085\3\2\2\2\22\u008c\3\2\2\2\24\u0095\3\2\2\2\26\u00af"+
		"\3\2\2\2\30\u00b3\3\2\2\2\32\u00b8\3\2\2\2\34\u00ba\3\2\2\2\36\u00c2\3"+
		"\2\2\2 \u00cb\3\2\2\2\"\u00ea\3\2\2\2$\u0100\3\2\2\2&\u0109\3\2\2\2(\u0119"+
		"\3\2\2\2*\u011d\3\2\2\2,\u0122\3\2\2\2./\7\3\2\2/\60\7\4\2\2\60\64\7\63"+
		"\2\2\61\63\5\4\3\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2"+
		"\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7\5\2\289\7\2\2\39\3\3\2\2\2:;\5"+
		"\16\b\2;<\7\6\2\2<@\3\2\2\2=@\5\6\4\2>@\5\n\6\2?:\3\2\2\2?=\3\2\2\2?>"+
		"\3\2\2\2@\5\3\2\2\2AB\7\7\2\2BC\7\63\2\2CD\7\b\2\2DE\7\63\2\2EG\7\t\2"+
		"\2FH\5\4\3\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\5\b\5"+
		"\2L\7\3\2\2\2MN\7\n\2\2N\t\3\2\2\2OP\7\13\2\2PQ\7\f\2\2QR\7\63\2\2RS\7"+
		"\r\2\2ST\7\63\2\2TU\7\16\2\2UV\7\17\2\2VX\7\t\2\2WY\5\4\3\2XW\3\2\2\2"+
		"YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\^\5\f\7\2]\\\3\2\2\2]^\3\2\2"+
		"\2^_\3\2\2\2_`\7\20\2\2`\13\3\2\2\2ab\7\21\2\2bd\7\t\2\2ce\5\4\3\2dc\3"+
		"\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\r\3\2\2\2hl\5\22\n\2il\5$\23\2j"+
		"l\5\20\t\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\17\3\2\2\2mn\7\22\2\2no\7\63"+
		"\2\2op\7\23\2\2pq\7\24\2\2q\u0086\7\64\2\2rs\7\63\2\2st\7\25\2\2tu\7\24"+
		"\2\2u\u0086\7\64\2\2vw\7\63\2\2wx\7\26\2\2xy\7\24\2\2y\u0086\5,\27\2z"+
		"{\7\63\2\2{|\7\27\2\2|}\7\f\2\2}~\7\64\2\2~\177\7\30\2\2\177\u0080\7\62"+
		"\2\2\u0080\u0086\7\17\2\2\u0081\u0082\7\63\2\2\u0082\u0083\7\31\2\2\u0083"+
		"\u0084\7\24\2\2\u0084\u0086\7\64\2\2\u0085m\3\2\2\2\u0085r\3\2\2\2\u0085"+
		"v\3\2\2\2\u0085z\3\2\2\2\u0085\u0081\3\2\2\2\u0086\21\3\2\2\2\u0087\u008d"+
		"\5\24\13\2\u0088\u008d\5\26\f\2\u0089\u008d\5 \21\2\u008a\u008d\5\"\22"+
		"\2\u008b\u008d\5\34\17\2\u008c\u0087\3\2\2\2\u008c\u0088\3\2\2\2\u008c"+
		"\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\23\3\2\2"+
		"\2\u008e\u008f\5\32\16\2\u008f\u0090\7\63\2\2\u0090\u0096\3\2\2\2\u0091"+
		"\u0092\5\32\16\2\u0092\u0093\7\32\2\2\u0093\u0094\7\63\2\2\u0094\u0096"+
		"\3\2\2\2\u0095\u008e\3\2\2\2\u0095\u0091\3\2\2\2\u0096\25\3\2\2\2\u0097"+
		"\u0099\5\32\16\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3"+
		"\2\2\2\u009a\u009b\7\63\2\2\u009b\u009c\7\24\2\2\u009c\u00b0\5\30\r\2"+
		"\u009d\u009f\5\32\16\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a1\7\32\2\2\u00a1\u00a2\7\63\2\2\u00a2\u00a3\7\24\2"+
		"\2\u00a3\u00a9\7\33\2\2\u00a4\u00a5\5\30\r\2\u00a5\u00a6\7\30\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00ad\5\30\r\2\u00ad\u00ae\7\34\2\2\u00ae\u00b0\3\2\2\2\u00af\u0098\3"+
		"\2\2\2\u00af\u009e\3\2\2\2\u00b0\27\3\2\2\2\u00b1\u00b4\7\64\2\2\u00b2"+
		"\u00b4\5&\24\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\31\3\2\2"+
		"\2\u00b5\u00b9\7\35\2\2\u00b6\u00b9\7\36\2\2\u00b7\u00b9\7\37\2\2\u00b8"+
		"\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\33\3\2\2"+
		"\2\u00ba\u00bb\7 \2\2\u00bb\u00bc\7\63\2\2\u00bc\u00bd\7\24\2\2\u00bd"+
		"\u00be\7!\2\2\u00be\u00bf\7\f\2\2\u00bf\u00c0\7\64\2\2\u00c0\u00c1\7\17"+
		"\2\2\u00c1\35\3\2\2\2\u00c2\u00c3\7\22\2\2\u00c3\37\3\2\2\2\u00c4\u00c5"+
		"\5\36\20\2\u00c5\u00c6\7\63\2\2\u00c6\u00cc\3\2\2\2\u00c7\u00c8\5\36\20"+
		"\2\u00c8\u00c9\7\32\2\2\u00c9\u00ca\7\63\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00c4\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cc!\3\2\2\2\u00cd\u00cf\5\36\20"+
		"\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1"+
		"\7\63\2\2\u00d1\u00d2\7\24\2\2\u00d2\u00d3\7\63\2\2\u00d3\u00d4\7\"\2"+
		"\2\u00d4\u00d5\7\f\2\2\u00d5\u00d6\5,\27\2\u00d6\u00d7\7\30\2\2\u00d7"+
		"\u00d8\t\2\2\2\u00d8\u00d9\7\17\2\2\u00d9\u00eb\3\2\2\2\u00da\u00dc\5"+
		"\36\20\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\7\32\2\2\u00de\u00df\7\63\2\2\u00df\u00e0\7\24\2\2\u00e0\u00e1"+
		"\7\63\2\2\u00e1\u00e2\7\"\2\2\u00e2\u00e3\7\f\2\2\u00e3\u00e4\7\62\2\2"+
		"\u00e4\u00e5\7\30\2\2\u00e5\u00e6\5,\27\2\u00e6\u00e7\7\30\2\2\u00e7\u00e8"+
		"\t\2\2\2\u00e8\u00e9\7\17\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00ce\3\2\2\2"+
		"\u00ea\u00db\3\2\2\2\u00eb#\3\2\2\2\u00ec\u00ed\7#\2\2\u00ed\u00ee\7\24"+
		"\2\2\u00ee\u0101\5*\26\2\u00ef\u00f0\7\63\2\2\u00f0\u00f1\7$\2\2\u00f1"+
		"\u00f2\7\f\2\2\u00f2\u00f3\7\63\2\2\u00f3\u0101\7\17\2\2\u00f4\u00f5\7"+
		"%\2\2\u00f5\u0101\5(\25\2\u00f6\u00f7\7\63\2\2\u00f7\u00f8\7&\2\2\u00f8"+
		"\u00f9\7\f\2\2\u00f9\u00fa\7\62\2\2\u00fa\u0101\7\17\2\2\u00fb\u00fc\7"+
		"\'\2\2\u00fc\u0101\t\2\2\2\u00fd\u00fe\7\63\2\2\u00fe\u00ff\7\24\2\2\u00ff"+
		"\u0101\5&\24\2\u0100\u00ec\3\2\2\2\u0100\u00ef\3\2\2\2\u0100\u00f4\3\2"+
		"\2\2\u0100\u00f6\3\2\2\2\u0100\u00fb\3\2\2\2\u0100\u00fd\3\2\2\2\u0101"+
		"%\3\2\2\2\u0102\u0103\b\24\1\2\u0103\u010a\7\62\2\2\u0104\u0105\7\f\2"+
		"\2\u0105\u0106\5&\24\2\u0106\u0107\7\17\2\2\u0107\u010a\3\2\2\2\u0108"+
		"\u010a\7\63\2\2\u0109\u0102\3\2\2\2\u0109\u0104\3\2\2\2\u0109\u0108\3"+
		"\2\2\2\u010a\u0113\3\2\2\2\u010b\u010c\f\7\2\2\u010c\u010d\t\3\2\2\u010d"+
		"\u0112\5&\24\b\u010e\u010f\f\6\2\2\u010f\u0110\t\4\2\2\u0110\u0112\5&"+
		"\24\7\u0111\u010b\3\2\2\2\u0111\u010e\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\'\3\2\2\2\u0115\u0113\3\2\2\2"+
		"\u0116\u011a\7\63\2\2\u0117\u0118\7\63\2\2\u0118\u011a\7,\2\2\u0119\u0116"+
		"\3\2\2\2\u0119\u0117\3\2\2\2\u011a)\3\2\2\2\u011b\u011e\7-\2\2\u011c\u011e"+
		"\7.\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e+\3\2\2\2\u011f\u0123"+
		"\7/\2\2\u0120\u0123\7\60\2\2\u0121\u0123\7\61\2\2\u0122\u011f\3\2\2\2"+
		"\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123-\3\2\2\2\35\64?IZ]fk\u0085"+
		"\u008c\u0095\u0098\u009e\u00a9\u00af\u00b3\u00b8\u00cb\u00ce\u00db\u00ea"+
		"\u0100\u0109\u0111\u0113\u0119\u011d\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}