package tx0910;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "green";
		String password = "1234";
		
		try {
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn =  DriverManager.getConnection(url,user,password);
				if(conn !=null) {
					System.out.println("DB에 접속 성공!");
					//쿼리문을 실행함 
					Statement stmt = conn.createStatement();
					int no = 4;
					String name = "BBBB";
					int age = 38;
					String query = "INSERT INTO TEST02(no, name, age) VALUES(" 
					+ no + ", '" + name + "', " + age + ")";

					//변수를 하나 담아서 ? 추가 
					//1개가 추가되면 1을 반환 
					int result  = stmt.executeUpdate(query);
					
					if(result ==1) {
						System.out.println("1개의 행을 추가하는걸로 하겠습니다");
					}else {
						System.out.println("추가 실패!");
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
