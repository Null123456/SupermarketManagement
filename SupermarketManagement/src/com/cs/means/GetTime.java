package com.cs.means;

import java.util.Calendar;
import java.util.Date;

/**
 * ��õ�ǰ����ʱ�����GetTime
 * @author Miracle_Wong
 *
 */
public class GetTime {
	public GetTime() {
		// TODO Auto-generated constructor stub
	}
	public static String getTime() {
		Date date1 = new Date();					//��ǰʱ��
	    Calendar objcalendar;
	    String time = "";
	    objcalendar = Calendar.getInstance();		//��ʼ��
	    int year = objcalendar.get(Calendar.YEAR);	//��ȡ���
	    int Month = objcalendar.get(Calendar.MONTH);	//��ȡ�·�
	    Month += 1;		//Ϊ�·ݼ�1����Ϊ1�µ�ֵΪ0
	    Integer Month1 = new Integer(Month);
	    String Monthtos;
	    if (Month < 10) {		//����·�С��10����ǰ���0����֤��λ
	        Monthtos = "0" + Month1.toString();
	    } else {
	        Monthtos = Month1.toString();
	    }
	    int Date = objcalendar.get(Calendar.DATE);
	    Integer Date1 = new Integer(Date);
	    String Datetos;
	    if (Date < 10) {	//��С��10��ǰ���0
	        Datetos = "0" + Date1.toString();
	    } else {
	        Datetos = Date1.toString();
	    }
	    String time1 = date1.toString().substring(11, 19);	//��ȡ��ǰʱ��
	    time =year + "-" + Monthtos + "-" + Datetos + " " + time1;
	    return time;
	}
}
