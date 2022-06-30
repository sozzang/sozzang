// 의자 클래스
// 제조사
// 생산일자
// 가격
// 모델명

//main -> 작성한 생성자를 통해 원하는 필드값으로 초기화 해보세요.

public class Chair {
	String production;
	String date;
	int price;
	String model;
	
	public Chair(String p, String d, int pr, String m) { //생성자
		production = p;
		date = d;
		price = pr;
		model = m;
	}
	
	void printAll() {
		System.out.println(production);
		System.out.println(date);
		System.out.println(price);
		System.out.println(model);
	}
	
	public static void main(String[] args) {
		Chair c = new Chair("시디즈", "2016-09-05", 374000, "T50");
		Chair c2 = new Chair("허먼밀러", "2019-10-21", 2120000, "뉴 에어론");
		
		c.printAll();
		c2.printAll();
	}
}