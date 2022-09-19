import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import greenart.DBUtil;

public class Main {
public static void main(String[] args) {
	try(Connection conn = DBUtil.getConnection()){
		
	}catch (SQLException e) {
		e.printStackTrace();
	}
	//try,catch를 이렇게 사용하게 되면 자동으로 close 해줄 수 있다.
	// 여러개를 적어주고 싶으면 첫번째 수행 뒤에 세미콜론 찍어주고 연달아 적어주면 됨
	
//	try(Connection conn = DBUtil.getConnection();
//			PreparedStatement pstmt = conn.prepareStatement("")){
//		
//	}catch (SQLException e) {
//		e.printStackTrace();
//	}
	
}
}
