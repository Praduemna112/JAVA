package com.Customer;

import java.time.LocalDate;

public class Customer implements Comparable<Customer>{
	private int customer_id;
	private String first_name;
	private String last_name;
	private String email;
	private String passward;
	private double registrationAmount;
	private LocalDate dob;
	private Serviceplans plan;	
	private static  int counter;
	
	static {
		counter=0;
	}
	
	
	//parameterized constructor
	public Customer( String first_name, String last_name, String email, String passward,
			double registrationAmount, LocalDate dob, Serviceplans plan) {
		super();
		counter++;
		this.customer_id = customer_id+counter;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.passward = passward;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
		
	}
	
//add overloaded ctor to wrap PK(email)
	public Customer(String email) {
		super();
		this.email = email;
	}


	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

	public double getRegistrationAmount() {
		return registrationAmount;
	}

	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Serviceplans getPlan() {
		return plan;
	}

	public void setPlan(Serviceplans plan) {
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", passward=" + passward + ", registrationAmount=" + registrationAmount
				+ ", dob=" + dob + ", plan=" + plan + "]";
	}
	
	@Override
	//equal method
	public boolean equals(Object o)
	{
		System.out.println("in customer equals");
		if (o instanceof Customer)
		{
		Customer c=(Customer)o;
		return (this.email.equals(c.email));
		}
		return false;
		
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		
		return this.email.compareTo(o.email);
	}			
}
