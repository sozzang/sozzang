//색깔이 있는 프레임 만들기
//pnl을 추가해서 패널에 색을 입히는 것
//ActionEvent: 사용자가 클릭하면 이벤트가 일어나도록 함
//ActionListener: 그 말을 들어주도록 함

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//사용자가 클릭하면 이벤트가 일어나도록 함, 인터페이스의 형태 
//익명으로 구현도 가능하지만 일단 Class로 만들어보았음 
class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("사용자가 클릭했네요");//클릭을 했을 때 동작할 것
	}

}

public class MyColorFrame extends JFrame {
	public MyColorFrame() {
		super("색깔 있는 프레임");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//프레임 관련은 위에다가 모아놓기 
		
		JPanel pnl = new JPanel(); // JPanel: 컨테이너의 역할을 할 수 있는 객체, 빈 판이라고 생각
		pnl.setBackground(Color.PINK); // 판에 색깔 넣기

		JButton btn = new JButton("컨테이너 안의 버튼"); // 지역변수로
		MyActionListener listner = new MyActionListener();
		btn.addActionListener(listner);

		pnl.add(btn); //패널에 버튼 추가
		add(pnl);//프레임에 패널 추가

	}

	public static void main(String[] args) {
		MyColorFrame f = new MyColorFrame();
		f.setVisible(true);
	}
}
