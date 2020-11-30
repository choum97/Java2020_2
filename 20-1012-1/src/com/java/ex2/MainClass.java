package com.java.ex2;

public class MainClass {
// 10월 12일 - 2 - 1 : 스레드 인터페이스
	public static void main(String[] args) {
		ThreadRunnable thRun = new ThreadRunnable();
		Thread th = new Thread(thRun, "쓰레드 생성"); //여기가 차이점  인터페이스는 만들어야함
		th.start();

		System.out.println("1. " + Thread.currentThread().getName());
		System.out.println("메인 클래스");
	}

}
