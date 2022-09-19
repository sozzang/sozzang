//StringBuilder
//냅다 쭉 문자든 숫자든 붙이고 싶여서 문자열로 내보내줌
//sb.append();
//값에 대한 변경도 가능 

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("원본");
		// 문자열, 정수을 서로 붙이고 싶을 때

		sb.append(", One=").append(1).append(", DoubleValue=").append(255.0);

//		sb.append(", One=");// 오른쪽으로 붙음
//		sb.append(1);
//		sb.append(", DoubleValue=");
//		sb.append(255.0);
		sb.reverse();// 값 변경
		sb.setCharAt(0, 'Q');
//		sb.setCharAt(index, ch);

		String result = sb.toString();
		System.out.println(result);

	}

}
