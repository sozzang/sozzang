public class StaticVariableAndConst{
	public static void main(String[] args){
		int i = 10;
		
		i++;
		
		final int MY_NUMBER;
		MY_NUMBER = 22; //final 선언해주면 변할 수 없는, 수정할 수 없음
		MY_NUMBER = 15; //모든 변수이름은 대문자로 설정해줘야함
		//MY_NUMBER++;
		
		final double  PI = 3.14; //PI값은 절대 변하지 않으니깐 
	
		System.out.println (5 * 5 * PI);
		
	}
}


//final은 클래스, 메소드, 변수에 각각 붙을 수 있다.