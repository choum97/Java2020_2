package com.java.ex;

public class SecondClass {
	public SecondClass() {
		SingletonClass stc = SingletonClass.getSingletonClass();
		System.out.println("SecondClass�Դϴ� ");	
		System.out.println("i = "+stc.getI());	
	}
}
