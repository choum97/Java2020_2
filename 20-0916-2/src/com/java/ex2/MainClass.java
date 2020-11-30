package com.java.ex2;

public class MainClass {
	// 0916 - 2 : Wrapper 클래스 - 8개의 기본데이터 타입을 클래스 형태로 객체화 시킴(메소드 사용가능)
	public static void main(String[] args) {
		int num1 = 20;
		Integer num2 = new Integer(30);
		double div = num1 / num2.doubleValue();

		System.out.println("값 : " + div);
		System.out.println("두 수가 같은가? " + num2.equals(num1)); // 클래스이기에 메소드 사용 가능, 원래는 ==

		String str = "456";
		int num3 = Integer.parseInt(str); // int형태로 해석해주세요 의미, 메소드임
		System.out.println(num3 + 111);
	}

}
