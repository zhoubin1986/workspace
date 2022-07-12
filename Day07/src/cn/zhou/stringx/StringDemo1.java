package cn.zhou.stringx;

public class StringDemo1 {
	public static void main(String[] args) {
		String str = "ajfksfs";
		//通过下标找到指定位置字符
		char c = str.charAt(3);
		//获取字符串的长度
		int len = str.length();
		//获取字符串所对应的字符数组
		char[] ch = str.toCharArray();
	}
}
