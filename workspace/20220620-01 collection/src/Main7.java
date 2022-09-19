//1.2의 배수를 5개 가지는 정수형 리스트 생성 및 초기화 해보기
//2.7의 배수를 5개 가지는 정수형 리스트 생성 및 초기화 해보기
//3.위의 리스트의 원소들을 모두 다 가지는 리스트
//3의 리스트를 오름차순으로 정렬된 원소를 가지는 복사본 생성
//(Random 객체를 사용하여) 0 ~ 10사이의 난수를 6개 가지는 리스트(중복 x)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main7 {

	public static void main(String[] args) {
		// 2의 배수 5개
		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			list.add(i * 2);

		}
		System.out.println(list.toString());

		// 7의 배수 5개
		List<Integer> list2 = new ArrayList<>();
		for (int a = 1; a <= 5; a++) {
			list2.add(a * 7);
		}
		System.out.println(list2.toString());

		// 3번 원소들을 모두 다 가지는 리스트
		List<Integer> list3 = new ArrayList<>();
		list3.addAll(list);
		list3.addAll(list2);
		System.out.println(list3.toString());

		// 3의 리스트를 오름차순으로 정렬된 원소를 가지는 복사본 생성
		List<Integer> list4 = new ArrayList<>(list3);
		Collections.sort(list4);// 해당원소값을 오름차순으로 정렬해줌
		System.out.println(list4);

		// √(Random 객체를 사용하여) 0 ~ 10사이의 난수를 6개 가지는 리스트(중복 x)
		List<Integer> list5 = new ArrayList<>();

		Random random = new Random();
		while (list5.size() < 6) {
			int result = random.nextInt(11);
			if (!list5.contains(result)) {
				list5.add(result);
			}
		}
		System.out.println(list5);

	}

}
