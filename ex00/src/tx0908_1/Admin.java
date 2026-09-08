package tx0908_1;

public class Admin extends User {

	private int adminCode;
	public Admin(int id, String name, String password, int admincode) {
		super(id,name,password);
		this.adminCode =admincode;
	}
	public int getAdminCode() {
		return adminCode;
	}
	public void setAdminCode(int adminCode) {
		this.adminCode = adminCode;
	}
	
	@Override
	public String toString() {
		return "Admin [adminCode=" + adminCode + "]";
	}
	
	
	
	
	
}
