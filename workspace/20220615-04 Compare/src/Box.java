//Box 대소비교

public class Box implements Comparable {
	private double volume = 0;

	public Box(double v) {
		volume = v;
	}
	
	
	@Override
	public int compareTo(Object otherObject) { //Comparable 인터페이스의 메소드인 compareTo를 구현한다.
		Box other = (Box) otherObject;
		if (this.volume < other.volume) {
			return -1;
		} else if (this.volume < other.volume) {
			return 1;
		} else {
			return 0;
		}

	}



	public static void main(String[] args) {
		Box b1 = new Box(100);
		Box b2 = new Box(85.0);
		if(b1.compareTo(b2) > 0) {
			System.out.println("b1이 b2보다 더 크다");
		}else {
			System.out.println("b1가 b2가 같거나 작다");
		}
	}
}
