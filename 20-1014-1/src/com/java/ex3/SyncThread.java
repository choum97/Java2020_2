package com.java.ex3;
// 10�� 14�� - 3 - 1 
public class SyncThread implements Runnable {
	int testNum = 0;

	@Override
	//public synchronized void run() 
	public synchronized void run() {
		for (int i = 0; i < 10; i++) {
			if (Thread.currentThread().getName().equals("ù ��° ������")) {
				System.out.println("--------------------");
				testNum++;
			}else if (Thread.currentThread().getName().equals("�� ��° ������")) {
				System.out.println("********************");
				testNum--;
			}
			
			System.out.println("������ �̸� : " + Thread.currentThread().getName() + " �׽�Ʈ ���� : " + testNum);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
