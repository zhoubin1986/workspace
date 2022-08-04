package cn.zhou.mathx;

import java.util.Scanner;

public class MathDemo2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		String num = bigNumMultiplication(num1, num2);
		System.out.println(num);
	}

	public static String bigNumMultiplication(String f, String s) {
		// 获取首字母，判断是否是符号位
		char signA = f.charAt(0);
		char signB = s.charAt(0);
		char sign = '+';
		if (signA == '+' || signA == '-') {
			sign = signA;
			f = f.substring(1);// 使f返回一个子字符串，该字符串从原始字符串的第二位开始，一直到结尾结束（substring(索引)）
		}
		if (signB == '+' || signB == '-') {
			if (signB == sign) {
				sign = '+';
			} else {
				sign = '-';
			}
			s = s.substring(1);
		}
		// 将大数翻转并转换成字符数组
		char[] num1 = new StringBuffer(f).reverse().toString().toCharArray();
		// 字符串内容较长的时候，特别是这个字符串是动态拼接的时候，用String可能发生内存不够的错误，这种情况必须用stringbuffer
		char[] num2 = new StringBuffer(s).reverse().toString().toCharArray();
		// StringBuffer()的reverse方法作用是：使StringBuffer中的内容进行反转
		int len1 = num1.length;
		int len2 = num2.length;
		int[] result = new int[len1 + len2];
		// 计算最终最大长度
		// 开始做乘法
		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				result[i + j] += (int) (num1[i] - '0') * (int) (num2[j] - '0');
				// 用a[i]-'0'的作用是：如果直接转a[i]为int型那么只会显示a[i]所对应的ASCLL码值，减去字符0的ASCLL码值，正好为改数字，然后再转int型

			}
		}
		int leng = result.length;
		// 开始取余
		for (int i = 0; i < leng; i++) {
			if (result[i] >= 10) {
				result[i + 1] += result[i] / 10;
				result[i] %= 10;
			}
		}
		// 开始倒置,将result中的数组倒置存入StringBuffer
		StringBuffer sb = new StringBuffer();
		boolean bool = true;// 该字段用于标识是否有前置0，如果是0就不需要打印或者存储下来
		for (int i = leng - 1; i >= 0; i--) {
			if (result[i] == 0 && bool) {
				continue;
			}
			sb.append(result[i]);
			bool = false;
		}
		if (!sb.toString().equals("")) {
			if (sign == '-') {
				sb.insert(0, sign);
			}
		} else {
			sb.append(0);
		}
		return sb.toString();
	}
}
