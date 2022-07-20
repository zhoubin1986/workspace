package cn.zhou.stringx;

import java.io.UnsupportedEncodingException;

public class StringDemo5 {
	public static void main(String[] args) throws Exception {
		String str1 = "abcd";
		String str2 = "ABCD";
		System.out.println(str1.compareTo(str2));//�ײ������ַ�������ʽ�洢��
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.equals(str2));
		//��֤���ʵ��
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.concat(str2));
//		System.out.println(str1);   
//		System.out.println(str2);
		//contains��endWith��startsWithֻ���жϾ���ֵ�������жϷ�Χֵ����Χ��ֵ��Ҫ�õ��������ʽ
		System.out.println(str1.contains("ab"));
		System.out.println(str1.endsWith("a"));
		System.out.println(str1.startsWith("a"));
		
		String str3 = "�ַ�����";
		//û���ƶ����룬Ĭ��ʹ�õ�ǰ�����ı���
		byte[] bs = str3.getBytes();
//		byte[] bs = str3.getBytes("UTF-8");
		System.out.println(bs.length);
		//�ֽ�����ת��Ϊ�ַ���
		byte[] bs1 = {97,65,97,97};
		String str4 = new String(bs1,"gbk"); //�����ָ����Ĭ��ʹ�õ�ǰ����
		System.out.println(str4);
		String str5 = new String(bs,2,5);
		System.out.println(str5);
		
	}
}