package com.java.ex;

public class MainClass {
	// 0914 01 String , Builder
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1 = " i am yohan kim. "; // 클래스지만 기본 데이터 타입처럼 사용 가능 -> Sting만
		String st2 = "I WANT SOMETHING JUST LIKE THIS!";

		System.out.println(st1.concat(st2));
		System.out.println(st1.substring(3));// 부터 출력
		System.out.println(st1.length());
		System.out.println(st1.toUpperCase()); // 대문자
		System.out.println(st2.toLowerCase());// 소문자
		System.out.println(st1.charAt(3));
		System.out.println(st1.indexOf('k'));

		String st3 = "i hate mint chocolate";

		System.out.println(st1.equals(st3));
		System.out.println(st1.trim()); // 끝에 공백제거
		System.out.println(st1.replace(" ", "")); // 문자열, 이용 공백제거
		System.out.println(st1.replace('.', '!'));
		System.out.println(st3.replaceAll("i hate", "you love"));
		System.out.println(st3);

		// 빌더 : String 메모리 문제점 보완한 것 
		StringBuilder sb = new StringBuilder("I AM A KING OF THE WORLD!");// 생성자 써야 가능
		sb.append(" really");
		System.out.println(sb);
		sb.insert(2, ", yohan kim, ");
		System.out.println(sb);
		sb.delete(7, 15);
		System.out.println(sb);
		sb.deleteCharAt(13);
		System.out.println(sb);

	}

}
