// 3. 전달받은 두 문자열의 길이 값의 합을 반환하는 메소드.

public class StringSum{
	public static int oneTwo(String a, String b){ //합을 반환하는 메소드니까 int, long
                                                  //난 string을 넣어서 안된거였음 ㅠ
	int sum = a.length() + b.length();
	return sum;

	
	}
	
	
	public static void main(String[]args){
	String a = "안녕";
	String b = "안녕하세요ㅇㅇ";
	
	int result = oneTwo(a, b); //얘도 길이값을 구하는거니까 int 
		
	System.out.println(result);

	}
}
