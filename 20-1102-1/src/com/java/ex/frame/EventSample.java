package com.java.ex.frame;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame; // ��������
import javax.swing.JLabel;

public class EventSample extends JFrame {
	JLabel j1;
	JButton jb1, jb2, jb3;

	public EventSample() {
		Container ct = getContentPane(); //�����̳� 
		ct.setLayout(new FlowLayout()); //�帧������ �� ��� ��, �÷ο�� ���̰� �Ѿ�� ��ġ�� �ٲ� ����

		jb1 = new JButton("������"); // ��ư ����, ��ġ
		jb2 = new JButton("���̾��");
		jb3 = new JButton("�����̴���");
		j1 = new JLabel("Click Button");

		jb1.addActionListener(new EventClickButton(j1)); //�̺�Ʈ �ҷ�����
		jb2.addActionListener(new EventIronmanButton(j1));
		jb3.addActionListener(new EventSpidemanButton(j1));

		ct.add(jb1);
		ct.add(jb2);
		ct.add(jb3);
		ct.add(j1);

		setTitle("â �̸� : EventSample");
		setSize(400, 300);
		setVisible(true);
	}
}