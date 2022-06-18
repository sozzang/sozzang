//사용자에게 초단위의 시간을 입력받아
// 시간 분 초로 변환하는 프로그램
//입력예) 3666
//출력예) 1시간 1분 6초


import java.util.Scanner;
public class Time {
	public static void main(String args[]) {
			Scanner input = new Scanner(System.in);
		System.out.print("초를 입력하시오: ");
		int sec = input.nextInt();
		
		int h = ( sec / 3600); //시간 단위의 몫
		int m = ( (sec % 3600) / 60 );//시간을 구한 뒤 남은 초를 분(60)으로 나눈 몫
		int s = ( (sec % 3600) % 60 );//분을 구한 뒤 남은 초
		
		System.out.println(h + "시간 " + m + "분 " + s + "초");
	}
}