package cn.zhou.stringx;

import java.util.Scanner;

public class StringPSW {
	public static void main(String[] args) {
		//输入一串由8~12位字符组成的密码，由大写字母、小写字母、数字或空格中至少2种组成
		//8~12位,正则匹配
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean bl = checkPSW(str);
		System.out.println(bl);
	}
	
	public static boolean checkPSW(String psw){
		if(!psw.matches("[a-zA-Z0-9 ]{8,12}")) //"[][][]"
			return false;
		int n = 0;
		//判断是否含有小写字母
		if(psw.matches(".*[a-z].*"))
			n++;
		//判断是否含有大写字母
		if(psw.matches(".*[A-Z].*"))
			n++;
		//判断是否含有数字
		if(psw.matches(".*[0-9].*"))
			n++;
		//判断是否含有空格
		if(psw.matches(".* .*")) 
			n++;
		return n>=2;
		//针对这种情况4种中的2种，单一字符，5种中的3种就不行
		//!psw.matches("[a-z+]{8,12}");
		
	}
}
