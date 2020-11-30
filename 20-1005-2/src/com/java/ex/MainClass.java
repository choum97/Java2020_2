package com.java.ex;

import java.util.HashSet;

public class MainClass {
	// 20-10/05 - 2 - 1 : Set , *집합 개념이라 중복 X , 순서도 다름
	public static void main(String[] args) {
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("김요한");
		hSet.add("한고은");
		hSet.add("정해인");
		hSet.add("배수지");
		hSet.add("김요한");
		hSet.add("배수지");

		System.out.println(hSet.toString());

		hSet.remove("김요한");
		System.out.println(hSet.toString());

		//int size = hSet.size();
		//System.out.println("크기 : " + size);
		System.out.println("크기 : " + hSet.size());

	}

}
