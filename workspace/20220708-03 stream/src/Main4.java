//버퍼 스트림 
//디스크에서 왕창 들고와서 읽어둔 뒤 버퍼에 저장해두고
//필요한 것을 버퍼에서 꺼내어 오는 것

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main4 {
	public static void main(String[] args) {
		File file = new File("d:\\filetest\\lineio.txt");
		
		BufferedReader br = null;
		
		try {
			int sum = 0;
			int count = 0;
			br = new BufferedReader(new FileReader(file));
			String line;
			while((line = br.readLine()) != null) { //문자 끝을 만나면 null을 반환함
				System.out.println(line);
	
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
