//여러개의 문자열의 결합에서 내가 원하는 문자열만 찾아내기

import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) {
		String longLine = "apple banana carrot donut";
        //split 쪼개서 반환해주는 것
//		String[] split = longLine.split(" ");
//		System.out.println(split[2]);

		//StringTokenizer 
		StringTokenizer st = new StringTokenizer(longLine, " ");
		while (st.hasMoreTokens()) {
		//hasMoreTokens로 주머니 속에 단어가 있냐고 물어보고 true, false만 가지고 있다가
			String local = st.nextToken();
		//nextToken를 해줘야 답을 해준다. 주머니에서 단어를 하나하나 끄집어내는 능력
			System.out.println(local);
		}

//		for (int i = 13; i <= 18; i++) {
//			System.out.print(longLine.charAt(i));
//		}

//		String[] arr = new String[4];
//		StringBuilder sb = new StringBuilder(longLine);
//		for (int i = 0; i < 3; i++) {
//			int spaceIndex = sb.indexOf(" ");
//			arr[i] = sb.substring(0, spaceIndex);
//			sb.replace(0, spaceIndex + 1, "");
//		}
//		
//		System.out.println(arr[2]);
//		

	}
}
