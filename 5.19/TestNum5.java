//3. 사용자가 입력한 4자리의 정수가 좌우가 같을 때 true를 출력
//예) 1221 -> true, 1557->false, 9009->true

import java.util.Scanner;
public class TestNum5{
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.print("4자리 정수를 입력하세요.: ");
	int n = input.nextInt();
			
		int n1 = n/1000 ;
		int n2 = (n%1000) /100 ;
		int n3 = (n % 100) / 10 ;
		int n4 = n%10;

		
		System.out.print("역순으로");
		System.out.print(n4);
		System.out.print(n3);
		System.out.print(n2);
		System.out.print(n1);
		
		System.out.print((n4==n1) && (n3==n2) );
	

	}
	
}