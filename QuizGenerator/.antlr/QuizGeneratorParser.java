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
		RULE_program = 0, RULE_stat = 1, RULE_forBlock = 2, RULE_ifBlock = 3, 
		RULE_other = 4, RULE_instructions = 5, RULE_createQuestion = 6, RULE_assignment = 7, 
		RULE_declaration = 8, RULE_attribution = 9, RULE_expr = 10, RULE_type = 11, 
		RULE_bdAttribution = 12, RULE_questionType = 13, RULE_questionDeclaration = 14, 
		RULE_questionAttribution = 15, RULE_command = 16, RULE_mathExpr = 17, 
		RULE_randMethod = 18, RULE_testType = 19, RULE_difficulty = 20;
	public static final String[] ruleNames = {
		"program", "stat", "forBlock", "ifBlock", "other", "instructions", "createQuestion", 
		"assignment", "declaration", "attribution", "expr", "type", "bdAttribution", 
		"questionType", "questionDeclaration", "questionAttribution", "command", 
		"mathExpr", "randMethod", "testType", "difficulty"
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
			setState(42);
			match(T__0);
			setState(43);
			match(T__1);
			setState(44);
			match(ID);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__15) | (1L << T__23) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << ID))) != 0)) {
				{
				{
				setState(45);
				stat();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(T__2);
			setState(52);
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
	public static class InstMainContext extends StatContext {
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public InstMainContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class ForMainContext extends StatContext {
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public ForMainContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class IfMainContext extends StatContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public IfMainContext(StatContext ctx) { copyFrom(ctx); }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(59);
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
				_localctx = new InstMainContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				instructions();
				setState(55);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new ForMainContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				forBlock();
				}
				break;
			case T__8:
				_localctx = new IfMainContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
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
			setState(61);
			match(T__4);
			setState(62);
			match(ID);
			setState(63);
			match(T__5);
			setState(64);
			match(ID);
			setState(65);
			match(T__6);
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				stat();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__15) | (1L << T__23) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << ID))) != 0) );
			setState(71);
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
		enterRule(_localctx, 6, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__8);
			setState(74);
			match(T__9);
			setState(75);
			match(ID);
			setState(76);
			match(T__10);
			setState(77);
			match(ID);
			setState(78);
			match(T__11);
			setState(79);
			match(T__12);
			setState(80);
			match(T__6);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				stat();
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__15) | (1L << T__23) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << ID))) != 0) );
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(86);
				other();
				}
			}

			setState(89);
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
		enterRule(_localctx, 8, RULE_other);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__14);
			setState(92);
			match(T__6);
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				stat();
				}
				}
				setState(96); 
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
		enterRule(_localctx, 10, RULE_instructions);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AssignInstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				assignment();
				}
				break;
			case 2:
				_localctx = new CommandInstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				command();
				}
				break;
			case 3:
				_localctx = new QuestInstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
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
		enterRule(_localctx, 12, RULE_createQuestion);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new CreateQuestionphraseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(T__15);
				setState(104);
				match(ID);
				setState(105);
				match(T__16);
				setState(106);
				match(T__17);
				setState(107);
				match(WORD);
				}
				break;
			case 2:
				_localctx = new CreateQuestionThemeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(ID);
				setState(109);
				match(T__18);
				setState(110);
				match(T__17);
				setState(111);
				match(WORD);
				}
				break;
			case 3:
				_localctx = new CreateQuestionDifficultyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(ID);
				setState(113);
				match(T__19);
				setState(114);
				match(T__17);
				setState(115);
				difficulty();
				}
				break;
			case 4:
				_localctx = new CreateQuestionAnswerContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				match(ID);
				setState(117);
				match(T__20);
				setState(118);
				match(T__9);
				setState(119);
				match(WORD);
				setState(120);
				match(T__21);
				setState(121);
				match(NUM);
				setState(122);
				match(T__12);
				}
				break;
			case 5:
				_localctx = new CreateQuestionNameContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				match(ID);
				setState(124);
				match(T__22);
				setState(125);
				match(T__17);
				setState(126);
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
		enterRule(_localctx, 14, RULE_assignment);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new DeclarAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				declaration();
				}
				break;
			case 2:
				_localctx = new AttribAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				attribution();
				}
				break;
			case 3:
				_localctx = new QuestDeclarAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				questionDeclaration();
				}
				break;
			case 4:
				_localctx = new QuestAttribAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				questionAttribution();
				}
				break;
			case 5:
				_localctx = new BdAttribAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
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
		enterRule(_localctx, 16, RULE_declaration);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new DeclarVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				type();
				setState(137);
				match(ID);
				}
				break;
			case 2:
				_localctx = new DeclarArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				type();
				setState(140);
				match(T__23);
				setState(141);
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
		enterRule(_localctx, 18, RULE_attribution);
		int _la;
		try {
			int _alt;
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new AttribVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) {
					{
					setState(145);
					type();
					}
				}

				setState(148);
				match(ID);
				setState(149);
				match(T__17);
				setState(150);
				expr();
				}
				break;
			case 2:
				_localctx = new AttribArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) {
					{
					setState(151);
					type();
					}
				}

				setState(154);
				match(T__23);
				setState(155);
				match(ID);
				setState(156);
				match(T__17);
				setState(157);
				match(T__24);
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(158);
						expr();
						setState(159);
						match(T__21);
						}
						} 
					}
					setState(165);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(166);
				expr();
				setState(167);
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
		enterRule(_localctx, 20, RULE_expr);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				_localctx = new WordExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(WORD);
				}
				break;
			case T__9:
			case NUM:
			case ID:
				_localctx = new MathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
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
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				_localctx = new TypeStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(T__26);
				}
				break;
			case T__27:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(T__27);
				}
				break;
			case T__28:
				_localctx = new TypeDoubleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
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
		enterRule(_localctx, 24, RULE_bdAttribution);
		try {
			_localctx = new BdAttribContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__29);
			setState(181);
			match(ID);
			setState(182);
			match(T__17);
			setState(183);
			match(T__30);
			setState(184);
			match(T__9);
			setState(185);
			match(WORD);
			setState(186);
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
		enterRule(_localctx, 26, RULE_questionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
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
		enterRule(_localctx, 28, RULE_questionDeclaration);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new QuestDeclarVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				questionType();
				setState(191);
				match(ID);
				}
				break;
			case 2:
				_localctx = new QuestDeclarArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				questionType();
				setState(194);
				match(T__23);
				setState(195);
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
		enterRule(_localctx, 30, RULE_questionAttribution);
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new QuestAttribVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(199);
					questionType();
					}
				}

				setState(202);
				match(ID);
				setState(203);
				match(T__17);
				setState(204);
				match(ID);
				setState(205);
				match(T__31);
				setState(206);
				match(T__9);
				setState(207);
				difficulty();
				setState(208);
				match(T__21);
				setState(209);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(210);
				match(T__12);
				}
				break;
			case 2:
				_localctx = new QuestAttribArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(212);
					questionType();
					}
				}

				setState(215);
				match(T__23);
				setState(216);
				match(ID);
				setState(217);
				match(T__17);
				setState(218);
				match(ID);
				setState(219);
				match(T__31);
				setState(220);
				match(T__9);
				setState(221);
				match(NUM);
				setState(222);
				match(T__21);
				setState(223);
				difficulty();
				setState(224);
				match(T__21);
				setState(225);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(226);
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
		enterRule(_localctx, 32, RULE_command);
		int _la;
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new AnswerModeCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(T__32);
				setState(231);
				match(T__17);
				setState(232);
				testType();
				}
				break;
			case 2:
				_localctx = new AddCommandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(ID);
				setState(234);
				match(T__33);
				setState(235);
				match(T__9);
				setState(236);
				match(ID);
				setState(237);
				match(T__12);
				}
				break;
			case 3:
				_localctx = new RandCommandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(T__34);
				setState(239);
				randMethod();
				}
				break;
			case 4:
				_localctx = new NumAnswersCommandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(ID);
				setState(241);
				match(T__35);
				setState(242);
				match(T__9);
				setState(243);
				match(NUM);
				setState(244);
				match(T__12);
				}
				break;
			case 5:
				_localctx = new PrintCommandContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				match(T__36);
				setState(246);
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
				setState(247);
				match(ID);
				setState(248);
				match(T__17);
				setState(249);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_mathExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				_localctx = new NumMathExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(253);
				match(NUM);
				}
				break;
			case T__9:
				{
				_localctx = new ParenthExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254);
				match(T__9);
				setState(255);
				mathExpr(0);
				setState(256);
				match(T__12);
				}
				break;
			case ID:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(267);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivExprContext(new MathExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
						setState(261);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(262);
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
						setState(263);
						mathExpr(6);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new MathExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
						setState(264);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(265);
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
						setState(266);
						mathExpr(5);
						}
						break;
					}
					} 
				}
				setState(271);
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
		enterRule(_localctx, 36, RULE_randMethod);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new IdRandMethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(ID);
				}
				break;
			case 2:
				_localctx = new AnswersRandMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(ID);
				setState(274);
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
		enterRule(_localctx, 38, RULE_testType);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				_localctx = new MultipleChoiceTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(T__42);
				}
				break;
			case T__43:
				_localctx = new TrueOrFalseTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
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
		enterRule(_localctx, 40, RULE_difficulty);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
				_localctx = new EasyDifficultyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(T__44);
				}
				break;
			case T__45:
				_localctx = new MediumDifficultyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(T__45);
				}
				break;
			case T__46:
				_localctx = new HardDifficultyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
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
		case 17:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0121\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\7\2\61\n\2\f"+
		"\2\16\2\64\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\6\4F\n\4\r\4\16\4G\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\6\5U\n\5\r\5\16\5V\3\5\5\5Z\n\5\3\5\3\5\3\6\3\6\3\6\6\6a\n\6\r\6"+
		"\16\6b\3\7\3\7\3\7\5\7h\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0082\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0089\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0092"+
		"\n\n\3\13\5\13\u0095\n\13\3\13\3\13\3\13\3\13\5\13\u009b\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u00a4\n\13\f\13\16\13\u00a7\13\13\3\13"+
		"\3\13\3\13\5\13\u00ac\n\13\3\f\3\f\5\f\u00b0\n\f\3\r\3\r\3\r\5\r\u00b5"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00c8\n\20\3\21\5\21\u00cb\n\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d8\n\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e7\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00fd\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u0106\n\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u010e\n"+
		"\23\f\23\16\23\u0111\13\23\3\24\3\24\3\24\5\24\u0116\n\24\3\25\3\25\5"+
		"\25\u011a\n\25\3\26\3\26\3\26\5\26\u011f\n\26\3\26\2\3$\27\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*\2\5\3\2\63\64\3\2()\3\2*+\2\u0135\2"+
		",\3\2\2\2\4=\3\2\2\2\6?\3\2\2\2\bK\3\2\2\2\n]\3\2\2\2\fg\3\2\2\2\16\u0081"+
		"\3\2\2\2\20\u0088\3\2\2\2\22\u0091\3\2\2\2\24\u00ab\3\2\2\2\26\u00af\3"+
		"\2\2\2\30\u00b4\3\2\2\2\32\u00b6\3\2\2\2\34\u00be\3\2\2\2\36\u00c7\3\2"+
		"\2\2 \u00e6\3\2\2\2\"\u00fc\3\2\2\2$\u0105\3\2\2\2&\u0115\3\2\2\2(\u0119"+
		"\3\2\2\2*\u011e\3\2\2\2,-\7\3\2\2-.\7\4\2\2.\62\7\63\2\2/\61\5\4\3\2\60"+
		"/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62"+
		"\3\2\2\2\65\66\7\5\2\2\66\67\7\2\2\3\67\3\3\2\2\289\5\f\7\29:\7\6\2\2"+
		":>\3\2\2\2;>\5\6\4\2<>\5\b\5\2=8\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\5\3\2\2"+
		"\2?@\7\7\2\2@A\7\63\2\2AB\7\b\2\2BC\7\63\2\2CE\7\t\2\2DF\5\4\3\2ED\3\2"+
		"\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\n\2\2J\7\3\2\2\2KL\7"+
		"\13\2\2LM\7\f\2\2MN\7\63\2\2NO\7\r\2\2OP\7\63\2\2PQ\7\16\2\2QR\7\17\2"+
		"\2RT\7\t\2\2SU\5\4\3\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2"+
		"\2XZ\5\n\6\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\20\2\2\\\t\3\2\2\2]^\7"+
		"\21\2\2^`\7\t\2\2_a\5\4\3\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\13"+
		"\3\2\2\2dh\5\20\t\2eh\5\"\22\2fh\5\16\b\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2"+
		"\2h\r\3\2\2\2ij\7\22\2\2jk\7\63\2\2kl\7\23\2\2lm\7\24\2\2m\u0082\7\64"+
		"\2\2no\7\63\2\2op\7\25\2\2pq\7\24\2\2q\u0082\7\64\2\2rs\7\63\2\2st\7\26"+
		"\2\2tu\7\24\2\2u\u0082\5*\26\2vw\7\63\2\2wx\7\27\2\2xy\7\f\2\2yz\7\64"+
		"\2\2z{\7\30\2\2{|\7\62\2\2|\u0082\7\17\2\2}~\7\63\2\2~\177\7\31\2\2\177"+
		"\u0080\7\24\2\2\u0080\u0082\7\64\2\2\u0081i\3\2\2\2\u0081n\3\2\2\2\u0081"+
		"r\3\2\2\2\u0081v\3\2\2\2\u0081}\3\2\2\2\u0082\17\3\2\2\2\u0083\u0089\5"+
		"\22\n\2\u0084\u0089\5\24\13\2\u0085\u0089\5\36\20\2\u0086\u0089\5 \21"+
		"\2\u0087\u0089\5\32\16\2\u0088\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0088"+
		"\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\21\3\2\2"+
		"\2\u008a\u008b\5\30\r\2\u008b\u008c\7\63\2\2\u008c\u0092\3\2\2\2\u008d"+
		"\u008e\5\30\r\2\u008e\u008f\7\32\2\2\u008f\u0090\7\63\2\2\u0090\u0092"+
		"\3\2\2\2\u0091\u008a\3\2\2\2\u0091\u008d\3\2\2\2\u0092\23\3\2\2\2\u0093"+
		"\u0095\5\30\r\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3"+
		"\2\2\2\u0096\u0097\7\63\2\2\u0097\u0098\7\24\2\2\u0098\u00ac\5\26\f\2"+
		"\u0099\u009b\5\30\r\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009d\7\32\2\2\u009d\u009e\7\63\2\2\u009e\u009f\7\24\2"+
		"\2\u009f\u00a5\7\33\2\2\u00a0\u00a1\5\26\f\2\u00a1\u00a2\7\30\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\5\26\f\2\u00a9\u00aa\7\34\2\2\u00aa\u00ac\3\2\2\2\u00ab\u0094\3"+
		"\2\2\2\u00ab\u009a\3\2\2\2\u00ac\25\3\2\2\2\u00ad\u00b0\7\64\2\2\u00ae"+
		"\u00b0\5$\23\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\27\3\2\2"+
		"\2\u00b1\u00b5\7\35\2\2\u00b2\u00b5\7\36\2\2\u00b3\u00b5\7\37\2\2\u00b4"+
		"\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\31\3\2\2"+
		"\2\u00b6\u00b7\7 \2\2\u00b7\u00b8\7\63\2\2\u00b8\u00b9\7\24\2\2\u00b9"+
		"\u00ba\7!\2\2\u00ba\u00bb\7\f\2\2\u00bb\u00bc\7\64\2\2\u00bc\u00bd\7\17"+
		"\2\2\u00bd\33\3\2\2\2\u00be\u00bf\7\22\2\2\u00bf\35\3\2\2\2\u00c0\u00c1"+
		"\5\34\17\2\u00c1\u00c2\7\63\2\2\u00c2\u00c8\3\2\2\2\u00c3\u00c4\5\34\17"+
		"\2\u00c4\u00c5\7\32\2\2\u00c5\u00c6\7\63\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c0\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8\37\3\2\2\2\u00c9\u00cb\5\34\17"+
		"\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd"+
		"\7\63\2\2\u00cd\u00ce\7\24\2\2\u00ce\u00cf\7\63\2\2\u00cf\u00d0\7\"\2"+
		"\2\u00d0\u00d1\7\f\2\2\u00d1\u00d2\5*\26\2\u00d2\u00d3\7\30\2\2\u00d3"+
		"\u00d4\t\2\2\2\u00d4\u00d5\7\17\2\2\u00d5\u00e7\3\2\2\2\u00d6\u00d8\5"+
		"\34\17\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\7\32\2\2\u00da\u00db\7\63\2\2\u00db\u00dc\7\24\2\2\u00dc\u00dd"+
		"\7\63\2\2\u00dd\u00de\7\"\2\2\u00de\u00df\7\f\2\2\u00df\u00e0\7\62\2\2"+
		"\u00e0\u00e1\7\30\2\2\u00e1\u00e2\5*\26\2\u00e2\u00e3\7\30\2\2\u00e3\u00e4"+
		"\t\2\2\2\u00e4\u00e5\7\17\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00ca\3\2\2\2"+
		"\u00e6\u00d7\3\2\2\2\u00e7!\3\2\2\2\u00e8\u00e9\7#\2\2\u00e9\u00ea\7\24"+
		"\2\2\u00ea\u00fd\5(\25\2\u00eb\u00ec\7\63\2\2\u00ec\u00ed\7$\2\2\u00ed"+
		"\u00ee\7\f\2\2\u00ee\u00ef\7\63\2\2\u00ef\u00fd\7\17\2\2\u00f0\u00f1\7"+
		"%\2\2\u00f1\u00fd\5&\24\2\u00f2\u00f3\7\63\2\2\u00f3\u00f4\7&\2\2\u00f4"+
		"\u00f5\7\f\2\2\u00f5\u00f6\7\62\2\2\u00f6\u00fd\7\17\2\2\u00f7\u00f8\7"+
		"\'\2\2\u00f8\u00fd\t\2\2\2\u00f9\u00fa\7\63\2\2\u00fa\u00fb\7\24\2\2\u00fb"+
		"\u00fd\5$\23\2\u00fc\u00e8\3\2\2\2\u00fc\u00eb\3\2\2\2\u00fc\u00f0\3\2"+
		"\2\2\u00fc\u00f2\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fd"+
		"#\3\2\2\2\u00fe\u00ff\b\23\1\2\u00ff\u0106\7\62\2\2\u0100\u0101\7\f\2"+
		"\2\u0101\u0102\5$\23\2\u0102\u0103\7\17\2\2\u0103\u0106\3\2\2\2\u0104"+
		"\u0106\7\63\2\2\u0105\u00fe\3\2\2\2\u0105\u0100\3\2\2\2\u0105\u0104\3"+
		"\2\2\2\u0106\u010f\3\2\2\2\u0107\u0108\f\7\2\2\u0108\u0109\t\3\2\2\u0109"+
		"\u010e\5$\23\b\u010a\u010b\f\6\2\2\u010b\u010c\t\4\2\2\u010c\u010e\5$"+
		"\23\7\u010d\u0107\3\2\2\2\u010d\u010a\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110%\3\2\2\2\u0111\u010f\3\2\2\2"+
		"\u0112\u0116\7\63\2\2\u0113\u0114\7\63\2\2\u0114\u0116\7,\2\2\u0115\u0112"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0116\'\3\2\2\2\u0117\u011a\7-\2\2\u0118"+
		"\u011a\7.\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a)\3\2\2\2\u011b"+
		"\u011f\7/\2\2\u011c\u011f\7\60\2\2\u011d\u011f\7\61\2\2\u011e\u011b\3"+
		"\2\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f+\3\2\2\2\35\62=G"+
		"VYbg\u0081\u0088\u0091\u0094\u009a\u00a5\u00ab\u00af\u00b4\u00c7\u00ca"+
		"\u00d7\u00e6\u00fc\u0105\u010d\u010f\u0115\u0119\u011e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}