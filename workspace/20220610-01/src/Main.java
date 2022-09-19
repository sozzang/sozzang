//정수 정렬

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

 
		
	int[] arr = {50,30,20,60,10};
//		
  		 Arrays.sort(arr);
//		//arr배열을 정렬해줘~!
  		 int index = Arrays.binarySearch(arr, 20);
  		 //binarySearch 20 인덱스의 위치를 알려줌 
  		 System.out.println("20의 인덱스 " + index);
	   System.out.println(Arrays.toString(arr));
//		System.out.println(arr);
//     이렇ㄱㅔ 출력하면 [I@15db9742 이렇게 나옴	
	}

}
