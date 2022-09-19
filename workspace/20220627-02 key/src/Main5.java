import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main5 extends JFrame {
	private HashMap<String, String> idpw = new HashMap<>();

	public Main5() {
		CardLayout layout = new CardLayout();
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel center = new JPanel();
		JPanel pnl = new JPanel();
		JPanel pnl1 = new JPanel();
		JPanel pnl2 = new JPanel();
		JPanel pnl3 = new JPanel(); // 회원가입창

		JTextField tf = new JTextField(15);
		JPasswordField pf = new JPasswordField(15);
		JButton btn1 = new JButton("로그인");
		JButton btn2 = new JButton("회원가입");

		JTextField joinid = new JTextField(15); // 아이디입력
		JPasswordField joinpw = new JPasswordField(15); // 비밀번호 입력
		JPasswordField joinpw2 = new JPasswordField(15); // 비밀번호 확인
		JButton joinbtn = new JButton("회원가입등록"); // 회원가입

		pnl1.add(tf);
		pnl1.add(pf);
		pnl2.add(btn1);
		pnl2.add(btn2);

		pnl3.setLayout(new BoxLayout(pnl3, BoxLayout.Y_AXIS));
		pnl3.add(new JLabel("아이디"));
		pnl3.add(joinid);
		pnl3.add(new JLabel("비번"));
		pnl3.add(joinpw);
		pnl3.add(new JLabel("비번확인"));
		pnl3.add(joinpw2);
		pnl3.add(joinbtn);

		pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
		pnl.add(pnl1);
		pnl.add(pnl2);

		center.setLayout(layout);// 카드레이아웃 적용
		center.add(pnl, "a");
		center.add(pnl3, "b");

		add(center);

		pf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		btn1.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				if (code == KeyEvent.VK_ENTER) {
					idpw.put("sozzang", "1234"); // 이미 회원가입 되어있는거
					if (idpw.containsKey(tf.getText()) && idpw.get(tf.getText()).equals(pf.getText())) {
						JOptionPane.showMessageDialog(Main5.this, "로그인에 성공하셨습니다.");
					} else {
						JOptionPane.showMessageDialog(Main5.this, "로그인에 실패하셨습니다.");
					}
				}
			}
		});

		btn2.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				if (code == KeyEvent.VK_ENTER) {
					layout.show(center, "b");
				}
			}
		});

		joinbtn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				if (code == KeyEvent.VK_ENTER) {

					if (idpw.containsKey(joinid.getText())) {
						JOptionPane.showMessageDialog(Main5.this, "이미 존재하는 아이디입니다.");
					} else if (!joinpw.getText().equals(joinpw2.getText())) {
						JOptionPane.showMessageDialog(Main5.this, "비밀번호 입력이 다릅니다.");
					} else {
						JOptionPane.showMessageDialog(Main5.this, "회원가입되었습니다.");
						idpw.put(joinid.getText(), joinpw.getText());
						joinid.setText("");
						joinpw.setText("");
						joinpw2.setText("");
						
						layout.show(center, "a");
					}

				}

			}
		});

	}

	public static void main(String[] args) {
		new Main5().setVisible(true);

	}
}
