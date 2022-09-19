//파일이름 변경 : fileKor.renameTo();
//파일 삭제 : mytext.delete();

import java.io.File;
import java.io.IOException;

public class Main4 {

	public static void main(String[] args) {
		//d:\filetest\한글이름.txt
		File fileKor = new File("d:\\filetest\\한글이름.txt");
//		try {
//			System.out.println("생성됨?" + fileKor.createNewFile());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	
		//파일이름 변경
		fileKor.renameTo(new File("d:\\filetest\\newname.txt"));
		//파라미터에 파일 객체를 전달해야함 
		
		//파일 삭제(복구는 없음)
		File mytext = new File ("d:\\filetest\\mytext.txt");
		mytext.delete();
	}

}
