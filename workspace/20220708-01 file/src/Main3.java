//디렉토리 생성하기 : file.mkdir(); 
//파일 생성하기 : textFile.createNewFile();

import java.io.File;
import java.io.IOException;

public class Main3 {

	public static void main(String[] args) {
		File file = new File("d:\\filetest");
		System.out.println("있나?" + file.exists());
		System.out.println("폴더냐?" + file.isDirectory());
		System.out.println("파일이냐?" + file.isFile());

		//생성하기 전인 여기까진 다 ~ false가 뜰 것. 왜냐면 filetest라는 폴더도 파일도 없으니깐

		boolean result = file.mkdir();
		// mk = make, 즉 디렉토리를 만들어라
		System.out.println("디렉토리 생성여부" + result);
		// 이 이후로 출력하면 true, 폴더 true, 파일 false, 생성여부false (왜냐? 만들었잖아~)

		// d드라이브 filetest 폴더(디렉토리)안에 abc 폴더를 생성해보기
		File abc = new File("d:\\filetest\\abc");
	    abc.mkdir();
		System.out.println("있나?" + abc.exists());
		System.out.println("폴더냐?" + abc.isDirectory());
		System.out.println("파일이냐?" + abc.isFile());
		
		//abc의 상위 경로에서(..//) def를 만들어보기 
		File file2 = new File("d:\\filetest\\abc\\..\\def");
		file2.mkdir();
		
//		File textFile = new File("d:\\filetest\\mytext.txt");
		//파일 인스턴스만 만들어서 참조하고 있는 중
//		try {
//			boolean result = textFile.createNewFile();
//			//createNewFile새 파일을 생성하라! 이후 파일이 만들어짐
//			System.out.println("생성?" + result);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
	}

}
