//참조형 배열 
//배열안에는 참조만 들어있는 것을 유의하여 사용

public class Main {

	public static void main(String[] args) {
		String[] arr = new String[3];

		arr[0] = "ABC";
		arr[1] = "DEF";
		arr[2] = "GHI";
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

	}
}
