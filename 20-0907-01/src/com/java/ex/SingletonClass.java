package com.java.ex;

public class SingletonClass {
	// static -> 클래스 변수  / 싱클톤 : DB나 시스템에서 주로 사용
	private static SingletonClass SINGLENTON_CLASS_INSTANEC = new SingletonClass();
	public int i = 10;

	private SingletonClass() {
	}

	public static SingletonClass getSingletonClass() {
		if (SINGLENTON_CLASS_INSTANEC == null) { 
			SINGLENTON_CLASS_INSTANEC = new SingletonClass();
		}
		return SINGLENTON_CLASS_INSTANEC;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}
