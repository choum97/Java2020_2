package com.java.baseball;

public class MainClass {
// 0921 -1
	public static void main(String[] args) {
		BaseBall bb = new BaseBall();
		bb.init();
		
		while (bb.compare()) {
			bb.stk = 0;
			bb.ball = 0;
			bb.input();
			bb.count++;
		}
	}

}
