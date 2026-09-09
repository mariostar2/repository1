package tx0908_1;

import java.util.ArrayList;

public class UserDB {

	public static ArrayList<User> usList = new ArrayList<>();

	public void insertUser(User u) {
		usList.add(u);
	}

	// 정적
	//매개변수를 하나 더줘서 Arraylist에 있는 User의 id를 변경 
	public static void updateUser(int chid ,int newId, String newName, String newPassword) {
		for (User u : usList) {
			if (u.getId() == chid) {
				u.setId(newId);
				u.setPassword(newPassword);
				u.setName(newName);
				System.out.println(u.getId());
				System.out.println(u.getPassword());
				System.out.println(u.getName());
				
			}
			
		}
		System.out.println("정보 수정 완료");
	
	}

	public void deleteUser(User u ) {
			usList.remove(u);
		
		
		
	}

}
