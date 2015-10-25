import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class HashtagTheDress implements ActionListener{
	HashMap<String, Boolean> survey = new HashMap();
	private JFrame f = new JFrame();
	private JPanel p = new JPanel();
	private JButton yes = new JButton("yes");
	private JButton no = new JButton("no");
	private JLabel name = new JLabel("name:");
	private JTextField input = new JTextField(10);
	private JButton done = new JButton("done");
	
	String key;
	String value;
	
	HashtagTheDress(){
		f.add(p);
		f.setVisible(true);
		p.add(name);
		p.add(input);
		p.add(yes);
		p.add(no);
		p.add(done);
		f.pack();
		yes.addActionListener(this);
		no.addActionListener(this);
		done.addActionListener(this);
	}
	
	public static void main(String[] args) {
		HashtagTheDress htd = new HashtagTheDress();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(yes)) {
			survey.put(input.getText(), true);
		}
		else if (e.getSource().equals(no)) {
			survey.put(input.getText(), false);
		}
		else if (e.getSource().equals(done)) {
			float i = 0;
			float x = 0;
			for (String key : survey.keySet()) {
				System.out.println(key + ", " + survey.get(key));
				if (survey.get(key).equals(true)) {
					x++;
				}
				i++;
				System.out.println(x/i*100 + "%");
			}
		}
	}
}
