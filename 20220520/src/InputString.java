import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.: ");
		int i = scan.nextInt();
		
		System.out.println("한줄을 입력하세요.");
		scan.nextLine();
		String line = scan.nextLine();
		
		System.out.println(line);
	}
}