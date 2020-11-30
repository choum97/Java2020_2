package com.java.ex4;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {
// 10/07 - 4 - 1 : 카피
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream("D:\\song.txt"); //읽어서
			os = new FileOutputStream("D:\\copy.txt"); //카피해서 내보내는 것

			byte[] bs = new byte[5]; // 5씩 끊어서 받는것

			while (true) {
				int count = is.read(bs);
				if (-1 == count)
					break;
				os.write(bs, 0, count); // 0부터 count 까지
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
