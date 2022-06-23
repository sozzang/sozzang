// 사용자가 입력한 원하는 반복 만큼만
// 0부터 1씩 증가하는 수 출력

import java.util.Scanner;

public class LoopInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇번 출력을 원십니까?(0부터 출력): ");
		int input = scan.nextInt();

		int i = 0;
		while (i < input) {
			System.out.println(i);
			i++;
		}
	}
}