package com.java.ex;

import java.util.LinkedList;

public class MainClass2 {
	// 20-10/05 - 2 : LinkedList : ����� ���� , �ְ���� �����ο�
	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<String>();
		lList.add("�����");
		lList.add("�����");
		lList.add("������");
		lList.add("�����");
		lList.add("�����");

		System.out.println(lList.toString());
		

		lList.add("�迬��"); 
		System.out.println(lList.toString());
		
		lList.add(2, "�迬��"); 
		System.out.println(lList.toString());
		
		lList.add(2, "����ȯ"); 
		System.out.println(lList.toString());

		
		int size = lList.size(); 
		System.out.println("lList�� ũ�� : " + size);

		lList.remove(0); 
		System.out.println(lList.toString());
		
		lList.clear(); 
		System.out.println(lList.toString());
		
		lList= null; 
		System.out.println(lList);
	}

}
