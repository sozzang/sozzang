//Arrays.asList
//add안하고 빠르게 바로 생성하고싶을 때 사용

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main5 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println(list);

//		List<Integer> test = Arrays.asList(10, 20, 30, 40, 50);
//		test.add(60);
//		// 원소 추가,삭제가 안됨

		list.addAll(Arrays.asList(60, 70, 80));
		// addAll : 10 ~ 50 외에도 더 붙이고 싶을때

		System.out.println(list);

		list.removeAll(Arrays.asList(30, 40, 50));
		System.out.println(list);

		System.out.println(list.contains(Arrays.asList(10, 20)));

		List<Integer> sub = list.subList(0, 3);
		System.out.println(sub);
		System.out.println(list);
		// 원래 원소들은 그대로
		//???????????????????????????
	}

}
