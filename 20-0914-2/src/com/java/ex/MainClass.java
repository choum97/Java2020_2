package com.java.ex;

import java.util.Calendar;

public class MainClass {
	// 0914 02 캘린더 
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // 캘린더 싱글턴 패턴
		int year = cal.get(Calendar.YEAR);  //YEAR보면 클래스 변수란 것을 알 수 있음(Static)
		int month = cal.get(Calendar.MONTH) + 1;// 월은 0부터 시작 ,  그래서 +1시킨 것
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY); // 하루의 시간
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);

		System.out.println("현재 시간!");
		System.out.println(year + "년 " + month + "월 " + day + "일");
		System.out.println(hour + "시 " + min + "분 " + sec + "초");
	}

}
