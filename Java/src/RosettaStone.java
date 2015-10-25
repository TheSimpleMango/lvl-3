import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class RosettaStone implements ActionListener{
	HashMap<String, String> RosettaStone = new HashMap();
	private JFrame f = new JFrame();
	private JPanel p = new JPanel();
	private JButton translate = new JButton("translate");
	private JButton randButton = new JButton("random");
	private JTextField input = new JTextField(10);
	String french;
	String english;
	
	RosettaStone(){
		f.add(p);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		p.add(input);
		p.add(translate);
		p.add(randButton);
		f.pack();
		translate.addActionListener(this);
		randButton.addActionListener(this);
		
		RosettaStone.put("Bonjour", "Hello");
		RosettaStone.put("Je", "I");
		RosettaStone.put("Tu", "You");
		RosettaStone.put("Est", "is");
		RosettaStone.put("Elle", "She");
		RosettaStone.put("Il", "He");
		RosettaStone.put("Sympa", "nice");
		RosettaStone.put("Chat", "cat");
		RosettaStone.put("Chien", "dog");
		RosettaStone.put("Une", "1");
		RosettaStone.put("Deux", "2");
		RosettaStone.put("Trois", "3");
		RosettaStone.put("Quatre", "4");
		RosettaStone.put("Cinq", "5");
		RosettaStone.put("Six", "6");
		RosettaStone.put("Sept", "7");
		RosettaStone.put("Huit", "8");
		RosettaStone.put("Neuf", "9");
		RosettaStone.put("Dix", "10");
	}
	
	public static void main(String[] args) {
		RosettaStone rs = new RosettaStone();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(translate)) {
		System.out.println(RosettaStone.get(input.getText()));
		}
		else if (e.getSource().equals(randButton)) {
		String key = getRandomKey(RosettaStone);
		input.setText(key);
		System.out.println(RosettaStone.get(key));
		}
	}
	
	String getRandomKey(HashMap<String, String> map) {
		String[] keysAsArray = map.keySet().toArray(new String[0]);
		int randomness = new Random().nextInt(map.size());
		return keysAsArray[randomness];
	}
}