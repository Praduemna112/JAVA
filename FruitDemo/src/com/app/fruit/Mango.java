package com.app.fruit;

public class Mango extends Fruit {

	public Mango(int color, int weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
		// TODO Auto-generated constructor stub
	}
	
	public void taste() {
		System.out.println("sweet");
	}
	
	public void pulp() {
		System.out.println(this.color+" "+" of mango");
	}

	@Override
	public String toString() {
		return "Mango [color=" + color + ", weight=" + weight + ", name=" + name + ", fresh=" + fresh + "]";
	}
	
	
}
