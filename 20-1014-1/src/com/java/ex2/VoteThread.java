package com.java.ex2;

import java.util.Random;

// 10�� 14�� - 2 - 1 
public class VoteThread implements Runnable {
	int target = 100;
	int sum = 0;
	Random rd = new Random();

	@Override
	public void run() {
		StringBuffer sb = new StringBuffer();

		while (true) {
			sum = sum + rd.nextInt(7);
			sb.delete(0, sb.toString().length());//������ �� ����

			if (sum >= target) {
				sum = 100;
				for (int i = 1; i < sum; i++) {
					sb.append('��');
				}
				System.out.println(Thread.currentThread().getName() + "��ǥ�� : " + sum + "%\t:" + sb +"\t"+Thread.currentThread().getName()+"  1�� : �����");
				break;
			} else {
				for (int i = 0; i < sum; i++) {
					sb.append('��');
				}
				System.out.println(Thread.currentThread().getName() + "��ǥ�� : " + sum + "%\t:" + sb);
			}
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}
}
