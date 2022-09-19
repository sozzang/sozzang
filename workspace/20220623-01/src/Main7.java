//Layout manager -배치관리자 
//컴포넌트들의 크기와 위치를 자동적으로 관리함 
//FlowLayout: 컴포넌트를 LEFT,CENTER,RIGHT으로 배치, 패널의 기본값
//BorderLayout: add하면 자기의 영역에 컴포넌트를 가득 채움
//다섯개의 영역(동,서,남,북,중앙)을 가지고 있는데 컴포넌트들이 그 영역을 가득 채움
//버튼3개이 어디에 위치해야하는지 알려줘야함 -> pnl.add(btn1, "North");

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main7 extends JFrame {
	public Main7() {
		JPanel pnl = new JPanel();
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
//		FlowLayout flow = new FlowLayout(FlowLayout.RIGHT);
//		pnl.setLayout(flow);

		BorderLayout border = new BorderLayout();
		pnl.setLayout(border); 

		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");

		pnl.add(btn1, "North");
		pnl.add(btn2, "Center"); 
		pnl.add(btn3, "East");
		//Center은 기본이 센터라서 생략해도 무관
		//BoderLayout.North, "North" 아무거나 적어도 됨
		
		add(pnl);

	}

	public static void main(String[] args) {
		new Main7().setVisible(true);
	}
}
