package cn.zhou.throwablex;

import java.io.File;

public class ExceptionDemo1 {
	public static void main(String[] args) {
//		readTextFile(null);
		try {
//			String msg = readTextFile("D:\\a.txt");//"H:\\a.txt"
			String msg = readTextFile("e:\\a.bmp");//�������ǿ������ģ�ֻ�ܿ���������֮ǰ�Ķ���throw Exception,ֻ�������������࣬�ܿ��ܻ�©���׵������쳣
			System.out.println(msg);// ����׳����쳣���󣬺������벻��ִ�У����к��治��ӡ
		} catch (PathNotExistException | FormatErrorException e) {
			System.out.println(e.getMessage()); // ���鴦���쳣
//			System.out.println("������һ���쳣���ļ�·�� ������~");
		}catch (Exception e) {
			
		}
	}

	public static String readTextFile(String path) throws Exception {
		if (path == null) {
			throw new NullPointerException("����Ϊ��~"); // ����ʱ�쳣
		}

		// �ļ�·������
//		if(path.startsWith("D:\\")) { 
//			throw new PathNotExistException();
//		}
		if (!new File(path).exists()) {
			throw new PathNotExistException("·������~"); // ����ʱ�쳣
		}

		// �ļ���ʽ����
		if (!path.endsWith(".txt")) {
			int index = path.lastIndexOf('.');
			String str_endwith = path.substring(index + 1);
			throw new FormatErrorException("��Ҫһ��txt�ļ������Ǵ������һ��" + str_endwith + "�ĸ�ʽ"); // ����ʱ�쳣
		}

		return "��ȡ�ɹ�~";
	}
}