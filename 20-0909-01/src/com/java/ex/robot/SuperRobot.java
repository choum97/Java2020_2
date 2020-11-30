package com.java.ex.robot;

import com.java.ex.action.FireOk;
import com.java.ex.action.FlyOk;
import com.java.ex.action.SwordLaser;

public class SuperRobot extends Robot {
	public SuperRobot() {
		fire = new FireOk();
		fly = new FlyOk();
		sword = new SwordLaser();
		System.out.println("ÆÈ, ´Ù¸®, ¸Ó¸®, ¸öÅë Á¦ÀÛ¿Ï·á");
	}

	@Override
	public void shape() {
		System.out.println("---½´ÆÛ·Îº¿ »ý¼º---");
	}

}
