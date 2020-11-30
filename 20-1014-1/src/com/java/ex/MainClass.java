package com.java.ex;

public class MainClass {
// 10월 14일 - 1 - 1
	public static void main(String[] args) {
		TestThread testTH0 = new TestThread();
		TestThread testTH1 = new TestThread();
		Thread th0 = new Thread(testTH0, "첫 번째 쓰레드");
		Thread th1 = new Thread(testTH1, "두 번째 쓰레드");
		th0.start();
		th1.start();

		System.out.println("1. " + Thread.currentThread().getName());
		System.out.println("메인 클래스");
	}

}
