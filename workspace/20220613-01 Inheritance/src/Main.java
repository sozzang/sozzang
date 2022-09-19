//학생
//이름 //나이
//점수

//이름알려주기 //점수알려주기



//작가
//이름 //나이
//작품 목록

//이름알려주기 //작품목록알려주기


public class Main {

	public static void main(String[] args) {
		Person p = new Person("사람이름", 22);
		Student s = new Student("학생이름", 17, 80);
		System.out.println(s.getName());
		System.out.println(s.getScore());
		System.out.println(s.getAge());
		
		
		
	    Author a = new Author("작가이름", 30,"반지의길");
	    System.out.println(a.getName());
	    System.out.println(a.getBookList());
	}

}


//상속 : 이미 존재하는 클래스로부터 속성과 동작을 물려받고 필요한 기능을 추가하는 기법
//중복되는 코드를 줄이고 이미 검증된 소프트웨어를 재사용할 수 있어서 쉽게 개발, 유지보수 할 수 있다.
//상속되는 클래스를 부모(수퍼클래스), 상속받는 클래스를 자식(서브클래스)

//사자,고양이,개 클래스를 만들려고 보니 공통된 속성과 동작이 있다.
//동물 클래스를 만들어 상속시킨다.
//사자, 고양이, 개는 동물이다.즉, 자식은 부모다. 'is-a' 관계이다. (상속계층이 올바르게 설계되었는지 알 수 있는 방법이기도 함)
//class 자식클래스명 extends 부모클래스명
//수퍼클래스를 변경하면 서브클래스가 영향을 받는다. 당연함.
//상속의 횟수를 따로 제한하지 않는다.
//2개 이상의 수퍼클래스로부터 상속을 받는것(다중상속)을 허용하지 않는다.


