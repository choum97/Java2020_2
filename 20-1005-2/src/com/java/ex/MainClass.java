package com.java.ex;

import java.util.HashSet;

public class MainClass {
	// 20-10/05 - 2 - 1 : Set , *���� �����̶� �ߺ� X , ������ �ٸ�
	public static void main(String[] args) {
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("�����");
		hSet.add("�Ѱ���");
		hSet.add("������");
		hSet.add("�����");
		hSet.add("�����");
		hSet.add("�����");

		System.out.println(hSet.toString());

		hSet.remove("�����");
		System.out.println(hSet.toString());

		//int size = hSet.size();
		//System.out.println("ũ�� : " + size);
		System.out.println("ũ�� : " + hSet.size());

	}

}
