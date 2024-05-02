package com.Rules;

import java.time.LocalDate;
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
	
	
	
	public static  Customer validateinpute( String first_name, String last_name,String email,String passward,
			double Amount,String dob,String plan,List<Customer>customers)throws CustException
	{

		 CheakForDupCustomer (email,customers);
		 LocalDate date =LocalDate.parse(dob);
		Serviceplans serviceplans = cheakForplan(plan, Amount);
		return new Customer( first_name,last_name,email,passward,Amount,date,serviceplans);
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


	public static Customer changepasswordCustomer(String next, String next2, List<Customer> customerList) {
		// TODO Auto-generated method stub
		System.out.println("enter email n ");
		
		
		return null;
	}


	

}








