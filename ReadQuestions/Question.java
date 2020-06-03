import java.util.*;

public class Question {
	private String title;
	private String difficulty;
	private ArrayList<Answer> answers = new ArrayList<>();
	private ArrayList<Answer> rightAnswers = new ArrayList<>();
	private ArrayList<Answer> wrongAnswers = new ArrayList<>();
	
	public Question(String title, String difficulty, ArrayList<Answer> answers){
		this.title = title;
		this.difficulty = difficulty;
		this.answers = answers;
	}
	
	// To test Visitor
	public String getTitle(){
		return this.title;
	}
	
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
	
	public ArrayList<Answer> getAnswers(){
		return this.answers;	
	}
}

