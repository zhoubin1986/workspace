package cn.zhou.stringx;

import java.util.Scanner;

public class RegExChip {
	public static void main(String[] args) {
		//输入一个字符串，可以认为这个字符串由多个单字或者叠字拼接，每一个单字或者叠字称之为一个碎片，计算碎片的长度
		//aabbbcccde  -->平均长度：10/5=2
		//aaabbb-->2  aabb-->2  ab-->2
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		double len = str.length();
		double len_chip = str.replaceAll("(.)\\1+", "$1").length();
		double len_chip_av = len / len_chip;
		System.out.println(len_chip_av);
		
	}
}
