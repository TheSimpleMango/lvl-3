import java.util.ArrayList;
import java.util.Random;

public class LongChipCompetition {
	
	public static void main(String[] args) {
		LongChipCompetition x = new LongChipCompetition();
		x.initializeBeatles();
		
		ArrayList<Double> chipLength = new ArrayList<Double>();
		for (int i = 0; i < 4; i++) {
			chipLength.add(i, (double) 0);
		}
		
		for (int i = 0; i < 4; i++) {
			ArrayList<Chip> chips = x.theBeatles.get(i).getChips();
			System.out.println("beatleNumber: " + i);
			for (int j = 0; j < chips.size(); j++) {
				System.out.println("compare: " + chips.get(j).getLength() + ", " + chipLength.get(i));
				if (chips.get(j).getLength() > chipLength.get(i)) {
					chipLength.set(i, chips.get(j).getLength());
				}
			}
		}
		
		double longestChip = 0;
		int beatleNumber = 0;
		
		for (int i = 0; i < 4; i++) {
			System.out.println(i);
			System.out.println(longestChip);
			if (chipLength.get(i) > longestChip) {
				longestChip = chipLength.get(i);
				beatleNumber = i;
				System.out.println("longer:");
			}
			System.out.println(chipLength.get(i) + "\n");
		}
		
		String beatleName = "";
		
		switch (beatleNumber) {
		case 0:
			beatleName = "George";
			break;
		case 1:
			beatleName = "John";
			break;
		case 2:
			beatleName = "Paul";
			break;
		case 3:
			beatleName = "Ringo";
			break;

		default:
			break;
		}
		
		System.out.println(beatleName + " has the longest chip");
	}
	
	/**
	 * The Beatles are eating lunch and playing a game to see who has the longest chip. (In England, french fries are called "chips".)
	 * 
	 * Find the Beatle with the longest chip. You may not edit the Chip or Beatle classes. Make sure to initialize The Beatles before you start your
	 * search.
	 * 
	 * **/

	private ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();

	private void initializeBeatles() {
		Beatle george = new Beatle("George");
		Beatle john = new Beatle("John");
		Beatle paul = new Beatle("Paul");
		Beatle ringo = new Beatle("Ringo");

		theBeatles.add(george);
		theBeatles.add(john);
		theBeatles.add(paul);
		theBeatles.add(ringo);
	}
}

class Beatle {
	private String name;
	private ArrayList<Chip> chips = new ArrayList<Chip>();

	public Beatle(String name) {
		this.name = name;
		initializePlateOfChips();
	}

	private void initializePlateOfChips() {
		int numberOfChips = new Random().nextInt(100);
		for (int i = 0; i < numberOfChips; i++) {
			chips.add(new Chip(new Random().nextDouble() * 10));
			if (this.name.contains("in")) chips.add(new Chip(10));
		}
	}

	public ArrayList<Chip> getChips() {
		return this.chips;
	}

	public String getName() {
		return this.name;
	}

}

class Chip {
	private double length;

	public double getLength() {
		return length;
	}

	Chip(double d) {
		this.length = d;
	}
}

