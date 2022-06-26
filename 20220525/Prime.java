//7. 2~100 사이의 모든 소수 출력하기
//소수 = 약수가 1과 자기자신 뿐인 수 


public class Prime {
	public static void main(String[] args) {
	
		for(int i = 2; i <= 100; i++){
			int count = 0;
			for(int j = 1; j <= i; j++){
				if(i % j == 0)
					count++;
			}
			if (count == 2){
				System.out.println(i); 
			}
		}
	}
}
	
