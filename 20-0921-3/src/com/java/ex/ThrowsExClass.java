package com.java.ex;

public class ThrowsExClass {
	public ThrowsExClass() {
		actionC();
	}
	
	private void actionA() throws Exception { //������ ������ �� , ó���ϴ� �� �ƴ�
		System.out.println("actionA �޼��� �Դϴ�.");
		
		int[] iArr= {1,2,3,4};
		System.out.println(iArr[4]);  //�������� ����
		
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");  //�������� ���� �ȵ�
	}

	private void actionB() {  				// ���� ó��
		System.out.println("actionB �޼��� �Դϴ�");
		try {						
			actionA();
		}catch (Exception e) {
			System.out.println("���� �߻��� ���⼭ ó���մϴ�");
			System.out.println(e.getMessage());
		}
		
		System.out.println("bbbbbbbbbbbbbbbbbb");
	}
	
	private void actionC() {
		System.out.println("actionC �޼��� �Դϴ�");
		 actionB();
		 System.out.println("ccccccccccccccccccc");
	}
}
