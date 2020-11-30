package com.java.ex2;

import java.util.Random;

// 10월 14일 - 2 - 1 
public class VoteThread implements Runnable {
	int target = 100;
	int sum = 0;
	Random rd = new Random();

	@Override
	public void run() {
		StringBuffer sb = new StringBuffer();

		while (true) {
			sum = sum + rd.nextInt(7);
			sb.delete(0, sb.toString().length());//끝까지 다 지움

			if (sum >= target) {
				sum = 100;
				for (int i = 1; i < sum; i++) {
					sb.append('ㅁ');
				}
				System.out.println(Thread.currentThread().getName() + "개표율 : " + sum + "%\t:" + sb +"\t"+Thread.currentThread().getName()+"  1위 : 김요한");
				break;
			} else {
				for (int i = 0; i < sum; i++) {
					sb.append('ㅁ');
				}
				System.out.println(Thread.currentThread().getName() + "개표율 : " + sum + "%\t:" + sb);
			}
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}
}
