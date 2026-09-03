package tx0828;

public class BusManager {

	public static void main(String[] args) {
		//실행문
		//Bus bus1 = new Bus("1");
		//학생 정보를 만듬(3)
		Student std1 = new Student("JON",5000);
		Student std2 = new Student("TA",18500);
		Student std3 = new Student("OD",23000);
		
		//버스 정보를 만듬(4)
		Bus bus1 = new Bus("1",1,0);
		
		//학생정보를 배열로 출력
		Student[] students = new Student[3];
		students[0] = std1;
		students[1] = std2;
		students[2] = std3;
		
		
		//버스에 대한 정보를 보여줘야하는건가?
		
		//학생이 가진 돈에 대한 정보를 보여주는 
		std1.showInfo();
		std2.showInfo();
		std3.showInfo();
		
		

	
	}

}
