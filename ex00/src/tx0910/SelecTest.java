package tx0910;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SelecTest {

	public static void main(String[] args) {
		ArrayList<Person>jdbc = new ArrayList<>();
		
		//한명씩 담으면 되니까 
		
		
		//DB연결 시 필요한 url user, password
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "green";
		String password = "1234";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, password);
	
			if (conn != null) {
				System.out.println("DB 접속 성공!"); 
				// 쿼리문 실행
				Statement stmt = conn.createStatement();
				
				// 쿼리문 준비
				String query = "SELECT * FROM test02";
				//쿼라 실행
				ResultSet rs = stmt.executeQuery(query);
				
				//한명씩 넣어야하는구나
				//제일 처음뜨는 칼럼
				while(rs.next()) {
					int	no	= rs.getInt("no");
					String name = rs.getString("name");
					int age = rs.getInt("age");
					jdbc.add(new Person(no, name, age));
				
					System.out.println(no + "," + name +"," + age );
				}
				for(int i =0; i<jdbc.size(); i++) {
					//get은 값을 돌려준다 
					
					System.out.println(jdbc.get(i).getNo());
					System.out.println(jdbc.get(i).getAge());
					System.out.println(jdbc.get(i).getName());
				
				}
				
				//사용했으면 반납
				rs.close();
				stmt.close();
				conn.close();
				
			} else {
				System.out.println("DB 접속 실패....");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
