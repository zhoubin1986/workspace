package cn.demo.superclass;

public class SuperDemo {
	public static void main(String[] args) {
//		Dog d = new Dog();  //�ȴ�����������ڴ����������
//		d.eat();
		Animal a = new Cat("yellow"); //�ø��������������ഴ�����󣬲�ȷ��������ʲô������������
		a.eat();//��ȷ���������Ƿ��У��������ͣ��ͽ�ԭ��
//		a.catch_();  //���ܵ��������е�����������Ժͷ���
	}
}

class Animal {
	String name;
	double weight;
	String color;	
	
	public Animal(String color) {
		this.color = color;
		System.out.println("������һ��Animal�������");
	}

	public void eat(String str) {
		// TODO Auto-generated method stub
		System.out.println("eat2");
	}

	public void eat() {
		System.out.println("animal->eat");
	}

	public void sleep() {
		System.out.println("sleep!");
	}
}

class Dog extends Animal {
	public Dog() { // ���ຬ�β�����������һ�����в������������Լ����޲ι��췽��������������˸����вι��췽�����ѡ�
		super("yellow"); // ���ø����е��޲ι��캯���������Ϳ��Դ���һ������ĸ�������ˣ�����super�Ļ���Ĭ����Ӹ�����޲ι��췽��
		System.out.println("������һ������Dog����");
	}

	public void shout() {
		super.eat();
		System.out.println("shout!");
	}
}

class Cat extends Animal {
	public Cat(String color) {
		super(color);
		System.out.println("---cat!");
	}
	
	@Override
	public void eat(){
		System.out.println("Cat->eat");
	}
	
	@Override
	public void eat(String str){
		System.out.println("eat3");
	}
	
	public void catch_() {
		System.out.println("catch!");
	}
}
