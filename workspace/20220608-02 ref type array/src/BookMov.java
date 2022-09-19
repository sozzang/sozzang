import java.util.Scanner;

public class BookMov {
	public static void toString(int[] abc) {
		for (int i = 0; i < abc.length; i++) {
			System.out.print(abc[i] + " ");
		}
		System.out.println();
		// for문 다음에 띄워줄라면 걍 공백 한 줄 넣어주기
	}

	public static void main(String[] args) {
		int[] seat = new int[10];
		seat[5] = 1;
		seat[6] = 1;
		seat[7] = 1;
		//이미 선택되어있는 좌석임을 나타냄
		//int 10까지 있는데 5,6,7번은 이미선택되어있다.

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("좌석을 예약하시겠습니까?(1.네 0.아니오)");
			int a = scan.nextInt();
			if (a == 0) {
				System.out.println("취소하셨습니다.");
				break;
			}
			System.out.println("현재 예약 상태는 다음과 같습니다.");
			System.out.println("----------------------");
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			System.out.println("---------------------");
			toString(seat); 
			//얘는 상태가 변경되니깐 메소드 추가해서 불러옴
			System.out.println("몇번째 좌석을 선택하시겠습니까?");
			int book = scan.nextInt();
			if (seat[book - 1] == 1) {
				System.out.println("이미 예약된 좌석입니다.");
			} else {
				seat[book - 1] = 1;
				// 3번째 좌석을 선택하면 index에서는 2번째이기 때문에 -1
				System.out.println("예약되셨습니다.");
			}

		}

	}
}
