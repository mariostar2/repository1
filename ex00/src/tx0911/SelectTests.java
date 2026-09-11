package tx0911;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTests {
	public static void main(String[] args) {
		
		String url =  "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "green";
		String password = "1234";
		
		String query =  "SELECT NAME,NUM_BER,PH_NUM FROM TEST03 WHERE NAME LIKE '%C%'";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = DriverManager.getConnection(url,user,password);
			PreparedStatement pstmt =  conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString("NAME");
				String number = rs.getString("NUM_BER");
				String comment = rs.getString("PH_NUM");	
				System.out.println(name);
				System.out.println(number);
				System.out.println(comment);
			}
			if(conn != null) {
				System.out.println("DB에 접속 성공 ");
				
			}	
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result);
			if(result >=1) {
				System.out.println("조회 성공 하였습니다");
			}else {
				System.out.println("조회 실패 하였습니다 ");
			}
			pstmt.close();
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
