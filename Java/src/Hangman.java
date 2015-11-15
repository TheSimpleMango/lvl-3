import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Hangman implements KeyListener {
	JFrame frame = new JFrame("Hangman");
	JPanel panel = new JPanel();
	JLabel incorTries = new JLabel();
	ArrayList<JLabel> labels;
	ArrayList<String> words = new ArrayList<String>();
	int charsCorrect = 0;
	int charsIncorrect = 0;
	String currentWord = "";
	Hangman(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(271, 100);
		frame.add(panel);
		frame.addKeyListener(this);
		words.add("clouds");
		words.add("trees");
		words.add("window");
		words.add("buildings");
		words.add("cars");
		incorTries.setBorder(BorderFactory.createLineBorder(Color.blue, 3));
		panel.add(incorTries);
		addUI();
	}
	public void addUI(){
		labels = new ArrayList<JLabel>();
		Random r = new Random();
		currentWord = words.get(r.nextInt(5));
		incorTries.setText(Integer.toString(charsIncorrect));
		for (int i = 0; i < currentWord.length(); i++) {
			labels.add(new JLabel("_ "));
		}
		for (JLabel jLabel : labels) {
			panel.add(jLabel);
			incorTries.setText("0");
		}
		panel.repaint();
	}
	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void keyPressed(KeyEvent e) {
		for (int i = 0; i < currentWord.length(); i++) {
			if (currentWord.charAt(i) == e.getKeyChar()) {
				labels.get(i).setText("" + e.getKeyChar());
				charsCorrect++;
				charsIncorrect-=(currentWord.length()+1);
			}
			else {
				charsIncorrect++;
				incorTries.setText(Integer.toString(charsIncorrect));
			}
		}
		if (currentWord.length() == charsCorrect || charsIncorrect == 10) {
			labels.removeAll(labels);
			addUI();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
	}
	public static void main(String[] args) {
		Hangman h = new Hangman();
	}
}
