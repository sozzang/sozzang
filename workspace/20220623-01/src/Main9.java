//JTextField:사용자가 텍스트 입력

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main9 extends JFrame {
	public Main9() {
		JPanel pnlTop = new JPanel();
		JPanel pnlBottom = new JPanel();
		JPanel pnlBox = new JPanel();

		BoxLayout box = new BoxLayout(pnlBox, BoxLayout.Y_AXIS);
		pnlBox.setLayout(box);

		JTextField tf1 = new JTextField(20);
		JTextField tf2 = new JTextField(20);
		// 텍스트 입력칸 :가로길이,값을 크게 주면 가로가 길어짐
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");

		// 텍스트 입력하면 콘솔에 출력되게
      btn1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(tf1.getText());
			
		}
	});
		// 메세창으로 띄우기 = Dialog
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf1.getText(); //입력한 텍스트를 가져와서(String만 입력가능)
				tf2.setText(text);
				JOptionPane.showMessageDialog(Main9.this, text); //버튼 누르면 메세지창으로 띄워줌
				//(컴포넌트의 참조,띄워주고싶은 메세지 창)
				//Main9.this 바깥에 있는 Main9 클래스를 참조
				//null이 되어있으면 중앙에서 뜸
				//JOptionPane.showMessageDialog(null, "hihi");
				//버튼누르면 hihi가 뜸
			}
		});

		pnlTop.add(tf1);
		pnlTop.add(btn1);
		pnlBottom.add(tf2);
		pnlBottom.add(btn2);

		pnlBox.add(pnlTop);
		pnlBox.add(pnlBottom);

		add(pnlBox);

		pack();		// 창을 컴포넌트 크기에 맞춰서 조절해줌
		setDefaultCloseOperation(EXIT_ON_CLOSE);


	}

	public static void main(String[] args) {
		new Main9().setVisible(true);

	}

}
