package com.java.ex5.Container;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JPanelSample1 extends JFrame {
	//패널 없이 컨테이너에 모든 컴포넌트를 배치
	   public JPanelSample1() {
	      Container ct = getContentPane();
	      ct.setLayout(new FlowLayout()); //순서대로 일렬로 나옴
	      ct.add(new JRadioButton("java")); //컨테이너에 컴포넌트 추가
	      ct.add(new JRadioButton("JSP"));
	      ct.add(new JRadioButton("Spring"));
	      ct.add(new JButton("java"));
	      ct.add(new JButton("JSP"));
	      ct.add(new JButton("Spring"));
	      setTitle("JPannel Sample1");
	      setSize(300,200);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setVisible(true);
	   }
	}
