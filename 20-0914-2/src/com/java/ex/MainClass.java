package com.java.ex;

import java.util.Calendar;

public class MainClass {
	// 0914 02 Ķ���� 
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // Ķ���� �̱��� ����
		int year = cal.get(Calendar.YEAR);  //YEAR���� Ŭ���� ������ ���� �� �� ����(Static)
		int month = cal.get(Calendar.MONTH) + 1;// ���� 0���� ���� ,  �׷��� +1��Ų ��
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY); // �Ϸ��� �ð�
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);

		System.out.println("���� �ð�!");
		System.out.println(year + "�� " + month + "�� " + day + "��");
		System.out.println(hour + "�� " + min + "�� " + sec + "��");
	}

}
