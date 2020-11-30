package com.java.baseball;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BaseBall {
	int[] comNum = new int[3];
	int[] youNum = new int[3];
	int stk = 0;
	int ball = 0;
	int temp = 0;
	int count = 0;
	Random rd = new Random();

	// 랜덤생성
	public void init() {
		for (int i = 0; i < comNum.length; i++) {
			temp = rd.nextInt(10);
			comNum[i] = temp;
			for (int j = 0; j < i; j++)
				if (comNum[i] == comNum[j])
					i--;
		}
		System.out.println(Arrays.toString(comNum));
	}

	// 입력
	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 구분은 스페이스를 이용하여 0~9까지의 숫자를 세 개 입력(중복X) : ");
		for (int i = 0; i < youNum.length; i++) {
			youNum[i] = sc.nextInt();
		}

		for (int i = 0; i < youNum.length; i++) {
			boolean flag = false;

			for (int j = 0; j < i; j++) {
				if (youNum[i] == youNum[j]) {
					System.out.println("숫자 중복입력 발생");
					flag = true;
					break;
				}
			}
			if (true == flag)
				break;
		}
	}

	public boolean compare() {
		for (int i = 0; i < comNum.length; i++) {
			if (comNum[i] == youNum[i]) {
				stk++;
			} // 스트라이크 카운트
			for (int j = 0; j < comNum.length; j++) { // 볼 카운트
				if (i == j)
					continue;
				else if (comNum[i] == comNum[j])
					ball++;
			}
		}

		if (3 == stk) {
			System.out.println(count + "번째 타석에서 홈런!!");
			return false;
		} else {
			System.out.println(++count + "번째 타석 : " + stk + "S, " + ball + "B");
			return true;
		}

	}

}
