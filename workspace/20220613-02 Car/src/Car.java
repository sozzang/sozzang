//부모클래스 

public class Car {
	// Car클래스의 3가지 필드 선언
	int speed; // 속도
	int gear; // 기어
	public String color; // 색상, 테스트를 위하여 공용 필드로 만듦

	public void speedUp(int increment) { // 속도 증가 메소드
		speed += increment;
	}

	public void speedDown(int decrement) { // 속도 감소 메소드
		speed -= decrement;
	}
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", gear=" + gear + ", color=" + color + "]";
	}
}
