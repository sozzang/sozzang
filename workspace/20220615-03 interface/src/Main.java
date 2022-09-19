//인터페이스


public class Main {

	public static void main(String[] args) {
//		Flyable f = new Flyable(); 인터페이스도 인스턴스화 할 수 없다.

		Eagle e = new Eagle();
		Bird b = e; // 업캐스팅 가능
		Animal a = e; // 업캐스팅 가능
		Flyable f = e; // e 참조 
		
		f.fly(); //추상메소드 호출가능 , f는 독수리를 참조하고 있다.
		
		Flyable p = new Plane();
		Flyable fish = new FlyingFish();
		
		p.fly();
		fish.fly();
	}

}
