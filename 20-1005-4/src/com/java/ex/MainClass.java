package com.java.ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MainClass {
	// 20-10/05 - 4 - 1 : Map
	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();

		hMap.put(0, "�����"); // 1234�� �ص���
		hMap.put(1, "������");
		hMap.put(2, "�����");
		hMap.put(3, "������");

		System.out.println(hMap.toString());
		System.out.println(hMap.get(3));

		hMap.remove(1);
		System.out.println(hMap.toString());

		hMap.clear();
		System.out.println(hMap.toString());

		hMap.put(1, "�����");
		hMap.put(2, "������");
		hMap.put(3, "�����");
		hMap.put(4, "������");
		System.out.println(hMap.toString());

		Iterator<Integer> itr = hMap.keySet().iterator(); // �ݺ���
		while (itr.hasNext()) { // hasNext : �������� �ִµ���
			System.out.println(hMap.get(itr.next()));
		}
		//ArrayList  ////////////
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("���۸�");
		aList.add("��Ʈ��");
		aList.add("�������");
		System.out.println(aList.toString());
		
		Iterator<String> itr2= aList.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
	

}
