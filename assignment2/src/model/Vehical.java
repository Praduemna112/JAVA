package model;

import java.util.Date;

public class Vehical {

	private String chasiNo;
	private String uniqueId;
	private int price;
	private Date manufacturingDate;
	private Date insuranceExpDate;
	private double pollutionLevel;
	private String color;

	public String getChasiNo() {
		return chasiNo;
	}

	public void setChasiNo(String chasiNo) {
		this.chasiNo = chasiNo;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public Date getInsuranceExpDate() {
		return insuranceExpDate;
	}

	public void setInsuranceExpDate(Date insuranceExpDate) {
		this.insuranceExpDate = insuranceExpDate;
	}

	public double getPollutionLevel() {
		return pollutionLevel;
	}

	public void setPollutionLevel(double pollutionLevel) {
		this.pollutionLevel = pollutionLevel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Vehical(String chasiNo, String uniqueId, int price, Date manufacturingDate, Date insuranceExpDate,
			double pollutionLevel, String color) {
		super();
		this.chasiNo = chasiNo;
		this.uniqueId = uniqueId;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
		this.insuranceExpDate = insuranceExpDate;
		this.pollutionLevel = pollutionLevel;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehical [chasiNo=" + chasiNo + ", uniqueId=" + uniqueId + ", price=" + price + ", manufacturingDate="
				+ manufacturingDate + ", insuranceExpDate=" + insuranceExpDate + ", pollutionLevel=" + pollutionLevel
				+ ", color=" + color + "]";
	}

}
