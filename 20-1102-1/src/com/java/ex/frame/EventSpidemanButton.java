package com.java.ex.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class EventSpidemanButton implements ActionListener {
	JLabel j1;
	public EventSpidemanButton(JLabel j1) {
		this.j1 = j1;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		j1.setText("스파이더맨 거미줄 발사!! ");
	}	
}
