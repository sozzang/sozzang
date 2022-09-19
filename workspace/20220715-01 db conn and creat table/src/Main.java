// 이클립스와 sql 연결 
// SQL문장 작성 및 전송 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		Connection conn = null; //연결만 해줬을 뿐, 문장 실행은 Statement에서
		Statement stmt = null; //문장 객체 생성
		//초기화를 꼭 해줘야함
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
			// 드라이브매니저 클래스의 getConnection 호출하여 db와 연결하고 파라미터(url,id,pw) 요구함
			
			// table A : 컬럼 B VARCHAR(10) PK 추가해보기
            // String query = "CREATE TABLE A (B VARCHAR(10) PRIMARY KEY);";
			
			// A 테이블 삭제해보기
			String query = "DROP TABLE A";
			
			stmt = conn.createStatement();
			// conection에서 statment 부르기
			stmt.executeUpdate(query);
			
			// executeUpdate : 수정하는 작업에 대해 동작시키고자할 때 (추가,생성,변경,삭제)
			// 반환값이 int
			
			// executequery : SELECT만 이거
			// 반환값이 resultSet 
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close(); //닫는 순서는 반대!! connection부터 열었으니 나중에 닫아줘야함
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
