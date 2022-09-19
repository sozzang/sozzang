
public class Main3 {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		//원시형으로 표현한 10, 오로지 '10'을 표현한 것
		//행동을 가지게 만들고 싶을 때 Boxing을 해주면 됨
		
		Integer refNumber = Integer.valueOf(10);
		//메소드 형식으로 행동을 할 수 있는 래핑 클래스로  표현된 10
		
		refNumber.compareTo(20);
		//숫자 두개와 비교를 하고 싶을 때 간편하게
		//20과 비교를 해줘 (비교하는 행동을 함)
	
		// Integer. <- 타이핑하면 수행할 수 있는 행동들이 나옴
		// Integer.max(a, b) <- 파라미터부분에 정수 적어주며 max를 구함
	}
}
