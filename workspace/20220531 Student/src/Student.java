public class Student { // 없는 student라는 클래스 만듦

	// Student 클래스의 속성,필드값
	private String name;
	private int kor;
	private int eng;
	private int math;

	// 생성자1 필드값 초기화하는 생성자
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		// 필드의 이름과 파라미터의 이름이 동일한 경우 구분해주기 위해 this를 붙여줌
		// this붙는애가 필드
	}

	public Student() {
		name = null;
		kor = 0;
		eng = 0;
		math = 0;
	}
	// private한 필드값을 다른데서 불러서 쓸 수 있게
	// set, get

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getAver() {
		return (kor + eng + math) / 3;
	}

}