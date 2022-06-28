package cn.zhoubin.demo;

public class PersonDemo {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.name);
		Person p2 = new Person("mm",-150);
		System.out.println(p2.age);
		
	}
	
	
}

class Person {
	String name;
	int age;
	byte sex;
	String nickname;
	
	public Person() {
	
	}
	
	public Person(String name) {
		this.name = name;  //属性是蓝底，如何将前边name标记为一个属性而不是一个局部变量
	}
	
	public Person(String name,String nickname) {
		this.name = name;
		this.nickname = nickname;
	}
	
	public Person(String name,String nickname,int age){
		this(name,nickname);  //必须放到调用当前类对应构造方法中的第一行位置
		this.age = age;
	}
	
	public Person(String name,int age) {
		if(age < 0 || age > 150){
			return;   //意义在于校验输入数据合理性，避免输入非法数据
		}
		this.name = name;
		this.age = age;
	}
	
	public static void eat() {

	}
	
	public static void sleep() {

	}
}
