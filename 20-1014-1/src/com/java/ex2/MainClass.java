package com.java.ex2;

public class MainClass {
// 10�� 14�� - 2 - 1 : ������ ���� ��ǥ��
	public static void main(String[] args) {
		VoteThread voteTH0 = new VoteThread();
		VoteThread voteTH1 = new VoteThread();
		VoteThread voteTH2 = new VoteThread();
		Thread th0 = new Thread(voteTH0, "��1 ���ű�");
		Thread th1 = new Thread(voteTH1, "��2 ���ű�");
		Thread th2 = new Thread(voteTH2, "��3 ���ű�");
		th0.start();
		th1.start();
		th2.start();

	}
}
