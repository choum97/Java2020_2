package com.java.ex;
// 10�� 12�� - 1 - 1 
public class ThreadClassExtends extends Thread {
	@Override
	public void run() { // ���� ���ư��� �ִ� ������ �̸�, ����ƽ���� ����,current- �ֽ���
		System.out.println("2. "+Thread.currentThread().getName()); //�������� Ư¡ ������ ������ ���� �Ұ�
		System.out.println("������ Ŭ���� ��� ������");

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);// 0.5�� ����
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} // �ܺ� ���� ����Ҷ� try catch�� ���
		}
	}
}
