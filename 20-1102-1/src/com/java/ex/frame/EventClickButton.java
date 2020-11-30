package com.java.ex.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class EventClickButton implements ActionListener {
	JLabel j1; //라벨 색으로 구별
	public EventClickButton(JLabel j1) {
		this.j1 = j1;  // 원래 있던 라벨에다가 요기 이 클래스에서 생성한 라벨을 넣어준다
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		j1.setText("누른다고 누르냐");
	}	
}
