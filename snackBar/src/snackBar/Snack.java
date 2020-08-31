package snackBar;

public class Snack {
	/*
	maxId - keep track of last used snack id
	id - automatically generated field
	name
	quantity
	cost
	vending machine id
	*/

	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachId;

	/*
	get id
	set and get name
	set and get cost
	set and get vending machine id
	get quantity
	add quantity when given how many to add
	buy snack when given how many to buy
	get total cost given a quantity
	*/

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getVendingMachId() {
		return vendingMachId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int addItem() {
		return 0 + quantity;
	}

}