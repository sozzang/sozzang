// 오늘의 날씨를 물어보고
// "비"를 입력받으면
// 우산을 챙겨가라고 문자열 출력하는 프로그램

import java.util.Scanner;

public class Umbrella {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("오늘 날씨가 어떤가요?");
		String w = input.nextLine();// 문자로 입력받음

		if (w.equals("비")) {
			// 입력받은 문자 + .equals() 괄호안에는 "확인할 문자"

			System.out.println("우산을 챙겨가세요.");
		} else {
			System.out.println("우산이 없어도 되겠네요.");
		}
		System.out.println("좋은 하루 보내세요.");

	}
}
