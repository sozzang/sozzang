//DataOutputStream: int는 int로 읽고, double은 double로 읽음
//다양한 형태를 읽어줄 수 있으니 파일의 끝을 알려주는 하나의 약속이 존재하기 힘듦
//예외처리를 통해 파일의 끝을 알림 (EOFException)

//단점:java 원시형 자료대로 가져오므로 java에서는 편하지만 다른 프로그래밍 언어에서는 사용하기 어려움
//어쨋든 스트림은 자바에서만 잘쓰는거ㅣ...

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		DataOutputStream dos = null;

		try {

			dos = new DataOutputStream(new FileOutputStream("d:\\filetest\\mydata.dat"));

			dos.writeInt(50);
			dos.writeDouble(123.123);
			dos.writeUTF("잉");
			dos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (dos != null) {
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		// 읽어보자~!
		DataInputStream dis = null;

		try {
			dis = new DataInputStream(new FileInputStream("d:\\filetest\\mydata.dat"));

			int valueInt = dis.readInt();
			double valueDouble = dis.readDouble();
			String valueString = dis.readUTF();

			System.out.println(valueInt);
			System.out.println(valueDouble);
			System.out.println(valueString);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일 끝");
		} // End Of File Exception !!
		catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dis != null) {
				try {
					dis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
