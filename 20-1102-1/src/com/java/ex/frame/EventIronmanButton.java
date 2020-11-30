package com.java.ex.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class EventIronmanButton implements ActionListener {
	JLabel j1;
	public EventIronmanButton(JLabel j1) {
		this.j1 = j1;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		j1.setText("아이언맨 레이져 발사 !!");
	}	
}
