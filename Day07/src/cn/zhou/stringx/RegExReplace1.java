package cn.zhou.stringx;

import java.util.Scanner;

public class RegExReplace1 {
	public static void main(String[] args) {
		//输入一个字符串，统计输入的数字、字母和符号个数
		Scanner s = new Scanner(System.in);
		String str = s.nextLine(); //包含空白字符
		
		//数字
		int number = str.replaceAll("\\D", "").length();
		//字母
		int letter = str.replaceAll("[^a-zA-Z]", "").length();
		//符号
//		int symbol = str.replaceAll("[^a-zA-Z0-9]", "").length();
		int symbol = str.length() - number - letter;
		System.out.println(number);
		System.out.println(letter);
		System.out.println(symbol);
	}
}
