//편의성이 높은 PrintWriter

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main3 {

	public static void main(String[] args) {
		File file = new File("d:\\filetest\\lineio.txt");

		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new FileWriter(file));
			
			//println: 한 줄 출력 
			pw.println("문자열 한 줄을 출력합니다.");
			pw.println(10);
			pw.println(15.15);
			pw.flush(); 
			//버퍼라는 공간에 남아있는 자료가 있을 수 있으니 flush를 통해 싹 비워줌
			//자기야 어디갔어??
			// 나 심심해서 놀러왔는데 
			//예림이랑 커피 사러 간거야ㅕ??
			//정말 실망이여
			//자기야 내 간식도 사와 ♡
			//오늘 점심은 맛있는거 먹자 자기 ♥_♡
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(pw != null) {
				pw.close(); //자원해제
			}
		}
		
		
	}

}
