package com.app.custom_ordering;

import java.util.Comparator;

import com.Customer.Customer;

public class CustomerDobAndNameComparator implements Comparator<Customer>{
	@Override
	public int compare(Customer c1,Customer c2) {
		int retval = c1.getDob().compareTo(c2.getDob());
		if (retval == 0)
			c1.getLast_name().compareTo(c2.getLast_name());
		
		return retval;
	}
}
