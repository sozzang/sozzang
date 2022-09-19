// equals의 재정의

import java.util.ArrayList;
import java.util.List;

class Point2D {
	private int x;
	private int y;

	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}

	@Override // equals의 재정의
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point2D other = (Point2D) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}

public class Main {
	public static void main(String[] args) {
		List<Point2D> list = new ArrayList<>();
		// 0,0 좌표를 가지는 객체를 추가하고 싶다
		list.add(new Point2D(0, 0)); // 0번째 인덱스에 추가

		// 5,5
		list.add(new Point2D(5, 5)); // 1번째 인덱스에 추가

		Point2D p = list.get(0);
		System.out.println(p);

		Point2D p2 = list.get(1);
		System.out.println(p2);

		// 리스트에 0,0 좌표 객체가 있는지?
		System.out.println(list.contains(new Point2D(0, 0)));

		// 리스트에 0,0 좌표 객체의 인덱스는?
		System.out.println(list.indexOf(new Point2D(0, 0)));
		
		System.out.println(list.remove(new Point2D(5, 5)));

		// equals를 호출해서 비교해주기 때문에 왼쪽과 오른쪽의 참조가 같을 때만 비교함
		// equals의 재정의가 필요함
	}
}
