//닫기버튼을 눌러도 부가창이 닫히지않게 할 수 있을까?
//JDialog:부가적인 창을 하나 띄우고자 할 때 프레임의 역할을 할 수 있음
//최소화버튼, 최대화버튼이 없음
//modal:부가창이 켜져있는 도중에는 다른 창과 상호작용할 수 없음
//꼭 부가창을 꺼줘야 주요창에서 동작가능 
//JDialog의 생성자:제목,boolean(모달설정값)
//어느창에서 다이아로그를 만들것인지 프레임을 하나 전달받음

//부가창의 텍스트필드에 텍스트를 치면 주요창의 '버튼'글씨가 바뀌게할 수 있을까?
//showDialog 메소드를 추가해서 메인메소드에 추가해주면 됨

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class SubWindow extends JDialog {
	JTextField tf;

	public SubWindow(JFrame owner) { // owner프레임을 전달받은것
		super(owner, true);
		// setModal(true);
		setTitle("부가 창");

		tf = new JTextField(10);
		add(tf, "North");

		JButton btn = new JButton("다른 버튼");
		add(btn);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				// setVisible(false)와 크게 다르지 않음, 안보이게 만드는것
			}
		});

		setSize(500, 500);
//		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		// 원래는 EXIT_ON_CLOSE 을 넣었었는데 우리가 원하는건
		// X를 눌러도 닫히지 않는 것이므로DISPOSE. 디스포즈가 기본값이므로 생략가능
	}

	public String showDialog() {
		setVisible(true);

		return tf.getText();
	}
}

public class Main extends JFrame {
	public Main() {
		super("주요 창");

		JButton btn = new JButton("버튼");
		add(btn);

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SubWindow dialog = new SubWindow(Main.this);
				//생성자안에 메인.디스 -> 제이프레임.
				//위에서 JFrame owner 얘 해줫으니까 생성자로 들어올수있는거
				String result = dialog.showDialog();

				System.out.println("이 문장은 언제 호출될까?");

				btn.setText(result);
			}
		});

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
