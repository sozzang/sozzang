//MouseListener: 마우스를 클릭했을 때 작동하게 해줌

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
	public Main() {

//		MouseListener listener = new MouseListener() {
//
//			@Override
//			public void mouseReleased(MouseEvent e) { // 한번 클릭하는 것에 대해서는 둘 중 하나를 사용
//				System.out.println("마우스 버튼을 뗌");
//			}
//
//			@Override
//			public void mousePressed(MouseEvent e) { // 한번 클릭하는 것에 대해서는 둘 중 하나를 사용
//				System.out.println("마우스 버튼을 누름");
//			}
//
//			@Override
//			public void mouseExited(MouseEvent e) {
//				System.out.println("내려따");
//			}
//
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				System.out.println("올렸따");
//
//			}
//
//			@Override
//			public void mouseClicked(MouseEvent e) { // 더블클릭은 얘를 사용
//				switch (e.getButton()) { //// 사용자가 누른 버튼을 알 수 있게 정수 형태로 알려주는데 시스템마다 다름
//				case MouseEvent.BUTTON1:
//					System.out.println("1번");
//					break;
//				case MouseEvent.BUTTON2:
//					System.out.println("2번");
//					break;
//				case MouseEvent.BUTTON3:
//					System.out.println("3번");
//				}
//
//				System.out.println("왼쪽 버튼인가요??" + SwingUtilities.isLeftMouseButton(e));
//				// isLeftMouseButton : 숫자값이 아닌 왼쪽,오른쪽을 알 수 있음, 왼쪽 버튼인가요? true, false
//
//				if (e.getClickCount() == 2) { // 두번(이상) 눌렀으면
//					System.out.println("더블클릭");// 더블클릭 출력
//				}
//			}
//		};

		MouseMotionListener motion = new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("마우스가 움직입니다" + e.getX() + "," + e.getY());
			}
			//마우스가 움직이는 위치를 알려줌

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		};

		JPanel pnl = new JPanel();

//		pnl.addMouseListener(listener);
		pnl.addMouseMotionListener(motion);

		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
