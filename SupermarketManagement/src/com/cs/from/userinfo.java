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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.cs.means.GetTime;
/**
 * �ڹ����������û���ѯ��userinfo�࣬
 * ���Ҷ����˸ô�����Ҫ�ĸ��������
 * �����ı������JLabel��ǩ��JButton��ť��Panel�����������б�����
 * @author Miracle_Wong
 *
 */
public class userinfo extends JDialog {
	
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
    JTextField jTextField10 = new JTextField();
    
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JButton jButton5 = new JButton();
    
    JComboBox jComboBox1 = new JComboBox();		//���Ͽ�

	public  userinfo(Frame ower, String title, boolean modal) {
		super(ower, title, modal);
		try {
			//��Java���������ر�ʱ���ã�ͬʱ������������ڴ��������
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			jbInit();		//���ڵĳ�ʼ������
			pack();			//ˢ�½���
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public userinfo() {
		// TODO Auto-generated constructor stub
		this(new Frame(),"��ѯ�û�",false);
		this.setSize(500, 400);				//���ô����С
		this.setLocation(300, 200);			//���ô���λ��
		this.setVisible(true);				//��ʾ����
	}
	private void jbInit() throws Exception {
		panel1.setLayout(null); 			//������ָ�ʽ
		jLabel1.setText("����");				//���ÿ���
		jLabel1.setBounds(new Rectangle(51, 53, 42, 15));
		jLabel2.setText("�ֿ���");			//���óֿ���
		jLabel2.setBounds(new Rectangle(51, 93, 42, 15));
		jLabel3.setText("֤����");			//����֤����
		jLabel3.setBounds(new Rectangle(51, 133, 42, 15));
		jLabel4.setText("����");				//��������
		jLabel4.setBounds(new Rectangle(51, 173, 42, 15));
		jLabel5.setText("��������");			//���ÿ�������
		jLabel5.setBounds(new Rectangle(51, 213, 57, 15));
		jLabel6.setText("����");				//��������
		jLabel6.setBounds(new Rectangle(261, 53, 42, 15));
		jLabel7.setText("����");				//��������
		jLabel7.setBounds(new Rectangle(261, 93, 42, 15));
		jLabel8.setText("����");				//���û���
		jLabel8.setBounds(new Rectangle(261, 133, 42, 15));
		jLabel9.setText("�ۿ���");			//�����ۿ���
		jLabel9.setBounds(new Rectangle(261, 173, 42, 15));
		jLabel10.setText("��ע");			//���ñ�ע��ǩ
		jLabel10.setBounds(new Rectangle(261, 213, 42, 15));
		
		
		jTextField1.setBounds(new Rectangle(109, 48, 132, 27));		//����ѡ���ı���
	    jTextField2.setBounds(new Rectangle(109, 88, 132, 27));
	    jTextField3.setBounds(new Rectangle(109, 128, 132, 27));
	    jTextField4.setBounds(new Rectangle(109, 168, 132, 27));
	    jTextField5.setBounds(new Rectangle(114, 208, 127, 27));
//	    jTextField6.setBounds(new Rectangle(319, 48, 132, 27));
	    jComboBox1.setBounds(new Rectangle(319, 48, 132, 27));
	    jComboBox1.addItem("��ͨ��Ա");
        jComboBox1.addItem("����Ա");
        jComboBox1.addItem("����Ա");
        
	    jTextField7.setBounds(new Rectangle(319, 88, 132, 27));
	    jTextField7.setText("1��");
	    jTextField7.setEnabled(false);
	    jTextField8.setBounds(new Rectangle(319, 128, 132, 27));
	    jTextField8.setText("0");
	    jTextField8.setEnabled(false);
	    jTextField9.setBounds(new Rectangle(319, 168, 132, 27));
	    jTextField9.setText("90%");
	    jTextField9.setEnabled(false);
	    jTextField10.setBounds(new Rectangle(334, 208, 117, 27));
	    
	    Timer timer = new Timer();
	    timer.schedule(new RemindTask(), 0, 1000);		//�õ���ǰ��ʱ��
	    
		jButton1.setBounds(new Rectangle(105, 279, 83, 25));
		jButton1.setText("��ѯ");				//���ò�ѯ��ť
		jButton1.addActionListener(new Select_card_jButton1_actionAdapter(this));
		
		jButton2.setBounds(new Rectangle(305, 279, 83, 25));
		jButton2.setText("ȡ��");				//����ȡ����ť
		jButton2.addActionListener(new Select_card_jButton1_actionAdapter(this));
		
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
		panel1.add(jTextField10);
		panel1.add(jButton1);
		panel1.add(jButton2);
		panel1.add(jButton3);
		panel1.add(jButton4);
		panel1.add(jButton5);
		panel1.add(jComboBox1);		
	}
	class RemindTask extends TimerTask {
		public void run() {
			jTextField5.setText(GetTime.getTime());
		}
	}
	
	Vector addAllData = new Vector(); 		//������Ʒ�������Ϣ
	public void jButton1_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
	public void jButton2_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
}

class Select_card_jButton1_actionAdapter implements ActionListener {
	private userinfo adaptee;
	Select_card_jButton1_actionAdapter(userinfo adaptee) {
        this.adaptee = adaptee;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		adaptee.jButton1_actionPerformed(e);
	}
}

class Select_card_jButton2_actionAdapter implements ActionListener {
    private userinfo adaptee;
    Select_card_jButton2_actionAdapter(userinfo adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}