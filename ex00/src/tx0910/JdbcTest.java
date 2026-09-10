package tx0910;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {
	public static void main(String[] args) {
		//Thin 방식 접속 URL 에시(서비스이름: orcl 또는 xe)
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "green";
		String password = "1234";

		try {
			//드라이버 로드(JAVA 6이상은 생략가능하나 명시 가능)
			Class.forName("oracle.jdbc.OracleDriver");

			Connection conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("오라클 19c 연결 성공!");
				conn.close();
			}
		} catch (ClassNotFoundException e) {

			System.out.println("OJDBC 드라이버를 찾을 수 없습니다: " + e.getMessage());
		} catch (SQLException e) {

			System.out.println("데이터베이스 연결 실패: " + e.getMessage());
		}
	}
}
