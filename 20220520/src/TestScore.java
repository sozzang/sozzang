
// 사용자의 점수(정수형)를 입력받아
// 60점 이상이면 "합격" 출력
// 60점 미만이면 "불합격" 문자열과 부족한 점수도 같이 출력
import java.util.Scanner;

public class TestScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 정수로 입력해주세요.: ");
		int x = input.nextInt(); //정수형으로 입력
		
		if(x >= 60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
			System.out.println("부족한 점수는" + (60 - x) + "입니다.");
			//60에서 점수를 빼주면 부족한 점수를 알 수 있음
		}
	}
}
