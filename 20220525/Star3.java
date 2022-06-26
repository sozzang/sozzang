// 3.
    // *
   // **
  // ***
 // ****
// *****

public class Star3 {
	public static void main(String[] args){
		for (int j = 0; j <= 5; j++){
			for (int z = 5; z > j; z--){
			System.out.print(" ");
		}
		for(int i = 0; i < j; i++){
			System.out.print('*');
		
		}
			System.out.println();
		} 
	}
}