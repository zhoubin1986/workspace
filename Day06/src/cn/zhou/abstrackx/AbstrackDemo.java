package cn.zhou.abstrackx;

public class AbstrackDemo {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.eat();
	}
}

abstract class Animal {
	String color;
	double weight;

	public abstract void eat(); // ʡ��������

	public void sleep() {
		System.out.println("Animal-->sleep");
	}
}

abstract class Pet {
	private Pet() {

	}

	// �ڲ��࣬�ǿɼ���
	class Pet_Son extends Pet {

	}
}

/*
 * class Pet_Son extends Pet { public Pet_Son() { super(); //Ĭ�� } }
 */

class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println("Dog-->eat");
	}

	public void sleep() {
		System.out.println("Dog-->sleep");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("Cat-->eat");
	}

	public void sleep() {
		System.out.println("Cat-->sleep");
	}
}

class Pig extends Animal {
	@Override
	public void eat() {

	}

}
