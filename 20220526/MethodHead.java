public class MethodHead {
	//정수 두 개를 전달 받아 왼쪽이 큰지 오른쪽이 큰지 혹은 같은지를 알고 싶음.
	
	public static char compare(int left, int right){
		if(left > right){
		   return 'L';
		} else if (left < right){
			return 'R';
		}else{
			return 'S';
		}
		
		
	}
	
public static void main(String[] args) {
	char result = compare(5,4);
	System.out.println(result);
}
}