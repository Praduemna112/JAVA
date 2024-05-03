package com.app.PhoneBookValidation;

import com.PhoneBook.PhoneBook;
import com.PhoneException.PhoneException;

public class PhoneBookValidation {

	//all inputes
	//1234567890 p 2020-12-12 pd
	public static PhoneBook Validateinput(String phoneno, String name, String dob, String email) throws PhoneException {
		
		return new PhoneBook(CheakForDupPhoneNo(phoneno),name,null,email);
	}
	
	public static String CheakForDupPhoneNo(String phoneno) throws PhoneException {
		String regex = "((?=.*\\d)(?=.*[0-9]).{5,20}";
		if(phoneno.matches(regex))
			return phoneno;
		throw new PhoneException("Phone no is not Valid");
	}

}
