package tx0909;

//enum;
//불변?

enum Person2 {
	MAN(29), WOMAN(32);

	int age;
	Person2(int age) {
		this.age = age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "I am " + age + " years old.";
	}
}

public class EnumParamConstructor {

	public static void main(String[] args) {
		System.out.println(Person2.MAN);
		System.out.println(Person2.WOMAN);
		System.out.println(Person2.MAN.getAge());
		System.out.println(Person2.MAN.age);
		System.out.println(Person2.MAN.name());
		Person2.MAN.setAge(40);
		System.out.println(Person2.MAN);
	}
}
