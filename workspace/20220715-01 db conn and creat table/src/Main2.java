import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {
	
	// 매번 만들기 귀찮으니깐 아예 메소드로 만들어서 사용하자 
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost:3306/my_db";
		String id = "root";
		String password = "root";
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = makeConnection(); // 만들어둔 메소드 호출
			stmt = conn.createStatement();
			
			int result = stmt.executeUpdate("INSERT INTO books (title, price) VALUES ('zzz', 17000);");
			
			System.out.println(result + "행이 추가되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
