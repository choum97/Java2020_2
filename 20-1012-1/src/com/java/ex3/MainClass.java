package com.java.ex3;

public class MainClass {
// 10월 12일 - 3 - 1 : 객체 하나를 n개의 스레드가 공유하는
	public static void main(String[] args) {
		TestThread testTH = new TestThread();
		Thread th0 = new Thread(testTH, "첫 번째 쓰레드");
		Thread th1 = new Thread(testTH, "두 번째 쓰레드");
		th0.start();
		th1.start();

		System.out.println("1. " + Thread.currentThread().getName());
		System.out.println("메인 클래스");
	}

}
