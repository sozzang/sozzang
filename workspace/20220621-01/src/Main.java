//LinkedList : 추가, 삭제가 자주 일어날 때 사용
//LinkedList는 List를 implements 하고있다
//각 원소를 링크로 연결하기 때문
//모든 원소를 순환하는 과정에서는 ArrayList보다 안좋음
//ArrayList는 모든 원소에 빨리 빨리 접근할 때 사용하기 좋음

//List구현체이므로 사용법은 ArrayList와 완전 같다!

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		
		list.add("문자열1");
		list.add("문자열2");
		list.add("문자열3");
		list.add("문자열4");
		
		list.get(0);
		list.get(1);
		list.get(2);
		list.get(3);
		
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
		}
		
		for (String s : list) {
			System.out.println(s);
		}
		
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			iter.next();
		}
	}
}




