import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		String line = "HELLO";
		try {
			fos = new FileOutputStream(new File("d:\\filetest\\practice.txt"));
			
			fos.write(line.getBytes());
			//write는 문자를 받지 못하므로 바이트형식으로 바꿈
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			}
		}
	}

}
