//스트림 : 순서가 있는 데이터의 연속적인 흐름
//개울에 데이터들이 연속적으로 유유자적 떠다닌다고 생각하면 됨
//바이트 스트림: InputStream , OutputStream 클래스 사용
//바이트 스트림은 아주 기초적인 입출력에만 사용된다.

//FileInputStream을 통해 읽어낸 파일을 
//FileOutputStream을 통해 복사하여 내보내서 복사해주기

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {
	public static void main(String[] args) {
		FileInputStream in = null; //초기화를 이루어줌
		FileOutputStream out = null; 

		try {
			in = new FileInputStream("input.txt"); 
			//input.txt파일에 연결된 파일 입력 스트림 생성(우리가 미리 만들어둠)
			// 읽고자하는 파일을 찾지 못하면 예외를 발생시키며
			// checked예외이므로 try, catch 해줘야함
			out = new FileOutputStream("output.txt");//output.txt파일에 연결된 파일 입력 스트림 생
			int c;

			while ((c = in.read()) != -1) {
				//read:하나의 바이트를 읽을 때, in에 있는거 바이트 하나씩 다 데려와줘~
				//in의 파일에서 하나의 바이트를 읽어서 int형 숫자로 들고 와서 int형 c에 대입연산 되어있음
				//가장 마지막 숫자까지 들고온 뒤 아무 것도 없는 끝에는 -1이 지정되어있음
				//그러므로 -1이 되면 반복을 멈추고 더 이상 숫자를 들고오지 않음
				//-1이 입력스트림의 끝임을 표시하기 위하여 int형으로 반환하는 것임
				out.write(c);
				//write: 하나의 바이트를 쓸 때,out에다가 -1 직전까지의 숫자들 전부 write 해줘~
				//파라미터에 전달된 내용(숫자들)을 out이라는 객체 만들어서 그대로 옮겨준다.
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { //FileInputStream 얘도 자원에 빨대 다 꼽았으면 자원해제를 해줘야함 꼭~
			if (in != null) { 
				try {
					in.close();// close: 자원해제, checked예외라서 try,catch필
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();// close: 자원해제, 근데 얘도 checked예외 .. try,catch필
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
