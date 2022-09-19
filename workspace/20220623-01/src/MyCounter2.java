//ActionListener이 중복되면 지저분하니깐 하나로 만들어보자!!!
//AcitonListener인터페이스를 구현

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter2 extends JFrame implements ActionListener {
//다른 메소드들에서도 참조할 수 있도록 전역변수로 지정
	private int number = 0;
	private JButton btn;
	private JButton btn2;
	private JLabel lbl;
	
	public MyCounter2() {
		super("카운터");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel pnl = new JPanel();
		lbl = new JLabel("0");
		btn = new JButton("증가");
		btn2 = new JButton("감소");

		//액션리스너 자기 자신을 참조함 
		btn.addActionListener(this);
		btn2.addActionListener(this);

		pnl.add(lbl);
		pnl.add(btn);
		pnl.add(btn2);

		add(pnl);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) {
			number++; //btn을 누르면 숫자가 증가하고 
		} else {
			number--; //아니면 숫자가 감소되게 함 
		}
		lbl.setText(String.valueOf(number));
	}

	public static void main(String[] args) {
		new MyCounter2().setVisible(true);
	}
}
