package com.java.ex;

public class MainClass {
// 0921 - 2 : ����ó��
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		try {   //���� �߻� ������ ����� 
			System.out.println("1 ������ �ǳ�?"); 
			System.out.println(i/j); 
			System.out.println("2 ������ �ǳ�?");  //���� x, �������ܼ� ĳġ�� ��
		} catch(Exception e) {//���� ����� ó�� , �ֻ��� 
			System.out.println(e.getMessage()); 
			System.out.println("�����߻��� ó�� 1"); 
			System.out.println("�����߻��� ó�� 2"); //���� ���� ������ ���� ���� X
			System.out.println("�����߻��� ó�� 3"); 
		} finally { //������ ������ ���� �׻� ����
			System.out.println("������ ���� 1"); 
			System.out.println("������ ���� 2"); 
			System.out.println("������ ���� 3"); 
		}
		
	}
}
