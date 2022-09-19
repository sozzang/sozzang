
public class Student { // student 클래스
	private String name;
	private int kor;
	private int eng;
	private int math;// student 필드값

	public Student() {
	} //첫번째 기본생성자 

	public Student(String n, int k, int e, int m) {
		this.name = n;
		this.kor = k;
		this.eng = e;
		this.math = m; // 두번째 생성자 (생성자의 목적은 초기화하기 위해)
	}

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