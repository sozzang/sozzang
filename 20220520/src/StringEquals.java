//문자열 비교

public class StringEquals {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		String llo = "llo";
		
		System.out.println(a == b);
		//참조형에서의 관계연산자(==) 는 참조하는 대상이 같은지를 검사한다.
		//true
		
		System.out.println(a == ("He" + llo));
		//false
		
		System.out.println("------- 문자열 값 동등 확인 --------");
		System.out.println(a.equals("He" + llo));
		//참조형에서는 equals를 통해서 비교하고 같은지 확인할 수 있다.
	}
}