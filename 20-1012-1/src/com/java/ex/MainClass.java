package com.java.ex;

public class MainClass {
// 10월 12일 - 1 - 1 : 스레드 클래스 -클래스랑 인터페이스 둘다 있는 이유는 클래스가 다중상속이 안돼서
	public static void main(String[] args) {
		ThreadClassExtends thCE= new ThreadClassExtends();
		thCE.setName("쓰레드 생성"); //부모가 가진 메소드
		thCE.start();
		
		System.out.println("1. " + Thread.currentThread().getName());
		System.out.println("메인 클래스");
	}

}
