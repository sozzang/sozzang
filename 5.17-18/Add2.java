// 사용자가 입력한 두 개의 숫자를 더해서 출력한다. P.65

import java.util.Scanner;
//사용자의 입력을 받을 수 있는  Scanner 클래스 포함

public class Add2{
	//메인 메소드에서부터 실행이 시작된다.
	public static void main(String args[]) {	
	
	Scanner input = new Scanner(System.in);
	//사용자로부터 입력을 받기위해 Scanner의 객체를 생성한다.
	
	int x;//첫 번째 숫자 저장
	int y;//두 번째 숫자 저장
	int sum;//합을 저장
	
	System.out.print("첫번째 숫자를 입력하시오: ");//입력 안내 출력
	x = input.nextInt();//사용자로부터 첫 번째 숫자를 읽는다.
	//Scanner <input> = new Scanner(System.in); 의 <>자리와
	//x = <input>.nextInt(); 의 <>자리의 이름이 같아야함
	//실수형태를 입력받으려면 next.Double()이라는 메소드를 사용함

	System.out.print("두번째 숫자를 입력하시오: ");//입력 안내 출력
	y = input.nextInt();//사용자로부터 두 번째 숫자를 읽는다.
	
	sum = x + y ; //두 개의 숫자를 더한다.
	
	System.out.println(sum); //합을 출력한다.
	
    }// 메소드의 끝

} //클래스의 끝

//import 문장 : 자바 자체에서 다양한 기능을 가지는 클래스를 기본적으로 제공하고 있고
//자바 클래스 라이브러리라고 불리는 패키지를 사용하기 위해서는 import 문장을 이용한다.
//이 예제에서는 java.util패키지에 포함된 Scanner 클래스를 사용하고있다.