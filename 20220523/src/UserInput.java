// 사용자가 입력한 원하는 반복 만큼만
// 0부터 1씩 증가하는 수 출력


import java.util.Scanner;   
public class UserInput{
	public static void main(String[]args) {
	Scanner scan = new Scanner(System.in); 
	System.out.println("몇번 반복하고싶으신가요?:"); //입력 안내 문구
	 int input = scan.nextInt(); //입력받기
	 int i = 0; 
	while (i < input){ //i가 input(사용자가 원하는 반복 횟수)보다 작을때까지 반복 
    System.out.println(i);
		 
		 i++;
	}
}
}