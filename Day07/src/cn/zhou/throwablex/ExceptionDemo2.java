package cn.zhou.throwablex;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class ExceptionDemo2 {
	
}

//异常对方法的重载没有影响
class A {
	public void m() throws IOException{
		System.out.println("m()");
	}
	
	public void m(int i) throws ParseException{
		System.out.println("m(int)");
	}
}

class B extends A{
//	public void m() throws ParseException{  //
//		System.out.println("B m()");
//	}
	
	//EOFException,FileNotFoundException可以包装成IOException
	public void m() throws EOFException,FileNotFoundException{
		System.out.println("B m()");
	}
}


