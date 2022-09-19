//Fianlly블록
//try-catch블록에서 예외가 발생하든 말든 무조건! 언제나! 실행됨
//그 다음 정상흐름으로 "정상종료" 출력

public class Main3 {

	public static void main(String[] args) {
		try {
			System.out.println("try블록 안");
			System.out.println("문장1");
			
			Object o = new Object();
			String s = (String) o;
			//예외발생
			
			System.out.println("문장2");
		} catch (Exception e) { //자식 예외들을 모두 잡으려고 대기중
			System.out.println("catch블록 안");
		} finally {
			System.out.println("finally블록 안");
		}
		System.out.println("정상종료");
	}

}
