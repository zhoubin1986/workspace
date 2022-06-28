package cn.zhoubin.demo;

public class DataCorrectDemo {
	public static void main(String[] args) {
		byte b = 127;
//		b += 'a';
//		b = b + 1;
		System.out.println(b);
		char c = 9;
		System.out.println(c);
		Student s1 = new Student();
		s1.setAge(10);
		s1.getAge();
	}
}

class Student {
	private String name;
	private int age;
	private byte sex;

	public void setAge(int age) {
		if (age < 0 || age > 150) {
			return;
		}
		this.age = age;
//		System.out.println(this.sex);
//		System.out.println(this.age);
	}

	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSex(byte sex) {
		this.sex = sex;
	}

	public byte getSex() {
		return sex;
	}

}
