package com.java.ex6.Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class EventClickButton implements ActionListener{
	JLabel j1;
	public EventClickButton(JLabel j1) {
		this.j1 = j1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		j1.setText("´­·¶³×");
		
	}
}
