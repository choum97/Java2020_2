package com.java.ex3;

// 10�� 12�� - 3 - 1 
public class TestThread implements Runnable {

	int testNum = 0;

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			if (Thread.currentThread().getName().equals("ù ��° ������")) {
				System.out.println("--------------------");
				testNum++;
			}
			System.out.println("������ �̸� : " + Thread.currentThread().getName() + "�׽�Ʈ ���� : " + testNum);
			try {
				Thread.sleep(500);// 0.5�� ����
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
