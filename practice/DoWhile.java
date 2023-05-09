/*
3. do ~ while 문을 사용하여 1~10까지의 곱셉의 수식 및 결과를 출력하세요.
*/

package practice;

public class DoWhile {
	public static void main(String[] args) throws Exception {
		DoWhile main = new DoWhile();
		main.factorialDo();

	}

	private void factorialDo() throws Exception {
		int i = 1;
		int mul = 1;

		do {
			System.out.print(i + "*" + mul);
			mul = i * mul;
			System.out.println("=" + mul);
			i++;
		} while (i <= 10);

	}
}
