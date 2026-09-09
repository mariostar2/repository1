package tx0909;

//static == 클래스 변수 
//final == 변하지 않는
//int == 정수
//==1;
//대문자 == 상수
//소문자 == 변수
//클래스 이름 : 대문자 
class Role {
	public static final int ADMIN = 1;
	public static final int MEMBER = 2;
	public static final int GUEST = 3;
}

//상수

public class ClassBaseConts {

	//private static final int role =4;

	public static void main(String[] args) {
		
		System.out.println(Role.ADMIN);
		int role = Role.ADMIN;
		
		switch(role) {
		case Role.GUEST:;
			System.out.println(Role.GUEST);
			System.out.println("손님입니다");
			break;
			
		case Role.MEMBER:
			System.out.println(Role.MEMBER);
			System.out.println("회원입니다");
			
		case Role.ADMIN:
			System.out.println("관리자입니다");
			System.out.println(Role.ADMIN);
			break;
		
	
	}
}
}
