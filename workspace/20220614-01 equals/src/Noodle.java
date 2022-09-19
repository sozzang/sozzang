//컵라면

public class Noodle {
	private String name;
	private String made;
	private int price;

	public Noodle(String name, String made, int price) {
		this.name = name;
		this.made = made;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMade() {
		return made;
	}

	public void setMade(String made) {
		this.made = made;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "컵라면:" + name + ", 제조사:" + made + ", 가격" + price;

	}
	@Override
	
     public boolean equals(Object obj) {
		if (obj instanceof Noodle) {
			return (name.equals(((Noodle) obj).name) && made.equals(((Noodle) obj).made));
			//name을 확인할 수 있게 다운캐스팅하여 형변환
		} else {
			return false;
		}
	}
}
