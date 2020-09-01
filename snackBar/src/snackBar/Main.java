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

		Vendingmachine food = new Vendingmachine("Food");
		Vendingmachine drink = new Vendingmachine("Drink");
		Vendingmachine office = new Vendingmachine("Office");

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

		/*
		* [ ] Customer 1 (Jane) buys 3 of snack 4 (Soda).
  		* [ ] Print Customer 1 (Jane) Cash on hand.
  		* [ ] Print quantity of snack 4 (Soda).
		*/

		jane.buySnacks(soda.getTotal(3));
		soda.buySnacks(3);
		System.out.println(jane.getName() + " cash on hand $" + jane.getCash());
	}

	public static void main(String[] args){
		workWithData();
	}
}