package com.cs.from;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Rectangle;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class sale extends JDialog {

	// ��ĳ�Ա����
	JPanel panel1 = new JPanel();
	// ��ǩ
	JLabel jLabel1 = new JLabel();
	JLabel jLabel2 = new JLabel();
	JLabel jLabel3 = new JLabel();
	JLabel jLabel4 = new JLabel();
	JLabel jLabel5 = new JLabel();
	JLabel jLabel6 = new JLabel();
	JLabel jLabel7 = new JLabel();
	JLabel jLabel8 = new JLabel();
	JLabel jLabel9 = new JLabel();
	// �ı���
	JTextField jTextField1 = new JTextField();
	JTextField jTextField2 = new JTextField();
	JTextField jTextField3 = new JTextField();
	JTextField jTextField4 = new JTextField();
	JTextField jTextField5 = new JTextField();
	JTextField jTextField6 = new JTextField();
	JTextField jTextField7 = new JTextField();
	JTextField jTextField8 = new JTextField();
	JTextField jTextField9 = new JTextField();

	// ��ť
	JButton jButton1 = new JButton();
	JButton jButton2 = new JButton();
	JButton jButton3 = new JButton();

	JScrollPane jScrollPane1 = new JScrollPane();
	JTable jTable1 = new JTable(); 			// ���
	Vector colnames = new Vector(); 		// ��ͷ
	Vector colnames1 = new Vector(); 		// ����
	Vector colnames2 = new Vector(); 		// ����

	public sale(Frame ower, String title, boolean modal) {
		super(ower, title, modal);
		try {
			// ��Java���������ر�ʱ���ã�ͬʱ������������ڴ��������
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			jbInit(); 				// ��ʼ������
			pack(); 				// ˢ�½���
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public sale() {
		// TODO Auto-generated constructor stub
		this(new Frame(), "ǰ̨����", false);		//���ɴ���
		this.setSize(800, 600);					//���ô��ڴ�С
		setLocationRelativeTo(getOwner());		//������ʾ
		this.setVisible(true);					//���ڿɼ�
	}

	public void jbInit() {
		panel1.setLayout(null); // ���Ĭ�ϵĲ�������

		// ��������ӱ�ͷ��Ϣ
		colnames.add("��Ʒ���");
		colnames.add("����");
		colnames.add("���");
		colnames.add("��λ");
		colnames.add("����");
		colnames.add("�ۼ�");
		colnames.add("�ۿ�");
		colnames.add("���");
		colnames2.add(colnames1);
		//����ScrollPane�Ĵ�С
		jScrollPane1.setBounds(new Rectangle(25, 25, 740, 420));
		
		jTable1 = Mytable.maketable(colnames2, colnames);
		jScrollPane1.getViewport().add(jTable1);
		
		//���ñ�ǩ
		jLabel1.setText("��Ʒ���");
		jLabel1.setBounds(new Rectangle(30, 450, 60, 20));
		jLabel2.setText("����");			
		jLabel2.setBounds(new Rectangle(270, 450, 60, 20));
		jLabel3.setText("�ۿ�");			
		jLabel3.setBounds(new Rectangle(400, 450, 60, 20));
		jLabel4.setText("��ǰʱ��");		
		jLabel4.setBounds(new Rectangle(560, 450, 60, 20));
		jLabel5.setText("��Ա����");		
		jLabel5.setBounds(new Rectangle(30, 480, 60, 20));
		jLabel6.setText("����");		
		jLabel6.setBounds(new Rectangle(270, 480, 60, 20));
		jLabel7.setText("Ӧ����");		
		jLabel7.setBounds(new Rectangle(30, 510, 80, 40));
		jLabel8.setText("Ԥ����");		
		jLabel8.setBounds(new Rectangle(250, 510, 80, 40));
		jLabel9.setText("�����");		
		jLabel9.setBounds(new Rectangle(470, 510, 80, 40));
		
		//�����ı���
		jTextField1.setBounds(new Rectangle(100, 450, 150, 20));
	    jTextField2.setBounds(new Rectangle(305, 450, 80, 20));
	    jTextField3.setBounds(new Rectangle(435, 450, 100, 20));
	    jTextField4.setBounds(new Rectangle(630, 450, 100, 20));
	    jTextField5.setBounds(new Rectangle(100, 480, 150, 20));
	    jTextField6.setBounds(new Rectangle(305, 480, 80, 20));
	    jTextField7.setBounds(new Rectangle(100, 516, 120, 30));
	    jTextField8.setBounds(new Rectangle(320, 516, 120, 30));
	    jTextField9.setBounds(new Rectangle(540, 516, 120, 30));
	    
	    //���ð�ť
	    jButton1.setText("������Ʒ");
	    jButton1.setBounds(new Rectangle(435, 480, 100, 20));
	    jButton2.setText("����ȡ��");
	    jButton2.setBounds(new Rectangle(555, 480, 100, 20));
	    jButton3.setText("��    ��");
	    jButton3.setBounds(new Rectangle(675, 480, 100, 20));
	    
		// ��ʼ��һ��������������panel1
		getContentPane().add(panel1);

		// ��ҳ��������ӵ�����
		panel1.add(jScrollPane1);
		panel1.add(jLabel1);
		panel1.add(jLabel2);
		panel1.add(jLabel3);
		panel1.add(jLabel4);
		panel1.add(jLabel5);
		panel1.add(jLabel6);
		panel1.add(jLabel7);
		panel1.add(jLabel8);
		panel1.add(jLabel9);
		panel1.add(jTextField1);
		panel1.add(jTextField2);
		panel1.add(jTextField3);
		panel1.add(jTextField4);
		panel1.add(jTextField5);
		panel1.add(jTextField6);
		panel1.add(jTextField7);
		panel1.add(jTextField8);
		panel1.add(jTextField9);
		panel1.add(jButton1);
		panel1.add(jButton2);
		panel1.add(jButton3);

	}
}
