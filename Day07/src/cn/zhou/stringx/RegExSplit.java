package cn.zhou.stringx;

public class RegExSplit {
	public static void main(String[] args) {
		String str = "a2bcd3ef4g";
		//数字在开头、尾巴、连数字开头、尾巴情况
		str.split("\\d");
	}
}
