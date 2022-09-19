//입력한 정수의 개수만큼 * 

import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("정수를 입력하세요: ");
			num[i] = scan.nextInt();
			if (num[i] < 1 || num[i] > 100) {
				System.out.println("1이상 100이하의 정수를 다시 입력하세요.");
				break;
			}
			
		}
		String[] his = new String[10];
		for (int h = 0; h < 10; h++) {
			his[h] = ((h * 10) + 1) + "-" + ((h + 1) * 10) + ":";
			System.out.println(his[h]);
		
		}
		for(int i = 0; i < 10; i++) {
			if((num[i]<=(i * 10) + 1) && (num[i] <= ((i + 1) * 10))){
				System.out.print("*");
			}
		}		

	}
}

//	his[0] = "1 - 10"; "0*10+1 - (0+1)*10"
//	his[1] = "11 - 20"; "1*10+1 - (1+1)*10"
//	his[2] = "21 - 30"; "2*10+1 - (2+1)*10"
//	his[3] = "31 - 10"; "3*10+1 - (3+1)*10"
//	his[4] = "41 - 10"; "4*10+1 - (4+1)*10"
//	his[5] = "51 - 10"; "5*10+1 - (5+1)*10"
//	his[6] = "61 - 10"; "(h*10)+1 - (h+1)*10"
//                 ↓	
//	his[h] = ((h * 10) + 1) + "-" + ((h + 1) * 10) + ":";
//	System.out.println(his[h]);
