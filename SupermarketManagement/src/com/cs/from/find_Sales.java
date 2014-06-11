package com.cs.from;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Rectangle;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.cs.tools.DateChooser;

/**
 * ��Ʒ���۵Ĳ�ѯ��find_Sales��
 * ���Ҷ����˸ô�����Ҫ�ĸ��������
 * �����ı������JLabel��ǩ��JButton��ť��Panel���������
 * �������������캯����һ�����в�����ʵ�ֽ���ĳ�ʼ����
 * �ڶ���û�в������������ô��в����Ĺ��캯����
 * @author MiracleWong
 *
 */
public class find_Sales extends JDialog {
	
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
	JLabel jLabel11 = new JLabel();
	JLabel jLabel12 = new JLabel();
	
	//�ı���
	JTextField jTextField1 = new JTextField();
	JTextField jTextField2 = new JTextField();
	
	final DateChooser start = new DateChooser();
	final DateChooser end = new DateChooser();
	
	JButton jButton_OK = new JButton();
	
	JScrollPane jScrollPane1 = new JScrollPane();
	JTable jTable1 = new JTable(); 			// ���
	Vector colnames = new Vector(); 		// ��ͷ
	Vector colnames1 = new Vector(); 		// ����
	Vector colnames2 = new Vector(); 		// ����

	public find_Sales(Frame ower, String title, boolean modal) {
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
	public find_Sales() {
		// TODO Auto-generated constructor stub
		this(new Frame(), "������ϸ��ѯ", false);
		this.setSize(610, 620);
		setLocationRelativeTo(getOwner());
		this.setVisible(true);
	}
	//�����ʼ������
	public void jbInit() {
		
		panel1.setLayout(null); // ���Ĭ�ϵĲ�������
		
		jLabel1.setBorder(BorderFactory.createEtchedBorder());
		jLabel1.setDebugGraphicsOptions(0);
		jLabel1.setDisplayedMnemonic('0');
		jLabel1.setBounds(new Rectangle(12, 6, 573, 121));
		jLabel2.setText("������Ʒ��ϸ");
		jLabel2.setBounds(new Rectangle(19, 40, 158, 38));
//		jLabel2.setFont(new Font("����", Font.BOLD,20));
		jLabel3.setText("��ʼ����");
		jLabel3.setBounds(new Rectangle(189, 31, 66, 20));	
		
		start.setBounds(new Rectangle(254, 31, 120,20));
		
		jLabel4.setText("��������");
		jLabel4.setBounds(new Rectangle(189, 62, 66, 20));
		
		end.setBounds(new Rectangle(254, 62,120, 20));
		
		jLabel5.setText("��Ʒ��ţ�");
		jLabel5.setBounds(new Rectangle(189, 98, 67, 20));
		
		jLabel6.setFont(new java.awt.Font("����", Font.BOLD, 20));
		jLabel6.setText("��Ʒ����");
		jLabel6.setBounds(new Rectangle(233, 126, 134, 31));
		jLabel7.setBorder(BorderFactory.createEtchedBorder());
		jLabel7.setBounds(new Rectangle(110, 162, 146, 24));
		jLabel8.setText(">>>>>>");
		jLabel8.setBounds(new Rectangle(262, 166, 60, 16));
		jLabel9.setBorder(BorderFactory.createEtchedBorder());
		jLabel9.setBounds(new Rectangle(310, 162, 146, 24));
		
		jLabel10.setText("���ϼƣ�");
		jLabel10.setBounds(new Rectangle(36, 531, 176, 47));
		jLabel10.setFont(new java.awt.Font("����", Font.BOLD, 30));
		
		jLabel11.setBorder(BorderFactory.createEtchedBorder());
		jLabel11.setBounds(new Rectangle(215, 531, 183, 46));
		
		//�����ı���
		jTextField1.setBounds(new Rectangle(254, 98,  120, 20));
		
		jButton_OK.setText("ȷ��");
		jButton_OK.setBounds(new Rectangle(510, 27, 63, 24));
		
		// ��������ӱ�ͷ��Ϣ
		colnames.add("��Ʒ���");
		colnames.add("��Ʒ����");
		colnames.add("��������");
		colnames.add("���۽��");
		colnames.add("��������");
		colnames.add("���ϼ�");
		colnames2.add(colnames1);
		//����ScrollPane�Ĵ�С
		jScrollPane1.setBounds(new Rectangle(20, 200, 560, 310));
		
		jTable1 = Mytable.maketable(colnames2, colnames);
		jScrollPane1.getViewport().add(jTable1);
		
		// ��ʼ��һ��������������panel1
		getContentPane().add(panel1);
		// ��ҳ��������ӵ�����
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
		panel1.add(start);
		panel1.add(end);
		panel1.add(jTextField1);
		panel1.add(jTextField2);
		panel1.add(jButton_OK);
		
		panel1.add(jScrollPane1);
		
	}
}
