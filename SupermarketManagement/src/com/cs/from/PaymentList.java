package com.cs.from;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
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

import com.cs.from.Stock.RemindTask;
import com.cs.means.GetTime;

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
    JTextField jTextField3 = new JTextField();
    JTextField jTextField4 = new JTextField();
    JTextField jTextField5 = new JTextField();
    JTextField jTextField6 = new JTextField();
    JTextField jTextField7 = new JTextField();
    JTextField jTextField8 = new JTextField();
    JTextField jTextField9 = new JTextField();
    
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    
    JScrollPane jScrollPane1 = new JScrollPane();
    JTable jTable1 = new JTable();
    JTableHeader jTableHeader1 = jTable1.getTableHeader();
    
    Vector colnames = new Vector(); 	//��ͷ
    Vector colnames1 = new Vector(); 	//����    
    Vector colnames2 = new Vector(); 	//����    
	
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
		this.setSize(800, 500);				//���ý����С
		this.setLocation(100, 100);
		this.setVisible(true);				//��ʾ����
	}
	private void jbInit() throws Exception {
		panel1.setLayout(null); 				//���ò���Ϊ��
		jLabel1.setText("���ţ�");				//���õ���
		jLabel1.setBounds(new Rectangle(12, 64, 52, 18));
		jLabel2.setText("�����̣�");				//���ù�Ӧ�̱�ǩ
		jLabel2.setBounds(new Rectangle(12,	104, 52, 18));
		jLabel3.setText("���ң�");				//���û��ұ�ǩ
		jLabel3.setBounds(new Rectangle(12, 144, 52, 18));
		jLabel4.setText("�����");				//���ø������ǩ
		jLabel4.setBounds(new Rectangle(12, 192, 78, 18));
		jLabel5.setText("���ʽ��");				//���ø��ʽ��ǩ
		jLabel5.setBounds(new Rectangle(12, 229, 78, 18));
		jLabel6.setText("֧Ʊ�ţ�");				//����֧Ʊ�ű�ǩ
		jLabel6.setBounds(new Rectangle(12, 269, 60, 18));
		jLabel7.setText("���ڣ�");				//�������ڱ�ǩ
		jLabel7.setBounds(new Rectangle(12, 309, 52, 18));
		jLabel8.setText("�����ˣ�");				//���þ����˱�ǩ
		jLabel8.setBounds(new Rectangle(12, 349, 52, 18));
		jLabel9.setText("�Ƶ��ˣ�");				//�����Ƶ��˱�ǩ
		jLabel9.setBounds(new Rectangle(12, 389, 52, 18));
		
		jLabel10.setText("���");				//���ø����ǩ
		jLabel10.setBounds(new Rectangle(43, 5, 146, 52));
//		jLabel10.setFont(new java.awt.Font("����", Font.BOLD, 30));
		
		jTextField1.setText("1");
		jTextField1.setBounds(new Rectangle(64, 64, 149, 20));		//����ѡ���ı���
		jTextField2.setText("2");
	    jTextField2.setBounds(new Rectangle(64, 104, 149, 20));
	    jTextField3.setText("3");
	    jTextField3.setBounds(new Rectangle(64, 144, 149, 20));
	    jTextField4.setText("4");
	    jTextField4.setBounds(new Rectangle(88, 192, 125, 20));
	    jTextField5.setText("5");
	    jTextField5.setBounds(new Rectangle(88, 229, 125, 20));
	    jTextField6.setText("6");
	    jTextField6.setBounds(new Rectangle(64, 269, 149, 20));
	    jTextField7.setBounds(new Rectangle(64, 309, 149, 20));
	    jTextField8.setText("8");
	    jTextField8.setBounds(new Rectangle(64, 349, 149, 20));
	    jTextField9.setText("9");
	    jTextField9.setBounds(new Rectangle(64, 389, 149, 20));
	    
	    Timer timer = new Timer();
	    timer.schedule(new RemindTask(), 0, 1000);		//�õ���ǰ��ʱ��
	    
	    
	    jScrollPane1.setBounds(new Rectangle(230, 17, 549, 353));
	    
	    jButton1.setBounds(new Rectangle(260, 376, 80, 35));
		jButton1.setText("ȷ��");				//�������
		jButton1.addActionListener(new PaymentList_jButton1_actionAdapter(this));
		
		jButton2.setBounds(new Rectangle(380, 376, 80, 35));
		jButton2.setText("�µ�");				//������Ӱ�ť
		jButton2.addActionListener(new PaymentList_jButton2_actionAdapter(this));
		
		jButton3.setBounds(new Rectangle(500, 376, 80, 35));
		jButton3.setText("ɾ��");				//������Ӱ�ť
		jButton3.addActionListener(new PaymentList_jButton3_actionAdapter(this));
		
		jButton4.setBounds(new Rectangle(620, 376, 80, 35));
		jButton4.setText("�˳�");				//������Ӱ�ť
		jButton4.addActionListener(new PaymentList_jButton4_actionAdapter(this));
		
		colnames.add("��������");			//��������ӱ�ͷ��Ϣ
        colnames.add("������");
        colnames.add("����");
        colnames.add("������");
        colnames.add("���ʽ");
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
		panel1.add(jButton4);
		panel1.add(jScrollPane1);		
	}	
	
	class RemindTask extends TimerTask {
		public void run() {
			jTextField7.setText(GetTime.getTime());
		}
	}
	Vector paymentAll  = new Vector();		//���и������Ϣ
	//ȷ������Button1�Ĺ���ʵ��
	public void jButton1_actionPerformed(ActionEvent e) {
		jLabel1.setText("�Ұ���");
		Vector paymentOne = new Vector();
//		colnames.removeAllElements();		//������е�Ԫ��
		  
		paymentOne.add(jTextField1.getText());
        paymentOne.add(jTextField2.getText());
        paymentOne.add(jTextField3.getText());
        paymentOne.add(jTextField4.getText());
        paymentOne.add(jTextField5.getText());
        paymentOne.add(jTextField6.getText());
        paymentOne.add(jTextField7.getText());
        paymentOne.add(jTextField8.getText());
        paymentOne.add(jTextField9.getText());
        
        paymentAll.add(paymentOne);
        jTable1 = Mytable.maketable(paymentAll, colnames);
        jScrollPane1.getViewport().add(jTable1);
	}
	
	//�µ�����Button2�Ĺ���ʵ��
	public void jButton2_actionPerformed(ActionEvent e) {
		this.setVisible(false);	
	}
	
	//ɾ������Button3�Ĺ���ʵ��
	public void jButton3_actionPerformed(ActionEvent e) {
		int row = jTable1.getSelectedRow();
		paymentAll.remove(row);
		jTable1 = Mytable.maketable(paymentAll, colnames); // ��ʾ����
		jScrollPane1.getViewport().add(jTable1); // �ѱ�װ������
	}
	
	//�˳�����Button4�Ĺ���ʵ��
	public void jButton4_actionPerformed(ActionEvent e) {
		this.setVisible(false);	
	}
}

class PaymentList_jButton1_actionAdapter implements ActionListener {
	private PaymentList adaptee;
	PaymentList_jButton1_actionAdapter(PaymentList adaptee) {
        this.adaptee = adaptee;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		adaptee.jButton1_actionPerformed(e);
	}
}

class PaymentList_jButton2_actionAdapter implements ActionListener {
	private PaymentList adaptee;
	PaymentList_jButton2_actionAdapter(PaymentList adaptee) {
        this.adaptee = adaptee;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		adaptee.jButton2_actionPerformed(e);
	}
}

class PaymentList_jButton3_actionAdapter implements ActionListener {
	private PaymentList adaptee;
	PaymentList_jButton3_actionAdapter(PaymentList adaptee) {
        this.adaptee = adaptee;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		adaptee.jButton3_actionPerformed(e);
	}
}

class PaymentList_jButton4_actionAdapter implements ActionListener {
	private PaymentList adaptee;
	PaymentList_jButton4_actionAdapter(PaymentList adaptee) {
        this.adaptee = adaptee;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		adaptee.jButton4_actionPerformed(e);
	}
}
