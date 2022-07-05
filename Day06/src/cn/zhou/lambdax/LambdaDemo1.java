package cn.zhou.lambdax;

public class LambdaDemo1 {
	
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