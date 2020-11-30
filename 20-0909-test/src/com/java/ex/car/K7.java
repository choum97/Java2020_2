package com.java.ex.car;

import com.java.ex.abs.AbsOk;
import com.java.ex.audio.Audio7ch;
import com.java.ex.cam.Cam3D;

public class K7 extends Car{
	public K7() {
		System.out.println("---K7 제작---");
		abs = new AbsOk();
		cam = new Cam3D();
		audio = new Audio7ch();
	}

	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("핸들, 엑셀, 브레이크, 차체 조립완료");
	}
}
