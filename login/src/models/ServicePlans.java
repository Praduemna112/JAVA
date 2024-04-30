package models;

public enum ServicePlans {

	SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);

	private int amount = 0;

	private ServicePlans(int amount) {
		this.amount = amount;
	}

	public int getSize() {
		return amount;
	}

}
