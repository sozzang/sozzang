// 잔돈 계산 

import java.util.Scanner;

public class Change {
	public static void main(String args[]) {
		System.out.println("부가세와 잔돈 구하기");
		Scanner input = new Scanner(System.in);
		
	    System.out.print("받은 돈을 입력하시오.: ");
		int charge = input.nextInt();
	
	    System.out.print("상품의 총액을 입력하시오.: ");
		int price = input.nextInt();
		
		
	    int coin = charge - price;
		 System.out.print("잔돈은" + coin);
		 
	    double tax = price * 0.1 ;
		 System.out.print("부가세는" + tax);
	
	}
}
		