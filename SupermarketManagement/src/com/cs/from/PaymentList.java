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

public class PaymentList extends JDialog {
	
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
	
	public  PaymentList(Frame ower, String title, boolean modal) {
		super(ower, title, modal);
		try {
			//��Java���������ر�ʱ���ã�ͬʱ������������ڴ��������
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			jbInit();		//��ʼ������
			pack();			//ˢ�½���
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public PaymentList() {
		// TODO Auto-generated constructor stub
		this(new Frame(),"�������",false);
		this.setSize(800, 500);
		this.setLocation(100, 100);
		this.setVisible(true);			//��ʾ����
	}
	private void jbInit() throws Exception {
		panel1.setLayout(null); 				//���ò���Ϊ��
		jLabel1.setText("���ţ�");				//���õ���
		jLabel1.setBounds(new Rectangle(12, 64, 52, 18));
		jLabel2.setText("�����̣�");				//�������������Ʊ�ǩ
		jLabel2.setBounds(new Rectangle(12,	104, 52, 18));
		jLabel3.setText("���ң�");				//��������ű�ǩ
		jLabel3.setBounds(new Rectangle(12, 144, 52, 18));
		jLabel4.setText("�����");				//������Ʒ���Ʊ�ǩ
		jLabel4.setBounds(new Rectangle(12, 192, 52, 18));
		jLabel5.setText("���ʽ��");			//�������ۼ۱�ǩ
		jLabel5.setBounds(new Rectangle(12, 229, 52, 18));
		jLabel6.setText("֧Ʊ�ţ�");				//������Ʒ����ǩ
		jLabel6.setBounds(new Rectangle(12, 269, 52, 18));
		jLabel7.setText("����");				//���ü�����λ��ǩ
		jLabel7.setBounds(new Rectangle(12, 309, 52, 18));
		jLabel8.setText("�����ˣ�");				//���ý����۱�ǩ
		jLabel8.setBounds(new Rectangle(12, 349, 52, 18));
		jLabel9.setText("�Ƶ��ˣ�");			//���ñ����ڱ�ǩ
		jLabel9.setBounds(new Rectangle(12, 389, 52, 18));
		jLabel10.setText("���");				//���ñ�ע��ǩ
		jLabel10.setBounds(new Rectangle(43, 5, 146, 52));
		//��Ӹ�ѡ��
		jComboBox1.addItem("������");
		jComboBox1.addItem("ʳƷ��");
		jComboBox1.addItem("�߹���");
		jComboBox1.addItem("������");
		jComboBox1.addItem("������");
		jComboBox1.addItem("��Ʒ��");
		jComboBox1.setBounds(new Rectangle(91, 90, 125, 24));
		
		jTextField1.setBounds(new Rectangle(51, 64, 149, 20));		//����ѡ���ı���
	    jTextField2.setBounds(new Rectangle(60, 104, 149, 20));
	    jTextField4.setBounds(new Rectangle(51, 144, 149, 20));
	    jTextField5.setBounds(new Rectangle(51, 64, 149, 20));
	    jTextField6.setBounds(new Rectangle(51, 64, 149, 20));
	    jTextField7.setBounds(new Rectangle(51, 64, 149, 20));
	    jTextField8.setBounds(new Rectangle(51, 64, 149, 20));
	    jTextField9.setBounds(new Rectangle(51, 64, 149, 20));
	    jTextField10.setBounds(new Rectangle(51, 64, 149, 20));
	    
	    jScrollPane1.setBounds(new Rectangle(228, 10, 658, 383));
	    
		jButton1.setBounds(new Rectangle(380, 376, 80, 35));
		jButton1.setText("��    ��");				//������Ӱ�ť
		
		jButton2.setBounds(new Rectangle(500, 376, 80, 35));
		jButton2.setText("��    ��");				//������Ӱ�ť
		
		jButton3.setBounds(new Rectangle(620, 376, 80, 35));
		jButton3.setText("ɾ    ��");				//������Ӱ�ť
		
		jButton4.setBounds(new Rectangle(260, 376, 80, 35));
		jButton4.setText("��    ��");				//������Ӱ�ť
			
		colnames.add("��������");			//��������ӱ�ͷ��Ϣ
        colnames.add("������");
        colnames.add("����");
        colnames.add("���ʽ");
        colnames.add("������");
        colnames.add("֧Ʊ��");
        colnames.add("����");
        colnames.add("������");
        colnames.add("�Ƶ���");
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
