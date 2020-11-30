package com.java.ex;

import java.util.Scanner;

public class MainClass {
	// 0916 - 1 스캐너클래스
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // System.in ->클래스, in 객체변수

		System.out.print("학번 -> ");
		// String st1 = sc.nextLine(); // Line은 엔터가 들어갈 떄까지를 문자열로 처리, 엔터단위
		String st1 = sc.next();

		System.out.print("이름 -> ");
		String st2 = sc.next(); // 스페이스 단위로

		System.out.print("나이 -> ");
		int age = sc.nextInt(); // 정수로 받을 때, float double 따로 있음

		System.out.println("< 입력 받은 내용 >");
		System.out.println("학번 : " + st1);
		System.out.println("이름 : " + st2);
		System.out.println("나이 : " + age);
		System.out.println("끝");
	}

}
