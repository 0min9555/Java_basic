package ch12.sec01;

import java.awt.Toolkit;

public class BeepPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0;i<=5;i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {}
			
		}
		// �� �ټ��� ���
		for(int i=0;i<=5;i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {}
		}
	}

}
