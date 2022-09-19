//mySQL에서 이작업을 바로 안하고 이클립스를 통해서 하는 것의 장단점
//- 장점 : db가 관리(db에서는 파일이 pk를 고유하게 가지므로 db 시스템 사용 가능해서 관리하기가 수월해짐)
//(but java에선 파일 있는지 유무 찾는등 해야하는데 db에선 관리가 편리) 
//단점 : 파일이 저장돼있으면 자바 앱에서 파일로 바로가면 되는데, db를 들렀다와야 하므로 느림
//  - db 관리 시스템 : key값으로 관리, unique한 값으로 만들어서 관리, 참조 객체가 있다면 파일이 삭제/변경을 막아주기 등 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import greenart.DBUtil;

public class FileDB {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("SELECT * FROM files WHERE id = ?");
			pstmt.setInt(1, 1000);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				Blob file = rs.getBlob("file");
				// blob:0101010101을 담고 있다.

				InputStream inputStream = file.getBinaryStream();
				FileOutputStream fos = new FileOutputStream(new File("다운로드받은거.png"));
				int b = 0;
				while ((b = inputStream.read()) != -1) {
					fos.write(b);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
//		try {
//			conn = DBUtil.getConnection();
//			pstmt = conn.prepareStatement("INSERT INTO files (id, name, file) VALUES (?, ?, ?)");
//			pstmt.setInt(1, 1000);
//			pstmt.setString(2, "파일이름");
//			pstmt.setBlob(3, new FileInputStream(new File("춘식1.png")));
//			
//			pstmt.executeUpdate();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			DBUtil.closeStmt(pstmt);
//			DBUtil.closeConn(conn);
//		}
	}
}
