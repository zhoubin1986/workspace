package at.zhou.collectionx;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayListDemo {
	
}

//��ArrListģ���������������б������ݽṹʵ�ֹ���
class ArrList {
	//�ڵײ㶨��һ������洢Ԫ��
	private String[] data;
	//����Ԫ�ظ���
	private int size;
	
	public ArrList() {
		this.data = new String[10];
	}
	
	//�û��Զ�������Ԫ��
	public ArrList(int initialCapacity) {
		//У�������Ƿ����
		if(initialCapacity < 0) {
			throw new IllegalArgumentException();
		}
		this.data = new String[initialCapacity];
	}
	
	public void add(String str) {
		//���Ǵ�ŵ�λ�ã��Ƿ����������
		if(size >= data.length) {
			grow();
			//size 0��Ԫ��-->0λ��
			//size 1��Ԫ��-->1λ��
			//size 2��Ԫ��-->2λ��
			this.data[size++] = str;
//			size++;
		}
	}
	//���ݹ���
	private void grow() {
		int newCapacity = data.length < 2 ? 
				data.length + 1 : data.length + (data.length >> 1);
		//�ӳ�������ж�
		if(newCapacity < data.length) {
			newCapacity = data.length;
		}
		this.data = Arrays.copyOf(data,newCapacity);
		/*//�û�������0��1���������
		if(data.length <= 1) {
			this.data = Arrays.copyOf(data, data.length + 1);
		}else {
			this.data = Arrays.copyOf(data, data.length + (data.length) >> 1);
		}*/
//		this.data = Arrays.copyOf(data, data.length + (data.length >> 1));//0����1���ƶ���0,������
	}
	
	//����Ԫ��
	public void add(int index,String str) {
		//�жϲ����λ���Ƿ�Խ�磬���һλ����׷��û�����⣬���ǳ���size�ͳ�����
		if(index > size) {
//			throw new IndexOutOfBoundsException();
			throw new IndexOutOfBoundsException("Index:" + index + ",Size:" + size);
		}
		//�ж��Ƿ���Ҫ���ݣ�����Ĭ����10��Ԫ�أ���û������Ԫ��
		if(size >= data.length) {
			grow();
			//��Ҫ������λ�ÿճ�
			/*for(int i = size -1;i >= index;i--) {
				data[i + 1] = data[i];
			}*/
			
			//���帴��
			System.arraycopy(data, index, data, index + 1, size - index);
			data[index] = str;
			size++;//Ԫ�ظ�������������һ��
		}
	}
}