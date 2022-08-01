package cn.zhou.mathx;

import java.math.BigDecimal;

public class MathDemo1 {
	//strictfp是一个修饰符，作用：在计算过程中/方法的执行中，要求数据必须以80位二进制来计算，double本身是64位
	//但是最后存储的依然是64位，
	public static strictfp void main(String[] args) {
		//绝大多数小数转为二进制时候都是不精确的
//		double d1 = 3.14;
//		double d2 = 2.13;
//		System.out.println(d1 - d2);
		
		//BigDecimal用于小数的精确计算
//		BigDecimal bd1 = new BigDecimal(3.21);
//		BigDecimal bd2 = new BigDecimal(2.84);
//		System.out.println(bd1.subtract(bd2));//bd1 - bd2会报错
		//如果想进一步精确计算，需要将参数以字符串形式，类似于小学列图来减的过程
		BigDecimal bd1 = new BigDecimal("3.21");
		BigDecimal bd2 = new BigDecimal("2.84");
		System.out.println(bd1.subtract(bd2));
		System.out.println(bd1.add(bd2));
		
		
	}
}
