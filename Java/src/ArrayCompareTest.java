import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

public class ArrayCompareTest {
	@Test
	public void testArrayCompare() {
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		x.add(7);
		x.add(3);
		x.add(26);
		y.add(7);
		y.add(26);
		y.add(-7);
		assertEquals(2,arrayCompare(x,y));
	}
	public int arrayCompare(ArrayList<Integer> x, ArrayList<Integer> y){
		int same = 0;
		for (int i : x) {
			for (int i2 : y) {
				if (i == i2) {
					same++;
				}
			}
		}
		return same;
	}
}
