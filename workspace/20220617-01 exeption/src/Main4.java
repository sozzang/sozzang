//throw new Exception();
//보고서 느낌~ 
//나만의 예외상황 대한 객체를 생성해서 던진다


public class Main4 {

	public static void main(String[] args) {
		try {
			int left = 10;
			int right = 0;
			if (right == 0) {
				// 0으로 나누려는 예외 발생
				// 보고서 적어서 던질거임
				throw new MyZeroDivideException("0으로 나누는 예외적인 상황이 발생하였습니다.");
				//예외 객체 생성할 수 있음
				//필드로 message를 가질 수 있음. 예외적인 상황을 메세지로 적어줌
				//새로운 예외 객체가 발생 = 던진다 
				
			}
		} catch (Exception e) {
			
			System.out.println((e.getMessage()));
		}

	}

}
