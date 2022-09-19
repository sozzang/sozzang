
public class Main {

	public static void main(String[] args) {
		// 다음과 같은 정수형 배열이 있을 때
		int[] arr = { 15, 32, 222, 119, 534, 36, 9, 1234 };
		// 2자리 수의 개수와 목록을 콘솔창에 출력

		// 개수 : 3
		// --목록--
		// 15
		// 32
		// 36
		// 원소들을 한번씩 i++해서 10보다 같거나 크고 100보다 작은 "두자리수"를 찾는다. 

		int count = 0; //개수
		for (int i = 0; i < 8; i++) {
			if (arr[i] >= 10 && arr[i] < 100) {
				count++; //개수 카운트 ++

			}
		}

		System.out.println("개수: " + count); //개수 출력
		System.out.println("--목록--");
		for (int i = 0; i < 8; i++) {
			if (arr[i] >= 10 && arr[i] < 100) {
				System.out.println(arr[i]);
			}
		}

	}
}
