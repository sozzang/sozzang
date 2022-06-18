//저축액을 계산하는 프로그램
//사용자에게 월급 액수를 입력받아 월급에 12를 곱하여 연봉을 계산하고 
//10을곱하여 10년동안 저축할 수 있는 금액을 계산해보자
import java.util.Scanner;
public class Salary{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int s; //월급
		int y; //연봉
		int d; //저축액 
		//변수선언
		
		System.out.println("월급을 입력하세요.: "); //입력 안내 출력
		s = input.nextInt(); //월급 값을 입력받아 변수에 저장
		
		y = s * 12;
		d = y * 10;
		
		System.out.println("연봉은" + y);
		System.out.println("저축액은" + d);
	}
}