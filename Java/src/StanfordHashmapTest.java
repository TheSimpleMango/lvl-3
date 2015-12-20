import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class StanfordHashmapTest {

	HashMap<String, String> hashmap1 = new HashMap<String, String> ();
	HashMap<String, String> hashmap2 = new HashMap<String, String> ();

	@Before
	public void setup() {
		hashmap1.put("Alice", "Healthy");
		hashmap1.put("Mary", "Ecstatic");
		hashmap1.put("Bob", "Happy");
		hashmap1.put("Chuck", "Fine");
		hashmap1.put("Felix", "Sick");
		
		hashmap2.put("Mary", "Ecstatic");
		hashmap2.put("Felix", "Healthy");
		hashmap2.put("Ricardo", "Superb");
		hashmap2.put("Tam", "Fine");
		hashmap2.put("Bob", "Happy");
	}
	@Test
	public void testCommonKeyValuePairs() {
		assertEquals(2,  new StanfordHashmapProblem().commonKeyValuePairs(hashmap1, hashmap2));
	}
}
