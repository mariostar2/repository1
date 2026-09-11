package tx0910;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "green";
		String password = "1234";

		try {
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection(url, user, password);
				if (conn != null) {
					System.out.println("DB 접속 성공!");
					Statement stmt = conn.createStatement();
					int no = 2;
					String name = "bbbb";
					int age  =30;
					//중복되는걸 다바뀔수도 있다 
					
					String query = "UPDATE test02 SET no = " + no + ""
							+ ", name = '" + name + "', age = " + age + ""
									+ " WHERE no = 3";
							
					int result = stmt.executeUpdate(query);
				
					if(result ==1) {
						System.out.println("하나의 행이 업데이트 되었습니다");
					}else {
						System.out.println("업데이트 실패");
					}
					//메모리 누수 방지 
					stmt.close();
					conn.close();
				}
			} catch (ClassNotFoundException e) {
		
				e.printStackTrace();
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
