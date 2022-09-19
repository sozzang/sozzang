//GUI: 그래픽 사용자 인터페이스 , GUI는 컴포넌트로 만들어짐
//하나의 창을 구현
//Component: GUI를 작성하는 기본적인 빌딩 블록 (레이블, 텍스트 필드 , 버튼 등)
//Swing: 순수 자바 코드로만 만들 수 있음, 모양이 많은 플랫폼에서 똑같이 나올 수 있도록 되어있음
//JFrame을 이용해서 컨테이너를 만들고 그 컨테이너의 각각의 구성인 컴포넌트를 추가
//Container :기본 컴포넌트들을 내부에 넣을 수 있는 컨테이너 컴포넌트

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();// JFrame 객체생성
		frame.setTitle("제목입니다"); // 타이틀 바의 제목
		frame.setSize(500, 500); // 프레임의 크기설정 (가로,세로)
		frame.getContentPane().add(new JLabel("Hello World"));
		//메인내용이 들어갈 곳 JLabel을통해 문자열을 보여주고자함
		//Label: 텍스트와 이미지를 통시에 표현 가능하며 텍스트의 속성(폰트 종류, 크기, 색상)은 변경할 수 있다.
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); 
		// 닫기버튼을 눌렀을때 프레임이 닫히고 프로그램 종료까지 하게해줌
		frame.setVisible(true); // 만든 프레임이 화면에 나타나게 만듦

	}

}
