package cn.zhou.stringx;

import java.util.Scanner;

public class StringDemo3 {
	@SuppressWarnings("resource")
	//输入一个字符串，计算输入的数字之和
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char[] ch = str.toCharArray();
		int sum = 0;
		for(char c:ch) {
			if(c >= '0' && c <= '9') { //'0'->48
				sum += c - '0';
			}
		}
		/*for(int i=0;i<ch.length;i++) {
			if(ch[i] >= '0' && ch[i] <= '9') {
				sum += ch[i] - '0';
			}
		}*/
		System.out.println(sum);
	}
}
