
public class Main {

	public static void main(String[] args) {
		Object o = new Dog();
		//클래스를 정의할 때 수퍼 클래스가 없으면 자바에서 최상단의 Object클래스를 만들어둠
		//equals, toString 등을 오버라이드해서 사용하고 있었음
		//sysout 할때 dog@12kdfk 이런식으로 뜨던게 다 object의 toString을
		//오버라이드하고 있었던것
		
		
	
//		Animal a = new Cat();
//		Animal a2 = new Dog();
//
//		if (a instanceof Dog) { // Dog 인스턴스인지 확인해야함
//			Dog d = (Dog) a;
//			d.sound();
//		} //Dog인스턴스가 아니라서 sound를 내지 못함.
//
//		if (a2 instanceof Dog) {
//			Dog d2 = (Dog) a2;
//			d2.sound();
//		}
		
	
		Dog d = new Dog();
		Dog p = new Poodle();
		//poodle은 Dog다
		
		Animal a = p;
		a.sound();
		//푸들은 개이고 개는 동물이다 => 참조가능!
		

//		Animal a = new Animal();
//		a.sound();
//
//		Dog d = new Dog();
//		d.sound(); // 재정의된 메소드가 호출
//
//		Cat c = new Cat();
//		c.sound();
		
//		Animal a =  new Dog();
//		a.sound();
//		//업캐스팅 : 강아지 = 동물 (Animal)<생략 new Dog 
//		//a가 가리키고 있는것은 동물
//		
//		Dog d = (Dog) a;
//		//다운캐스팅 : 형변환시 명시적으로 (Dog)를 적어줘야함
//		
//		//Animal another = new Animal();
//		//another.sound();
//		//동물로 만들어진 동물은 멍멍,알알,냐옹 하지못함

	}

}
