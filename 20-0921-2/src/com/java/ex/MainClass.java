package com.java.ex;

public class MainClass {
// 0921 - 2 : 예외처리
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		try {   //에러 발생 가능한 문장들 
			System.out.println("1 실행이 되나?"); 
			System.out.println(i/j); 
			System.out.println("2 실행이 되나?");  //실행 x, 에러생겨서 캐치로 감
		} catch(Exception e) {//에러 생기면 처리 , 최상위 
			System.out.println(e.getMessage()); 
			System.out.println("에러발생시 처리 1"); 
			System.out.println("에러발생시 처리 2"); //위에 에러 없으면 전부 실행 X
			System.out.println("에러발생시 처리 3"); 
		} finally { //에러가 나오든 말던 항살 실행
			System.out.println("무조건 실행 1"); 
			System.out.println("무조건 실행 2"); 
			System.out.println("무조건 실행 3"); 
		}
		
	}
}
