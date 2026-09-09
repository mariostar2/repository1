package tx0909_2;

import java.util.HashMap;

public class AA5 {
	public static void main(String[] args) {
		String[] abbcaa= {"사과","배","3","4","5","6","7",
				"8","9","10"};
		
		HashMap<String, Integer> hash3 = new HashMap<>();
		int length = Math.abs(abbcaa.length);
		
		for(int i=0; i<length; i++) {
			hash3.put(abbcaa[i], 1);
			System.out.println("키:" +abbcaa[i]);
		}
	}

	
}
