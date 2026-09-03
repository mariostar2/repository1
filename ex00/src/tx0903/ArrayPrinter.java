package tx0903;

public class ArrayPrinter {
	//일반 클래스에서 사용할때의 경우만 
	//메서드만 제너릭 
	public static <T> T getLast(T[] arr) {
		//마지막인덱스의 요소 반환
		return arr[arr.length -1];
	
	}
	
	

	
}