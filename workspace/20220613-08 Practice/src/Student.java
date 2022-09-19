//p.265 
//7번 

public class Student {
	private String name;
	private int classid;
	private String belong;
	private String major;
	private int score;

	public Student(String name, int classid, String belong, String major, int score) {
		super();
		this.name = name;
		this.classid = classid;
		this.belong = belong;
		this.major = major;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassid() {
		return classid;
	}

	public void setClassid(int classid) {
		this.classid = classid;
	}

	public String getBelong() {
		return belong;
	}

	public void setBelong(String belong) {
		this.belong = belong;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return "이름:" + name + ", 학번:" + classid + ", 소속:" + belong
				+ ", 학과" + major + ", 학점:" + score;
	}
}
