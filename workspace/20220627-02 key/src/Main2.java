//JPasswordField
//비밀번호 따위를 입력할 수 있도록 입력시 텍스트가 보이지 않음

//JTextArea
//사용자가 여러줄의 텍스트를 입력할 수 있게함 
//단일로는 스크롤바가 제공되지않음

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main2 extends JFrame {
	public Main2() {
		JPanel pnl = new JPanel();
		JTextField tf = new JTextField(10);
		JPasswordField pf = new JPasswordField(10);

		JTextArea ta = new JTextArea(20, 20);
		JScrollPane scrl = new JScrollPane(ta);
		// JScrollPane 스크롤이 가능하게끔 추가해줌
		// 1.(ta)에 스크롤을 추가해준 후
		
		pnl.add(tf);
		pnl.add(pf);

		add(pnl);
		add(scrl, "South");
		// 2.ta가 담긴 scrl을 적어줌
		

		// 사용자가 입력한 것을 textarea에 출력될 수 있게 해보자!
		tf.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				int id = e.getID();
				if (id == KeyEvent.KEY_TYPED) {
					char ch = e.getKeyChar();
					ta.append(String.valueOf(ch) + "\n");
				}
			}
		});

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}

	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
