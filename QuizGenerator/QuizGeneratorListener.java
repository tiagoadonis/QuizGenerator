// Generated from QuizGenerator.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QuizGeneratorParser}.
 */
public interface QuizGeneratorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QuizGeneratorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(QuizGeneratorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuizGeneratorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(QuizGeneratorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instStat}
	 * labeled alternative in {@link QuizGeneratorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterInstStat(QuizGeneratorParser.InstStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instStat}
	 * labeled alternative in {@link QuizGeneratorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitInstStat(QuizGeneratorParser.InstStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStat}
	 * labeled alternative in {@link QuizGeneratorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterForStat(QuizGeneratorParser.ForStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStat}
	 * labeled alternative in {@link QuizGeneratorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitForStat(QuizGeneratorParser.ForStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link QuizGeneratorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(QuizGeneratorParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link QuizGeneratorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(QuizGeneratorParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuizGeneratorParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(QuizGeneratorParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuizGeneratorParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(QuizGeneratorParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuizGeneratorParser#endf}.
	 * @param ctx the parse tree
	 */
	void enterEndf(QuizGeneratorParser.EndfContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuizGeneratorParser#endf}.
	 * @param ctx the parse tree
	 */
	void exitEndf(QuizGeneratorParser.EndfContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuizGeneratorParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(QuizGeneratorParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuizGeneratorParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(QuizGeneratorParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuizGeneratorParser#endif}.
	 * @param ctx the parse tree
	 */
	void enterEndif(QuizGeneratorParser.EndifContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuizGeneratorParser#endif}.
	 * @param ctx the parse tree
	 */
	void exitEndif(QuizGeneratorParser.EndifContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuizGeneratorParser#other}.
	 * @param ctx the parse tree
	 */
	void enterOther(QuizGeneratorParser.OtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuizGeneratorParser#other}.
	 * @param ctx the parse tree
	 */
	void exitOther(QuizGeneratorParser.OtherContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condCorrectAnswer}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondCorrectAnswer(QuizGeneratorParser.CondCorrectAnswerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condCorrectAnswer}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondCorrectAnswer(QuizGeneratorParser.CondCorrectAnswerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condAnd}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondAnd(QuizGeneratorParser.CondAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condAnd}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondAnd(QuizGeneratorParser.CondAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condOr}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondOr(QuizGeneratorParser.CondOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condOr}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondOr(QuizGeneratorParser.CondOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condNot}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondNot(QuizGeneratorParser.CondNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condNot}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondNot(QuizGeneratorParser.CondNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condEquals}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondEquals(QuizGeneratorParser.CondEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condEquals}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondEquals(QuizGeneratorParser.CondEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condBigEq}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondBigEq(QuizGeneratorParser.CondBigEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condBigEq}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondBigEq(QuizGeneratorParser.CondBigEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condLowEq}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondLowEq(QuizGeneratorParser.CondLowEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condLowEq}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondLowEq(QuizGeneratorParser.CondLowEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condBig}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondBig(QuizGeneratorParser.CondBigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condBig}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondBig(QuizGeneratorParser.CondBigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condLow}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondLow(QuizGeneratorParser.CondLowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condLow}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondLow(QuizGeneratorParser.CondLowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignInst}
	 * labeled alternative in {@link QuizGeneratorParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterAssignInst(QuizGeneratorParser.AssignInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignInst}
	 * labeled alternative in {@link QuizGeneratorParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitAssignInst(QuizGeneratorParser.AssignInstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commandInst}
	 * labeled alternative in {@link QuizGeneratorParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterCommandInst(QuizGeneratorParser.CommandInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commandInst}
	 * labeled alternative in {@link QuizGeneratorParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitCommandInst(QuizGeneratorParser.CommandInstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code questInst}
	 * labeled alternative in {@link QuizGeneratorParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterQuestInst(QuizGeneratorParser.QuestInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code questInst}
	 * labeled alternative in {@link QuizGeneratorParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitQuestInst(QuizGeneratorParser.QuestInstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createQuestionphrase}
	 * labeled alternative in {@link QuizGeneratorParser#createQuestion}.
	 * @param ctx the parse tree
	 */
	void enterCreateQuestionphrase(QuizGeneratorParser.CreateQuestionphraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createQuestionphrase}
	 * labeled alternative in {@link QuizGeneratorParser#createQuestion}.
	 * @param ctx the parse tree
	 */
	void exitCreateQuestionphrase(QuizGeneratorParser.CreateQuestionphraseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createQuestionTheme}
	 * labeled alternative in {@link QuizGeneratorParser#createQuestion}.
	 * @param ctx the parse tree
	 */
	void enterCreateQuestionTheme(QuizGeneratorParser.CreateQuestionThemeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createQuestionTheme}
	 * labeled alternative in {@link QuizGeneratorParser#createQuestion}.
	 * @param ctx the parse tree
	 */
	void exitCreateQuestionTheme(QuizGeneratorParser.CreateQuestionThemeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createQuestionDifficulty}
	 * labeled alternative in {@link QuizGeneratorParser#createQuestion}.
	 * @param ctx the parse tree
	 */
	void enterCreateQuestionDifficulty(QuizGeneratorParser.CreateQuestionDifficultyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createQuestionDifficulty}
	 * labeled alternative in {@link QuizGeneratorParser#createQuestion}.
	 * @param ctx the parse tree
	 */
	void exitCreateQuestionDifficulty(QuizGeneratorParser.CreateQuestionDifficultyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createQuestionAnswer}
	 * labeled alternative in {@link QuizGeneratorParser#createQuestion}.
	 * @param ctx the parse tree
	 */
	void enterCreateQuestionAnswer(QuizGeneratorParser.CreateQuestionAnswerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createQuestionAnswer}
	 * labeled alternative in {@link QuizGeneratorParser#createQuestion}.
	 * @param ctx the parse tree
	 */
	void exitCreateQuestionAnswer(QuizGeneratorParser.CreateQuestionAnswerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createQuestionName}
	 * labeled alternative in {@link QuizGeneratorParser#createQuestion}.
	 * @param ctx the parse tree
	 */
	void enterCreateQuestionName(QuizGeneratorParser.CreateQuestionNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createQuestionName}
	 * labeled alternative in {@link QuizGeneratorParser#createQuestion}.
	 * @param ctx the parse tree
	 */
	void exitCreateQuestionName(QuizGeneratorParser.CreateQuestionNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarAssign}
	 * labeled alternative in {@link QuizGeneratorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterDeclarAssign(QuizGeneratorParser.DeclarAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarAssign}
	 * labeled alternative in {@link QuizGeneratorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitDeclarAssign(QuizGeneratorParser.DeclarAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attribAssign}
	 * labeled alternative in {@link QuizGeneratorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAttribAssign(QuizGeneratorParser.AttribAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attribAssign}
	 * labeled alternative in {@link QuizGeneratorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAttribAssign(QuizGeneratorParser.AttribAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code questDeclarAssign}
	 * labeled alternative in {@link QuizGeneratorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterQuestDeclarAssign(QuizGeneratorParser.QuestDeclarAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code questDeclarAssign}
	 * labeled alternative in {@link QuizGeneratorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitQuestDeclarAssign(QuizGeneratorParser.QuestDeclarAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code questAttribAssign}
	 * labeled alternative in {@link QuizGeneratorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterQuestAttribAssign(QuizGeneratorParser.QuestAttribAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code questAttribAssign}
	 * labeled alternative in {@link QuizGeneratorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitQuestAttribAssign(QuizGeneratorParser.QuestAttribAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bdAttribAssign}
	 * labeled alternative in {@link QuizGeneratorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterBdAttribAssign(QuizGeneratorParser.BdAttribAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bdAttribAssign}
	 * labeled alternative in {@link QuizGeneratorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitBdAttribAssign(QuizGeneratorParser.BdAttribAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarVar}
	 * labeled alternative in {@link QuizGeneratorParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclarVar(QuizGeneratorParser.DeclarVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarVar}
	 * labeled alternative in {@link QuizGeneratorParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclarVar(QuizGeneratorParser.DeclarVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarArray}
	 * labeled alternative in {@link QuizGeneratorParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclarArray(QuizGeneratorParser.DeclarArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarArray}
	 * labeled alternative in {@link QuizGeneratorParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclarArray(QuizGeneratorParser.DeclarArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attribVar}
	 * labeled alternative in {@link QuizGeneratorParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterAttribVar(QuizGeneratorParser.AttribVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attribVar}
	 * labeled alternative in {@link QuizGeneratorParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitAttribVar(QuizGeneratorParser.AttribVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attribArray}
	 * labeled alternative in {@link QuizGeneratorParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterAttribArray(QuizGeneratorParser.AttribArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attribArray}
	 * labeled alternative in {@link QuizGeneratorParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitAttribArray(QuizGeneratorParser.AttribArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wordExpr}
	 * labeled alternative in {@link QuizGeneratorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWordExpr(QuizGeneratorParser.WordExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wordExpr}
	 * labeled alternative in {@link QuizGeneratorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWordExpr(QuizGeneratorParser.WordExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code math}
	 * labeled alternative in {@link QuizGeneratorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMath(QuizGeneratorParser.MathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code math}
	 * labeled alternative in {@link QuizGeneratorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMath(QuizGeneratorParser.MathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeString}
	 * labeled alternative in {@link QuizGeneratorParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeString(QuizGeneratorParser.TypeStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeString}
	 * labeled alternative in {@link QuizGeneratorParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeString(QuizGeneratorParser.TypeStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link QuizGeneratorParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeInt(QuizGeneratorParser.TypeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link QuizGeneratorParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeInt(QuizGeneratorParser.TypeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeDouble}
	 * labeled alternative in {@link QuizGeneratorParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeDouble(QuizGeneratorParser.TypeDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeDouble}
	 * labeled alternative in {@link QuizGeneratorParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeDouble(QuizGeneratorParser.TypeDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bdAttrib}
	 * labeled alternative in {@link QuizGeneratorParser#bdAttribution}.
	 * @param ctx the parse tree
	 */
	void enterBdAttrib(QuizGeneratorParser.BdAttribContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bdAttrib}
	 * labeled alternative in {@link QuizGeneratorParser#bdAttribution}.
	 * @param ctx the parse tree
	 */
	void exitBdAttrib(QuizGeneratorParser.BdAttribContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuizGeneratorParser#questionType}.
	 * @param ctx the parse tree
	 */
	void enterQuestionType(QuizGeneratorParser.QuestionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuizGeneratorParser#questionType}.
	 * @param ctx the parse tree
	 */
	void exitQuestionType(QuizGeneratorParser.QuestionTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code questDeclarVar}
	 * labeled alternative in {@link QuizGeneratorParser#questionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterQuestDeclarVar(QuizGeneratorParser.QuestDeclarVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code questDeclarVar}
	 * labeled alternative in {@link QuizGeneratorParser#questionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitQuestDeclarVar(QuizGeneratorParser.QuestDeclarVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code questDeclarArray}
	 * labeled alternative in {@link QuizGeneratorParser#questionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterQuestDeclarArray(QuizGeneratorParser.QuestDeclarArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code questDeclarArray}
	 * labeled alternative in {@link QuizGeneratorParser#questionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitQuestDeclarArray(QuizGeneratorParser.QuestDeclarArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code questAttribVar}
	 * labeled alternative in {@link QuizGeneratorParser#questionAttribution}.
	 * @param ctx the parse tree
	 */
	void enterQuestAttribVar(QuizGeneratorParser.QuestAttribVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code questAttribVar}
	 * labeled alternative in {@link QuizGeneratorParser#questionAttribution}.
	 * @param ctx the parse tree
	 */
	void exitQuestAttribVar(QuizGeneratorParser.QuestAttribVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code questAttribArray}
	 * labeled alternative in {@link QuizGeneratorParser#questionAttribution}.
	 * @param ctx the parse tree
	 */
	void enterQuestAttribArray(QuizGeneratorParser.QuestAttribArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code questAttribArray}
	 * labeled alternative in {@link QuizGeneratorParser#questionAttribution}.
	 * @param ctx the parse tree
	 */
	void exitQuestAttribArray(QuizGeneratorParser.QuestAttribArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code answerModeCommand}
	 * labeled alternative in {@link QuizGeneratorParser#command}.
	 * @param ctx the parse tree
	 */
	void enterAnswerModeCommand(QuizGeneratorParser.AnswerModeCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code answerModeCommand}
	 * labeled alternative in {@link QuizGeneratorParser#command}.
	 * @param ctx the parse tree
	 */
	void exitAnswerModeCommand(QuizGeneratorParser.AnswerModeCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addCommand}
	 * labeled alternative in {@link QuizGeneratorParser#command}.
	 * @param ctx the parse tree
	 */
	void enterAddCommand(QuizGeneratorParser.AddCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addCommand}
	 * labeled alternative in {@link QuizGeneratorParser#command}.
	 * @param ctx the parse tree
	 */
	void exitAddCommand(QuizGeneratorParser.AddCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code randCommand}
	 * labeled alternative in {@link QuizGeneratorParser#command}.
	 * @param ctx the parse tree
	 */
	void enterRandCommand(QuizGeneratorParser.RandCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code randCommand}
	 * labeled alternative in {@link QuizGeneratorParser#command}.
	 * @param ctx the parse tree
	 */
	void exitRandCommand(QuizGeneratorParser.RandCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numAnswersCommand}
	 * labeled alternative in {@link QuizGeneratorParser#command}.
	 * @param ctx the parse tree
	 */
	void enterNumAnswersCommand(QuizGeneratorParser.NumAnswersCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numAnswersCommand}
	 * labeled alternative in {@link QuizGeneratorParser#command}.
	 * @param ctx the parse tree
	 */
	void exitNumAnswersCommand(QuizGeneratorParser.NumAnswersCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printCommand}
	 * labeled alternative in {@link QuizGeneratorParser#command}.
	 * @param ctx the parse tree
	 */
	void enterPrintCommand(QuizGeneratorParser.PrintCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printCommand}
	 * labeled alternative in {@link QuizGeneratorParser#command}.
	 * @param ctx the parse tree
	 */
	void exitPrintCommand(QuizGeneratorParser.PrintCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code userAnswer}
	 * labeled alternative in {@link QuizGeneratorParser#command}.
	 * @param ctx the parse tree
	 */
	void enterUserAnswer(QuizGeneratorParser.UserAnswerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code userAnswer}
	 * labeled alternative in {@link QuizGeneratorParser#command}.
	 * @param ctx the parse tree
	 */
	void exitUserAnswer(QuizGeneratorParser.UserAnswerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link QuizGeneratorParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(QuizGeneratorParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link QuizGeneratorParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(QuizGeneratorParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multDivExpr}
	 * labeled alternative in {@link QuizGeneratorParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultDivExpr(QuizGeneratorParser.MultDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multDivExpr}
	 * labeled alternative in {@link QuizGeneratorParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultDivExpr(QuizGeneratorParser.MultDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numMathExpr}
	 * labeled alternative in {@link QuizGeneratorParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterNumMathExpr(QuizGeneratorParser.NumMathExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numMathExpr}
	 * labeled alternative in {@link QuizGeneratorParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitNumMathExpr(QuizGeneratorParser.NumMathExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthExpr}
	 * labeled alternative in {@link QuizGeneratorParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenthExpr(QuizGeneratorParser.ParenthExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthExpr}
	 * labeled alternative in {@link QuizGeneratorParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenthExpr(QuizGeneratorParser.ParenthExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link QuizGeneratorParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(QuizGeneratorParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link QuizGeneratorParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(QuizGeneratorParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idRandMethod}
	 * labeled alternative in {@link QuizGeneratorParser#randMethod}.
	 * @param ctx the parse tree
	 */
	void enterIdRandMethod(QuizGeneratorParser.IdRandMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idRandMethod}
	 * labeled alternative in {@link QuizGeneratorParser#randMethod}.
	 * @param ctx the parse tree
	 */
	void exitIdRandMethod(QuizGeneratorParser.IdRandMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code answersRandMethod}
	 * labeled alternative in {@link QuizGeneratorParser#randMethod}.
	 * @param ctx the parse tree
	 */
	void enterAnswersRandMethod(QuizGeneratorParser.AnswersRandMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code answersRandMethod}
	 * labeled alternative in {@link QuizGeneratorParser#randMethod}.
	 * @param ctx the parse tree
	 */
	void exitAnswersRandMethod(QuizGeneratorParser.AnswersRandMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleChoiceType}
	 * labeled alternative in {@link QuizGeneratorParser#testType}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceType(QuizGeneratorParser.MultipleChoiceTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleChoiceType}
	 * labeled alternative in {@link QuizGeneratorParser#testType}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceType(QuizGeneratorParser.MultipleChoiceTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueOrFalseType}
	 * labeled alternative in {@link QuizGeneratorParser#testType}.
	 * @param ctx the parse tree
	 */
	void enterTrueOrFalseType(QuizGeneratorParser.TrueOrFalseTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueOrFalseType}
	 * labeled alternative in {@link QuizGeneratorParser#testType}.
	 * @param ctx the parse tree
	 */
	void exitTrueOrFalseType(QuizGeneratorParser.TrueOrFalseTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code easyDifficulty}
	 * labeled alternative in {@link QuizGeneratorParser#difficulty}.
	 * @param ctx the parse tree
	 */
	void enterEasyDifficulty(QuizGeneratorParser.EasyDifficultyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code easyDifficulty}
	 * labeled alternative in {@link QuizGeneratorParser#difficulty}.
	 * @param ctx the parse tree
	 */
	void exitEasyDifficulty(QuizGeneratorParser.EasyDifficultyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mediumDifficulty}
	 * labeled alternative in {@link QuizGeneratorParser#difficulty}.
	 * @param ctx the parse tree
	 */
	void enterMediumDifficulty(QuizGeneratorParser.MediumDifficultyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mediumDifficulty}
	 * labeled alternative in {@link QuizGeneratorParser#difficulty}.
	 * @param ctx the parse tree
	 */
	void exitMediumDifficulty(QuizGeneratorParser.MediumDifficultyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hardDifficulty}
	 * labeled alternative in {@link QuizGeneratorParser#difficulty}.
	 * @param ctx the parse tree
	 */
	void enterHardDifficulty(QuizGeneratorParser.HardDifficultyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hardDifficulty}
	 * labeled alternative in {@link QuizGeneratorParser#difficulty}.
	 * @param ctx the parse tree
	 */
	void exitHardDifficulty(QuizGeneratorParser.HardDifficultyContext ctx);
}