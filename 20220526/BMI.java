//키 (실수, 미터단위)와 몸무게(실수,kg단위)를 전달받아
//BMI 지수(실수) 구해 반환하기 
//BMI지수 = (몸무게) / (키)^2

public class BMI {
	public static double getBMI(double h, double w){
		
		double bmi = w / (h * h);
		return bmi;
		
	}
	
	
	public static void main (String[] args){


		double result = getBMI(1.70, 68.4);
		System.out.println(result);
	}
}