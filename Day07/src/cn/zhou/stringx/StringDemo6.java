package cn.zhou.stringx;

public class StringDemo6 {
	public static void main(String[] args) {
		//判断字符串中是否有数字？
		String str = "4";
		boolean bl = str.matches(".*\\d.*");
		System.out.println(bl);
		//判断字符串中是否有至少2个数字？
		//      .*//d{2,}.* 连着的，这种写法不对，应该写成  .*//d.*//d.* 
		
	}
}
