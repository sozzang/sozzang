// 사용자가 정수를 입력받아

import java.util.Scanner;

public class IfEven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("정수? ");
		int x = input.nextInt();

		if (x % 2 == 0) { // 2를 나눠서 나머지가 0이면 짝수
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		System.out.println("프로그램종료");
	}
}