//사용자가 입력한 두 정수의 합을 출력하고
//합이 0이면 true를 출력하고 
//그렇지 않은 경우 false를 출력하고


import java.util.Scanner;
public class TestSum{
	public static void main(String args[]) {
	Scanner zero = new Scanner(System.in);
	System.out.println("첫번째 정수를 입력하세요.: ");
	int x = zero.nextInt();
	
	System.out.println("두번째 정수를 입력하세요.: ");
	int y = zero.nextInt();
	
	int sum = x + y ;
	System.out.println("합은 " + sum);
	
	
	boolean result = (sum == 0);
	System.out.println ("두 수의 합이 0과 같나요? " + result);
	
	boolean result = (sum != 0);
	System.out.println ("두 수의 합이 0과 다르나요?" + result);
	}
}