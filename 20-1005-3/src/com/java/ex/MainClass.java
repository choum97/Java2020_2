package com.java.ex;

import java.util.HashSet;

public class MainClass {
	// 20-10/05 - 3 - 1 : set
	public static void main(String[] args) {
		HashSet<Student> hSet = new HashSet<Student>();
		hSet.add(new Student("�����", 1));
		hSet.add(new Student("�����", 4));
		hSet.add(new Student("�����", 3));
		hSet.add(new Student("������", 5));
		
		System.out.println(hSet.toString());

		
		Student st = new Student("�����", 3);
		//�������� => ���� �Ȱ��� ������, ������ ���� ���� ������ ����
		hSet.remove(st);	// hSet���� ���쳪 �����̱⿡ �ǹ̾���
		System.out.println(hSet.toString());
	}

}
