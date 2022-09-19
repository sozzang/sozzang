//인터페이스에는 추상메소드 + 등등
//스태틱한 상수, 스태틱한 디폴트 메소드 

public class Main {
	public interface Days {
		public static final int NUM = 10; // 상수 정의
		public static final int MONDAY = 1;
		public static final int TUESDAY = 2;
		public static final int WENDSDAY = 3;
	}

	interface MyInterface {
		default void printHello() {
			System.out.println("Hello");
		} // default 메소드
			// 안녕이라고 말 할 수 있는 한국,미국,영국 중
			// 미국,영국은 동일하게 Hello로 오버라이드해야했음
			// 8버전부터 동일한 동작을 하는 경우에는 인터페이스에 미리 동작을 구현해두는 방식을 만듦
			// 추상메소드의 기본값이라고 생각하면 됨
			// 한국은 특별히 오버라이드 해줘야함."안녕하세요"라는 동작을 해야하니깐

		public static void myStaticMethod() {

		}

		static int sum(int a, int b) {
			return a + b;
		}
		// private는 안됨.. 현재까지는

	}

	public static void main(String[] args) {
		System.out.println(Days.NUM);

	}

}
