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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;

import com.cs.means.Insert_goods;

public class AddGoods extends JDialog {

	// ��ĳ�Ա����
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
	Vector colnames = new Vector(); // ��ͷ
	Vector colnames1 = new Vector(); // ����
	Vector colnames2 = new Vector(); // ����
	JButton jButton1 = new JButton();
	JButton jButton2 = new JButton();
	JButton jButton3 = new JButton();
	JButton jButton4 = new JButton();
	JComboBox jComboBox1 = new JComboBox();

	public AddGoods(Frame ower, String title, boolean modal) {
		super(ower, title, modal);
		try {
			// ��Java���������ر�ʱ���ã�ͬʱ������������ڴ��������
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			jbInit(); // ���ڵĳ�ʼ������
			pack();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public AddGoods() {
		// TODO Auto-generated constructor stub
		this(new Frame(), "������Ʒ", false);
		this.setSize(920, 500); // ���ô����С
		setLocationRelativeTo(getOwner()); // ������ʾ
		this.setVisible(true); // ��ʾ����
	}

	private void jbInit() throws Exception {
		panel1.setLayout(null); // ���ò���Ϊ��
		jLabel1.setText("��Ʒ���룺"); // ������Ʒ�������ƴ�С��λ��
		jLabel1.setBounds(new Rectangle(15, 10, 85, 26));
		jLabel2.setText("��  ��  �룺"); // �������������Ʊ�ǩ
		jLabel2.setBounds(new Rectangle(15, 50, 85, 26));
		jLabel3.setText("����ţ�"); // ��������ű�ǩ
		jLabel3.setBounds(new Rectangle(15, 90, 85, 26));
		jLabel4.setText("��Ʒ���ƣ�"); // ������Ʒ���Ʊ�ǩ
		jLabel4.setBounds(new Rectangle(15, 130, 85, 26));
		jLabel5.setText("���ۼ�(Ԫ)��"); // �������ۼ۱�ǩ
		jLabel5.setBounds(new Rectangle(15, 170, 85, 26));
		jLabel6.setText("��Ʒ���"); // ������Ʒ����ǩ
		jLabel6.setBounds(new Rectangle(15, 210, 85, 26));
		jLabel7.setText("������λ��"); // ���ü�����λ��ǩ
		jLabel7.setBounds(new Rectangle(15, 250, 85, 26));
		jLabel8.setText("��  ��  �ۣ�"); // ���ý����۱�ǩ
		jLabel8.setBounds(new Rectangle(15, 290, 85, 26));
		jLabel9.setText("������(��)��"); // ���ñ����ڱ�ǩ
		jLabel9.setBounds(new Rectangle(15, 330, 85, 26));
		jLabel10.setText("��   ע ��"); // ���ñ�ע��ǩ
		jLabel10.setBounds(new Rectangle(15, 370, 85, 26));
		// ��Ӹ�ѡ��
		jComboBox1.addItem("������");
		jComboBox1.addItem("ʳƷ��");
		jComboBox1.addItem("�߹���");
		jComboBox1.addItem("������");
		jComboBox1.addItem("������");
		jComboBox1.addItem("��Ʒ��");
		jComboBox1.setBounds(new Rectangle(91, 90, 125, 24));

		jTextField1.setBounds(new Rectangle(91, 10, 125, 24)); // ����ѡ���ı���
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
		jButton1.setText("��    ��"); // ������Ӱ�ť
		jButton1.addActionListener(new AddMerchandise_jButton1_actionAdapter(
				this));

		jButton2.setBounds(new Rectangle(273, 418, 127, 27));
		jButton2.setText("��    ��"); // �������ð�ť
		jButton2.addActionListener(new AddMerchandise_jButton2_actionAdapter(
				this));

		jButton3.setBounds(new Rectangle(493, 418, 127, 27));
		jButton3.setText("ɾ    ��"); // ����ɾ����ť
		jButton3.addActionListener(new AddMerchandise_jButton3_actionAdapter(
				this));

		jButton4.setBounds(new Rectangle(713, 418, 127, 27));
		jButton4.setText("��    ��"); // �����ύ��ť
		jButton4.addActionListener(new AddMerchandise_jButton4_actionAdapter(
				this));

		colnames.add("��Ʒ����"); // ��������ӱ�ͷ��Ϣ
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
		// jScrollPane1.getViewport().add(jTable1);
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

	// ����Vector�ɱ䳤�������������ȡ��Ʒ��Ϣ������Ʒ��Ϣ����δ��д�������򷵻���ʾ��
	// ����д����Ҫ�������add()�ķ�������addAllData�����С�
	Vector addAllData = new Vector(); // ������Ʒ�������Ϣ

	// button1 �� ���ܣ������Ʒ����Ϣ�������
	public void jButton1_actionPerformed(ActionEvent e) {
		// �ж���Ʒ����Ϣ�Ƿ�����
		if ((jTextField1.getText().length() == 0)
				|| (jTextField2.getText().length() == 0)
				|| (jTextField4.getText().length() == 0)
				|| (jTextField5.getText().length() == 0)
				|| (jTextField6.getText().length() == 0)
				|| (jTextField7.getText().length() == 0)
				|| (jTextField8.getText().length() == 0)
				|| (jTextField9.getText().length() == 0)) {
			JOptionPane.showMessageDialog(this, "�ύ�����ݲ��Ϸ�������", "��ʾ",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		try {
			Double dj = new Double(jTextField5.getText()); // ���ۼۣ�����
			Double jhj = new Double(jTextField8.getText()); // ������
			Double bzq = new Double(jTextField9.getText()); // ������
		} catch (Exception ex) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(this, "�ύ�����ݲ��Ϸ�������", "��ʾ",
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		Vector addData = new Vector(); // ������Ʒ�������Ϣ
		addData.add(jTextField1.getText()); // �����Ʒ����
		addData.add(jTextField2.getText()); // ���������
		// ��������
		if (jComboBox1.getSelectedItem().equals("������")) {
			addData.add("SX1001");
		}
		if (jComboBox1.getSelectedItem().equals("ʳƷ��")) {
			addData.add("SP1002");
		}
		if (jComboBox1.getSelectedItem().equals("�߹���")) {
			addData.add("SG1003");
		}
		if (jComboBox1.getSelectedItem().equals("������")) {
			addData.add("DQ1004");
		}
		if (jComboBox1.getSelectedItem().equals("������")) {
			addData.add("RY1005");
		}
		if (jComboBox1.getSelectedItem().equals("��Ʒ��")) {
			addData.add("LP1006");
		}
		addData.add(jTextField4.getText()); // �����Ʒ����
		addData.add(jTextField5.getText()); // ������ۼ�
		addData.add(jTextField6.getText()); // �����Ʒ���
		addData.add(jTextField7.getText()); // ��Ӽ�����λ
		addData.add(jTextField8.getText()); // ��ӽ�����
		addData.add(jTextField9.getText()); // ��ӱ�����
		addData.add(jTextField10.getText()); // ��ӱ�ע
		addAllData.add(addData); // ����Ʒ��ӵ������
		jTable1 = Mytable.maketable(addAllData, colnames); // ��ʾ����
		jScrollPane1.getViewport().add(jTable1);
	}

	// Button2 ���� ���� �Ĺ��ܣ�ɾ�����е���Ʒ��Ϣ
	public void jButton2_actionPerformed(ActionEvent e) {
		addAllData.removeAllElements();
		jTable1 = Mytable.maketable(addAllData, colnames); // ��ʾ����
		jScrollPane1.getViewport().add(jTable1);
	}

	// Button3 ���� ɾ�� �Ĺ��ܣ�ɾ��ѡ������Ʒ��Ϣ
	public void jButton3_actionPerformed(ActionEvent e) {
		int row = jTable1.getSelectedRow();
		addAllData.remove(row);
		jTable1 = Mytable.maketable(addAllData, colnames); // ��ʾ����
		jScrollPane1.getViewport().add(jTable1);
	}

	// Button4 ���� �ύ �Ĺ��ܣ�
	public void jButton4_actionPerformed(ActionEvent e) {
		Vector addData1 = new Vector();
		int i = 0;
		int number = 0;
		// �Ա���е����ݽ���ѭ������
		while (i < addAllData.size()) {
			addData1 = (Vector) addAllData.get(i); // ��ȡÿһ����Ʒ����Ϣ
			Double number1 = new Double(addData1.get(4).toString()); // ��ȡ����
			Double number2 = new Double(addData1.get(7).toString()); // ��ȡ������
			Double number3 = new Double(addData1.get(8).toString()); // ��ȡ������
			// ����������Ʒ�¼�
			number = Insert_goods.Insert_merchandise(
					addData1.get(0).toString(), addData1.get(1).toString(),
					addData1.get(2).toString(),	addData1.get(3).toString(), 
					number1, addData1.get(5).toString(), 
					addData1.get(6).toString(), number2, 
					number3, addData1.get(9).toString());
			i++;

			String str = "��" + i + "������д��ʧ��";
			if (number == 0) {
				JOptionPane.showMessageDialog(this, str, "��ʾ",
						JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			if (i == addAllData.size()) // �ж��Ƿ�ȫ���ύ
			{
				JOptionPane.showMessageDialog(this, "�ύ���ݳɹ�", "��ʾ",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}

// Button1��������ӡ���ť�ĵļ����������������Ʒ��Ϣ
class AddMerchandise_jButton1_actionAdapter implements ActionListener {
	private AddGoods adaptee;

	AddMerchandise_jButton1_actionAdapter(AddGoods adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		adaptee.jButton1_actionPerformed(e);
	}
}

// Button2���������á���ť�ĵļ����������������Ʒ��Ϣ
class AddMerchandise_jButton2_actionAdapter implements ActionListener {
	private AddGoods adaptee;

	AddMerchandise_jButton2_actionAdapter(AddGoods adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton2_actionPerformed(e);
	}
}

// Button3������ɾ������ť�ĵļ�����������ɾ����Ʒ��Ϣ
class AddMerchandise_jButton3_actionAdapter implements ActionListener {
	private AddGoods adaptee;

	AddMerchandise_jButton3_actionAdapter(AddGoods adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton3_actionPerformed(e);
	}
}

// Button4�������ύ����ť�ĵļ�����������������ӵ���Ϣд�����ݿ�
class AddMerchandise_jButton4_actionAdapter implements ActionListener {
	private AddGoods adaptee;

	AddMerchandise_jButton4_actionAdapter(AddGoods adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton4_actionPerformed(e);
	}
}

/*
 * jButton1_actionPerformed()���ڶ���������ʱ���õģ� ÿ�����󶼿��Զ���һ����Ӧ�ķ����������Ǻͼ���������ʹ�õģ�
 * ���������Ǽ�ض������Ƿ��з�������������оʹ�����ִ�м�������������
 */

