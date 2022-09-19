//ObjectOutputStream

//학생 객체는 이름,나이,학점이 어딘가에 참조로 여기저기 흩어져 있음
//흩어진 것들을 나열할 수 있는 정보로 정리하는 것을 직렬화라고 함
//직렬화 안해주면 컴파일에러남
//학생 클래스에서 직렬화를 해주면 됨(Main파일 가보면 해줬음)

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main5 {

	public static void main(String[] args) {
		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new FileOutputStream("d:\\filetest\\s1.ser"));

			oos.writeObject(new Student("박소현", 28, 3.0));
			//객체를 바로 파라미터에 넣어주면 됨 엄청 쉬움
			//학생 그 자체를 읽어줄 수 있음
			oos.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
