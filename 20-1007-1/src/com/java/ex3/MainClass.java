package com.java.ex3;

import java.io.FileInputStream;
import java.io.InputStream;

public class MainClass {
// 10/07 - 3 - 1 : input ��Ʈ�� Ŭ����
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("D:\\out.txt");
			while (true) {
				int i = is.read();  //������ ������ ��
				System.out.println("������ : " + i);
				if (-1 == i)
					break;
			}
		} catch (Exception e) {
			e.getStackTrace();
		} 
	}
}
