package cn.demo.superclass;

public class SuperDemo {
	public static void main(String[] args) {
//		Dog d = new Dog();  //先创建父类对象在创建子类对象
//		d.eat();
		Animal a = new Cat("yellow"); //用父类声明，用子类创建对象，不确定具体是什么对象，向上造型
		a.eat();//不确定子类中是否有，向上造型，就近原则
//		a.catch_();  //不能调用子类中单独定义的属性和方法
	}
}

class Animal {
	String name;
	double weight;
	String color;	
	
	public Animal(String color) {
		this.color = color;
		System.out.println("创建了一个Animal父类对象");
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
	public Dog() { // 父类含参并不代表子类一定含有参数，子类有自己的无参构造方法，在里面调用了父类有参构造方法而已。
		super("yellow"); // 调用父类中的无参构造函数，这样就可以创建一个虚拟的父类对象了，不加super的话会默认添加父类的无参构造方法
		System.out.println("创建了一个子类Dog对象");
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
