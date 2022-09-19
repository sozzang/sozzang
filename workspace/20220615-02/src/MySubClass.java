//추상클래스(부모)를 상속하는 추상클래스(자식)

public abstract class MySubClass extends MyClass {

	@Override
	public void myMethod() { 
		System.out.println("자식에서구현됨");
	}
	//특정한 메소드에 final을 붙이면 자식 클래스에서 오버라이드 할 수 없다.
	
	public abstract void myMethod2();
}
