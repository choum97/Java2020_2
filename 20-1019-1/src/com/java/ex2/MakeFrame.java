package com.java.ex2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MakeFrame extends Frame implements ActionListener {
	private List list;
	private Panel panel;
	private TextField textfield;
	private Button okBt;
	private Button exitBt;

	public MakeFrame() {
		list = new List();
		panel = new Panel();
		textfield = new TextField(20);
		okBt = new Button("Ȯ��");
		exitBt = new Button("����");

		setLayout(new BorderLayout());
		add(panel, BorderLayout.NORTH); // ��� ������
		add(list, BorderLayout.CENTER); // �߾ӿ��� ���ڴ�
		panel.add(new Label("write")); // ������� ����Ʈ�� ��ư�� ���ΰ�
		panel.add(textfield);
		panel.add(okBt);
		panel.add(exitBt);

		okBt.addActionListener(this); // ���� ������ ��
		exitBt.addActionListener(this);

		addWindowListener(new WindowAdapter() {// �̰� �޼ҵ���
			@Override
			public void windowClosing(WindowEvent e) { // �����쿡�� Xǥ �ݱ� �������� ó��
				setVisible(false);
				dispose();
				System.exit(0);
			}// �����ڸ� ������ ��? <- (new Label("write"))
		}); 

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == okBt) { // ok��ư ������ ����Ʈ �߰�
			list.add(textfield.getText());
		} else if (e.getSource() == exitBt) {
			setVisible(false);
			dispose();
			System.exit(0);
		}

	}
}
