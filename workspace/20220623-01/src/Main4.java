//사용자가 누를 수 있는 버튼 만들기
//그냥 보여지기만 하는 버튼

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame {
	public MyFrame2() {
		super("My Frame");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());// 배치관리, 컴포넌트 위치를 정해줌, 얘를 안해주면 버튼1만 왕 크게 나옴

		// JButton의 객체 생성
		JButton button = new JButton("버튼1"); // 버튼도 객체생성 가능, 버튼에 들어갈 텍스트를 파라미터부분에
		JButton button2 = new JButton("버튼2");
		
		add(button); //add까지 해줘야 사용자에게 보여짐
		add(button2);

	}
}

public class Main4 {
	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
		f.setVisible(true);
	}

}
