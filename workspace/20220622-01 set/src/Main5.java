import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

//중복되지 않는 1~45 사이의 정수 6개를 가지는 집합
public class Main5 {
	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<>();
		Random random = new Random();
		while (lotto.size() < 6) {
			lotto.add(random.nextInt(45) + 1);
		}
		System.out.println(lotto);
		
		//정렬하기 - 인덱스가 없어서 sort바로 못하니까 list에 lotto를 넣어서 정렬
		List<Integer> list = new ArrayList<>(lotto);
		Collections.sort(list);
		System.out.println(list);
	}
}
