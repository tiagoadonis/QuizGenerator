import java.util.HashMap;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;



public class semanticCheckQuiz extends QuizGeneratorBaseVisitor<Boolean>  {
	
    private HashMap<String,TYPE> tipo_id = new HashMap<String,TYPE>(); //mapa que guarda os tipos de cada variavel
    private HashMap<String,TYPE> tipo_array_id = new HashMap<String,TYPE>();
   
    private enum TYPE{ STRING,INT,QUESTION,DOUBLE,BD}
    private String id_atual;
    private String tipo_atual;
    private Boolean is_Array;
    
    
    @Override public Boolean visitProgram(QuizGeneratorParser.ProgramContext ctx) {
         
        
        return visitChildren(ctx);
    }
	
    
    @Override public Boolean visitInstMain(QuizGeneratorParser.InstMainContext ctx) { return visitChildren(ctx); }
	
	@Override public Boolean visitForMain(QuizGeneratorParser.ForMainContext ctx) { return visitChildren(ctx); }
	
	@Override public Boolean visitIfMain(QuizGeneratorParser.IfMainContext ctx) { return visitChildren(ctx); }
        
    @Override public Boolean visitForBlock(QuizGeneratorParser.ForBlockContext ctx) { return visitChildren(ctx); }
    
    @Override public Boolean visitCreateQuestionphrase(QuizGeneratorParser.CreateQuestionphraseContext ctx) { return visitChildren(ctx); }

	@Override public Boolean visitCreateQuestionTheme(QuizGeneratorParser.CreateQuestionThemeContext ctx) { return visitChildren(ctx); }
	
	@Override public Boolean visitCreateQuestionDifficulty(QuizGeneratorParser.CreateQuestionDifficultyContext ctx) { return visitChildren(ctx); }
	
	@Override public Boolean visitCreateQuestionAnswer(QuizGeneratorParser.CreateQuestionAnswerContext ctx) { return visitChildren(ctx); }
	
    @Override public Boolean visitIfBlock(QuizGeneratorParser.IfBlockContext ctx) { return visitChildren(ctx); }

    @Override public Boolean visitOther(QuizGeneratorParser.OtherContext ctx) { return visitChildren(ctx); }
    
    @Override public Boolean visitAssignInst(QuizGeneratorParser.AssignInstContext ctx) { return visitChildren(ctx); }
    

    @Override public Boolean visitCommandInst(QuizGeneratorParser.CommandInstContext ctx) { return visitChildren(ctx); }
    
    @Override public Boolean visitQuestInst(QuizGeneratorParser.QuestInstContext ctx) { return visitChildren(ctx); }
    
    
    
    @Override public Boolean visitDeclarAssign(QuizGeneratorParser.DeclarAssignContext ctx) { return visitChildren(ctx); }
    
    @Override public Boolean visitAttribAssign(QuizGeneratorParser.AttribAssignContext ctx) { return visitChildren(ctx); }
    
    @Override public Boolean visitQuestDeclarAssign(QuizGeneratorParser.QuestDeclarAssignContext ctx) { return visitChildren(ctx); }
    
    @Override public Boolean visitQuestAttribAssign(QuizGeneratorParser.QuestAttribAssignContext ctx) {return visitChildren(ctx); }

    
    @Override public Boolean visitBdAttribAssign(QuizGeneratorParser.BdAttribAssignContext ctx) {return visitChildren(ctx);  }
    

    @Override public Boolean visitDeclarVar(QuizGeneratorParser.DeclarVarContext ctx) {
        
        String id = ctx.ID().getText();
        visit(ctx.type());
        

        if(tipo_id.containsKey(id) || tipo_array_id.containsKey(id)){
            ErrorHandling.printError(ctx, "Variable '" + id + "' Already exists!");
            return false;
        }else{
            if(tipo_atual.equals("STRING")) tipo_id.put(id, TYPE.STRING);
            else if(tipo_atual.equals("INT")) tipo_id.put(id, TYPE.INT);
            else if(tipo_atual.equals("DOUBLE")) tipo_id.put(id, TYPE.DOUBLE);

           
           
            
        }
        return true;
        
    }
    
    @Override public Boolean visitDeclarArray(QuizGeneratorParser.DeclarArrayContext ctx) {
        
        String id = ctx.ID().getText();
        visit(ctx.type());


        if(tipo_id.containsKey(id) || tipo_array_id.containsKey(id)){
            ErrorHandling.printError(ctx, "Variable '" + id + "' Already exists!");
            return false;
        }else{
            if(tipo_atual.equals("STRING")) tipo_array_id.put(id, TYPE.STRING);
            else if(tipo_atual.equals("INT")) tipo_array_id.put(id, TYPE.INT);
            else if(tipo_atual.equals("DOUBLE")) tipo_array_id.put(id, TYPE.DOUBLE);

           
           
            
        }
        
        
        
        
        return true;

    }
    
    @Override public Boolean visitAttribVar(QuizGeneratorParser.AttribVarContext ctx) {
        boolean check;
        String id = ctx.ID().getText();
        if(ctx.type() != null){
            
            visit(ctx.type());

            if(tipo_id.containsKey(id) || tipo_array_id.containsKey(id)){
                ErrorHandling.printError(ctx, "Variable '" + id + "' Already exists!");
                
                return false;
        
            }else{
                
                if(tipo_atual.equals("STRING")) tipo_id.put(id, TYPE.STRING);
                
                else if(tipo_atual.equals("INT")) tipo_id.put(id, TYPE.INT);
                
                else if(tipo_atual.equals("DOUBLE")) tipo_id.put(id, TYPE.DOUBLE);
                
                
            }
            
        }else{
            if(!tipo_id.containsKey(id)){
                ErrorHandling.printError(ctx, "Variable '" + id + "' Doesn't exists!");
                return false;

            }



        }

        
        is_Array = false;
        id_atual = id;
        check = visit(ctx.expr());


            
    
    
        return check;
    }
    
    @Override public Boolean visitAttribArray(QuizGeneratorParser.AttribArrayContext ctx) {
        boolean check = true;
        String id = ctx.ID().getText();
        
        if(ctx.type() != null){
            
            visit(ctx.type());

            if(tipo_id.containsKey(id) || tipo_array_id.containsKey(id)){
                ErrorHandling.printError(ctx, "Variable '" + id + "' Already exists!");
                
                return false;
        
            }else{
                
                if(tipo_atual.equals("STRING")) tipo_array_id.put(id, TYPE.STRING);
                
                else if(tipo_atual.equals("INT")) tipo_array_id.put(id, TYPE.INT);
                
                else if(tipo_atual.equals("DOUBLE")) tipo_array_id.put(id, TYPE.DOUBLE);
                
                
            }
            
        }else{
            if(!tipo_array_id.containsKey(id)){
                ErrorHandling.printError(ctx, "Variable '" + id + "' Doesn't exists!");
                return false;

            }



        }

        
        is_Array = true;
        id_atual = id;
        
        for(int i = 0; i < ctx.expr().size();i++){
            
            
            check = check && visit(ctx.expr(i));



        }
        
        
        
        return check; 
    }
    
    
    
    @Override public Boolean visitWordExpr(QuizGeneratorParser.WordExprContext ctx) {
        if(is_Array){
            
            if((tipo_array_id.get(id_atual) != TYPE.STRING )){
                ErrorHandling.printError(ctx, "this is not a String");
                return false;
        
            }else{
                ErrorHandling.printInfo("done");
                return true;

            }
            

        }else{
            
            
            
            if((tipo_id.get(id_atual) != TYPE.STRING )){
                
                ErrorHandling.printError(ctx, "this is not a String");
                return false;
        
            }else{
                
                ErrorHandling.printInfo("done");
                return true;

            }




        }
        
        
        
     }


    @Override public Boolean visitMath(QuizGeneratorParser.MathContext ctx) { 
        
        
        
        
        return visit(ctx.mathExpr()) ; 
    }
    
    @Override public Boolean visitTypeDouble(QuizGeneratorParser.TypeDoubleContext ctx) {
        tipo_atual = "DOUBLE";
        
        
        return true; }
    @Override public Boolean visitTypeString(QuizGeneratorParser.TypeStringContext ctx) { 
        tipo_atual = "STRING";
        
        return true; }
	
	@Override public Boolean visitTypeInt(QuizGeneratorParser.TypeIntContext ctx) {
        
        tipo_atual = "INT";
        return true; }
    
    @Override public Boolean visitBdAttrib(QuizGeneratorParser.BdAttribContext ctx) {
        
        String id = ctx.ID().getText();
        
        if(tipo_id.containsKey(id) || tipo_array_id.containsKey(id)){
            ErrorHandling.printError(ctx, "Variable '" + id + "' Already exists!");
            return false;
        }else{
            tipo_id.put(id,TYPE.BD);
            ErrorHandling.printInfo("done");
            return true;
 
        }
    
    
    
    
    }
    @Override public Boolean visitQuestionType(QuizGeneratorParser.QuestionTypeContext ctx) {
        
        
        
        return true; 
    
    
    }
    @Override public Boolean visitQuestDeclarVar(QuizGeneratorParser.QuestDeclarVarContext ctx) {
        
        String id = ctx.ID().getText();
        
        if(tipo_id.containsKey(id) || tipo_array_id.containsKey(id)){
            ErrorHandling.printError(ctx, "Variable '" + id + "' Already exists!");
            return false;
        
        }else{

            tipo_id.put(id, TYPE.QUESTION);
            ErrorHandling.printInfo("done");
            return true;
        }

        //VERIFICAR SE O FICHEIRO EXISTE?
        
        
    }

    @Override public Boolean visitQuestDeclarArray(QuizGeneratorParser.QuestDeclarArrayContext ctx) {
        
        String id = ctx.ID().getText();
        
        if(tipo_id.containsKey(id) || tipo_array_id.containsKey(id)){
            
            ErrorHandling.printError(ctx, "Variable '" + id + "' Already exists!");
            return false;
            
            
            
        }else{
        
            tipo_array_id.put(id, TYPE.QUESTION);
            ErrorHandling.printInfo("done");
            return true;
        
        }
        
        
    
    
    
    }

    @Override public Boolean visitQuestAttribVar(QuizGeneratorParser.QuestAttribVarContext ctx) { 
        String quest_id = ctx.ID(0).getText();
        String bd_id = ctx.ID(1).getText();
        
        if(ctx.questionType() != null){

            if(tipo_id.containsKey(quest_id) || tipo_array_id.containsKey(quest_id)){
                ErrorHandling.printError(ctx, "Variable '" + quest_id + "' Already exists!");
                return false;
            
            }else{
    
                tipo_id.put(quest_id, TYPE.QUESTION);
                ErrorHandling.printInfo("done");
                
            }

        }else{
            if(!tipo_id.containsKey(quest_id)){
                ErrorHandling.printError(ctx, "Variable '" + quest_id + "' doesn't exists!");
                return false;
            }
        }

        
        
        
        if(!tipo_id.containsKey(bd_id) ){
            ErrorHandling.printError(ctx, "BD '" + bd_id + "' doesnt exist");
            return false;
        }else{
            if(tipo_id.get(bd_id) != TYPE.BD ){
                
                ErrorHandling.printError(ctx, "Variable '" + bd_id + "' is not a BD");
                return false; 
            }



        }
        

        
        return true; 
    
    
    
    }

    @Override public Boolean visitQuestAttribArray(QuizGeneratorParser.QuestAttribArrayContext ctx) {
        String quest_id = ctx.ID(0).getText();
        String bd_id = ctx.ID(1).getText();
        
        if(ctx.questionType() != null){

            if(tipo_id.containsKey(quest_id) || tipo_array_id.containsKey(quest_id)){
                ErrorHandling.printError(ctx, "Variable '" + quest_id + "' Already exists!");
                return false;
            
            }else{
    
                tipo_array_id.put(quest_id, TYPE.QUESTION);
                ErrorHandling.printInfo("done");
                
            }

        }else{
            if(!tipo_id.containsKey(quest_id)){
                ErrorHandling.printError(ctx, "Variable '" + quest_id + "' doesn't exists!");
                return false;
            }
        }

        
        
        
        if(!tipo_id.containsKey(bd_id) ){
            ErrorHandling.printError(ctx, "BD '" + bd_id + "'  doesnt exist");
            return false;
        }else{
            if(tipo_id.get(bd_id) != TYPE.BD ){
                
                ErrorHandling.printError(ctx, "Variable '" + bd_id + "' is not a BD");
                return false; 
            }



        }
        

        
        return true;
    }

    @Override public Boolean visitAnswerModeCommand(QuizGeneratorParser.AnswerModeCommandContext ctx) { return visitChildren(ctx); }

    @Override public Boolean visitAddCommand(QuizGeneratorParser.AddCommandContext ctx) { return visitChildren(ctx); }

    @Override public Boolean visitRandCommand(QuizGeneratorParser.RandCommandContext ctx) { return visitChildren(ctx); }

    @Override public Boolean visitNumAnswersCommand(QuizGeneratorParser.NumAnswersCommandContext ctx) { return visitChildren(ctx); }

    @Override public Boolean visitPrintCommand(QuizGeneratorParser.PrintCommandContext ctx) { return visitChildren(ctx); }

    @Override public Boolean visitMathExprCommand(QuizGeneratorParser.MathExprCommandContext ctx) { return visitChildren(ctx); }

    @Override public Boolean visitAddSubExpr(QuizGeneratorParser.AddSubExprContext ctx) { return super.visitAddSubExpr(ctx); }
 
    @Override public Boolean visitMultDivExpr(QuizGeneratorParser.MultDivExprContext ctx) { return super.visitMultDivExpr(ctx); }

    @Override public Boolean visitNumMathExpr(QuizGeneratorParser.NumMathExprContext ctx) {
       
        if(is_Array){
            
            if((tipo_array_id.get(id_atual) != TYPE.INT && tipo_array_id.get(id_atual) != TYPE.DOUBLE)){
                ErrorHandling.printError(ctx, "this is not a INT or a DOUBLE");
                return false;
        
            }else{
                ErrorHandling.printInfo("done");
                return true;

            }
            

        }else{
            
            
            
            if((tipo_id.get(id_atual) != TYPE.INT && tipo_id.get(id_atual) != TYPE.DOUBLE)){
                ErrorHandling.printError(ctx, "this is not a INT or a DOUBLE");
                return false;
        
            }else{
                ErrorHandling.printInfo("done");
                return true;

            }




        }
        
    }

    @Override public Boolean visitParenthExpr(QuizGeneratorParser.ParenthExprContext ctx) { return super.visitParenthExpr(ctx); }

    @Override public Boolean visitIdExpr(QuizGeneratorParser.IdExprContext ctx) {
        String id = ctx.ID().getText();

        if(is_Array){
            
            if(tipo_array_id.get(id_atual) != tipo_array_id.get(id)) {
                
                ErrorHandling.printError(ctx, "Variables are from different types");
                
                return false;
            }
        
        
        }else{
            
            if(tipo_id.get(id_atual) != tipo_id.get(id)) {
                
                ErrorHandling.printError(ctx, "Variables are from different types");
                return false;
            }




        }
        
        
        
      

        
        
        
        return true; 
    
    }

    @Override public Boolean visitIdRandMethod(QuizGeneratorParser.IdRandMethodContext ctx) { return visitChildren(ctx); }

    @Override public Boolean visitAnswersRandMethod(QuizGeneratorParser.AnswersRandMethodContext ctx) { return visitChildren(ctx); }

    @Override public Boolean visitMultipleChoiceType(QuizGeneratorParser.MultipleChoiceTypeContext ctx) { return visitChildren(ctx); }

    @Override public Boolean visitTrueOrFalseType(QuizGeneratorParser.TrueOrFalseTypeContext ctx) { return visitChildren(ctx); }

    @Override public Boolean visitEasyDifficulty(QuizGeneratorParser.EasyDifficultyContext ctx) { return visitChildren(ctx); }

    @Override public Boolean visitMediumDifficulty(QuizGeneratorParser.MediumDifficultyContext ctx) { return visitChildren(ctx); }

    @Override public Boolean visitHardDifficulty(QuizGeneratorParser.HardDifficultyContext ctx) { return visitChildren(ctx); }
}