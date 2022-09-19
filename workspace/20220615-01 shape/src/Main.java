//삼각형
//중심점(x ,y)
//밑변
//높이
//넓이를 구해서 알려줄 수 있음.

//직사각형
//중심점(x ,y)
//가로
//세로
//넓이를 구해서 알려줄 수 있음.

//원
//중심점(x ,y)
//반지름
//넓이를 구해서 알려줄 수 있음.

//중심점, 넓이 구하는

public class Main {

	public static void main(String[] args) {
    //  Shape s1 = new Shape(); 추상메소드는 인스턴스화 할 수 없다.

		Shape r2 = new Rectangle(6, 6, 6, 6);// shape = rectangle 이기 때문에 shape클래스로 업캐스팅(상향형변환)
		System.out.println(r2.getArea());

		Triangle t = new Triangle(0, 0, 5, 5);
		Rectangle r = new Rectangle(5, 5, 5, 5);
		Circle c = new Circle(5, 5, 5);

		System.out.println(r.getArea());
		System.out.println(t.getArea());
		System.out.println(c.getArea());
	}

}
