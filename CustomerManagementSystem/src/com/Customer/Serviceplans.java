package com.Customer;

public enum Serviceplans {
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);

	private double plancost;
	
	Serviceplans(double plan)
	{
		this.plancost=plan;
	}

	public double getPlancost() {
		return plancost;
	}

	public void setPlan(double plan) {
		this.plancost = plan;
	}
	



}
