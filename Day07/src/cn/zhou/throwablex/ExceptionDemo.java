package cn.zhou.throwablex;

import java.io.File;
import java.text.Format;

public class ExceptionDemo {
	public static void main(String[] args) {
		// ȥ��ȡһ���ļ���ģ���쳣������Ҫô�����׳���Ҫô����
//		String msg = readTextFile("D:\\a.bmp");  //����ʱ�쳣
		/*
		 * try { // String msg = readTextFile("D:\\a.txt");//"H:\\a.txt" String msg =
		 * readTextFile("e:\\a.bmp"); System.out.println(msg);//
		 * ����׳����쳣���󣬺������벻��ִ�У����к��治��ӡ } catch (PathNotExistException e) {
		 * System.out.println(e.getMessage()); //
		 * System.out.println("������һ���쳣���ļ�·�� ������~"); } catch (FormatErrorException e) {
		 * // System.out.println("�ļ���ʽ����ȷ"); System.out.println(e.getMessage()); }
		 * }catch(Exception e){ System.out.println(e.getMessage()); //�������ͣ��������쳣���ø����쳣����
		 * }
		 */

		try {
//				String msg = readTextFile("D:\\a.txt");//"H:\\a.txt"
			String msg = readTextFile("e:\\a.bmp");
			System.out.println(msg);// ����׳����쳣���󣬺������벻��ִ�У����к��治��ӡ
		} catch (PathNotExistException | FormatErrorException e) {
			System.out.println(e.getMessage());  //���鴦���쳣
//				System.out.println("������һ���쳣���ļ�·�� ������~");
		} 
	}

	public static String readTextFile(String path) throws PathNotExistException, FormatErrorException {
		// �ļ�·������
//		if(path.startsWith("D:\\")) { 
//			throw new PathNotExistException();
//		}
		if (!new File(path).exists()) {
			throw new PathNotExistException("·������~");
		}

		// �ļ���ʽ����
		if (!path.endsWith(".txt")) {
			int index = path.lastIndexOf('.');
			String str_endwith = path.substring(index + 1);
			throw new FormatErrorException("��Ҫһ��txt�ļ������Ǵ������һ��" + str_endwith + "�ĸ�ʽ");
		}

		return "��ȡ�ɹ�~";
	}
}

class PathNotExistException extends Exception {
//	private String message;
	public PathNotExistException(String msg) {
		super(msg); // �Ѿ�д�õ�
	}
//	public String getMessage() {
//		return message;
//	}
}

class FormatErrorException extends Exception {
	private String message;

	public FormatErrorException(String msg) {
		this.message = msg;
	}

	public String getMessage() {
		return message;
	}
}