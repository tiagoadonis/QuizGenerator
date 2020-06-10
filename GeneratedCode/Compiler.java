import org.stringtemplate.v4.*;
import java.util.*;

public class Compiler extends QuizGeneratorBaseVisitor<ST> {

	private STGroup templates = new STGroupFile("StringTemplates.stg");
	private int ansCount = 1;

   @Override public ST visitProgram(QuizGeneratorParser.ProgramContext ctx) {
      ST res = templates.getInstanceOf("module");
      Iterator<QuizGeneratorParser.StatContext> iter = ctx.stat().iterator();
      while(iter.hasNext()){
		  res.add("stat", visit(iter.next()).render());
	  }
      return res;
   }

   @Override public ST visitInstStat(QuizGeneratorParser.InstStatContext ctx) {
      ST res = templates.getInstanceOf("stats");
      res.add("stat", visit(ctx.instructions())); 
      return res;
   }

   @Override public ST visitForStat(QuizGeneratorParser.ForStatContext ctx) {
      ST res = templates.getInstanceOf("stats");
      res.add("stat", visit(ctx.forBlock()));
      return res;
   }

   @Override public ST visitIfStat(QuizGeneratorParser.IfStatContext ctx) {
      ST res = templates.getInstanceOf("stats");
      res.add("stat", visit(ctx.ifBlock()));
      return res;
   }

   @Override public ST visitForBlock(QuizGeneratorParser.ForBlockContext ctx) {
      /*ST res = template.getInstanceOf("forBlock");
      res.add("elemType", ); // como tiro o tipo da variável????
      res.add("elem", ctx.ID(0).getText());
      res.add("list", ctx.ID(1).getText());
      Iterator<QuizGeneratorParser.StatContext> iter = ctx.stat().iterator();
      while(iter.hasNext()){
		  res.add("stat", visit(iter.next()));
	  }
      return res;*/
      return visitChildren(ctx);
   }

   @Override public ST visitIfBlock(QuizGeneratorParser.IfBlockContext ctx) {
      ST res = templates.getInstanceOf("ifBlock");
      res.add("elem1", ctx.ID(0).getText());
      res.add("elem2", ctx.ID(1).getText());
      Iterator<QuizGeneratorParser.StatContext> iter = ctx.stat().iterator();
      while(iter.hasNext()){
		res.add("stat", visit(iter.next()));
	  }
	  if(ctx.other() != null){
		res.add("elseStat", visit(ctx.other()));
	  }
      return res;
   }

   @Override public ST visitOther(QuizGeneratorParser.OtherContext ctx) {
      ST res = templates.getInstanceOf("stats");
      Iterator<QuizGeneratorParser.StatContext> iter = ctx.stat().iterator();
      while(iter.hasNext()){
		res.add("stat", visit(iter.next()));
	  }
      return res;
   }

   @Override public ST visitAssignInst(QuizGeneratorParser.AssignInstContext ctx) {
      ST res = templates.getInstanceOf("stats");
      res.add("stat", visit(ctx.assignment()));
      return res;
   }

   @Override public ST visitCommandInst(QuizGeneratorParser.CommandInstContext ctx) {
      ST res = templates.getInstanceOf("stats");
      res.add("stat", visit(ctx.command()));
      return res;
   }

   @Override public ST visitQuestInst(QuizGeneratorParser.QuestInstContext ctx) {
      ST res = templates.getInstanceOf("stats");
      res.add("stat", visit(ctx.createQuestion()));
      return res;
   }

   @Override public ST visitCreateQuestionphrase(QuizGeneratorParser.CreateQuestionphraseContext ctx) {
      // tem que garantir que se a perguta não foi anteriormente criada, tem que criar agora, se já foi criada é só adicionar o texto
      // ver como o tábuas fez na semantic check
      ST res = templates.getInstanceOf("questionText");
      res.add("name", ctx.ID().getText());
      res.add("text", ctx.WORD().getText());
      return res;
   }

   @Override public ST visitCreateQuestionTheme(QuizGeneratorParser.CreateQuestionThemeContext ctx) {
      // Passei á frente
      return visitChildren(ctx);
   }

   @Override public ST visitCreateQuestionDifficulty(QuizGeneratorParser.CreateQuestionDifficultyContext ctx) {
      // verificar se ID já existe
      ST res = templates.getInstanceOf("questionDifficulty");
      res.add("name", ctx.ID().getText());
      res.add("dif", visit(ctx.difficulty()));
      return res;
   }

   @Override public ST visitCreateQuestionAnswer(QuizGeneratorParser.CreateQuestionAnswerContext ctx) {
	  // preciso guardar o ID para saber onde adicionar as respostas 
      ST res = templates.getInstanceOf("questionAnswer");
      res.add("name", "ans"+this.ansCount);
      res.add("text", ctx.WORD().getText());
      res.add("points", ctx.NUM().getText());
      this.ansCount++;
      return res;
   }

   @Override public ST visitCreateQuestionName(QuizGeneratorParser.CreateQuestionNameContext ctx) {
      return visitChildren(ctx);//PASSEI Á FRENTE!!!!!!!!!!!!
   }

   @Override public ST visitDeclarAssign(QuizGeneratorParser.DeclarAssignContext ctx) {
      ST res = templates.getInstanceOf("stats");
      res.add("stat", visit(ctx.declaration()));
      return res;
   }

   @Override public ST visitAttribAssign(QuizGeneratorParser.AttribAssignContext ctx) {
      ST res = templates.getInstanceOf("stats");
      res.add("stat", visit(ctx.attribution()));
      return res;
   }

   @Override public ST visitQuestDeclarAssign(QuizGeneratorParser.QuestDeclarAssignContext ctx) {
      ST res = templates.getInstanceOf("stats");
      res.add("stat", visit(ctx.questionDeclaration()));
      return res;
   }

   @Override public ST visitQuestAttribAssign(QuizGeneratorParser.QuestAttribAssignContext ctx) {
      ST res = templates.getInstanceOf("stats");
      res.add("stat", visit(ctx.questionAttribution()));
      return res;
   }

   @Override public ST visitBdAttribAssign(QuizGeneratorParser.BdAttribAssignContext ctx) {
      ST res = templates.getInstanceOf("stats");
      res.add("stat", visit(ctx.bdAttribution()));
      return res;
   }

   @Override public ST visitDeclarVar(QuizGeneratorParser.DeclarVarContext ctx) {
      ST res = templates.getInstanceOf("declarVar");
	  res.add("type", visit(ctx.type()));
	  res.add("name", ctx.ID().getText());
	  return res;
   }

   @Override public ST visitDeclarArray(QuizGeneratorParser.DeclarArrayContext ctx) {
      ST res = templates.getInstanceOf("declarArr");
	  res.add("type", visit(ctx.type()));
	  res.add("name", ctx.ID().getText());
	  return res;
   }

   @Override public ST visitAttribVar(QuizGeneratorParser.AttribVarContext ctx) {
      ST res = templates.getInstanceOf("attribVar");
      if(ctx.type() != null){
		res.add("type", visit(ctx.type()));  
      }
      res.add("name", ctx.ID().getText());
      res.add("value", visit(ctx.expr()));
      return res;
   }

   @Override public ST visitAttribArray(QuizGeneratorParser.AttribArrayContext ctx) {
	  ST res = templates.getInstanceOf("attribArr");
      if(ctx.type() != null){
		 res.add("type", visit(ctx.type()));
	  }
	  res.add("name", ctx.ID().getText());
	  if(ctx.expr() != null){
		 Iterator<QuizGeneratorParser.ExprContext> iter = ctx.expr().iterator(); 
		 while(iter.hasNext()){
			res.add("value", (iter.next()).getText());
		 }
	  }
	  else{
		 res.add("value", visit(ctx.expr(1)));
	  }
      return res;
   }

   @Override public ST visitWordExpr(QuizGeneratorParser.WordExprContext ctx) { 
      ST res = templates.getInstanceOf("atom");
      res.add("value", ctx.WORD().getText());
      return res;
   }

   @Override public ST visitMath(QuizGeneratorParser.MathContext ctx) {
      ST res = templates.getInstanceOf("stats");
      res.add("stat", visit(ctx.mathExpr()));
      return res;
   }

   @Override public ST visitTypeString(QuizGeneratorParser.TypeStringContext ctx) {
	  ST res = templates.getInstanceOf("atom");
	  res.add("value", "String");
	  return res;
   }

   @Override public ST visitTypeInt(QuizGeneratorParser.TypeIntContext ctx) {
      ST res = templates.getInstanceOf("atom");
	  res.add("value", "int");
	  return res;
   }

   @Override public ST visitTypeDouble(QuizGeneratorParser.TypeDoubleContext ctx) {
      ST res = templates.getInstanceOf("atom");
	  res.add("value", "double");
	  return res;
   }

   @Override public ST visitBdAttrib(QuizGeneratorParser.BdAttribContext ctx) {
      ST res = templates.getInstanceOf("newDB");
      res.add("name", ctx.ID().getText());
      res.add("file", ctx.WORD().getText());
      return res;
   }

   @Override public ST visitQuestionType(QuizGeneratorParser.QuestionTypeContext ctx) {
      ST res = templates.getInstanceOf("atom");
	  res.add("value", "Question");
	  return res;
   }

   @Override public ST visitQuestDeclarVar(QuizGeneratorParser.QuestDeclarVarContext ctx) {
      ST res = templates.getInstanceOf("newQuestion");
      res.add("name", ctx.ID().getText());
      return res;
   }

   @Override public ST visitQuestDeclarArray(QuizGeneratorParser.QuestDeclarArrayContext ctx) {
      ST res = templates.getInstanceOf("newQuestionArr");
      res.add("name", ctx.ID().getText());
      return res;
   }

   @Override public ST visitQuestAttribVar(QuizGeneratorParser.QuestAttribVarContext ctx) {
      ST res = templates.getInstanceOf("getOneQuestion");
      res.add("question", ctx.ID(0).getText());
      res.add("data", ctx.ID(1).getText());
      res.add("difficulty", visit(ctx.difficulty()));
      if(ctx.ID(2) != null){
		res.add("theme", ctx.ID(2).getText());
      }
      else{
		res.add("theme", ctx.WORD().getText());
	  }
      return res;
   }

   @Override public ST visitQuestAttribArray(QuizGeneratorParser.QuestAttribArrayContext ctx) {
      ST res = templates.getInstanceOf("getArrQuestion");
      res.add("list", ctx.ID(0).getText());
      res.add("data", ctx.ID(1).getText());
      res.add("num", Integer.parseInt(ctx.NUM().getText()));
      res.add("difficulty", visit(ctx.difficulty()));
      if(ctx.ID(2) != null){
		res.add("theme", ctx.ID(2).getText());
      }
      else{
		res.add("theme", ctx.WORD().getText()); 
	  }
      return res;
   }

   @Override public ST visitAnswerModeCommand(QuizGeneratorParser.AnswerModeCommandContext ctx) {
      ST res = templates.getInstanceOf("answerMode");
      res.add("value", visit(ctx.testType()));
      return res;
   }

   @Override public ST visitAddCommand(QuizGeneratorParser.AddCommandContext ctx) {
      ST res = templates.getInstanceOf("addAnswer");
      res.add("list", ctx.ID(0).getText());
      res.add("answer", ctx.ID(1).getText());
      // se ID(1) for uma lista é necessário fazer um for each da lista para adicionar as perguntas uma a uma
      return res;
   }

   @Override public ST visitRandCommand(QuizGeneratorParser.RandCommandContext ctx) {
      ST res = templates.getInstanceOf("stats");
      res.add("stat", visit(ctx.randMethod()));
      return res;
   }

   @Override public ST visitNumAnswersCommand(QuizGeneratorParser.NumAnswersCommandContext ctx) {
      ST res = templates.getInstanceOf("numAnswers");
      res.add("question", ctx.ID().getText());
      res.add("num", ctx.NUM().getText());
      return res;
   }

   @Override public ST visitPrintCommand(QuizGeneratorParser.PrintCommandContext ctx) {
      ST res = templates.getInstanceOf("print");
      if(ctx.ID() != null){
		res.add("var", ctx.ID().getText()); //se for uma question fazer question.toString();
	  }
	  else{
		res.add("var", ctx.WORD().getText());  
	  }
      return res;
   }

   @Override public ST visitMathExprCommand(QuizGeneratorParser.MathExprCommandContext ctx) {
      ST res = templates.getInstanceOf("attribVar");
      res.add("name", ctx.ID().getText());
      res.add("value", visit(ctx.mathExpr()));
      return res;
   }

   @Override public ST visitAddSubExpr(QuizGeneratorParser.AddSubExprContext ctx) {
      ST res = templates.getInstanceOf("operation");
      res.add("elem1", visit(ctx.mathExpr(0)));
      res.add("op", ctx.op.getText());
      res.add("elem2", visit(ctx.mathExpr(1)));
      return res;
   }

   @Override public ST visitMultDivExpr(QuizGeneratorParser.MultDivExprContext ctx) {
      ST res = templates.getInstanceOf("operation");
      res.add("elem1", visit(ctx.mathExpr(0)));
      res.add("op", ctx.op.getText());
      res.add("elem2", visit(ctx.mathExpr(1)));
      return res;
   }

   @Override public ST visitNumMathExpr(QuizGeneratorParser.NumMathExprContext ctx) {
      ST res = templates.getInstanceOf("atom");
      res.add("value", ctx.NUM().getText());
      return res;
   }

   @Override public ST visitParenthExpr(QuizGeneratorParser.ParenthExprContext ctx) {
      ST res = templates.getInstanceOf("parenth");
      res.add("value", visit(ctx.mathExpr()));
      return res;
   }

   @Override public ST visitIdExpr(QuizGeneratorParser.IdExprContext ctx) {
      ST res = templates.getInstanceOf("atom");
      res.add("value", ctx.ID().getText());
      return res;
   }

   @Override public ST visitIdRandMethod(QuizGeneratorParser.IdRandMethodContext ctx) {
      ST res = templates.getInstanceOf("randQuestions");
      res.add("name", ctx.ID().getText());
      return res;
   }

   @Override public ST visitAnswersRandMethod(QuizGeneratorParser.AnswersRandMethodContext ctx) {
      ST res = templates.getInstanceOf("randAnswers");
      res.add("name", ctx.ID().getText());
      return res;
   }

   @Override public ST visitMultipleChoiceType(QuizGeneratorParser.MultipleChoiceTypeContext ctx) {
      ST res = templates.getInstanceOf("atom");
      res.add("value", "\"multipleChoice\"");
      return res;
   }

   @Override public ST visitTrueOrFalseType(QuizGeneratorParser.TrueOrFalseTypeContext ctx) {
      ST res = templates.getInstanceOf("atom");
      res.add("value", "\"trueOrFalse\"");
      return res;
   }

   @Override public ST visitEasyDifficulty(QuizGeneratorParser.EasyDifficultyContext ctx) {
      ST res = templates.getInstanceOf("atom");
      res.add("value", "\"easy\"");
      return res;
   }

   @Override public ST visitMediumDifficulty(QuizGeneratorParser.MediumDifficultyContext ctx) {
      ST res = templates.getInstanceOf("atom");
      res.add("value", "\"medium\"");
      return res;
   }

   @Override public ST visitHardDifficulty(QuizGeneratorParser.HardDifficultyContext ctx) {
      ST res = templates.getInstanceOf("atom");
      res.add("value", "\"hard\"");
      return res;
   }
}
