package cn.zhou.mathx;

import java.math.BigDecimal;

public class MathDemo1 {
	//strictfp��һ�����η������ã��ڼ��������/������ִ���У�Ҫ�����ݱ�����80λ�����������㣬double������64λ
	//�������洢����Ȼ��64λ��
	public static strictfp void main(String[] args) {
		//�������С��תΪ������ʱ���ǲ���ȷ��
//		double d1 = 3.14;
//		double d2 = 2.13;
//		System.out.println(d1 - d2);
		
		//BigDecimal����С���ľ�ȷ����
//		BigDecimal bd1 = new BigDecimal(3.21);
//		BigDecimal bd2 = new BigDecimal(2.84);
//		System.out.println(bd1.subtract(bd2));//bd1 - bd2�ᱨ��
		//������һ����ȷ���㣬��Ҫ���������ַ�����ʽ��������Сѧ��ͼ�����Ĺ���
		BigDecimal bd1 = new BigDecimal("3.21");
		BigDecimal bd2 = new BigDecimal("2.84");
		System.out.println(bd1.subtract(bd2));
		System.out.println(bd1.add(bd2));
		
		
	}
}