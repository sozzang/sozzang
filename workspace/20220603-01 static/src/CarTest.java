
public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car("blue", 100, 1);// 생성자 호출
		c1.printStaticNumber();
		
		Car c2 = new Car("white", 0, 1);// 생성자 호출
		c2.printStaticNumber();
		
		int n = Car.getNumberOfCars();// 정적메소드 호출
		System.out.println("지금까지 생성된 자동차 수 = " + n);
	}
}
