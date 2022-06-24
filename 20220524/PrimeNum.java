//사용자가 입력한 정수가 소수임을 확인하여 출력하는 프로그램
//소수 = 약수가 1과 자기자신 뿐 

import java.util.Scanner;

public class PrimeNum{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요.: ");
		int n = scan.nextInt();
		
		int count = 0;
		for (int i = n; i > 0; i--){
			if (n % i == 0) {
				System.out.print(n / 1 + " ");
				count++;
			}
		}
		if (count == 2) {
			System.out.print("소수입니다.");
		} else{
			System.out.print("소수가 아닙니다.");
			}
	}
}