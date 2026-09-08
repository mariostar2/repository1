package tx0907_1;

public class Person {

	private String name;
	private char gender;
	private int age;

	public Person() {
		
	}
	public Person(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("이름:%s\n성별:%c\n나이:%d\n", name, gender, age);
	}

}
