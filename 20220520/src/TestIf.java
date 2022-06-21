//조건문-if문

/*
if(조건식){  //조건식이 참이면 문장 실행
 실행할 문장
 }
 */

public class TestIf {
	public static void main(String[] args) {
		boolean condition = true;
		if (condition) {
			System.out.println("조건문 블록 안입니다.");
		}
		System.out.println("프로그램 종료");
	}
}