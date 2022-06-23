//사용자의 입력을 받아 원하는 단수의 구구단 출력하는 프로그램
//while 사용

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("원하는 단을 입려하세요.: ");
		int dan = input.nextInt();

		int i = 1;
		while (i <= 9) { // 조건식이 참이면 계속 반복, 거짓이면 탈출하여 프로그램 종료
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);

			i++;
		}

	}
}
