public class TestMethod4 {
	//정수 하나를 전달 받아 1 ~ 100 사이의 수이면 true을 반환하고, 아니면 false를 반환하는 메소드
	
    public static boolean num(int a){ //true or false 니까 boolean
		if (a >= 1 && a <= 100){
			return true;
		}else {
			return false;
		}
		
	}

	
	public static void main(String[] args){
		
		boolean result = num(3);
		System.out.println(result); //System.out.println(num(a));
	}
}