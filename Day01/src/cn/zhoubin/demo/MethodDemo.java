package cn.zhoubin.demo;


public class MethodDemo {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Sam";
		p.age = 10;
		changeName(p.name);
		System.out.println(p.name);
		
		changeNickName(p);
		System.out.println(p.nickname);
	}
	
	private static void changeName(String name) {
		name = "Mikey";  //方法里面只有一个变量而已
	}
	
	private static void changeAge(int age) {
		age += 5;
	}
	
	private static void changeNickName(Person p) {
		p.nickname = "M-M";
	}
}