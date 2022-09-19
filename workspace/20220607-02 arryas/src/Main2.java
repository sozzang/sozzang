//길이가 5인 정수형(int)배열을 선언 초기화하고
//모든 원소(element)의 값을 100으로 설정해보세요.
//원소는 배열 한 칸에 들어가 있는 것

public class Main2 {
	public static void main(String[] args) {

		int[] myBox = new int[5];// int타입선언,초기화

		myBox[0] = 100;
		myBox[1] = 100;
		myBox[2] = 100;
		myBox[3] = 100;
		myBox[4] = 100;
		
		System.out.println(myBox[0]);
		System.out.println("프로그램 정상 종료");
	}
}
