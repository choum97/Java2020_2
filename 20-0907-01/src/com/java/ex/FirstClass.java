package com.java.ex;

public class FirstClass {
	public FirstClass() {
		//SingletonClass stc = new SingletonClass(); �����̺�
		SingletonClass stc = SingletonClass.getSingletonClass();
		System.out.println("FirstClass�Դϴ� ");	
		System.out.println("i = "+stc.getI());		
		stc.setI(900);
		System.out.println("i = "+stc.getI());		
	}
}
