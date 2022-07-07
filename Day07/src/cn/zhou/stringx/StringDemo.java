package cn.zhou.stringx;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) throws Exception {
		//获取字符串和一个数字
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int n = s.nextInt();
		//将字符串转换为字节数组
		byte[] ba = str.getBytes("GBK");
		//对输入字节个数进行校验
		if(n < 0 || n > ba.length) {
			return ;
		}
		
		//根据字节个数进行截取
		String sub_ba = new String(ba,0,n,"GBK"); //有可能最后一个字符是半个汉字情况
		//获取最后一个字符的下标
		int index = sub_ba.length() - 1; //获取最后一个字符下标
		//判断最后一个字符是否为半个汉字
		if(sub_ba.charAt(index) != str.charAt(index)) {
			sub_ba = new String(ba,0,n-1,"gbk");
		}
		System.out.println(sub_ba);
	}
}
