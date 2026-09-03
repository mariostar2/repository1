package tx0903;

public class GenericMethodTest {
	public static void main(String[] args) {
//		String [] st =  {"aaa","bbb","ccc"};
//		
//		String s = ArrayPrinter.getLast(st);
//		ArrayPrinter ap = new ArrayPrinter();
//		System.out.println(s);

		int[] ito = {1,2,3};
		JernicA ja = new JernicA();
		int count = 0;
		for (int i : ito) {
			int temp = ito[ito.length - 1 - count];
			System.out.print(temp);
			count++;

		}
	}
}