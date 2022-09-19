//DO_NOTHING_ON_CLOSE:닫기버튼을 눌렀을 때 아무 일도 안일어나게 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class ExitDialog extends JDialog {
	private boolean exit;

	public ExitDialog(JFrame owner) {
		super(owner, "종료하시겠습니까?", true);

		JPanel pnl = new JPanel();
		JButton btnYes = new JButton("종료");
		JButton btnNo = new JButton("취소");

		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				exit = (e.getSource() == btnYes);
				dispose();
			}
		};

		btnYes.addActionListener(actionListener);
		btnNo.addActionListener(actionListener);

		pnl.add(btnYes);
		pnl.add(btnNo);
		add(pnl);
		setSize(500, 500);
	}

	public boolean showDialog() {
		setVisible(true);
		return exit;
	}
}

public class Main2 extends JFrame {
	public Main2() {

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
//				ExitDialog dialog = new ExitDialog(Main2.this);
//				boolean result = dialog.showDialog();
//				if (result) {
//				setDefaultCloseOperation(EXIT_ON_CLOSE);
//			}

				int result = JOptionPane.showConfirmDialog(Main2.this
						, "종료하시겠습니까?", "종료확인", JOptionPane.YES_NO_OPTION);
//				JOptionPane.showInputDialog(Main2.this, "입력창");
				if (result == JOptionPane.YES_OPTION) {
					setDefaultCloseOperation(EXIT_ON_CLOSE);
				}
			}
		});
		setSize(500, 500);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
