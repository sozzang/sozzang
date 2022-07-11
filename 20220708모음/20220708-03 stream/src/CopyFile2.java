//문자스트림
//Reader , Writer 클래스 사용

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile2 {
	public static void main(String[] args) {
		FileReader inputStream = null;
		FileWriter outputStream = null;
		
		try {
			inputStream = new FileReader("input.txt");
			//FileReader는 문자 단위로 읽어줌 '한' '글' '자' 씩
			//예외발생하니까 try,catch해줘야함
			outputStream = new FileWriter("output.txt");
			//FileWriter는 문자 단위로 작성해줌 '한' '글' '자' 씩
			//예외발생하니까 try,catch해줘야함
			int c;
			while ( (c = inputStream.read()) != -1 ) {
				//한글자씩 c에 대입해라~~~
				//파일 끝까지 읽고 끝나면 -1이 됨
				System.out.println("읽은 문자 확인 : " + (char) c);
				//char타입으로 형변환해서 잘 읽어오고 있는 확인 해봄
				
				outputStream.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();//바이트스트림과 마찬가지로 자원을 다 쓰면 해제시켜줌
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
