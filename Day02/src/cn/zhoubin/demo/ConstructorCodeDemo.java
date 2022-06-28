package cn.zhoubin.demo;

public class ConstructorCodeDemo {
	public static void main(String[] args) {
		Baby b1 = new Baby(6.6);
		System.out.println(b1.weight);// ���ڹ��췽��ִ��
		Baby b2 = new Baby(true, 6.6);
		System.out.println(b2.weight);
	}
}

class Baby {
	String name;
	boolean sex;
	double weight;
	{
		this.cry(); //��ǰ��࣬ ��ʼ�������������飬Ӧ�÷Ź��췽���е�һ��λ��
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

	public Baby(double weight) { // ���ⳡ��
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
