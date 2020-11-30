package com.java.ex2;

import java.util.LinkedList;

public class MainClass2 {
	// 20-10/05 - 4 : linkedList
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> queue = new LinkedList<String>();

		System.out.println("queue offer : " + queue.offer("아이언맨"));
		System.out.println("queue offer : " + queue.offer("스파이더맨"));
		System.out.println("queue offer : " + queue.offer("토르"));
		System.out.println("queue offer : " + queue.offer("블랙위도우"));
		System.out.println("queue offer : " + queue.offer("닉퓨리"));
		System.out.println("queue offer : " + queue.offer("헐크"));
		System.out.println("queue offer : " + queue.offer("엔트맨"));
		System.out.println("queue offer : " + queue.offer("블랙팬서"));
		System.out.println("----------------------------------");

		int num = queue.indexOf("블랙위도우");
		if (num != -1) {
			System.out.println("queue에서 블랙위도우의 위치는 : " + num);
		} else
			System.out.println("queue에서 블랙위도우는 없습니다");
		
		System.out.println("----------------------------------");

		while (!queue.isEmpty()) { // 비어있는지
			Object obj = queue.poll();
			System.out.println("queue에서 꺼낸 item : " + obj);
		}
	}

}
