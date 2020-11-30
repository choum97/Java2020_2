package com.java.ex;

import java.util.HashSet;

public class MainClass {
	// 20-10/05 - 3 - 1 : set
	public static void main(String[] args) {
		HashSet<Student> hSet = new HashSet<Student>();
		hSet.add(new Student("김요한", 1));
		hSet.add(new Student("배수지", 4));
		hSet.add(new Student("배수지", 3));
		hSet.add(new Student("아이유", 5));
		
		System.out.println(hSet.toString());

		
		Student st = new Student("배수지", 3);
		//안지워짐 => 값이 똑같은 것이지, 연관도 없고 같이 있지도 않음
		hSet.remove(st);	// hSet에서 지우나 마나이기에 의미없음
		System.out.println(hSet.toString());
	}

}
