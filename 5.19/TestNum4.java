//2. 사용자에게 3개의 정수를 입력받아 순서대로 입력된 수일 경우 ture를 출력
//예) 1 2 3  -> true, 4 5 6 -> true, 7 9 10 -> false

import java.util.Scanner;
public class TestNum4{
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.print("정수를 입력하세요.: ");
	
	int x = input.nextInt();
	
	System.out.print("정수를 입력하세요.: ");
	
	int y= input.nextInt();
	
    System.out.print("정수를 입력하세요.: ");
	
	int z = input.nextInt();
	
    System.out.print((y == x+1) && (z == y+1));
	//x=1, y=2, z=3 일 경우 앞에 온 숫자에서 +1이 되어야만
	//순서대로 적힌것이기 때문에!
	}
}