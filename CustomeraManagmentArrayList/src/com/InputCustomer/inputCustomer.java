package com.InputCustomer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.Customer.Customer;
import com.Customer.Serviceplans;

public class inputCustomer {
	public static Map<String,Customer> populatedCustomer(){
		Customer a1=new Customer ("Viki","Bhaii", "viki123@gmail.com", "v123", 1000, LocalDate.parse("1999-09-26"), Serviceplans.SILVER);
		Customer a2=new Customer ("Munna","Bhaii", "munna@gmail.com", "m123", 2000, LocalDate.parse("2000-01-30"), Serviceplans.GOLD);
		Customer a3=new Customer ("Pushpa","Raj", "pushparaj@gmail.com", "p123", 5000, LocalDate.parse("2004-10-24"), Serviceplans.DIAMOND);
		Customer a4=new Customer ("Akhandanand ","Tripathi", "akhandanand123@gmail.com", "a123", 10000, LocalDate.parse("2010-04-10"), Serviceplans.PLATINUM);
		Customer a5=new Customer ("Virat","Kohali", "virat234@gmail.com", "v123", 5000, LocalDate.parse("2006-09-26"), Serviceplans.GOLD);
		Customer a6=new Customer ("Ms","Dhoni", "ms123@gmail.com", "m123", 10000, LocalDate.parse("2020-12-01"), Serviceplans.PLATINUM);
		Customer[]cust= {a1,a2,a3,a4,a5,a6};
		Map<String,Customer>customer=new HashMap<>();
		for	(Customer c: cust)
			customer.put(c.getEmail(), c);
			
		
		return customer;
		
	}

}
