//사이즈 제안 setPreferredSize
//BoxLayout 나열을 X축으로 ? Y축으로 ?
//GridLayout 행 열 나누기 제일 왼쪽 윗쪽 부터 채워나감 
//setLocation버튼 위치, setSize버튼사이즈 -> 한번에 갈길 수 있는 방법 ? setBounds

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main8 extends JFrame {
	public Main8() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel pnl = new JPanel();
//		FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
//		pnl.setLayout(flow);

//		BorderLayout border = new BorderLayout();
//		pnl.setLayout(border);

		BoxLayout box = new BoxLayout(pnl, BoxLayout.Y_AXIS);
		pnl.setLayout(box);
//		//(대상이되는 패널, X방향? Y방향 어디로 쌓?)

//		GridLayout grid = new GridLayout(2, 2);
//		pnl.setLayout(grid);
		
		pnl.setLayout(null);
		//버튼,위치의 크기를 안정해줬으니 아무것도 안보이게 됨
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");

		//레이아웃 null로 설정하고 내가 직접 위치와 크기를 설정해주는 방법 !
		btn1.setLocation(10, 30); //시작은 좌측상단부터
		btn1.setSize(200,300);
		
		btn2.setBounds(220, 50, 50, 70);
		
		btn1.setPreferredSize(new Dimension(300, 300));
		btn1.setMinimumSize(new Dimension(300, 300));
		btn1.setMaximumSize(new Dimension(300, 300));

		pnl.add(btn1, "West");
		pnl.add(btn2);
		pnl.add(btn3, "East");
		pnl.add(btn3, "South"); // 맨마지막에 추가시키는게 적용됨

		add(pnl);
		

	}

	public static void main(String[] args) {
		new Main8().setVisible(true);
	}
}
