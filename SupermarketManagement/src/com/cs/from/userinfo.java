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
 * 在工程中增加用户查询的userinfo类，
 * 并且定义了该窗体需要的各种组件，
 * 包括文本输入框、JLabel标签、JButton按钮、Panel容器和下拉列表等组件
 * @author Miracle_Wong
 *
 */
public class userinfo extends JDialog {
	
	//类的成员变量
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
    
    JComboBox jComboBox1 = new JComboBox();		//复合框

	public  userinfo(Frame ower, String title, boolean modal) {
		super(ower, title, modal);
		try {
			//在Java窗体正常关闭时调用，同时将整个程序从内存中清除。
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			jbInit();		//窗口的初始化函数
			pack();			//刷新界面
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public userinfo() {
		// TODO Auto-generated constructor stub
		this(new Frame(),"查询用户",false);
		this.setSize(500, 400);				//设置窗体大小
		this.setLocation(300, 200);			//设置窗体位置
		this.setVisible(true);				//显示窗口
	}
	private void jbInit() throws Exception {
		panel1.setLayout(null); 			//清除布局格式
		jLabel1.setText("卡号");				//设置卡号
		jLabel1.setBounds(new Rectangle(51, 53, 42, 15));
		jLabel2.setText("持卡人");			//设置持卡人
		jLabel2.setBounds(new Rectangle(51, 93, 42, 15));
		jLabel3.setText("证件号");			//设置证件号
		jLabel3.setBounds(new Rectangle(51, 133, 42, 15));
		jLabel4.setText("级别");				//设置密码
		jLabel4.setBounds(new Rectangle(51, 173, 42, 15));
		jLabel5.setText("开卡日期");			//设置开卡日期
		jLabel5.setBounds(new Rectangle(51, 213, 57, 15));
		jLabel6.setText("类型");				//设置类型
		jLabel6.setBounds(new Rectangle(261, 53, 42, 15));
		jLabel7.setText("期限");				//设置期限
		jLabel7.setBounds(new Rectangle(261, 93, 42, 15));
		jLabel8.setText("积分");				//设置积分
		jLabel8.setBounds(new Rectangle(261, 133, 42, 15));
		jLabel9.setText("折扣率");			//设置折扣率
		jLabel9.setBounds(new Rectangle(261, 173, 42, 15));
		jLabel10.setText("备注");			//设置备注标签
		jLabel10.setBounds(new Rectangle(261, 213, 42, 15));
		
		
		jTextField1.setBounds(new Rectangle(109, 48, 132, 27));		//设置选项文本框
	    jTextField2.setBounds(new Rectangle(109, 88, 132, 27));
	    jTextField3.setBounds(new Rectangle(109, 128, 132, 27));
	    jTextField4.setBounds(new Rectangle(109, 168, 132, 27));
	    jTextField5.setBounds(new Rectangle(114, 208, 127, 27));
//	    jTextField6.setBounds(new Rectangle(319, 48, 132, 27));
	    jComboBox1.setBounds(new Rectangle(319, 48, 132, 27));
	    jComboBox1.addItem("普通会员");
        jComboBox1.addItem("收银员");
        jComboBox1.addItem("管理员");
        
	    jTextField7.setBounds(new Rectangle(319, 88, 132, 27));
	    jTextField7.setText("1年");
	    jTextField7.setEnabled(false);
	    jTextField8.setBounds(new Rectangle(319, 128, 132, 27));
	    jTextField8.setText("0");
	    jTextField8.setEnabled(false);
	    jTextField9.setBounds(new Rectangle(319, 168, 132, 27));
	    jTextField9.setText("90%");
	    jTextField9.setEnabled(false);
	    jTextField10.setBounds(new Rectangle(334, 208, 117, 27));
	    
	    Timer timer = new Timer();
	    timer.schedule(new RemindTask(), 0, 1000);		//得到当前的时间
	    
		jButton1.setBounds(new Rectangle(105, 279, 83, 25));
		jButton1.setText("查询");				//设置查询按钮
		jButton1.addActionListener(new Select_card_jButton1_actionAdapter(this));
		
		jButton2.setBounds(new Rectangle(305, 279, 83, 25));
		jButton2.setText("取消");				//设置取消按钮
		jButton2.addActionListener(new Select_card_jButton1_actionAdapter(this));
		
	    //初始化一个容器，并加入panel1
		getContentPane().add(panel1);
		//将页面的组件添加到窗口
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
	
	Vector addAllData = new Vector(); 		//所有商品的相关信息
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