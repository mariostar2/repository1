package tx0908;

import java.util.ArrayList;
import java.util.Collections;

public class MemberTest {
	public static void main(String[] args) {
		
		Member m1 = new Member(1, "HowToDo", 24);
		Member m2 = new Member(2, "WhatToDo", 20);
		Member m3 = new Member(3, "shouldDo", 30);
		Member m4 = new Member(4, "What", 28);
		Member m5 = new Member(4, "What", 28);
		
		ArrayList<Member> mList = new ArrayList<>();
		
		mList.add(m1);
		mList.add(m2);
		mList.add(m3);
		mList.add(m4);
		mList.add(m5);
		
		for(Member m : mList) {
			System.out.println(m);
		}
		
		Collections.sort(mList);
		
		System.out.println("============================");
		
		for(Member m : mList) {
			System.out.println(m);
			
		}
		
	}
}
