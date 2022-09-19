import java.util.Arrays;

public class Main5 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };
		
		Arrays.fill(arr, 100);
		//배열을 사용할 때 편하게 사용할 수 있는 메소드
		//배열 원소들을 같은 값으로 초기화할 수 있는 fill
		System.out.println(Arrays.toString(arr));
		//배열의 값을 문자열로 반환할 수 있는 toString
		
		
		
		
		
        int[] copy = Arrays.copyOf(arr, arr.length);
		//원본 배열이 있을 때 본사본 배열을 만드는 메소드
        
//		int[] arr2 = arr;
//
//		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.equals(arr, copy));
//		System.out.println(Arrays.equals(arr, arr2));
        //배열이 같은지 다른지를 알려주는 메소드
	}
}
