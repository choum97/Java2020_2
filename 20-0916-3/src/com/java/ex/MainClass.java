package com.java.ex;

import java.util.StringTokenizer;

public class MainClass {
	// 0916 - 3 StringTokenizer클래스
	public static void main(String[] args) {
		String str1 = "넌 대체 누굴보고 있는 거야 내가 지금 여기 눈 앞에 서있는데~";
		String str2 = "2021/07/28";
		String str3 = "23:59:59";

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		StringTokenizer st1 = new StringTokenizer(str1); // 생략은 공백마다 짤림
		StringTokenizer st2 = new StringTokenizer(str2, "/"); // delim : 머를 기준으로 자를껀지
		StringTokenizer st3 = new StringTokenizer(str3, ":");

		System.out.println("첫 번째 문장의 문자열 수 : " + st1.countTokens()); // 위에 있는거에 있는 메소드
		System.out.println("두 번째 문장의 문자열 수 : " + st2.countTokens());
		System.out.println("세 번째 문장의 문자열 수 : " + st3.countTokens());

		// has, is특징 : 리턴 타입(결과)이 boolean형태의 데이터 타입(yes/no)
		while (st1.hasMoreElements()) { // 원리? : eof를 만나면 Elements없으니까 벗어남, 자료구조
			System.out.print(st1.nextToken()); // 포인터 다음으로
			System.out.print("   ");
		}
		System.out.println("");
		while (st2.hasMoreElements()) {
			System.out.print(st2.nextToken());
			System.out.print("  ");
		}
		System.out.println("");
		while (st3.hasMoreElements()) {
			System.out.print(st3.nextToken());
			System.out.print("  ");
		}

	}

}
