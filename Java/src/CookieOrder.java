public class CookieOrder {
	private String variety;
	private int numBoxes;
	/** Constructs a new CookieOrder object. */
	public CookieOrder(String variety, int numBoxes) {
		this.setVariety(variety);
		this.setNumBoxes(numBoxes);
	}
	public String getVariety() {
		return variety;
	}
	public void setVariety(String variety) {
		this.variety = variety;
	}
	public int getNumBoxes() {
		return numBoxes;
	}
	public void setNumBoxes(int numBoxes) {
		this.numBoxes = numBoxes;
	}
}