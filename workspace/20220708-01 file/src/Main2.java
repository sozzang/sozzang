import java.io.File;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		File file = new File(".\\");
		// . 은 현재 경로를 의미함 내 기준으로 찾아가는 상대적인 경로임
		// 이클립스 상에서는 프로젝트 파일로 잡아줌
		// Main에서 찾아간 방식은 절대적인 경로
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());
		// getAbsolutePath:현재 경로를 드라이브부터 쭉 찾아가는 경로로 바꿔줘~
		
		try {
			System.out.println(file.getCanonicalPath());
			// getCanonicalPath: 윈도우에 맞는 문자열로 ./, ../와 같은 경로를 정리하여 보여줌(정확하고 깔끔하게)
			// checked예외이므로 무조건 예외처리해줘야함
		} catch (IOException e) {
			e.printStackTrace();
		}

		File fileParent = new File("..\\");
		System.out.println(fileParent.getName());
		// .. 도 상대적인 경로를 나타냄
		// 현재 경로에서 한 단계 위로 sohyun2 의 부모 경로 ~
		System.out.println(fileParent.getAbsolutePath());
		// 현재 경로는 ~ D:\sohyun2\20220708 file\..
		try {
			System.out.println(fileParent.getCanonicalPath());
			// 상위 경로는 ~ D:\sohyun2
		} catch (IOException e) {
			e.printStackTrace();
		}

		//같은 표현 방식으로 만들어줘야함
		try {
		File file3 = file.getCanonicalFile().getParentFile();
		//어쩌고path는 문자열을 반환, 어쩌고file 파일 객체를 반환
		//getParentFile 통해 상위부모 경로를 찾아낼 수 도 있다.
		System.out.println(file3.getAbsolutePath());
		System.out.println(file3.getCanonicalPath());
		
		System.out.println(fileParent.equals(file3));
		System.out.println(fileParent.compareTo(file3));
	
		System.out.println(fileParent.getCanonicalFile().equals(file3));
		System.out.println(fileParent.getCanonicalFile().compareTo(file3));
		//비교해주고자 할 때에는 같은 표현 방식으로 만들어줘야함 
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
