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
		Customer 1 (Jane) buys 3 of snack 4 (Soda).
  		Print Customer 1 (Jane) Cash on hand.
  		Print quantity of snack 4 (Soda).
		*/

  		System.out.println();
		jane.buySnacks(soda.getTotal(3));
		soda.buySnacks(3);
		System.out.println(jane.getName() + " cash on hand $" + jane.getCash());
		System.out.println("Quantity of " + soda.getName() + " " + soda.getQuantity());

		/*
		Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
		Print Customer 1 (Jane) Cash on hand.
		Print quantity of snack 3 (Pretzel).
		*/

		System.out.println();
		jane.buySnacks(pretzel.getTotal(1));
		pretzel.buySnacks(1);
		System.out.println(jane.getName() + " cash on hand $" + jane.getCash());
		System.out.println("Quantity of " + pretzel.getName() + " " + pretzel.getQuantity());

		/*
		Customer 2 (Bob) buys 2 of snack 4 (Soda).
		Print Customer 2 (Bob) Cash on Hand.
		Print quantity of snack 4 (Soda).
		*/

		System.out.println();
		bob.buySnacks(soda.getTotal(2));
		soda.buySnacks(2);
		System.out.println(bob.getName() + " cash on hand $" + bob.getCash());
		System.out.println("Quantity of " + soda.getName() + " " + soda.getQuantity());

		/*
		Customer 1 (Jane) finds $10.
		Print Customer 1 (Jane) Cash on Hand.
		*/

		System.out.println();
		jane.addCash(10);
		System.out.println(jane.getName() + " cash on hand $" + jane.getCash());

		/*
		Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
		Print Customer 1 (Jane) Cash on Hand.
		Print quantity of snack 2 (Chocolate Bar).
		*/

		System.out.println();
		jane.buySnacks(chocolate.getTotal(1));
		chocolate.buySnacks(1);
		System.out.println(jane.getName() + " cash on hand $" + jane.getCash());
		System.out.println("Quantity of " + chocolate.getName() + " " + chocolate.getQuantity());

		/*
		Add 12 more items to snack 3 (Pretzel).
		Print quantity of snack 3 (Pretzel).
		*/

		System.out.println();
		pretzel.addItems(12);
		System.out.println("Quantity of " + pretzel.getName() + " " + pretzel.getQuantity());

		/*
		Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
		Print Customer 2 (Bob) Cash on hand.
		Print quantity of snack 3 (Pretzel).
		*/

		System.out.println();
		bob.buySnacks(pretzel.getTotal(3));
		pretzel.buySnacks(3);
		System.out.println(bob.getName() + " cash on hand $" + bob.getCash());
		System.out.println("Quantity of " + pretzel.getName() + " " + pretzel.getQuantity());
	}

	public static void main(String[] args){
		workWithData();
	}
}