
public class UnderGraduate extends Student {
	private String club;

	public UnderGraduate(String name, int classid, String belong, String major, int score, String club) {
		super(name, classid, belong, major, score);
		this.club = club;

	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}
	
	public String toString() {
		return super.toString() + ", 동아리명:" + club;
	}

}
