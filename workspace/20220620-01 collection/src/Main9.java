import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main9 {
	//아스키코드를 위해 ..
	public boolean isNumberChar(char c) {
		return c >= '0' && c <= '9';
	}
	
	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "carrot", "donut", "egg"));

		// 1. list에서 지워나가가기 2.빈 리스트에서 추가해나가기
		// 위의 리스트에서 문자열 길이가 5글자인 문자열만을 원소로 가지는 리스트 생성

		List<String> list2 = new ArrayList<>(list);

		Iterator<String> iterator = list2.iterator();

		while (iterator.hasNext()) {
			String str = iterator.next();
			if (str.length() != 5) {
				iterator.remove();
			}

		}
		System.out.println(list2.toString());

		// 문자열 중에서 'e' 문자를 포함하는 문자열만을 원소로 가지는 리스트 생성
		List<String> list3 = new ArrayList<>();

		Iterator<String> iterator2 = list.iterator();

		while (iterator2.hasNext()) {
			String str = iterator2.next();
			if (str.contains("e")) {
				list3.add(str); // 빈 공간에서 추가해야하니까 list복사 ㄴㄴ

			}

		}

		System.out.println(list3.toString());

		// 리스트에서 '정수형태의 값'을 가지는 문자열을 찾아 해당원소를 가지는 정수형 리스트생성
		// 문자열 하나하나 char 값에 범위를 주고 아스어쩌고 코드가 어떻게 되는지 확인하는게 베스트
		
		List<String> list4 = new ArrayList<>(Arrays.asList("가", "1", "@", "3", "나"));
		List<Integer> listInteger = new ArrayList<>();
          
		for(int i = 0; i < list4.size(); i++) {
        	  String str = list.get(i);
        	try {  Integer value = Integer.valueOf(str);
        	  listInteger.add(value);
        	}catch (NumberFormatException e) {
        		System.out.println("문자열을 정수형으로 변환하는데 실패하여 예외가 발생하였으나 정상흐름으로 돌아가길");
        	}
        	}
		System.out.println(listInteger);
		// '정수형태의 값'을 가지는 문자열을 -> Integer 형으로
		// Interger i = Integer.valueOf("1234"); //=>1234 Integer 반환
		// Interger exp = Integer.valueOf("숫자아니면?"); //=> NumberFormatExeption예외발생

	}
}
