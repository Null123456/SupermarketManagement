package com.cs.from;

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

	JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JTextField jTextField3 = new JTextField();
    JTextField jTextField4 = new JTextField();
    JTextField jTextField5 = new JTextField();
    JTextField jTextField6 = new JTextField();
    JTextField jTextField7 = new JTextField();
    JTextField jTextField8 = new JTextField();

    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JButton jButton5 = new JButton();
    
    JScrollPane jScrollPane1 = new JScrollPane();
    JTable jTable1 = new JTable();
    Vector colnames = new Vector(); //��ͷ
    Vector colnames1 = new Vector(); //����
    Vector colnames2 = new Vector(); //����
	
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
		this(new Frame(),"�ɹ���",false);
		this.setSize(820, 570);
		this.setLocation(100, 100);
		this.setVisible(true);			//��ʾ����
	}
	private void jbInit() throws Exception {
		panel1.setLayout(null); 				//���Ĭ�ϵĲ���
		
		jLabel1.setText("��Ʒ����");				//������Ʒ�������ƴ�С��λ��
		jLabel1.setBounds(new Rectangle(37, 28, 75, 21));
		jLabel2.setText("��Ʒ����");				//������Ʒ���Ʊ�ǩ
		jLabel2.setBounds(new Rectangle(226, 28, 75, 21));
		jLabel3.setText("�ɹ�����");				//��������ű�ǩ
		jLabel3.setBounds(new Rectangle(411, 28, 75, 21));
		jLabel4.setText("��        ��");				//������Ʒ���Ʊ�ǩ
		jLabel4.setBounds(new Rectangle(37, 59, 75, 21));
		jLabel5.setText("��        ��");				//���õ��۱�ǩ
		jLabel5.setBounds(new Rectangle(226, 59, 75, 21));
		jLabel6.setText("��        ��");				//���ý���ǩ
		jLabel6.setBounds(new Rectangle(411, 59, 75, 21));
		jLabel7.setText("�µ�����");				//�����µ����ڱ�ǩ
		jLabel7.setBounds(new Rectangle(589, 28, 75, 21));
		jLabel8.setText("��������(��)");				//�����µ����ڱ�ǩ
		jLabel8.setBounds(new Rectangle(589, 59, 75, 21));
		
		jScrollPane1.setBounds(new Rectangle(14, 126, 765, 381));
		
		jTextField1.setBounds(new Rectangle(104, 28, 111, 21));		//����ѡ���ı���
	    jTextField2.setBounds(new Rectangle(286, 28, 111, 21));
	    jTextField2.setEnabled(false);
	    jTextField3.setBounds(new Rectangle(469, 28, 111, 21));
	    jTextField4.setBounds(new Rectangle(104, 59, 111, 21));
	    jTextField4.setText("1");
	    jTextField5.setBounds(new Rectangle(286, 59, 111, 21));
	    jTextField5.setEnabled(false);
	    jTextField6.setBounds(new Rectangle(469, 59, 111, 21));
	    jTextField6.setEnabled(false);
	    jTextField7.setBounds(new Rectangle(645, 28, 128, 21));
	    jTextField7.setEnabled(false);
	    jTextField8.setBounds(new Rectangle(666, 59, 107, 21));
	    Timer timer = new Timer();
	    timer.schedule(new RemindTask(), 0, 1000);		//�õ���ǰ��ʱ��
	    
		jButton1.setBounds(new Rectangle(137, 93, 83, 25));
		jButton1.setText("ȷ��");				//������Ӱ�ť
		
		jButton2.setBounds(new Rectangle(244, 93, 83, 25));
		jButton2.setText("ɾ��");				//������Ӱ�ť
		
		jButton3.setBounds(new Rectangle(351, 93, 83, 25));
		jButton3.setText("�ύ");				//������Ӱ�ť
		
		jButton4.setBounds(new Rectangle(457, 93, 83, 25));
		jButton4.setText("���");				//������Ӱ�ť
		
		jButton5.setBounds(new Rectangle(565, 93, 83, 25));
		jButton5.setText("�˳�");				//������Ӱ�ť
		
		//��������ӱ�ͷ��Ϣ
		colnames.add("��Ʒ����");		
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

		panel1.add(jTextField1);
		panel1.add(jTextField2);
		panel1.add(jTextField3);
		panel1.add(jTextField4);
		panel1.add(jTextField5);
		panel1.add(jTextField6);
		panel1.add(jTextField7);
		panel1.add(jTextField8);

		panel1.add(jButton1);
		panel1.add(jButton2);
		panel1.add(jButton3);
		panel1.add(jButton4);
		panel1.add(jButton5);
		
		panel1.add(jScrollPane1);
	}
	class RemindTask extends TimerTask {
		public void run() {
			/*jTextField7.setText(GetT);*/
		}
	}
	public void jButton1_actionPerformed(ActionEvent e) {
		jLabel1.setText("�Ұ���");	
	}
}

