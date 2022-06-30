public class Box {	
	int width;
	int length;
	int height;
	
	public Box() { //생성자1 
		width = 1;
		length = 1;
		height = 1;
	}
	
	public Box(int w, int l, int h) { //생성자2, 생성자가 여러개라도 파라미터만 다르면 된다!(개수,타입,순서)
		width = w;
		length = l;
		height = h;
	}
	
	public static void main(String[] args) {
		Box b3 = new Box(); //기본 생성자1 호출
		Box b = new Box(50, 60, 70); //생성자2 호출
		
		
		
		// 박스 인스턴스화. 생성자를 호출해서 가로 90 세로 100 높이 110
		Box b2 = new Box(90, 100, 110);
		System.out.println(b3.width);
		System.out.println(b3.length);
		System.out.println(b3.height);
	}
}