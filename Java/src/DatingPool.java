import java.util.HashMap;
import java.util.Stack;


public class DatingPool {
	public static void main(String[] args) {
		HashMap<String, String> eB = new HashMap();
		
		eB.put("Max", "Conservative");  
		eB.put("Bob", "conservative"); 
		eB.put("Diego ", "libertarian");
		eB.put("Felix", "Independant");
		eB.put("William", " Republican");  
		eB.put("Chuck", " Republican");  
		eB.put("Matthew ", "liberal");  
		eB.put("Jose ", "liberal");  
		eB.put("Elizabeth ", "liberal");
		
		String[] keys = eB.keySet().toArray(new String[0]);
		Stack<String> arrayOfEB = new Stack();
		for (String key : keys) {
			if (eB.get(key).equals("liberal")) {
				arrayOfEB.push(key);
			}
		}
		
		int size = arrayOfEB.size();
		System.out.println("Mary can date:");
		for (int i = 0; i < size; i++) {
			System.out.println(arrayOfEB.pop());
		}
	}
}
