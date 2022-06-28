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
		this.name = name;  //���������ף���ν�ǰ��name���Ϊһ�����Զ�����һ���ֲ�����
	}
	
	public Person(String name,String nickname) {
		this.name = name;
		this.nickname = nickname;
	}
	
	public Person(String name,String nickname,int age){
		this(name,nickname);  //����ŵ����õ�ǰ���Ӧ���췽���еĵ�һ��λ��
		this.age = age;
	}
	
	public Person(String name,int age) {
		if(age < 0 || age > 150){
			return;   //��������У���������ݺ����ԣ���������Ƿ�����
		}
		this.name = name;
		this.age = age;
	}
	
	public static void eat() {

	}
	
	public static void sleep() {

	}
}
