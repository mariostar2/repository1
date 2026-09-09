package tx0908_1;

import java.util.ArrayList;

public class BoardDB {
	public static ArrayList<Board> bdList = new ArrayList<>();

	// 1.게시글 추가(Db에 Create)
	void bdInsert(Board b) {
		bdList.add(b);
	}

	// 게시글 수정
	public static void UpdateBoard(int pid, int id, String title, String content) {
		for (Board b : bdList) {
			System.out.println(b.getBoardnumber());
			if (b.getBoardnumber() == pid) {
				b.setTitle(title);
				b.setContent(content);
				//id를 받아야 바뀌는구나 
				b.setBoardnumber(id);
			}
		}

	}
	// 게시글 삭제
	public void DeleteBoard(Board b) {
			bdList.remove(b);
	
	}

}
