import java.io.FileReader;
import java.util.Stack;


public class RobotDirection {
	final static int N = 0;
	final static int W = 1;
	final static int S = 2;
	final static int E = 3;
	static float length;
	static char directionChar;
	static int direction;
	
	static float longitude = 0;
	static float latitude = 0;
	public static void main(String[] args){
		Stack<String> instructionStack = new Stack<String>();
		
		char c = ' ';
		String s = "";
		try {
			FileReader fr = new FileReader("InstructionTest.txt");
			while ((c = (char) fr.read()) != (char) -1) {
				if (c != '\n') {
					s += c;
				}
				else {
					System.out.println("string: " + s);
					instructionStack.push(s);
					s = "";
					System.out.println(instructionStack.peek());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*char c = ' ';
		String s = "";
		try {
			while ((c = (char) fr.read()) != (char) -1) {
				//System.out.println("char: " + c);
				if (c != '\n') {
					s += c;
				}
				else {
					//System.out.println("string: " + s);
					instructionStack.push(s);
					
					s = "";
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		Stack<Instruction> instructions = new Stack<Instruction>();
		int index = instructionStack.size();
		for (int i = 0; i < index; i++) {
			if (Character.isDigit(instructionStack.peek().charAt(0))) {
				System.out.println("Instruction-" + i);
				System.out.println(instructionStack.peek());
				length = Float.parseFloat(instructionStack.peek().substring(0, 4));
				directionChar = instructionStack.pop().charAt(6);
				if (directionChar == 'N') {
					direction = 0;
				}
				if (directionChar == 'W') {
					direction = 1;
				}
				if (directionChar == 'S') {
					direction = 2;
				}
				if (directionChar == 'E') {
					direction = 3;
				}
				instructions.push(new Instruction(length, direction));
			}
		}
		int x;
		float y;
		index = instructions.size();
		for (int i = 0; i < index; i++) {
			x = instructions.peek().getDirection();
			y = instructions.pop().getAmount();
			switch (x) {
			case 0:
				longitude += y;
				break;
			case 1:
				latitude -= x;
				break;
			case 2:
				longitude -= y;
				break;
			case 3:
				latitude += x;
				break;

			default:
				break;
			}
		}
		
		System.out.println("final position: " + latitude + ", " + longitude);
	}
}

class Instruction {
	float amount;
	int direction;
	Instruction(){}
	Instruction(float amount, int direction){
			this.amount = amount;
			this.direction = direction;
		}
		public float getAmount(){
			return amount;
		}
		public int getDirection(){
			return direction;
		}
		public void setAmount(float amount){
			this.amount = amount;
		}
		public void setSuperPower(int direction){
			this.direction = direction;
		}
		public String toString(){
			return"meters: " + amount + "; superPower: " + direction;
		}
}
