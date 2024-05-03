package com.Rules;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import com.Customer.Customer;
import com.Customer.Serviceplans;
import com.CustomerException.CustException;

public class ValidationRules {
	
	public static void CheakForDupCustomer(String email,List<Customer> customerList) throws CustException
	{
	
		Customer newCust =new Customer (email);
		
		if(customerList.contains(newCust))
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
			double Amount,String dob,String plan,List<Customer>customers)throws CustException
	{

		 CheakForDupCustomer (email,customers);
		 cheakpassword(password);
		 LocalDate date =LocalDate.parse(dob);
		 cheakage(dob);
		Serviceplans serviceplans = cheakForplan(plan, Amount);
		return new Customer( first_name,last_name,email,password,Amount,date,serviceplans);
	}
	
	public static Customer authenticationCustomer (String email,String password,List<Customer>list) throws CustException
	{
		//searching -- by pk --yes contain | indexof 
		//contain : not usefull ret boolean
		Customer newCustomer =new Customer(email);
		int index=list.indexOf(newCustomer);
		if (index == -1)
			throw new CustException("invalide email,login failed");
		Customer customer=list.get(index);
		if (customer.getPassward().equals(password))
		return customer;
		throw new CustException("invaide password,login failed");
		//1.indexof
		//2.invalid email :throw custom exc
		//3.get--Customer ref--chkpwd --invalid --throw custom ext ret the customer ref

	}


	public static Customer unsubscribeUser(String email, String password, List<Customer> customerList) throws CustException {
		// TODO Auto-generated method stub
		Customer customer =authenticationCustomer(email,password,customerList);
		int index =customerList.indexOf(customer);
		if (index == -1)
		throw new CustException("Email not found");
		return customerList.remove(index);
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
	
	public static String removeAccount(String email, List<Customer> customersList) throws CustException
	   {
		int index = customersList.indexOf(new Customer(email));
		if(index == -1)
		 throw new CustException("can not ne unsubscribe");
		return "can be successfully"+ customersList.remove(index).getEmail();
	   }
//	public static String removeAccountEmailFistName(String email,String firstname,String lastname,List<Customer>customerslist) //throws CustException
//	{	 
//		int index = customerslist.indexOf(new Customer(email));
//		int index1 = customerslist.indexOf(new Customer(firstname,lastname));
//		System.out.println(index+"    "+index1);
////		if (index != -1)
////			return "can be remove from email"+ customerslist.remove(index);
////		else if (index1 != -1)
////			return "can be remove from first name"+ customerslist.remove(index1);
////		else
////			throw new CustException ("can not ne unsubscribe");
//		return null;
//	}
	
public static void removeAccountEmailFistName(String email,String firstname,String lastname,List<Customer>customerslist) throws CustException
	{
//	Customer c =new Customer(email);
//	Customer c1 = new Customer(email,firstname,lastname);
//	int index = customerslist.indexOf(c1);
//	int index1 = customerslist.indexOf(c1);
//	
//	if(index != -1) {
//		customerslist.remove(customerslist.indexOf(c1));
//		System.out.println("s1");
//	}
//	else {
//		if(index1!=-1)
//		{
//			customerslist.remove(customerslist.indexOf(c1));
//			System.out.println("s2");
//		}
//	}
//	throw new CustException("both are wrong");
//
	}
}








