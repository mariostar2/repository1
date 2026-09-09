package tx0908_1;

public class Board extends User {
	private int boardnumber;
	private String title;
	private String content;
	
	public Board(int id, String password, String name,String title, String content, int cnt) {
		super(id,password,name);
		this.title = title;
		this.content = content;
		this.boardnumber = cnt++;
	}
	
	
	public  int getBoardnumber() {
		return boardnumber;
	}


	public void setBoardnumber(int boardnumber) {
		this.boardnumber = boardnumber;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	@Override
	public String toString() {
		return String.format("작성자:%s\n제목:%s\n작성글:%s\n게시글 번호:%d\n",getName(),title,content,boardnumber);
	}
	
	
	
}
