package cn.zhou.datedemo;

import java.util.Date; //��Ҫ������

public class DateDemo {
	public static void main(String[] args) {
//		Date date = new Date();
		//Fri Aug 05 10:05:38 CST 2022
		//CST-->China Standard Timezone,��ָ��ʱ����Ϊ��ǰϵͳʱ��
//		System.out.println(date);
		
		//��2022-12-1-->ת��ΪDate���󣬲�����������Date date = new Date(2022,12,1);
		//��Ϊʵ��1900-01�Ļ����Ͻ����ۼӵ�
		String str = "2022-12-1";
		//���г���
		String[] str1 = str.split("-");
		int year = Integer.parseInt(str1[0]) - 1900;
		int month = Integer.parseInt(str1[1]) - 1;
		int date = Integer.parseInt(str1[2]);
		@SuppressWarnings("deprecation")
		Date date1 = new Date(year,month,date); //�ѹ�ʱ����ǰ���ã����������汾�п��ܻᱻ����
		System.out.println(date1);
//		Date date2 = new Date(1468653L);//��ʾ1900-01-01 00:00��00��ָ��ʱ��ĺ���ֵ
	}
}
