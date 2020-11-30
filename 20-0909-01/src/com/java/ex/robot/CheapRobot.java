package com.java.ex.robot;

import com.java.ex.action.FireNo;
import com.java.ex.action.FlyNo;
import com.java.ex.action.SwordNo;

public class CheapRobot extends Robot {
	public CheapRobot() {
		fire = new FireNo();
		fly= new FlyNo();
		sword = new SwordNo();
		
		System.out.println("迫, 促府, 赣府, 个烹 力累肯丰");
	}

	@Override
	public void shape() {
		System.out.println("---Cheap肺嚎 积己---");
	}



}
