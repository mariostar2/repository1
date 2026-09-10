package tx0910;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "green";
		String password = "1234";

		try {
			try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, password);
			if(conn !=null) {
				System.out.println("DB 접속에 성공하였습니다");
				Statement stmt = conn.createStatement();
				// 행 삭제를 위한 처리용 변수 target 선언부 
				int target = 1;
				
				//삭제쿼리
				String query  ="DELETE FROM TEST02 WHERE NO = " + target;
				
				int result = stmt.executeUpdate(query);
				
				if(result >=1) {
					System.out.println(result + "개의 행이 삭제 처리되었습니다");
				}else {
					System.out.println("삭제 불가능 삭제 처리에 실패하였습니다 ");
				}
				stmt.close();
				conn.close();
			
			}
			
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
