package cn.zhou.stringx;

import java.util.Scanner;

public class RegExDemo1 {
	public static void main(String[] args) {
		//����һ���ַ������ж��ַ����Ƿ���ת��ΪС��
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean b = str.matches("0\\.\\d+") || str.matches("[1-9]\\d*\\.\\d+");
		System.out.println(b);
	}
}