package com.java.ex;

import java.util.ArrayList;

public class MainClass {
	// 20-10/05 - 1 : ArrayList
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>(); // ���׸� ����
		aList.add("�����");
		aList.add("�����");
		aList.add("������");
		aList.add("�����");
		aList.add("�����");

		System.out.println(aList.toString()); // �÷��Ǹ� ���� toString �ϳ��� ������

		String value = aList.get(3); // get�� ���� �������� ��
		System.out.println("index 3�� ���� " + value);

		aList.set(1, "�迬��"); // set�� �ش� �������� ���� �ٲ�
		System.out.println(aList.toString());

		int size = aList.size(); // ũ��
		System.out.println("aList�� ũ�� : " + size);

		aList.remove(0); // ����
		System.out.println(aList.toString());
		
		aList.clear(); // �޸� ������ �����͸� �������� �ּҰ��� ������ ����
		System.out.println(aList.toString());
		
		aList= null; // �ּ� ���� ������
		System.out.println(aList);
	}

}
