import java.util.Scanner;

public class Factorial { // 5! = 1 * 2 * 3 * 4 * 5
	public static void main(String[] args){
		long fact = 1; //팩토리얼은 정수를 곱하는 것이라 0 이 아닌 1로 설정
		int n;
		
		System.out.printf("정수를 입력하세요.: ");
		Scanner scan = new Scanner(System.in);
		n= scan.nextInt();
		
	for (int i = 1; 1 <= n; i++)
		fact = fact * i ;
	
	System.out.printf("%d!은 %d입니다. \n", n, fact);
	
	}
}