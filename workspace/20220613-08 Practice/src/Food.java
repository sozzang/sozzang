
public class Food {
	private int cal;
	private int price;
	private int kg;

	public Food(int cal, int price, int kg) {
		this.cal = cal;
		this.price = price;
		this.kg = kg;

	}

	public int getCal() {
		return cal;
	}

	public void setCal(int cal) {
		this.cal = cal;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getKg() {
		return kg;
	}

	public void setKg(int kg) {
		this.kg = kg;
	}

	public String toString() { //소스->toString 하면 쉽게 쓸 수 있
		return "칼로리: " + cal + ", 가격:" + price + ", 무게:" + kg;
		
	}
}
