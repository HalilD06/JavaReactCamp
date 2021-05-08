package Entities;

import Abstract.Entity;

public class Campaign implements Entity{
	private int id;
	private String campaignName;
	private int discountRate;
	private double unitPrice;
	
	
	public Campaign(int id, String campaignName, int discountRate, double unitPrice) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountRate = discountRate;
		this.unitPrice = unitPrice;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}


	public int getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public double getUnitPriceAfterDiscountRate() {
		return this.unitPrice - (this.unitPrice*this.discountRate/100);
		
	}
	
	
	
}
