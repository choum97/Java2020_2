package com.java.ex3;

public class MainClass {
// 10�� 12�� - 3 - 1 : ��ü �ϳ��� n���� �����尡 �����ϴ�
	public static void main(String[] args) {
		TestThread testTH = new TestThread();
		Thread th0 = new Thread(testTH, "ù ��° ������");
		Thread th1 = new Thread(testTH, "�� ��° ������");
		th0.start();
		th1.start();

		System.out.println("1. " + Thread.currentThread().getName());
		System.out.println("���� Ŭ����");
	}

}
