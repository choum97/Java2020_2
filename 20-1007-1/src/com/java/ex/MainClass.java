package com.java.ex;

import java.io.File;

public class MainClass {
// 10/07 - 1 - 1 : ���� Ŭ����
	public static void main(String[] args) {
		String dir = "C:/Windows";
		File f1 = new File(dir);
		if (f1.isDirectory()) { // ���丮����
			System.out.println("Ž�� ���丮 �̸� : " + dir);
			System.out.println("---------------------------");
			String[] list = f1.list(); // �����쿡 �ִ� �̸��� ��� ��
			for (int i = 0; i < list.length; i++) {
				File f2 = new File(dir + "/" + list[i]); // ��������
				if (f2.isDirectory())
					System.out.println(list[i] + "--> ���� ���丮��");
				else
					System.out.println(list[i] + "--> �� �����̰�");
			}
		} else {
			System.out.println("������ " + dir + "�� ���丮�� �ƴϾ ������ Ȯ���� �� �����ϴ�!");
		}
		System.out.println("");
		System.out.println("---------------------------");
		System.out.println("");

		//  ���� ���õ� �޼ҵ��
		File f3 = new File("D:/test.txt");
		System.out.println("���� �̸� : " + f3.getName()); // ������ �̸��� ��������
		System.out.println("���� ��� : " + f3.getPath());
		System.out.println("���� ���� ��� : " + f3.getPath());		//������ - �����ִ°ű��� �� ����
		System.out.println(f3.exists() ? "�����մϴ�." : "�����"); // ���翩��
		System.out.println(f3.canWrite() ? "������ ��ĥ �� �־��." : "�����");
		System.out.println(f3.canRead() ? "������ ���� �� �־��." : "�����");
		System.out.println(f3.isDirectory() ? "���丮!!" : "���丮�� �ƴϷ�!");
		System.out.println(f3.isFile() ? "�����̾�" : "������ �ƴϷ�!!");
		System.out.println("1970.01.01�������� �и��� ������ ���� �����ð� : " + f3.lastModified());
		System.out.println("����ũ�� : " + f3.length() + "bytes");
	}

}
