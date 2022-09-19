
public class Melon extends Food {
	private String farm;

	public Melon(int cal, int price, int kg, String farm) {
		super(cal, price, kg);
		this.farm = farm;

	}

	public String getFarm() {
		return farm;
	}

	public void setFarm(String farm) {
		this.farm = farm;
	}

	public String toString() {
		return super.toString() + ", 농원:" + farm;
	}
}
