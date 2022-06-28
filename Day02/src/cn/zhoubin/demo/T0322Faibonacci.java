package cn.zhoubin.demo;

import java.util.Scanner;

public class T0322Faibonacci {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int interm = s.nextInt();
		if (interm <= 0) {
			interm = s.nextInt();
		}
		if (interm == 1) {
			System.out.print("0");
		}
		if (interm == 2) {
			System.out.print("0,1");
		} else {
			int x = 0;
			int y = 1;
			for (int i = 3; i <= interm; i++) {
				int z = x + y;
				x = y;
				y = z;
				System.out.print("0,1," + z + ",");
			}
		}
	}
}
