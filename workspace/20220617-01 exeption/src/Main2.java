//여러개의 예외
//catch만 여러개로 적어주면 됨
//캐치 예외가 없는 경우는 비정상 종료
/*상속구조가 가능함
catch (Exception e) {
			System.out.println("모든예외는 여기서 잡힌다.");
		} 
모두 잡고싶으면 이렇게 하고 , 정확한 예외를 알고싶으면 아래처럼
부모가 되는 예외가 위에 정의되어있으면 자식쪽으로 내려가는 일이 없다.
부모를 하단에 두는게 좋음
*/


public class Main2 {

	public static void main(String[] args) {
		String s = null;

		try {
			// String local = "지역변수"; 지역변수 설정

     		int div = 10 / 0;
			s.equals("asdf");
			System.out.println("실행되나?");
			// 안된다. s.equals("asdf");에서 오류가 생겼으니 catch하러가야함
			
			
		} catch (NullPointerException e) {
			System.out.println("널포인트 익센셥 처리");
			// System.out.println(local); try안에서도 지역변수 불가능
		} catch (ArithmeticException e) {
			System.out.println("수 익셉션 처리");

		}
		// System.out.println(local); try밖에서도 지역변수 불가능

		System.out.println("정상종료");
	}

}

