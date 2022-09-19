
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main8 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3, 23, 35, 11, 23, 57, 79));
		// 원소의 합, 평균
		int sum = 0;
		for (int i = 0; i < 7; i++)// 7 대신 list.size()
			sum += list.get(i);
		System.out.println(sum);

		// 정수 57이 리스트에 있는지? 있으면 몇번째 index에 있는지?
		System.out.println(list.contains(57)); // list가 57을 contains하고 있는지?
		System.out.println(list.indexOf(57)); // list의 index 중 어디에 57이 있는지?

		// 정수 23의 개수

		int count = 0;
		for (int i = 0; i < 7; i++) {
			if (list.get(i) == 23) {
				count++;
			}
		}
		System.out.println(count);


		// 중복되는 원소 23을 '하나'삭제하기
		
		int index = list.indexOf(23); //lastIndexOf 는 오른쪽부터 찾음
		list.remove(index);
		System.out.println(list);

	}

}
