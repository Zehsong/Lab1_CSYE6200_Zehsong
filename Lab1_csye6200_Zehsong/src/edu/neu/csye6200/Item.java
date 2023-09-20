package edu.neu.csye6200;

public class Item{
	final static double data = 20.0;
	public double price;
	public String itemID;
	public int itemI;
	
	public Item(String itemID, double price, int itemI) {
		this.itemID = itemID;
		this.price = price;
		this.itemI = itemI;
	}
	
	public String toString() {
		return "ItemID: " + itemI + " Item: " + itemID + " Price: " + price + "$";
	}
	
	public static void demo() {
		Item apple = new Item("Apple", 0.5, 1);
		Item pineApple = new Item("Pineapple", 1.5, 2);
		Item fish = new Item("Fish", 3, 3); 
		Item pork = new Item("Pork", 2.5, 4);
		Item veggies = new Item("Veggies", 2.5, 5);
		Item beverage = new Item("Beverage", 2.5, 6);
		
		double total = apple.price + pineApple.price + fish.price + pork.price + veggies.price + beverage.price;
		double remain = Item.data;
		remain = remain - total;
		System.out.println(apple.toString());
		System.out.println(pineApple.toString());
		System.out.println(fish.toString());
		System.out.println(pork.toString());
		System.out.println(veggies.toString());
		System.out.println(beverage.toString());
		
		System.out.println("Price: " + total + "$, change: " + remain + "$");
		System.out.println("Date: 9/19/2023");
	}
}
