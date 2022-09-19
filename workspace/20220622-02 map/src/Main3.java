
//중국집 주문 가격 계산기

//자장면: 2500
//짬뽕: 4000
//볶음밥: 4000
//메뉴를 '추가'
//계산결과출력

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Main3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();

		map.put("자장면", 2500);
		map.put("짬뽕", 4000);
		map.put("볶음밥", 4000);

		System.out.println("중국집 가격 계산");

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> e : entrySet) {
			System.out.println(e.getKey() + ":" + e.getValue() + "원");
		}
		int a = 0;
		while (a != 3) {
			System.out.println("------------------");
			System.out.print("1.메뉴추가");
			System.out.print(" 2.계산하기");
			System.out.println(" 3.종료");
			System.out.println("원하는 번호를 입력하세요.");
			System.out.println("------------------");
			a = scan.nextInt();
			scan.nextLine();
			if (a == 1) {
				System.out.println("추가할 메뉴는??");
				String name = scan.nextLine();
				if (!map.containsKey(name)) {
					System.out.println("추가할 메뉴의 가격??");
					int price = scan.nextInt();
					scan.nextLine();
					map.put(name, price);
					System.out.println(map.toString());
				} else {
					System.out.println("이미 존재하는 메뉴입니다.");

				}
			}
			if (a == 2) {



				System.out.println("계산할게요. 메뉴를 알려주세요.");
				String orderList = scan.nextLine();
				String[] splitOrderList = orderList.split(" ");
				int sum = 0;
				for (int i = 0; i < splitOrderList.length; i++) {
					sum += map.get(splitOrderList[i]);
				}
				System.out.println("가격은" + sum + "원");
			}
		}
	}
}

//추가할 메뉴는??
//추가할 메뉴의 가격?? 이렇게 붙어서 나올때 
//String name = scan.nextLine(); 밑에
//scan.nextInt(); 이거 적어주면 알아서 떨어짐
//nextint();하고나면 엔터친 흔적이 남아있짜나 
//그다음에 netxtLine(); or next(); 엔터친 위의 흔적을 얘가 흡수해서 인식해버림