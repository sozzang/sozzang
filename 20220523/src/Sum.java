//for문

public class Sum {
	public static void main(String[] args) {
		// 0~100 범위의 정수의 합

//		int sum = 0;
//
//		for (int i = 0; i <= 100; i++) {
//			sum += i; //sum = sum + i
//		}
//		System.out.println(sum);

		// 100~200 사이의 짝수의 합

		int sum = 0;

		for (int i = 100; i <= 200; i += 2) {
			sum += i;
		}
		System.out.println(sum);
	}
}
