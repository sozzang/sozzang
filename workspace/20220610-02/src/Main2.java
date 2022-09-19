import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
		// 2 ~ 5의 제곱수들을 각 원소로 가지는 2차원 배열선언 초기화 후 모든 원소 출력해보기
		// 2 4 8 16
		// 3 9 27 81
		// ..

//		int[] arr1 = { 2, 4, 8, 16, 32 };
//		int[] arr2 = { 3, 9, 27, 81, 243 };
//		int[] arr3 = { 4, 16, 64, 256, 1024 };
//		int[] arr4 = { 5, 25, 125, 625, 3125 };
//
       int[][] arrs = new int[4][5];
//
//		arrs[0] = arr1;
//		arrs[1] = arr2;
//		arrs[2] = arr3;
//		arrs[3] = arr4;

		for (int i = 0; i < arrs.length; i++) {
			int n = 1;
			for (int j = 0; j < arrs[i].length; j++) {
				n *= 2 + i;
				arrs[i][j] =n;
				
				
			}
		}
		System.out.println(Arrays.deepToString(arrs));
	}

}
