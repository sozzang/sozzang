class Car {
	public int speed; //속도
	public int gear; //주행거리
	public String color; //색상
	
	public Car() {
		speed = 0;
	}
	public void speedUp() { //속도 증가 메소드
		speed += 10;
	}
	public String toString() { 
		//객체의 상태(필드값)를 문자열로 반환하는 메소드 
		return "속도: " + speed + "기어: " + gear + "색상: " + color;
	} 
}
