package com.cs.from;

import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.Toolkit;
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
import javax.swing.table.JTableHeader;

import com.cs.means.GetTime;

/**
 * �ڹ��������ӽ�����enterstock�࣬
 * ���Ҷ����˸ô�����Ҫ�ĸ��������
 * �����ı������JLabel��ǩ��JButton��ť��Panel�����������б�����
 * �������������캯����һ�����в�����ʵ�ֽ���ĳ�ʼ����
 * �ڶ���û�в������������ô��в����Ĺ��캯����
 * @author MiracleWong
 *
 */
public class enterstock extends JDialog {
	
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
	JLabel jLabel11 = new JLabel();
	JLabel jLabel12 = new JLabel();
	//�ı���
	JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JTextField jTextField3 = new JTextField();
    JTextField jTextField4 = new JTextField();
    JTextField jTextField5 = new JTextField();
    JTextField jTextField6 = new JTextField();
    JTextField jTextField7 = new JTextField();
    //��ť
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JButton jButton5 = new JButton();
    //������ѡ��
    JComboBox jComboBox1 = new JComboBox();
    JComboBox jComboBox2 = new JComboBox();
    JComboBox jComboBox3 = new JComboBox();
    
    JScrollPane jScrollPane1 = new JScrollPane();
    JTable jTable1 = new JTable();
    Vector colnames = new Vector(); //��ͷ
    Vector colnames1 = new Vector(); //����
    Vector colnames2 = new Vector(); //����
	
	public  enterstock(Frame ower, String title, boolean modal) {
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
	public enterstock() {
		// TODO Auto-generated constructor stub
		this(new Frame(),"��/�������",false);
		this.setSize(665, 500);
//		this.setLocation(100, 100);
		setLocationRelativeTo(getOwner());
		this.setVisible(true);			//��ʾ����
	}
	private void jbInit() throws Exception {
		panel1.setLayout(null); 				//���Ĭ�ϵĲ��ֹ���

		jLabel1.setBorder(BorderFactory.createEtchedBorder());
		jLabel1.setBounds(new Rectangle(30, 7, 600, 36));
		jLabel2.setText("���");			//���
		jLabel2.setBounds(new Rectangle(40, 20, 40, 15));
		jLabel3.setText("ʱ�䣺");			//ʱ��
		jLabel3.setBounds(new Rectangle(205, 20, 40, 15));
		jLabel4.setText("����Ա��");			//����Ա
		jLabel4.setBounds(new Rectangle(425, 20, 60, 15));
		
		jLabel5.setText("����¼��");				//����¼��
		jLabel5.setBounds(new Rectangle(30, 45, 102, 26));
		
		jLabel6.setBorder(BorderFactory.createEtchedBorder());
		jLabel6.setBounds(new Rectangle(30, 72, 600, 70));
		jLabel7.setText("��Ʒ��ţ�");			//��Ʒ���
		jLabel7.setBounds(new Rectangle(40, 82, 80, 15));
		jLabel8.setText("��        ����");			//����
		jLabel8.setBounds(new Rectangle(235, 82, 80, 15));
		jLabel9.setText("�������ۣ�");			//��������
		jLabel9.setBounds(new Rectangle(425, 82, 80, 15));
		
		jLabel10.setText("��  ��  �ţ�");				//�ֿ��
		jLabel10.setBounds(new Rectangle(40, 112, 80, 15));
		jLabel11.setText("��  ��  �");				//�ܽ��
		jLabel11.setBounds(new Rectangle(235, 112, 80, 15));
		jLabel12.setText("��  ��  �ˣ�");				//������
		jLabel12.setBounds(new Rectangle(425, 112, 80, 15));
		
		jScrollPane1.setBounds(new Rectangle(30, 150, 600, 240));
		
		//�����ı���
		jTextField1.setBounds(new Rectangle(250, 13, 150, 24));		
		jTextField2.setBounds(new Rectangle(110, 78, 115, 24));
	    jTextField3.setBounds(new Rectangle(305, 78, 95, 24));	    
	    jTextField4.setBounds(new Rectangle(495, 78, 115, 24));

	    jTextField5.setBounds(new Rectangle(305, 108, 95, 24));
	    jTextField6.setBounds(new Rectangle(495, 108, 115, 24));
	    
	    jTextField7.setBounds(new Rectangle(666, 59, 107, 21));
		
		//������
	    jComboBox1.setBounds(new Rectangle(85, 13, 100, 24));
	    jComboBox1.addItem("���");
        jComboBox1.addItem("����");
        
        jComboBox2.setBounds(new Rectangle(490, 13, 100, 24));
	    jComboBox2.addItem("����");
	    jComboBox2.addItem("����");
        jComboBox2.addItem("Ѧ����");
        
        jComboBox3.setBounds(new Rectangle(110, 108, 115, 24));
        jComboBox3.addItem("CK0001");
        jComboBox3.addItem("CK0002");
        jComboBox3.addItem("CK0003");
		
	    Timer timer = new Timer();
	    timer.schedule(new RemindTask(), 0, 1000);		//�õ���ǰ��ʱ��
	    
		jButton1.setBounds(new Rectangle(46, 409, 80, 30));
		jButton1.setText("ȷ��");				//����ȷ�ϰ�ť
		jButton1.addActionListener(new Put_Out_Depot_jButton1_actionAdapter(this));
		
		jButton2.setBounds(new Rectangle(166, 409, 80, 30));
		jButton2.setText("ɾ��");				//����ɾ����ť
		jButton2.addActionListener(new Put_Out_Depot_jButton2_actionAdapter(this));
		
		jButton3.setBounds(new Rectangle(286, 409, 80, 30));
		jButton3.setText("����");             	//�������ð�ť
		
		jButton4.setBounds(new Rectangle(406, 409, 80, 30));
		jButton4.setText("�ύ");				//�����ύ��ť
		jButton4.addActionListener(new Put_Out_Depot_jButton4_actionAdapter(this));
		
		jButton5.setBounds(new Rectangle(526, 409, 80, 30));
		jButton5.setText("�˳�");				//�����˳���ť
		jButton5.addActionListener(new Put_Out_Depot_jButton5_actionAdapter(this));
		
		//��������ӱ�ͷ��Ϣ
		colnames.add("���");		
	    colnames.add("����");
	    colnames.add("������");
	    colnames.add("�ܽ��");
	    colnames.add("����");
	    colnames.add("�ֿ��");
	    colnames.add("������");
	    colnames.add("���");
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
		panel1.add(jLabel11);
		panel1.add(jLabel12);

		panel1.add(jTextField1);
		panel1.add(jTextField2);
		panel1.add(jTextField3);
		panel1.add(jTextField4);
		panel1.add(jTextField5);
		panel1.add(jTextField6);
		panel1.add(jTextField7);

		panel1.add(jButton1);
		panel1.add(jButton2);
		panel1.add(jButton3);
		panel1.add(jButton4);
		panel1.add(jButton5);
		panel1.add(jComboBox1);
		panel1.add(jComboBox2);
		panel1.add(jComboBox3);
		panel1.add(jScrollPane1);
	}
	class RemindTask extends TimerTask {
		public void run() {
			jTextField1.setText(GetTime.getTime());
		}
	}
	
	Vector inserAll = new Vector();		//������Ʒ�������Ϣ
	//ȷ�ϰ�ť����Button1�Ĺ���ʵ��
	public void jButton1_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
	
	//ɾ����ť����Button2�Ĺ���ʵ��
	public void jButton2_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
	
	//���ð�ť����Button3�Ĺ���ʵ��
	public void jButton3_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}	
	
	//�ύ��ť����Button4�Ĺ���ʵ��
	public void jButton4_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
	
	//�˳���ť����Button5�Ĺ���ʵ��
	public void jButton5_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
}


class Put_Out_Depot_jButton1_actionAdapter implements ActionListener {
	private enterstock adaptee;
	Put_Out_Depot_jButton1_actionAdapter(enterstock adaptee) {
        this.adaptee = adaptee;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		adaptee.jButton1_actionPerformed(e);
	}
}

class Put_Out_Depot_jButton2_actionAdapter implements ActionListener {
    private enterstock adaptee;
    Put_Out_Depot_jButton2_actionAdapter(enterstock adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}

class Put_Out_Depot_jButton3_actionAdapter implements ActionListener {
    private enterstock adaptee;
    Put_Out_Depot_jButton3_actionAdapter(enterstock adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
       adaptee.jButton3_actionPerformed(e);
    }
}

class Put_Out_Depot_jButton4_actionAdapter implements ActionListener {
    private enterstock adaptee;
    Put_Out_Depot_jButton4_actionAdapter(enterstock adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton4_actionPerformed(e);
    }
}

class Put_Out_Depot_jButton5_actionAdapter implements ActionListener {
    private enterstock adaptee;
    Put_Out_Depot_jButton5_actionAdapter(enterstock adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton5_actionPerformed(e);
    }
}

