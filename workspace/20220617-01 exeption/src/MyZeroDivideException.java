//나만의 예외 객체를 생성한 것 
//상속구조
//RuntimeException : try-catch 강요하지 않음

import java.time.LocalTime;

public class MyZeroDivideException extends RuntimeException {
	public MyZeroDivideException(String message) {
		super(message + ", " + LocalTime.now() + "에 발생했습니다");
		//MyZeroDivideException만의 특별한 특성을 추가해줬음
	}

}
