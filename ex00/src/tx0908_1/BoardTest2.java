package tx0908_1;

import java.util.Scanner;

public class BoardTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 지금은 게시글을 작성하려면 로그인으로 넘어간다 이제 이걸 바꾸자
		UserDB uDB = new UserDB();
		User u1 = new User(1, "1a", "Mrs.Lain");
		User u2 = new User(2, "2a", "Mr.boss");
		User u3 = new User(3, "3a", "Mr.Star");
		uDB.insertUser(u1);
		uDB.insertUser(u2);
		uDB.insertUser(u3);
		
		
		System.out.println("게시글을 작성 하시겠습니까? 그전에 로그인을 부탁드립니다 1.예? 2.아니오");
		String userPlus = "";
		String userCh = sc.next();
		// 로그인
		if (userCh.equals("1")) {
			System.out.println("선택: 1. 로그인 2. 회원가입");
			userPlus = sc.next();
			boolean Login = false;
			if (userPlus.equals("2")) {
				System.out.println("사용하실 아이디를 입력해주세요");

				int crId = sc.nextInt();
				System.out.println("등록하실 비밀번호를 입력해주세요");
				String crPws = sc.next();
				System.out.println("등록하실 이름을 적어주세요:");
				String crName = sc.next();
				User newUser = new User(crId, crPws, crName);
				uDB.insertUser(newUser);

			}
			// 로그인 진행
			System.out.println("아이디를 입력해주세요:");
			int nextId = sc.nextInt();
			System.out.println("비밀번호를 입력해주세요:");
			String nextPws = sc.next();

			for (int i = 0; i < uDB.usList.size(); i++) {
				boolean LsLogin = (nextId == uDB.usList.get(i).getId());
				System.out.println(LsLogin);
				// 문자열 타입으로 받았을때는 equals 사용 정수는 사용불가
				boolean LsPws = (nextPws.equals(uDB.usList.get(i).getPassword()));
				System.out.println(LsPws);
				if (LsLogin && LsPws) {
					Login = true;
					break;
				}
			}

			if (Login) {
				System.out.println("로그인에 성공 하였습니다");
			} else {
				System.out.println("로그인에 실패 하였습니다");
			}
		}
		
		// update
		System.out.println("=========================================");
		System.out.println("어떤 정보를 수정 하시겠습니까?");
		// 1번에 index를 비교해서 4번으로 선언 해주면 바꾼다
		UserDB.updateUser(1, 4, "b", "b1");
		
		System.out.println(u1);

		// 유저 insert (로그인시 유저잔아)
		User logUser = new User(1, userCh, userPlus);
		User logUser1 = new User(2, userCh, userPlus);
		User logUser2 = new User(3, userCh, userPlus);

		System.out.println("==============현재 작성된 게시글 목록===============");
		Board bd1 = new Board(logUser.getId(), logUser.getPassword(), "mrs1", "222", "즐겁다", 1);
		Board bd2 = new Board(logUser1.getId(), logUser1.getPassword(), "mrs2", "111", "즐겁다", 2);
		Board bd3 = new Board(logUser2.getId(), logUser2.getPassword(), "mrs3", "333", "즐겁다", 3);

		// 넣기
		BoardDB bDb = new BoardDB();
		bDb.bdInsert(bd1);
		bDb.bdInsert(bd2);
		bDb.bdInsert(bd3);
		System.out.println(bd1);
		System.out.println(bd2);
		System.out.println(bd3);
		BoardDB.UpdateBoard(1, 4,"안녕","나는 팝콘이야");
		System.out.println(bd1);
		
		System.out.println("==실행전 ==");
		bDb.DeleteBoard(bd3);
		System.out.println(bd3);
		sc.close();
	}
}
