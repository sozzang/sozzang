//ItemListener : box들을 각각 체크해서 가격표시가 변화하고 전체선택을 통해서 체크가 되어도 가격표시가 변화됨

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main2 extends JFrame {
	private JCheckBox box1;
	private JCheckBox box2;
	private JCheckBox box3;

	public Main2() {
		JPanel pnl = new JPanel();
		box1 = new JCheckBox("짜장면 : 5000원");
		box2 = new JCheckBox("짬뽕 : 6000원");
		box3 = new JCheckBox("탕수육 : 12000원");
		JLabel lblPrice = new JLabel("가격 표시");
		JButton btnAll = new JButton("전체 선택");
		JButton btnCancel = new JButton("취소");
		
		pnl.add(box1);
		pnl.add(box2);
		pnl.add(box3);
		pnl.add(btnAll);
		pnl.add(btnCancel);
		pnl.add(lblPrice);
		
		add(pnl);
		
		//전체선택,취소 이벤트 생성
		ActionListener btnListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean all = e.getSource() == btnAll;
				box1.setSelected(all);
				box2.setSelected(all);
				box3.setSelected(all);
			}
		};
	
		btnAll.addActionListener(btnListener);
		btnCancel.addActionListener(btnListener);
		//전체선택,취소 이벤트 생성 -끝
		
		//가격표시ItemListener , 전체선택을 눌러도 가격이 올라간다. 왜냐면 지가 액션 안해도 아이템이 변화한걸 인식했기때문->중괄호로 들어감
		ItemListener itemListener = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int sum = sum();
				lblPrice.setText(String.valueOf(sum));
			}
		};
		
		box1.addItemListener(itemListener);
		box2.addItemListener(itemListener);
		box3.addItemListener(itemListener);
		//가격표시-끝
		//가격표시	ActionListener , 전체선택을 눌러도 가격이 안 올라간다. 왜냐 지가 액션한게 아니니깐->중괄호로 안들어옴!!
//		ActionListener actionListener = new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				int sum = sum();
//				lblPrice.setText(String.valueOf(sum));
//			}
//		};
//		
//		box1.addActionListener(actionListener);
//		box2.addActionListener(actionListener);
//		box3.addActionListener(actionListener);
		//가격표시-끝
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private int sum() {
		int sum = 0;
		sum += box1.isSelected() ? 5000 : 0;
		sum += box2.isSelected() ? 6000 : 0;
		sum += box3.isSelected() ? 12000 : 0;
		return sum;
	}
	
	
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}





//import java.awt.event.ItemEvent;
//import java.awt.event.ItemListener;
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.swing.BoxLayout;
//import javax.swing.JButton;
//import javax.swing.JCheckBox;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import java.awt.BorderLayout;
//import java.awt.FlowLayout;
//
////사용자가 메뉴를 클릭하면 가격이 나오고 , 해제하면 가격이 사라지고
////메뉴3개가 다 나오면 합이 나옴
//
//public class Main2 extends JFrame {
//	public Main2() {
//		super("메뉴 클릭");
//		setSize(300, 200);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//		JPanel p = new JPanel(); //큰 패널 하나 두고 
//		add(p);
//		
//		Map<String, Integer> a = new HashMap<>();
//		a.put("자장면", 1000);
//		a.put("탕수육", 2000);
//		a.put("짬뽕", 1000);
//		
//		JPanel pnl = new JPanel(); //패널 1 
//		JCheckBox c1 = new JCheckBox("자장면");
//		JCheckBox c3 = new JCheckBox("탕수육");
//		JCheckBox c2 = new JCheckBox("짬뽕");
//		pnl.add(c1);
//		pnl.add(c2);
//		pnl.add(c3);
//		p.add(pnl);
//		BoxLayout box = new BoxLayout(pnl, BoxLayout.Y_AXIS);
//		pnl.setLayout(box);
//
//		JPanel pnl2 = new JPanel(); //패널 2
//		JLabel lbl = new JLabel("가격: ");
//		pnl2.add(lbl);
//		p.add(pnl2);
//
//		c1.addItemListener(new ItemListener() {
//
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				int result = e.getStateChange(); //체크:1, 체크x:2
//				if(result == ItemEvent.SELECTED) {
////					System.out.println(??????????????????);
//				}
//			}
//		});
//	}
//
//	public static void main(String[] args) {
//		new Main2().setVisible(true);
//	}
//
//}
