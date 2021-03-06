package cn.zhou.stringx;

public class RegExDemo2 {
	public static void main(String[] args) {
		String str = "abcde";
		//由5个字母组成
		System.out.println(str.matches("[a-zA-Z]{4}"));
		//由至少5个字母组成
//		System.out.println(str.matches("[a-zA-Z]{4}[a-zA-Z]+"));
		System.out.println(str.matches("[a-zA-Z]{5,}"));
		//密码由6-12个字符组成
		System.out.println(str.matches(".{6,12}"));
	}
}
