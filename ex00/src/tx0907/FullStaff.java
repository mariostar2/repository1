package tx0907;

public class FullStaff extends Company {

	// 정규직
	private int Ahorly = 30000;

	
	public FullStaff(String name, String department, String employee, int salary, int Ahorly) {
		super(name, department, salary ,employee);
		this.Ahorly = Ahorly;
	}

	public int getAhorly() {
		return Ahorly;
	}

	public void setAhorly(int ahorly) {
		Ahorly = ahorly;
	}

	@Override
	public String toString() {
		return String.format ("이름:%s\n부서:%s\n사원번호:%s\n월급:%d원\n기본급:%d원\n",name,department,employee,salary,Ahorly);
	}
}
