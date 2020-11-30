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
	public String toString() { // toString -> 오브젝트 메소드
		return name + " : " + number;
	}
	
	@Override
	public boolean equals(Object obj) { //앞에 있는 동명이인도 같은사람이라 인지하도록 만든 것
		String compareValue = obj.toString(); //내꺼
		String thisValue = toString();
		return thisValue.equals(compareValue); //비교 대상과 내꺼를 비교
	}
	
	@Override
	public int hashCode() {		//이름 같고 코드까지 같으면 같은 사람
		return toString().hashCode();
	}
}
