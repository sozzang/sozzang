public class TestMethod{
	public static void printRepeat(){//메소드 머리(head), 'printRepeat'가 메소드의 이름
		//메소드 몸통(body)
		for (int i = 0; i < 3; i++){
	    System.out.println("반복중");
	    }
	}
	public static void printHello(){
		int number =10;//지역변수 { }안에서만 사용되는변수
		System.out.println("Hello");
		System.out.println("초기화한 변수 값: " + number);
	}
	
	
    public static void main (String[] args){ //프로그램 시작은 항상 main 메소드라 여기서부터 시작임
	    System.out.println("프로그램 시작");
		
		printHello(); //메소드 호출, 여러번 호출도 가능
		/*System.out.println("헬로 안에서 초기화한 변수 값: " + number); 
		printHello의 지역변수이므로 number를 사용 할 수 없다*/
		
    	System.out.println("프로그램 끝");
    }
}