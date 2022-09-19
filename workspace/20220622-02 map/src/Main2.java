//Map 인터페이스 제공

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		// key, value가 와야하니까 두개 적어준다
		// 짝꿍 중에 고유한 것을 key로 두는것이 좋다

		map.put("둘리", 100);
		map.put("홍길동", 90);
		map.put("도우너", 150);

		Map<Integer, String> map2 = new HashMap<>();
		// key, value가 와야하니까 두개 적어준다

		map2.put(1, "둘리");
		map2.put(2, "홍길동");
		map2.put(3, "도우너");

		// 다 호출하고싶으면?
		System.out.println(map.toString());

		// 하나씩 순환하면서 보고싶으면?
		// Entry<String,Integer>: key와 value를 한덩어리로 묶음

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> e : entrySet) {
			System.out.println(e.getKey() + "는" + e.getValue());
		}

	}
}

