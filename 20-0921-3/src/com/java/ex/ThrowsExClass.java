package com.java.ex;

public class ThrowsExClass {
	public ThrowsExClass() {
		actionC();
	}
	
	private void actionA() throws Exception { //에러를 던지는 것 , 처리하는 것 아님
		System.out.println("actionA 메서드 입니다.");
		
		int[] iArr= {1,2,3,4};
		System.out.println(iArr[4]);  //에러나서 던짐
		
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");  //에러나서 실행 안됨
	}

	private void actionB() {  				// 예외 처리
		System.out.println("actionB 메서드 입니다");
		try {						
			actionA();
		}catch (Exception e) {
			System.out.println("예외 발생시 여기서 처리합니다");
			System.out.println(e.getMessage());
		}
		
		System.out.println("bbbbbbbbbbbbbbbbbb");
	}
	
	private void actionC() {
		System.out.println("actionC 메서드 입니다");
		 actionB();
		 System.out.println("ccccccccccccccccccc");
	}
}
