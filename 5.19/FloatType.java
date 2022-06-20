//실수형 타입 Float
//doubld 보다 적은 범위

public class FloatType{
	public static void main (String[] args){
		float f = 123.456F;
		//F를 붙여줘야 플롯타입임을 인식함
		double d = 7777.88888;
		
		/*int i = 10000;
		float sum = i + f ; //정수 + 실수는 실수형을 따라가기 때문에 float으로 저장해줌*/
		
		float one = 0.1F;
		System.out.printf("%.15f" , one * 22); 
		//"%.15f"는 소숫점 15자리까지 출력할 수 있다.
	}
}