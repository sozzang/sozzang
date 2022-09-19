import java.time.LocalDate;
import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		//달력만드는 법 1. java.util.Calendar 
		
		//Calendar now = Calendar.getInstance();
		//getInstance : 오늘 날짜 객체를 만들어줌 안에 생성자 메소드가 들어있음	
		//calendar + ctrl + 스페이스 치면 import생성 해줌
		//System.out.println(now.get(Calendar.YEAR));
		//System.out.println(now.get(Calendar.MONTH) + 1);
		//System.out.println(now.get(Calendar.DAY_OF_MONTH));
		//System.out.println(now.get(Calendar.DAY_OF_WEEK));

		
		
		//달력 만드는 법 2. 1.8 ~~ java.time.LocalDate
		
		LocalDate now = LocalDate.now();
		System.out.println(now.getYear());
		//숫자로 표현 가능해서 int값을 받음
		System.out.println(now.getMonth());
		//System.out.println(now.getMonth().getMonthValue)
		//로도 표현이 가능
		System.out.println(now.getMonthValue());
		//달을 하나의 객체로 본다.
		System.out.println(now.getDayOfMonth());
		
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getDayOfWeek().getValue());
		//월요일1, 일요일 7
		
		

		
	}
}
