//프레임에 그림 넣기
//JLabel에 사진을 넣을 수도 있음
//마우스 클릭하면 그림 바뀌기 
//jar에서 사진이 뜨게 하려면 사진을 image패키지 혹은 src에 넣어두고 위치를 찾아가줘야함

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main4 extends JFrame {
	public Main4() {
		JPanel pnl = new JPanel();
		Toolkit kit = Toolkit.getDefaultToolkit();
		JLabel lbl2 = new JLabel("집에 가자!");

		URL url = Main4.class.getClassLoader().getResource("image/춘식2.png");
		// src에 넣었다면 image/ 만 떼주면 됨
		ImageIcon image = new ImageIcon(kit.getImage(url));

		URL url2 = Main4.class.getClassLoader().getResource("image/춘식7.png");
		ImageIcon image2 = new ImageIcon(kit.getImage(url2));

		JLabel lbl = new JLabel(image);
		pnl.add(lbl);

		lbl.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				lbl.setIcon(image2);
			}

			public void mouseReleased(MouseEvent e) {
				lbl.setIcon(image);
			}

		});

		add(pnl);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}

	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}
