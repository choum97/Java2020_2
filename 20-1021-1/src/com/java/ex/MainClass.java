package com.java.ex;

import java.util.Scanner;

import com.java.ex2.FlowLayout.FlowLayoutSample;
import com.java.ex3.BorderLayout.BorderLayoutSample;
import com.java.ex4.GridLayout.GridLayoutSample;
import com.java.ex5.Container.JPanelSample1;
import com.java.ex5.Container.JPanelSample2;

public class MainClass {

	public static void main(String[] args) {
//		MakeComponent makeComp = new MakeComponent();
//		makeComp.pack();
//		makeComp.setVisible(true);
		
		//new FlowLayoutSample(); 
		
//		new BorderLayoutSample();
	
		//new GridLayoutSample();
		
	      Scanner sc = new Scanner(System.in);
	      int input = 0;
	      while(true) {
	         System.out.println("input number!");
	         input = sc.nextInt();
	         if((input != 1) && (input != 2)) {
	            System.out.println("Worng number! retry!");
	            continue;
	         }
	         else if (1 == input) new JPanelSample1();
	         else new JPanelSample2();
	      }
	      
	     //new EventSample();

	}

}
