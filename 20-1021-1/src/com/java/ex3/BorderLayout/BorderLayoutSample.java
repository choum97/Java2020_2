package com.java.ex3.BorderLayout;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutSample extends JFrame {
	public BorderLayoutSample() {
		Container ct = getContentPane();
		BorderLayout b1 = new BorderLayout(10, 10);
		ct.setLayout(b1);
		ct.add(new JButton("��"), BorderLayout.EAST);
		ct.add(new JButton("��"), BorderLayout.WEST);
		ct.add(new JButton("��"), BorderLayout.NORTH);
		ct.add(new JButton("�Ʒ�"), BorderLayout.SOUTH);
		ct.add(new JButton("���"), BorderLayout.CENTER);
		setTitle("BorderLayout Sample");
		setSize(400, 300);
		setVisible(true);
	}
}
