package cn.zhou.throwablex;

public class ExceptionDemo6 {
	public static void main(String[] args) {
//		System.out.println(m().getName());
//		System.out.println(m().getAge());
		System.out.println(m());
	}
	
	private static Student m() {
		Student s = new Student();
		try {
			s.setName("翠花");
			s.setAge(18);
			return s;
			//结果区域存储的是s的地址
		} finally {
			//Student s = new Student(); //就不一样了
			s.setName("周星星");
			s.setAge(88);
		}
	}
}

class Student{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}