package tx0901_1;

public class DayTest {

	public static void main(String[] args) {
		Day day = Day.MONADAY;
		System.out.println(day);
		if (day == Day.SATURDAY || day == Day.SATURDAY)
			System.out.println(day);
		else
			System.out.println("WEEKDAY");
		for (Day d : Day.values()) {
			System.out.println(d);
		}
	}
}

