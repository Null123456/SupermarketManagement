package com.cs.from;

import java.awt.Frame;

import javax.swing.JDialog;

public class find_Sales extends JDialog {

	public find_Sales(Frame ower, String title, boolean modal) {
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
	public find_Sales() {
		// TODO Auto-generated constructor stub
		this(new Frame(), "������ϸ���", false);
		this.setSize(600, 620);
		this.setLocation(350, 50);
		this.setVisible(true);
	}
	
	public void jbInit() {

	}
}
