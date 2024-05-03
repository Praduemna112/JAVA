package com.app.tester;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.PhoneBook.PhoneBook;
import com.app.PhoneBookValidation.PhoneBookValidation;

public class PhoneBookApp {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			boolean exit=false;
			Set<PhoneBook> phonebooklist= new HashSet<>();
			while(!exit) {
				System.out.println("-------Option-------\n 1. Accept details for Phone book\n ");
				System.out.println("Enter Choice ");
				try {
					switch (sc.nextInt()) {
					
					case 1:
						System.out.println("Enter details \n PhoneSNo  Name  BirthDate Email ");
						PhoneBook phonebook = PhoneBookValidation.Validateinput(sc.next(),sc.next(),sc.next(),sc.next());
						phonebooklist.add(phonebook);
						break;
					}
				}catch (Exception e) {
					System.out.println(e.getMessage());
					sc.nextLine();
				}
			}
		}
		
	}

}
