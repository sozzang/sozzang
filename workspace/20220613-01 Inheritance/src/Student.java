//자식 클래스 

public class Student extends Person {
	
	private int score;
	//부모클래스에는 없는 점수 필드 '
	

	public Student(String name, int age, int score) {
		super(name, age);
		this.score =score; //score 생성자 추가
	}
	
	public int getScore() {
		return score;
	}
}
