package com.java.ex2.FlowLayout;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutSample extends JFrame {
	public FlowLayoutSample() {
		Container ct = getContentPane();
		FlowLayout f1 = new FlowLayout(FlowLayout.CENTER, 10, 15); // �¿� ���
		ct.setLayout(f1);
		for(int i= 1; i<15;i++) ct.add(new JButton("��ư "+i));
		setTitle("17831011 �� �� ��"); //â �̸�
		setSize(700,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ݱ��ϸ� ����ǰ�
		setVisible(true);
	}
}
