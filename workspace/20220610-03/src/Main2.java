
class Car { //필드선언
	private int speed; //속도

	//중복 메소드 1 : 정수버전
	public void setSpeed(int s) {
		speed = s;
		System.out.println("정수버전호출");
	}
	
	//중복 메소드 1 : 실수버전
	public void setSpeed(double s) {
		speed = (int) s;
		System.out.println("실수버전호출");
	}
}

public class Main2 {
	public static void main(String[] args) {
		Car myCar = new Car();//첫번째 객체생성
		
		myCar.setSpeed(100); //정수버전 메소드 호출
		myCar.setSpeed(79.2); //실수버전 메소드 호출
		//정수버전, 실수버전 메소드를 다 적어놨기 때문에 둘 다 가능하다 
		
//		myCar.setSpeed(1000L); -> 더 큰 범위인 더블을 찾아감
//		myCar.setSpeed('A'); -> 숫자(정수)로 인식(
//		myCar.setSpeed("A");  ->얘는 안됨

	}

}
