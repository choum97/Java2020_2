package com.java.ex3;

public class MainClass {
// 10월 14일 - 3 - 1 : synchronized - 동기화 되는 것, 먼저 돌아가능 스레드의 모든 작업이 끝날 때까지 다른 쓰레드는 대기
	public static void main(String[] args) {
		SyncThread syncTH0 = new SyncThread();

		Thread th0 = new Thread(syncTH0, "첫 번째 쓰레드");
		Thread th1 = new Thread(syncTH0, "두 번째 쓰레드");
		Thread th2 = new Thread(syncTH0, "세 번째 쓰레드");

		th0.start();//무엇이 먼저 들어갈 지는 모름 
		th1.start();
		th2.start();


	}
}
