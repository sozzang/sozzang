//KeyEvent
//+움직이는 레이블 만들기
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame {
	private int x;
	private int y;

	public Main() {

		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("입력");
		x = 100;
		y = 100;
		lbl.setBounds(x, y, 50, 50);
		pnl.add(lbl);

		add(pnl);

		pnl.setFocusable(true);
		pnl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				int code = e.getKeyCode();
				// e.getKeyCode: 사용자가 입력한 키에 대한 숫자값을 알아낼 수 있다.
				if (code == KeyEvent.VK_LEFT) {
					x -= 5;
				} else if (code == KeyEvent.VK_RIGHT) {
					x += 5;
				} else if (code == KeyEvent.VK_UP) {
					y -= 5;
				} else if (code == KeyEvent.VK_DOWN) {
					y += 5;
				}else if ( code == KeyEvent.VK_ENTER) {
					System.out.println("엔터");
				}
				lbl.setLocation(x, y);
			}
		});

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
