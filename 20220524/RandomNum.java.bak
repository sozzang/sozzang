// 2~9까지의 무작위 수를 정하여
// 사용자가 해당하는 수의 배수를 순서대로 입력하게끔 하여
// 틀릴 경우 종료 
// 예) 랜덤 수가 6일 경우
// 사용자 입력 
// 6 O
// 12 O
// 18 O
// 21 X 종료

import java.util.Random;
import java.util.Scanner; 

public class RandomNum{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	Random random =  new Random();
	
	int number = random.nextInt(10); 
	while(number == 0 || number == 1 || number == 2){
		number = random.nextInt(10); //int number = random.nextInt(8)+2;
	}
	
	System.out.println(number + "의 배수를 입력하세요.: ");
	
	int answer;
	int enter;
	for(int i = 1; true ; i++){
		
		answer = number * i;
		enter = scan.nextInt();
		
		
		if(answer != enter){
			break;
		}
	}
   System.out.println("틀림");




	}
}