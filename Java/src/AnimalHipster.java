import java.util.ArrayList;
import java.util.HashMap;

public class AnimalHipster {
	public ArrayList<String> findAnimalHipsters(HashMap<String, ArrayList<String>> network, HashMap<String, String> favoriteAnimals){
		ArrayList<String> animalHipsters = new ArrayList<String>();
		int x = 0;
		for (String person : network.keySet()) {
			x = 0;
			for (String friend : network.get(person)) {
				if (favoriteAnimals.get(person).equals(favoriteAnimals.get(friend))) {
					x = 1;
				}
			}
			if (x == 0) {
				animalHipsters.add(person);
			}
		}
		System.out.println(animalHipsters);
		return animalHipsters;
	}
}
