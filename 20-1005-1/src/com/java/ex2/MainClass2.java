package com.java.ex2;

import java.util.LinkedList;

public class MainClass2 {
	// 20-10/05 - 4 : linkedList
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> queue = new LinkedList<String>();

		System.out.println("queue offer : " + queue.offer("���̾��"));
		System.out.println("queue offer : " + queue.offer("�����̴���"));
		System.out.println("queue offer : " + queue.offer("�丣"));
		System.out.println("queue offer : " + queue.offer("��������"));
		System.out.println("queue offer : " + queue.offer("��ǻ��"));
		System.out.println("queue offer : " + queue.offer("��ũ"));
		System.out.println("queue offer : " + queue.offer("��Ʈ��"));
		System.out.println("queue offer : " + queue.offer("���Ҽ�"));
		System.out.println("----------------------------------");

		int num = queue.indexOf("��������");
		if (num != -1) {
			System.out.println("queue���� ���������� ��ġ�� : " + num);
		} else
			System.out.println("queue���� ��������� �����ϴ�");
		
		System.out.println("----------------------------------");

		while (!queue.isEmpty()) { // ����ִ���
			Object obj = queue.poll();
			System.out.println("queue���� ���� item : " + obj);
		}
	}

}
