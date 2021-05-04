package Entities;

import Abstract.Entity;

public class Campaign implements Entity {
	private int id;
	private String name;
	private double discountRate;
	
	public Campaign(int id, String name, double discountRate) {
		setId(id);
		setName(name);
		setDiscountRate(discountRate);
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscountRate() {
		return this.discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
}

