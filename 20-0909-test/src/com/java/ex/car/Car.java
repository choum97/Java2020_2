package com.java.ex.car;

import com.java.ex.abs.AbsAct;
import com.java.ex.audio.AudioAct;
import com.java.ex.cam.CamAct;

public abstract class Car {
	public AbsAct abs;
	public AudioAct audio;
	public CamAct cam;

	public void speedUp() {
		System.out.println("���� :  O"); // �Ѱ��� ��ɹۿ� ����
	}
	public void speedDown() {
		System.out.println("���� :  O");
	}

	public abstract void shape();
	
	public void actAbs() {
		this.abs.abs();
	}
	public void actAudio() {
		this.audio.audio();
	}
	public void actCam() {
		this.cam.cam();
	}

	// ����
	public void setAbs(AbsAct abs) {
		this.abs = abs;
	}

	public void setAudio(AudioAct audio) {
		this.audio = audio;
	}

	public void setCam(CamAct cam) {
		this.cam = cam;
	}
}
