// * 다섯개를 출력하고 -> 출력한 것을 또 다섯개 출력 

public class Loop2D {
	public static void main(String[] args){
		for (int j = 0; j <= 5; j++){
		for(int i = 0; i < 5; i++){
			System.out.print('*');
		}
			System.out.println();
		} //반복문(outer loop) 안에 반복문(inner loop)이 중첩
	}
}