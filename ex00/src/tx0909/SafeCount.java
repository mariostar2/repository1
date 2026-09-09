package tx0909;

enum Animal1 {
	DOG, CAT

}

enum Person1 {
	MAN, WOMAN
}

public class SafeCount {

	public static void main(String[] args) {
		who(Person1.MAN);
		who(Animal1.DOG);
	}

	

	public static void who(Person1 p) {
		switch (p) {
		case MAN:
			System.out.println("남성손님 입니다");
			break;
		case WOMAN:
			System.out.println("여성손님 입니다.");
			break;

		}

	}
	private static void who(Animal1 dog) {
		// TODO Auto-generated method stub

	}
}
