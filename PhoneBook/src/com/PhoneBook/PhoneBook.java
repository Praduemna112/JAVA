package com.PhoneBook;

import java.time.LocalDate;

public class PhoneBook {
	private String phonenumber;
	private String Name;
	private LocalDate date;
	private String email;
	private static int counter =0;
	
	// parameterized constructor
	public PhoneBook(String phonenumber, String name, LocalDate date, String email) {
		super();
		counter++;
		this.phonenumber = phonenumber;
		Name = name;
		this.date = date;
		this.email = email;
	}
	
	

	public PhoneBook(String name, LocalDate date) {
		super();
		Name = name;
		this.date = date;
	}



	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "PhoneBook [phonenumber=" + phonenumber + ", Name=" + Name + ", date=" + date + ", email=" + email + "]";
	}
	
	//
	@Override
	public boolean equals (Object o)
	{
		System.out.println("in PhoneBook equals");
		if (o instanceof PhoneBook)
		{
			PhoneBook c= (PhoneBook)o;
			return (this.email.equals(c.email)&& this.date.equals(c.date));
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return 31*(Name.hashCode()*date.hashCode());
	}
	
	
	
	
}
