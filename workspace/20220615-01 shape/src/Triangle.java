
public class Triangle extends Shape {
	// 부모가 추상클래스면 자식이 물려받았을때 추상메소드를 구체화하여 오바라이드해줘야함(구현한다, 재정의한다)
	private int base;
	private int height;

	public Triangle(int x, int y, int base, int height) {
		super(x, y);
		this.base = base;
		this.height = height;
	}

	@Override
	public int getArea() {  
		//부모클래스의 추상메소드에는 body가 없지만 자식클래스에선 만들어줘야함
		return base * height / 2; 
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
