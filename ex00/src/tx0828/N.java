package tx0828;

public class N {

	//실행부
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = "Hello";
		//인스턴스의 
		
		//문자열을 비교할때는 equals 사용
		System.out.println(s1.equals(s2));
		//s1------s2는 주소가 같다? 
		System.out.println(s1==s2);
		String s3 = new String ("Hello");
		System.out.println(s3);
		//주소를 비교한다.
		System.out.println(s1 ==s3);
	}
	
	
	
}
