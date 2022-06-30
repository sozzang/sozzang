class Point{
	int x;
	int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public Circle {
	private int radius = 0;
	private Point center; // has - a 관계 : 클래스가 필드로 엮여있는 관계
	
	public Circle(Point p, int r){
		center = p;
		radius = r;
	}
	//중심점 getter
	Public Point getPoint(){
	return center;
	
	public void setPoint(point p){
		this.center = p;
	}
}
 public class CircleTest{
	 public static void main(String [] args){
		 Point p = new Point(25,78);
		 Circle c = new Circle(p, 10);
	 }
 }