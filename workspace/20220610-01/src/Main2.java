
public class Main2 {

	public static void main(String[] args) {
		int number = 22;
//      Wrapper class :원시형타입을 객체로 다루기 위해서 사용
//      원시형타입을 대문자로 바꾸면 Wrapper class가 됨
//      int -> Integer, char -> Character
//		Byte
//		Short
//		Integer
//		Long
//		Float
//		Character
//		Boolean
		
		Integer i = new Integer(10); //10이라는 필드를 가진 객체 생성
		Integer i2 = Integer.valueOf(500); //Boxing
		int primitiveInt = i2.intValue(); // Unboxing
//		System.out.println(primitiveInt);
		
		Integer auto = 100; //자동으로 100이라는 값을 가지는 객체를 만들어서 참조 
                           //auto-boxing
		int un = auto; //auto-unboxing
		//원시형 타입의 값을 래핑클래스로 만드는 과정을 박싱
		//반대로 래핑클래스에서 원시형의 값을 얻어내는 과정을 언박싱
	
		Integer value = Integer.valueOf("5959");
		//문자열을 integer로 바꿔줄 수 있다.
		int result = Integer.valueOf("1234");
//		System.out.println(result);
		
		Integer.parseInt("90"); //문자열을 입력받아서 원시형 int값으로 반환
		
	}

}
