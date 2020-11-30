package com.java.ex;

public class Student {
	// 20-10/05 - 3 - 1 set
	private String name;
	private int number;

	public Student(String name, int number) {
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() { // toString -> ������Ʈ �޼ҵ�
		return name + " : " + number;
	}
	
	@Override
	public boolean equals(Object obj) { //�տ� �ִ� �������ε� ��������̶� �����ϵ��� ���� ��
		String compareValue = obj.toString(); //����
		String thisValue = toString();
		return thisValue.equals(compareValue); //�� ���� ������ ��
	}
	
	@Override
	public int hashCode() {		//�̸� ���� �ڵ���� ������ ���� ���
		return toString().hashCode();
	}
}
