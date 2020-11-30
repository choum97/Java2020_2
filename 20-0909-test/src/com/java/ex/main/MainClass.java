package com.java.ex.main;

import com.java.ex.cam.Cam3D;
import com.java.ex.car.K3;
import com.java.ex.car.K5;
import com.java.ex.car.K7;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("K3 주문~!");
		K3 k3 = new K3();
		k3.shape();
		k3.speedUp();
		k3.speedDown();
		k3.actAbs();
		k3.actCam();
		k3.actAudio();
		System.out.println("");
		
		System.out.println("K5 주문~!");
		K5 k5 = new K5();
		k5.shape();
		k5.speedUp();
		k5.speedDown();
		k5.actAbs();
		k5.actCam();
		k5.actAudio();
		System.out.println("");
		
		System.out.println("주문형 K5 주문~!!!!!!");
		K5 k5N2 = new K5();
		k5N2.setCam(new Cam3D());
		k5N2.shape();
		k5N2.speedUp();
		k5N2.speedDown();
		k5N2.actAbs();
		k5N2.actCam();
		k5N2.actAudio();
		System.out.println("");
		
		System.out.println("K7 주문~!");
		K7 k7 = new K7();
		k7.shape();
		k7.speedUp();
		k7.speedDown();
		k7.actAbs();
		k7.actCam();
		k7.actAudio();

	}

}
