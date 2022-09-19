//동물클래스(부모 클래스)

    public class Animal {
    	
	private String kind;
	private int age;
	private int kg;
	private String Zookeeper;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getKg() {
		return kg;
	}

	public String getZookeeper() {
		return Zookeeper;
	}

	public void setZookeeper(String zookeeper) {
		Zookeeper = zookeeper;
	}

	public void setKg(int kg) {
		this.kg = kg;
	}

	public Animal(String kind, int age, int kg, String Zookeeper) {
		super();
		this.kind = kind;
		this.age = age;
		this.kg = kg;
		this.Zookeeper = Zookeeper;
	}

	public Animal() {

	}
	public String toString() {
		return "종:" + kind + ", 나이:" + age
				+", 몸무게:" + kg + ", 사육사:" + Zookeeper;
	}

   
}
//육식동물클래스(자식클래스)
    class Meat extends Animal {
	private String meat;

	public Meat(String kind, int age, int kg, String meat,  String Zookeeper) {
		super(kind, age, kg, Zookeeper);
		this.meat = meat;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public Meat() {

	}
	public String toString() {
		return super.toString() + ", 주식:" + meat;
	}

}
//초식동물클래스(자식클래스)
    class Grass extends Animal {
	private String grass;

	public Grass(String kind, int age, int kg, String grass,  String Zookeeper) {
		super(kind, age, kg, Zookeeper);
		this.grass = grass;
	}
	public String toString() {
		return super.toString() + ", 주식:" + grass;
	}
}
