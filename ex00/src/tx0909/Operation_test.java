package tx0909;

public class Operation_test {
	
	public static void main(String[] args) {
		//객체로 만들때만 new 사용 
		Operation op = Operation.PLUS;
		System.out.println(op.calculate(10,20));
	}
}
