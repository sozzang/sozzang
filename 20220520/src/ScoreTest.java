import java.util.Scanner;

//사용자의 점수를 입력받아 학점으로 출력
// 90점 이상 A
// 80점 이상 90점 미만 B
// 70점 이상 80점 미만 C
// 60점 이상 70점 미만 D
// 60점 미만 F

public class ScoreTest {
	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);
		System.out.println("점수를 입력하세요.: ");
		int score = imput.nextInt();

		if (score >= 90) {
			System.out.println("A입니다.");
		} else if (score >= 80) {
			System.out.println("B입니다.");
		} else if (score >= 70) {
			System.out.println("C입니다.");
		} else if (score >= 60) {
			System.out.println("D입니다.");
		} else {
			System.out.println("F입니다.");
		}
	}
}


/* 선생님 답안
public class ScoreTest {
	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.print("점수는? ");
int score = scanner.nextInt();

char grade;
if (score >= 90) {
	grade = 'A';
} else if (score >= 80) {
	grade = 'B';
} else if (score >= 70) {
	grade = 'C';
} else if (score >= 60) {
	grade = 'D';
} else {
	grade = 'F';
}

System.out.println("학점은 " + grade);
}
}

*/