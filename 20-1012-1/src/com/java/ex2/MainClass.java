package com.java.ex2;

public class MainClass {
// 10�� 12�� - 2 - 1 : ������ �������̽�
	public static void main(String[] args) {
		ThreadRunnable thRun = new ThreadRunnable();
		Thread th = new Thread(thRun, "������ ����"); //���Ⱑ ������  �������̽��� ��������
		th.start();

		System.out.println("1. " + Thread.currentThread().getName());
		System.out.println("���� Ŭ����");
	}

}
