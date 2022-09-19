//Map

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		//원소추가
		map.put("일", 1);//key, value
		map.put("이", 2);//key, value
		map.put("삼", 3);
		map.put("사", 4);
		
		System.out.println(map.size());
		
		System.out.println(map.get("이"));// "이"라는 키에 연결된 것을 찾고 싶다
		System.out.println(map.get("삼"));
		System.out.println(map.get("오")); //없는 key를 입력하면 null 
		//인덱스를 전달받는 것이 아닌 key를 전달받는다 
		
		if(!map.containsKey("이")) {
			map.put("이", 2222);
		}
		//"이"라는 키가 없을 때만 "이"에 2222를 집어넣으라고 확인해줘야함
		
		map.put("이", 2222); 
		System.out.println(map.get("이"));
		//"이"라는 키 값에 이미 2가 들어가있지만 2222로 한번 더 적었을 때는 2222로 변경됨
	}

}
