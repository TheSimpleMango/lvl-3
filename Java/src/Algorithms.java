import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		return eggs.indexOf("cracked");
	}

	public static int countPearls(List<Boolean> oysters) {
		int x = 0;
		for (Boolean b : oysters) {
			if (b.equals(true)) {
				x++;
			}
		}
		return x;
	}

	public static double findTallest(List<Double> peeps) {
		double x = 0;
		for (Double double1 : peeps) {
			if (double1 > x) {
				x = double1;
			}
		}
		return x;
	}

	public static String findLongestWord(List<String> words) {
		int x = 0;
		String y = "";
		for (String string : words) {
			if (string.length() > x) {
				x = string.length();
				y = string;
			}
		}
		return y;
	}

	public static boolean containsSOS(List<String> message1) {
		for (String string : message1) {
			if (string.contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static ArrayList<Double> sortScores(List<Double> results) {
		ArrayList<Double> sortedScores = new ArrayList<Double>();
		int x = 1;
		for (Double double1 : results) {
			if (x <= 2) {
				sortedScores.add(double1);
				x++;
			} else {
				for (int i = 0; i < sortedScores.size(); i++) {
					if (double1 > sortedScores.get(sortedScores.size() - 1)) {
						sortedScores.add(double1);
					} else if (double1 < sortedScores.get(0)) {
						sortedScores.add(0, double1);
					}
					if (double1 > sortedScores.get(i) && double1 < sortedScores.get(i + 1)) {
						sortedScores.add(i + 1, double1);
					}
				}
			}
		}
		return sortedScores;
	}

	public static ArrayList<String> sortWords(ArrayList<String> words) {
		ArrayList<String> sortedWords = new ArrayList<String>();
		int x = 1;
		for (String string : words) {
			for (int i = 0; i < sortedWords.size(); i++) {
				if (x <= 2 && ) {
					sortedScores.add(double1);
					x++;
				} else {
					if (string.length() > sortedWords.get(sortedWords.size() - 1).length()) {
						sortedWords.add(string);
					} else if (string.length() < sortedWords.get(0).length()) {
						sortedWords.add(0, string);
					}
					if (string.length() > sortedWords.get(i).length() && string.length() < sortedWords.get(i + 1).length()) {
						sortedWords.add(i + 1, string);
					}
				}
			}
		}
		return sortedWords;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		return null;
	}

}