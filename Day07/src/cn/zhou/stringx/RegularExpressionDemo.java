package cn.zhou.stringx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {
	public static void main(String[] args) {
		//具体的字符串
		/*String str = "abc";
		System.out.println(str.equals("abc"));
		
		//制定正则校验格式
		Pattern p = Pattern.compile("ab");
		//将当前制定规则和判断的字符串str进行匹配
		Matcher m = p.matcher(str);
		//进行判断
		boolean bl = m.matches();
		System.out.println(bl);*/
		
		//范围，有3个字符，第一个字符只能是abc中一个，第二个字符只能是xyz中一个，第三个是数字
//		String str = "ax1";
//		Pattern p = Pattern.compile("[abc][xyz][0-9]");
//		Matcher m = p.matcher(str);
//		System.out.println(m.matches());
		
		//简洁写法，注意字符个数
		String str = ".a.txt";
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
//		System.out.println(str.matches("[a-z][A-Z][0-9]")); // 切记：只能从小到大顺序
//		System.out.println(str.matches("[A-Za-z][0-9]."));
//		System.out.println(str.matches(".")); //.表示任意一个字符
//		System.out.println(str.matches("\\.")); //java提供的转义*.文件
		System.out.println(str1.matches("\\")); //java提供的转义*.文件
		System.out.println(str1.matches("\\w"));
		
	}
}


