import java.util.Scanner;  // import java.util.Random; //랜덤 클래스 매번 바뀌는 answer의 정수값
public class LetterGame {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in); //Random random =  new Random();
		int answer = 59 ; //int answer = random.nextInt(100); // 0~ 100중 아무 숫자나 랜덤으로 가져옴
		int guess ;
		int tries = 0;
		
		do{
			System.out.println("정답을 추측하여 보시오.: ");
			guess = scan.nextInt();
			tries++;//시도한 횟수를 기록 , 수행을 할 때마다 갯수를 세고 잇는거임
			
			if(guess > answer)
				System.out.println("제시한 정수가 높습니다.");
			if(guess < answer)
				System.out.println("제시한 정수가 낮습니다.");
		}while (guess != answer);
		
		System.out.printf("축하합니다. 시도 횟수 = %d \n", tries);
				
		
	}
}