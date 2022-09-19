//A -> B -> C -> D 로 상속되는데
//D에서 상속을 그만두고싶을 때 '종단 클래스'로 만들어줌 

public final class MyImpleClass extends MySubClass {

	@Override
	public void myMethod() {
		System.out.println("새롭게정의");
	}
	
	@Override
	public void myMethod2() {

		System.out.println("마이메소드2 오버라이드구현");
	}

	public static void main(String[] args) {
		MyClass m = new MyImpleClass();
		
		m.myMethod();
		

		
		MySubClass sub = (MySubClass) m;
		sub.myMethod2();
	}

}