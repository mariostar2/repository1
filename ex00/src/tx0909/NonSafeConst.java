package tx0909;

interface Animal{
	int DOG = 1;
	int CAT =2;
}

class Person {
	static final int MAN = 1;
	static final int WOMAN =2;
}


public class NonSafeConst {
	
	public static void main(String[] args) {
		who(Person.MAN);
		who(Animal.DOG);
		
	}
	
	public static void who(int man) {
		switch(man) {
		case Person.MAN -> System.out.println("남성 손님 입니다.");
		case Person.WOMAN -> System.out.println("여성 손님 입나다");
		
		}
	}
}
