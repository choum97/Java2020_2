package com.java.ex.car;

import com.java.ex.abs.AbsOk;
import com.java.ex.audio.Audio5ch;
import com.java.ex.cam.CamOk;

public class K5 extends Car {
	public K5() {
		System.out.println("---K5 ����---");
		abs = new AbsOk();
		cam = new CamOk();
		audio = new Audio5ch();
	}

	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("�ڵ�, ����, �극��ũ, ��ü �����Ϸ�");
	}
}
