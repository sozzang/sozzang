
public class FoodTest {

	public static void main(String[] args) {
		Melon m = new Melon(100, 15000, 5, "박농장");
		Melon m2 = new Melon(200, 20000, 7, "소농장");
		Melon m3 = new Melon(130, 12000, 3, "현농장");
		Melon m4 = new Melon(300, 30000, 10, "짱농장");
		
		System.out.println(m.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		System.out.println(m4.toString());
	}

}
