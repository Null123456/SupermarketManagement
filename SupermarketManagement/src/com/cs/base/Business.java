package com.cs.base;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 * �����Business
 * ����ʵ�����ݿ������
 * @author MiracleWong
 *
 */
public class Business {
	private static final String DRIVER = "com.mysql.jdbc.Driver";		//�����̶�����

	private static final String URL = "jdbc:mysql://localhost:3306/cs";	//URL

	private static final String user  = "root";							//�û���
	private static final String password = "123456";					//����
	//�������ݿ�ĺ���
	public static Connection getConnection() {							//��ʼ�������ݿ�
		java.sql.Connection conn = null;
		try {
			Class.forName(DRIVER);										//��������
			System.out.println("���������ɹ�");			
			conn = DriverManager.getConnection(URL,user,password);		//��������
			System.out.println("�������ӳɹ�");
		} catch (SQLException e) {										//����Ƿ����쳣
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
		}
		return conn;			//���Ӷ��󷵻�
	}
}
