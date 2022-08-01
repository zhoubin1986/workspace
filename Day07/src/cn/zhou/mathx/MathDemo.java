package cn.zhou.mathx;

public class MathDemo {
	public static void main(String[] args) {
		System.out.println(Math.E);//E-->自然底数，无限不循环的小数
		System.out.println(Math.abs(-10));
		System.out.println(Math.cbrt(-27));
		System.out.println(Math.ceil(5.2)); //向上取整
		System.out.println(Math.floor(5.2));//向下取整
		System.out.println(Math.round(5.2));//四舍五入
		System.out.println(Math.pow(3, 4)); //幂
		
		System.out.println(Math.random());//返回[0,1)之间的随机数
		//获取30-80之间的随机整数
		System.out.println((int)(Math.random() * 50 + 30));
		
		//System.out.println(1 + "2");
		//生成随机验证码
//		String result = "";
//		for(int i=0;i<6;i++) {
//			int j = (int)(Math.random() * 10);
//			result += j;
//		}
//		System.out.println(result);
		//生成带字母验证码
		String result = "";
		char[] ca = {'a','b','c','d','e','f','A','B','C'}; //26+26+10=62
		for(int i=0;i<6;i++) {
			int index = (int)(Math.random() * 9);
			result += ca[index];
		}
		System.out.println(result);
	}
}
