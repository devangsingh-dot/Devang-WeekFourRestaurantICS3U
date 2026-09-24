import java.util.*;

/*******************************
 * Name: Your name Class: ICS3U Date: Friday Sept. 25 Project Name: Restaurant
 * 
 * You will have your first real project this week. You must meet all of the
 * following criteria: Create a restaurant of your choosing Print menu items one
 * at a time, including the price. Ask how many of each item they would like to
 * purchase Must have at least 5 different menu items Calculate the total price
 * If the total is more than $30, take off 10%. If the total is more than $50,
 * take off 20%. Add 13% HST to the total Print out the initial price, any
 * discounts, taxes, and the grand total. Read in a payment amount from the user
 * Calculate the change If the change is negative, state that they still owe you
 * money. This is to be done individually. DO NOT use AI! Feel free to use
 * previous notes, videos, and online resources like w3schools.com Fork the
 * repository, add me (MrZebarth) as a collaborator, clone the repository to
 * your computer, program your solution, and then commit and push the results.
 ********************************/
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int friesPr = 4;
		int burgersPr = 7;
		int hotdogPr = 7;
		int saladPr = 4;
		int sandwichPr = 5;

		System.out.println("how many fries");
		int friesQu = in.nextInt();

		System.out.println("how many burgers");
		int burgersQu = in.nextInt();

		System.out.println("how many hotdogs");
		int hotdogQu = in.nextInt();

		System.out.println("how many salads");
		int saladQu = in.nextInt();

		System.out.println("how many sandwiches");
		int sandwichQu = in.nextInt();
		double Price = friesPr * friesQu + burgersPr * burgersQu + hotdogPr * hotdogQu + saladPr * saladQu
				+ sandwichPr * sandwichQu;

		double discount = 0;
		if (Price > 50) {
			discount = Price * 0.20;
		} else if (Price > 30) {
			discount = Price * 0.10;
		}

		double discountedPrice = Price - discount;

		double tax = discountedPrice * 0.13;

		double totalPrice = discountedPrice - tax;
		System.out.println("total price is $" + totalPrice);
		double pay = in.nextDouble();
		double change = pay - totalPrice;
		System.out.println("change is $" + change);
	}

}
