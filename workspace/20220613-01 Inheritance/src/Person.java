//부모 클래스

public class Person {
	private String name;
	protected int age;

	
	// 학생과 작가의 공통 필드인 이름과 나이
	//protected 자식들이 접근할 수 있도록 만들어진 접근제한자

	
	public Person(String name, int age) {
		this.name = name;
		this.age = age; //생성자
	}

	public int getAge() {
		return  age;
	}
		
	public String getName() {
		return name;

	}

}