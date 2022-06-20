//사용자가 3대 측정
// 벤치, 스쿼트, 데드
// 합이 500이상 이면 true

import java.util.Scanner;
public class UnderAmour{
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.print("벤치: ");
	int x = input.nextInt();
	
	System.out.print("스쿼트: ");
	int y = input.nextInt();
	
	System.out.print("데드: ");
	int z = input.nextInt();
	
	int sum = x + y + z;
    System.out.println(sum >= 500);
	}
}