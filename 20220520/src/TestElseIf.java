
// 사용자의 정수를 입력받아서 컵 사이즈 알려주기
// 200이상이면 large
// 100이상 ~ 200미만 medium
// 100미만 small
import java.util.Scanner;

public class TestElseIf {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("몇 ml인가요?: ");
		int ml = input.nextInt();

		String size; // 사이즈를 알려줄 String 변수선언

		if (ml >= 200) {
			size = "large";
		} else if (ml >= 100) {
			size = "medium";
		} else {
			size = "small";
		}
		System.out.println("사이즈는 " + size + "입니다.");
	}
}