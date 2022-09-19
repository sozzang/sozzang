//일반적으로는 JFrame 클래스를 상속하여 내가 만들고자하는 MyFrame을 정의함
//
import javax.swing.JFrame;

class MyFrame extends JFrame { //JFrame클래스를 상속한 MyFrame클래스를 만듦
	//생성자에서 초기화
	public MyFrame(String title) {
		super(title);//JFrame의 필드값 그대로
		
		setSize(500, 500);//사이즈 지정
		setDefaultCloseOperation(EXIT_ON_CLOSE); //프로그램 종료
	} 
} 

public class Main3 {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame("나만의 프레임"); // MyFrame 객체를 생성, 파라미터부분에 타이틀 바에 들어갈 제목 넣을 수 있음
		frame.setVisible(true); //만든 프레임을 보여줄 수 있도록 

	}
}
