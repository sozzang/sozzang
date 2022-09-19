//기초 컴포넌트 
//프레임, 패널, 레이블, 버튼, 텍스트 필드
//각 설명은 소스코드 밑에 작성

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main6 extends JFrame {
	public Main6() {
		//프레임설정
		setTitle("Main6 Frame");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//프레임설정
		
		JPanel pnl = new JPanel(); 
		//패널:프레임에 바로 갖다 붙이는게 아니라 큰 판을 한개 가져다 둔 후 컴포넌트를 붙일 수 있음. 컴포넌트를 가로로 배치
		//패널없이 붙일 수도 있지만 패널이 있어야 유지보수하기 좋음.
		//패널의 색도 바꿀 수 있음.
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		//버튼:사용자가 클릭했을 때 이벤트가 발생하여 동작하게 하기 위한 수단
		
		//버튼1을 눌러서 콘솔창에 뜨는거
		btn1.setActionCommand("임의의 커멘드"); //액션커멘드 설정 안해두면 버튼의 타이틀이 뜸
		
		//컴포넌트(버튼)을 패널에 추가
		pnl.add(btn1);
		pnl.add(btn2);
		pnl.add(btn3);
		
		//패널을 프레임에 추가 
		add(pnl);
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand()); //getActionCommand->버튼이름 
			}
		};
		
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		

	}
	
	public static void main(String[] args) {
		new Main6().setVisible(true);
	}
}
