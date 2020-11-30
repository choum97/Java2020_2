package com.java.ex3;
// 10월 14일 - 3 - 1 
public class SyncThread implements Runnable {
	int testNum = 0;

	@Override
	//public synchronized void run() 
	public synchronized void run() {
		for (int i = 0; i < 10; i++) {
			if (Thread.currentThread().getName().equals("첫 번째 쓰레드")) {
				System.out.println("--------------------");
				testNum++;
			}else if (Thread.currentThread().getName().equals("세 번째 쓰레드")) {
				System.out.println("********************");
				testNum--;
			}
			
			System.out.println("쓰레드 이름 : " + Thread.currentThread().getName() + " 테스트 숫자 : " + testNum);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
