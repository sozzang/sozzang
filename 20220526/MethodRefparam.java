public class MethodRefparam {
	public static String concat(String left, String right){ //문자열 형태의 리턴값 
		return left + right;
	}
	
	public static void main(String[] args) {
		String h = "HELLO"; // h는 "HELLO"를 참조!
		String w = "WORLD";// w는 "WORLD"를 참조!
		String result = concat(h, w);
		
		System.out.println(result);
	}
}