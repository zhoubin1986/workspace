package cn.zhou.stringx;

import java.util.Scanner;

public class RegExDemo1 {
	public static void main(String[] args) {
		//输入一个字符串，判断字符串是否能转换为小数
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean b = str.matches("0\\.\\d+") || str.matches("[1-9]\\d*\\.\\d+");
		System.out.println(b);
	}
}
