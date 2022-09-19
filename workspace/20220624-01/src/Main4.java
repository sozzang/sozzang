//cm 를 inch로, inch를 cm로 변환하는 단위변환기 만들기

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Main4 extends JFrame {
	Scanner scan = new Scanner(System.in);

	public Main4() {
		super("단위변환기");
		setSize(300, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();
		JPanel pnlTop = new JPanel();
		JPanel pnlBottom = new JPanel();

		JRadioButton rdb1 = new JRadioButton("CM → INCH");
		JRadioButton rdb2 = new JRadioButton("INCH → CM");
		ButtonGroup group = new ButtonGroup();
		group.add(rdb1);
		group.add(rdb2);

		JButton btn1 = new JButton("변환");
		JTextField text = new JTextField(20); // 사용자 입력
		JLabel result = new JLabel("결과");

		pnlTop.add(rdb1);
		pnlTop.add(rdb2);
		pnlTop.add(btn1);

		pnlBottom.add(text);
		pnlBottom.add(result);

		pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
		pnl.add(pnlTop);
		pnl.add(pnlBottom);

		add(pnl);

		// 변환 버튼 액션이 일어나면 바디에 어떤일 일어날건지
		// 바디에 내용ㅇㅣ 라디오버튼1 , 라디오2
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (rdb1.isSelected()) {
					// cm->inch
					result.setText(String.valueOf((Integer.valueOf(text.getText()) * 0.39)) + "inch");
					// text.getText() -> String값 반환
					// 스트링 * 숫자 불가능 하니까 , 스트링을 숫자값인 Integer로 변환 ->해서 나온 숫자를
					// 다시 문자로 바꿔서 setText에 넣어줘야된다 그게. result에 출력되는거야.....

				} else if (rdb2.isSelected()) {
					result.setText(String.valueOf((Integer.valueOf(text.getText()) * 2.54)) + "cm");
				}

			}
		});
	}

	public static void main(String[] args) {
		new Main4().setVisible(true);

	}

}
