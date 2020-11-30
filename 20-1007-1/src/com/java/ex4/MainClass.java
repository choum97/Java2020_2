package com.java.ex4;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {
// 10/07 - 4 - 1 : ī��
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream("D:\\song.txt"); //�о
			os = new FileOutputStream("D:\\copy.txt"); //ī���ؼ� �������� ��

			byte[] bs = new byte[5]; // 5�� ��� �޴°�

			while (true) {
				int count = is.read(bs);
				if (-1 == count)
					break;
				os.write(bs, 0, count); // 0���� count ����
			}
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
					os.close();
				} catch (Exception e2) {
					e2.getStackTrace();
				}
			}
			if (os != null) {
				try {
					os.close();
				} catch (Exception e2) {
					e2.getStackTrace();
				}
			}
		}
	}
}
