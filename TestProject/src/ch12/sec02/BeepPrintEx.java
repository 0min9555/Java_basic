package ch12.sec02;

import java.awt.Toolkit;

//���� ������ : ������ ���

public class BeepPrintEx {

	public static void main(String[] args) {
		//������ ���� ���1
		//Thread Ŭ�����κ��� ���� ����
		/*
		Runnable beepTask = new BeepTask(); //Runnable ���� ��ü
		Thread thread = new Thread(beepTask); //�۾� ������ ����
		*/
		
		//Runnable ���� ��ü ���� ���2
		//�͸� ���� ��ü ���(BeepTask ��� ����)
		/*
		 Thread thread = new Thread(new Runnalbe() {
		//21��
		});
		*/
		
		//Runnable ���� ��ü ���� ���3
		//���ٽ� ���
		/*
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=1;i<5;i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {}
		});
		*/
		
		//beepTaskdml run()�޼ҵ� ����
		//thread.start();

		
		for(int i=0;i<5;i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}