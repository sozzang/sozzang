import java.util.Arrays;
import java.util.Random;

public class Main3 {
	// 각행의 합
	// 각열의 합
	// 숫자 7의 개수

	public static int[][] randomArray() {
		Random random = new Random();
		int[][] array = new int[5][5];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(10);

			}

		}
		return array;

	}
	
	public static int[] sum(int[] array) {
		int sum = 0;
		for(int i = 0; i< array.length; i++) {
			sum += array[i];
		}
		return array;
	}
	
	public static int[] col(int[][] array, int col) {
		int[] columnArray = new int[array.length];
		for(int i = 0; i< array.length; i++) {
			columnArray[i] = array[i][col];
		}
		return columnArray;
	}

	
	public static void main(String[] args) {
		int[][] randomArray = randomArray();
//		System.out.println(Arrays.deepToString(randomArray));
//   	System.out.println("행의 합" + sum(randomArray[0]));
//		System.out.println("열의 합" + sum(col(randomArray, 0)));

	}

}
