package cn.zhou.stringx;

import java.util.Scanner;

public class StringDemo4 {
	public static void main(String[] args) {
//		char[] ch = {'a','b','c','c'};
		//ƴ�ӳ��ַ���
//		String str = new String(ch);
//		System.out.println(str);
//		String str	= new String(ch, 1, 3);
//		System.out.println(str);
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int from = sc.nextInt();
		int to = sc.nextInt();
		String str2 = str.substring(from, to);  //��ȡ��Χ��begin<=x<end(������)
		System.out.println(str2);
		if(from < 0 || to > str.length() || from > to) {
			return;
		}
		char[] ch = str.toCharArray();
		String str1 = new String(ch, from, to - from);
		System.out.println(str1);
	}
}
