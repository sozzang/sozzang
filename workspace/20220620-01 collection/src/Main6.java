//Collections 활용
//.sort, .binarySearch, .reverse .shuffle 등

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main6 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList(Arrays.asList(7, 3, 2, 8, 9, 1));
		Collections.sort(list);// 해당원소값을 오름차순으로 정렬해줌
		System.out.println(list);

		// n번째 인덱스가 무엇인지 궁금하면?
		int index = Collections.binarySearch(list, 8); // list, 원소
		System.out.println("8의 인덱스: " + index);

		// 내림차순으로 바꾸고싶으면?
		Collections.reverse(list);
		System.out.println(list);

		// 원소들을 섞고싶으면?
		Collections.shuffle(list);
		System.out.println(list);

		// 최대값, 최소값이 궁금하면?
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));

		// 길이를 유지하면서 전체 원소들을 33으로 바꾸고 싶다면?
		Collections.fill(list, 33);
		System.out.println(list);

		// 특정한 원소만 찾아서 바꾸고 싶으면?
		Collections.replaceAll(list, 33, 77); // list, 원래값, 77
		System.out.println(list);

		// 아래의 원소값을 위 리스트에 복사해넣고싶으면?
		List<Integer> target = new ArrayList<>(Arrays.asList(90, 80, 70, 60));
		Collections.copy(list, target); //원본, 복사할 것
		System.out.println(list);
		//앞에서부터 원소를 뒤집어 씀
		//최소 4칸이 확보되어있어야 카피 가능함
	}
}
