package com.java.ex;

public class MainClass {
// 10�� 14�� - 1 - 1
	public static void main(String[] args) {
		TestThread testTH0 = new TestThread();
		TestThread testTH1 = new TestThread();
		Thread th0 = new Thread(testTH0, "ù ��° ������");
		Thread th1 = new Thread(testTH1, "�� ��° ������");
		th0.start();
		th1.start();

		System.out.println("1. " + Thread.currentThread().getName());
		System.out.println("���� Ŭ����");
	}

}
