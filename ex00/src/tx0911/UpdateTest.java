package tx0911;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdateTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "green";
		String password = "1234";
		
		String name = "KAO";
		String number = "010-5591-1232";
		String comment = "friend4";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = DriverManager.getConnection(url,user,password);
			String query = "UPDATE TEST03 SET NAME =? , NUM_BER = ? where  PH_NUM =?";	
			PreparedStatement pstmt =  conn.prepareStatement(query);
			
			pstmt.setString(1,name);
			pstmt.setString(2,number);
			pstmt.setString(3, comment);

		
			if(conn != null) {
				System.out.println("DB에 접속 성공");
			}
			int result =  pstmt.executeUpdate();

			if(result >= 1) {
				System.out.println("변경 완료");
			}else {
				System.out.println("변경 실패");
			}
		
			pstmt.close();
			conn.close();
			System.out.println("DB 연결 해제");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
