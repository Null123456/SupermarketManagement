package com.cs.from;

import java.awt.Rectangle;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AddGoods extends JDialog {
	//��ĳ�Ա����
	JPanel panel1 = new JPanel();
	JLabel jLabel1 = new JLabel();
	JLabel jLabel2 = new JLabel();
	JLabel jLabel3 = new JLabel();
	JLabel jLabel4 = new JLabel();
	JLabel jLabel5 = new JLabel();
	JLabel jLabel6 = new JLabel();
	JLabel jLabel7 = new JLabel();
	JLabel jLabel8 = new JLabel();
	JLabel jLabel9 = new JLabel();
	JLabel jLabel0 = new JLabel();
	JLabel jLabel11 = new JLabel();
	private void jbInit() throws Exception {
		panel1.setLayout(null); 				//���ò���Ϊ��
		jLabel1.setText("��Ʒ���룺");				//������Ʒ�������ƴ�С��λ��
		jLabel1.setBounds(new Rectangle(15, 10, 85, 26));
		getContentPane().add(panel1);
		panel1.add(jLabel1);
	}
}
