package com.java.ex;

import java.util.ArrayList;

public class MainClass {
	// 20-10/05 - 1 : ArrayList
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>(); // 제네릭 선언
		aList.add("김요한");
		aList.add("배수지");
		aList.add("아이유");
		aList.add("김고은");
		aList.add("김요한");

		System.out.println(aList.toString()); // 컬렉션만 가능 toString 하나씩 꺼내줌

		String value = aList.get(3); // get은 값을 가져오는 것
		System.out.println("index 3의 값은 " + value);

		aList.set(1, "김연아"); // set은 해당 아이템의 값을 바꿈
		System.out.println(aList.toString());

		int size = aList.size(); // 크기
		System.out.println("aList의 크기 : " + size);

		aList.remove(0); // 제거
		System.out.println(aList.toString());
		
		aList.clear(); // 메모리 공간의 데이터를 지워버림 주소값은 가지고 있음
		System.out.println(aList.toString());
		
		aList= null; // 주소 값이 없어짐
		System.out.println(aList);
	}

}
