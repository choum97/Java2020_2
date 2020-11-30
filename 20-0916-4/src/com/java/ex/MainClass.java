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

		// �������� ���� 3�� �����
		bBall[0] = rd.nextInt(10); // 0~9����
		while (bBall[0] == bBall[1]) {
			bBall[1] = rd.nextInt(10);
		}
		while (bBall[2] == bBall[1] || bBall[2] == bBall[0]) {
			bBall[2] = rd.nextInt(10);
		}

		System.out.println(" �߱����� ���� : " + Arrays.toString(bBall));

		while (stk < 3) {
			System.out.print("  ��ȣ : ");
			bUser[0] = sc.nextInt();
			bUser[1] = sc.nextInt();
			bUser[2] = sc.nextInt();

			// ��Ʈ����ũ �� ���
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

			// ���� �Ǵ�
			if (stk > 2) {
				stk = 4;
				System.out.println("���� ��������");
			} else if (stk == 0 && ball == 0) {
				out++;
				System.out.println(out + "�ƿ�");
				if (out == 3) {
					System.out.println("���� ��������");
					stk = 4; // 4�ְ� ��������
				}
			} else {
				System.out.println(stk + "��Ʈ����ũ , " + ball + "��");
				stk = 0;
				ball = 0;
			}
		}

	}
}
