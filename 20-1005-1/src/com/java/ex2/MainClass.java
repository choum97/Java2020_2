package com.java.ex2;

import java.util.Stack;

public class MainClass {
	// 20-10/05 - 3 : ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st = new Stack<String>();

		System.out.println("Stack push : " + st.push("���̾��"));
		System.out.println("Stack push : " + st.push("�����̴���"));
		System.out.println("Stack push : " + st.push("�丣"));
		System.out.println("Stack push : " + st.push("��������"));
		System.out.println("Stack push : " + st.push("��ǻ��"));
		System.out.println("Stack push : " + st.push("��ũ"));
		System.out.println("Stack push : " + st.push("��Ʈ��"));
		System.out.println("Stack push : " + st.push("���Ҽ�"));
		System.out.println("----------------------------------");

		int num = st.search("��ǻ��"); // �˻�
		if (num != -1) {
			System.out.println("stack���� ��ǻ���� ��ġ�� : " + (num + 1));
			System.out.println("stack���� ��ǻ���� �ε����� : " + num);
		} else
			System.out.println("stack���� ��ǻ���� �����ϴ�");
		System.out.println("----------------------------------");

		while (!st.empty()) { // ����ִ���
			Object obj = st.pop();
			// String str= st.pop(); //����
			System.out.println("stack���� ���� item : " + obj);
		}
	}

}
