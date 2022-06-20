import java.util.Scanner;
public class TestRange2{
	public static void main(String args[]) {
		//0~100사이?
		
		//숫자가 0 이상이고 100이하인가?
		int number = 2222;
		
		/* 두번 물어보기 귀찮으니깐 논리연산으로 가능 
		System.out.println(0 <= number);
		System.out.println(number <= 100);*/ 
		
		System.out.println (number >= 0 && number <= 100);
		
		//number가 0보다 크거나 같나? 
		//number가 100보다 작거나 같나?
		//둘 다 참이여야 true
		//하나라도 거짓이면 false
	}
}