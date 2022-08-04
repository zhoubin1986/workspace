package cn.zhou.mathx;

import java.util.Arrays;
import java.util.Scanner;

public class MathDemo2 {
	public static void main(String[] args) {
		// 如何计算两个千位数的乘积---基本手段，不用BigInteger算。（京东面试题）
		// 99 * 99 < 99 * (99 + 1)=9900 ,999 * 999 < 999000

//		int[] in1 = { 7, 5,3};
//		int[] in2 = { 5, 6,9 };
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		int[] in1 = new int[str1.length()];
		int[] in2 = new int[str2.length()];

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		for (int i = 0, j = ch1.length - 1; i < ch1.length; i++, j--) {
			in1[j] = ch1[i] - '0'; // 注意次序
		}
		for (int i = 0, j = ch2.length - 1; i < ch1.length; i++, j--) {
			in2[j] = ch2[i] - '0';
		}
		/*
		 * int[] result = new int[in1.length + in2.length]; for (int i = 0; i <
		 * in1.length; i++) { for (int j = 0; j < in2.length; j++) { result[i + j] +=
		 * in2[i] * in1[j]; } }
		 */

		int[] result = new int[in1.length + in2.length];
		for (int i = 0; i < in1.length; i++) {
			for (int j = 0; j < in2.length; j++) {
				result[i + j] += in2[i] * in1[j];//123*12或12*123-->会异常ArrayIndexOutOfBoundsException
			}
		}
		/*
		 * for(int i=0;i<result.length;i++) { 这种写法不对，因为2位*2位可能是三位数，得长度-1，但总长度<m+n
		 * result[i] = result[i] % 10; result[i + 1] += result[i] / 10; }
		 */
		for (int i = 0; i < result.length - 1; i++) {
			int temp = result[i];
			result[i] %= 10;
			result[i + 1] += temp / 10;
		}

//		System.out.println(Arrays.toString(result));
		ReverseWithStringChatAt reverseWithStringBuilder = new ReverseWithStringChatAt();
		reverseWithStringBuilder.reverseWithStringChatAt(Arrays.toString(result));
	}
}

class ReverseWithStringChatAt {
	public String reverseWithStringChatAt(String string) {
		final StringBuilder builder = new StringBuilder();
		for (int i = (string.length() - 1); i >= 0; i--) {
			builder.append(string.charAt(i));
		}
		display(string, builder.toString());
		return builder.toString();
	}

	private void display(String input, String output) {
//		System.out.println(" input string :: " + input);
		System.out.println(" output string :: " + output);
	}
}
