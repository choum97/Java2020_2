package com.java.ex;

public class MainClass {
	// 0914 03 �������� ���α׷�
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());// ����ð� �и�������
		System.out.println("----------------------");

		System.out.println(" < String tset > ");
		String str = "A";
		long startNum1 = System.currentTimeMillis();

		for (int i = 0; i < 99999; i++) {
			str = str + "A";
		}
		long endNum1 = System.currentTimeMillis();
		System.out.println("String str�� ��� �ð� : " + (endNum1 - startNum1));// ���� ���� ����ؼ� �ɸ��� �ð� ���

		////////////////////////////////////////////////////
		System.out.println(" < StringBuilder tset > ");
		StringBuilder sb = new StringBuilder(); // ������ �޸� ���� �ذ��ϸ� , �ӵ����� ���� ��
		long startNum2 = System.currentTimeMillis();

		for (int i = 0; i < 99999; i++) {
			// sb = sb + "A";//Ŭ������ +�� �ȵ�
			sb = sb.append("A"); // �޼ҵ� ����ؾ���
		}

		long endNum2 = System.currentTimeMillis();
		System.out.println("String SB�� ��� �ð� : " + (endNum2 - startNum2));
	}

}
