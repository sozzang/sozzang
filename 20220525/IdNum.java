// 주민번호를 입력하면 (문자열로 입력)
// 성별을 출력하는 프로그램
// 예)xxxxxx-1xxxxxx

import java.util.*;

public class IdNum {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	
		System.out.println("주민번호를 입력하세요.: ");
		String num = scan.nextLine();
		
	
		char sex = num.charAt(7); //charAt(7)은 7번째 자리의 문자를 골라오는거  
        switch(sex){
			case '1': //char은 ''로 데려옴
			case '3':
			System.out.println("남성");
			break;
			case '2':
			case '4':
			System.out.println("여성");
			break;
		}
	}
}