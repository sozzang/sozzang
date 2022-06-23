//반복문-while문

public class Loop2 {
	public static void main(String[] args) {
		// 1~10000까지 출력

//		int i = 1; // 1부터 출력하라고 했으니까 1로 초기화
//		while (i <= 10000) {
//			System.out.println(i);
//			i++; // i에 1씩 더해가면서 10000까지
//		}

		// 20~29까지 출력

//		int i = 20; // 20부터 출력하라고 했으니까 20으로 초기화
//		while (i <= 29) {
//			System.out.println(i);
//			i++; // 20부터 1씩 더해가면서 29까지
//		}

		// 10 9 8 ~ 0까지 역순으로 출력

//		int i = 10; // 10부터 출력
//		while (i >= 0) {
//			System.out.println(i);
//			i--; // 10에서 0까지 1씩 작아지기
//		}

		// 1~100 사이의 3의 배수를 출력해보세요.

//		int i = 3;
//		while (i < 100) {
//			System.out.println(i);
//			i += 3;
//		}

		// ☆1
		// ★2
		// ☆3
		// ★4
		// ☆5
		// ★6
		// ☆7
		// ★8

		int i = 1;
		while (i <= 8) {
			if (i % 2 == 0) {
				System.out.println("★");// 규칙을 봤을 때 2의 배수 자리에만 ☆ 이니깐
			} else {
				System.out.println("☆ ");
			}
			i++; // 이거 안붙여주면 무한 별나옴.. 제발 인지해~
		}

	}

}