package snackBar;

public class Customer {

	/*
	maxId - keep track of last used customer id
	id - automatically generated field
	name
	cash on hand
	*/

	private static int maxId = 0;
	private int id;
	private String name;
	private double cash;

	/*
	get id
	set and get name
	add cash to cash on hand
	get cash on hand
	buy snacks. Given the total cost of the snacks to be purchased, reduce the cash on hand by that amount
	*/

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCash() {
		return cash;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}