package tx0903;

import java.util.ArrayList; //clrl + shift +o

public class ArrayListTest {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("aaa");
		list.add("bbb");

		list.add("ccc");
		list.add("ddd");

		list.add(1, "가가가");
		String s = list.get(2);
		System.out.println(s);

		list.set(2, "hello");
		System.out.println(list.get(1)); 	//없는 인덱스 요청시 예외 발생 

		String returnValue = list.remove(2); // 없는 인덱스 삭제 시도 시 예외 발생
		// 값을 지울때 어떤 값이 지워진건가 알려주는것
		System.out.println("remove_returnValue :" + returnValue);
		System.out.println(list.get(2));

		boolean tf = list.remove("zzz");// 없는 값 삭제 시도 시 false 반환
		System.out.println("remove_value tf: " + tf);
		System.out.println(list.get(2));

		boolean fs = list.contains("ddd");
		System.out.println("ddd는 리스트에 나오는가? :" + fs);
		if(fs){
			System.out.println("문의하신 문자열은 list 안에 있습니다");
		}else {
			System.out.println("문의하신 문자열은 list 내에 존재 하지 않습니다 ");
		}
		
		String searchValue = "ㅅㅅㅅ";
		int idx = list.indexOf(searchValue);
		//System.out.println("찾으시는 " + searchValue+ "는 list의 " + idx + "번 인덱스에 있습니다");
		if(idx == 0) {
			System.out.println("찾으시는"+ searchValue+ "는 list" + idx+ "에 존재 하지 않습니다");
		}else {
			System.out.println("찾으시는 " +searchValue+ "는 list " + idx +"에 존재 합니다");
		}
		
		int length = list.size();
		System.out.println("list의 길이 :" + length);
		
		System.out.println("=================================================================");
		
		ArrayList<String> list2 = new ArrayList<>();
		//list2.clear();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("A");
		
		System.out.println(list2.indexOf("A"));
		System.out.println(list2.lastIndexOf("A"));
		
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
			
		for(String el : list2) {
			System.out.println(el);
		}
		System.out.println("********************************************");
		list2.forEach( value -> System.out.println(value));
		list2.forEach(System.out::println);
		
		//System.out.println("list의 size: " + list2.size());
		

	}
}
