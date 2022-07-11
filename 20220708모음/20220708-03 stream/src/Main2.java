//FileInputStream 
//한 byte씩 데이터를 가지고 와서 읽어줌

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			File file = new File("d:\\filetest\\practice.txt");
			fis = new FileInputStream(file);
			int length = (int) file.length();
			// 파일의 용량, 길이를 읽어온 후
			// 배열을 만들기 위하여 int로 다운캐스팅
			byte[] buf = new byte[length];
			// byte가 들어갈 수 있게 배열 생성
			fis.read(buf);
			String result = new String(buf);
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close(); //자원해제 꼭 꼭 꼭 해주기 
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
