import java.sql.SQLException;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		BooksRepository repo = new BooksRepository();

		int result;
		try {
			result = repo.add(new Book("테스트용 책123", 55000));
			System.out.println("추가 확인 : " + (result == 1));

			List<Book> list = repo.list();
			System.out.println(list);
		} catch (SQLException e) {
			System.out.println(e.getErrorCode());
		} 
		//던져진 에러들 ..

//			result = repo.update(new Book(1, "자바에서 변경한 새이름", 5000));
//			System.out.println(result == 1);
//
//			Book book = repo.selectByTitle("자바에서 변경한 새이름");
//			System.out.println(book);
//		} catch (SQLException e) {
//			System.out.println(e.getErrorCode());
//		}
	}
}
