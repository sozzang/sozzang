
public class Graduate extends Student {
	private String type;
	private double scholarship;

	public Graduate(String name, int classid, String belong, String major, int score, String type, double scholarship) {
		super(name, classid, belong, major, score);
		this.type = type;
		this.scholarship = scholarship;

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getScholarship() {
		return scholarship;
	}

	public void setScholarship(int scholarship) {
		this.scholarship = scholarship;
	}

	public String toString() {
		return super.toString() + ", 조교유형:" + type + ", 장학금비율:" + scholarship;
	}

}