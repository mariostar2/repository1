package tx0911;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTest {

	public static void main(String[] args) {
		String url =  "jdbc:oracle:thin:@localhost:1521:testdb";
		String user =  "green";
		String password = "1234";
	
		try 
			{
			Connection conn =  DriverManager.getConnection(url,user,password);
			if(conn != null) {
				System.out.println("DB 접속에 성공하였습니다");
			}
			int target = 1;
			String query = "DELETE FROM TEST03 WHERE NAME = '" + target + "'";
			
			
			PreparedStatement pstmt =  conn.prepareStatement(query);
			int result = pstmt.executeUpdate();
			System.out.println(result);
			if(result  >=0) {
				System.out.println(target + "삭제처리 되었습니다");
			}else {
				System.out.println("삭제처리에 실패하였습니다");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
