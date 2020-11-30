package com.java.ex.robot;

import com.java.ex.action.FireOk;
import com.java.ex.action.FlyNo;
import com.java.ex.action.SwordIron;

public class StandardRobot extends Robot {

	public StandardRobot() {
		fire = new FireOk();
		fly = new FlyNo();
		sword = new SwordIron();
		System.out.println("��, �ٸ�, �Ӹ�, ���� ���ۿϷ�");
	}

	@Override
	public void shape() {
		System.out.println("---Standard�κ� ����---");
	}

}
