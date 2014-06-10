package com.cs.from;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.cs.means.GetTime;
/**
 * �ڹ��������ӽ�����BackSale�࣬
 * ���Ҷ����˸ô�����Ҫ�ĸ��������
 * �����ı������JLabel��ǩ��JButton��ť��Panel�����������б�����
 * �������������캯����һ�����в�����ʵ�ֽ���ĳ�ʼ����
 * �ڶ���û�в������������ô��в����Ĺ��캯����
 * @author MiracleWong
 *
 */
public class BackSale extends JDialog {
	
	//��ĳ�Ա����
	JPanel panel1 = new JPanel();
	//��ǩ
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
	//�ı���
	JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JTextField jTextField3 = new JTextField();
    JTextField jTextField4 = new JTextField();
    JTextField jTextField5 = new JTextField();
    //��ť
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JButton jButton5 = new JButton();
    
    JComboBox jComboBox1 = new JComboBox();		//���Ͽ�
    JComboBox jComboBox2 = new JComboBox();		//���Ͽ�
    
    JScrollPane jScrollPane1 = new JScrollPane();
    JTable jTable1 = new JTable();
    Vector colnames = new Vector(); //��ͷ
    Vector colnames1 = new Vector(); //����
    Vector colnames2 = new Vector(); //����

	public  BackSale(Frame ower, String title, boolean modal) {
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
	public BackSale() {
		// TODO Auto-generated constructor stub
		this(new Frame(),"��/�˻�ά��",false);
		this.setSize(600, 500);				//���ô����С
		setLocationRelativeTo(getOwner());	//�������
		this.setVisible(true);				//��ʾ����
	}
	private void jbInit() throws Exception {
		panel1.setLayout(null); 			//������ָ�ʽ

		jLabel1.setBorder(BorderFactory.createEtchedBorder());
		jLabel1.setBounds(new Rectangle(29, 7, 536, 36));
		jLabel2.setText("���");			//���
		jLabel2.setBounds(new Rectangle(35, 20, 40, 15));
		jLabel3.setText("ʱ�䣺");			//ʱ��
		jLabel3.setBounds(new Rectangle(185, 20, 40, 15));
		jLabel4.setText("����Ա��");			//����Ա
		jLabel4.setBounds(new Rectangle(385, 20, 60, 15));
		
		jLabel5.setBorder(BorderFactory.createEtchedBorder());
		jLabel5.setBounds(new Rectangle(29, 42, 536, 36));
		jLabel6.setText("��Ʒ��ţ�");			//��Ʒ���
		jLabel6.setBounds(new Rectangle(35, 55, 80, 15));
		jLabel7.setText("������");			//����
		jLabel7.setBounds(new Rectangle(235, 55, 40, 15));
		jLabel8.setText("�������ۣ�");			//��������
		jLabel8.setBounds(new Rectangle(385, 55, 80, 15));
		jLabel9.setText("��ע��");			//��ע
		jLabel9.setBounds(new Rectangle(35, 365, 42, 15));
		
		jScrollPane1.setBounds(new Rectangle(29, 77, 537, 275));
		
		//�����ı���
	    jTextField1.setBounds(new Rectangle(225, 13, 150, 24));
	    jTextField2.setBounds(new Rectangle(100, 48, 125, 24));
	    jTextField3.setBounds(new Rectangle(275, 48, 100, 24));
	    jTextField4.setBounds(new Rectangle(455, 48, 100, 24));
	    jTextField5.setBounds(new Rectangle(70, 350, 496, 54));
	    
	    //������
	    jComboBox1.setBounds(new Rectangle(75, 13, 100, 24));
	    jComboBox1.addItem("����");
        jComboBox1.addItem("�˻�");
        
        jComboBox2.setBounds(new Rectangle(455, 13, 100, 24));
	    jComboBox2.addItem("����");
	    jComboBox2.addItem("����");
        jComboBox2.addItem("Ѧ����");
        
	    Timer timer = new Timer();
	    timer.schedule(new RemindTask(), 0, 1000);		//�õ���ǰ��ʱ��
	    
		jButton1.setBounds(new Rectangle(46, 409, 80, 30));
		jButton1.setText("ȷ��");				//ȷ��
		jButton1.addActionListener(new JoinAndExceed_jButton1_actionAdapter(this));
		
		jButton2.setBounds(new Rectangle(146, 409, 80, 30));
		jButton2.setText("ɾ��");				//ɾ��
		jButton2.addActionListener(new JoinAndExceed_jButton2_actionAdapter(this));
		
		jButton3.setBounds(new Rectangle(246, 409, 80, 30));
		jButton3.setText("ȡ��");             	//ȡ��
		jButton3.addActionListener(new JoinAndExceed_jButton3_actionAdapter(this));
		
		jButton4.setBounds(new Rectangle(346, 409, 80, 30));
		jButton4.setText("�ύ");				//�ύ
		jButton4.addActionListener(new JoinAndExceed_jButton4_actionAdapter(this));
		
		jButton5.setBounds(new Rectangle(446, 409, 80, 30));
		jButton5.setText("��ѯ");				//��ѯ
		jButton5.addActionListener(new JoinAndExceed_jButton5_actionAdapter(this));
		
		//��������ӱ�ͷ��Ϣ
		colnames.add("��Ʒ���");
        colnames.add("��Ʒ����");
        colnames.add("����");
        colnames.add("������");
        colnames.add("����");
        colnames.add("���");
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
		panel1.add(jButton1);
		panel1.add(jButton2);
		panel1.add(jButton3);
		panel1.add(jButton4);
		panel1.add(jButton5);
		panel1.add(jComboBox1);
		panel1.add(jComboBox2);	
		panel1.add(jScrollPane1);
	}
	class RemindTask extends TimerTask {
		public void run() {
			jTextField1.setText(GetTime.getTime());
		}
	}
	
	Vector addAllData = new Vector(); 		//������Ʒ�������Ϣ
	public void jButton1_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
	
	public void jButton2_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
	
	public void jButton3_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
	
	public void jButton4_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
	
	public void jButton5_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
}

class JoinAndExceed_jButton1_actionAdapter implements ActionListener {
	private BackSale adaptee;
	JoinAndExceed_jButton1_actionAdapter(BackSale adaptee) {
        this.adaptee = adaptee;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		adaptee.jButton1_actionPerformed(e);
	}
}

class JoinAndExceed_jButton2_actionAdapter implements ActionListener {
    private BackSale adaptee;
    JoinAndExceed_jButton2_actionAdapter(BackSale adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}

class JoinAndExceed_jButton3_actionAdapter implements ActionListener {
    private BackSale adaptee;
    JoinAndExceed_jButton3_actionAdapter(BackSale adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}

class JoinAndExceed_jButton4_actionAdapter implements ActionListener {
    private BackSale adaptee;
    JoinAndExceed_jButton4_actionAdapter(BackSale adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}

class JoinAndExceed_jButton5_actionAdapter implements ActionListener {
    private BackSale adaptee;
    JoinAndExceed_jButton5_actionAdapter(BackSale adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}