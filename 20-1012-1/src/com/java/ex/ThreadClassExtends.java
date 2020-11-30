package com.java.ex;
// 10월 12일 - 1 - 1 
public class ThreadClassExtends extends Thread {
	@Override
	public void run() { // 현재 돌아가고 있는 스레드 이름, 스태틱으로 정의,current- 최신의
		System.out.println("2. "+Thread.currentThread().getName()); //스레드의 특징 때문에 순서는 예측 불가
		System.out.println("쓰레드 클래스 상속 쓰레드");

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);// 0.5초 정지
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} // 외부 파일 사용할때 try catch를 사용
		}
	}
}
