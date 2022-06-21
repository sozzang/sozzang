//정수 3개를 입력받아 순서대로 적혔는지 확인

import java.util.Scanner;

public class CheckNumOrder {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("확인할 정수 3개? ");
			
			int x = input.nextInt();
			int y = input.nextInt();
			int z = input.nextInt();
			
			System.out.println(
				y == (x + 1) && y == (z - 1));
			//y는 x보다 1커야하고 z보다는 1작아야하니까!
		}
	}

