package com.java.ex.robot;

import com.java.ex.action.FireAct;
import com.java.ex.action.FlyAct;
import com.java.ex.action.SwordAct;

public abstract class Robot {
	public FireAct fire; // ��ü������ ���� ���� , ���ȭ�� �� ��
	public FlyAct fly;
	public SwordAct sword;

	public abstract void shape();

	public void walk() {
		System.out.println("�ȱ� :  O"); //�Ѱ��� ��ɹۿ� ����
	}
	public void run() {
		System.out.println("�޸��� :  O");
	}
	
	
	public void actFire() {  //��� ������
		this.fire.fire();
	}
	public void actFly() {
		this.fly.fly();
	}
	public void actSword() {
		this.sword.sword();
	}
	// ����
	public void setFire(FireAct fire) {
		this.fire = fire;
	}

	public void setFly(FlyAct fly) {
		this.fly = fly;
	}

	public void setSword(SwordAct sword) {
		this.sword = sword;
	}
}
