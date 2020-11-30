package com.java.ex5.Container;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JPanelSample2 extends JFrame {
	public JPanelSample2() {
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout(3, 3));
		// �гο� ������Ʈ�� ��� �����̳ʿ� ��ġ �� ��
		JPanel jp1 = new JPanel(); // �г� ��ü ����
		jp1.setLayout(new GridLayout(3, 1)); // �гο� �׸��� ��ġ ������ ����
		jp1.add(new JRadioButton("Java"));
		jp1.add(new JRadioButton("JSP"));
		jp1.add(new JRadioButton("Spring"));

		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(3, 1)); 
		jp2.add(new JButton("Java"));
		jp2.add(new JButton("JSP"));
		jp2.add(new JButton("Spring"));

		ct.add(jp1, BorderLayout.EAST);
		ct.add(jp2, BorderLayout.WEST);

		setTitle("JPannel Sample2");
		setSize(300, 200);
		setVisible(true);
	}
}
