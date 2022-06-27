//사용자가 점수 입력을 3번 하는데 (점수는 무조건 1 ~ 100 사이여야함)
//점수의 합을 출력

import java.util.Scanner;

public class Grade {
	
	 public static boolean num(int number){
		 if(number >= 1 && number <= 100){
			 return true;
		 }else{
			 return false;
		 }
	 }
	
	public static void main(String[] args){
	   Scanner scan = new Scanner(System.in);
		int k ;
		int e ;
		int m ;
		
		do {
			System.out.println("국어점수: ");
		    k = scan.nextInt();

		} while( !(num(k)) );
		
		
		
		
		
		do {
			System.out.println("영어점수: ");
		    e = scan.nextInt();

		} while( !(num(e)) );
		
		do {
			System.out.println("수학점수: ");
		    m = scan.nextInt();

		} while( !(num(m)) );
		
		int sum = k + e + m;
		
		System.out.println("국어점수: " + k);
		System.out.println("영어점수: " + e);
		System.out.println("수학점수: " + m);
		
		System.out.println("점수의 합은: " + sum);
	
	}
	
}