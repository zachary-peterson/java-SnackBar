package snackBar;

public class Main {
	private static void workWithData() {
		System.out.println("Snack Bar is up and running...");

		/*
		Customers: 
		Jane with $45.25
		Bob with $33.14
		*/
								//int id, String name, double cash
		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		/*
		Vending Machines:
		Food
		Drink
		Office
		*/

		Vedingmachine food = new Vedingmachine("Food");
		Vedingmachine drink = new Vedingmachine("Drink");
		Vedingmachine office = new Vedingmachine("Office");

		/*
		Snacks in Food:
		36 Chips at $1.75
		36 Chocolate Bar at $1.00
		30 Pretzel at $2.00
		*/
						//int id, String name, int quantity, double cost, int vendingMachId
		Snack chips = new Snack("Chips", 36, 1.75, food.getId());
		Snack chocolate = new Snack("Chocolate Bar", 36, 1.00, food.getId());
		Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

		/*
		Snacks in Drink:
		24 Soda at $2.50
		20 Water at $2.75
		*/

		Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
		Snack water = new Snack("Water", 20, 2.75, drink.getId());
	}

	public static void main(String[] args){
		workWithData();
	}
}