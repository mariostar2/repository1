package tx0909;

public class RowTest {
	
	

	
	public static void main(String[] args) {
		
		Student s1 =new Student(1, "AI", Gender.FEMALE);
		Student s2 =new Student(2, "PI", Gender.MALE);
		Student s3 =new Student(3, "AO", Gender.FEMALE);
		Student s4 =new Student(4, "SP", Gender.MALE);
		Student s5 =new Student(5, "LS", Gender.FEMALE);
		Student s6 =new Student(6, "LE", Gender.MALE);

		Student[] students = new Student[6];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;
		students[5] = s6;
			//남학생 여학생 배열 따로 만들건데
			//어디서 들어왔는지 모름
			//남학생의 수만큼 배열
			//여학생의 수만큼 배열
			int pi =0;  //남학생 수
			int ai =0;//여학생 수 
			
			for(int i=0; i<students.length; i++) {
				if(students[i].getGender() == Gender.MALE) {
					pi++;
				}else if(students[i].getGender() == Gender.FEMALE) {
					ai++;
				}
			}
		System.out.println("============================");
		System.out.println(pi);
		System.out.println(ai);
		Student[] fdd= new Student[pi];
		Student[] mdd =new Student[ai];
		int n=0;
		int m =0;
		for(int i=0;i<students.length; i++) {
			if(students[i].getGender() == Gender.FEMALE) {
				fdd[n] = students[i];
				n++;
			}else if(students[i].getGender() == Gender.MALE) {
				mdd[m] = students[i];
				m++;
			}else {
				break;
			}
		}
		System.out.println("============================");
		for(int j =0; j<students.length; j++) {
			System.out.println(fdd[j]);
		}
		System.out.println("===========================");
		for(int k=0; k<students.length; k++) {
			System.out.println(mdd[k]);
		}
	
		s1.setScore(59);
		s2.setScore(60);
		System.out.println(s1.getStatus());
		System.out.println(s2.getStatus());
	}
}
