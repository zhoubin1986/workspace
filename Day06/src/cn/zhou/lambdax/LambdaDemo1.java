package cn.zhou.lambdax;

public class LambdaDemo1 {
	public static void main(String[] args) {
		/*Factory f = new Factory() {
			@Override
			public Clothes makeClother(String color, double price) {
				return new Clothes(color,price);
			}
		};*/
		
//		Factory f = (color,price) -> new Clothes(color,price);
		//方法体只有一句，直接调用了已有类中的构造方法
		Factory f = Clothes::new;
		Clothes c = f.makeClother("RED", 1.0);
		System.out.println(c.getColor());
	}
}

interface Factory {
	Clothes makeClother(String color,double price);
}

class Clothes {
	private String color;
	private double price;
	
	public Clothes(String color,double price) {
		super();
		this.setColor(color);
		this.setPrice(price);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}