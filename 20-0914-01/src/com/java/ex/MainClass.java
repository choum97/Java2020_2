package com.java.ex;

public class MainClass {
	// 0914 01 String , Builder
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1 = " i am yohan kim. "; // Ŭ�������� �⺻ ������ Ÿ��ó�� ��� ���� -> Sting��
		String st2 = "I WANT SOMETHING JUST LIKE THIS!";

		System.out.println(st1.concat(st2));
		System.out.println(st1.substring(3));// ���� ���
		System.out.println(st1.length());
		System.out.println(st1.toUpperCase()); // �빮��
		System.out.println(st2.toLowerCase());// �ҹ���
		System.out.println(st1.charAt(3));
		System.out.println(st1.indexOf('k'));

		String st3 = "i hate mint chocolate";

		System.out.println(st1.equals(st3));
		System.out.println(st1.trim()); // ���� ��������
		System.out.println(st1.replace(" ", "")); // ���ڿ�, �̿� ��������
		System.out.println(st1.replace('.', '!'));
		System.out.println(st3.replaceAll("i hate", "you love"));
		System.out.println(st3);

		// ���� : String �޸� ������ ������ �� 
		StringBuilder sb = new StringBuilder("I AM A KING OF THE WORLD!");// ������ ��� ����
		sb.append(" really");
		System.out.println(sb);
		sb.insert(2, ", yohan kim, ");
		System.out.println(sb);
		sb.delete(7, 15);
		System.out.println(sb);
		sb.deleteCharAt(13);
		System.out.println(sb);

	}

}
