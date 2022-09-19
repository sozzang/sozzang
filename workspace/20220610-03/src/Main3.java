import java.util.Scanner;

class Can {
	public static char[] toString;
	private String name;

	public Can(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}

public class Main3 {



	// 자판기 메소드
	// 정수형 1 -> 반환 type Can 객체 : 콜라

	// 1 -> field "콜라"
	// 2 -> field "사이다"

	// 문자열 COLA -> 반환type Can 객체 : 콜라
	// "cola" -> field "콜라"

	public static Can myCan(int a) {// type : Can , Can 클래스를 만들어놨으니깐 타입으로 선정 가능
									// Can이 반환되어야 하니깐
									// String도 클래스다 ,,
		String name = null; // null을 기본으로 두고 1,2,3이 아닐 경우 null이 뜨도록
		if (a == 1) {
			name = "콜라";
		} else if (a == 2) {
			name = "사이다";
		} else if (a == 3) {
			name = "환타";
		}
		return new Can(name);

		/*
		 * public final int COLA = 1;
         * public final int SPRITE = 2;
         * public final int FANTA = 3;
		 * if( a == 1){ 
		 * return new ("콜라") 
		 * }else if( a == 2){ 
		 * return new ("사이다") 
		 * }else if(a == 3){ 
		 * return new ("환타") }
		 */

	}

	public static Can engCan(String b) {

		String korName = null;
		if (b.equals("cola")) { //문자열 비교는 .equals("")
			korName = "콜라";
		} else if (b.equals("sprite")) {
			korName = "사이다";
		} else if (b.equals("fanta")) {
			korName = "환타";
		}
		return new Can(korName);

	}

	public static void main(String[] args) {
		System.out.println("1,2,3 눌러보세용");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		System.out.println(myCan(i)); // myCan(int a) 메소드를 호출한거
		
		System.out.println("영어로 적어보세요");
		Scanner input = new Scanner(System.in);
		String b = input.nextLine();
		System.out.println(engCan(b));
// ??????????????????????????????????????????????????????? //
	}
}
