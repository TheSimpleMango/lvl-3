import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Hashmaps implements ActionListener{
	HashMap<String, String> hm = new HashMap();
	private JFrame f = new JFrame();
	private JPanel p = new JPanel();
	private JButton add = new JButton("add");
	private JButton view = new JButton("view");
	private JButton search = new JButton("search");
	
	String key;
	String value;
	
	Hashmaps(){
		f.add(p);
		f.setVisible(true);
		p.add(add);
		p.add(view);
		p.add(search);
		f.pack();
		add.addActionListener(this);
		view.addActionListener(this);
		search.addActionListener(this);
	}
	
	public static void main(String[] args) {
		Hashmaps hm = new Hashmaps();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(add)) {
			value = JOptionPane.showInputDialog("Enter a value");
			key = JOptionPane.showInputDialog("Enter a key");
			hm.put(key, value);
		}
		else if (e.getSource().equals(view)) {
			System.out.println("key, value");
			for (String key : hm.keySet()) {
				System.out.print(key + ", ");
				System.out.print(hm.get(key) + "\n");
			}
		}
		else if (e.getSource().equals(search)) {
			System.out.println(hm.get(JOptionPane.showInputDialog("Enter a key")));
		}
	}
}
