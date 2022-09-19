//CardLayout :각각의 컴포넌트를 전환할 수 있는데 전환하기 위해서 
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main4 extends JFrame {
	public Main4() {
		CardLayout layout = new CardLayout();

		JPanel center = new JPanel(layout);
		JPanel pnl1 = makePanel("첫번쨰");
		JPanel pnl2 = makePanel("두번쨰");
		JPanel pnl3 = makePanel("세번쨰");

		JButton btnNext = new JButton("다음");
		JButton btnPrev = new JButton("이전");

		JPanel pnlSouth = new JPanel();
		pnlSouth.add(btnPrev);
		pnlSouth.add(btnNext);

		add(pnlSouth, "South");

		center.add(pnl1, "A");
		center.add(pnl2, "B");
		center.add(pnl3, "C");
		 //센터라는 큰 패널에 작은패널 1,2,3 각각 추가
		
//		layout.show(center,"C");
		//C와 짝꿍인 패널을 보여줘!
		
		add(center);

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("다음")) {
					layout.next(center);
					//추가했던 순서대로 보여줌 
				} else {
					layout.previous(center);
					//전에꺼 보여줌
				}

			}
		};

		btnNext.addActionListener(listener);
		btnPrev.addActionListener(listener);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);

	}

	private JPanel makePanel(String text) {
		JPanel pnl = new JPanel();
		pnl.add(new JLabel(text));
		return pnl;
	}

	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}
