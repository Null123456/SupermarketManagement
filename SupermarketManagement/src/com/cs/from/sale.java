package com.cs.from;

import java.awt.Frame;

import javax.swing.JDialog;

public class sale extends JDialog {

	public sale(Frame ower, String title, boolean modal) {
		super(ower, title, modal);
		try {
			//��Java���������ر�ʱ���ã�ͬʱ������������ڴ��������
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			jbInit();		//���ڵĳ�ʼ������
			pack();			//ˢ�´���
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public sale() {
		// TODO Auto-generated constructor stub
		this(new Frame(), "ǰ̨����", false);
		this.setSize(800, 600);
		this.setLocation(250, 100);
		this.setVisible(true);
	}
	
	public void jbInit() {

	}
}
