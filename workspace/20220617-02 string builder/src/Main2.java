//StringJoiner: 문자열 결합이 가능한데 쫌 모양내고싶을때

import java.util.StringJoiner;

public class Main2 {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",", "[", "]");
		// , 로 구분지으며 , 앞에는 [ 를 붙여주고 , 뒤에는 ]를 붙여줄거야~

		sj.add("1");
		sj.add("2");
		sj.add("3");

		String result = sj.toString();
		System.out.println(result);
	}

}
