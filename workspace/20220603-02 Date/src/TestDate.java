import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
//내일의 날짜 객체
public class TestDate {
	public static void main(String[] args) {
	Calendar now = Calendar.getInstance();
	now.set(2022, Calendar.JUNE, 4);
	now.add(Calendar, DAY_OF_MONTH, 1);

	
	
	
//	public static void name() {
//	LocalDate now = LocalDate.now();
//	LocalDate nowPlusOne = now.plusDays(1);
//	//plusDays 를 통해 정수입력을 할 수 있음
//	LocalDate tommorrow = LocalDate.of(2022, 6, 4);
//	System.out.println(tommorrow.equals(nowPlusOne));
	}

}

