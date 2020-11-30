package com.java.ex;

import java.util.Arrays;
import java.util.Random;

public class MainClass {
	// 0914 04 랜덤클래스
	public static void main(String[] args) {
		Random rd = new Random(); 
		int[] lotto = new int[6]; //로또
		int temp;
		int i=0;
		while (i<6) {
			temp =rd.nextInt(45)+1; //정수형 숫자자 발생, 0포함해서 랜덤하게 나옴 그래서 +1
			for (int j = 0; j <= i; j++) if (temp == lotto[j]) continue; //j값과 난수로 발생한 값이 같으면 다시
			lotto[i] = temp;
			i++;
		}
		System.out.println("로또 당첨 번호 : "+ Arrays.toString(lotto)); //toString 값 다불러옴
		
	}

}
