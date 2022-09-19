//누를 수 없는 버튼 만들기 setEnabled(false)
//누를 수 있는 버튼은 true가 들어가면 됨
//활성화 누르면 1~5버튼 활성화
//비활성화 누르면 1~5버튼 비활성화
//컨트롤+1 =지역변수로 빠르게 만들기

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main5 extends JFrame implements ActionListener {
	
	private JButton btnEnable; //전역변수로 만들어서 밑에 메소드에서도 쓸 수 있음
	private JButton btnDisable;
	private List<JButton> list;//List 선언하여 list로 1~5의 숫자들을 관리함 

	public Main5() {
		super("버튼 활성화 테스트~");
		setSize(new Dimension(500, 500));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		list = new ArrayList<>();
		JPanel pnl = new JPanel(); //패널의 기본: 가로로 배치
		btnEnable = new JButton("활성화");
		btnDisable = new JButton("비활성화");
		JButton btnNotShown = new JButton("보이나??"); //

		btnEnable.addActionListener(this);
		btnDisable.addActionListener(this);

//		btnDisable.setEnabled(false);
		btnNotShown.setVisible(false); //setVisible:버튼이 아예 안보임

		pnl.add(btnEnable);
		pnl.add(btnDisable);
		pnl.add(btnNotShown);
		add(pnl);
		
		for (int i = 1; i <= 5; i++) {
			JButton btn = new JButton(String.valueOf(i));
			pnl.add(btn); //만들어진 5개의 버튼 패널에 추가
			list.add(btn);//여러가지의 버튼을 관리할 수 있도록 List사용
		}	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEnable) {
			for (JButton btn : list) {
				btn.setEnabled(true);
			}
		} else {
			for (JButton btn : list) {
				btn.setEnabled(false);
			}
		}
	}

	public static void main(String[] args) {
		new Main5().setVisible(true);
	}
}
