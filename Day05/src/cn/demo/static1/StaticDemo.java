package cn.demo.static1;

public class StaticDemo {
	public static void main(String[] args) {
//		System.out.println(Student.classroom);  //一般通过类名来调静态变量
		Student s1 = new Student();
		s1.name = "zhou";
		s1.no = "123";
		s1.classroom = "room1";

		Student s2 = new Student();
		s2.name = "BIN";
		s2.no = "456";
		s2.classroom = "room2";
		
		s1.toStr();
		s2.toStr();
	} 
}
class Student {
	String name;
	String no;
	static String classroom;
	
	void toStr() {
		System.out.println(name + "\t" + no + "\t" + classroom);
	}
}
