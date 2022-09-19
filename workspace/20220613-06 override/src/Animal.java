//상속관계를 한 눈에 쉽게 보기 위하여 '클래스 다이어그램'으로 그림을 그림
//플러그인으로 설치 

//help -> install new software 
//http://takezoe.github.io/amateras-update-site 복붙
//빈칸을 선택 -> next
//미리 그림을 그려 놓고 자바화 
//소스코드를 그림으로 (얘를 많이 씀)

public class Animal {
	public void sound() {
		System.out.println("동물은 다른 소리를 냅니다.");
		// 동물은 소리를 내는데 강아지와 고양이는 다른 소리를 낸다.

	}
}

class Dog extends Animal {
	@Override // annotation
				// 오버라이드할 때 헤드를 정확히 적기 위해 도움을 줌

	public void sound() { // method override : 부모 클래스의 헤드부분을 그대로 적어서 (완전 똑같이 적어야됨)
							// 바디부분만 자식에게 맞게끔 다시 정의하는 것
		System.out.println("멍멍");

	}
}

class Poodle extends Dog {
	@Override
	public void sound() {
		System.out.println("알알알");
	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("냐옹");
	}

}