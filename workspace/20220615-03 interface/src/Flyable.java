//인터페이스

//추상메소드를 가짐 (추상적인 기능과 행동에 중점을 둠)
//제목은 대문자로 시작, '- 할 수 있음'의 표현으로 지음
//클래스를 헷갈리지 않기 위해 맨 앞에 'I'를 붙이기도 함

public interface Flyable {
//'날 수 있다'는 행동 자체에 대한 인터페이스
	void fly(); 
	// public abstract void fly(); 에서 public abstract 생략가능

}

class Animal {
}

class Bird extends Animal {
}

class Eagle extends Bird implements Flyable {
	// 독수리는 날 수 있는 새다 ! implements + 인터페이스 동작
	
	@Override
	public void fly() {
		System.out.println("독수리는 엄청 크게 납니다.");
	}
}
//인터페이스에 있는 것을 그대로 물려받는다.
//추상메소드를 물려받기 때문에 구체화할 책임이 있다.
//독수리에 대해서 오버라이드 해줘야함.

class Penguin extends Bird {
}

class FlyingFish extends Animal implements Flyable {
//동물에 상속도 당근 가능함

	@Override
	public void fly() {
		System.out.println("날치는 물 위로 납니다.");
	}
}

class Plane implements Flyable {

	@Override
	public void fly() {
		System.out.println("비행기가 납니다.");

	}
}





//public void print() {
//System.out.println("hello");
//} 인터페이스는 추상 메소드만을 가짐, 일반 메소드는 올 수 없다.
