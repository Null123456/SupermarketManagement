package com.cs.from;

import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;

public class Stock extends JDialog {
	
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
	JLabel jLabel10 = new JLabel();
	JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JTextField jTextField4 = new JTextField();
    JTextField jTextField5 = new JTextField();
    JTextField jTextField6 = new JTextField();
    JTextField jTextField7 = new JTextField();
    JTextField jTextField8 = new JTextField();
    JTextField jTextField9 = new JTextField();
    JTextField jTextField10 = new JTextField();
    JScrollPane jScrollPane1 = new JScrollPane();
    JTable jTable1 = new JTable();
    JTableHeader jTableHeader1 = jTable1.getTableHeader();
    Vector colnames = new Vector(); //��ͷ
    Vector colnames1 = new Vector(); //����
    Vector colnames2 = new Vector(); //����
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JComboBox jComboBox1 = new JComboBox();
	
	public  Stock(Frame ower, String title, boolean modal) {
		super(ower, title, modal);
		try {
			//��Java���������ر�ʱ���ã�ͬʱ������������ڴ��������
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			jbInit();		//���ڵĳ�ʼ������
			pack();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public Stock() {
		// TODO Auto-generated constructor stub
		this(new Frame(),"������Ʒ",false);
		this.setSize(920, 500);
		this.setLocation(100, 100);
		this.setVisible(true);			//��ʾ����
	}
	private void jbInit() throws Exception {
		panel1.setLayout(null); 				//���ò���Ϊ��
		jLabel1.setText("��Ʒ���룺");				//������Ʒ�������ƴ�С��λ��
		jLabel1.setBounds(new Rectangle(15, 10, 85, 26));
		jLabel2.setText("��  ��  �룺");				//�������������Ʊ�ǩ
		jLabel2.setBounds(new Rectangle(15, 50, 85, 26));
		jLabel3.setText("����ţ�");				//��������ű�ǩ
		jLabel3.setBounds(new Rectangle(15, 90, 85, 26));
		jLabel4.setText("��Ʒ���ƣ�");				//������Ʒ���Ʊ�ǩ
		jLabel4.setBounds(new Rectangle(15, 130, 85, 26));
		jLabel5.setText("���ۼ�(Ԫ)��");			//�������ۼ۱�ǩ
		jLabel5.setBounds(new Rectangle(15, 170, 85, 26));
		jLabel6.setText("��Ʒ���");				//������Ʒ����ǩ
		jLabel6.setBounds(new Rectangle(15, 210, 85, 26));
		jLabel7.setText("������λ��");				//���ü�����λ��ǩ
		jLabel7.setBounds(new Rectangle(15, 250, 85, 26));
		jLabel8.setText("��  ��  �ۣ�");				//���ý����۱�ǩ
		jLabel8.setBounds(new Rectangle(15, 290, 85, 26));
		jLabel9.setText("������(��)��");			//���ñ����ڱ�ǩ
		jLabel9.setBounds(new Rectangle(15, 330, 85, 26));
		jLabel10.setText("��   ע ��");				//���ñ�ע��ǩ
		jLabel10.setBounds(new Rectangle(15, 370, 85, 26));
		//��Ӹ�ѡ��
		jComboBox1.addItem("������");
		jComboBox1.addItem("ʳƷ��");
		jComboBox1.addItem("�߹���");
		jComboBox1.addItem("������");
		jComboBox1.addItem("������");
		jComboBox1.addItem("��Ʒ��");
		jComboBox1.setBounds(new Rectangle(91, 90, 125, 24));
		
		jTextField1.setBounds(new Rectangle(91, 10, 125, 24));		//����ѡ���ı���
	    jTextField2.setBounds(new Rectangle(91, 50, 125, 24));
	    jTextField4.setBounds(new Rectangle(91, 130, 125, 24));
	    jTextField5.setBounds(new Rectangle(91, 170, 125, 24));
	    jTextField6.setBounds(new Rectangle(91, 210, 125, 24));
	    jTextField7.setBounds(new Rectangle(91, 250, 125, 24));
	    jTextField8.setBounds(new Rectangle(91, 290, 125, 24));
	    jTextField9.setBounds(new Rectangle(91, 330, 125, 24));
	    jTextField10.setBounds(new Rectangle(91, 370, 125, 24));
	    
	    jScrollPane1.setBounds(new Rectangle(228, 10, 658, 383));
	    
		jButton1.setBounds(new Rectangle(53, 418, 127, 27));
		jButton1.setText("��    ��");				//������Ӱ�ť
		
		jButton2.setBounds(new Rectangle(273, 418, 127, 27));
		jButton2.setText("��    ��");				//������Ӱ�ť
		
		jButton3.setBounds(new Rectangle(493, 418, 127, 27));
		jButton3.setText("ɾ    ��");				//������Ӱ�ť
		
		jButton4.setBounds(new Rectangle(713, 418, 127, 27));
		jButton4.setText("��    ��");				//������Ӱ�ť
		
		
		colnames.add("��Ʒ����");		//��������ӱ�ͷ��Ϣ
	    colnames.add("������");
	    colnames.add("�����");
	    colnames.add("��Ʒ����");
	    colnames.add("���ۼ�(Ԫ)");
	    colnames.add("��Ʒ���");
	    colnames.add("������λ");
	    colnames.add("������");
	    colnames.add("������(��)");
	    colnames.add("��ע");
	    colnames2.add(colnames1);
	    jTable1 = Mytable.maketable(colnames2, colnames);
	    jScrollPane1.getViewport().add(jTable1);
	    //��ʼ��һ��������������panel1
		getContentPane().add(panel1);
		//��ҳ��������ӵ�����
		panel1.add(jLabel1);
		panel1.add(jLabel2);
		panel1.add(jLabel3);
		panel1.add(jLabel4);
		panel1.add(jLabel5);
		panel1.add(jLabel6);
		panel1.add(jLabel7);
		panel1.add(jLabel8);
		panel1.add(jLabel9);
		panel1.add(jLabel10);
		panel1.add(jTextField1);
		panel1.add(jTextField2);
		panel1.add(jTextField4);
		panel1.add(jTextField5);
		panel1.add(jTextField6);
		panel1.add(jTextField7);
		panel1.add(jTextField8);
		panel1.add(jTextField9);
		panel1.add(jTextField10);
		panel1.add(jButton1);
		panel1.add(jButton2);
		panel1.add(jButton3);
		panel1.add(jButton4);
		panel1.add(jComboBox1);
		panel1.add(jScrollPane1);		
	}	
	public void jButton1_actionPerformed(ActionEvent e) {
		jLabel1.setText("�Ұ���");	
	}
}
