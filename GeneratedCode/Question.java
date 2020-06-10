import java.util.*;

public class Question {
	private String title;
	private String difficulty;
	private ArrayList<Answer> answers;
	private ArrayList<Answer> rightAnswers = new ArrayList<>();
	private ArrayList<Answer> wrongAnswers = new ArrayList<>();
	private static String[] letters = {"a","b","c","d","e","f","g","h"};
	private String correctLetter;
	
	public Question(String title, String difficulty, ArrayList<Answer> answers){
		this.title = title;
		this.difficulty = difficulty;
		this.answers = answers;
	}
	
	public Question(){
		this.title = null;
		this.difficulty = null;
		this.answers = new ArrayList<>();
	}
	
	public void addAnswer(Answer ans){
		this.answers.add(ans);
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setDifficulty(String difficulty){
		this.difficulty = difficulty;
	}
	
	public void numAnswers(int num){
		if(num > this.answers.size()){
			System.out.println("Warning! There's not \""+num+"\" answers in the \""+this.title+"\" question!");
			num = this.answers.size();
		}
		setRightAnswers();
		setWrongAnswers();
		Answer rightOne = getRightAnswer();
		ArrayList<Answer> wrongOnes = getWrongAnswers(num-1);
		ArrayList<Answer> newAnswers = wrongOnes;
		newAnswers.add(rightOne);
		this.answers = newAnswers; 
	}
	
	public void shuffleAnswers(){
		Collections.shuffle(this.answers);
	}
	
	// To test Visitor only
	public String getTitle(){
		return this.title;
	}
	
	// To test Visitor only
	public String getDifficulty(){
		return this.difficulty;
	}
	
	public void setRightAnswers(){
		for(int i = 0; i < answers.size(); i++){
			if(answers.get(i).getPoints() == 100){
				this.rightAnswers.add(answers.get(i));
			}
		}
	}
	
	public void setWrongAnswers(){
		for(int i = 0; i < answers.size(); i++){
			if(answers.get(i).getPoints() == 0){
				this.wrongAnswers.add(answers.get(i));
			}
		}
	}
	
	public Answer getRightAnswer(){
		int index = (int) (Math.random() * this.rightAnswers.size());
		return this.rightAnswers.get(index);
	}
	
	public ArrayList<Answer> getWrongAnswers(int num){
		ArrayList<Answer> tmp = this.wrongAnswers;
		ArrayList<Answer> wrongOnes= new ArrayList<>();
		int size = this.wrongAnswers.size();
		int index = 0;
		for(int i = 0; i < num; i++){
			index = (int) (Math.random() * size);
			wrongOnes.add(tmp.get(index));
			tmp.remove(index);
			size--;
		}
		return wrongOnes;
	}
	
	// To test Visitor only
	public ArrayList<Answer> getAnswers(){
		return this.answers;	
	}
	
	public String getCorrectLetter(){
		return this.correctLetter;
	}
	
	@Override
	public String toString(){
		String title = this.title;
		String answers = "";
		for(int i = 0; i < this.answers.size(); i++){
			answers = answers + "" + letters[i] + ") "+this.answers.get(i).getText()+"\n";
			if(this.answers.get(i).getPoints() == 100){
				this.correctLetter = letters[i];
			}
		}
		return title + "\n" +answers;
	}
}

