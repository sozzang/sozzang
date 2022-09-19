//색깔이 있는 박스 !


public class Box2 extends Box {
 String color; //색깔
 
 public Box2(int width, int length, int height, String color) {
	 super(width, length, height);
	 this.color = color;
 }
 public String getColor() {
	 return color; //색깔을 알려주는 행동
 }
}
//자식 클래스는 부모클래스로 선행이 된다
