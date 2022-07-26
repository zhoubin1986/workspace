package cn.zhou.stringx;

import java.util.Scanner;

public class RegExReplace2 {
	public static void main(String[] args) {
		//输入一个字符串，统计这个字符串中每一个字符出现的个数
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		while(str.length() != 0) {
			int len = str.length();
			char ch = str.charAt(0);
			str = str.replaceAll(ch + "", "");
			int num = len - str.length();
			System.out.println(ch + ":" + num);
		}
	}
}
