// 2. 전달받은 정수만큼 "안녕" 이라는 문자열을 출력하는 메소드 (return type : void)

public class SayHi {
	
	public static void hi (int a){
		for(int i = 0; i < a; i++){
			System.out.println("안녕");
		}
	}
	
	public static void main (String[] args){
		
		hi (9); //출력할게 없고, 위에서 출력했으니까 
	}
}