//콘솔 입출력
//과일목록보여주기
//고객에게 과일주기(젤 앞에거부터)
//재고 과일 추가하기(제일 마지막에 추가)-진열대가 최대 10개까지만 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main10 {

	public static void GiveFruits() {
		// 콘솔 입출력
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<>(Arrays.asList("사과", "포도", "오렌지", "배", "수박"));
		int a = 0;
		// 과일목록보여주기
		do {
			System.out.println("과일가게입니당. 뭐가 있냐면요!");
			System.out.println(list);

			System.out.println("과일가져가실래요??\n1.네! , 2. 아뇨~");
			a = scan.nextInt();
			if (a == 1) {
				if (list.size() == 0) {
					System.out.println("쫑");
					a = 2;
				} else {
					list.remove(0);
					System.out.println(list);

					System.out.println("더 받으실까요? \n 1.네 더주세요~, 2.됐어요;");
					a = scan.nextInt();
				}
			} else {
				System.out.println("아쉽네용..ㅣ다음에봬요...");
			}
		} while (a == 1);

	}

	public static void main(String[] args) {
		GiveFruits();

	}
}
