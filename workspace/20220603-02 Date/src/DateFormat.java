//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String result = dateFormat.format(date);
		System.out.println(result);
		
//		Calendar cal = Calendar.getInstance();
//		Date date =cal.getTime();
//		//cal, date를 객체로 만들어줌
//		String result = dateFormat.format(date);
//		System.out.println(result);
	
	}


	}

	

//컨트롤누르고 클릭하면 메소드 내역을 따라갈 수 있다.
//처음보는 클래스 설명 알고싶으면 클래스에 마우스 올리고 밑으로 쭉 내려서 지구본 모양!
//window->preferences->browser->external에 체크 후 크롬 설정
