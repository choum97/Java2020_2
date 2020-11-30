package com.java.ex;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		int[] bBall = new int[3];
		int[] bUser = new int[3];
		int stk = 0, ball = 0, out = 0;

		// 랜덤으로 숫자 3개 만들기
		bBall[0] = rd.nextInt(10); // 0~9까지
		while (bBall[0] == bBall[1]) {
			bBall[1] = rd.nextInt(10);
		}
		while (bBall[2] == bBall[1] || bBall[2] == bBall[0]) {
			bBall[2] = rd.nextInt(10);
		}

		System.out.println(" 야구게임 정답 : " + Arrays.toString(bBall));

		while (stk < 3) {
			System.out.print("  번호 : ");
			bUser[0] = sc.nextInt();
			bUser[1] = sc.nextInt();
			bUser[2] = sc.nextInt();

			// 스트라이크 볼 계산
			if (bBall[0] == bUser[0]) {
				stk++;
			} else if (bBall[0] == bUser[1]) {
				ball++;
			} else if (bBall[0] == bUser[2]) {
				ball++;
			}

			if (bBall[1] == bUser[1]) {
				stk++;
			} else if (bBall[1] == bUser[0]) {
				ball++;
			} else if (bBall[1] == bUser[2]) {
				ball++;
			}

			if (bBall[2] == bUser[2]) {
				stk++;
			} else if (bBall[2] == bUser[1]) {
				ball++;
			} else if (bBall[2] == bUser[0]) {
				ball++;
			}

			// 정답 판단
			if (stk > 2) {
				stk = 4;
				System.out.println("정답 게임종료");
			} else if (stk == 0 && ball == 0) {
				out++;
				System.out.println(out + "아웃");
				if (out == 3) {
					System.out.println("삼진 게임종료");
					stk = 4; // 4주고 게임종료
				}
			} else {
				System.out.println(stk + "스트라이크 , " + ball + "볼");
				stk = 0;
				ball = 0;
			}
		}

	}
}
