package com.java.ex6.Event;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventSample extends JFrame{
	JLabel j1;
	JButton jb1,jb2,jb3;
	
	public EventSample() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		jb1= new JButton("눌러봐");
		jb2= new JButton("아이언맨");
		jb3= new JButton("스파이더맨");
		j1 = new JLabel("Click Button");
		
		jb1.addActionListener(new EventClickButton(j1));
		
		
	}
	
}
