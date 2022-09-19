
public class PhoneTest {

	public static void main(String[] args) {
		SmartPhone s1 = new SmartPhone("가", 10, "통신타입1", "운영체제타입1", "버전1", 16, false);
		SmartPhone s2 = new SmartPhone("나", 20, "통신타입2", "운영체제타입1", "버전4", 32, true);
		SmartPhone s3 = new SmartPhone("다", 30, "통신타입3", "운영체제타입3", "버전3", 128, false);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}

}
