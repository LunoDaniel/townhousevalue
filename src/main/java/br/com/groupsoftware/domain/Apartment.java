package br.com.groupsoftware.domain;

public class Apartment {

	private Owner owner;
	private Cost cost;
	private Revenue revenue;

	private String reference;

	public Cost getCost() {
		return cost;
	}

	public void setCost(Cost cost) {
		this.cost = cost;
	}

	public Revenue getRevenue() {
		return revenue;
	}

	public void setRevenue(Revenue revenue) {
		this.revenue = revenue;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

}
