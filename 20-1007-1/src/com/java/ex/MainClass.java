package com.java.ex;

import java.io.File;

public class MainClass {
// 10/07 - 1 - 1 : 파일 클래스
	public static void main(String[] args) {
		String dir = "C:/Windows";
		File f1 = new File(dir);
		if (f1.isDirectory()) { // 디렉토리인지
			System.out.println("탐색 디렉토리 이름 : " + dir);
			System.out.println("---------------------------");
			String[] list = f1.list(); // 윈도우에 있는 이름들 담는 곳
			for (int i = 0; i < list.length; i++) {
				File f2 = new File(dir + "/" + list[i]); // 상대적경로
				if (f2.isDirectory())
					System.out.println(list[i] + "--> 나는 디렉토리야");
				else
					System.out.println(list[i] + "--> 난 파일이고");
			}
		} else {
			System.out.println("선택한 " + dir + "은 디렉토리가 아니어서 파일을 확인할 수 없습니다!");
		}
		System.out.println("");
		System.out.println("---------------------------");
		System.out.println("");

		//  파일 관련된 메소드들
		File f3 = new File("D:/test.txt");
		System.out.println("파일 이름 : " + f3.getName()); // 파일의 이름을 가져오기
		System.out.println("파일 경로 : " + f3.getPath());
		System.out.println("파일 절대 경로 : " + f3.getPath());		//절대경로 - 위에있는거까지 다 나옴
		System.out.println(f3.exists() ? "존재합니다." : "없어요"); // 존재여부
		System.out.println(f3.canWrite() ? "파일을 고칠 수 있어요." : "없어요");
		System.out.println(f3.canRead() ? "파일을 읽을 수 있어요." : "없어요");
		System.out.println(f3.isDirectory() ? "디랙토리!!" : "디랙토리가 아니래!");
		System.out.println(f3.isFile() ? "파일이야" : "파일이 아니래!!");
		System.out.println("1970.01.01기준으로 밀리초 단위로 최종 수정시간 : " + f3.lastModified());
		System.out.println("파일크기 : " + f3.length() + "bytes");
	}

}
