package com.java.ex2;

public class MainClass {
	// 0916 - 2 : Wrapper Ŭ���� - 8���� �⺻������ Ÿ���� Ŭ���� ���·� ��üȭ ��Ŵ(�޼ҵ� ��밡��)
	public static void main(String[] args) {
		int num1 = 20;
		Integer num2 = new Integer(30);
		double div = num1 / num2.doubleValue();

		System.out.println("�� : " + div);
		System.out.println("�� ���� ������? " + num2.equals(num1)); // Ŭ�����̱⿡ �޼ҵ� ��� ����, ������ ==

		String str = "456";
		int num3 = Integer.parseInt(str); // int���·� �ؼ����ּ��� �ǹ�, �޼ҵ���
		System.out.println(num3 + 111);
	}

}
