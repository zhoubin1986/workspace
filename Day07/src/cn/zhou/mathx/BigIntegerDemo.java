package cn.zhou.mathx;

import java.math.BigInteger;

public class BigIntegerDemo {
	public static void main(String[] args) {
		//�����������ĳ˷�����,����Ҳ�����ַ������룬���ִ���longװ����
		BigInteger bi1 = new BigInteger("2345678909876654243424");
		BigInteger bi2 = new BigInteger("3345678909876654243424");
		System.out.println(bi1.multiply(bi2));
	}
}