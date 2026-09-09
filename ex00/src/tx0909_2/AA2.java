package tx0909_2;

import java.util.HashMap;
import java.util.Scanner;


public class AA2 {
	public static void main(String[] args) {
		
		int[] abba = { 1, 2, 3, 4 };
		String[] abbc = { "가", "나", "디", "라" };
		HashMap<Integer, String> hash = new HashMap<>();
		
		int length = Math.min(abba.length, abbc.length);
		
		for(int i=0; i<length; i++) {
			hash.put(abba[i], abbc[i]);
			System.out.println("키:" + abba[i] + "값:" + abbc[i]);
		}
		
	
		
	
	}
	
	
}
