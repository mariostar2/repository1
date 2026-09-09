package tx0907_1;

import java.util.ArrayList;

public class PersonTest {
	public static void main(String[] args) {

		Person p = new Person("강아지", 'W', 10);
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println(p);

		
		//set
		p1.setAge(10);
		p1.setName("강아지");
		p1.setGender('W');
		System.out.println(p1);

		//get
		int n = p2.getAge();
		char n1= p2.getGender();
		String n2 = p2.getName();
		
		System.out.println("======================================================");
		//기본 생성자 
		n =10;
		n1 = 'w';
		n2 = "강아지";
		System.out.println("이름:" +n2);
		System.out.println("성별" +n1);
		System.out.println("나이:"+n);
		System.out.println("======================================================");
		
		//배열
		Person p3 = new Person("철수",'M',30);
		Person p4 = new Person("영희",'W',30);
		Person[] ps = new Person[2];
		ps[0] = p3;
		ps[1] = p4;
		
		//for문
		for(int i=0; i<ps.length; i++) {
			System.out.println(ps[i]);
		}
		System.out.println("======================================================");
		
		//어레이리스트
		ArrayList<Person> plist =new ArrayList<>();
		plist.size();		
		System.out.println(plist.size());
		System.out.println("======================================================");
		
		plist.add(p3);
		System.out.println(p3);
		plist.add(p4);
		System.out.println(p4);
		
		System.out.println("=========================================================");
		for(int i =0; i<plist.size(); i++) {
			System.out.println(plist.get(i));
		}
		
		//남자인 이름을 수를 새는 
		System.out.println("남자인 사람만");
		for(int i =0; i<plist.size(); i++) {
			if(plist.get(i).getGender() == 'M') {
				System.out.println(plist.get(i));
			}
		}
		
		//여자인 사람 출력
		System.out.println("여자만 출력하시오");
		for(int i =0; i<plist.size(); i++) {
			if(plist.get(i).getGender() == 'W') {
				System.out.println(plist.get(i));
			}
		}
		
		
		
	}

}
