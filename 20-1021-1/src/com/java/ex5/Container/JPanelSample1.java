package com.java.ex5.Container;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JPanelSample1 extends JFrame {
	//�г� ���� �����̳ʿ� ��� ������Ʈ�� ��ġ
	   public JPanelSample1() {
	      Container ct = getContentPane();
	      ct.setLayout(new FlowLayout()); //������� �Ϸķ� ����
	      ct.add(new JRadioButton("java")); //�����̳ʿ� ������Ʈ �߰�
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
