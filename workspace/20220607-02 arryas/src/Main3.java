//실수 1.02, 0.03, 4.0
//실수형 double 

public class Main3 {
	public static void main(String[] args) {
//		double d1 = 1.02;
//		double d2 = 0.03;
//		double d3 = 4.0;
//		
//		System.out.println(d1);
//		System.out.println(d2);
//		System.out.println(d3);
//		
		//실수형배열을 선언
		
//		double[] myArr = new double [3];
//		myArr[0] = 1.02;
//		myArr[0] = 0.03;
//		myArr[0] = 4.0;
//      얘를 더 쉽게 표현하는 방법은 아래와 같음
		
//		double[] myArr = new double [] {1.02, 0.03, 4.0};	
		//중괄호 후 인덱스 순서대로 나열해주면 됨, 길이값은 빼두면 알아서 계산함
		//더 쉽게는 아래와 같음
		
		double[] myArr = {1.02, 0.03, 4.0};
		
		for(int i= 0; i < myArr.length; i++) {
			System.out.println(myArr[i]);
			//for문으로 쉽게 접근가능 
		}
	}

}
