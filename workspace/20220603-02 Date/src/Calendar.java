import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Calendar {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd eee");
		String result = formatter.format(now);
		System.out.println("오늘: " + result);
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("　　　　");
	
		for(int i = 1; i <= 30; i++) {
			System.out.printf("%02d", i);
			
			if(i == 4 || i == 11 || i == 18 || i ==25){
				//(i % 7 == 4)
				System.out.println();
			}
		}

	}
}
