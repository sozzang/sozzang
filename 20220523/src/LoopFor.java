//반복문-for문
/*for(초기식;조건식;증감식){
	반복할 문장
}*/

//초기식 -> 조건식 (조건이 참이면 문장반복) -> 증감 
//초기식 -> 조건식 (조건이 거짓이면 반복 탈출)
public class LoopFor {
	public static void main(String[] args) {
		// "반복"이라는 문자열 5번 출력하기

//		for (int i = 0; i < 5; i++) {
//			System.out.println("반복");
//		}
//		// 0에서 4까지 1씩 증가해가며 반복한다. 5번이 되는 순간 조건식이 거짓이 되면서 탈출~

		// 1부터 10까지 출력하기 (for문을 이용하여)

//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}

		// 21부터 30까지의 3의 배수 출력하기

		for (int i = 21; i <= 30; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}