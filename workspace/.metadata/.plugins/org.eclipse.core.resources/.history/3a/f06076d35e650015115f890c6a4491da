import java.util.Stack;

import javax.swing.JOptionPane;


public class Stacks {
	public static void main(String[] args) {
		Stack<Character> letterStack = new Stack<Character>();
		String input = JOptionPane.showInputDialog("write stuff:");
		for (int i = 0; i < input.length(); i++) {
			letterStack.push(input.charAt(i));
			System.out.print(input.charAt(i));
		}
		System.out.println("\n");
		int x = letterStack.size();
		for (int i = 0; i < x; i++) {
			System.out.print(letterStack.pop());
		}
	}
}
