package com.java.ex;

public class MainClass {
	// 1019-1-1
	public static void main(String[] args) {
		MakeButton btn = new MakeButton();
		//btn.pack(); //�⺻ ������
		btn.setSize(200,200);
		btn.setVisible(true); //ȭ�鿡 �׸��� , boolen Ÿ�� true�� �ϸ� ���
		
		try {
			Thread.sleep(5000); //����Ʈ �Ƚ��ѵ� ���� java.long? �ֻ��� Ŭ������ ���⿡ ���� 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		btn.setVisible(false);  //��ư �����
		btn.dispose();  //��ư �ڿ� ����, �ڹٴ� ���ư��� ����
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.exit(0);   //���ø����̼� ���� -> �ڹٰ� ����� ��
		
	}

}
