package com.java.ex;

public class MainClass {
	// 0914 03 성능측정 프로그램
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());// 현재시간 밀리단위로
		System.out.println("----------------------");

		System.out.println(" < String tset > ");
		String str = "A";
		long startNum1 = System.currentTimeMillis();

		for (int i = 0; i < 99999; i++) {
			str = str + "A";
		}
		long endNum1 = System.currentTimeMillis();
		System.out.println("String str의 경과 시간 : " + (endNum1 - startNum1));// 끝과 시작 계산해서 걸리는 시간 계산

		////////////////////////////////////////////////////
		System.out.println(" < StringBuilder tset > ");
		StringBuilder sb = new StringBuilder(); // 빌더로 메모리 문제 해결하면 , 속도차이 많이 남
		long startNum2 = System.currentTimeMillis();

		for (int i = 0; i < 99999; i++) {
			// sb = sb + "A";//클래스라 +가 안됨
			sb = sb.append("A"); // 메소드 사용해야함
		}

		long endNum2 = System.currentTimeMillis();
		System.out.println("String SB의 경과 시간 : " + (endNum2 - startNum2));
	}

}
