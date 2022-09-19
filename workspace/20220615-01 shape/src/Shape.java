//도형
//x좌표
//y좌표
//넓이구할 수 있음

public abstract class Shape { // abstract :추상클래스
								// 추상적인 클래스일 때만 추상메소드를 가질 수 있다.
	private int x;
	private int y;

	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public abstract int getArea(); 
	//abstract: 추상 메소드 - 구체적인 동작이 없다. 메소드 Body가 없다.
    //메소드 Head만 존재

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}

}
