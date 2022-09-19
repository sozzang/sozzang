//Static
//정적변수(static variable): 모든 객체에 공통적으로 적용되는 변수(클래스변수라고도 함)
//하나의 클래스에 하나만 존재함 
//변수 앞에 static을 붙이면 정적변수가 되며 붙이지 않으면 기본적으로 인스턴스 변수가 됨
//정적메소드(static method)

class Car {
	private String color;
	private int speed;
	private int gear;
	private int id;// 시리얼 넘버
	
	private static int numberOfCars = 0;
	// 인스턴스화 된 Car의 개수를 위해 만들어진 정적 변수(static변수) 0으로 초기화 됨
	// public으로 선언되는 경우는 거의 없다.
	// static이 붙지 않으면 인트턴스마다 각각의 numberOfCars 가지고 결국 1짜리만 여러개 쌓인다
	// 즉 우리가 원하는 개수를 세는 행위를 할 수 없다.

	public Car(String c, int s, int g) {
		this.color = c;
		this.speed = s;
		this.gear = g;

		id = ++numberOfCars;
		// 자동차의 개수를 증가시키고 id 번호를 할당한다.
		// 첫번째 만들어진 자동차는 1, 두번째 만들어진 자동차는 2
	}

	// public static void printColor() {
	// System.out.println(color);}
	// 색깔(필드값)은 자동차 인스턴스를 만들 때 만들어는데 static변수는 언제나 존재하는 변수이기 때문에
	// 필드값으로 뭘 할 수가 없다.
	// 정적 메소드에서는 인스턴스 변수와 인스턴스 메소드에 접근할 수 없다.

	public void printStaticNumber() {
		System.out.println(numberOfCars);
	}

	public static int getNumberOfCars() { // 정적 메소드
		return numberOfCars;

	}
}
