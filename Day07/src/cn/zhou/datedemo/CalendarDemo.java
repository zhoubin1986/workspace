package cn.zhou.datedemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();//创建一个Calendar对象
		System.out.println(c);//GregorianCalendar 格里高利历
		//time=19700101 00:00:00->毫秒值 offset当前时区到零时区的毫秒值 ，东八区为正西区为负（8h）
		
		//获取Hour属性的值
		int hour = c.get(Calendar.HOUR);
		System.out.println(hour);
		
		//设置属性的值
		c.set(Calendar.HOUR, 5);
		//获取Date对象的方法
		Date date = c.getTime();
		System.out.println(date);
		
		
	}
}
