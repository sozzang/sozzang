//ArrayList: 배열의 단점을 보완
//객체를 참조한다.
//길이값을 정해주지않는다. 추가만 해주면 된다.
//add하라고 하면 칸이 1개 생성 -> 문자열객체 참조됨 -> 인덱스 번호 부여 (0번으로)
//한번 더 add하라고 하면 칸이 1개 더 생성 -> object객체 -> 인덱스 번호 부여(1번으로)
// ...
//사이즈는 add 할 때 마다 커진다!

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();//객체생성
		list.add("문자열 객체");
		list.add(new Object());
		list.add(Integer.valueOf(100));
		list.add(Double.valueOf(55.55));
		//add: 객체를 추가해줄 수 있음.
		
		list.add(500);
		list.add(123.123);
		//얘네 둘은 객체 아닌데 왜 되지?! -> 알아서auto-boxing이 된거임 걍 이렇게 쓰면됨
		
//		int size = list.size();
//		System.out.println(size);
//		//size: 몇개의 객체가 담겼는지 확인
//		
//		System.out.println(list.get(0));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
		
//		//list.get(정수): 인덱스 번호가 부여되기 때문에 인덱스 번호로 뽑아낼 수 있음 
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
//		for(Object o : list) {
//			System.out.println(o);
//			//for-each문
//		}
	}

}
