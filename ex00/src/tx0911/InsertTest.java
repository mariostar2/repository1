package tx0911;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "green";
		String password = "1234";
		
		String name = "JEEAA";
		String number = "010-2121-1253";
		String comment = "friend5";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection conn = DriverManager.getConnection(url,user,password);
			
			String query = "INSERT INTO test03(name,num_ber,ph_num) VALUES (? , ? ,?)";
			PreparedStatement stmt  = conn.prepareStatement(query);
			stmt.setString(1, name);
			stmt.setString(2, number);
			stmt.setString(3, comment);
			
			int result = stmt.executeUpdate();
			System.out.println(result);
			if(result == 1) {
				System.out.println("추가성공");
			}else {
				System.out.println("추가실패");
			}
			
			if(conn != null) {
				System.out.println("DB 접속에 성공!");
				
			}
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
