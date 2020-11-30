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
		okBt = new Button("확인");
		exitBt = new Button("종료");

		setLayout(new BorderLayout());
		add(panel, BorderLayout.NORTH); // 어디에 박을지
		add(list, BorderLayout.CENTER); // 중앙에다 놓겠다
		panel.add(new Label("write")); // 순서대로 리스트랑 버튼들 붙인거
		panel.add(textfield);
		panel.add(okBt);
		panel.add(exitBt);

		okBt.addActionListener(this); // 내가 눌렸을 때
		exitBt.addActionListener(this);

		addWindowListener(new WindowAdapter() {// 이거 메소드임
			@Override
			public void windowClosing(WindowEvent e) { // 윈도우에서 X표 닫기 눌렀을때 처리
				setVisible(false);
				dispose();
				System.exit(0);
			}// 생성자를 변경한 것? <- (new Label("write"))
		}); 

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == okBt) { // ok버튼 눌리면 리스트 추가
			list.add(textfield.getText());
		} else if (e.getSource() == exitBt) {
			setVisible(false);
			dispose();
			System.exit(0);
		}

	}
}
