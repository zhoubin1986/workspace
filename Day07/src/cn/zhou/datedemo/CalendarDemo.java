package cn.zhou.datedemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();//����һ��Calendar����
		System.out.println(c);//GregorianCalendar ���������
		//time=19700101 00:00:00->����ֵ offset��ǰʱ������ʱ���ĺ���ֵ ��������Ϊ������Ϊ����8h��
		
		//��ȡHour���Ե�ֵ
		int hour = c.get(Calendar.HOUR);
		System.out.println(hour);
		
		//�������Ե�ֵ
		c.set(Calendar.HOUR, 5);
		//��ȡDate����ķ���
		Date date = c.getTime();
		System.out.println(date);
		
		
	}
}