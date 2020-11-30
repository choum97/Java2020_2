package com.java.ex.car;

import com.java.ex.abs.AbsNo;
import com.java.ex.audio.Audio2ch;
import com.java.ex.cam.CamNo;

public class K3 extends Car {
	public K3() {
		System.out.println("---K3 제작---");
		abs = new AbsNo();
		cam = new CamNo();
		audio = new Audio2ch();
	}
	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("핸들, 엑셀, 브레이크, 차체 조립완료");
	}
}
