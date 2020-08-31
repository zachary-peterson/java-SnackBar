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

	public Customer(int id, String name, double cash) {
		maxId++;
		id = maxId;

		this.name = name;
		this.cash = cash;
	}

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

	public void addCash(double newCash) {
		this.cash = this.cash + newCash;
	}

	public void buySnacks(double cost, int cart) {
		this.cash = this.cash - (cost * cart);
	}

}