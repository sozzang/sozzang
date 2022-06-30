public class Car{
	private int speed; 
	private int gear;
	private String color; //필드값으로 객체 생성 
	
	//첫 번째 생성자 , 전달받은 3개의 값(c, g, s)으로 초기화
	public Car(String c, int g, int s){
		color = c;
		gear = g;
		speed = s;
	}
	
	//두 번째 생성자, 내가 전달한 값(c)으로 초기화(나머지는 임의의 값)
	public Car(String c){
		this(c, 0 ,1); //this= 자기자신,기존의 ( )=생성자를 호출하는 것 
		               //생성자가 많을 때는 원하는 생성자의 파라미터와 똑같이 ( ) 속에 적어주면댐
    System.out.println("초기화 과정 중~~");
	}
	
	//접근(색상)
	public String getColor(){ //필드값을 그대로 알려줄 것 
        return color;		
	}
	
	//설정
	public void setColor(String c){ //색상을 변경할 수 있는 설정
		color = c;
	}
	
	public void setSpeed(int s){
		speed = s;
	}
	
	public int getSpeed(){
		return speed;
	}
}

//private은 Car범위에서만 사용 가능하며 외부에서 접근할 수 없다.
//정보를 보호할 수 있다.
//'캡슐화' 

//public은 외부에서 누구나 접근 가능하여 호출  