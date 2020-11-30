package com.java.ex.frame;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame; // 스윙쓴다
import javax.swing.JLabel;

public class EventSample extends JFrame {
	JLabel j1;
	JButton jb1, jb2, jb3;

	public EventSample() {
		Container ct = getContentPane(); //컨테이너 
		ct.setLayout(new FlowLayout()); //흐름순으로 쭉 까는 것, 플로우라서 길이가 넘어가서 위치가 바뀐 것임

		jb1 = new JButton("눌러봐"); // 버튼 생성, 위치
		jb2 = new JButton("아이언맨");
		jb3 = new JButton("스파이더맨");
		j1 = new JLabel("Click Button");

		jb1.addActionListener(new EventClickButton(j1)); //이벤트 불러오기
		jb2.addActionListener(new EventIronmanButton(j1));
		jb3.addActionListener(new EventSpidemanButton(j1));

		ct.add(jb1);
		ct.add(jb2);
		ct.add(jb3);
		ct.add(j1);

		setTitle("창 이름 : EventSample");
		setSize(400, 300);
		setVisible(true);
	}
}