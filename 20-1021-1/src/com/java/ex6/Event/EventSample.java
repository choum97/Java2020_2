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
		
		jb1= new JButton("������");
		jb2= new JButton("���̾��");
		jb3= new JButton("�����̴���");
		j1 = new JLabel("Click Button");
		
		jb1.addActionListener(new EventClickButton(j1));
		
		
	}
	
}
