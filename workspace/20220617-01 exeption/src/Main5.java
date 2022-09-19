//divide 메소드에서 던지기
//메소드에서의 예외 처리 : 예외 처리를 호출한 쪽으로 넘기기 (,로 여러 개 넘길 수 있음)
//메소드안에서 처리하지 않고 호출한 쪽으로 미루는거임
//메소드 뒤에 + throws MyZeroDivideException
//Exeption의 자식들 중 RuntimeException 이라는 자식이 있다.
//try-catch를 강요안하는 Unchecked Exception
//RuntimeException의 자식으로 만들어주면 됨. ...

//Exception을 상속하는 RunTimeException을 상속받으면 실행중에 발생할 수 있는 예외들을 try-catch하도록 강요하지 않음(unchecked)
//Exception은 checked -> 무조건 try-catch 작성
import java.util.Scanner;

public class Main5 {
	public static int divide(int left, int right) throws MyZeroDivideException {
		if (right == 0) {
			throw new MyZeroDivideException("나눌 수 없다");
		} else {
			return left / right;
		}
	}

	public static int myFunction() {
		// 바디 미완성
		throw new UnsupportedOperationException("내일만들게..아직 미완성");
	}

	public static void main(String[] args) {

		myFunction();
//		Scanner scan = new Scanner(System.in);	
//		scan.nextInt();
//
//		int result = divide(100, 50);

	}
}
