package cn.demo.static1;

public class StaticDemo5 {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.i);
	}

}

class Test {
	// static {
	// i += 5;
	// }
	// static int i = 3;

	// static {
	// i = 5;
	// }
	// static int i = 3;

	static {
		i = 5;
	}
	static int i;

}