
public class Main {

	public static void main(String[] args) {
		Book m = new Book("가", 100, "박소현");
		Magazine m2 = new Magazine("나", 200, "박소현", 2021);
		System.out.println(m.toString());
		System.out.println(m2.toString());

		Book m3 = new Magazine("다", 300, "박소현", 2022);
		// Book 은 Magazine 이니깐 가능
		System.out.println(m3.getTitle());
		System.out.println(m3.getAuthor());

	}

}
