import java.sql.SQLException;
import java.util.List;

public interface RestaurantsDao {
	int create(String name, String phoneNumber, String address) throws SQLException;
	
	List<Restaurant> read() throws SQLException;
	Restaurant read(int id) throws SQLException;
	
	int update(int id, String name, String phoneNumber, String address) throws SQLException;
	
	int delete(int id) throws SQLException;
}

//restaurants테이블에 대한 db access를 수행하는 객체 작성(작성 후 테스트)
//메소드(입력값) : 반환값
//Create (상호명, 전화번호, 주소) OR C(음식점) : 행 개수
//Read() : List<음식점>
//Read(PK) : 음식점
//Update(PK, 새상호명, 새전화번호) OR U(음식점) : 행개수
//Delete(PK) : 행개수
//여러 행의 음식점 추가

//위의 행위들을 인터페이스로 만들어둔다.
//그리고 RestaurantsDaoImpl여기 파일에서 오버라이드해서 
//상세하게 구현해준다.