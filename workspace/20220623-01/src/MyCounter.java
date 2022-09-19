//증가를 눌렀을때 레이블의 값(숫자)이 증가하는 이벤트가 발생하도록 

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter extends JFrame {
	private int number = 0; //상태값이 변경될 수 있도록 전역변수로 지정 

	public MyCounter() {
		super("카운터");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("0"); // 텍스트(문자열)를 출력할 수 있는 객체
		JButton btn = new JButton("증가");
		JButton btn2 = new JButton("감소");
		pnl.setBackground(Color.CYAN);
		
		pnl.add(lbl);
		pnl.add(btn);
		pnl.add(btn2);

		add(pnl);


		//익명클래스만들기(MyColorFrame에서는 클래스를 따로 만들어줬지만 여기서는 익명클래스사용)
		//증가버튼 눌렀을 때 텍스트 값(숫자)이 1씩 증가
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl.setText("글자 바꾸기");
				number++; 
				lbl.setText(String.valueOf(number));
			}
		});
		//얘도 익명클래스
		//감소버튼 눌렀을 때 텍스트 값(숫자)이 1씩 감소
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl.setText("글자 바꾸기");
				number--;
				lbl.setText(String.valueOf(number));
			}
		});

	}

	public static void main(String[] args) {
		new MyCounter().setVisible(true);
	}
}
