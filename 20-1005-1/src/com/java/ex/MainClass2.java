package com.java.ex;

import java.util.LinkedList;

public class MainClass2 {
	// 20-10/05 - 2 : LinkedList : 연결고리 만듬 , 넣고뺴고가 자유로움
	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<String>();
		lList.add("김요한");
		lList.add("배수지");
		lList.add("아이유");
		lList.add("김고은");
		lList.add("김요한");

		System.out.println(lList.toString());
		

		lList.add("김연아"); 
		System.out.println(lList.toString());
		
		lList.add(2, "김연아"); 
		System.out.println(lList.toString());
		
		lList.add(2, "박태환"); 
		System.out.println(lList.toString());

		
		int size = lList.size(); 
		System.out.println("lList의 크기 : " + size);

		lList.remove(0); 
		System.out.println(lList.toString());
		
		lList.clear(); 
		System.out.println(lList.toString());
		
		lList= null; 
		System.out.println(lList);
	}

}
