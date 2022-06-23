//반복문-while문
//반복 횟수를 알 수 없고 조건에따라 반복한다 ex) 10kg 빠질때 까지 반복하세요.
/*while(조건식){ 조건식이 참이면 반복, 거짓이 되면 반복 탈출
   반복문장 
  }*/

//1~10까지 출력
public class Loop {
	public static void main(String[] args) {

		int i = 1;
		while (i <= 10) {

			System.out.println(i);
			i++; // 출력 위에 위치하게 되면 11이 되므로 조심
		}
// Hello world 10번 출력하기

//		int h = 0;
//		while (h <= 10) {
//			System.out.println("Hello world");
//			h++;
//		}
//	}
	}
}