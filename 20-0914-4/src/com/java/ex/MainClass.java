package com.java.ex;

import java.util.Arrays;
import java.util.Random;

public class MainClass {
	// 0914 04 ����Ŭ����
	public static void main(String[] args) {
		Random rd = new Random(); 
		int[] lotto = new int[6]; //�ζ�
		int temp;
		int i=0;
		while (i<6) {
			temp =rd.nextInt(45)+1; //������ ������ �߻�, 0�����ؼ� �����ϰ� ���� �׷��� +1
			for (int j = 0; j <= i; j++) if (temp == lotto[j]) continue; //j���� ������ �߻��� ���� ������ �ٽ�
			lotto[i] = temp;
			i++;
		}
		System.out.println("�ζ� ��÷ ��ȣ : "+ Arrays.toString(lotto)); //toString �� �ٺҷ���
		
	}

}
