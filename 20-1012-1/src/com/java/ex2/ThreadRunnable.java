package com.java.ex2;
// 10월 12일 - 2 - 1 
public class ThreadRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("2. "+Thread.currentThread().getName());
		System.out.println("Runnable Thread Test");

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);// 0.5초 정지
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		}
	}
}
