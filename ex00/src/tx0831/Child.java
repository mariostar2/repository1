package tx0831;

public class Child extends Parent {


	String firstName;
	

	
	@Override
	public String toString() {
		return "이 사람의 성은 "+ lastName +"이고, 이름은"+ firstName + "입니다.";
	}

}
