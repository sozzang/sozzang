public class TestMethod3 {
	public static int getSum(int a, int b) {// () :parameters, 메소드의 입력부분, 개수, 타입, 순서   
	   return a + b ;  //바디에 int a =30 , b =60 을 적어도 되지만 내가 원하는 숫자의 결과를 보기위해
	}                   //parameters에 선언을 해주고 아래 숫자만 바꿔주면 됨.
	
	//두 개 int 정수를 전달받아 곱 연산 결과를 반환하는 메소드를 작성하고 호출해 반환값을 메인 메소드에서 출력.
	
    public static int mul(int a, int b){
		return a * b;
	}
	
	public static void main(String[] args){
	
        // int mult = mul(2, 5);
		// System.out.println(mult);


     	// int sum = getSum(30, 60); //parameters와의 약속임으로 정수 두개가 적혀야함(개수,타입,순서가 동일해야함)
		// System.out.println(sum);
		
		// System.out.println(getSum(2,5));
		
	}
}