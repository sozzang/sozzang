//Fibonacci 수열
// 1 1 2 3 5 8 13 21 34 ...
// 100이하

public class Fibonacci {
	public static void main (String[] args){
		int x = 1; //뒷숫자
		int y = 1; //출력숫자
		int z ;// 저장
		System.out.println(y);
		
		while (y <= 100) {
			System.out.println(y);
			z= x + y; //저장ㄴ해두기
			x=y;//숫자뒤로밀기
			y=z;//새숫자입력하기
		}
		
			
		
		
		
	
	}
}