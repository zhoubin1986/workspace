package cn.zhou.stringx;

public class RegExSplit {
	public static void main(String[] args) {
		String str = "23a245bcd3ef4g";
		//数字在开头或者中间（可以切出空字符串）、尾巴、连数字开头、尾巴(全部切掉)情况
		String[] arr = str.split("\\d");
		System.out.println(arr.length);
		for(String s:arr) {
			System.out.println(s);
		}
	}
}
