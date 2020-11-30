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
		// 패널에 컴포넌트를 담아 컨테이너에 배치 한 것
		JPanel jp1 = new JPanel(); // 패널 객체 생성
		jp1.setLayout(new GridLayout(3, 1)); // 패널에 그리드 배치 관리자 생성
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
