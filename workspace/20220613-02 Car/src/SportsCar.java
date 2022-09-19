//Car클래스(부모클래스)의 상속을 받는 SportsCar클래스(자식클래스)

public class SportsCar extends Car { 
	boolean turbo; //부모 클래스에는 없는 추가된 turbo 필드
	               //터보가 있다 = true, 없다 = false
	
	public void setTurbo(boolean newValue) {
		turbo = newValue; //터보 모드 설정 메소드
	}

	@Override
	public String toString() {
		return "SportsCar [turbo=" + turbo + ", speed=" + speed + ", gear=" + gear + ", color=" + color
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
