package com.java.ex;

import java.util.Scanner;

public class MainClass {
	// 0916 - 1 ��ĳ��Ŭ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // System.in ->Ŭ����, in ��ü����

		System.out.print("�й� -> ");
		// String st1 = sc.nextLine(); // Line�� ���Ͱ� �� �������� ���ڿ��� ó��, ���ʹ���
		String st1 = sc.next();

		System.out.print("�̸� -> ");
		String st2 = sc.next(); // �����̽� ������

		System.out.print("���� -> ");
		int age = sc.nextInt(); // ������ ���� ��, float double ���� ����

		System.out.println("< �Է� ���� ���� >");
		System.out.println("�й� : " + st1);
		System.out.println("�̸� : " + st2);
		System.out.println("���� : " + age);
		System.out.println("��");
	}

}
