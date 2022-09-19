//퀴즈 프로그램 

//윈도우빌더(window builder)
//화면 우클 open with- window builder editor실행
//소스 옆에 디자인 누르기

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;

public class Main10 extends JFrame {
	public Main10() {
		super("맞춰보세요~");
		setSize(300, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel pnl = new JPanel(); // 패널부터 색성해주고
		pnl.setBackground(Color.PINK); // 패널 색상

		Random r = new Random();

		int num1 = r.nextInt(20) + 1; //0이 나오면 1이 되게 만들어주려고 +1 해줌
		int num2 = r.nextInt(20) + 1;
		int sum = num1 + num2;

		JLabel lbl = new JLabel(num1 + " 더하기 " + num2 + "는?"); // 레이블 생성하고 문제 적어주기(텍스트)
		lbl.setFont(new Font("굴림", Font.BOLD, 16));//윈도우빌더로 수정한 폰트!
		JButton btn = new JButton("확인"); // 버튼 생성하고(버튼이름)
		JTextField text = new JTextField(20);// 텍스트필드 생성하고 (가로 길이 지정)
		text.setForeground(Color.BLACK);

		pnl.add(lbl); // 패널에 레이블 추가
		pnl.add(text);// 패널에 텍스트필드 추가
		pnl.add(btn);// 패널에 버튼 추가

		getContentPane().add(pnl);
		
		// 확인 눌렀을 때 다이얼로그 뜨게
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String userInput = text.getText();
				if (userInput.equals(String.valueOf(sum))) {

					JOptionPane.showMessageDialog(Main10.this, "천재시네요~");
				} else {
					JOptionPane.showMessageDialog(Main10.this, "바버시네요~");
				}
			}
		});
	}

	public static void main(String[] args) {
		new Main10().setVisible(true);
	}

}