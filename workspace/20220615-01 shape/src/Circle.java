
public class Circle extends Shape {
	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public int getArea() {//부모클래스에서 int로 반환하라하였으니 자식에서도 그대로 int로 적어야하며
		return (int) (radius * radius * 3.14);
	} //double은 불가능함 (int)를 통해 소수점자리를 버리고 int형으로 구현
 
	 
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
