import java.util.Scanner;

public class CircleVolume{
	public static void main(String args[]) {
		System.out.println("원의 부피 구하기");
		Scanner input = new Scanner(System.in);
		System.out.print("구의 반지름을 입력하시오.: ");
		double radius =input.nextDouble();
		double volume = (radius * radius * radius) * 4 / 3 ;
		System.out.println("부피는" + volume);
	
	}
}