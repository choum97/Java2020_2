package com.java.ex;

public class MainClass {
// 10�� 12�� - 1 - 1 : ������ Ŭ���� -Ŭ������ �������̽� �Ѵ� �ִ� ������ Ŭ������ ���߻���� �ȵż�
	public static void main(String[] args) {
		ThreadClassExtends thCE= new ThreadClassExtends();
		thCE.setName("������ ����"); //�θ� ���� �޼ҵ�
		thCE.start();
		
		System.out.println("1. " + Thread.currentThread().getName());
		System.out.println("���� Ŭ����");
	}

}
