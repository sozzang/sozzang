// Method Overloading


public class Main {
	public static void someMethod(int param) {

	}

	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	public static void sum(double a, double b) {
		System.out.println(a + b);
		
	}
	//메소드는 이름으로만 같고 다름을 따지지 않음
	//파라미터의 타입,순서,개수가 다르면 다른 메소드로 인식
	//다양한 타입에 대응할 수 있음
	
	public static void main(String[] args) {
		
		
		sum(10.0, 40.0);	
		//실수를 넣으면 double 타입의 메소드에 적용
		
		sum(10, 40);
		//정수를 넣으면 int 타입의 메소드에 적용됨

		
//      Method Overloading
//		System.out.println(123123);
//		System.out.println(123.123);
//		System.out.println("123.123");

	}

}
