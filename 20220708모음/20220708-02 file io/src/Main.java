//드라이브 상에 존재하는 파일 내용을 읽거나 데이터를 파일 형태로 출력
//외부의 자원을 소프트웨어가 동작하고 있는 영역으로 끌고 오기 Input(입력)
//우리가 가장 많이 써본 Scanner객체도 InputStream으로 사용함
//입력을 다 받고 재사용할 수는 없음
//한번 다 사용해줬으면 무조건 finally블록에 close();를 통해 자원을 해제해야함

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		File soFile = new File("d:\\filetest\\so.txt");
		//filetest폴더에 만들어둔 so.txt파일
		
//		System.out.println(soFile.exists());
		Scanner scanner = null;
		// 스캐너가 외부 자원에 빨대 꽂아서 파일도 빨아들일 수 있음

		try {
			scanner = new Scanner(soFile);
			// 파일을 넘겨줄거니깐 ()속에 파일을 적어줌
			// checked예외이므로 try,catch 해줘야함

			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
				// nextLine은 한 줄만 뽑아오는건데 여러줄이 적혀있으면
				// 반복문으로 hasNext를 통해 '다음줄 있냐~? 없을 때 까지 찾아와!'

			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다.");
			e.printStackTrace();
		} finally { 
			if (scanner != null) {
				scanner.close(); 
				// 파일을 다 사용했음을 알려야 빨대를 뺌 = 자원해제한다.
			}
		}

	}
}