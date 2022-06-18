import java.util.Scanner;
public class Reverse{
	public static void main(String args[]) {
		System.out.println("입력한 5자리의 정수를 역순으로 출력");
		Scanner reverse= new Scanner(System.in);
		System.out.print("입력한 5자리의 정수를 입력하시오.: ");
		int n = reverse.nextInt();
		
		int n1 = n/10000 ;
		int n2 = (n%10000) /1000 ;
		int n3 = (n % 1000) / 100 ;
		int n4 = (n %100) /10 ;
		int n5 = n %10 ;
		
		System.out.print("역순으로");
		System.out.print(n5);
		System.out.print(n4);
		System.out.print(n3);
		System.out.print(n2);
		System.out.print(n1);
	
		
		
	}
}