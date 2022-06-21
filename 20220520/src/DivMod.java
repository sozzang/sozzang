import java.util.Scanner;

// 정수 2개를 입력받아서 큰 수에서~ 작은 수로 나눈 몫과 나머지를 출력
//if문으로 더 큰 수를 찾아내기가 가능하다.

public class DivMod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수 두개를 입력하세요.: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int div;
		int mod;
		
		if(a > b) { //a가 b보다 크면 아래 수식
			div = a / b ; 
			mod = a % b;
		}else { //b가a보다 크면 아래수식
			div = b / a;
			mod = b % a;
		}
		
		System.out.println("몫은" + div + "이고" + "나머지는" + mod + "이다");
	}

}
