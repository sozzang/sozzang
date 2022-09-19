import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//일기 관리 프로그램
//일기(날짜, 제목, 날씨, 내용 등)

//일기 등록
//같은 일자에 일기 중복X

//일기 목록도 볼 수 있다.
//날짜
//내용 길이 순

//날짜를 선택해서 해당 일기를 수정할 수 있어야함 
//삭제-오래된 일기 삭제

//일기(날짜, 제목, 날씨, 내용 등)클래스
class Diary {
	private int date;
	private String title;
	private String weather;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + date;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diary other = (Diary) obj;
		if (date != other.date)
			return false;
		return true;
	}

	private String write;

	public Diary(int date, String title, String weather, String write) {
		super();
		this.date = date;
		this.title = title;
		this.weather = weather;
		this.write = write;
	}

	public Diary() {

	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getWrite() {
		return write;
	}

	public void setWrite(String write) {
		write = write;
	}

	@Override
	public String toString() {
		return "날짜:" + date + ", 제목:" + title + ", 날씨:" + weather + ", 내용:" + write;
	}

}

public class Main {

	public static Diary WriteDiary() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("날짜를 입력하세요.(YYYYMMDD)");
		int d = scan.nextInt();
		System.out.println("제목을 입력하세요.");
		String t = scan.nextLine();
		scan.nextLine();
		System.out.println("날씨를 입력하세요.");
		String w = scan.nextLine();
		System.out.println("내용을 입력하세요.");
		String wd = scan.nextLine();
		System.out.println("일기 + 1 ♥ 더 추가하시겠습니까? 1.네 2.아니오");
		Diary neww = new Diary(d, t, w, wd);
		return neww;
		

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Diary d = new Diary(220610, "원래 있던 일기", "맑음", "날씨가 좋당");
		Diary d2 = new Diary(220611, "원래 있던 일기", "비", "비온당");
	
		List<Diary> list = new LinkedList<>();
		// 일기 목록도 볼 수 있다.날짜 순/내용 길이 순
		list.add(d);
		list.add(d2);
		

		System.out.println("♡일기장♡");
		System.out.print("1.목록보기");
		System.out.print("2.일기쓰기");
		System.out.print("3.일기지우기");
		System.out.print("4.일기수정하기");
		System.out.println("4.끝내기");
		System.out.print("원하는 번호를 입력하세요.");
		int i = scan.nextInt();
		if (i == 1) {
			System.out.println(list);
		}
		if (i == 2) {
			list.add(WriteDiary());
		}

	}
}
