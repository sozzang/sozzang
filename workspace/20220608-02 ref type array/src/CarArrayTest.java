
public class CarArrayTest {
	public static void main(String[] args) {
		final int NUM_CAR = 5;
		Car[] cars = new Car[NUM_CAR];
		//배열선언과 초기화
		//자동차배열이 만들어진거지 자동차가 만들어진건아님 (null상태)
		
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car();
		}
		//자동차 5번 만들기 i번째 index에 자동차 만드는중 (5번까지)
		
		for (int i = 0; i < cars.length; i++) {
			cars[i].speedUp();
		}
		//for(Car car : cars)
		//car.speedUP();
		//for-each문 
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		//for(Car car : cars)
		//System.out.println(car);
		//for-each문
			
		//toString을 안썼는데도 출력되는 이유는
		//객체를 문자처럼 다루고자할 때 출력시에 자동으로 toString 메소드를 찾아서 출력
		}

	}
}
