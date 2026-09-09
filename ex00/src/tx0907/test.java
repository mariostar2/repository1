package tx0907;

import java.util.HashSet;


public class test {
	//각각의 클래스를 만들고 
	//인스턴스 재정의
	//두 인스턴스를 비교할때 hashcode, equals
	public static void main(String[] args) {
//		A1 a =  new A1(1, 2, 3, 4);
//		A2 b =  new A2(1, 2, "3","4");
		
		
		B c = new B(1,"AA");
		B d= new B(1,"AA");
		B e= new B(1,"CC");
		
		System.out.println(c == d);
		//매개변수
		//System.out.println(c.equals(c.equals(new Z())));
		//equals,hashcode 오버라이딩
		System.out.println(c.equals(c));
		
		HashSet<B> setB = new HashSet<>();
		setB.add(c);
		setB.add(d);
		setB.add(e);
		
		System.out.println(setB.size());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		
//		a.getA();
//		b.getC();
//	
//		System.out.println(a);
//		System.out.println(b);
//		
	}
	
	
}
