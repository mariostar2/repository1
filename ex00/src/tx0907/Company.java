package tx0907;

public abstract class Company {
	//급여 계산 
	protected String name;
	protected String department;
	protected int salary;
	protected String employee;
	
	
	public Company(String name, String department, int salary, String employee) {
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.employee = employee;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
