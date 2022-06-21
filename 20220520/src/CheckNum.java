//정수를 입력받아 7의배수이면 true 출력

import java.util.Scanner;

public class CheckNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("확인할 정수? ");
		int number = scanner.nextInt();
		
		System.out.println(
			number >= 0 && number % 7 == 0);

	}
}