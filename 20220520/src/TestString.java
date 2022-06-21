public class TestString {
	public static void main(String[] args) {
		String str;
		//int와는 다르게 참조형이므로 'S'tring 대문자로 써준다.
		
		str = "Hello World";
		
		System.out.println(str);
		
		String s2 = "다음 문자열";
		System.out.println(s2);
		
		String concat = str + (1 + 2) + "\n" + true + s2 + 3.0;
		System.out.println(concat);
	}
}