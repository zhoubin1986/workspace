package cn.zhou.datedemo;

import java.util.Date; //不要导错了

public class DateDemo {
	public static void main(String[] args) {
//		Date date = new Date();
		//Fri Aug 05 10:05:38 CST 2022
		//CST-->China Standard Timezone,不指定时区则为当前系统时间
//		System.out.println(date);
		
		//将2022-12-1-->转化为Date对象，不能这样传入Date date = new Date(2022,12,1);
		//因为实在1900-01的基础上进行累加的
		String str = "2022-12-1";
		//先切出来
		String[] str1 = str.split("-");
		int year = Integer.parseInt(str1[0]) - 1900;
		int month = Integer.parseInt(str1[1]) - 1;
		int date = Integer.parseInt(str1[2]);
		@SuppressWarnings("deprecation")
		Date date1 = new Date(year,month,date); //已过时，当前可用，后续迭代版本中可能会被抛弃
		System.out.println(date1);
//		Date date2 = new Date(1468653L);//表示1900-01-01 00:00：00到指定时间的毫秒值
	}
}
