package com.java.ex.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class EventClickButton implements ActionListener {
	JLabel j1; //�� ������ ����
	public EventClickButton(JLabel j1) {
		this.j1 = j1;  // ���� �ִ� �󺧿��ٰ� ��� �� Ŭ�������� ������ ���� �־��ش�
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		j1.setText("�����ٰ� ������");
	}	
}
