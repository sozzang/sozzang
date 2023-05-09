package practice;

public class For {

	public static void main(String[] args) throws Exception {
		For main = new For();
		main.factorialFor();
	}
		public void factorialFor() throws Exception {
		int mul = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "*" + mul);
			mul = mul * i;
			System.out.println("=" + mul);
		}

	}
}
