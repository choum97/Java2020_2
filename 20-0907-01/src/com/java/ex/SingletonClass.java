package com.java.ex;

public class SingletonClass {
	// static -> Ŭ���� ����  / ��Ŭ�� : DB�� �ý��ۿ��� �ַ� ���
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
