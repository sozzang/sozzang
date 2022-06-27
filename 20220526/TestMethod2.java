public class TestMethod2{
	//메소드의 이름: 영소문자로 시작 여러 단어가 있으면 다음 단어의 첫글자를 대문자로 구분, 동사로 시작하는 편
	public static int sum(){ //public static void sum() 에서  void = return type , 뱉어내는 것이 없다.
		int a = 10;
		int b = 20;
		int sum = a + b;
		
		return sum; // 뱉어내고자 할 때는 void를 int로 바꾸고 retun + sum 이나 a+b ;
	}
	
	//pi 메소드 {3.14 실수 값을 반한하는 메소드}
	
	public static double pi(){ //파이는 실수형이니깐 리턴타입은 double
		double pi = 3.14;
		return pi;
	}
	
	public static void main(String[] args){ //메소드가 많아도 시작은 main
		System.out.println("시작");
		
		// double pi = pi();
		// System.out.println(pi);
		
		int result = sum(); // 30이라는 값을 가지고 와서 출력됨
		System.out.println(result);
		
		System.out.println("끝");
	}
}