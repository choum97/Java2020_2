package com.java.ex2;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class MainClass {
// 10/07 - 2 - 1 : output스트림 클래스
	public static void main(String[] args) {
		try {
			// OutputStream가 추상메소드 갖고 있는 것
			OutputStream os = new FileOutputStream("D:\\out.txt"); // 동물 동1 = new 강아지() 라는 생성자
			String str = "you raise me up, so I can stand on mountains "; //D에 저장됨
			byte[] bs = str.getBytes();
			os.write(bs);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
