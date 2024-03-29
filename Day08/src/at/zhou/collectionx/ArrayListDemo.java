package at.zhou.collectionx;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayListDemo {
	
}

//用ArrList模拟这种线性数组列表的数据结构实现过程
class ArrList {
	//在底层定义一个数组存储元素
	private String[] data;
	//定义元素个数
	private int size;
	
	public ArrList() {
		this.data = new String[10];
	}
	
	//用户自定义输入元素
	public ArrList(int initialCapacity) {
		//校验容量是否合理
		if(initialCapacity < 0) {
			throw new IllegalArgumentException();
		}
		this.data = new String[initialCapacity];
	}
	
	public void add(String str) {
		//考虑存放的位置，是否放满来扩容
		if(size >= data.length) {
			grow();
			//size 0个元素-->0位置
			//size 1个元素-->1位置
			//size 2个元素-->2位置
			this.data[size++] = str;
//			size++;
		}
	}
	//扩容过程
	private void grow() {
		int newCapacity = data.length < 2 ? 
				data.length + 1 : data.length + (data.length >> 1);
		//加出界情况判断
		if(newCapacity < data.length) {
			newCapacity = data.length;
		}
		this.data = Arrays.copyOf(data,newCapacity);
		/*//用户传递如0，1会出现问题
		if(data.length <= 1) {
			this.data = Arrays.copyOf(data, data.length + 1);
		}else {
			this.data = Arrays.copyOf(data, data.length + (data.length) >> 1);
		}*/
//		this.data = Arrays.copyOf(data, data.length + (data.length >> 1));//0或者1右移都是0,出问题
	}
	
	//插入元素
	public void add(int index,String str) {
		//判断插入的位置是否越界，最后一位可以追加没有问题，但是超过size就出错了
		if(index > size) {
//			throw new IndexOutOfBoundsException();
			throw new IndexOutOfBoundsException("Index:" + index + ",Size:" + size);
		}
		//判断是否需要扩容，可能默认是10个元素，你没发插入元素
		if(size >= data.length) {
			grow();
			//需要将插入位置空出
			/*for(int i = size -1;i >= index;i--) {
				data[i + 1] = data[i];
			}*/
			
			//整体复制
			System.arraycopy(data, index, data, index + 1, size - index);
			data[index] = str;
			size++;//元素个数重新增加了一个
		}
	}
}