package cn.zhou.stringx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {
	public static void main(String[] args) {
		//������ַ���
		/*String str = "abc";
		System.out.println(str.equals("abc"));
		
		//�ƶ�����У���ʽ
		Pattern p = Pattern.compile("ab");
		//����ǰ�ƶ�������жϵ��ַ���str����ƥ��
		Matcher m = p.matcher(str);
		//�����ж�
		boolean bl = m.matches();
		System.out.println(bl);*/
		
		//��Χ����3���ַ�����һ���ַ�ֻ����abc��һ�����ڶ����ַ�ֻ����xyz��һ����������������
//		String str = "ax1";
//		Pattern p = Pattern.compile("[abc][xyz][0-9]");
//		Matcher m = p.matcher(str);
//		System.out.println(m.matches());
		
		//���д����ע���ַ�����
		String str = ".a.txt";
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
//		System.out.println(str.matches("[a-z][A-Z][0-9]")); // �мǣ�ֻ�ܴ�С����˳��
//		System.out.println(str.matches("[A-Za-z][0-9]."));
//		System.out.println(str.matches(".")); //.��ʾ����һ���ַ�
//		System.out.println(str.matches("\\.")); //java�ṩ��ת��*.�ļ�
		System.out.println(str1.matches("\\")); //java�ṩ��ת��*.�ļ�
		System.out.println(str1.matches("\\w"));
		
	}
}


