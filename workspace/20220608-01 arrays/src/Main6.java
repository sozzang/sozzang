//가변길이 파라미터 

public class Main6 {
	// 정수 2개를 전달받아 합을 구해서 반환하는 메소드
	public static int sum(int... numbers) {
		//int여러개를 받겠다 하면 '...'을 찍어주면 알아서 
		//자동으로 , 찍어서 배열로 만들어줌
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int result = sum(10, 20, 30, 40, 50, 60, 70, 80);
		System.out.println(result);
	}

	//for-each문
//	public static void someMethod(double d, int... arr) {
//		for (int number : arr) {
	//오른쪽에 배열, 왼쪽에 원소값에 맞는 타입  
//			System.out.println(number);
//		}
//	}

//	public static void main(String[] args) {
//		int[] arr = { 10, 20, 30, 40, 50 };
//
//		someMethod(40, 50, 60, 70, 80);

//		someMethod(arr);
//		someMethod(new int[] { 20, 30, 40, 50, 60 });
//		System.out.println("---");
//		someMethod(new int[] { 4, 5, 6 });
//		System.out.println("종료");
//	}
}