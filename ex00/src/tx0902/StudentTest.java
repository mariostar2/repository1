package tx0902;

public class StudentTest {
	public static void main(String[] args) {
		Student std = new Student("안녕");
		Student std1 =new Student("반가워");
		Student std2 =new Student("나는");
		Student std3 =new Student("123");
		Student std4 =new Student("456");
		
		//std.stu = ;
		//std.name = "안녕";
		System.out.println("이 학생의:"+ std.stu + "이며 학생의 이름은:" +std.ntu);
		//std.stu = "-2";
		//std.name = "반가워";
		System.out.println("이 학생의:"+ std1.stu + "이며 학생의 이름은:" +std.name);
		//std.stu = "-3";
		//std.name = "팝콘";
		System.out.println("이 학생의:"+ std2.stu + "이며 학생의 이름은:" +std.name);
		//std.stu = "-4";
		//std.name = "수안";
		System.out.println("이 학생의:"+ std3.stu + "이며 학생의 이름은:" +std.name);
		//std.stu = "-5";
		//std.name = "정원";
		System.out.println("이 학생의:"+ std4.stu + "이며 학생의 이름은:" +std.name);
		
	}
}
