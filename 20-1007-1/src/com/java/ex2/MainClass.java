package com.java.ex2;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class MainClass {
// 10/07 - 2 - 1 : output��Ʈ�� Ŭ����
	public static void main(String[] args) {
		try {
			// OutputStream�� �߻�޼ҵ� ���� �ִ� ��
			OutputStream os = new FileOutputStream("D:\\out.txt"); // ���� ��1 = new ������() ��� ������
			String str = "you raise me up, so I can stand on mountains "; //D�� �����
			byte[] bs = str.getBytes();
			os.write(bs);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
