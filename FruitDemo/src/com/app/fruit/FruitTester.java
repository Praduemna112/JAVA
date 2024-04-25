package com.app.fruit;

import java.util.Scanner;

public class FruitTester {

	public static void main(String[] args) {

		int n = 0;
		Scanner sc = new Scanner(System.in);
		Fruit arr[] = new Fruit[10];
		int c = 0;
		int index = 0;
		
		while (n != -1) {

			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display");
			System.out.println("5. Stale");
			System.out.println("6. Make all sour fruits stale");
			System.out.println("7. Invoke fruit specific functionality");

			System.out.println("Enter the choice");
			n = sc.nextInt();

			switch (n) {

			case 1:
				arr[c] = new Mango(1, 10, "apple", false);
				c++;
				System.out.println("added successfully");
				break;

			case 2:
				arr[c] = new Orange(1, 10, "orange", false);
				c++;
				System.out.println("added successfully");
				break;

			case 3:
				arr[c] = new Apple(1, 10, "apple", false);
				c++;
				System.out.println("added successfully");
				break;

			case 4:
				for (int i = 0; i < c; i++) {
					System.out.println(arr[i]);
				}
				break;

			case 5:
				System.out.println("Enter index");
				index = sc.nextInt();
				arr[index].setFresh(false);
				break;

			case 6:
				int index_1 = 0;
				index_1 = sc.nextInt();
				if (arr[index_1] instanceof Orange) {
					if (arr[index_1] instanceof Orange) {
						arr[index_1].setFresh(false);
					}
				}
				break;

			case 7:
				int index1 = 0;
				index1 = sc.nextInt();
				if (arr[index1] instanceof Mango) {
					Mango mango = (Mango) arr[index1];
					mango.taste();
					mango.pulp();
				} else if (arr[index1] instanceof Orange) {
					if (arr[index1] instanceof Orange) {
						Orange orange = (Orange) arr[index1];
						orange.taste();
						orange.juice();
					}
				} else if (arr[index1] instanceof Apple) {
					if (arr[index1] instanceof Apple) {
						Apple apple = (Apple) arr[index1];
						apple.taste();
						apple.jam();
					}
				}
				break;

			default:
				System.out.println("Invalid choice");
			}

		}

	}
}
