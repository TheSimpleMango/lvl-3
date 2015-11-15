import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel; 
import javax.swing.JPanel;


public class Hangman0 {
	static JFrame frame = new JFrame("Meme Hangman");
	static JPanel panel = new JPanel();
	static ArrayList<JLabel> labels = new ArrayList<JLabel>();
	static ArrayList<String> words = new ArrayList<String>();
	public static void main(String[] args) {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		words.add("pepe");
		words.add("feels guy");
		words.add("miley what's good?");
		words.add("JOOOOHHHN CENA");
		words.add("");
		for (int i = 0; i < 5; i++) {
			labels.add(new JLabel("_"));
		}
		for (int i = 0; i < labels.size(); i++) {
			panel.add(labels.get(i));
		}
		frame.pack();
	}
}
