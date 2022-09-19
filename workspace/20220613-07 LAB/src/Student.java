//human의 자식 클래스

public class Student extends Human {
	private String major;

	public Student(String name, int age, String major, String profession) {
		super(name, age, profession);
		this.major = major;

	}
	@Override
    public String getProfession() {
		return "학생";
	}
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString( ) + " , 전공: " + major;
	} //부모의 toString 반환 + 자식만의 필드인 major까지
}
