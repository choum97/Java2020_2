package com.java.ex;

import java.util.StringTokenizer;

public class MainClass {
	// 0916 - 3 StringTokenizerŬ����
	public static void main(String[] args) {
		String str1 = "�� ��ü �������� �ִ� �ž� ���� ���� ���� �� �տ� ���ִµ�~";
		String str2 = "2021/07/28";
		String str3 = "23:59:59";

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		StringTokenizer st1 = new StringTokenizer(str1); // ������ ���鸶�� ©��
		StringTokenizer st2 = new StringTokenizer(str2, "/"); // delim : �Ӹ� �������� �ڸ�����
		StringTokenizer st3 = new StringTokenizer(str3, ":");

		System.out.println("ù ��° ������ ���ڿ� �� : " + st1.countTokens()); // ���� �ִ°ſ� �ִ� �޼ҵ�
		System.out.println("�� ��° ������ ���ڿ� �� : " + st2.countTokens());
		System.out.println("�� ��° ������ ���ڿ� �� : " + st3.countTokens());

		// has, isƯ¡ : ���� Ÿ��(���)�� boolean������ ������ Ÿ��(yes/no)
		while (st1.hasMoreElements()) { // ����? : eof�� ������ Elements�����ϱ� ���, �ڷᱸ��
			System.out.print(st1.nextToken()); // ������ ��������
			System.out.print("   ");
		}
		System.out.println("");
		while (st2.hasMoreElements()) {
			System.out.print(st2.nextToken());
			System.out.print("  ");
		}
		System.out.println("");
		while (st3.hasMoreElements()) {
			System.out.print(st3.nextToken());
			System.out.print("  ");
		}

	}

}
