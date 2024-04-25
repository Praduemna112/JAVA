package com.app.fruit;

public class Apple extends Fruit{

	public Apple(int color, int weight, String name, boolean fresh) {
		super(color, weight, name, fresh);

	}

	public void taste() {
		System.out.println("sweet and sour");
	}
	
	public void jam() {
		System.out.println("This is jam of apple");
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + ", name=" + name + ", fresh=" + fresh + "]";
	}


	

}
