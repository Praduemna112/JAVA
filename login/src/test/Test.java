package test;

import java.text.ParseException;
import java.util.Scanner;

import Exceptions.InvalidEmailException;
import models.Customer;
import validationrules.ValidationRules;
import utils.Utils;

public class Test {
	

	public static void main(String[] args) {
			
		int ch = 0;
		Customer arr[] = new Customer[100];
		int c = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(ch!=-1) {
			ch = sc.nextInt();
			
			switch(ch) {
			
			case 1:
				try {
					Customer cust = Utils.inputCustomer();
					arr[c++]=cust;
				} catch (ParseException e) {
					e.printStackTrace();
				} catch (InvalidEmailException e) {
					e.printStackTrace();
				}
				break;
				
			case 2:
				break;
				
				
			case 3:
				break;
				
			default:
				System.out.println("Invalid choice");
			}
			
			
		}
	}
}
