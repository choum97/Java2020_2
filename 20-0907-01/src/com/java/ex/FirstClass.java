package com.java.ex;

public class FirstClass {
	public FirstClass() {
		//SingletonClass stc = new SingletonClass(); 프라이빗
		SingletonClass stc = SingletonClass.getSingletonClass();
		System.out.println("FirstClass입니다 ");	
		System.out.println("i = "+stc.getI());		
		stc.setI(900);
		System.out.println("i = "+stc.getI());		
	}
}
