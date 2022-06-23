//사용자가 정수 범위를 지정 (시작-끝 입력)하여 합을 출력

import java.util.Scanner;

public class SumForUser {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("범위의 시작 숫자를 입력하세요.: ");
		int start = input.nextInt();
		System.out.println("범위의 끝 숫자를 입력하세요.: ");
		int end = input.nextInt();

		int sum = 0;

		for (int i = start; i <= end; i++) {
			//시작할 정수와 끝낼 정수를 입력해줬음
			sum += i;
		}
		System.out.println(sum);
	}

}
