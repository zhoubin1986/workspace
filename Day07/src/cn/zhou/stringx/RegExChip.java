package cn.zhou.stringx;

import java.util.Scanner;

public class RegExChip {
	public static void main(String[] args) {
		//����һ���ַ�����������Ϊ����ַ����ɶ�����ֻ��ߵ���ƴ�ӣ�ÿһ�����ֻ��ߵ��ֳ�֮Ϊһ����Ƭ��������Ƭ�ĳ���
		//aabbbcccde  -->ƽ�����ȣ�10/5=2
		//aaabbb-->2  aabb-->2  ab-->2
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		double len = str.length();
		double len_chip = str.replaceAll("(.)\\1+", "$1").length();
		double len_chip_av = len / len_chip;
		System.out.println(len_chip_av);
		
	}
}