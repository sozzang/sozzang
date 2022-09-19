
public class Main {

	public static void main(String[] args) {
		SportsCar c = new SportsCar(); //자식 클래스 객체 생성
		c.color = "RED";
		c.speedUp(100); 
		c.speedDown(30);
		//부모 클래스의 필드와 메소드 상속받음
		c.setTurbo(true);
		//자체메소드 사용
		
		System.out.println(c.toString());

	}

}
