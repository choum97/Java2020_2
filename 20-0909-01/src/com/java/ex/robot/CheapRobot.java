package com.java.ex.robot;

import com.java.ex.action.FireNo;
import com.java.ex.action.FlyNo;
import com.java.ex.action.SwordNo;

public class CheapRobot extends Robot {
	public CheapRobot() {
		fire = new FireNo();
		fly= new FlyNo();
		sword = new SwordNo();
		
		System.out.println("��, �ٸ�, �Ӹ�, ���� ���ۿϷ�");
	}

	@Override
	public void shape() {
		System.out.println("---Cheap�κ� ����---");
	}



}
