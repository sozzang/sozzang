//사용자가 입력한  정수가
//짝수면 true
//홀수면 false

import java.util.Scanner;
public class EvenOdd{
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.println("숫자입력하세요.: ");
	int x = input.nextInt();
	
    System.out.println(x % 2 == 0);
	}
}