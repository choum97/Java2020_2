package com.java.ex;

public class MainClass {
	// 1019-1-1
	public static void main(String[] args) {
		MakeButton btn = new MakeButton();
		//btn.pack(); //기본 사이즈
		btn.setSize(200,200);
		btn.setVisible(true); //화면에 그리기 , boolen 타입 true로 하면 출력
		
		try {
			Thread.sleep(5000); //임포트 안시켜도 가능 java.long? 최상위 클래스도 여기에 있음 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		btn.setVisible(false);  //버튼 사라짐
		btn.dispose();  //버튼 자원 해제, 자바는 돌아가고 있음
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.exit(0);   //애플리케이션 종료 -> 자바가 종료된 것
		
	}

}
