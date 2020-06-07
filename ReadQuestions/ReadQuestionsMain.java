import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import java.io.*;

public class ReadQuestionsMain {
	private static HashMap<String, HashMap<String, Question>> quiz = new HashMap<>();
	private static String[] letters = {"a","b","c","d","e","f","g","h"};
	
	public static void main(String[] args) throws IOException{
		quiz = readFile("bd1.question");
		assert(args.length == 4) : "ERROR! Number of arguments must be equal to 4!";
		String theme = args[0];
		String difficulty = args[1];
		String questionName = args[2];
		int numAnswers = Integer.parseInt(args[3]);
		assert(numAnswers > 0) : "ERROR! Number of answers must be higher than zero!";
		if(quiz.containsKey(theme)){
			HashMap<String, Question> questions = quiz.get(theme);
			if(questions.containsKey(questionName)){
				Question quest = questions.get(questionName);
				if(quest.getDifficulty().equals(difficulty)){
					if(numAnswers >= quest.getAnswers().size()){
						System.out.println("Warning!! Number of answers is too high!!");
						System.out.println();
						executeQuiz(quest, (quest.getAnswers().size()-1));
					}
					else{
						executeQuiz(quest, numAnswers);
					}
				}
				else{
					System.err.println("ERROR! Doesn't exist a set of questions named \""+questionName+"\" for the theme \""+theme+"\""+
					"with difficulty"+difficulty+"!");
					System.exit(0);
				}	
			}
			else{
				System.err.println("ERROR! Doesn't exist a set of questions named \""+questionName+"\" for the theme \""+theme+"\"!");
				System.exit(0);
			}
		}
		else{
			System.err.println("ERROR! Doesn't exist a theme called \""+theme+"\"!");
			System.exit(0);
		}
	}
	
	static void executeQuiz(Question quest, int numAnswers){
		System.out.println("- "+quest.getTitle());
		quest.setRightAnswers();
		quest.setWrongAnswers();
		Answer rightOne = quest.getRightAnswer();
		ArrayList<Answer> wrongOnes = quest.getWrongAnswers(numAnswers-1);
		ArrayList<Answer> answers = wrongOnes;
		answers.add(rightOne);
		int size = answers.size();
		int index = 0, iter = 0, let = 0;
		iter = size;
		for(int i = 0; i < size; i++){
			index = (int) (Math.random() * iter);
			System.out.println(letters[let]+") "+answers.get(index).getText()+";");
			answers.remove(index);
			iter--;
			let++;
		}
	}
	
	static HashMap<String, HashMap<String, Question>> readFile(String filename) throws IOException{
		try {
			// create a CharStream that reads from standard input:
			CharStream input = CharStreams.fromFileName(filename);
			// create a lexer that feeds off of input CharStream:
			ReadQuestionsLexer lexer = new ReadQuestionsLexer(input);
			// create a buffer of tokens pulled from the lexer:
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer:
			ReadQuestionsParser parser = new ReadQuestionsParser(tokens);
			// replace error listener:
			//parser.removeErrorListeners(); // remove ConsoleErrorListener
			//parser.addErrorListener(new ErrorHandlingListener());
			// begin parsing at program rule:
			ParseTree tree = parser.program();
			if (parser.getNumberOfSyntaxErrors() == 0) {
				// print LISP-style tree:
				// System.out.println(tree.toStringTree(parser));
				loadDB visitor0 = new loadDB();
				visitor0.visit(tree);
				return loadDB.getQuiz();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		catch(RecognitionException e) {
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}
}
