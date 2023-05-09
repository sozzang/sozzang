/*
2. while 문을 사용하여 1~10까지의 곱셉의 수식 및 결과를 출력하세요.
*/

package practice;

public class While {
	public static void main(String[] args) throws Exception {
		While main = new While();
		main.factorialWhile();
		System.out.println("끝");
	}

	public void factorialWhile() throws Exception {
		int i = 1;
		int mul = 1;
		String to = "10";

		while (i <= Integer.parseInt(to)) {

			System.out.print(i + "*" + mul);
			mul = i * mul;
			System.out.println("=" + mul);
			i++;
		}

	}
}
