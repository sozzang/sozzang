// 1. 원의 반지름(실수형)을 전달받아 원넓이(실수형)를 반환하는 메소드 작성 후 
//메인 메소드에서 호출하여 출력을 통해 값을 확인해보기
// 원넓이 = (반지름)×(반지름)×(원주율) 

public class Circle {
	public static double cradius(double radius){
		return radius * radius * 3.14 ;
		
	}
	public static void main(String[] args){
		
		
		System.out.println(cradius(4));
		
	}
}