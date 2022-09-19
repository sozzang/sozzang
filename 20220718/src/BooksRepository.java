import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import greenart.DBUtil;

public class BooksRepository {
	
	private Book resultMapping(ResultSet rs) throws SQLException { //번호제목가격을 불러내는 것을 메소드로 만들어서 굴림
		
		int bookId = rs.getInt("bookId");
		String title = rs.getString("title");
		int price = rs.getInt("price");

		return new Book(bookId, title, price);
	
	}

	// 추가
	public int add(Book book) throws SQLException {
		// ★메인메소드로 던져주면 메인메소드에서 e의 정보를 조회할 수 있다~~
		// 책추가만 하는 메소드. 결과는 무조건 int로만 알려줄거임. 따라서 모든 상황에 대한 인트가 있어야함. 1행추가 1, 추가안됨 0, 서버가
		// 안되서 안되었다 x, 중복되어서 안되었다 y...
		// 이걸 모두 일일이 다 설정해 줄 수 없다!!! 따라서!! 1, 0 외에는 그냥 모든 예외 정보를 담고있는(에러코드별로 모든 에러상황이 다
		// 있음) 예외객체를 활용~ 메소드에서 받아가게 던져주기만 하면됨
		// main에서 책 추가하면 에러가 나도 사용자는 뭔 error인지 모른단 말이져 그래서 이거를 main으로 넘겻거
		// error가 이렇게 났다를 가시적으로 보여줘야하는데 throws를 하고 내가 명령한대로 실행이 되면 return값 반환
		// 메인에서 에러확인 메소드를 써두면 gui 입장에서도 에러확인 가능

		String query = "INSERT INTO books (title, price) VALUES ('" + book.getTitle() + "', " + book.getPrice() + ")";
		System.out.println("추가: " + query);

		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();

			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}

	// 목록 전체
	public List<Book> list() throws SQLException {
		// 리스트로 담아서 뭔짓을 하려고
		String query = "SELECT * FROM books";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Book> list = new ArrayList<>();
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				// 밑에서 계속 반복되니깐 아예 메소드로 만들어버림
//				int bookId = rs.getInt("bookid");
//				String title = rs.getString("title");
//				int price = rs.getInt("price");
//				
//				list.add(new BookT(bookId, title, price));
				list.add(resultMapping(rs));
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		return list;
	}

	// 검색 (제목) or 검색 (가격)
	public Book selectByTitle(String title) throws SQLException {
		String query = "SELECT * FROM books WHERE title = '" + title + "'";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			if (rs.next()) {
//				int bookId = rs.getInt("bookid");
//				String tt = rs.getString("title");
//				int price = rs.getInt("price");
//				
//				return new BookT(bookId, tt, price);
				return resultMapping(rs);
			} else {
				return null; 			
				//1. 아예 null로 반환하거나
				//2. BookT인데 기본값(0, null, 0)인 애를 반환하거나
				//3. 혹은 아예 예외로 만들어서 throw하거나

			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}

//	public List<Book> selectByPrice(int price) {}
	// 삭제
	public int delete(int bookId) throws SQLException {
		String query = "DELETE FROM books WHERE bookId = " + bookId;

		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();

			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}

	// 수정
	public int update(Book book) throws SQLException {
		String query = "UPDATE books SET title = '" + book.getTitle() + "', price = " + book.getPrice()
				+ " WHERE bookId = " + book.getBookId();

		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();

			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
}
