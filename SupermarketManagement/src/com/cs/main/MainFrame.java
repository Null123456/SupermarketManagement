package com.cs.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

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

public class MainFrame extends JFrame{
	JPanel contentPane;
	/*����˵���*/
	JMenuBar jMenuBar1 = new JMenuBar();
	JMenu jMenu1 = new JMenu();
	JMenu jMenu2 = new JMenu();
	JMenu jMenu3 = new JMenu();
	JMenu jMenu4 = new JMenu();
	JMenu jMenu5 = new JMenu();
	JMenu jMenu6 = new JMenu();
	JMenu jMenu7 = new JMenu();
	JMenu jMenu8 = new JMenu();
	JMenu jMenu9 = new JMenu();
	/*�����Ӳ˵�*/
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
	JMenuItem jMenuItem22 = new JMenuItem();
	JMenuItem jMenuItem23 = new JMenuItem();
	JMenuItem jMenuItem24 = new JMenuItem();
	JMenuItem jMenuItem25 = new JMenuItem();
	
	/*��������*/
	JTree jTree1 = new JTree();
	JLabel statusBar = new JLabel();//���չʾ����
	JScrollPane jScrollPane1 = new JScrollPane();	//���й�����������
	JScrollPane jScrollPane2 = new JScrollPane();
	JTable jTable = new JTable();					//���
		
	TitledBorder titledBorder = new TitledBorder("");
	
	
	public MainFrame() {
		// TODO Auto-generated constructor stub
		try {
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			jbInit();			//�Զ���Ĵ����ʼ������
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	//��ʼ������
	private void jbInit() throws Exception{
		contentPane = (JPanel)getContentPane();		//��ʼ��JPanel
		contentPane.setLayout(null);
		this.setTitle("���к�̨����ϵͳ");				//���ô�������
		this.setSize(new Dimension(800,600));		//���ô��ڴ�С
		/*���ò˵�����*/
		jMenuItem10.setText("����ĸ߶�");
		jMenu1.add(jMenuItem10);
		//���˵�����˵���
		jMenuBar1.add(jMenu1);
		setJMenuBar(jMenuBar1);
		contentPane.add(jMenuBar1,BorderLayout.CENTER);
		
		
		
				
		//����ҳ�����������
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();		//��ȡ����ʾ���Ĵ�С����1280*1024
		//ʹ��Frame��������Ļ������ʾ
		this.setLocation((screenSize.width - this.getWidth()) / 2,
				(screenSize.height - this.getHeight()) / 2);
		
		this.setVisible(true);
	}
	
}
