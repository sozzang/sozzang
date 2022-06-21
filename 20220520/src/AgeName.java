// 사용자의 나이와 이름을 입력받아서 자기랑 같으면 true 출력하기

import java.util.Scanner;

public class AgeName {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("이름을 입력하세요.: ");
		String name = input.nextLine();
		System.out.println("나이를 입력하세요.: ");
		int age = input.nextInt();

		System.out.println((age == 28) && name.equals("박소현"));
	}
}