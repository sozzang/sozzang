// 2. 날짜 클래스
// 필드 : 연도, 월, 일
// 메소드(기능) : "2022-05-27" OR "05/27/22"

class Date {
	String year;
	String month;
	String day;
	
	void printYMD(){
		System.out.printf("%d-%02d-%02d\n", year, month, day);
	}
	
	void print2(){
		System.out.print(month + "/" + day + "/" + year );
	}
	
}

public class YmdTest {
	public static void main(String[] args){
		Date today = new Date();
		today.year = "2022";
		today.month = "05";
		today.day = "27";
		today.printYMD();
		today.print2();
	}
}