//JSplitPane: 사용자가 패널을 쪼개놓고 볼 수 있음
//JTabbedPane

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

public class Main3 extends JFrame {
	public Main3() {
		JPanel red = new JPanel();
		red.setBackground(Color.RED);

		JPanel blue = new JPanel();
		blue.setBackground(Color.BLUE);

		JTabbedPane tab = new JTabbedPane();
		tab.add("빨강", red);
		tab.add("파랑", blue);
		add(tab);

//		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, red, blue);
//		// HORIZONTAL_SPLIT, VERTICAL_SPLIT
//		add(split);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}

	public static void main(String[] args) {
		new Main3().setVisible(true);
	}
}
