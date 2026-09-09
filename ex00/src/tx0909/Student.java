package tx0909;

public class Student {
	private int no;
	private String name;
	private Gender gender;
	private int score;	//세터를 통해 값 부여
	private Status status;// score가 부여되면 60점 이상일때 pass ,미만이면 fail
	
	public Student(int no, String name, Gender gender) {
		this.no = no;
		this.name = name;
		this.gender = gender;
		
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
		if(this.score >= 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
	}

	@Override
	public String toString() {
		return String.format( "나의 학번은:%d 나의 이름은:%s 이며 성별은:%s 입니다",no,name,gender);
	}

}
