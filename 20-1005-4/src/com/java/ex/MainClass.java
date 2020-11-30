package com.java.ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MainClass {
	// 20-10/05 - 4 - 1 : Map
	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();

		hMap.put(0, "김요한"); // 1234로 해도됨
		hMap.put(1, "정해인");
		hMap.put(2, "배수지");
		hMap.put(3, "아이유");

		System.out.println(hMap.toString());
		System.out.println(hMap.get(3));

		hMap.remove(1);
		System.out.println(hMap.toString());

		hMap.clear();
		System.out.println(hMap.toString());

		hMap.put(1, "김요한");
		hMap.put(2, "정해인");
		hMap.put(3, "배수지");
		hMap.put(4, "아이유");
		System.out.println(hMap.toString());

		Iterator<Integer> itr = hMap.keySet().iterator(); // 반복자
		while (itr.hasNext()) { // hasNext : 다음꺼가 있는동안
			System.out.println(hMap.get(itr.next()));
		}
		//ArrayList  ////////////
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("슈퍼맨");
		aList.add("베트맨");
		aList.add("원더우먼");
		System.out.println(aList.toString());
		
		Iterator<String> itr2= aList.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
	

}
