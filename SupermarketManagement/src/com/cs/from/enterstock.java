package com.cs.from;

import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.Toolkit;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;

import com.cs.means.GetTime;

public class enterstock extends JDialog {
	
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
//		this.getContentPane().setLayout(null); 	//������е��������Ϣ
		
		jLabel1.setText("���");				//�������
		jLabel1.setBounds(new Rectangle(37, 28, 75, 21));
		jLabel2.setText("ʱ�䣺");				//����ʱ��
		jLabel2.setBounds(new Rectangle(226, 28, 75, 21));
		jLabel3.setText("�Ƶ��ˣ�");				//�����Ƶ���
		jLabel3.setBounds(new Rectangle(411, 28, 75, 21));
		jLabel4.setText("����¼��");				//���û���¼��
		jLabel4.setBounds(new Rectangle(37, 59, 75, 21));
		jLabel5.setText("��Ʒ��ţ�");				//���õ��۱�ǩ
		jLabel5.setBounds(new Rectangle(226, 59, 75, 21));
		jLabel6.setText("������");				//���ý���ǩ
		jLabel6.setBounds(new Rectangle(411, 59, 75, 21));
		jLabel7.setText("��������");				//�����µ����ڱ�ǩ
		jLabel7.setBounds(new Rectangle(589, 28, 75, 21));
		jLabel8.setText("�ֿ�ţ�");			//���ø������ޱ�ǩ
		jLabel8.setBounds(new Rectangle(589, 59, 75, 21));
		jLabel9.setText("�ֿ�ţ�");			//���ø������ޱ�ǩ
		jLabel9.setBounds(new Rectangle(589, 59, 75, 21));
		jLabel10.setText("�ֿ�ţ�");			//���ø������ޱ�ǩ
		jLabel10.setBounds(new Rectangle(589, 59, 75, 21));
		
		jScrollPane1.setBounds(new Rectangle(24, 166, 600, 240));
		
		jTextField1.setBounds(new Rectangle(104, 28, 111, 21));		//����ѡ���ı���
		jTextField1.setText("1");
	    jTextField2.setBounds(new Rectangle(286, 28, 111, 21));
	    jTextField1.setText("2");
	    jTextField2.setEnabled(false);
	    jTextField3.setBounds(new Rectangle(469, 28, 111, 21));
	    jTextField3.setText("3");
	    jTextField4.setBounds(new Rectangle(104, 59, 111, 21));
	    jTextField4.setText("4");
	    jTextField5.setBounds(new Rectangle(286, 59, 111, 21));
	    jTextField5.setText("5");
	    jTextField5.setEnabled(false);
	    jTextField6.setBounds(new Rectangle(469, 59, 111, 21));
	    jTextField6.setText("6");
	    jTextField6.setEnabled(false);
	    jTextField7.setBounds(new Rectangle(645, 28, 128, 21));
	    jTextField7.setText("7");
	    jTextField7.setEnabled(false);
	    jTextField8.setBounds(new Rectangle(666, 59, 107, 21));
	    jTextField8.setText("8");
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
			jTextField7.setText(GetTime.getTime());
		}
	}
	
	Vector inserAll = new Vector();		//������Ʒ�������Ϣ
	public void jButton1_actionPerformed(ActionEvent e) {
		jLabel1.setText("�Ұ���");	
		if ((jTextField1.getText().length() == 0) || 
				(jTextField1.getText().length() == 0) ||
				(jTextField3.getText().length() == 0) ||
				(jTextField5.getText().length() == 0) ||
				(jTextField8.getText().length() == 0))  {
				JOptionPane.showMessageDialog(this, "�ύ�����ݲ��Ϸ�������", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
		Vector insertone = new Vector();
        insertone.add(jTextField1.getText());
        insertone.add(jTextField2.getText());
        insertone.add(jTextField3.getText());
        insertone.add(jTextField4.getText());
        insertone.add(jTextField5.getText());
        insertone.add(jTextField6.getText());
        insertone.add(jTextField7.getText());
        insertone.add(jTextField8.getText());
        inserAll.add(insertone);
        jTable1 = Mytable.maketable(inserAll, colnames); //��ʾ����
        jScrollPane1.getViewport().add(jTable1); //�ѱ�װ������
	}
	
	//ɾ����ť����Button2�Ĺ���ʵ��
	public void jButton2_actionPerformed(ActionEvent e) {
		int row = jTable1.getSelectedRow();					//�õ�ѡ�е�����
		inserAll.remove(row);								//ɾ����ѣ���е�����
		jTable1 = Mytable.maketable(inserAll, colnames);	//��ʾ����
		jScrollPane1.getViewport().add(jTable1);
	}
	
	//ȫ����հ�ť����Button4�Ĺ���ʵ��
	public void jButton3_actionPerformed(ActionEvent e) {
		
	}	
	
	//ȫ����հ�ť����Button4�Ĺ���ʵ��
	public void jButton4_actionPerformed(ActionEvent e) {
		inserAll.removeAllElements(); 			//��ս����
		jTable1 = Mytable.maketable(inserAll, colnames);	//��ʾ����
		jScrollPane1.getViewport().add(jTable1);
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

