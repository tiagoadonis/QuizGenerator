// Generated from QuizGenerator.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QuizGeneratorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QuizGeneratorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QuizGeneratorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(QuizGeneratorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instStat}
	 * labeled alternative in {@link QuizGeneratorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstStat(QuizGeneratorParser.InstStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStat}
	 * labeled alternative in {@link QuizGeneratorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStat(QuizGeneratorParser.ForStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link QuizGeneratorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(QuizGeneratorParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuizGeneratorParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(QuizGeneratorParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuizGeneratorParser#endf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndf(QuizGeneratorParser.EndfContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuizGeneratorParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(QuizGeneratorParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuizGeneratorParser#endif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndif(QuizGeneratorParser.EndifContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuizGeneratorParser#other}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther(QuizGeneratorParser.OtherContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condCorrectAnswer}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondCorrectAnswer(QuizGeneratorParser.CondCorrectAnswerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condAnd}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondAnd(QuizGeneratorParser.CondAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condOr}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOr(QuizGeneratorParser.CondOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condNot}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondNot(QuizGeneratorParser.CondNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condEquals}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondEquals(QuizGeneratorParser.CondEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condBigEq}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondBigEq(QuizGeneratorParser.CondBigEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condLowEq}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondLowEq(QuizGeneratorParser.CondLowEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condBig}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondBig(QuizGeneratorParser.CondBigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condLow}
	 * labeled alternative in {@link QuizGeneratorParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondLow(QuizGeneratorParser.CondLowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignInst}
	 * labeled alternative in {@link QuizGeneratorParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignInst(QuizGeneratorParser.AssignInstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commandInst}
	 * labeled alternative in {@link QuizGeneratorParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandInst(QuizGeneratorParser.CommandInstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code questInst}
	 * labeled alternative in {@link QuizGeneratorParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestInst(QuizGeneratorParser.QuestInstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createQuestionphrase}
	 * labeled alternative in {@link QuizGeneratorParser#createQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateQuestionphrase(QuizGeneratorParser.CreateQuestionphraseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createQuestionTheme}
	 * labeled alternative in {@link QuizGeneratorParser#createQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateQuestionTheme(QuizGeneratorParser.CreateQuestionThemeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createQuestionDifficulty}
	 * labeled alternative in {@link QuizGeneratorParser#createQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateQuestionDifficulty(QuizGeneratorParser.CreateQuestionDifficultyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createQuestionAnswer}
	 * labeled alternative in {@link QuizGeneratorParser#createQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateQuestionAnswer(QuizGeneratorParser.CreateQuestionAnswerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createQuestionName}
	 * labeled alternative in {@link QuizGeneratorParser#createQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateQuestionName(QuizGeneratorParser.CreateQuestionNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarAssign}
	 * labeled alternative in {@link QuizGeneratorParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarAssign(QuizGeneratorParser.DeclarAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attribAssign}
	 * labeled alternative in {@link QuizGeneratorParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribAssign(QuizGeneratorParser.AttribAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code questDeclarAssign}
	 * labeled alternative in {@link QuizGeneratorParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestDeclarAssign(QuizGeneratorParser.QuestDeclarAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code questAttribAssign}
	 * labeled alternative in {@link QuizGeneratorParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestAttribAssign(QuizGeneratorParser.QuestAttribAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bdAttribAssign}
	 * labeled alternative in {@link QuizGeneratorParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBdAttribAssign(QuizGeneratorParser.BdAttribAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarVar}
	 * labeled alternative in {@link QuizGeneratorParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarVar(QuizGeneratorParser.DeclarVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarArray}
	 * labeled alternative in {@link QuizGeneratorParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarArray(QuizGeneratorParser.DeclarArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attribVar}
	 * labeled alternative in {@link QuizGeneratorParser#attribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribVar(QuizGeneratorParser.AttribVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attribArray}
	 * labeled alternative in {@link QuizGeneratorParser#attribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribArray(QuizGeneratorParser.AttribArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wordExpr}
	 * labeled alternative in {@link QuizGeneratorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordExpr(QuizGeneratorParser.WordExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code math}
	 * labeled alternative in {@link QuizGeneratorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath(QuizGeneratorParser.MathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeString}
	 * labeled alternative in {@link QuizGeneratorParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeString(QuizGeneratorParser.TypeStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link QuizGeneratorParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(QuizGeneratorParser.TypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeDouble}
	 * labeled alternative in {@link QuizGeneratorParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDouble(QuizGeneratorParser.TypeDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bdAttrib}
	 * labeled alternative in {@link QuizGeneratorParser#bdAttribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBdAttrib(QuizGeneratorParser.BdAttribContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuizGeneratorParser#questionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionType(QuizGeneratorParser.QuestionTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code questDeclarVar}
	 * labeled alternative in {@link QuizGeneratorParser#questionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestDeclarVar(QuizGeneratorParser.QuestDeclarVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code questDeclarArray}
	 * labeled alternative in {@link QuizGeneratorParser#questionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestDeclarArray(QuizGeneratorParser.QuestDeclarArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code questAttribVar}
	 * labeled alternative in {@link QuizGeneratorParser#questionAttribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestAttribVar(QuizGeneratorParser.QuestAttribVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code questAttribArray}
	 * labeled alternative in {@link QuizGeneratorParser#questionAttribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestAttribArray(QuizGeneratorParser.QuestAttribArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code answerModeCommand}
	 * labeled alternative in {@link QuizGeneratorParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswerModeCommand(QuizGeneratorParser.AnswerModeCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addCommand}
	 * labeled alternative in {@link QuizGeneratorParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddCommand(QuizGeneratorParser.AddCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code randCommand}
	 * labeled alternative in {@link QuizGeneratorParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandCommand(QuizGeneratorParser.RandCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numAnswersCommand}
	 * labeled alternative in {@link QuizGeneratorParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumAnswersCommand(QuizGeneratorParser.NumAnswersCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printCommand}
	 * labeled alternative in {@link QuizGeneratorParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCommand(QuizGeneratorParser.PrintCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code userAnswer}
	 * labeled alternative in {@link QuizGeneratorParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserAnswer(QuizGeneratorParser.UserAnswerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link QuizGeneratorParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(QuizGeneratorParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multDivExpr}
	 * labeled alternative in {@link QuizGeneratorParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivExpr(QuizGeneratorParser.MultDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numMathExpr}
	 * labeled alternative in {@link QuizGeneratorParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumMathExpr(QuizGeneratorParser.NumMathExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthExpr}
	 * labeled alternative in {@link QuizGeneratorParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthExpr(QuizGeneratorParser.ParenthExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link QuizGeneratorParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(QuizGeneratorParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idRandMethod}
	 * labeled alternative in {@link QuizGeneratorParser#randMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdRandMethod(QuizGeneratorParser.IdRandMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code answersRandMethod}
	 * labeled alternative in {@link QuizGeneratorParser#randMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswersRandMethod(QuizGeneratorParser.AnswersRandMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleChoiceType}
	 * labeled alternative in {@link QuizGeneratorParser#testType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceType(QuizGeneratorParser.MultipleChoiceTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueOrFalseType}
	 * labeled alternative in {@link QuizGeneratorParser#testType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueOrFalseType(QuizGeneratorParser.TrueOrFalseTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code easyDifficulty}
	 * labeled alternative in {@link QuizGeneratorParser#difficulty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEasyDifficulty(QuizGeneratorParser.EasyDifficultyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mediumDifficulty}
	 * labeled alternative in {@link QuizGeneratorParser#difficulty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediumDifficulty(QuizGeneratorParser.MediumDifficultyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hardDifficulty}
	 * labeled alternative in {@link QuizGeneratorParser#difficulty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHardDifficulty(QuizGeneratorParser.HardDifficultyContext ctx);
}