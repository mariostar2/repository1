package tx0903_1;

public class test1 {
	public static void main(String[] args) {
		int[] ito2 = new int[3];
		int count =0;
		
		for(int i : ito2) {
			ito2[count] = (count + 1) *10;
			int temp = ito2[ito2.length - count -1];
		
			System.out.println(temp);
			count ++;
		}
	}
}
