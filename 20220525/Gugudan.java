//구구단
//2단부터 9단까지 
//1~9까지 반복 -> 한 것을 2~9까지 반복 

public class Gugudan {
	public static void main(String[] args){
		for(int j = 2; j <= 9 ; j++){
		    for(int i = 1; i <= 9 ; i++){
		        System.out.printf("%d * %d  = %d\n", j, i, j * i);
		    }
		}
	}
}