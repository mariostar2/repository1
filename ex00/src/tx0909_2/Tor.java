package tx0909_2;

public class Tor {
	private String name;
	private int key;
	
	 public Tor(String name ,int key) {
		this.name = name;
		this.key = key;
	}
	 
	 public String gatName() {
		 return name;
	 }
	 
	 public void setName(String name) {
		 this.name = name;
	 }

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

}
