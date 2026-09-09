package tx0909;

public class Grade_test {
	public static void main(String[] args) {
		int price =10000;
		
		int result = Grade.SILVER.calcPrice(price);
		System.out.println(result);
	}
}
