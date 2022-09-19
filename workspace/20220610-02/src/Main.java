
public class Main {

	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 6, 8, 10 };
		int[] arr2 = { 3, 6, 9, 12, 15 };
		int[] arr3 = { 4, 8, 12, 16, 20 };

		int[][] arr2d = new int[3][5]; // [3] 행의 개수 [5] 열의 개수
		// int배열을 원소값으로 가지는 배열

		arr2d[0] = arr1;
		arr2d[1] = arr2;
		arr2d[2] = arr3;
		
		for (int j = 0; j < arr2d.length; j++) {
			for (int i = 0; i < arr2d[j].length; i++) {
				// arr2d.length : 행의 수를 알려줌,
				System.out.println(arr2d[j][i]);
				
			}
		}
	}
}

//System.out.println(arr2d[0][0]); //[arr1] {2}
//System.out.println(arr2d[0][1]); //[arr1] {4}
//System.out.println(arr2d[0][2]);
//
//System.out.println(arr2d[1][0]); //[arr2] {3}
//System.out.println(arr2d[1][1]); //[arr2] {6}
//System.out.println(arr2d[1][2]);
// ↓
//	for (int i = 0; i < arr2d[0].length; i++) {
// System.out.println(arr2d[0][i]);


//	for (int i = 0; i < arr2d[0].length; i++) {
//System.out.println(arr2d[0][i]);
// arr2d.length : 행의 수를 알려줌,
//}
//for (int i = 0; i < arr2d[1].length; i++) {
//System.out.println(arr2d[1][i]);
// arr2d.length : 행의 수를 알려줌,
//}
//for (int i = 0; i < arr2d[2].length; i++) {
//System.out.println(arr2d[2][i]);
// arr2d.length : 행의 수를 알려줌,
//}
// ↓
//	for (int j = 0; j < arr2d.length; j++) {
//for (int i = 0; i < arr2d[j].length; i++) {
//	System.out.println(arr2d[j][i]);