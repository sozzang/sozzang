//JCheckBox: 체크박스
//추상적인 버튼을 상속받는다
//체크박스의 이벤트변경은 ItemEvent으로 알 수 있다

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
	public Main() {
		super("체크박스");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();// 패널 생성
		JCheckBox check1 = new JCheckBox("첫번째"); // 체크박스 생성
		JCheckBox check2 = new JCheckBox("두번째");
		JCheckBox check3 = new JCheckBox("세번째");

//		check1.setSelected(true);
//		//선택(체크표시)되려면 true
//		
//		System.out.println(check2.isSelected());
//		//선택되었느냐? 확인해봄 check2는 setSelected 안해줬으니 false임
		
//		check1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("사용자가 체크박스를 눌렀음");
//				System.out.println(check1.isSelected());
//			}
//		});
		
		check1.addItemListener(new ItemListener() {  
			
			@Override
			public void itemStateChanged(ItemEvent e) { 
				int result = e.getStateChange(); //체크:1, 체크x:2
				System.out.println(result == ItemEvent.SELECTED);
				//SELECTED : 체크 , DESELECTED: 체크 X
			}
		});
		
		pnl.add(check1); // 체크박스를 패널에 추가
		pnl.add(check2);
		pnl.add(check3);

		add(pnl); // 패널을 추가

	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
