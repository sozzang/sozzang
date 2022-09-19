
public class CarTest {

	public static void main(String[] args) {
		Car firstCar = new Car("a");
		Car secondCar = new Car("a");
		if(firstCar.equals(secondCar)) {
			System.out.println("같은 종류의 차입니다.");
		}else {
			System.out.println("같은 종류의 차가 아닙니다.");
		}
	}

}
