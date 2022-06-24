import java.util.Scanner;

public class Dcd {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("두개의 정수를 입력하시오(큰 수, 작은 수): ");
		int x , y, r; //같은 타입의 변수가 여러개 필요할 때 , 찍어서 여러개 나열할 수 있다.
		              //int x; 
					  //int y;
					  //int r; 을 줄여서 표현한 것
		
		x = scan.nextInt();
		y = scan.nextInt();
		
		while (y != 0) {
			r = x % y;
			x = y;
			y = r; //최대공약수를 구하는 알고리즘(유클리드 호제법: 구글)
		}
		System.out.printf("최대 공약수는 %d입니다.\n", x);
	}
}