package com.java.ex;

import java.awt.Button;
import java.awt.Frame;
// 1019-1-1
public class MakeButton extends Frame{
	public MakeButton() {
		Button btn = new Button("김 요 한"); // 버튼 text
		add(btn);  // Frame의 메소드
	}
}
