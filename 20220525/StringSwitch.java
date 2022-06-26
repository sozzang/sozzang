public class StringSwitch {
	public static void main(String[] args){
		String month = "march"; //JDJ7부터 문자열 가능
		
		int monthNumber;
		
		switch(month) {
			case "january":
			monthNumber = 1;
			break;
			case "february":
			monthNumber = 2;
			break;
			case "march":
			monthNumber = 3;
			break;
			default:
			monthNumber = 0 ;
			System.out.println("없다");
			break;
		}
		System.out.println(monthNumber);
	}
}