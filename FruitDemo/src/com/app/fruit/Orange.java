package com.app.fruit;

public class Orange extends Fruit{

	public Orange(int color, int weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
		// TODO Auto-generated constructor stub
	}
	
	public void taste() {
		System.out.println("sour");
	}
	
	public void juice() {
		System.out.println("This is orange");
	}

	@Override
	public String toString() {
		return "Orange [color=" + color + ", weight=" + weight + ", name=" + name + ", fresh=" + fresh + "]";
	}

	
}
