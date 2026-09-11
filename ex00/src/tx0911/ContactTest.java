package tx0911;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContactTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "green";
		String password = "1234";
	
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn =  DriverManager.getConnection(url,user,password);
		
			
			if(conn != null) {
				System.out.println("DB에 접속 성공하였습니다");
				conn.close();
			}
			
		
		} catch (ClassNotFoundException e) {
			System.out.println("OJDBC 드라이버를 찾을 수 없습니다: " + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패: " + e.getMessage());
			e.printStackTrace();
		}
		
	}
}
