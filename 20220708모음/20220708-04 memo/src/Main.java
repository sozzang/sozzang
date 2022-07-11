//메모장 만들기~

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main extends JFrame {

	public Main() {
		JPanel pnl = new JPanel();
		JButton openbtn = new JButton("열기");
		openbtn.setBounds(84, 5, 151, 23);
		JButton savebtn = new JButton("저장");
		savebtn.setBounds(240, 5, 151, 23);
		JTextArea txtArea = new JTextArea();
		txtArea.setBounds(12, 47, 460, 289);
		pnl.setLayout(null);

		pnl.add(openbtn);
		pnl.add(savebtn);
		pnl.add(txtArea);
		getContentPane().add(pnl);

		setSize(500, 400);

		// 열기
		openbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				File openfile;
				BufferedReader br = null;
				int result = chooser.showOpenDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					
					try {
						openfile = chooser.getSelectedFile();
						br = new BufferedReader(new FileReader(openfile));
						String line;
						while ((line = br.readLine()) != null) { // 문자 끝을 만나면 null을 반환함
							 txtArea.append(line + "\n");//append 계속 이어서 나옴
						}
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						if (br != null) {
							try {
								br.close();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
						}
					}

				}
			}
		});
		// 저장
		savebtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				int result = chooser.showSaveDialog(null);
				File savefile;
				PrintWriter pw = null;
				if (result == JFileChooser.APPROVE_OPTION) {
					
					try {
						savefile = chooser.getSelectedFile();
					String line = txtArea.getText();
						pw = new PrintWriter(new FileWriter(savefile));
						pw.println(line);
						txtArea.setText("");
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						if(pw != null) {
							pw.close();
						}
					}
					
			
				}
			}
		});

	}

	public static void main(String[] args) {

		new Main().setVisible(true);
//		JFileChooser chooser = new JFileChooser();
////		chooser.showOpenDialog(null);
//		// 열기창을 띄움
//		int result = chooser.showSaveDialog(null);
//		// 저장창을 띄움
//		if(result == JFileChooser.APPROVE_OPTION) {
//			System.out.println("저장버튼 눌렀을때");
//			
//			File file = chooser.getSelectedFile();
//			System.out.println("사용자가 선택한 파일" + file.getAbsolutePath());
//			
//		}

	}
}
