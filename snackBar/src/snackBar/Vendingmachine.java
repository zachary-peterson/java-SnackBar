package snackBar;

public class Vendingmachine {

	/*
	maxId - keep track of last used vending machine id
	id - automatically generated field
	name
	*/

	private static int maxId = 0;
	private int id;
	private String name;

	/*
	get id
	set and get name
	*/

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}