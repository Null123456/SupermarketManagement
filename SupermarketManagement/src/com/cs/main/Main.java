package com.cs.main;

import com.cs.base.Business;

public class Main {
	boolean packFrame = false;
	//���캯��
	public Main() {
		// TODO Auto-generated constructor stub
		MainFrame frame = new MainFrame();
		if (packFrame) {
			frame.pack();		//�ô�����ʾ���ʵĴ�С
		} else {
			frame.validate();	//ˢ�´����������Ϣ
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Business business = new Business();
		business.getConnection();
	}

}
