//사용자에게 국어, 영어, 수학 점수를 정수로 입력받아 총점과 평균점수를 출력하는 프로그램

import java.util.Scanner;
public class Score {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int kor;
		int eng;
		int math;
		int sum;
		int avr;
		
		System.out.println("국어 성적을 입력하세요.: ");
		kor = input.nextInt(); 

		System.out.println("영어 성적을 입력하세요.: ");
		eng = input.nextInt(); 	
		
		System.out.println("수학 성적을 입력하세요.: ");
	    math = input.nextInt(); 		
		
		sum = kor + eng + math;
		avr = (kor + eng + math) / 3 ;
		
		System.out.println("총점은: " + sum + "평균은 " + avr);
		
	}
}	