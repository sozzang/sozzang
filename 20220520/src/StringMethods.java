public class StringMethods {
	public static void main(String args[]) {
		String hello = "hellllo";
		
		int index = hello.indexOf("o"); 
		System.out.println(index);
		//indexOf: "o" 를 찾아서 index 번호를 호출
		
		
		int notFound = hello.indexOf("a"); 
		System.out.println(notFound); 
		//없는 문자를 호출해달라고 하면 -1를 보여준다.
		
		int index2 = hello.indexOf("l", 4);
		System.out.println(index2);
		// ?? 
		
		int index3 = hello.lastIndexOf("l");
		System.out.println(index3);	
		 //lastIndexOf: 마지막 'l'을 찾음, 오른쪽에서부터
	}
}