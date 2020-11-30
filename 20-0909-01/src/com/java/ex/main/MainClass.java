package com.java.ex.main;

import com.java.ex.action.FlyOk;
import com.java.ex.robot.CheapRobot;
import com.java.ex.robot.StandardRobot;
import com.java.ex.robot.SuperRobot;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���۷κ� ���� �ֹ�~!");
		SuperRobot spr = new SuperRobot();
		spr.shape();
		spr.walk();
		spr.run();
		spr.actFly();
		spr.actSword();
		spr.actFire();
		
		System.out.println("ǥ�طκ� ���� �ֹ�~~!");
		StandardRobot str = new StandardRobot();
		str.shape();
		str.walk();
		str.run();
		str.actFly();
		str.actSword();
		str.actFire();
		
		System.out.println("�ֹ��� ǥ�طκ� ���� �ֹ�~~!");//����ó�� ����� �̷� �͵� ����
		StandardRobot str2 = new StandardRobot();
		str2.setFly(new FlyOk()); // ��ɸ� ���� �� �� ó�� �����ߴ� ��  // ���ͷ� OK�� �ٲ� ��
		str2.shape();
		str2.walk();
		str2.run();
		str2.actFly();  //���� �͵� �ʿ��ϴ�! ���͸� ���ؼ�
		str2.actSword();
		str2.actFire();
		
		System.out.println("�� �κ� ���� �ֹ�~~~!");
		CheapRobot cr = new CheapRobot();
		cr.shape();
		cr.walk();
		cr.run();
		cr.actFly();
		cr.actSword();
		cr.actFire();
	}

}
