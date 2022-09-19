

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		final int STUDENTS = 5; //상수형태로 값을 정해둠 
		int total = 0;
		
		Scanner scan = new Scanner(System.in);
		
		int[] scores = new int [STUDENTS]; 
		
		for(int i = 0; i < STUDENTS; i++) { //STUDENT만큼 5번 반복 
		System.out.println("성적을 입력하세요.: ");
		scores[i] = scan.nextInt();
		}

		for(int i = 0; i < STUDENTS; i++) 
			total += scores[i];
			
		System.out.println("평균 성적은 " + total / STUDENTS +"입니다");
		
	}

}
