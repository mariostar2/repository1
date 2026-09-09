package tx0909_4;

import java.util.ArrayList;

public class B {
	public static void main(String[] args) {
		ArrayList<A> alist = new ArrayList<>();

		A a1 = new A(1, "A");
		A a2 = new A(2, "B");
		A a3 = new A(3, "C");
		
		alist.add(a1);
		alist.add(a2);
		alist.add(a3);
	
	
		//alist  --- > 안에 get1번인덱스 .get
		//set -> setting
		System.out.println(alist.get(1).getM());
		//a3 번을 c ->z로 바꿀거면 a3.set을 해서 
		//alist의 2번 인덱스에 변경된 s를 출력해라 
		//set은 세팅만 하고 get으로 접근해라 
		a3.setS("Z");
		System.out.println(alist.get(2).getS());
		a2.setS("A");
		System.out.println(alist.get(1).getS());
		a1.setM(1);
		System.out.println(alist.get(2).getM());
		
	
	
	}

}
