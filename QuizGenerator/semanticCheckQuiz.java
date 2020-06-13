import java.util.HashMap;
import java.util.*;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;



public class semanticCheckQuiz extends QuizGeneratorBaseVisitor<Boolean>  {
	
    private HashMap<String,TYPE> tipo_id = new HashMap<String,TYPE>(); //mapa que guarda os tipos de cada variavel
    private HashMap<String,TYPE> tipo_array_id = new HashMap<String,TYPE>();
    private HashMap<String,TYPE> tipo_for= new HashMap<String,TYPE>();
    private HashMap<String,TYPE> tipo_array_for = new HashMap<String,TYPE>();
    private HashMap<String,TYPE> tipo_if= new HashMap<String,TYPE>();
    private HashMap<String,TYPE> tipo_array_if = new HashMap<String,TYPE>();
    private enum TYPE{ STRING,INT,QUESTION,DOUBLE,BD}
    private TYPE id_atual;
    private String tipo_atual;
    private Boolean is_Array;
    private Boolean in_for = false;
    private Boolean in_if = false;
    
    
    @Override public Boolean visitProgram(QuizGeneratorParser.ProgramContext ctx) {
         
        
        return visitChildren(ctx);
    }
	
    
    @Override public Boolean visitInstStat(QuizGeneratorParser.InstStatContext ctx) { return visit(ctx.instructions()); }	
	@Override public Boolean visitForStat(QuizGeneratorParser.ForStatContext ctx) {return visit(ctx.forBlock());}
	
	@Override public Boolean visitIfStat(QuizGeneratorParser.IfStatContext ctx) { return visit(ctx.ifBlock());}
        
    @Override public Boolean visitForBlock(QuizGeneratorParser.ForBlockContext ctx) {
        
        if(in_for){
            ErrorHandling.printError(ctx, "you cant use a 'for' inside another 'for'");
            return false; 
        }
        tipo_for = new HashMap<String,TYPE>();
        tipo_array_for = new HashMap<String,TYPE>();
        in_for=true;
        
        String list = ctx.ID(1).getText();
        String tmp_id = ctx.ID(0).getText();


        if(!tipo_array_id.containsKey(list)){
            ErrorHandling.printError(ctx, "Variable '" + list + "' doesn't exist or is not iterable!"); 
            return false;
        }else{
            tipo_for.put(tmp_id, tipo_array_id.get(list));



        }
        Boolean check = true;
        
        //Iterator<QuizGeneratorParser.StatContext> iter = ctx.stat().iterator();
        // while(iter.hasNext()){
            
        //     check = check && visit(iter.next());
           



        // }
        

        for(int i = 0; i < ctx.stat().size();i++){

            check = check && visit(ctx.stat(i));
        }
        visit(ctx.endf());

        
        return check;
    }
    @Override public Boolean visitEndf(QuizGeneratorParser.EndfContext ctx) {
        in_for=false;
        tipo_for.clear();
        tipo_array_for.clear();
        
        return true; }

    @Override public T visitIfBlock(QuizGeneratorParser.IfBlockContext ctx) { 

        if(in_if){
            ErrorHandling.printError(ctx, "you cant use a 'if' inside another 'if'");
            return false; 
        }
        else{
        
            if( visit(ctx.condition()) ){
                tipo_if = new HashMap<String,TYPE>();
                tipo_array_if = new HashMap<String,TYPE>();
                in_if=true;

                 }
        ErrorHandling.printInfo(ctx, "done");
        return true; 
        }
    }
    

        @Override public Boolean visitCreateQuestionphrase(QuizGeneratorParser.CreateQuestionphraseContext ctx) {
        String id = ctx.ID().getText();
        if(tipo_array_id.containsKey(id) || tipo_array_for.containsKey(id)){
            ErrorHandling.printError(ctx, "cant use an array of questions for this");
            return false;
        }
        if(tipo_id.containsKey(id)){
            if(tipo_id.get(id) != TYPE.QUESTION ){
                ErrorHandling.printError(ctx, "Variable '" + id + "' it is not a QUESTION!"); 
                return false;
            }
        }else if(tipo_for.containsKey(id)){
            if(tipo_for.get(id) != TYPE.QUESTION ){
                ErrorHandling.printError(ctx, "Variable '" + id + "' it is not a QUESTION!"); 
                return false;
            }
        

        }else{
                tipo_id.put(id,TYPE.QUESTION);
                ErrorHandling.printInfo(ctx, "done");

        
        }
        
        ErrorHandling.printInfo(ctx, "done");
        return true; 
    }

	@Override public Boolean visitCreateQuestionTheme(QuizGeneratorParser.CreateQuestionThemeContext ctx) {
        String id = ctx.ID().getText();
        if(tipo_array_id.containsKey(id) || tipo_array_for.containsKey(id)){
            ErrorHandling.printError(ctx, "cant use an array of questions for this");
            return false;
        }
        if(tipo_id.containsKey(id)){
            if(tipo_id.get(id) != TYPE.QUESTION ){
                ErrorHandling.printError(ctx, "Variable '" + id + "' it is not a QUESTION!"); 
                return false;
            }
        }else if(tipo_for.containsKey(id)){
            if(tipo_for.get(id) != TYPE.QUESTION ){
                ErrorHandling.printError(ctx, "Variable '" + id + "' it is not a QUESTION!"); 
                return false;
            }
        

        }else{
                tipo_id.put(id,TYPE.QUESTION);
                ErrorHandling.printInfo(ctx, "done");

        
        }
        
        ErrorHandling.printInfo(ctx, "done");
        return true; 
        
    }
	
	@Override public Boolean visitCreateQuestionDifficulty(QuizGeneratorParser.CreateQuestionDifficultyContext ctx) {
        String id = ctx.ID().getText();
        if(tipo_array_id.containsKey(id) || tipo_array_for.containsKey(id)){
            ErrorHandling.printError(ctx, "cant use an array of questions for this");
            return false;
        }
        if(tipo_id.containsKey(id)){
            if(tipo_id.get(id) != TYPE.QUESTION ){
                ErrorHandling.printError(ctx, "Variable '" + id + "' it is not a QUESTION!"); 
                return false;
            }
        }else if(tipo_for.containsKey(id)){
            if(tipo_for.get(id) != TYPE.QUESTION ){
                ErrorHandling.printError(ctx, "Variable '" + id + "' it is not a QUESTION!"); 
                return false;
            }
        

        }else{
                tipo_id.put(id,TYPE.QUESTION);
                ErrorHandling.printInfo(ctx, "done");

        
        }
        
        ErrorHandling.printInfo(ctx, "done");
        return true; 
    }
	
	@Override public Boolean visitCreateQuestionAnswer(QuizGeneratorParser.CreateQuestionAnswerContext ctx) {
        String id = ctx.ID().getText();
        if(tipo_array_id.containsKey(id) || tipo_array_for.containsKey(id)){
            ErrorHandling.printError(ctx, "cant use an array of questions for this");
            return false;
        }
        if(tipo_id.containsKey(id)){
            if(tipo_id.get(id) != TYPE.QUESTION ){
                ErrorHandling.printError(ctx, "Variable '" + id + "' it is not a QUESTION!"); 
                return false;
            }
        }else if(tipo_for.containsKey(id)){
            if(tipo_for.get(id) != TYPE.QUESTION ){
                ErrorHandling.printError(ctx, "Variable '" + id + "' it is not a QUESTION!"); 
                return false;
            }
        

        }else{
                tipo_id.put(id,TYPE.QUESTION);
                ErrorHandling.printInfo(ctx, "done");

        
        }
        
        ErrorHandling.printInfo(ctx, "done");
        return true; 
        
    }
	
    @Override public Boolean visitCreateQuestionName(QuizGeneratorParser.CreateQuestionNameContext ctx) {
        String id = ctx.ID().getText();
        if(tipo_array_id.containsKey(id) || tipo_array_for.containsKey(id)){
            ErrorHandling.printError(ctx, "cant use an array of questions for this");
            return false;
        }
        if(tipo_id.containsKey(id)){
            if(tipo_id.get(id) != TYPE.QUESTION ){
                ErrorHandling.printError(ctx, "Variable '" + id + "' it is not a QUESTION!"); 
                return false;
            }
        }else if(tipo_for.containsKey(id)){
            if(tipo_for.get(id) != TYPE.QUESTION ){
                ErrorHandling.printError(ctx, "Variable '" + id + "' it is not a QUESTION!"); 
                return false;
            }
        

        }else{
                tipo_id.put(id,TYPE.QUESTION);
                ErrorHandling.printInfo(ctx, "done");

        
        }
        
        ErrorHandling.printInfo(ctx, "done");
        return true; 
    }
    @Override public Boolean visitIfBlock(QuizGeneratorParser.IfBlockContext ctx) { return visitChildren(ctx); }

    @Override public Boolean visitOther(QuizGeneratorParser.OtherContext ctx) { return visitChildren(ctx); }
    
    @Override public Boolean visitAssignInst(QuizGeneratorParser.AssignInstContext ctx) { return visit(ctx.assignment()); }
    

    @Override public Boolean visitCommandInst(QuizGeneratorParser.CommandInstContext ctx) { return visit(ctx.command()); }
    
    @Override public Boolean visitQuestInst(QuizGeneratorParser.QuestInstContext ctx) { return visit(ctx.createQuestion()); }
    
    
    
    @Override public Boolean visitDeclarAssign(QuizGeneratorParser.DeclarAssignContext ctx) { return visit(ctx.declaration()); }
    
   @Override public Boolean visitAttribAssign(QuizGeneratorParser.AttribAssignContext ctx) { return visit(ctx.attribution()); }
    
    @Override public Boolean visitQuestDeclarAssign(QuizGeneratorParser.QuestDeclarAssignContext ctx) { return visit(ctx.questionDeclaration()); }
    
    @Override public Boolean visitQuestAttribAssign(QuizGeneratorParser.QuestAttribAssignContext ctx) {return visit(ctx.questionAttribution()); }

    
    @Override public Boolean visitBdAttribAssign(QuizGeneratorParser.BdAttribAssignContext ctx) {return visit(ctx.bdAttribution());  }
    

    @Override public Boolean visitDeclarVar(QuizGeneratorParser.DeclarVarContext ctx) {
        
        String id = ctx.ID().getText();
        visit(ctx.type());
    
        if(tipo_id.containsKey(id) || tipo_array_id.containsKey(id) || tipo_for.containsKey(id) || tipo_array_for.containsKey(id)){
            ErrorHandling.printError(ctx, "Variable '" + id + "' Already exists!");
            return false;
        
        }   
        if(in_for){
            if(tipo_atual.equals("STRING")) {tipo_for.put(id, TYPE.STRING); id_atual = TYPE.STRING;}
        
            else if(tipo_atual.equals("INT")) {tipo_for.put(id, TYPE.INT);id_atual = TYPE.INT; }
        
            else if(tipo_atual.equals("DOUBLE")) {tipo_for.put(id, TYPE.DOUBLE);id_atual= TYPE.DOUBLE;}
        
        }else{
            if(tipo_atual.equals("STRING")) {tipo_id.put(id, TYPE.STRING); id_atual = TYPE.STRING;}
        
            else if(tipo_atual.equals("INT")) {tipo_id.put(id, TYPE.INT);id_atual =TYPE.INT; }
        
            else if(tipo_atual.equals("DOUBLE")) {tipo_id.put(id, TYPE.DOUBLE);id_atual= TYPE.DOUBLE;}
        }
    
    
        
        return true;
        
    }
    
    @Override public Boolean visitDeclarArray(QuizGeneratorParser.DeclarArrayContext ctx) {
        
        String id = ctx.ID().getText();
        visit(ctx.type());

        if(tipo_id.containsKey(id) || tipo_array_id.containsKey(id) || tipo_for.containsKey(id) || tipo_array_for.containsKey(id) ){
            ErrorHandling.printError(ctx, "Variable '" + id + "' Already exists!");
            return false;
        
        }    
            
        if(in_for){
            if(tipo_atual.equals("STRING")) {tipo_array_for.put(id, TYPE.STRING);id_atual=TYPE.STRING;}
        
            else if(tipo_atual.equals("INT")) {tipo_array_for.put(id, TYPE.INT);id_atual=TYPE.INT;}
        
            else if(tipo_atual.equals("DOUBLE")) {tipo_array_for.put(id, TYPE.DOUBLE);id_atual=TYPE.DOUBLE;}

        }else{
            if(tipo_atual.equals("STRING")) {tipo_array_id.put(id, TYPE.STRING);id_atual=TYPE.STRING;}
        
            else if(tipo_atual.equals("INT")) {tipo_array_id.put(id, TYPE.INT);id_atual=TYPE.INT;}
            
            else if(tipo_atual.equals("DOUBLE")) {tipo_array_id.put(id, TYPE.DOUBLE);id_atual=TYPE.DOUBLE;}
        }

        
        
            
        
        
        
        
        
        return true;

    }
    
    @Override public Boolean visitAttribVar(QuizGeneratorParser.AttribVarContext ctx) {
        boolean check;
        String id = ctx.ID().getText();
        if(ctx.type() != null){
            
            visit(ctx.type());

            if(tipo_id.containsKey(id) || tipo_array_id.containsKey(id) || tipo_for.containsKey(id)){
                ErrorHandling.printError(ctx, "Variable '" + id + "' Already exists!");
                
                return false;
        
            }else{
                if(in_for){
                    if(tipo_atual.equals("STRING")) {tipo_for.put(id, TYPE.STRING); id_atual = TYPE.STRING;}
                
                    else if(tipo_atual.equals("INT")) {tipo_for.put(id, TYPE.INT);id_atual =TYPE.INT; }
                
                    else if(tipo_atual.equals("DOUBLE")) {tipo_for.put(id, TYPE.DOUBLE);id_atual= TYPE.DOUBLE;}
                }else{
                    if(tipo_atual.equals("STRING")) {tipo_id.put(id, TYPE.STRING); id_atual = TYPE.STRING;}
                
                    else if(tipo_atual.equals("INT")) {tipo_id.put(id, TYPE.INT);id_atual =TYPE.INT; }
                
                    else if(tipo_atual.equals("DOUBLE")) {tipo_id.put(id, TYPE.DOUBLE);id_atual= TYPE.DOUBLE;}
                }
                
                
                
            }
            
            
            
        }else{
            
            if(tipo_id.containsKey(id)){
                id_atual = tipo_id.get(id);
            }
            else if(tipo_for.containsKey(id)){
                id_atual = tipo_for.get(id);
            }
            else{
                ErrorHandling.printError(ctx, "Variable '" + id + "' Doesn't exists!");
                return false;
            }
            
            
            

        
        }

        
        is_Array = false;
        //id_atual = id;
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
                
                if(in_for){
                    if(tipo_atual.equals("STRING")) {tipo_array_for.put(id, TYPE.STRING);id_atual=TYPE.STRING;}
                
                    else if(tipo_atual.equals("INT")) {tipo_array_for.put(id, TYPE.INT);id_atual=TYPE.INT;}
                
                    else if(tipo_atual.equals("DOUBLE")) {tipo_array_for.put(id, TYPE.DOUBLE);id_atual=TYPE.DOUBLE;}

                }else{
                    if(tipo_atual.equals("STRING")) {tipo_array_id.put(id, TYPE.STRING);id_atual=TYPE.STRING;}
                
                    else if(tipo_atual.equals("INT")) {tipo_array_id.put(id, TYPE.INT);id_atual=TYPE.INT;}
                    
                    else if(tipo_atual.equals("DOUBLE")) {tipo_array_id.put(id, TYPE.DOUBLE);id_atual=TYPE.DOUBLE;}
                }
                
            }

            
        }else{
            if(tipo_array_id.containsKey(id)){
                id_atual = tipo_id.get(id);
            }
            else if(tipo_array_for.containsKey(id)){
                id_atual = tipo_for.get(id);
            }
            else{
                ErrorHandling.printError(ctx, "Variable '" + id + "' Doesn't exists!");
                return false;
            }

        }

        
        is_Array = true;
        //id_atual = id;
        
        for(int i = 0; i < ctx.expr().size();i++){
            
            
            check = check && visit(ctx.expr(i));



        }
        
        
        
        return check; 
    }
    
    
    
    @Override public Boolean visitWordExpr(QuizGeneratorParser.WordExprContext ctx) {
        if(is_Array){
            
                
            if(id_atual != TYPE.STRING ){
                ErrorHandling.printError(ctx, "Variable is a '" + id_atual +"' not a String");
                return false;
        
            }else{
                ErrorHandling.printInfo("done");
                return true;

            }

           
            
            

        }else{

            if(id_atual != TYPE.STRING ){
            
                ErrorHandling.printError(ctx, "Variable is a '" + id_atual +"' not a String");
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
        
        if(tipo_id.containsKey(id) || tipo_array_id.containsKey(id) || tipo_for.containsKey(id) || tipo_array_for.containsKey(id)){
            ErrorHandling.printError(ctx, "Variable '" + id + "' Already exists!");
            return false;
        
        }else{
            if(in_for){
                tipo_for.put(id, TYPE.QUESTION);
                ErrorHandling.printInfo("done");
                return true;
            }else{
                tipo_id.put(id, TYPE.QUESTION);
                ErrorHandling.printInfo("done");
                return true;  
            }
            
        }

        //VERIFICAR SE O FICHEIRO EXISTE?
        
        
    }

    @Override public Boolean visitQuestDeclarArray(QuizGeneratorParser.QuestDeclarArrayContext ctx) {
        
        String id = ctx.ID().getText();
        
        if(tipo_id.containsKey(id) || tipo_array_id.containsKey(id) || tipo_for.containsKey(id) || tipo_array_for.containsKey(id)){
            
            ErrorHandling.printError(ctx, "Variable '" + id + "' Already exists!");
            return false;
            
            
            
        }else{
        
            if(in_for){
                tipo_array_for.put(id, TYPE.QUESTION);
                ErrorHandling.printInfo("done");
                return true;
            }else{
                tipo_array_id.put(id, TYPE.QUESTION);
                ErrorHandling.printInfo("done");
                return true;  
            }
        
        }
        
        
    
    
    
    }

    @Override public Boolean visitQuestAttribVar(QuizGeneratorParser.QuestAttribVarContext ctx) { 
        String quest_id = ctx.ID(0).getText();
        String bd_id = ctx.ID(1).getText();
        String id_theme = "";
        if(ctx.ID(2) != null){
            id_theme = ctx.ID(2).getText();
        
        }
        System.out.print(tipo_id.get(quest_id));
        if(ctx.questionType() != null){

            if(tipo_id.containsKey(quest_id) || tipo_array_id.containsKey(quest_id) || tipo_for.containsKey(quest_id) || tipo_array_for.containsKey(quest_id)){
                ErrorHandling.printError(ctx, "Variable '" + quest_id + "' Already exists!");
                return false;
            
            }else{
                if(in_for){
                    tipo_for.put(quest_id, TYPE.QUESTION);
                    
                }else{
                    tipo_id.put(quest_id, TYPE.QUESTION);
                    
                }
                
            }

        }else{
            
            if(!tipo_id.containsKey(quest_id) && !tipo_for.containsKey(quest_id)){
            
                ErrorHandling.printError(ctx, "Variable '" + quest_id + "' doesn't exists!");
                return false;
            }
            if(tipo_id.get(quest_id) != TYPE.QUESTION && tipo_id.get(quest_id) != null){
                
                ErrorHandling.printError(ctx, "Variable '" + quest_id + "' is not a Question!");
                return false;
            }
            if(tipo_for.get(quest_id) != TYPE.QUESTION && tipo_id.get(quest_id) != null){
                ErrorHandling.printError(ctx, "Variable '" + quest_id + "' is not a Question!");
                return false;
            }
        
        }
        
        
        
        if(!tipo_id.containsKey(bd_id) && !tipo_for.containsKey(bd_id)){
            ErrorHandling.printError(ctx, "BD '" + bd_id + "' doesnt exist");
            return false;
        }else{
            if(tipo_id.get(bd_id) != TYPE.BD && tipo_id.get(bd_id) != null  ){
                
                ErrorHandling.printError(ctx, "Variable '" + bd_id + "' is not a BD");
                return false; 
            }
            if(tipo_for.get(bd_id) != TYPE.BD && tipo_for.get(bd_id) != null  ){
                
                ErrorHandling.printError(ctx, "Variable '" + bd_id + "' is not a BD");
                return false; 
            }
        }
        
        
        if(!id_theme.equals("")){
            if(!tipo_id.containsKey(id_theme) && !tipo_for.containsKey(id_theme)){
                ErrorHandling.printError(ctx, "Variable '" + id_theme + "' doesnt exist");
                return false;
            }else{
                if(tipo_id.get(id_theme) != TYPE.STRING && tipo_id.get(id_theme) != null ){
                    
                    ErrorHandling.printError(ctx, "Variable '" + id_theme + "' is not a String");
                    return false; 
                }
                if(tipo_for.get(id_theme) != TYPE.STRING && tipo_for.get(id_theme) != null ){
                    ErrorHandling.printError(ctx, "Variable '" + id_theme + "' is not a String");
                    return false; 
                }
            }
            
        }
        ErrorHandling.printInfo("done");
        return true; 
    
    
    
    }

    @Override public Boolean visitQuestAttribArray(QuizGeneratorParser.QuestAttribArrayContext ctx) {
        String quest_id = ctx.ID(0).getText();
        String bd_id = ctx.ID(1).getText();
        String id_theme = "";
        if(ctx.ID(2) != null){
            id_theme = ctx.ID(2).getText();
        
        }
        
        if(ctx.questionType() != null){

            if(tipo_id.containsKey(quest_id) || tipo_array_id.containsKey(quest_id) || tipo_for.containsKey(quest_id) || tipo_array_for.containsKey(quest_id)){
                ErrorHandling.printError(ctx, "Variable '" + quest_id + "' Already exists!");
                return false;
            
            }else{
                if(in_for){
                    tipo_array_for.put(quest_id, TYPE.QUESTION);
                    
                }else{
                    tipo_array_id.put(quest_id, TYPE.QUESTION);
                    
                }
                
            }

        }else{
            if(!tipo_id.containsKey(quest_id) && !tipo_for.containsKey(quest_id)){
                ErrorHandling.printError(ctx, "Variable '" + quest_id + "' doesn't exists!");
                return false;
            }
        }

        
        
        
        if(!tipo_id.containsKey(bd_id) && !tipo_for.containsKey(bd_id)){  //permitir apenas get de bd
            ErrorHandling.printError(ctx, "BD '" + bd_id + "' doesnt exist");
            return false;
        }else{
            if(tipo_id.get(bd_id) != TYPE.BD && tipo_id.get(bd_id) != null  ){
                
                ErrorHandling.printError(ctx, "Variable '" + bd_id + "' is not a BD");
                return false; 
            }
            if(tipo_for.get(bd_id) != TYPE.BD && tipo_for.get(bd_id) != null  ){
                
                ErrorHandling.printError(ctx, "Variable '" + bd_id + "' is not a BD");
                return false; 
            }
        }
        
        
        if(!id_theme.equals("")){
            if(!tipo_id.containsKey(id_theme) && !tipo_for.containsKey(id_theme)){//permitir apenas Strings
                ErrorHandling.printError(ctx, "Variable '" + id_theme + "' doesnt exist");
                return false;
            }else{
                if(tipo_id.get(id_theme) != TYPE.STRING && tipo_id.get(id_theme) != null ){
                    
                    ErrorHandling.printError(ctx, "Variable '" + id_theme + "' is not a String");
                    return false; 
                }
                if(tipo_for.get(id_theme) != TYPE.STRING && tipo_for.get(id_theme) != null ){
                    ErrorHandling.printError(ctx, "Variable '" + id_theme + "' is not a String");
                    return false; 
                }
            }
            
        }
        ErrorHandling.printInfo("done");
        return true;
    }

    @Override public Boolean visitAnswerModeCommand(QuizGeneratorParser.AnswerModeCommandContext ctx) { return true; }

    @Override public Boolean visitAddCommand(QuizGeneratorParser.AddCommandContext ctx) {
        String id = ctx.ID(0).getText();
        String id_quest = ctx.ID(1).getText();
        
        if(!tipo_id.containsKey(id_quest) && !tipo_for.containsKey(id_quest) && !tipo_array_id.containsKey(id_quest) && !tipo_array_for.containsKey(id_quest)){
            ErrorHandling.printError(ctx, "Variable '" + id_quest + "' doesnt exist");    
            return false;
        }else{
            if(tipo_id.get(id_quest) != TYPE.QUESTION && tipo_id.get(id_quest) != null  ){
                
                ErrorHandling.printError(ctx, "Variable '" + id_quest + "' is not a Question");
                return false; 
            }
            if(tipo_for.get(id_quest) != TYPE.QUESTION && tipo_for.get(id_quest) != null  ){
                
                ErrorHandling.printError(ctx, "Variable '" + id_quest + "' is not a Question");
                return false; 
            }
            if(tipo_array_id.get(id) != TYPE.QUESTION && tipo_array_id.get(id) != null  ){
                
                ErrorHandling.printError(ctx, "Variable '" + id + "' is not a Question");
                return false; 
            }
            if(tipo_array_for.get(id) != TYPE.QUESTION && tipo_array_for.get(id) != null  ){
                
                ErrorHandling.printError(ctx, "Variable '" + id + "' is not a Question");
                return false; 
            }
        }
        
        if(!tipo_array_id.containsKey(id) && !tipo_array_for.containsKey(id) && !tipo_id.containsKey(id) && !tipo_for.containsKey(id)){
            ErrorHandling.printError(ctx, "Variable '" + id + "' doesnt exist");    
            return false;
        }else{
            if(tipo_id.get(id) != TYPE.BD && tipo_id.get(id) != null  ){
                
                ErrorHandling.printError(ctx, "Variable '" + id + "' is not a BD");
                return false; 
            }
            if(tipo_for.get(id) != TYPE.BD && tipo_for.get(id) != null  ){
                
                ErrorHandling.printError(ctx, "Variable '" + id + "' is not a BD");
                return false; 
            }
            if(tipo_array_id.get(id) != TYPE.QUESTION && tipo_array_id.get(id) != null  ){
                
                ErrorHandling.printError(ctx, "Variable '" + id + "' is not a Question");
                return false; 
            }
            if(tipo_array_for.get(id) != TYPE.QUESTION && tipo_array_for.get(id) != null  ){
                
                ErrorHandling.printError(ctx, "Variable '" + id + "' is not a Question");
                return false; 
            }
        }

        return true; }

    @Override public Boolean visitRandCommand(QuizGeneratorParser.RandCommandContext ctx) { return visitChildren(ctx); }

    @Override public Boolean visitNumAnswersCommand(QuizGeneratorParser.NumAnswersCommandContext ctx) {
        
        String id = ctx.ID().getText();
        
        if(!tipo_id.containsKey(id) && !tipo_for.containsKey(id)){
            ErrorHandling.printError(ctx, "Variable '" + id + "' doesnt exist");    
            return false;
        }else{
            if(tipo_id.get(id) != TYPE.QUESTION && tipo_id.get(id) != null  ){
                
                ErrorHandling.printError(ctx, "Variable '" + id + "' is not a Question");
                return false; 
            }
            if(tipo_for.get(id) != TYPE.QUESTION && tipo_for.get(id) != null  ){
                
                ErrorHandling.printError(ctx, "Variable '" + id + "' is not a Question");
                return false; 
            }
        }
        
        
        
        
        return true; 
    }

    @Override public Boolean visitPrintCommand(QuizGeneratorParser.PrintCommandContext ctx) { 
        String id = "";

        if(ctx.ID() != null){
            id = ctx.ID().getText();

        }
        if(!id.equals("")){
            if(!tipo_array_id.containsKey(id) && !tipo_array_for.containsKey(id) && !tipo_id.containsKey(id) && !tipo_for.containsKey(id)){
                ErrorHandling.printError(ctx, "Variable '" + id + "' doesnt exist");    
                return false;
            }

        }
        return true; 
    }

    @Override public Boolean visitMathExprCommand(QuizGeneratorParser.MathExprCommandContext ctx) { return true; }

    @Override public Boolean visitAddSubExpr(QuizGeneratorParser.AddSubExprContext ctx) { return super.visitAddSubExpr(ctx); }
 
    @Override public Boolean visitMultDivExpr(QuizGeneratorParser.MultDivExprContext ctx) { return super.visitMultDivExpr(ctx); }

    @Override public Boolean visitNumMathExpr(QuizGeneratorParser.NumMathExprContext ctx) {
       
        if(is_Array){

            if(id_atual != TYPE.INT && id_atual != TYPE.DOUBLE){
                ErrorHandling.printError(ctx, "Variable is a '" + id_atual +"' not a INT or a DOUBLE");
                return false;
        
            }else{
                ErrorHandling.printInfo("done");
                return true;

            }
                 

        }else{

            if(id_atual != TYPE.INT && id_atual != TYPE.DOUBLE){
                ErrorHandling.printError(ctx, "Variable is a '" + id_atual +"' not a INT or a DOUBLE");
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
            
            if(tipo_array_for.containsKey(id)){
                if(id_atual != tipo_array_for.get(id)) {
            
                    ErrorHandling.printError(ctx, "Variables are from different types");
                    
                    return false;
                }

            }
            if(tipo_array_id.containsKey(id)){
                if(id_atual != tipo_array_id.get(id)) {
                
                    ErrorHandling.printError(ctx, "Variables are from different types");
                    
                    return false;
                }
            }
        }else{

            if(tipo_for.containsKey(id)){
                if(id_atual != tipo_for.get(id)) {
            
                    ErrorHandling.printError(ctx, "Variables are from different types");
                    
                    return false;
                }

            }
            if(tipo_id.containsKey(id)){
                if(id_atual != tipo_id.get(id)) {
                
                    ErrorHandling.printError(ctx, "Variables are from different types");
                    
                    return false;
                }
            }

        }

        return true; 
    
    }

    @Override public Boolean visitIdRandMethod(QuizGeneratorParser.IdRandMethodContext ctx) {
        String id = ctx.ID().getText();
        if(!tipo_array_id.containsKey(id) && !tipo_array_for.containsKey(id)){
            ErrorHandling.printError(ctx, "Variable '" + id + "' doesnt exist or its not an array");  
            return false;
        }
        
        if(tipo_array_id.get(id) != TYPE.QUESTION && tipo_array_id.get(id) != null ){
            ErrorHandling.printError(ctx, "Variable '" + id + "' it's not a Question"); 
            return false;
        }
        if(tipo_array_for.get(id) != TYPE.QUESTION && tipo_array_for.get(id) != null ){
            ErrorHandling.printError(ctx, "Variable '" + id + "' it's not a Question"); 
            return false;
        }


        
        
        
        ErrorHandling.printInfo(ctx, "done");
        return true; 
        
        
        
       
        
        
        }

    @Override public Boolean visitAnswersRandMethod(QuizGeneratorParser.AnswersRandMethodContext ctx) {
        String id = ctx.ID().getText();
        if(!tipo_id.containsKey(id) && !tipo_for.containsKey(id)){
            ErrorHandling.printError(ctx, "Variable '" + id + "' doesnt exist or its not an array");  
            return false;
        }
        
        if(tipo_id.get(id) != TYPE.QUESTION && tipo_id.get(id) != null ){
            ErrorHandling.printError(ctx, "Variable '" + id + "' it's not a Question"); 
            return false;
        }
        if(tipo_for.get(id) != TYPE.QUESTION && tipo_for.get(id) != null ){
            ErrorHandling.printError(ctx, "Variable '" + id + "' it's not a Question"); 
            return false;
        }


        
        
        
        ErrorHandling.printInfo(ctx, "done");
        return true; 
        }

    @Override public Boolean visitMultipleChoiceType(QuizGeneratorParser.MultipleChoiceTypeContext ctx) { return true; }

    @Override public Boolean visitTrueOrFalseType(QuizGeneratorParser.TrueOrFalseTypeContext ctx) { return true; }

    @Override public Boolean visitEasyDifficulty(QuizGeneratorParser.EasyDifficultyContext ctx) { return true; }

    @Override public Boolean visitMediumDifficulty(QuizGeneratorParser.MediumDifficultyContext ctx) { return true; }

    @Override public Boolean visitHardDifficulty(QuizGeneratorParser.HardDifficultyContext ctx) { return true; }
}