import java.util.Stack;

import javax.swing.JOptionPane;


public class Question {
	
	public static void main(String[] args) {
		Stack<Question> questions = new Stack<Question>();
		questions.push(new Question("yes", "are u chill"));
		questions.push(new Question("une pomme", "what's an apple in french"));
		questions.push(new Question("...", "what're thooooose"));
		questions.push(new Question("21", "what's 9 + 10"));
		questions.push(new Question("idk either", "idk man"));
		int questionSize = questions.size();
		for (int i = 0; i < questionSize; i++) {
			questions.pop().askQuestion();
		}
	}
	
	String answer, question;
	public Question(String answer, String question){
		this.answer = answer;
		this.question = question;
	}
	public void askQuestion(){
		String input = JOptionPane.showInputDialog(question);
		if (input.equalsIgnoreCase(answer)) {
			System.out.println("Ayyyyyyyyy");
		}
		else {
			System.out.println(":/");
		}
	}
}
