package tx0907;

public class NonStaff extends Company {

	private int Bhorly;

	
	public NonStaff(String name, String department, String employee,  int salary, int Bhorly) {
		super(name,department,salary, employee);
		this.Bhorly = Bhorly;

	}
	public int getBhorly() {
		return Bhorly;
	}

	public void setBhorly(int bhorly) {
		Bhorly = bhorly;
	}
	
	@Override
	public String toString() {
		return String.format("이름:%s\n부서:%s\n급여:%d원\n시간당 급여:%d원\n ", name,department,salary,Bhorly);
	}
	
}
