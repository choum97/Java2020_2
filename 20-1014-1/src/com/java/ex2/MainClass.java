package com.java.ex2;

public class MainClass {
// 10월 14일 - 2 - 1 : 스레드 예제 투표율
	public static void main(String[] args) {
		VoteThread voteTH0 = new VoteThread();
		VoteThread voteTH1 = new VoteThread();
		VoteThread voteTH2 = new VoteThread();
		Thread th0 = new Thread(voteTH0, "제1 선거구");
		Thread th1 = new Thread(voteTH1, "제2 선거구");
		Thread th2 = new Thread(voteTH2, "제3 선거구");
		th0.start();
		th1.start();
		th2.start();

	}
}
