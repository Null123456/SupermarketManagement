package com.cs.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.border.TitledBorder;
import javax.swing.tree.DefaultMutableTreeNode;

public class MainFrame extends JFrame{
	JPanel contentPane;
	/*����˵���*/
	JMenuBar jMenuBar1 = new JMenuBar();
	JMenu jMenu1 = new JMenu();			//ϵͳ
	JMenu jMenu2 = new JMenu();			//�ɹ�
	JMenu jMenu3 = new JMenu();			//�ֿ�
	JMenu jMenu4 = new JMenu();			//�û�����
	JMenu jMenu5 = new JMenu();			//��Ϣ��ѯ
	JMenu jMenu6 = new JMenu();			//��ѯ��Ʒ��Ϣ
	JMenu jMenu7 = new JMenu();			//����Ʒ����ѯ
	/*�����Ӳ˵�*/
	JMenuItem jMenuItem1 = new JMenuItem();
	JMenuItem jMenuItem2 = new JMenuItem();
	JMenuItem jMenuItem3 = new JMenuItem();
	JMenuItem jMenuItem4 = new JMenuItem();
	JMenuItem jMenuItem5 = new JMenuItem();
	JMenuItem jMenuItem6 = new JMenuItem();
	JMenuItem jMenuItem7 = new JMenuItem();
	JMenuItem jMenuItem8 = new JMenuItem();
	JMenuItem jMenuItem9 = new JMenuItem();
	JMenuItem jMenuItem10 = new JMenuItem();
	JMenuItem jMenuItem11 = new JMenuItem();
	JMenuItem jMenuItem12 = new JMenuItem();
	JMenuItem jMenuItem13 = new JMenuItem();
	JMenuItem jMenuItem14 = new JMenuItem();
	JMenuItem jMenuItem15 = new JMenuItem();
	JMenuItem jMenuItem16 = new JMenuItem();
	JMenuItem jMenuItem17 = new JMenuItem();
	JMenuItem jMenuItem18 = new JMenuItem();
	JMenuItem jMenuItem19 = new JMenuItem();
	JMenuItem jMenuItem20 = new JMenuItem();
	JMenuItem jMenuItem21 = new JMenuItem();
	
	//��������
	JTree jTree1 = new JTree();
	JLabel statusBar = new JLabel();				//���չʾ����
	JTable jTable = new JTable();					//���
	TitledBorder titledBorder = new TitledBorder("");
	JScrollPane jScrollPane1 = new JScrollPane();	//���й�����������
	JScrollPane jScrollPane2 = new JScrollPane();

	public MainFrame() {
		// TODO Auto-generated constructor stub
		try {
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			jbInit();			//�����ʼ��
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	//�����ʼ������
	private void jbInit() throws Exception{
		contentPane = (JPanel)getContentPane();		//��ʼ��JPanel
		contentPane.setLayout(null);				//�������Ĳ��ָ�ʽ
		
		this.setTitle("���к�̨����ϵͳ");				//���ô�������
		this.setSize(new Dimension(940,600));		//���ô��ڴ�С
		
		/*���ò˵�����*/
		jMenu1.setText("ϵͳ");
		jMenu2.setText("�ɹ�");
		jMenu3.setText("�ֿ�");
		jMenu4.setText("�û�����");
		jMenu5.setText("��Ϣ��ѯ");
		
		jMenu6.setText("��ѯ��Ʒ��Ϣ");
		jMenu7.setText("����Ʒ����ѯ");
		
		/*����һ���˵�����*/
		jMenuItem1.setText("ǰ̨�ն�");
		jMenuItem2.setText("�˳�ϵͳ");
		jMenuItem3.setText("������Ʒ");
		jMenuItem4.setText("�ɹ���");
		jMenuItem5.setText("���");
		jMenuItem6.setText("���/����");
		jMenuItem7.setText("����/�˻�");
		jMenuItem8.setText("���/�޸��û�");
		jMenuItem9.setText("�˻���Ϣ");
		jMenuItem10.setText("����ͳ��");
//		jMenuItem11.setText("��ѯ��Ʒ��Ϣ");
		
		/*���ö����˵�����*/
		jMenuItem12.setText("����Ʒ���Ʋ�ѯ");
		jMenuItem13.setText("����Ʒ�������ѯ");
		jMenuItem14.setText("����Ʒ��Ų�ѯ");
//		jMenuItem15.setText("����Ʒ����ѯ");
		
		/*���������˵�����*/
		jMenuItem16.setText("�������ѯ");
		jMenuItem17.setText("��Ʒ���ѯ");
		jMenuItem18.setText("�������ѯ");
		jMenuItem19.setText("�߹����ѯ");
		jMenuItem20.setText("ʳƷ���ѯ");
		jMenuItem21.setText("�������ѯ");
		
		/* Ϊ�����Ĳ˵���Ӽ�����������������*/
//		jMenuItem1.addActionListener();
		jMenuItem2.addActionListener(new exit_sys(this));
		
		/*�������˵������Ƽ��뵽�����˵���*/
		jMenu7.add(jMenuItem16);
		jMenu7.add(jMenuItem17);
		jMenu7.add(jMenuItem18);
		jMenu7.add(jMenuItem19);
		jMenu7.add(jMenuItem20);
		jMenu7.add(jMenuItem21);
		
		/*�������˵������Ƽ��뵽һ���˵���*/
		jMenu6.add(jMenuItem12);
		jMenu6.add(jMenuItem13);
		jMenu6.add(jMenuItem14);
		jMenu6.add(jMenu7);
		
		/*��һ���˵������Ƽ��뵽�˵���*/
		jMenu1.add(jMenuItem1);
		jMenu1.add(jMenuItem2);
		jMenu2.add(jMenuItem3);
		jMenu2.add(jMenuItem4);
		jMenu2.add(jMenuItem5);
		jMenu3.add(jMenuItem6);
		jMenu3.add(jMenuItem7);
		jMenu4.add(jMenuItem8);
		jMenu4.add(jMenuItem9);
		jMenu5.add(jMenuItem10);
		jMenu5.add(jMenu6);
		
		//���˵�����˵���
		jMenuBar1.add(jMenu1);
		jMenuBar1.add(jMenu2);
		jMenuBar1.add(jMenu3);
		jMenuBar1.add(jMenu4);
		jMenuBar1.add(jMenu5);
		//���˵������뵽����
		setJMenuBar(jMenuBar1);
		
		/*��������ʾ���νṹ�Ĳ���*/
		
		/**������״ͼ��**/
		//���εĸ��ڵ�
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("��������/��ѯ");
		//һ�����ζ��������
		DefaultMutableTreeNode details = new DefaultMutableTreeNode("�����嵥");
		DefaultMutableTreeNode browse = new DefaultMutableTreeNode("������");
		DefaultMutableTreeNode user = new DefaultMutableTreeNode("�û�����");
		DefaultMutableTreeNode info = new DefaultMutableTreeNode("��Ϣ��ѯ");
		DefaultMutableTreeNode goods = new DefaultMutableTreeNode("��Ʒ����");
		
		//�������εĶ��������
		DefaultMutableTreeNode Sells = new DefaultMutableTreeNode("����ͳ��");
		
		DefaultMutableTreeNode Storeinfr = new DefaultMutableTreeNode("�����Ϣ���");
		DefaultMutableTreeNode Store1 = new DefaultMutableTreeNode("�������Ʒ��Ų�ѯ");
		
		DefaultMutableTreeNode UserNa = new DefaultMutableTreeNode("���/�޸��û�");
		DefaultMutableTreeNode UserAdd = new DefaultMutableTreeNode("�����˻���ѯ");
		
		DefaultMutableTreeNode search1 = new DefaultMutableTreeNode("����Ʒ���Ʋ�ѯ");
		DefaultMutableTreeNode search2 = new DefaultMutableTreeNode("����Ʒ��Ų�ѯ");
		DefaultMutableTreeNode search3 = new DefaultMutableTreeNode("����Ʒ�������ѯ");
		DefaultMutableTreeNode search4 = new DefaultMutableTreeNode("����Ʒ����ѯ");

		DefaultMutableTreeNode inout = new DefaultMutableTreeNode("���/����");
		DefaultMutableTreeNode addexit = new DefaultMutableTreeNode("��/�˻�");
		DefaultMutableTreeNode addgoods = new DefaultMutableTreeNode("������Ʒ");
		
		//�������εĶ��������
		DefaultMutableTreeNode sort1 = new DefaultMutableTreeNode("�������ѯ");
		DefaultMutableTreeNode sort2 = new DefaultMutableTreeNode("��Ʒ���ѯ");
		DefaultMutableTreeNode sort3 = new DefaultMutableTreeNode("�������ѯ");
		DefaultMutableTreeNode sort4 = new DefaultMutableTreeNode("�߹����ѯ");
		DefaultMutableTreeNode sort5 = new DefaultMutableTreeNode("ʳƷ���ѯ");
		DefaultMutableTreeNode sort6 = new DefaultMutableTreeNode("�������ѯ");
		
		//���ڵ������һ���ڵ�
		root.add(details);
		root.add(browse);
		root.add(user);
		root.add(info);
		root.add(goods);
		//һ���ڵ�����Ӷ����ڵ�
		details.add(Sells);
		browse.add(Storeinfr);
		browse.add(Store1);
		user.add(UserNa);
		user.add(UserAdd);
		info.add(search1);
		info.add(search2);
		info.add(search3);
		info.add(search4);
		goods.add(inout);
		goods.add(addexit);
		goods.add(addgoods);
		//�����ڵ�����������ڵ�
		search4.add(sort1);
		search4.add(sort2);
		search4.add(sort3);
		search4.add(sort4);
		search4.add(sort5);
		search4.add(sort6);
		
		//ˢ�����νṹ
		jTree1 = new JTree(root);
		//��Ӽ�����
		
		//���ù����������ʾ��Χ
		jScrollPane1.setBounds(new Rectangle(13, 25, 152, 435));
		jScrollPane2.setBounds(new Rectangle(167, 25, 750, 435));
		
		jScrollPane1.getViewport().add(jTree1);
		
		contentPane.add(jScrollPane1);
		contentPane.add(jScrollPane2);
		
		this.setVisible(true);			//ʹ�ô�����ʾ
	}
	public void exit_system(ActionEvent e) {
		System.exit(0);
	}
}

class exit_sys implements ActionListener {
	private MainFrame adaptee;
	exit_sys(MainFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.exit_system(e);
	}
}


























/*//����ҳ�����������
Toolkit toolkit = Toolkit.getDefaultToolkit();
Dimension screenSize = toolkit.getScreenSize();		//��ȡ����ʾ���Ĵ�С����1280*1024
//ʹ��Frame��������Ļ������ʾ
this.setLocation((screenSize.width - this.getWidth()) / 2,
(screenSize.height - this.getHeight()) / 2);*/
