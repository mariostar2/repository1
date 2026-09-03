package tx0902;

public class TestStatic {
	
	
	public static void main(String[] args) {
		//static 인스턴스 실행클래스
		Static stb =  new Static();
		Static stb1 = new Static();
		Static stb2 = new Static();
		Static stb3 = new Static();
		stb.f();
		stb.name = "아아";
		Static.name = "123";
		
		stb.city = "뉴욕";
		stb1.city =  "파리";
		stb2.city = "모스크바";
		stb3.city = "베를린";
		
		System.out.println(stb.name);
		System.out.println(Static.name);
		
		System.out.println(stb.city);
		System.out.println(stb1.city);
		System.out.println(stb2.city);
		System.out.println(stb3.city);
		
		
		
		
	}
}
