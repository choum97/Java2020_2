package com.java.ex.main;

import com.java.ex.action.FlyOk;
import com.java.ex.robot.CheapRobot;
import com.java.ex.robot.StandardRobot;
import com.java.ex.robot.SuperRobot;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("슈퍼로봇 생성 주문~!");
		SuperRobot spr = new SuperRobot();
		spr.shape();
		spr.walk();
		spr.run();
		spr.actFly();
		spr.actSword();
		spr.actFire();
		
		System.out.println("표준로봇 생성 주문~~!");
		StandardRobot str = new StandardRobot();
		str.shape();
		str.walk();
		str.run();
		str.actFly();
		str.actSword();
		str.actFire();
		
		System.out.println("주문형 표준로봇 생성 주문~~!");//오늘처럼 만들면 이런 것도 가능
		StandardRobot str2 = new StandardRobot();
		str2.setFly(new FlyOk()); // 기능만 갈아 낀 것 처음 설명했던 것  // 셋터로 OK로 바꾼 것
		str2.shape();
		str2.walk();
		str2.run();
		str2.actFly();  //나는 것도 필요하다! 셋터를 통해서
		str2.actSword();
		str2.actFire();
		
		System.out.println("싼 로봇 생성 주문~~~!");
		CheapRobot cr = new CheapRobot();
		cr.shape();
		cr.walk();
		cr.run();
		cr.actFly();
		cr.actSword();
		cr.actFire();
	}

}
