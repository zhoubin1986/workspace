/**
 * 
 */
package cn.zhou.stringx;

/**
 * @author Administrator
 *
 */
public class RegExDemo3 {
	public static void main(String[] args) {
//		String str = "Dog Parrot Pig Cat";
//		//想将Dog和Cat交换位置，只能用引用$，不能用捕获组，regex
//		System.out.println(str.replaceAll("(Dog)(.*)(Cat)", "$3$2$1"));
		//叠字替换
//		String str = "我我我爱爱爱爱学学习";
//		System.out.println(str.replaceAll("(.)\\1+", "$1"));
		String str = "我我我爱爱爱爱学习学习学习学习学习";
		System.out.println(str.replaceAll("(.)\\1+", "$1").replaceAll("(..)\\1+", "$1"));
	}
}
