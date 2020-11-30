package com.java.ex3;

import java.io.FileInputStream;
import java.io.InputStream;

public class MainClass {
// 10/07 - 3 - 1 : input 스트림 클래스
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("D:\\out.txt");
			while (true) {
				int i = is.read();  //데이터 들어오는 것
				System.out.println("데이터 : " + i);
				if (-1 == i)
					break;
			}
		} catch (Exception e) {
			e.getStackTrace();
		} 
	}
}
