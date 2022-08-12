package cn.zhou.throwablex;

import java.io.File;

public class ExceptionDemo {
	public static void main(String[] args) {
		//去读取一个文件，模拟异常处理，要么向上抛出，要么捕获
		try {
//			String msg = readTextFile("D:\\a.txt");//"H:\\a.txt"
			String msg = readTextFile("D:\\a.txt");
			System.out.println(msg);//如果抛出了异常对象，后续代码不在执行，所有后面不打印
		} catch (PathNotExistException e) {
			System.out.println("捕获到了一个异常：文件路径 不存在~");
		}
		
	}
	
	public static String readTextFile(String path) throws PathNotExistException {
		//文件路径问题
//		if(path.startsWith("D:\\")) { 
//			throw new PathNotExistException();
//		}
		if(!new File(path).exists()) {
			throw new PathNotExistException();
		}
		
		//文件格式问题
		if(!path.lastIndexOf(".txt")) {
			
		}
		
		return "读取成功~";
	}
}

class PathNotExistException extends Exception{
	
}
