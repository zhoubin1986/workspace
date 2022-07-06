package cn.zhou.packagex;

//import java.util.Arrays;
//import java.util.Scanner;
import java.util.*; //只导入util下的类，子包不导入
import java.util.concurrent.Semaphore; //Semaphore类在util子包下

public class PackageDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Semaphore s1 = new Semaphore(3);
		int[] arr = new int[5];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
