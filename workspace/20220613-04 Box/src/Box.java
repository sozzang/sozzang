
public class Box {
	int width;
	int length;
	int height;

	public Box(int width, int length, int height) {
		this.width = width;
		this.length = length;
		this.height = height;
		//세개의 필드값을 전달받는 생성자
	}

	public int getVolume() {
		return width * length * height; // 부피구하는 메소드
	}
}

//기본생성자가 생략되어있는 상태