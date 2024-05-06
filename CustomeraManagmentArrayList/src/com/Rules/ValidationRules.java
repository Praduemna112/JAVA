package com.Rules;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;

import com.Customer.Customer;
import com.Customer.Serviceplans;
import com.CustomerException.CustException;

public class ValidationRules {
	
	public static void CheakForDupCustomer(String email,Map<String,Customer> customerList) throws CustException
	{
	
		if(customerList.containsKey(email))
			throw new CustException("dup email ");
		
	}
	
	
	public static Serviceplans cheakForplan(String plan,double ammount) throws CustException
	{
		Serviceplans serviceplan = Serviceplans.valueOf(plan.toUpperCase());
		if (serviceplan.getPlancost() == ammount) {
			return serviceplan;
		}
			throw new CustException("Resgistation ammount does not match ");
	}
	
	//password validation 
	public static void cheakpassword(String password) throws CustException
	{
		String regex ="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[#@$*]).{5,20})";
			
		if (password.matches(regex))
		return;
		throw new CustException("Follow the instruction ((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[#@$*])");
	}

	// add validate all input
	public static  Customer validateinpute( String first_name, String last_name,String email,String password,
			double Amount,String dob,String plan,Map<String,Customer>customers)throws CustException
	{

		 CheakForDupCustomer (email,customers);
		 cheakpassword(password);
		 LocalDate date =LocalDate.parse(dob);
		 cheakage(dob);
		Serviceplans serviceplans = cheakForplan(plan, Amount);
		return new Customer( first_name,last_name,email,password,Amount,date,serviceplans);
	}
	
	public static Customer authenticationCustomer (String email,String password,Map<String,Customer>list) throws CustException
	{
		//searching -- by pk --yes contain | indexof 
		//contain : not usefull ret boolean
		
		Customer cust=list.get(email);
		if (cust == null)
			throw new CustException("invalide email,login failed");
	
		if (cust.getPassward().equals(password))
			return cust;
		
		throw new CustException("invaide password,login failed");
		//1.indexof
		//2.invalid email :throw custom exc
		//3.get--Customer ref--chkpwd --invalid --throw custom ext ret the customer ref

	}


	public static Customer unsubscribeUser(String email, String password, Map<String,Customer> customerList) throws CustException {
		// TODO Auto-generated method stub
		Customer customer =customerList.remove(email);
		if (customer == null)
			throw new CustException("Email not found");
		
		return customer;
	}
	
	// validate age 
	
	public static LocalDate cheakage(String dob)throws CustException
	{
		LocalDate date =LocalDate.parse(dob);
		int age = Period.between(date, LocalDate.now()).getYears();
		if (age<21)
		throw new CustException("you are not eligible your age is less!! ");
		return date;
	}
	
	
}








