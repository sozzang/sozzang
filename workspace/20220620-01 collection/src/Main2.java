//ArrayList <> 제네릭
//원하는 타입만 받을 수 있는 방법
//정수의 합을 구하고 싶으면? 정수형 타입만 쓸 수 있게 <Integer> 생성하면됨

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		//'Integer만 넣고 쓰겠다'라고 선언한 것
		//<Double>을 써주고싶으면 10.0으로 적어주면 auto-boxing 된다.
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
//		list.add("문자열은 안돼"); //Integer만 넣는다며~ 문자열은 안돼
		
		//합 구하기
		int  sum = 0;
		for(int i =0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
	}

}
