package com.java.ex3;

public class MainClass {
// 10�� 14�� - 3 - 1 : synchronized - ����ȭ �Ǵ� ��, ���� ���ư��� �������� ��� �۾��� ���� ������ �ٸ� ������� ���
	public static void main(String[] args) {
		SyncThread syncTH0 = new SyncThread();

		Thread th0 = new Thread(syncTH0, "ù ��° ������");
		Thread th1 = new Thread(syncTH0, "�� ��° ������");
		Thread th2 = new Thread(syncTH0, "�� ��° ������");

		th0.start();//������ ���� �� ���� �� 
		th1.start();
		th2.start();


	}
}
