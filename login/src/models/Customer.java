package models;

import java.util.Date;

public class Customer {

	int id;
	String firstname;
	String lastmname;
	String email;
	String password;
	double registrationAmount;
	Date dob;
	ServicePlans splns;

	public Customer(int id, String firstname, String lastmname, String email, String password,
			double registrationAmount, Date dob, ServicePlans splns) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastmname = lastmname;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.splns = splns;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastmname() {
		return lastmname;
	}

	public void setLastmname(String lastmname) {
		this.lastmname = lastmname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRegistrationAmount() {
		return registrationAmount;
	}

	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public ServicePlans getSplns() {
		return splns;
	}

	public void setSplns(ServicePlans splns) {
		this.splns = splns;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastmname=" + lastmname + ", email=" + email
				+ ", password=" + password + ", registrationAmount=" + registrationAmount + ", dob=" + dob + ", splns="
				+ splns + "]";
	}

}
