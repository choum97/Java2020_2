package com.java.ex2;

import java.util.Stack;

public class MainClass {
	// 20-10/05 - 3 : 스택
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st = new Stack<String>();

		System.out.println("Stack push : " + st.push("아이언맨"));
		System.out.println("Stack push : " + st.push("스파이더맨"));
		System.out.println("Stack push : " + st.push("토르"));
		System.out.println("Stack push : " + st.push("블랙위도우"));
		System.out.println("Stack push : " + st.push("닉퓨리"));
		System.out.println("Stack push : " + st.push("헐크"));
		System.out.println("Stack push : " + st.push("엔트맨"));
		System.out.println("Stack push : " + st.push("블랙팬서"));
		System.out.println("----------------------------------");

		int num = st.search("닉퓨리"); // 검색
		if (num != -1) {
			System.out.println("stack에서 닉퓨리의 위치는 : " + (num + 1));
			System.out.println("stack에서 닉퓨리의 인덱스는 : " + num);
		} else
			System.out.println("stack에서 닉퓨리는 없습니다");
		System.out.println("----------------------------------");

		while (!st.empty()) { // 비어있는지
			Object obj = st.pop();
			// String str= st.pop(); //가능
			System.out.println("stack에서 꺼낸 item : " + obj);
		}
	}

}
