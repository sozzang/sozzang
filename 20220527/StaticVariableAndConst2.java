public class StaticVariableAndConst2{
	public static void printTest(int param){ //파라미터에 
		param++;
		System.out.println(param);
	}
	
	public static void main(String[] args){
		int inner = 10;
		final int TEST_SCOPE = 20; // 지역변수
		printTest(TEST_SCOPE);
		System.out.println(TEST_SCOPE);
		// {
			// System.out.println(inner);
			// System.out.println(TEST_SCOPE);
			
			// final int BLOCK = 100;
		// }
		// System.out.println(BLOCK);
	}
}