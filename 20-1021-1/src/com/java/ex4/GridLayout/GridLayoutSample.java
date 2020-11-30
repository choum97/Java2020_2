package com.java.ex4.GridLayout;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutSample extends JFrame {
	public GridLayoutSample() {
		Container ct = getContentPane();
		GridLayout g1 = new GridLayout(4,5,10,10); 
		ct.setLayout(g1);
		for(int i=1; i<=20;i++) ct.add(new JButton("버튼"+i));
		setTitle("그리드 레이아웃");
		setSize(800, 800);
		setVisible(true);
	}
}
