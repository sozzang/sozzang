//정수 2개 입력받아서 나누기한 몫을 출력하는 프로그램
//5, ㅁ 입력했을 때 Int형을 받지 못해서
//"프로그램종료"까지 가지 못하고 흐름이 끊겨버리며 에러가 남
//콘솔창에 ArithmeticException가 뜸 
//예외가 일어난 이유를 담고있는 예외객체이다.

/*	
		try {
			프로그램 흐름 문장(예외가 발생할 수 있을 것 같은 가능성이 있는 문장들)
		}catch((잡고자하는 예외 e)) {
			예외를 처리하는 문장
		}
		흐름 문장 중에 예외가 발생하면 흐름 all stop하고 예외처리하러 간 후 
		프로그램 종료 출력된 후 종료
		정상작동했으면 catch건너뛰고 정상흐름
		문장들 중에 예외가 발생하면 프로그램이 비정상적으로 종료되지 않게 'catch'하여 처리
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("왼쪽 수 입력:");
			int left = scan.nextInt();
			
			System.out.println("오른쪽 수 입력:");
			int right = scan.nextInt();

			if (right != 0) {
				System.out.println("나눈몫: " + (left / right));
			} else {
				System.out.println("0이 올 수 없다.");
			}
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력해야합니다.");
			//e.printStackTrace();
			

		}
		System.out.println("프로그램 종료");

	}

}
