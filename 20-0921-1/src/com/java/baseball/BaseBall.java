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

	// ��������
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

	// �Է�
	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ������ �����̽��� �̿��Ͽ� 0~9������ ���ڸ� �� �� �Է�(�ߺ�X) : ");
		for (int i = 0; i < youNum.length; i++) {
			youNum[i] = sc.nextInt();
		}

		for (int i = 0; i < youNum.length; i++) {
			boolean flag = false;

			for (int j = 0; j < i; j++) {
				if (youNum[i] == youNum[j]) {
					System.out.println("���� �ߺ��Է� �߻�");
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
			} // ��Ʈ����ũ ī��Ʈ
			for (int j = 0; j < comNum.length; j++) { // �� ī��Ʈ
				if (i == j)
					continue;
				else if (comNum[i] == comNum[j])
					ball++;
			}
		}

		if (3 == stk) {
			System.out.println(count + "��° Ÿ������ Ȩ��!!");
			return false;
		} else {
			System.out.println(++count + "��° Ÿ�� : " + stk + "S, " + ball + "B");
			return true;
		}

	}

}
