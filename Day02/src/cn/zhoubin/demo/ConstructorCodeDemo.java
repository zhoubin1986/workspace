package cn.zhoubin.demo;

public class ConstructorCodeDemo {
	public static void main(String[] args) {
		Baby b1 = new Baby(6.6);
		System.out.println(b1.weight);// 先于构造方法执行
		Baby b2 = new Baby(true, 6.6);
		System.out.println(b2.weight);
	}
}

class Baby {
	String name;
	boolean sex;
	double weight;
	{
		this.cry(); //当前活动类， 初始化代码块或构造代码块，应该放构造方法中第一行位置
		this.eat();
	}

	public Baby(boolean sex, double weight) {
		this.sex = sex;
		this.weight = weight;
	}

	public Baby(String name, boolean sex, double weight) {
		this(sex, weight);
		this.name = name;
	}

	public Baby(double weight) { // 特殊场合
		this.weight = weight;
	}

	public void cry() {
		System.out.println("cry!");
	}

	public void eat() {
		System.out.println("eat!");
	}

	public void sleep() {
		System.out.println("sleep!");
	}
}
