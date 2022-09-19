//Hash set: 중복없이 추가하는 것 
//순서가 상관없고 데이터를 추가하고 삭제할 때 사용하기 좋다.
//Set인터페이스에서 제공
//순서대로 입력되지 않고, 일정하게 유지되지 않는게 특징
//인덱스가 없어서 get()으로 접근할 수 없다.
//똑같은 내용이 들어가지 못함, 중복 불가

import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		//중복을 boolean으로 알려줌 
		boolean b1 = set.add("qwer");
		boolean b2 = set.add(Integer.valueOf(10));
		boolean b3 = set.add("qwer"); //얘는 중복이라서 추가 안됨
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3); //false
		
		System.out.println(set.size()); //2
		System.out.println(set.toString());
//		System.out.println(set.get(0)); //List와는 달리 인덱스가 없기 때문에 get메소드 사용불가
//		for (int i = 0; i < set.size(); i++) { //따라서 이것도 안됨~!
//			set.get(i);
//		}
		
		//1번 해결책
		for (Object o : set) { 
			System.out.println(o);
		}
		
		//2번 해결책
		Iterator<Object> iter = set.iterator(); 
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
