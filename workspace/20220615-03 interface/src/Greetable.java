//학생 : 이름, 나이
//영국학생 : 인사할 수 있음 (hello)
//한국학생 : 인사할 수 있음(안녕하세요)
//미국인 : 인사할 수 있음(wassup)


public interface Greetable {

	void greet();
}

class Student{
	private String name;
	private int age;
}

class Eng extends Student implements Greetable {

	@Override
	public void greet() {
		System.out.println("Hello");
		
	}	

}

class Kor extends Student implements Greetable {
	public void greet() {
		System.out.println("안녕하세요");
	}
}

class American implements Greetable{

	@Override
	public void greet() {
	System.out.println("WassUp");
	}
	
}

