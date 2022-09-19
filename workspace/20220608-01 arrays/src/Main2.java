//배열 복사 

public class Main2 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		// 같은 길이와 원소값인 배열을 또 만들고 싶다.
		// int[] copy = arr 는 참조가 만들어지는 것이지 배열이 만들어지는게 아니다.

		int[] copy = new int[arr.length];
		// 길이값을 기대로 가지고 오기
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		// 차례대로 10 ~ 50 까지 ++해서 가지고 오기
		// arr의 i번째 있는 원소를 copy의 i번째에 그대로 대입

	}
}
