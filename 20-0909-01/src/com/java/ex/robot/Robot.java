package com.java.ex.robot;

import com.java.ex.action.FireAct;
import com.java.ex.action.FlyAct;
import com.java.ex.action.SwordAct;

public abstract class Robot {
	public FireAct fire; // 객체변수를 생성 가능 , 기능화로 뺀 것
	public FlyAct fly;
	public SwordAct sword;

	public abstract void shape();

	public void walk() {
		System.out.println("걷기 :  O"); //한가지 기능밖에 없음
	}
	public void run() {
		System.out.println("달리기 :  O");
	}
	
	
	public void actFire() {  //기능 여러개
		this.fire.fire();
	}
	public void actFly() {
		this.fly.fly();
	}
	public void actSword() {
		this.sword.sword();
	}
	// 셋터
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
