package cn.zhou.stringx;

import java.util.Scanner;

public class RegExReplace1 {
	public static void main(String[] args) {
		//����һ���ַ�����ͳ����������֡���ĸ�ͷ��Ÿ���
		Scanner s = new Scanner(System.in);
		String str = s.nextLine(); //�����հ��ַ�
		
		//����
		int number = str.replaceAll("\\D", "").length();
		//��ĸ
		int letter = str.replaceAll("[^a-zA-Z]", "").length();
		//����
//		int symbol = str.replaceAll("[^a-zA-Z0-9]", "").length();
		int symbol = str.length() - number - letter;
		System.out.println(number);
		System.out.println(letter);
		System.out.println(symbol);
	}
}
