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
		// ��ȡ����ĸ���ж��Ƿ��Ƿ���λ
		char signA = f.charAt(0);
		char signB = s.charAt(0);
		char sign = '+';
		if (signA == '+' || signA == '-') {
			sign = signA;
			f = f.substring(1);// ʹf����һ�����ַ��������ַ�����ԭʼ�ַ����ĵڶ�λ��ʼ��һֱ����β������substring(����)��
		}
		if (signB == '+' || signB == '-') {
			if (signB == sign) {
				sign = '+';
			} else {
				sign = '-';
			}
			s = s.substring(1);
		}
		// ��������ת��ת�����ַ�����
		char[] num1 = new StringBuffer(f).reverse().toString().toCharArray();
		// �ַ������ݽϳ���ʱ���ر�������ַ����Ƕ�̬ƴ�ӵ�ʱ����String���ܷ����ڴ治���Ĵ����������������stringbuffer
		char[] num2 = new StringBuffer(s).reverse().toString().toCharArray();
		// StringBuffer()��reverse���������ǣ�ʹStringBuffer�е����ݽ��з�ת
		int len1 = num1.length;
		int len2 = num2.length;
		int[] result = new int[len1 + len2];
		// ����������󳤶�
		// ��ʼ���˷�
		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				result[i + j] += (int) (num1[i] - '0') * (int) (num2[j] - '0');
				// ��a[i]-'0'�������ǣ����ֱ��תa[i]Ϊint����ôֻ����ʾa[i]����Ӧ��ASCLL��ֵ����ȥ�ַ�0��ASCLL��ֵ������Ϊ�����֣�Ȼ����תint��

			}
		}
		int leng = result.length;
		// ��ʼȡ��
		for (int i = 0; i < leng; i++) {
			if (result[i] >= 10) {
				result[i + 1] += result[i] / 10;
				result[i] %= 10;
			}
		}
		// ��ʼ����,��result�е����鵹�ô���StringBuffer
		StringBuffer sb = new StringBuffer();
		boolean bool = true;// ���ֶ����ڱ�ʶ�Ƿ���ǰ��0�������0�Ͳ���Ҫ��ӡ���ߴ洢����
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
