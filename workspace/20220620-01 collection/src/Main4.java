//List - iterable
// 리스트의 원소를 하나하나 보는 것이 목적

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("apple");
		list.add("banana");
		list.add("carrot");
		list.add("dobut");

		// 하나만 지우기
//		System.out.println(list.contains(new String("banana")));	
//		list.remove("banana");
//		// 리스트에 바나나 있나? equals로 비교하고 같을 때 제거해줌
//		
//		System.out.println(list);

		// 위의 리스트에서 5글자 문자열만 찾아서 지우기

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			String str = iterator.next();
			//next = 리스트에 있는 것들을 가리킴
			if (str.length() == 5) {
				iterator.remove();
				//iterator.remove = 가리키고 있던 것들 지움
			}
			
		}
		System.out.println(list);

//		for (String s : list) {
//			if (s.length() == 5) {
//				list.remove(s);
//			}
//		}
//		System.out.println(list);
		// 얘는 안돼

	}

}
