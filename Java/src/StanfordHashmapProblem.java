import java.util.HashMap;

public class StanfordHashmapProblem {
	public int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2){
		int x = 0;
		for (String string1 : map1.keySet()) {
			for (String string2 : map2.keySet()) {
				if(string1.equals(string2) && map1.get(string1).equals(map2.get(string2))){
					x++;
				}
			}
		}
		return x;
	}
}
