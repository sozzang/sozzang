public class PrimeNumbers {
	public static boolean isPrime(int i) { //true, false니깐 boolean
		int count = 0;
		for(int j = 1; j <= i; j++){
			if(i % j == 0) {
				count++;
			}
		}
		if(count == 2){
			return true; //소수면 true를 반환
		}else {
			return false;//아니면 false를 반환
		}
	}		
	
	public static void main(String[] args){
		for(int i = 2; i < 10000; i++);{ // 2 ~ 10000
		boolean result = isPrime(3); // 소수인지 알아 볼 것, true or false
		if(result){ //참이면
		System.out.println(result); //출력
		}
		}
	}
}