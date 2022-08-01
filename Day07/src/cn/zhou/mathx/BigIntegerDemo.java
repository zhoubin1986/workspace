package cn.zhou.mathx;

import java.math.BigInteger;

public class BigIntegerDemo {
	public static void main(String[] args) {
		//算两个大数的乘法运算,参数也必须字符串传入，数字传入long装不了
		BigInteger bi1 = new BigInteger("2345678909876654243424");
		BigInteger bi2 = new BigInteger("3345678909876654243424");
		System.out.println(bi1.multiply(bi2));
	}
}
