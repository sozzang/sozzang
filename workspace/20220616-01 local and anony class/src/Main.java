

interface PrintAll {
	void printAll();
}

public class Main {
	public static void main(String[] args) {

		new PrintAll() {

			@Override
			public void printAll() {
				System.out.println("출력x");

			}

		}.printAll();
// class Point implements PrintAll {	
//			int x;
//			int y;
//			public Point(int x, int y) {
//				this.x = x;
//				this.y = y;
//			}
//			@Override
//			public void printAll() {
//				System.out.println(x);
//				System.out.println(y);
//			}
//		}
//		
//		Point p = new Point(10, 20);
//		p.printAll();
	}
}
