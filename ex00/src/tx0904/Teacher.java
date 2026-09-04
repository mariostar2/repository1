package tx0904;

public class Teacher extends School {
	/*
**선생**
 * 담당교사
 * 지도과목
 * 성별
 * 선생님반에 학생수 
 * 영희:학생의 필수 수강과목
 * SQL  선택과목을 수강하는 남학생수
 * A반 학생의 필수과목 표현
 */
	private String name; //선생 이름
	private int size; //선생반의 학생수
	private String charge; //지도 과목
	private String assigned; //담당하는반
	public Teacher(String name,int size,String charge,String assigned) {
		this.name = name;
		this.size =size;
		this.charge = charge;
		this.assigned = assigned;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public String getCharge() {
		return charge;
	}
	
	public void setCharge(String charge) {
		this.charge = charge;
	}
	
	public String getAssigned() {
		return assigned;
	}
	
	public void setAssigend(String assigned) {
		this.assigned = assigned;
	}
	

	@Override
	public String toString() {
		return String.format("지도 교수님 이름: [%s] 지도과목: %s 담당반: %s 가르키는 학생수: %d",name,charge,assigned,size);
	}
	

	
	
}
	

